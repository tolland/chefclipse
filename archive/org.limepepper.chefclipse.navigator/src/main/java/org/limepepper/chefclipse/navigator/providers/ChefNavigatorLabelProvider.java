package org.limepepper.chefclipse.navigator.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

import chefclipse.core.ChefResource;
import chefclipse.core.providers.ChefProjectAdapterFactory;

public class ChefNavigatorLabelProvider extends AdapterFactoryLabelProvider {

    public ChefNavigatorLabelProvider() {
        super(ChefProjectAdapterFactory.getAdapterFactory());
    }

    public String getText(Object element) {
        if (element instanceof ChefResource) {
            return super.getText(((ChefResource) element).getResource()
                    .getName());
        } else if (element instanceof EObject) {
            return super.getText(element);
        } else if (element instanceof String) {
            return (String) element;
        }
        // return super.getText(element);
        return null;
    }

    public Image getImage(Object element) {

        if (element instanceof CookbookFile) {
            return super.getImage(element);
        } else if (element instanceof CookbookVersion) {
            return super.getImage(element);
        } else if (element instanceof EObject) {
            return super.getImage(element);
        } else if (element instanceof String) {

        }
        return null;
    }

}
