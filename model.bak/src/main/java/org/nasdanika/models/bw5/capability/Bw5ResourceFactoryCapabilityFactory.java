package org.nasdanika.models.bw5.capability;

import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.capability.emf.ResourceFactoryCapabilityFactory;
import org.nasdanika.common.ProgressMonitor;

public class Bw5ResourceFactoryCapabilityFactory extends ResourceFactoryCapabilityFactory {

	@Override
	protected Factory getResourceFactory(
			ResourceSet resourceSet, 
			Loader loader,
			ProgressMonitor progressMonitor) {
		return new Bw5ResourceFactory();
	}
	
	@Override
	protected String getExtension() {
		return "process";
	}

}
