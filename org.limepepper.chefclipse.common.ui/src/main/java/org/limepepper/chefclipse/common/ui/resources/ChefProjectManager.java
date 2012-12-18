package org.limepepper.chefclipse.common.ui.resources;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.limepepper.chefclipse.common.ui.builder.ChefProjectNature;


public class ChefProjectManager {

	public static String WORKSTATION_FOLDER = ".workstation";

	private static ChefProjectManager instance = null;

	public static ChefProjectManager instance(){
		if(instance == null){
			instance = new ChefProjectManager();
		}

		return instance;
	}


	public void createChefProject(IProject proj, String repoPath, IProgressMonitor monitor) throws CoreException{
		IProjectDescription desc =
				proj.getWorkspace().newProjectDescription(proj.getName());

		desc.setNatureIds(new String[]{ChefProjectNature.NATURE_ID});
		proj.create(desc, monitor);

		proj.open(monitor);

		IFolder workstation = proj.getFolder(WORKSTATION_FOLDER);
		workstation.create(true, true, monitor);

		IPath repo = new Path(repoPath);
		IFolder repoLink = workstation.getFolder(repo.lastSegment());
		repoLink.createLink(repo, IResource.REPLACE, monitor);
	}

	public IFolder getProjectRepositoryLink(IProject project){
		if(!isChefProject(project)){
			return null;
		}

		IFolder workstation = project.getFolder(WORKSTATION_FOLDER);
		if(!workstation.exists()){
			return null;
		}

		try {
			for(IResource resource: workstation.members()){
				if(resource.isLinked() && (resource instanceof IFolder)){
					return (IFolder)resource;
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return null;
	}

	private boolean isChefProject(IProject project){
		IProjectNature nature = null;

		try {
			nature = project.getNature(ChefProjectNature.NATURE_ID);
			if(nature != null){
				return true;
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return false;
	}
//	public static ChefProjectManager openChefProject(IProject proj){
//		IProjectNature nature = null;
//
//		try {
//			nature = proj.getNature(ChefProjectNature.PROJECT_NATURE_ID);
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}
//
//		if(nature != null){
//			return new ChefProjectManager(proj);
//		}
//
//		return null;
//	}
}
