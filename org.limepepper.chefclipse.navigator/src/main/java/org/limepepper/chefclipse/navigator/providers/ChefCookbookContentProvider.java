package org.limepepper.chefclipse.navigator.providers;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.limepepper.chefclipse.model.cookbook.Cookbook;


public class ChefCookbookContentProvider implements ICommonContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {		
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof Cookbook){
			return ((Cookbook)parentElement).getRecipes().toArray();
		}
		
		return new Object[0];
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
