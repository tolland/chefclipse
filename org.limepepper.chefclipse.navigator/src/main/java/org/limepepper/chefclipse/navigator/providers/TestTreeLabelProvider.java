package org.limepepper.chefclipse.navigator.providers;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.graphics.Image;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.ui.Activator;
import org.limepepper.chefclipse.common.ui.providers.ChefProjectAdapterFactory;
import org.limepepper.chefclipse.common.ui.resources.ChefProjectManager;
import org.limepepper.chefclipse.navigator.NavigatorActivator;
import org.limepepper.chefclipse.navigator.providers.TestTreeContentProvider.MenuLevelHolder;

public class TestTreeLabelProvider extends AdapterFactoryLabelProvider {

    public TestTreeLabelProvider() {
        super(ChefProjectAdapterFactory.getAdapterFactory());
    }

    public Image getImage(Object element) {

        if ((element instanceof IFile)
                && ((IFile) element).getName().equals(
                        ChefProjectManager.WORKSTATION_FOLDER)) {
            return super.getImage(element);
        } else if (element instanceof CookbookFile) {
            return super.getImage(element);
        } else if (element instanceof CookbookVersion) {
            return super.getImage(element);
        } else if (element instanceof MenuLevelHolder) {
            return     Activator
                    .imageDescriptorFromPlugin(
                            NavigatorActivator.PLUGIN_ID,
                            "icons/file_obj.png")
                            .createImage();
            // imageDescriptorFromPlugin(getBundle().getSymbolicName(),
            // "icons/iu_obj.gif")

            // return super.getImage(element);
        } else if (element instanceof EObject) {
            return super.getImage(element);
        } else if (element instanceof String) {



        }
        return null;
    }

    public String getText(Object element) {
        if ((element instanceof IFile)
                && ((IFile) element).getName().equals(
                        ChefProjectManager.WORKSTATION_FOLDER)) {
            return super.getText(element);/*
                                           * } else if (element instanceof
                                           * CookbookFile) {
                                           * return super.getText(element);
                                           * } else if (element instanceof
                                           * CookbookVersion) {
                                           * return super.getText(element);
                                           */
        } else if (element instanceof EObject) {
            return super.getText(element);
        } else if (element instanceof String) {
            return (String) element;
        } else if (element instanceof MenuLevelHolder) {

            return ((MenuLevelHolder) element).getLabel();

        }
        return null;
    }

}
