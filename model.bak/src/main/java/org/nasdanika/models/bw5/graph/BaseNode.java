package org.nasdanika.models.bw5.graph;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.Node;

public class BaseNode<T extends org.nasdanika.models.bw5.Node> implements Node, Supplier<T> {
	
	protected T node;
	protected Function<EObject, Element> resolver;	
	
	public BaseNode(T node, Function<EObject, Element> resolver) {
		this.node = node;
		this.resolver = resolver;
	}
	
	@Override
	public T get() {
		return node;
	}
	
	@Override
	public Collection<? extends Element> getChildren() {
		return Collections.emptyList();
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
