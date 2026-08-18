package org.nasdanika.models.bw5.loader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.eclipse.emf.common.util.EMap;
import org.nasdanika.models.bw5.Activity;
import org.nasdanika.models.bw5.Bw5Factory;
import org.nasdanika.models.bw5.Container;
import org.nasdanika.models.bw5.Group;
import org.nasdanika.models.bw5.Label;
import org.nasdanika.models.bw5.NamedElement;
import org.nasdanika.models.bw5.NamespaceAware;
import org.nasdanika.models.bw5.Node;
import org.nasdanika.models.bw5.ProcessDefinition;
import org.nasdanika.models.bw5.ProcessVariable;
import org.nasdanika.models.bw5.Starter;
import org.nasdanika.models.bw5.Transition;


/**
 * StAX-based loader that reads BW 5.x {@code .process} files and
 * produces an EMF {@link ProcessDefinition} model instance.
 *
 * <p>Usage:
 * <pre>{@code
 * BwProcessLoader loader = new BwProcessLoader();
 * try (InputStream in = Files.newInputStream(path)) {
 *     ProcessDefinition pd = loader.load(in);
 * }
 * }</pre>
 */
public class Bw5ProcessLoader {

	/**
	 * BW 5.x process definition namespace.
	 */
	public static final String PD_NAMESPACE = "http://xmlns.tibco.com/bw/process/2003";

	private final Bw5Factory factory;

	/**
	 * Creates a loader using the default {@link BwFactory#eINSTANCE} singleton.
	 */
	public Bw5ProcessLoader() {
		this(Bw5Factory.eINSTANCE);
	}

	/**
	 * Creates a loader with a custom factory.
	 *
	 * @param factory the EMF factory used to instantiate model objects
	 */
	public Bw5ProcessLoader(Bw5Factory factory) {
		this.factory = factory;
	}

	/**
	 * Loads a BW 5.x {@code .process} file from the given input stream.
	 *
	 * @param inputStream the XML input stream (not closed by this method)
	 * @return the parsed {@link ProcessDefinition}, or {@code null} if the
	 *         stream does not contain a {@code pd:ProcessDefinition} root element
	 * @throws XMLStreamException if the XML is malformed
	 * @throws IOException        if an I/O error occurs while reading
	 */
	public ProcessDefinition load(InputStream inputStream, String systemId) throws XMLStreamException, IOException {
		XMLInputFactory xmlFactory = XMLInputFactory.newInstance();
		// Harden against XXE attacks
		xmlFactory.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, Boolean.FALSE);
		xmlFactory.setProperty(XMLInputFactory.SUPPORT_DTD, Boolean.FALSE);

