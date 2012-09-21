package org.limepepper.rcp.templateproject.common.resources;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;

public class TemplateModule {
	
	private IFolder folder;
	
	public String getName(){
		return folder.getName();
	}
	
	public IProject getProject(){
		return (IProject)folder.getParent();
	}
	
	public TemplateModule(IFolder folder){
		this.folder = folder;
	}
}
