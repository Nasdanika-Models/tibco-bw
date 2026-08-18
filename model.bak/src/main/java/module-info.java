import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.bw5.capability.Bw5EPackageResourceSetCapabilityFactory;
import org.nasdanika.models.bw5.capability.Bw5ResourceFactoryCapabilityFactory;

module org.nasdanika.models.bw5 {
	
	exports org.nasdanika.models.bw5;
	exports org.nasdanika.models.bw5.impl;
	exports org.nasdanika.models.bw5.loader;
	exports org.nasdanika.models.bw5.util;
	exports org.nasdanika.models.bw5.graph;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.graph;
	requires transitive java.xml;
	
	provides CapabilityFactory with 
		Bw5EPackageResourceSetCapabilityFactory,
		Bw5ResourceFactoryCapabilityFactory;
	
}