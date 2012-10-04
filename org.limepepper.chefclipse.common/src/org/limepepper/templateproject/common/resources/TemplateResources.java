package org.limepepper.chefclipse.common.resources;


import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/*
 * Helper routines to access and create resources with respect to structure
 * of the template project.
 */
public class TemplateResources {
	
	public static String MODULES_FOLDER_NAME = ".modules";
	public static String PROJECT_NATURE_ID = "org.limepepper.rcp.chefclipse.common.resources.chefclipseNature";
	
	public static Object[] getProjects(IWorkspaceRoot root) {		
		Object[] projects = new Object[root.getProjects().length];				
		for(int i = 0; i < root.getProjects().length; i++){
			Object proj = getProject(root.getProjects()[i]);
			if(proj != null)
				projects[i] = proj;
		}
		
		return projects;
	}
	
	public static chefclipse getProject(IProject project) {				
		IProjectNature nature = null;
		
		try {
			nature = project.getNature(PROJECT_NATURE_ID);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(nature != null){
			return new chefclipse(project);
		}
		
		return null;
	}	
	
	
	public static void createchefclipse(IProject proj, IProgressMonitor monitor) throws CoreException{
		IProjectDescription desc = 
				proj.getWorkspace().newProjectDescription(proj.getName());
		
		desc.setNatureIds(new String[]{PROJECT_NATURE_ID});
		
		proj.create(desc, monitor);
	}
	
	
	public static void createTemplateModule(String moduleName, IProject project, IProgressMonitor monitor) throws CoreException{
		IFolder modulesFolder = project.getFolder(MODULES_FOLDER_NAME);
		
		if(!modulesFolder.exists()){
			modulesFolder.create(true, true, monitor);
		}
		
		IFolder module = modulesFolder.getFolder(moduleName);
		module.create(true, true, monitor);
	}
	
}
