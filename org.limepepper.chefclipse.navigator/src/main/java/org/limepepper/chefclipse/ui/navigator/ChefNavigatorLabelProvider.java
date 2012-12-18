package org.limepepper.chefclipse.ui.navigator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.ui.providers.ChefProjectAdapterFactory;

public class ChefNavigatorLabelProvider extends AdapterFactoryLabelProvider {

    public ChefNavigatorLabelProvider() {
        super(ChefProjectAdapterFactory.getAdapterFactory());
    }

    public String getText(Object element) {
        if (element instanceof EObject) {
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
