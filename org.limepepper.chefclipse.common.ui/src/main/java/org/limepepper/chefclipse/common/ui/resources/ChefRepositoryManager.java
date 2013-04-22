package org.limepepper.chefclipse.common.ui.resources;

import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.workstation.Repository;

/**
 * The ChefRepository manager is the point of contact for working with the
 * ChefObject model
 *
 *
 * @author tomhodder
 *
 */
public interface ChefRepositoryManager {

	public static ChefRepositoryManager INSTANCE = ChefRepositoryManagerImpl.instance();

	/**
	 * So i guess the idea here is to cause a full refresh of all the resouces
	 * in the local repo
	 *
	 */
	public void add(IResource resource);

	/**
	 * opens the repo corresponding to this project, sets the parent element of
	 * the model to the IProject resource or if not exists
	 * then Initializes a repository in the project
	 *
	 */
	public void remove(IResource resource);


	public void updateDependsLists(CookbookVersion cookbook);

	public Resource openEcoreResource(IResource resource);

	public void resetRepository(IResource item);

	public void readInKnifeConfigs(IProject project);

	public Repository getRepository(IProject project);

	public Collection<KnifeConfig> getKnives(IProject iProject);

	public IResource getResource(EObject element);

	public IFolder getResource(CookbookVersion cookbook);

	public IResource getCookbookForResource(IResource resource);

	public EObject getElement(IResource resource);

	public EObject createDataBag(IFolder resource) throws CoreException;
	
	public EObject createDataBagItem(IFile resource);

}