		XMLStreamReader reader = xmlFactory.createXMLStreamReader(systemId, inputStream);
		return load(reader);
	}
	
	private void loadNamespaces(XMLStreamReader reader, EMap<String, String> namespaces) {
		int nsCount = reader.getNamespaceCount();
	    for (int i = 0; i < nsCount; i++) {
	        String prefix = reader.getNamespacePrefix(i);
	        String uri = reader.getNamespaceURI(i);
	        namespaces.put(prefix == null ? "" : prefix, uri);
	    }
	}
	
	private void loadNamespaces(XMLStreamReader reader, NamespaceAware namespaceAware) {
		loadNamespaces(reader, namespaceAware.getNamespaces());
	}

	public ProcessDefinition load(XMLStreamReader reader) throws XMLStreamException {
		try {
			while (reader.hasNext()) {
				int event = reader.next();
				if (event == XMLStreamConstants.START_ELEMENT
						&& "ProcessDefinition".equals(reader.getLocalName())
						&& PD_NAMESPACE.equals(reader.getNamespaceURI())) {					
					ProcessDefinition processDefinition = parseProcessDefinition(reader);
					resolve(processDefinition);
					return processDefinition;
				}
			}
			return null;
		} finally {
			reader.close();
		}
	}

	private void resolve(Container container) {
		container.getTransitions().forEach(t -> {
			if (t.getFrom() != null && t.getTo() != null) {
				t.setSource(Objects.requireNonNull(findNodeByName(container, t.getFrom())));
				t.setTarget(Objects.requireNonNull(findNodeByName(container, t.getTo())));
			}
		});
		container.getGroups().forEach(this::resolve);
	}
	
	final Node findNodeByName(Container container, String name) {
		for (Activity activity : container.getActivities()) {
			if (name.equals(activity.getName())) {
				return activity;
			}
		}
		for (Group group : container.getGroups()) {
			if (name.equals(group.getName())) {
				return group;
			}
		}
		
		Node start = container.getStart();
		if (start != null && name.equals(start.getName())) {
			return start;
		}
		Node end = container.getEnd();
		if (end != null && name.equals(end.getName())) {
			return end;
		}						
		
		if (container instanceof Group group) {
			// start and end special cases
			if ("start".equals(name)) {
				if (start == null) {
					start = factory.createNode();
					start.setName(name);
					group.setStart(start);
				}
				return start;
			}
			if ("end".equals(name)) {
				if (end == null) {
					end = factory.createNode();
					end.setName(name);
					group.setEnd(end);
				}
				return end;
			}			
		}
		
		throw new IllegalArgumentException("No node named '" + name + "' found in container '" + container.getName() + "'");
	}

	// -------------------------------------------------------------------------
	// ProcessDefinition
	// -------------------------------------------------------------------------

	/**
	 * Parses a {@code pd:ProcessDefinition} element.
	 * The reader is positioned on the opening {@code ProcessDefinition} tag.
	 */
	private ProcessDefinition parseProcessDefinition(XMLStreamReader reader) throws XMLStreamException {
		ProcessDefinition pd = factory.createProcessDefinition();
		loadNamespaces(reader, pd);

		while (reader.hasNext()) {
			int event = reader.next();
			switch (event) {
				case XMLStreamConstants.START_ELEMENT:
					handleProcessDefinitionChild(reader, pd);
					break;
				case XMLStreamConstants.END_ELEMENT:
					if ("ProcessDefinition".equals(reader.getLocalName())
							&& PD_NAMESPACE.equals(reader.getNamespaceURI())) {
						return pd;
					}
					break;
				default:
					break;
			}
		}
		return pd;
	}
	
	/**
	 * Dispatches a child element of {@code pd:ProcessDefinition} to the
	 * appropriate handler.
	 */
	private void handleNamedElementChild(XMLStreamReader reader, NamedElement namedElement) throws XMLStreamException {

		String ns = reader.getNamespaceURI();
		String localName = reader.getLocalName();

		if (PD_NAMESPACE.equals(ns)) {
			switch (localName) {
				case "name":
					namedElement.setName(reader.getElementText());
					break;
				case "description":
					namedElement.setDescription(reader.getElementText());
					break;
				default:
					skipElement(reader);
					break;
			}
		} else {
			// Non-pd namespace children are skipped
			skipElement(reader);
		}
	}
	
	/**
	 * Dispatches a child element of {@code pd:ProcessDefinition} to the
	 * appropriate handler.
	 */
	private void handleContainerChild(XMLStreamReader reader, Container container)
			throws XMLStreamException {

		String ns = reader.getNamespaceURI();
		String localName = reader.getLocalName();

		if (PD_NAMESPACE.equals(ns)) {
			switch (localName) {
				case "activity":
					container.getActivities().add(parseActivity(reader));
					break;
				case "group":
					container.getGroups().add(parseGroup(reader));
					break;
				case "transition":
					container.getTransitions().add(parseTransition(reader));
					break;
				case "returnBindings":
					loadNamespaces(reader, container.getReturnBindingsNamespaces());
					container.setReturnBindings(captureXmlContent(reader));
					break;
				default:
					handleNamedElementChild(reader, container);
					break;
			}
		} else {
			// Non-pd namespace children are skipped
			skipElement(reader);
		}
	}
		
	private Node getStart(ProcessDefinition pd) {
		if (pd.getStart() == null) {
			pd.setStart(factory.createNode());
		}
		return pd.getStart();
	}
	
	private Node getEnd(ProcessDefinition pd) {
		if (pd.getEnd() == null) {
			pd.setEnd(factory.createNode());
		}
		return pd.getEnd();
	}

	/**
	 * Dispatches a child element of {@code pd:ProcessDefinition} to the
	 * appropriate handler.
	 */
	private void handleProcessDefinitionChild(XMLStreamReader reader, ProcessDefinition pd)	throws XMLStreamException {

		String ns = reader.getNamespaceURI();
		String localName = reader.getLocalName();

		if (PD_NAMESPACE.equals(ns)) {
			switch (localName) {
				case "startName":
					getStart(pd).setName(reader.getElementText());
					break;
				case "startType":
					pd.setStartType(captureXmlContent(reader));
					break;
				case "startX":
					getStart(pd).setX(parseIntText(reader));
					break;
				case "startY":
					getStart(pd).setY(parseIntText(reader));
					break;
				case "endName":
					getEnd(pd).setName(reader.getElementText());
					break;
				case "endType":
					pd.setEndType(captureXmlContent(reader));
					break;
				case "endX":
					getEnd(pd).setX(parseIntText(reader));
					break;
				case "endY":
					getEnd(pd).setY(parseIntText(reader));
					break;
				case "targetNamespace":
					pd.setTargetNamespace(reader.getElementText());
					break;
				case "errorSchemas":
					pd.setErrorSchemas(captureXmlContent(reader));
					break;
				case "starter":
					pd.setStarter(parseStarter(reader));
					break;
				case "label":
					pd.getLabels().add(parseLabel(reader));
					break;
				case "processVariables":
					parseProcessVariables(reader, pd);
					break;
				default:
					handleContainerChild(reader, pd);
					break;
			}
		} else {
			// Non-pd namespace children are skipped
			skipElement(reader);
		}
	}
	
	
	// -------------------------------------------------------------------------
	// Activity / Starter
	// -------------------------------------------------------------------------

	/**
	 * Parses a {@code pd:activity} element into an {@link Activity}.
	 * The reader is positioned on the opening {@code activity} tag.
	 */
	private Activity parseActivity(XMLStreamReader reader) throws XMLStreamException {
		Activity activity = factory.createActivity();
		activity.setName(reader.getAttributeValue(null, "name"));
		populateActivity(reader, activity, "activity");
		return activity;
	}

	/**
	 * Parses a {@code pd:starter} element into a {@link Starter}.
	 * The reader is positioned on the opening {@code starter} tag.
	 */
	private Starter parseStarter(XMLStreamReader reader) throws XMLStreamException {
		Starter starter = factory.createStarter();
		starter.setName(reader.getAttributeValue(null, "name"));
		populateActivity(reader, starter, "starter");
		return starter;
	}

	/**
	 * Populates the common fields of an {@link Activity} (or {@link Starter})
	 * from child elements.
	 *
	 * @param reader       the stream reader positioned just after the opening tag
	 * @param activity     the model object to populate
	 * @param endLocalName the local name of the closing tag ({@code "activity"}
	 *                     or {@code "starter"})
	 */
	private void populateActivity(XMLStreamReader reader, Activity activity, String endLocalName)
			throws XMLStreamException {

		loadNamespaces(reader, activity);
		while (reader.hasNext()) {
			int event = reader.next();
			switch (event) {
				case XMLStreamConstants.START_ELEMENT:
					handleActivityChild(reader, activity);
					break;
				case XMLStreamConstants.END_ELEMENT:
					if (endLocalName.equals(reader.getLocalName())
							&& PD_NAMESPACE.equals(reader.getNamespaceURI())) {
						return;
					}
					break;
				default:
					break;
			}
		}
	}

	/**
	 * Dispatches a child element of an activity (or starter) to the
	 * appropriate setter.
	 */
	private void handleNodeChild(XMLStreamReader reader, Node node)	throws XMLStreamException {

		String ns = reader.getNamespaceURI();
		String localName = reader.getLocalName();

		if (PD_NAMESPACE.equals(ns)) {
			switch (localName) {
				case "x":
					node.setX(parseIntText(reader));
					break;
				case "y":
					node.setY(parseIntText(reader));
					break;
				default:
					handleNamedElementChild(reader, node);
					break;
			}
		} else {
			skipElement(reader);
		}
	}

	/**
	 * Dispatches a child element of an activity (or starter) to the
	 * appropriate setter.
	 */
	private void handleActivityChild(XMLStreamReader reader, Activity activity)	throws XMLStreamException {

		String ns = reader.getNamespaceURI();
		String localName = reader.getLocalName();

		if (PD_NAMESPACE.equals(ns)) {
			switch (localName) {
				case "type":
					activity.setType(reader.getElementText());
					break;
				case "resourceType":
					activity.setResourceType(reader.getElementText());
					break;
				case "inputBindings":
					loadNamespaces(reader, activity.getInputBindingsNamespaces());
					activity.setInputBindings(captureXmlContent(reader));
					break;
				default:
					handleNodeChild(reader, activity);
					break;
			}
		} else if ("config".equals(localName) && (ns == null || ns.isEmpty())) {
			activity.setConfig(captureXmlContent(reader));
		} else {
			skipElement(reader);
		}
	}

	// -------------------------------------------------------------------------
	// Group
	// -------------------------------------------------------------------------

	/**
	 * Parses a {@code pd:group} element into a {@link Group}.
	 * Groups may contain nested activities, sub-groups and transitions.
	 * The reader is positioned on the opening {@code group} tag.
	 */
	private Group parseGroup(XMLStreamReader reader) throws XMLStreamException {
		Group group = factory.createGroup();
		group.setName(reader.getAttributeValue(null, "name"));
		loadNamespaces(reader, group);

		while (reader.hasNext()) {
			int event = reader.next();
			switch (event) {
				case XMLStreamConstants.START_ELEMENT:
					handleGroupChild(reader, group);
					break;
				case XMLStreamConstants.END_ELEMENT:
					if ("group".equals(reader.getLocalName())
							&& PD_NAMESPACE.equals(reader.getNamespaceURI())) {
						return group;
					}
					break;
				default:
					break;
			}
		}
		return group;
	}

	/**
	 * Dispatches a child element of a group to the appropriate handler.
	 */
	private void handleGroupChild(XMLStreamReader reader, Group group) throws XMLStreamException {
		String ns = reader.getNamespaceURI();
		String localName = reader.getLocalName();

		if (PD_NAMESPACE.equals(ns)) {
			switch (localName) {
				case "width":
					group.setWidth(parseIntText(reader));
					break;
				case "height":
					group.setHeight(parseIntText(reader));
					break;
				case "collapsedWidth":
					group.setCollapsedWidth(parseIntText(reader));
					break;
				case "collapsedHeight":
					group.setCollapsedHeight(parseIntText(reader));
					break;
				case "group-expanded":
					group.setExpanded(Boolean.parseBoolean(reader.getElementText()));
					break;
				case "activity":
					group.getActivities().add(parseActivity(reader));
					break;
				case "group":
					group.getGroups().add(parseGroup(reader));
					break;
				case "transition":
					group.getTransitions().add(parseTransition(reader));
					break;
				case "returnBindings":
					loadNamespaces(reader, group.getReturnBindingsNamespaces());
					group.setReturnBindings(captureXmlContent(reader));
					break;
				default:
					handleActivityChild(reader, group);
					break;
			}
		} else if ("config".equals(localName) && (ns == null || ns.isEmpty())) {
			group.setConfig(captureXmlContent(reader));
		} else {
			skipElement(reader);
		}
	}

	// -------------------------------------------------------------------------
	// Transition
	// -------------------------------------------------------------------------

	/**
	 * Parses a {@code pd:transition} element into a {@link Transition}.
	 * The reader is positioned on the opening {@code transition} tag.
	 */
	private Transition parseTransition(XMLStreamReader reader) throws XMLStreamException {
		Transition transition = factory.createTransition();

		while (reader.hasNext()) {
			int event = reader.next();
			switch (event) {
				case XMLStreamConstants.START_ELEMENT:
					handleTransitionChild(reader, transition);
					break;
				case XMLStreamConstants.END_ELEMENT:
					if ("transition".equals(reader.getLocalName())
							&& PD_NAMESPACE.equals(reader.getNamespaceURI())) {
						return transition;
					}
					break;
				default:
					break;
			}
		}
		return transition;
	}

	/**
	 * Dispatches a child element of a transition to the appropriate setter.
	 */
	private void handleTransitionChild(XMLStreamReader reader, Transition transition)
			throws XMLStreamException {

		String ns = reader.getNamespaceURI();
		String localName = reader.getLocalName();

		if (PD_NAMESPACE.equals(ns)) {
			switch (localName) {
				case "from":
					transition.setFrom(reader.getElementText());
					break;
				case "to":
					transition.setTo(reader.getElementText());
					break;
				case "lineType":
					transition.setLineType(reader.getElementText());
					break;
				case "lineColor":
					transition.setLineColor(reader.getElementText());
					break;
				case "conditionType":
					transition.setConditionType(reader.getElementText());
					break;
				case "condition":
					transition.setCondition(reader.getElementText());
					break;
				default:
					skipElement(reader);
					break;
			}
		} else {
			skipElement(reader);
		}
	}

	// -------------------------------------------------------------------------
	// Label
	// -------------------------------------------------------------------------

	/**
	 * Parses a {@code pd:label} element into a {@link Label}.
	 * The reader is positioned on the opening {@code label} tag.
	 */
	private Label parseLabel(XMLStreamReader reader) throws XMLStreamException {
		Label label = factory.createLabel();

		while (reader.hasNext()) {
			int event = reader.next();
			switch (event) {
				case XMLStreamConstants.START_ELEMENT:
					handleLabelChild(reader, label);
					break;
				case XMLStreamConstants.END_ELEMENT:
					if ("label".equals(reader.getLocalName())
							&& PD_NAMESPACE.equals(reader.getNamespaceURI())) {
						return label;
					}
					break;
				default:
					break;
			}
		}
		return label;
	}

	/**
	 * Dispatches a child element of a label to the appropriate setter.
	 */
	private void handleLabelChild(XMLStreamReader reader, Label label) throws XMLStreamException {
		String ns = reader.getNamespaceURI();
		String localName = reader.getLocalName();

		if (PD_NAMESPACE.equals(ns)) {
			switch (localName) {
				case "width":
					label.setWidth(parseIntText(reader));
					break;
				case "height":
					label.setHeight(parseIntText(reader));
					break;
				case "fontColor":
					label.setFontColor(reader.getElementText());
					break;
				case "color":
					label.setColor(reader.getElementText());
					break;
				case "type":
					label.setType(reader.getElementText());
					break;
				case "thickness":
					label.setThickness(reader.getElementText());
					break;
				case "fade":
					label.setFade(reader.getElementText());
					break;
				default:
					handleNodeChild(reader, label);
					break;
			}
		} else {
			skipElement(reader);
		}
	}

	// -------------------------------------------------------------------------
	// ProcessVariables
	// -------------------------------------------------------------------------

	/**
	 * Parses the {@code pd:processVariables} section.
	 *
	 * <p>In BW 5.x the structure is:
	 * <pre>{@code
	 * <pd:processVariables>
	 *   <SlotName>
	 *     <xsd:element name="varName" type="xsd:string"/>
	 *   </SlotName>
	 * </pd:processVariables>
	 * }</pre>
	 *
	 * Each direct child element is treated as a variable slot.  If it contains
	 * an {@code xsd:element} child, the variable name and type are extracted
	 * from the {@code name} and {@code type} attributes respectively; otherwise
	 * the slot element name is used as the variable name.
	 */
	private void parseProcessVariables(XMLStreamReader reader, ProcessDefinition pd)
			throws XMLStreamException {

		while (reader.hasNext()) {
			int event = reader.next();
			switch (event) {
				case XMLStreamConstants.START_ELEMENT:
					pd.getProcessVariables().add(parseProcessVariableSlot(reader));
					break;
				case XMLStreamConstants.END_ELEMENT:
					if ("processVariables".equals(reader.getLocalName())
							&& PD_NAMESPACE.equals(reader.getNamespaceURI())) {
						return;
					}
					break;
				default:
					break;
			}
		}
	}

	/**
	 * Parses a single process-variable slot element.
	 */
	private ProcessVariable parseProcessVariableSlot(XMLStreamReader reader) throws XMLStreamException {
		ProcessVariable pv = factory.createProcessVariable();
		String slotName = reader.getLocalName();
		pv.setName(slotName);

		int depth = 1;
		while (reader.hasNext() && depth > 0) {
			int event = reader.next();
			switch (event) {
				case XMLStreamConstants.START_ELEMENT:
					depth++;
					if ("element".equals(reader.getLocalName())) {
						String varName = reader.getAttributeValue(null, "name");
						if (varName != null) {
							pv.setName(varName);
						}
						String varType = reader.getAttributeValue(null, "type");
						if (varType != null) {
							pv.setType(varType);
						}
					}
					break;
				case XMLStreamConstants.END_ELEMENT:
					depth--;
					break;
				default:
					break;
			}
		}
		return pv;
	}

	// -------------------------------------------------------------------------
	// Utility methods
	// -------------------------------------------------------------------------

	/**
	 * Reads the text content of the current element and parses it as an integer.
	 * Returns {@code 0} if the content is empty or not a valid integer.
	 */
	private int parseIntText(XMLStreamReader reader) throws XMLStreamException {
		String text = reader.getElementText();
		if (text == null || text.isBlank()) {
			return 0;
		}
		try {
			return Integer.parseInt(text.strip());
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	/**
	 * Captures the inner XML content of the current element as a string.
	 * The reader must be positioned on the opening tag; when this method
	 * returns, the reader is positioned on the corresponding closing tag.
	 *
	 * <p>This is used for elements whose content is stored verbatim in the
	 * model (e.g. {@code config}, {@code inputBindings}, {@code returnBindings},
	 * {@code errorSchemas}).
	 */
	private String captureXmlContent(XMLStreamReader reader) throws XMLStreamException {
		StringBuilder sb = new StringBuilder();
		int depth = 1;

		while (reader.hasNext() && depth > 0) {
			int event = reader.next();
			switch (event) {
				case XMLStreamConstants.START_ELEMENT:
					depth++;
					appendStartElement(reader, sb);
					break;
				case XMLStreamConstants.END_ELEMENT:
					depth--;
					if (depth > 0) {
						appendEndElement(reader, sb);
					}
					break;
				case XMLStreamConstants.CHARACTERS:
					sb.append(escapeXmlText(reader.getText()));
					break;
				case XMLStreamConstants.CDATA:
					sb.append("<![CDATA[").append(reader.getText()).append("]]>");
					break;
				case XMLStreamConstants.COMMENT:
					sb.append("<!--").append(reader.getText()).append("-->");
					break;
				default:
					break;
			}
		}
		return sb.toString().strip();
	}

	/**
	 * Appends a reconstructed XML start-element tag to the builder.
	 */
	private void appendStartElement(XMLStreamReader reader, StringBuilder sb) {
		sb.append('<');
		String prefix = reader.getPrefix();
		if (prefix != null && !prefix.isEmpty()) {
			sb.append(prefix).append(':');
		}
		sb.append(reader.getLocalName());

		// Namespace declarations
		for (int i = 0; i < reader.getNamespaceCount(); i++) {
			String nsPrefix = reader.getNamespacePrefix(i);
			sb.append(" xmlns");
			if (nsPrefix != null && !nsPrefix.isEmpty()) {
				sb.append(':').append(nsPrefix);
			}
			sb.append("=\"").append(escapeXmlAttribute(reader.getNamespaceURI(i))).append('"');
		}

		// Attributes
		for (int i = 0; i < reader.getAttributeCount(); i++) {
			sb.append(' ');
			String attrPrefix = reader.getAttributePrefix(i);
			if (attrPrefix != null && !attrPrefix.isEmpty()) {
				sb.append(attrPrefix).append(':');
			}
			sb.append(reader.getAttributeLocalName(i))
			  .append("=\"")
			  .append(escapeXmlAttribute(reader.getAttributeValue(i)))
			  .append('"');
		}
		sb.append('>');
	}

	/**
	 * Appends a reconstructed XML end-element tag to the builder.
	 */
	private void appendEndElement(XMLStreamReader reader, StringBuilder sb) {
		sb.append("</");
		String prefix = reader.getPrefix();
		if (prefix != null && !prefix.isEmpty()) {
			sb.append(prefix).append(':');
		}
		sb.append(reader.getLocalName()).append('>');
	}

	/**
	 * Escapes special XML characters in text content.
	 */
	private static String escapeXmlText(String text) {
		if (text == null) {
			return "";
		}
		return text.replace("&", "&amp;")
				   .replace("<", "&lt;")
				   .replace(">", "&gt;");
	}

	/**
	 * Escapes special XML characters in attribute values.
	 */
	private static String escapeXmlAttribute(String text) {
		if (text == null) {
			return "";
		}
		return text.replace("&", "&amp;")
				   .replace("<", "&lt;")
				   .replace(">", "&gt;")
				   .replace("\"", "&quot;")
				   .replace("'", "&apos;");
	}

	/**
	 * Skips the current element and all of its children.
	 * The reader must be positioned on a {@code START_ELEMENT}; when this
	 * method returns, the reader is positioned on the matching
	 * {@code END_ELEMENT}.
	 */
	private void skipElement(XMLStreamReader reader) throws XMLStreamException {
		int depth = 1;
		while (reader.hasNext() && depth > 0) {
			int event = reader.next();
			if (event == XMLStreamConstants.START_ELEMENT) {
				depth++;
			} else if (event == XMLStreamConstants.END_ELEMENT) {
				depth--;
			}
		}
	}
}
