package chefclipse.core;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;

public class ChefModel extends Openable implements IChefModel {

	@Override
	public IWorkspace getWorkspace() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IChefElement getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	protected boolean buildStructure(IProgressMonitor pm, Map newElements,
			IResource underlyingResource) /* throws JavaModelException */{

		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot()
				.getProjects();
		int length = projects.length;
		IChefElement[] children = new IChefElement[length];
		int index = 0;
		for (int i = 0; i < length; i++) {
			IProject project = projects[i];
			if (ChefProject.hasChefNature(project)) {
				children[index++] = getChefProject(project);
			}
		}
		return true;
	}

	/**
	 * Returns the active Java project associated with the specified resource,
	 * or <code>null</code> if no Java project yet exists for the resource.
	 * 
	 * @exception IllegalArgumentException
	 *                if the given resource is not one of an IProject, IFolder,
	 *                or IFile.
	 */
	public IChefElement getChefProject(IResource resource) {
		switch (resource.getType()) {
		case IResource.FOLDER:
			return new ChefProject(((IFolder) resource).getProject(), this);
		case IResource.FILE:
			return new ChefProject(((IFile) resource).getProject(), this);
		case IResource.PROJECT:
			return new ChefProject((IProject) resource, this);
		default:
			throw new IllegalArgumentException(
					"Messages.element_invalidResourceForProject");
		}
	}

	@Override
	public IChefProject getChefProject(IProject project) {

		return getChefProject(project);
	}

}
