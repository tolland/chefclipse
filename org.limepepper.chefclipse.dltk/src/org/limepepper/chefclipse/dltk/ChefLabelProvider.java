package org.limepepper.chefclipse.dltk;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.limepepper.chefclipse.dltk.model.Resource;

public class ChefLabelProvider extends LabelProvider {

	public ChefLabelProvider() {
	}

	@Override
	public String getText(Object element) {
		if (element instanceof ChefResourceModelElement) {
			Resource resource = ((ChefResourceModelElement)element).getResource();
			return resource.getDisplayName();
		}
		return null;
	}
	
	@Override
	public Image getImage(Object element) {
		if (element instanceof ChefResourceModelElement) {
			return Activator.getDefault().getImageRegistry().get(Activator.CHEFCLIPSE_ICON);
		}
		return super.getImage(element);
	}
	
}
