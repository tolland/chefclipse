package chefclipse.ui.decorators;

import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

public class DeclarativeLightweightLabelDecorator implements ILabelDecorator {

	@Override
	public void addListener(ILabelProviderListener listener) {
		

	}

	@Override
	public void dispose() {
		

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		

	}

	@Override
	public Image decorateImage(Image image, Object element) {
		
		return null;
	}

	@Override
	public String decorateText(String text, Object element) {
		
		return null;
	}

}
