package org.limepepper.chefclipse.navigator.providers;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jdt.annotation.NonNull;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.ui.builder.ChefProjectNature;
import org.limepepper.chefclipse.common.ui.resources.ChefProjectManager;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestTreeContentProvider extends AdapterFactoryContentProvider {

    Logger                         logger      = LoggerFactory
                                                       .getLogger(TestTreeContentProvider.class);
    private static ResourceSetImpl resourceSet = new ResourceSetImpl();

    public TestTreeContentProvider() {

        super(ChefProjectAdapterFactory.getAdapterFactory());
    }

    public Object[] getChildren(Object parentElement) {

        ArrayList<Object> children = new ArrayList<Object>();
        System.err.println(parentElement.getClass());

        if (parentElement instanceof IProject) {
            children.add(ChefRepositoryManager.instance().getRepository(
                    ((IProject) parentElement)));

            for (KnifeConfig knifeConfig : ChefRepositoryManager.instance()
                    .getKnives(((IProject) parentElement))) {
                children.add(knifeConfig);
            }

            return children.toArray();

        } else
        /**
         * this messes about with the persisted model, and is for manipulating
         * the viwe of that directly
         * 
         */

        if ((parentElement instanceof IFile)
                && ((IFile) parentElement).getName().equals(
                        ChefProjectManager.WORKSTATION_FOLDER)) {
            parentElement = ChefRepositoryManager.instance().getRepository(
                    ((IFile) parentElement).getProject());

            return super.getChildren(parentElement);
        } else if (parentElement instanceof CookbookVersion) {
            return new MenuLevelHolder[] {
                    new MenuLevelHolder("Recipes",
                            ((CookbookVersion) parentElement).getRecipes()),
                    new MenuLevelHolder("Templates",
                            ((CookbookVersion) parentElement).getTemplates()),
                    new MenuLevelHolder("Files",
                            ((CookbookVersion) parentElement).getFiles()),
                    new MenuLevelHolder("Attributes",
                            ((CookbookVersion) parentElement).getAttributes()),
                    new MenuLevelHolder("Definitions",
                            ((CookbookVersion) parentElement).getDefinitions()),
                    new MenuLevelHolder("Libraries",
                            ((CookbookVersion) parentElement).getLibraries()),
                    new MenuLevelHolder("Dependendies",
                            ((CookbookVersion) parentElement).getDepends()) };

        } else if (parentElement instanceof MenuLevelHolder) {

            return ((MenuLevelHolder) parentElement).getChildren();

        }
        return super.getChildren(parentElement);
    }

    class MenuLevelHolder {
        EObject  parentElement;
        String   label;
        Object[] children;

        public String getLabel() {
            return label;
        }

        public Object[] getChildren() {
            return children;
        }

        MenuLevelHolder(@NonNull String name,
                @NonNull EList<? extends CookbookFile> eList) {
            label = name;
            children = eList.toArray();
        }

    }

    public Object getParent(Object element) {
        if ((element instanceof IFile)
                && ((IFile) element).getName().equals(
                        ChefProjectManager.WORKSTATION_FOLDER)) {
            return ((IResource) element).getParent();
        }
        return super.getParent(element);
    }

    public boolean hasChildren(Object element) {

        try {
            if ((element instanceof IFile)
                    && ((IFile) element).getName().equals(
                            ChefProjectManager.WORKSTATION_FOLDER)) {
                System.err.println("is workstation folder");
                return true;
            } else if ((element instanceof IProject)
                    && ((IProject) element)
                            .hasNature(ChefProjectNature.NATURE_ID)) {
                logger.debug("is project");
                return true;
            } else if (element instanceof MenuLevelHolder) {
                return (((MenuLevelHolder) element).getChildren().length > 0);

            }
        } catch (CoreException e) {
            e.printStackTrace();
        }
        return super.hasChildren(element);
    }

}
