package org.limepepper.chefclipse.navigator.providers;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.limepepper.chefclipse.model.cookbook.Cookbook;

public class ChefRepositoryLabelProvider 
	extends LabelProvider implements ICommonLabelProvider{
	
	@Override
	public String getText(Object element) {
		if(element instanceof IFile){
			return ((IFile)element).getName();
		}
		
		if(element instanceof Cookbook) {
			return ((Cookbook)element).getName();
		}
		
		return super.getText(element);		
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
