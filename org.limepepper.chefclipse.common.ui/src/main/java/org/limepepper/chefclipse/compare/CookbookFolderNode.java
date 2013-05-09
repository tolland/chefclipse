package org.limepepper.chefclipse.compare;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.structuremergeviewer.IStructureComparator;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Root_file;
import org.limepepper.chefclipse.common.ui.Activator;

public class CookbookFolderNode extends CookbookResourceNode implements
        IStructureComparator, ITypedElement {

    List<Object> children = new ArrayList<Object>();
    String       name;

    public CookbookFolderNode(EObject input) {
        this(input, "root");
    }

    public CookbookFolderNode(EObject input, String name) {
        recurseInput(input);
    }

    public CookbookFolderNode(List<? extends EObject> input) {
        this(input, "root");
    }

    public CookbookFolderNode(List<? extends EObject> input, String name) {
        this.name = name;
        for (EObject object : input) {
            recurseInput(object);
        }
    }

    private void recurseInput(EObject input) {
        if (input instanceof ServerCookbookVersion) {
            Activator.log("recursing elements of input: "
                    + ((ServerCookbookVersion) input).getCookbook_name());
            for (Root_file iterable_element : ((ServerCookbookVersion) input)
                    .getRoot_files()) {
                children.add(new CookbookFileNode(iterable_element));
            }

            children.add(new CookbookFolderNode(((ServerCookbookVersion) input)
                    .getDefinitions(), "definitions"));
            children.add(new CookbookFolderNode(((ServerCookbookVersion) input)
                    .getRecipes(), "recipes"));
            children.add(new CookbookFolderNode(((ServerCookbookVersion) input)
                    .getTemplates(), "templates"));
            children.add(new CookbookFolderNode(((ServerCookbookVersion) input)
                    .getLibraries(), "libraries"));
            children.add(new CookbookFolderNode(((ServerCookbookVersion) input)
                    .getFiles(), "files"));
            children.add(new CookbookFolderNode(((ServerCookbookVersion) input)
                    .getProviders(), "providers"));
            children.add(new CookbookFolderNode(((ServerCookbookVersion) input)
                    .getResources(), "resources"));
            children.add(new CookbookFolderNode(((ServerCookbookVersion) input)
                    .getAttributes(), "attributes"));

        } else if (input instanceof ServerCookbookFile) {

            children.add(new CookbookFileNode(input));

        } else if (input instanceof CookbookFileNode) {

        }
    }

    @Override
    public Object[] getChildren() {

        return children.toArray();
    }

    @Override
    public String getName() {
        return this.name;
    }

    public String getType() {
        return ITypedElement.FOLDER_TYPE;
    }

    public boolean equals(Object other) {
        if (other instanceof ITypedElement)
            return name.equals(((ITypedElement) other).getName());
        return super.equals(other);
    }

    public int hashCode() {
        return name.hashCode();
    }
}
