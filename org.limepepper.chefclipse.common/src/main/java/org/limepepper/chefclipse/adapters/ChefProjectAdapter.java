package org.limepepper.chefclipse.adapters;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;


public class ChefProjectAdapter {
	
	public static String PROJECT_NATURE_ID = "org.limepepper.rcp.chefclipse.common.resources.ChefProjectNature";
	
	public static void createChefProject(IProject proj, IProgressMonitor monitor) throws CoreException{
		IProjectDescription desc = 
				proj.getWorkspace().newProjectDescription(proj.getName());
		
		desc.setNatureIds(new String[]{PROJECT_NATURE_ID});
		
		proj.create(desc, monitor);
	}
	
	public static ChefProjectAdapter openChefProject(IProject proj){
		IProjectNature nature = null;
		
		try {
			nature = proj.getNature(PROJECT_NATURE_ID);
		} catch (CoreException e) {			
			e.printStackTrace();
		}
		
		if(nature != null){
			return new ChefProjectAdapter(proj);
		}
		
		return null;
	}
	
	private IProject resource;
	
	public ChefProjectAdapter(IProject proj){
		resource = proj;
	}
	
}
