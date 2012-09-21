package org.limepepper.rcp.templateproject.common.resources;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class TemplateLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {				
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {				
	}

	@Override
	public Image getImage(Object element) {		
		return null;
	}

	@Override
	public String getText(Object element) {		
		if (element instanceof TemplateModule){
			return ((TemplateModule)element).getName();
		}
		return null;
	}

}
