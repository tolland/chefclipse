package chefclipse.core.adapters;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;

import chefclipse.core.ChefCore;
import chefclipse.core.IChefElement;

public class ResourceAdapterFactory implements IAdapterFactory {

	private static Class<?>[] PROPERTIES = new Class[] {
		IChefElement.class

	};

	public Class[] getAdapterList() {
		return PROPERTIES;
	}

	public Object getAdapter(Object element, @SuppressWarnings("rawtypes") Class key) {
		if (IChefElement.class.equals(key)) {

			// Performance optimization, see
			// https://bugs.eclipse.org/bugs/show_bug.cgi?id=133141
			if (element instanceof IFile) {
				return ChefCore.create((IFile) element);
			}

			if (element instanceof IFolder) {
				return ChefCore.create((IFolder) element);
			}

			// @todo not sure if this makes any sense
			return ChefCore.create((IResource) element);
		}
		return null;
	}
}
