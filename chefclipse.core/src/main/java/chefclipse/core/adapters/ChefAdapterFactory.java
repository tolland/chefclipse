package chefclipse.core.adapters;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;

public class ChefAdapterFactory implements IAdapterFactory {

	private static Class<?>[] ADAPTER_LIST = new Class[] {

	IResource.class

	};

	public Class[] getAdapterList() {
		return ADAPTER_LIST;
	}

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (IResource.class.equals(adapterType)) {
			return getResource(adaptableObject);
		}
		return null;
	}

	private Object getResource(Object adaptableObject) {
		return adaptableObject.toString();
	}

}
