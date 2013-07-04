package chefclipse.core.adapters;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.emf.ecore.EObject;

import chefclipse.core.ChefCore;
import chefclipse.core.managers.ChefRepositoryManager;

public class ChefAdapterFactory implements IAdapterFactory {

	private static Class<?>[] ADAPTER_LIST = new Class[] {

	IResource.class

	};

	@SuppressWarnings("rawtypes")
	public Class[] getAdapterList() {

		return ADAPTER_LIST;
	}

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (IResource.class.equals(adapterType)) {
			if (adaptableObject instanceof EObject) {
				ChefCore.debug("adapting :" + adaptableObject.getClass()
						+ " to " + adapterType.getCanonicalName());
				return ChefRepositoryManager.INSTANCE
						.getResource((EObject) adaptableObject);
			}

		}
		return null;
	}

}
