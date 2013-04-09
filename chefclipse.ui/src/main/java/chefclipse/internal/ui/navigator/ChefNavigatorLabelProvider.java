package chefclipse.internal.ui.navigator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.graphics.Image;

import chefclipse.core.providers.ChefProjectAdapterFactory;
import chefclipse.internal.ui.navigator.ChefNavigatorContentProvider.MenuLevelHolder;
import chefclipse.ui.ChefPlugin;

public class ChefNavigatorLabelProvider extends AdapterFactoryLabelProvider {

	public ChefNavigatorLabelProvider() {
		super(ChefProjectAdapterFactory.getAdapterFactory());
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof EObject) {
			return super.getImage(element);
		} else if (element instanceof String) {

		} else if (element instanceof MenuLevelHolder) {
			return ChefPlugin.imageDescriptorFromPlugin(ChefPlugin.PLUGIN_ID,
					"icons/file_obj.png").createImage();
			// imageDescriptorFromPlugin(getBundle().getSymbolicName(),
			// "icons/iu_obj.gif")
			// return super.getImage(element);
		}
		return null;
	}

	@Override
	public String getText(Object element) {

		if (element instanceof EObject) {

			return super.getText(element);

		} else if (element instanceof MenuLevelHolder) {

			return ((MenuLevelHolder) element).getLabel();

		}
		return null;
	}

}
