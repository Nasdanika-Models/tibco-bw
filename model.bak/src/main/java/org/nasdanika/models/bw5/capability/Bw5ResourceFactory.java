package org.nasdanika.models.bw5.capability;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class Bw5ResourceFactory extends ResourceFactoryImpl {
		
	@Override
	public Resource createResource(URI uri) {
		return new Bw5Resource(uri);
	}
	
}
