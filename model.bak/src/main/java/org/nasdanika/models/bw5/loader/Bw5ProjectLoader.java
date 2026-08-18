package org.nasdanika.models.bw5.loader;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.nasdanika.common.Util;
import org.nasdanika.models.bw5.Bw5Factory;
import org.nasdanika.models.bw5.Folder;
import org.nasdanika.models.bw5.Project;
import org.nasdanika.models.bw5.Resource;

public class Bw5ProjectLoader {
	
	private final Bw5Factory factory;
	private ResourceSet resourceSet;
	private Set<String> extensions;

	/**
	 * Creates a loader using the default {@link BwFactory#eINSTANCE} singleton.
	 */
	public Bw5ProjectLoader(ResourceSet resourceSet) {
		this(Bw5Factory.eINSTANCE, resourceSet);
	}

	/**
	 * Creates a loader with a custom factory.
	 *
	 * @param factory the EMF factory used to instantiate model objects
	 */
	public Bw5ProjectLoader(Bw5Factory factory, ResourceSet resourceSet) {
		this.factory = factory;
		this.resourceSet = resourceSet;
		this.extensions = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().keySet();
	}
	
	public Project loadProject(File projectDir) throws IOException {
		Project project = factory.createProject();
		// TODO - load vcrepo.data
		loadFolder(projectDir, null, project);				
		return project;		
	}
	
	protected void loadFolder(File dir, String projectPath, Folder folder) throws IOException {
		folder.setName(dir.getName());
		folder.setFileName(dir.getName());
		// TODO - load .folder
		for (File file : dir.listFiles()) {
			String filePath = Util.isBlank(projectPath) ? file.getName() : projectPath + "/" + file.getName();
			if (file.isDirectory()) {
				Folder subFolder = factory.createFolder();
				folder.getResources().add(subFolder);				
				subFolder.setProjectPath(filePath);
				loadFolder(file, filePath, subFolder);
			} else if (shallLoad(file)) {
				URI fileURI = URI.createFileURI(file.getCanonicalFile().getAbsolutePath());
				org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(fileURI, true);		
				for (EObject content : resource.getContents()) {
					if (content instanceof Resource res) {
						folder.getResources().add(res);						
						res.setProjectPath(filePath);
						if (Util.isBlank(res.getName())) {
							res.setName(file.getName());
						}
						res.setFileName(file.getName());
					}
				}
			} else {
				Resource resource = factory.createResource();
				resource.setProjectPath(filePath);
				resource.setName(file.getName());
				resource.setFileName(file.getName());
				folder.getResources().add(resource);
			}
		}
	}

	protected boolean shallLoad(File file) {
		Object fileExtension = fileExtension(file);
		return extensions.contains(fileExtension);
	}

	private Object fileExtension(File file) {
		String fileName = file.getName();
	    int dotIdx = fileName.lastIndexOf(".");
		return dotIdx < 1 ? "" : fileName.substring(dotIdx + 1); // Handle cases like ".hiddenfile"
	}
	

}
