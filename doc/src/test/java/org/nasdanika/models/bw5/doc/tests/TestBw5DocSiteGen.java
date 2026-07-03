package org.nasdanika.models.bw5.doc.tests;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.Test;
import org.nasdanika.capability.CapabilityLoader;
import org.nasdanika.capability.ServiceCapabilityFactory;
import org.nasdanika.capability.ServiceCapabilityFactory.Requirement;
import org.nasdanika.capability.emf.ResourceSetRequirement;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.html.bootstrap.Theme;
import org.nasdanika.models.app.gen.AppSiteGenerator;
import org.nasdanika.models.bw5.Project;
import org.nasdanika.models.bw5.loader.Bw5ProjectLoader;
import org.nasdanika.models.ecore.graph.processors.EcoreHtmlAppGenerator;

public class TestBw5DocSiteGen {
		
	@Test
	public void testGenerateBw5ProjectDocSite() throws Exception {
		CapabilityLoader capabilityLoader = new CapabilityLoader();
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		Requirement<ResourceSetRequirement, ResourceSet> requirement = ServiceCapabilityFactory.createRequirement(ResourceSet.class);		
		ResourceSet resourceSet = capabilityLoader.loadOne(requirement, progressMonitor);
		
		Bw5ProjectLoader loader = new Bw5ProjectLoader(resourceSet);		
		Project project = loader.loadProject(new File("../model/src/test/resources/sample-project"));
		
		project.getResources().forEach(r -> {
			System.out.println(r.getProjectPath() + " : " + r.eClass().getName());
		});		
		
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);		
		EcoreHtmlAppGenerator htmlAppGenerator = EcoreHtmlAppGenerator.loadEcoreHtmlAppGenerator(
				Collections.singleton(project), 
				context,
				null, // java.util.function.BiFunction<URI, ProgressMonitor, Action> prototypeProvider,			
				null, // Predicate<Object> factoryPredicate,
				null, // Predicate<EPackage> ePackagePredicate,
				diagnosticConsumer,
				progressMonitor);
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
		File output = new File(actionModelsDir, "actions.xmi");
		htmlAppGenerator.generateHtmlAppModel(
				diagnosticConsumer, 
				output,
				progressMonitor);
				
		// Generating a web site
		String rootActionResource = "actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		
		AppSiteGenerator actionSiteGenerator = new AppSiteGenerator() {
			
			@Override
			protected Context createContext(ProgressMonitor progressMonitor) {
				return context;
			}
			
		};		
		
		URI pageTeplateURI = URI.createFileURI(new File("page-template.yml").getAbsolutePath());//.appendFragment("/");		
		
		String siteMapDomain = "https://something.org";		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(
				rootActionURI, 
				pageTeplateURI, 
				siteMapDomain, 
				new File("target/sample-project-docs"),  
				new File("target/sample-project-doc-site-work-dir"), 
				true);
				
		int errorCount = 0;
		for (Entry<String, Collection<String>> ee: errors.entrySet()) {
			System.err.println(ee.getKey());
			for (String error: ee.getValue()) {
				System.err.println("\t" + error);
				++errorCount;
			}
		}
		
		System.out.println("There are " + errorCount + " site errors");
		
	}
	
}
