package org.nasdanika.models.bw5.graph;

import java.util.function.Function;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.Node;
import org.nasdanika.models.bw5.Call;

public class CallConnection implements Connection, Supplier<Call> {
	
	private Call call;
	private Function<EObject, Element> resolver;

	public CallConnection(Call call, Function<EObject, Element> resolver) {
		this.call = call;
		this.resolver = resolver;
	}
	
	@Override
	public Call get() {
		return call;
	}

	@Override
	public Node getSource() {
		return (Node) resolver.apply(get().getCaller());
	}

	@Override
	public Node getTarget() {
		return (Node) resolver.apply(get().getTarget());
	}

}
