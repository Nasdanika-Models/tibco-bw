package org.nasdanika.models.bw5.graph;

import java.util.Collection;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.models.bw5.Group;

public class GroupNode extends ContainerNode<Group> {

	public GroupNode(Group group, Function<EObject, Element> resolver) {
		super(group, resolver);
	}
	
	@Override
	public Collection<? extends Connection> getIncomingConnections() {
		return get()
				.getIncomingTransitions()
				.stream()
				.map(t -> (Connection) resolver.apply(t))
				.toList();
	}
	
	@Override
	public Collection<? extends Connection> getOutgoingConnections() {
		return get()
				.getOutgoingTransitions()
				.stream()
				.map(t -> (Connection) resolver.apply(t))
				.toList();
	}

}
