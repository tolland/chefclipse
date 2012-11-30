package org.limepepper.chefclipse.common.ui.resources;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.cookbook.Cookbook;
import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.Recipe;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.common.workstation.WorkstationFactory;


public class ChefRepositoryManager {

	private Map<IResource, EObject> elements = new HashMap<IResource, EObject>();
	private Map<EObject, IResource> resources = new HashMap<EObject, IResource>();

	private static ChefRepositoryManager instance = null;

	public static ChefRepositoryManager instance(){
		if(instance == null){
			instance = new ChefRepositoryManager();
		}

		return instance;
	}


	public Repository getRepository(IResource resource){
		return (Repository)getElement(resource.getProject());
	}


	public EObject getElement(IResource resource){
		if(!elements.containsKey(resource) &&
				!elements.containsKey(resource.getProject())){
			loadRepository(resource.getProject());
		}

		return elements.get(resource);
	}


	public IResource getResource(EObject element){
		return resources.get(element);
	}

	private void loadRepository(IProject project){
		IFolder location = ChefProjectManager.instance().getProjectRepositoryLink(project);

		Repository repo = WorkstationFactory.eINSTANCE.createRepository();
		repo.setBasepath(location.getLocation().toOSString());

		addMapping(project, repo);

		try {
			synchronizeRepository(repo, location);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Synchronizes the content of the repository object with the on-disk structure
	 */
	private void synchronizeRepository(Repository repo, IFolder location) throws CoreException{
		for(IResource res: location.members()){
			if((res instanceof IFolder) && res.getName().equals("cookbooks")){
				synchronizeCookbooks(repo, (IFolder)res);
			}
		}
	}

	/*
	 * Creates cookbook objects from the on-disk structure
	 */
	private void synchronizeCookbooks(Repository repo, IFolder location) throws CoreException{
		for(IResource res: location.members()){
			if(res instanceof IFolder){
				Cookbook cookbook = CookbookFactory.eINSTANCE.createCookbook();
				cookbook.setName(res.getName());
				cookbook.setRepository(repo);

				addMapping(res, cookbook);

				synchronizeRecipes(cookbook, (IFolder)res);
				repo.getOldCookbooks().add(cookbook);
			}
		}
	}

	/*
	 * Creates a cookbook object from the on-disk structure
	 * ToDo: implement the creation of recipes. Now only one dummy recipe is created
	 */
	private void synchronizeRecipes(Cookbook cookbook, IFolder location) throws CoreException{
		for(IResource res: location.members()){
			if((res instanceof IFolder) && res.getName().equals("recipes")){
				for(IResource r: ((IFolder)res).members()){
					Recipe recipe = CookbookFactory.eINSTANCE.createRecipe();
					recipe.setOldCookbook(cookbook);
					cookbook.getRecipes().add(recipe);

					addMapping(r, recipe);
				}
			}
		}
	}


	private void addMapping(IResource resource, EObject element){
		elements.put(resource, element);
		resources.put(element, resource);
	}






//	/*
//	 * Create a repository ecore object containing  a reference to the on-disk repository.
//	 * The content of the repository object, i.e. cookbooks, config, has to be synchronized
//	 * with the on-disk structure explicitly.
//	 */
//	public void createChefRepository(String filename, String location, IProject project, IProgressMonitor monitor)
//				throws Exception{
//
//		ResourceSet resourceSet = new ResourceSetImpl();
//		String path = project.getFullPath().toString() + "/" + filename;
//		URI fileURI = URI.createPlatformResourceURI(path , true);
//		Resource resource = resourceSet.createResource(fileURI);
//
//		Repository repo = WorkstationFactory.eINSTANCE.createRepository();
//		repo.setBasepath(location);
//
//
//		resource.getContents().add(repo);
//		resource.save(Collections.EMPTY_MAP);
//	}
//
//	public Repository openChefRepository(IFile file){
//		ResourceSet resourceSet = new ResourceSetImpl();
//		URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString() , true);
//		Resource resource = resourceSet.getResource(fileURI, true);
//
//		Repository repo = (Repository)resource.getContents().toArray()[0];
//		synchronize(repo);
//
//		return repo;
//	}
}