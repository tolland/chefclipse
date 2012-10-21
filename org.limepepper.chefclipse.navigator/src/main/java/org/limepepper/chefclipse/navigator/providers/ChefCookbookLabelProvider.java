package org.limepepper.chefclipse.navigator.providers;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.limepepper.chefclipse.model.cookbook.Recipe;


public class ChefCookbookLabelProvider 
	extends LabelProvider implements ICommonLabelProvider{
	
	@Override
	public String getText(Object element){
		if(element instanceof Recipe){			
			return ((Recipe)element).getName();
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
