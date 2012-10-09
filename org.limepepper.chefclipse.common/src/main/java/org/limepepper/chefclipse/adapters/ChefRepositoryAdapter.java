package org.limepepper.chefclipse.adapters;

import java.io.File;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.limepepper.chefclipse.model.cookbook.Cookbook;
import org.limepepper.chefclipse.model.cookbook.CookbookFactory;
import org.limepepper.chefclipse.model.cookbook.Recipe;
import org.limepepper.chefclipse.model.workstation.Repository;
import org.limepepper.chefclipse.model.workstation.WorkstationFactory;
import org.limepepper.chefclipse.model.workstation.WorkstationPackage;

public class ChefRepositoryAdapter {
	
	
	/*
	 * Create a repository ecore object containing  a reference to the on-disk repository.
	 * The content of the repository object, i.e. cookbooks, config, has to be synchronized
	 * with the on-disk structure explicitly.
	 */
	public static void createChefRepository(String filename, String location, IProject project, IProgressMonitor monitor) 
				throws Exception{
		
		ResourceSet resourceSet = new ResourceSetImpl();
		String path = project.getFullPath().toString() + "/" + filename;
		URI fileURI = URI.createPlatformResourceURI(path , true);
		Resource resource = resourceSet.createResource(fileURI);
		
		Repository repo = WorkstationFactory.eINSTANCE.createRepository();		
		repo.setBasepath(location);
		
		synchronize(repo);
		
		resource.getContents().add(repo);
		resource.save(Collections.EMPTY_MAP);
	}
	
	public static Repository openChefRepository(IFile file){
		ResourceSet resourceSet = new ResourceSetImpl();
		URI fileURI = URI.createPlatformResourceURI(file.getLocationURI().toString() , true);
		Resource resource = resourceSet.getResource(fileURI, true);
		
		return (Repository)resource.getContents().toArray()[0];		
	}
	
	/*
	 * Synchronizes the content of the repository object with the on-disk structure
	 */
	public static void synchronize(Repository repo){
		File loc = new File(repo.getBasepath());
		
		for(File f: loc.listFiles()){
			if(f.isDirectory() && f.getName().equals("cookbooks")){
				synchronizeCookbooks(repo, f);
			}
		}
	}
	
	/*
	 * Creates cookbook objects from the on-disk structure
	 */
	public static void synchronizeCookbooks(Repository repo, File location){
		for(File f: location.listFiles()){
			if(f.isDirectory()){
				Cookbook cookbook = CookbookFactory.eINSTANCE.createCookbook();
				synchronizeCookbook(cookbook, f);
				repo.getCookbooks().add(cookbook);
				
				
			}
		}
	}
	
	/*
	 * Creates a cookbook object from the on-disk structure
	 * ToDo: implement the creation of recipes. Now only one dummy recipe is created
	 */
	public static void synchronizeCookbook(Cookbook cookbook, File location){
		for(File f: location.listFiles()){
			if(f.isDirectory() && f.getName().equals("recipes")){
				Recipe recipe = CookbookFactory.eINSTANCE.createRecipe();
				recipe.getCookbook().add(cookbook);
				cookbook.getRecipes().add(recipe);				
			}
		}
	}
}