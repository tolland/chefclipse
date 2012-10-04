package org.limepepper.templateproject.common.resources;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;

/*
 * The wrapper class to represent the modules of the project.
 * It is simply a wrapper over the IFolder object, representing the module.
 */
public class TemplateModule {
	
	private IFolder folder;
			
	public TemplateModule(IFolder folder){
		this.folder = folder;
	}
	
	public String getName(){
		return folder.getName();
	}
	
	public IProject getProject(){
		return (IProject)folder.getParent();
	}
}
