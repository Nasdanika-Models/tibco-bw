package org.nasdanika.models.bw5.graph;

import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.models.bw5.Node;
import org.nasdanika.models.bw5.ProcessDefinition;

public class ProcessDefinitionNode extends ContainerNode<ProcessDefinition> {

	public ProcessDefinitionNode(ProcessDefinition processDefinition, Function<EObject, Element> resolver) {
		super(processDefinition, resolver);
	}
	
	@Override
	public Collection<? extends Connection> getIncomingConnections() {
		return get()
				.getIncomingCalls()
				.stream()
				.map(c -> (Connection) resolver.apply(c))
				.toList();
	}
	
	@Override
	public Collection<? extends Element> getChildren() {
		Stream<? extends Element> cStream = super.getChildren().stream();
		Node start = get().getStart();
		if (start != null) {
			cStream = Stream.concat(cStream, Stream.of(resolver.apply(start)));
		}
		Node end = get().getEnd();
		if (end != null) {
			cStream = Stream.concat(cStream, Stream.of(resolver.apply(end)));
		}
		
		return cStream.toList();
	}

}
