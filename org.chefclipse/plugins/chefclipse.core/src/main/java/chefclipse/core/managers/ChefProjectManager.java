package chefclipse.core.managers;

import java.io.File;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.dltk.ruby.core.RubyNature;

import chefclipse.core.builders.ChefProjectNature;

public class ChefProjectManager {

	public static String WORKSTATION_FOLDER = ".workstation";

	private static ChefProjectManager instance = null;

	public static ChefProjectManager instance() {
		if (instance == null) {
			instance = new ChefProjectManager();
		}

		return instance;
	}

	public IProject createChefProject(String projectName, Path repoPath,
			IProgressMonitor monitor) throws CoreException {

		if (projectName == null || projectName.trim().length() == 0)
			return null;

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();

		// create eclipse project
		IProject project = root.getProject(projectName);

		if (project.exists()) {
			// project.delete(true, null);
			// @todo what about clobbering
		}

		IProjectDescription description = ResourcesPlugin.getWorkspace()
				.newProjectDescription(projectName);
		if (repoPath != null) {
			description.setLocation(repoPath);

			File f = repoPath.append(IProjectDescription.DESCRIPTION_FILE_NAME)
					.toFile();
			if (f.exists()) { /* do something */
				if (f.delete()) {

				} else {
					// System.out.println("Delete operation is failed.");
				}
			}
		}

		description.setNatureIds(new String[] { ChefProjectNature.NATURE_ID,
				RubyNature.NATURE_ID });

		project.create(description, monitor);
		project.open(monitor);

		/*
		 * String[] natures = description.getNatureIds(); String[] newNatures =
		 * new String[natures.length + 1]; System.arraycopy(natures, 0,
		 * newNatures, 0, natures.length); newNatures[natures.length] =
		 * JavaCore.NATURE_ID; description.setNatureIds(newNatures);
		 */

		return project;
	}

	public void createChefProject(IProject proj, String repoPath,
			IProgressMonitor monitor) throws CoreException {
		IProjectDescription desc = proj.getWorkspace().newProjectDescription(
				proj.getName());

		desc.setNatureIds(new String[] { ChefProjectNature.NATURE_ID });
		proj.create(desc, monitor);

		proj.open(monitor);

		IFolder workstation = proj.getFolder(WORKSTATION_FOLDER);
		workstation.create(true, true, monitor);

		IPath repo = new Path(repoPath);
		IFolder repoLink = workstation.getFolder(repo.lastSegment());
		repoLink.createLink(repo, IResource.REPLACE, monitor);
	}

	public IFolder getProjectRepositoryLink(IProject project) {
		if (!isChefProject(project)) {
			return null;
		}

		IFolder workstation = project.getFolder(WORKSTATION_FOLDER);
		if (!workstation.exists()) {
			return null;
		}

		try {
			for (IResource resource : workstation.members()) {
				if (resource.isLinked() && (resource instanceof IFolder)) {
					return (IFolder) resource;
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return null;
	}

	private boolean isChefProject(IProject project) {
		IProjectNature nature = null;

		try {
			nature = project.getNature(ChefProjectNature.NATURE_ID);
			if (nature != null) {
				return true;
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return false;
	}
	// public static ChefProjectManager openChefProject(IProject proj){
	// IProjectNature nature = null;
	//
	// try {
	// nature = proj.getNature(ChefProjectNature.PROJECT_NATURE_ID);
	// } catch (CoreException e) {
	// e.printStackTrace();
	// }
	//
	// if(nature != null){
	// return new ChefProjectManager(proj);
	// }
	//
	// return null;
	// }

}
