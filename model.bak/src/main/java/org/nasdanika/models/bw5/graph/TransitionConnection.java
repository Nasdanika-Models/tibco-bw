package org.nasdanika.models.bw5.graph;

import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.Node;
import org.nasdanika.models.bw5.Transition;

public class TransitionConnection implements Connection, Supplier<Transition> {
		
	private Transition transition;
	private Function<EObject, Element> resolver;

	public TransitionConnection(Transition transition, Function<EObject, Element> resolver) {
		this.transition = transition;
		this.resolver = resolver;
	}

	@Override
	public Transition get() {
		return transition;
	}

	@Override
	public Node getSource() {
		return (Node) resolver.apply(get().getSource());
	}

	@Override
	public Node getTarget() {
		return (Node) resolver.apply(get().getTarget());
	}

}
