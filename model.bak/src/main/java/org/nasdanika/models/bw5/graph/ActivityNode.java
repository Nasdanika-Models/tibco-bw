package org.nasdanika.models.bw5.graph;

import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.models.bw5.Activity;

public class ActivityNode extends BaseNode<Activity> {
	
	
	public ActivityNode(Activity activity, Function<EObject, Element> resolver) {
		super(activity, resolver);
	}
		
	@Override
	public Collection<? extends Connection> getOutgoingConnections() {
		Stream<? extends Connection> outgoingConnectionsStream = super.getOutgoingConnections().stream();
		
		Stream<Connection> outgoingCallConnections = get()
				.getOutgoingCalls()
				.stream()
				.map(t -> (Connection) resolver.apply(t));
		
		return Stream.concat(outgoingConnectionsStream, outgoingCallConnections).toList();
	}	

}
