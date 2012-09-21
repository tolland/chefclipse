package org.limepepper.rcp.templateproject.common.resources;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

/*
 * The wrapper class to access the template projects, namely to access modules.
 * The template project is a IProject instance containing the template nature.
 * Each module is a sub-folder contained within the {@link TemplateResources.MODULES_FOLDER_NAME}.
 */
public class TemplateProject {
			
	private IProject project;
	
	public TemplateProject(IProject project){
		this.project = project;
	}
	
	public IProject getProject(){
		return this.project;
	}
		
	
	private List<Object> getModules() {		
		IFolder modulesFolder = project.getFolder(TemplateResources.MODULES_FOLDER_NAME);		
		List<Object> modules = new ArrayList<Object>();
		
		try {
			IResource[] members = modulesFolder.members();			
			
			for(int i = 0; i < members.length; i++){
				if(members[i] instanceof IFolder){
					modules.add(new TemplateModule((IFolder)members[i]));
				}					
			}			
		} catch (CoreException e) {				
			e.printStackTrace();						 
		}
		
		return modules;
	}
	
	public TemplateModule getModule(String moduleName){
		IFolder modulesFolder = project.getFolder(TemplateResources.MODULES_FOLDER_NAME);
		
		if(modulesFolder.exists()){			
			IFolder module = modulesFolder.getFolder(moduleName);
			if(module.exists()){
				return new TemplateModule(module);
			}
		}
		
		return null;
	}
	
	public Object[] getMembers(){
		List<Object> members = this.getModules();
		
		try {
			IResource[] resources = project.members();			
			
			for(IResource resource: resources){
				if(!(resource instanceof IFolder) || 
						resource.getName().equals(TemplateResources.MODULES_FOLDER_NAME)){
					
					members.add(resource);
				}					
			}			
		} catch (CoreException e) {				
			e.printStackTrace();						
		}
		
		return members.toArray();
	}
}
