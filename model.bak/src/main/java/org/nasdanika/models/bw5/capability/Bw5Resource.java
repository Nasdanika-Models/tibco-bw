package org.nasdanika.models.bw5.capability;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.xml.stream.XMLStreamException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.models.bw5.ProcessDefinition;
import org.nasdanika.models.bw5.loader.Bw5ProcessLoader;

public class Bw5Resource extends ResourceImpl {
	
	public Bw5Resource(URI uri) {
		super(uri);
	}
		
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		Bw5ProcessLoader loader = new Bw5ProcessLoader();
		try (inputStream) {
			ProcessDefinition pd = loader.load(inputStream, getURI().toString());
			getContents().add(pd);			
		} catch (XMLStreamException e) {
			throw new NasdanikaException(e);
		}
	}
			
}