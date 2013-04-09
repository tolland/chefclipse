package chefclipse.internal.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;

import chefclipse.core.ChefCore;
import chefclipse.core.IChefElement;



public class ResourceAdapterFactory implements IAdapterFactory {

	private static Class<?>[] PROPERTIES = new Class[] { IChefElement.class };

	public Class[] getAdapterList() {
		return PROPERTIES;
	}

	public Object getAdapter(Object element, Class key) {
		if (IChefElement.class.equals(key)) {

			// Performance optimization, see
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=133141
			if (element instanceof IFile) {

			}

			return ChefCore.create((IResource) element);
		}
		return null;
	}
}
