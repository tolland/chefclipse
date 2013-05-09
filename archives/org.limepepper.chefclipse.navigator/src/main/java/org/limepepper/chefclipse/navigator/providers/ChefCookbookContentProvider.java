package org.limepepper.chefclipse.navigator.providers;


import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;


public class ChefCookbookContentProvider implements ICommonContentProvider {
		
	
	@Override
	public Object[] getElements(Object inputElement) {		
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		ArrayList<Object> children = new ArrayList<Object>();
		if(parentElement instanceof CookbookVersion){
		    CookbookVersion cookbook = (CookbookVersion)parentElement;			
			
			IFolder folder = (IFolder)ChefRepositoryManager.INSTANCE.getResource(cookbook);					
			IFile metadata = folder.getFile("metadata.rb");
									
			children.add(metadata);
			children.add(folder.getFolder("recipes"));
			
			//children.addAll(((Cookbook)parentElement).getRecipes());			
		}
		
		return children.toArray();
	}

	@Override
	public Object getParent(Object element) {		
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return false;
	}

	@Override
	public void dispose() {		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {		
	}

	@Override
	public void restoreState(IMemento aMemento) {		
	}

	@Override
	public void saveState(IMemento aMemento) {		
	}

	@Override
	public void init(ICommonContentExtensionSite aConfig) {
	}

}
