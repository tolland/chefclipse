package org.limepepper.chefclipse.model.mapping;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.ui.Activator;
import org.limepepper.chefclipse.model.ChefContainer;
import org.limepepper.chefclipse.model.ChefFile;
import org.limepepper.chefclipse.model.ChefResource;

public class ChefAdapterFactory implements IAdapterFactory, IWorkbenchAdapter {

    public ChefAdapterFactory() {

        Activator.debug("in constructor for ChefAdapterFactory");
    }

    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {

        if (IResource.class.equals(adapterType)) {
            if ((adaptableObject instanceof ChefResource)) {
                return ((ChefResource) adaptableObject).getResource();
            }
        }

        // if (adapterType == IWorkbenchAdapter.class
        // && adaptableObject instanceof ChefObject)
        // return new ModelItemProviderAdapterFactory();

      //  if (adapterType == ResourceMapping.class
       //         && adaptableObject instanceof ChefObject)
       //     return ChefResourceMapping.create((ChefObject) adaptableObject);

        Activator.debug("not adapting "
                + adaptableObject.getClass().getSimpleName() + " to "
                + adapterType.getSimpleName());

        return null;
    }

    @Override
    public Class[] getAdapterList() {
        System.err.println("return adapter list");
        return new Class[] { CookbookFile.class, ChefResource.class,
                IWorkbenchAdapter.class, IResource.class, ResourceMapping.class };
    }

    @Override
    public Object[] getChildren(Object o) {
        if ((o instanceof ChefContainer)) {
            return ((ChefContainer) o).getChildren().toArray();
        }
        if ((o instanceof ChefFile)) {
            return new Object[] {};
        }
        return new Object[] {};
    }

    @Override
    public ImageDescriptor getImageDescriptor(Object object) {
        return null;
    }

    @Override
    public String getLabel(Object o) {
        return null;
    }

    @Override
    public Object getParent(Object o) {
        return null;
    }

}
