package org.limepepper.chefclipse.navigator.providers;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.limepepper.chefclipse.common.workstation.Repository;


public class ChefProjectLabelProvider 
	extends LabelProvider implements ICommonLabelProvider{
	
	@Override
	public String getText(Object element) {
		if(element instanceof IResource){
			return ((IResource)element).getName();
		}
		
		if(element instanceof Repository) {
			return "workstation";
		}
		
		return "";
	}
	
	@Override
	public void restoreState(IMemento aMemento) {		
	}

	@Override
	public void saveState(IMemento aMemento) {
	}

	@Override
	public String getDescription(Object anElement) {
		return "";
	}

	@Override
	public void init(ICommonContentExtensionSite aConfig) {		
	}

}
