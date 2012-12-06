package org.limepepper.chefclipse.navigator.testers;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.mapping.ResourceMapping;
import org.eclipse.core.runtime.CoreException;
import org.limepepper.chefclipse.common.ui.builder.ChefProjectNature;
import org.limepepper.chefclipse.common.ui.resources.ChefProjectManager;
import org.limepepper.chefclipse.model.mapping.ChefResourceMapping;

public class ChefResourcesPropertyTester extends PropertyTester {

    private static ChefTester instance = null;

    public static ChefTester instance() {
        if (instance == null) {
            instance = new ChefTester();
        }

        return instance;
    }

    public static boolean testResource(IResource resource, String property) {
        if (instance().test(resource, property, new Object[] {}, ""))
            return true;
        return false;
    }

    public boolean test(IResource resource, String test) {
        return ChefTester.instance().test(resource, test,
                new Object[] {}, "true");
    }

    /**
     *
     * @todo so for debugging I let this run though to the end so I can print out
     * result, but for perforamnce it should return immediately
     *
     *
     */
    @SuppressWarnings("restriction")
    public boolean test(Object receiver, String property, Object[] args,
            Object expectedValue) {
        boolean result = false;
        Object eObject = null;

        try {

            /* resource based tests for ChefResources rather than Mapping */
            if (property.equals("isChefProject")
                    && (receiver instanceof IProject)) {

                result = ((IProject) receiver)
                        .isNatureEnabled(ChefProjectNature.NATURE_ID);
            }

            if (property.equals("isChefResource")
                    && (receiver instanceof IResource)) {

                result = ((IResource) receiver).getProject().hasNature(
                        ChefProjectNature.NATURE_ID);
                return result;

            }

            if (receiver instanceof ChefResourceMapping) {
                eObject = ((ResourceMapping) receiver).getModelObject();
            }

            if (property.equals("isChefProject")
                    && (receiver instanceof IProject)
                    && (receiver instanceof ChefResourceMapping)) {

                result = ((IProject) receiver)
                        .isNatureEnabled(ChefProjectNature.NATURE_ID);
            }

            if (property.equals("isCookbookProject")
                    && (receiver instanceof ResourceMapping)) {

                result = ((IProject) receiver)
                        .hasNature(ChefProjectNature.NATURE_ID);
            }

            if (property.equals("isWorkstationFolder")) {
                if ((receiver instanceof ResourceMapping)
                        && (((ResourceMapping) receiver).getModelObject() instanceof IFolder))
                    return ((IFolder) receiver).getName().equals(
                            ChefProjectManager.WORKSTATION_FOLDER);
            }
            if (property.equals("isCookbook")) {
                System.out.println("receiver iu:" + receiver);
            }

            if (property.equals("isCookbook") && (receiver instanceof IFolder)) {
                System.out.println("here receiver iu:" + receiver);

                System.out.println(((IFolder) receiver).getParent().getName());

                result = ((IFolder) receiver).getParent().getName()
                        .equals("cookbooks");
            }

            if (property.equals("isLibrary") && (receiver instanceof IFile)) {
                result = ((IFile) receiver).getParent().getName()
                        .equals("definitions");
            }

            if (property.equals("isDefinition") && (receiver instanceof IFile)) {
                result = ((IFile) receiver).getParent().getName()
                        .equals("definitions");
            }

            if (property.equals("isRecipe") && (receiver instanceof IFile)) {
                result = ((IFile) receiver).getParent().getName()
                        .equals("recipes");
            }

            if (property.equals("isCookbookMetadata")
                    && (receiver instanceof IFile)) {
                result = ((IFile) receiver).getName().equals("metadata.rb");
            }

            if (property.equals("isAttributesFile")
                    && (receiver instanceof IFile)) {
                result = ((IFile) receiver).getParent().getName()
                        .equals("attributes");
            }

            if (property.equals("isTemplate") && (receiver instanceof IFile)) {
                result = (((IFile) receiver).getFileExtension() != null)
                        && ((IFile) receiver).getFileExtension().equals("erb");
            }

            if (property.equals("isFile") && (receiver instanceof IFile)) {
                // @todo nasty nasty hack, fix this...
                result = ((IFile) receiver).getFullPath().toString()
                        .contains("/files/");
            }
        } catch (CoreException e) {
            e.printStackTrace();
        } finally {
            System.out.println("returning...for property " + property
                    + " object " + result + " : " + receiver.toString());
            System.out.println("class:" + receiver.getClass());

        }
        System.out.println("got hjere");
        return result;
    }
}
