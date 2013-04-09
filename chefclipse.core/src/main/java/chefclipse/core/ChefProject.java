package chefclipse.core;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.limepepper.chefclipse.common.workstation.Repository;

import chefclipse.core.managers.ChefRepositoryManager;

public class ChefProject extends Openable implements IChefProject, IOpenable,
		IChefResource {

	public ChefProject(IProject project, ChefModel parent) {
		super(parent);
		this.project = project;
		try {
			buildStructure(null, null, null, null);
		} catch (ChefModelException e) {
			e.printStackTrace();
		}
	}

	/**
	 * The platform project this <code>IChefProject</code> is based on
	 */
	protected IProject project;

	public ChefProject() {
		super(null);
	}

	@Override
	public boolean exists() {
		return false;
	}

	@Override
	public IChefElement getParent() {
		return null;
	}

	@Override
	public IProject getProject() {
		return null;
	}

	public static boolean hasChefNature(IProject project) {
		return false;
	}

	@Override
	public void close() throws ChefModelException {

	}

	@Override
	public void open(IProgressMonitor progress) throws ChefModelException {

	}

	@Override
	public Repository getRepository() {
		return (Repository) ChefRepositoryManager.INSTANCE.getElement(project);
	}

	/**
	 * Returns the active Java project associated with the specified resource,
	 * or <code>null</code> if no Java project yet exists for the resource.
	 * 
	 * @exception IllegalArgumentException
	 *                if the given resource is not one of an IProject, IFolder,
	 *                or IFile.
	 */
	public IChefResource getChefResource(IResource resource) {
		switch (resource.getType()) {
		case IResource.FOLDER:
			return new ChefFolder(((IFolder) resource), this);
		case IResource.FILE:
			return new ChefFile(((IFile) resource), this);
			// @todo subproject possible?
			/*
			 * case IResource.PROJECT: return new ChefProject((IProject)
			 * resource, this);
			 */
		default:
			throw new IllegalArgumentException(
					"Messages.element_invalidResourceForProject");
		}
	}

	@Override
	protected boolean buildStructure(OpenableElementInfo info,
			IProgressMonitor pm, Map newElements, IResource underlyingResource)
			throws ChefModelException {
		Repository repository = ChefRepositoryManager.INSTANCE
				.getRepository(project);
		try {
			int length = project.members().length;
			IResource[] members;

			members = project.members();

			IChefElement[] children = new IChefElement[length];
			int index = 0;
			for (int i = 0; i < length; i++) {
				IResource resource = members[i];
				// @todo isIgnored?
				// if (ChefProject.hasChefNature(project)) {
				children[index++] = getChefResource(resource);
				// }
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
}
