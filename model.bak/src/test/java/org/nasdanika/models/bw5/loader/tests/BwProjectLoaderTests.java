package org.nasdanika.models.bw5.loader.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.bw5.Project;
import org.nasdanika.models.bw5.loader.Bw5ProjectLoader;

public class BwProjectLoaderTests {
	
	@Test
	public void testLoadProject() throws IOException {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		Bw5ProjectLoader loader = new Bw5ProjectLoader(resourceSet);		
		Project project = loader.loadProject(new File("src/test/resources/sample-project"));
		
		project.getResources().forEach(r -> {
			System.out.println(r.getProjectPath() + " : " + r.eClass().getName());
		});		
	}	

}
