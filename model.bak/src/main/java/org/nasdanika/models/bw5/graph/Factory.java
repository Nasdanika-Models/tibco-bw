package org.nasdanika.models.bw5.graph;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.graph.Element;
import org.nasdanika.models.bw5.Activity;
import org.nasdanika.models.bw5.Call;
import org.nasdanika.models.bw5.Group;
import org.nasdanika.models.bw5.Node;
import org.nasdanika.models.bw5.ProcessDefinition;
import org.nasdanika.models.bw5.Transition;

public class Factory implements Function<EObject, Element> {
	
	private Map<EObject, Element> registry;
	
	public Factory(Map<EObject, Element> registry) {
		this.registry = registry;
	}
	
	public Factory() {
		this(new ConcurrentHashMap<>());
	}
	
	public Map<EObject, Element> getRegistry() {
		return registry;
	}

	@Override
	public Element apply(EObject eObj) {
		return registry.computeIfAbsent(Objects.requireNonNull(eObj), this::create);
	}
		
	protected Element create(EObject eObj) {				
		return switch (eObj) {
			case ProcessDefinition processDefinition -> new ProcessDefinitionNode(processDefinition, this);
			case Group group -> new GroupNode(group, this);
			case Activity activity -> new ActivityNode(activity, this);
			case Node node -> new BaseNode<Node>(node, this);			
			case Transition transition -> new TransitionConnection(transition, this);
			case Call call -> new CallConnection(call, this);
			// TODO - Project element with children
			// TODO - Folder containers
			// TODO - Add missing elements
			default -> throw new IllegalArgumentException("Unexpected value: " + eObj);
		};
	}

}
