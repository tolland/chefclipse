package org.limepepper.chefclipse.common.ui.resources;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

/**
 * @author markin
 * A project nature for the template project
 */
public class ChefProjectNature implements IProjectNature{
	
	public static String PROJECT_NATURE_ID = "org.limepepper.chefclipse.common.ui.resources.ChefProjectNature";
	
	private IProject project;
	
	@Override
	public void configure() throws CoreException {
		System.out.println("Project nature is configured");		
	}

	@Override
	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub		
	}

	@Override
	public IProject getProject() {		
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;		
	}

}
