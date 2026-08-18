package org.nasdanika.models.bw5.graph;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.Node;
import org.nasdanika.models.bw5.Container;

public class ContainerNode<T extends Container> implements Node, Supplier<T> {
	
	protected T container;
	protected Function<EObject, Element> resolver;

	public ContainerNode(T container, Function<EObject, Element> resolver) {
		this.container = container;
		this.resolver = resolver;	
	}
	
	@Override
	public Collection<? extends Element> getChildren() {
		T container = get();
		Stream<Element> activitiesAndTransitions =  Stream.concat(
				container.getActivities().stream().map(resolver),
				container.getTransitions().stream().map(resolver));
		
		return Stream.concat(
				activitiesAndTransitions,
				container.getGroups().stream().map(resolver))	
		.toList();
	}

	@Override
	public T get() {
		return container;
	}

	@Override
	public Collection<? extends Connection> getIncomingConnections() {
		return Collections.emptyList();
	}

	@Override
	public Collection<? extends Connection> getOutgoingConnections() {
		return Collections.emptyList();
	}

}
