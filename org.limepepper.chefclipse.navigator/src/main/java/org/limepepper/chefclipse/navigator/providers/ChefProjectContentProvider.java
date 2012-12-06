package org.limepepper.chefclipse.navigator.providers;


import java.util.ArrayList;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.limepepper.chefclipse.common.ui.resources.ChefProjectManager;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.limepepper.chefclipse.common.workstation.Repository;

public class ChefProjectContentProvider implements ICommonContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if(parentElement instanceof IProject){
			ArrayList<Object> children = new ArrayList<Object>();			
			try {
				for(IResource member: ((IProject)parentElement).members()){
					if((member instanceof IFolder) && 
							member.getName().equals(ChefProjectManager.WORKSTATION_FOLDER)){
						Repository repo = ChefRepositoryManager.instance().getRepository((IProject)parentElement);
						children.add(repo);
					}
					else{
						children.add(member);
					}
				}
				return children.toArray();
			} catch (CoreException e) {				
				e.printStackTrace();
			}
		}
		
		if(parentElement instanceof Repository){
			return ((Repository)parentElement).getCookbooks().toArray();			
		}
		
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {		
		if(element instanceof IProject){
			return ((IProject)element).getParent();
		}
		
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
