package org.limepepper.chefclipse.model.mapping;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.ide.IContributorResourceAdapter2;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;
import org.limepepper.chefclipse.ui.Activator;

public class ChefAdapterFactory implements IAdapterFactory,
		IContributorResourceAdapter2 {

	private static Class<?>[] ADAPTER_LIST = new Class[] {
			IPropertySource.class, IResource.class, IWorkbenchAdapter.class, };

	public ChefAdapterFactory() {

		Activator.debug("in constructor for ChefAdapterFactory");
	}

	public IResource getAdaptedResource(IAdaptable adaptable) {
    	//ChefCore.create(resource)

    	return null;
    }

	public ResourceMapping getAdaptedResourceMapping(IAdaptable adaptable) {
		ChefResourceMapping.create(adaptable);

		return null;
	}

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (IResource.class.equals(adapterType)) {
			// return getResource(java);
		}
		return null;
	}

	public Class[] getAdapterList() {
		return ADAPTER_LIST;
	}

}
