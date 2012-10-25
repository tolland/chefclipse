package org.limepepper.chefclipse.navigator.providers;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.limepepper.chefclipse.adapters.ChefRepositoryAdapter;
import org.limepepper.chefclipse.model.workstation.Repository;

public class ChefRepositoryContentProvider implements ICommonContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if(!(parentElement instanceof IFile)){
			return new Object[0];
		}
		
		Repository repo = ChefRepositoryAdapter.openChefRepository((IFile)parentElement);		
		return repo.getCookbooks().toArray();
	}

	@Override
	public Object getParent(Object element) {		
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {		
		return (getChildren(element).length > 0);
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
