package org.limepepper.chefclipse.compare;

import org.eclipse.compare.structuremergeviewer.IStructureComparator;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;

public class VirtualFolderNode implements IStructureComparator {

    EObject eObject;

    public VirtualFolderNode(EObject input) {
        this.eObject = input;
    }

    @Override
    public Object[] getChildren() {
        //eObject.getClass(
        return null;
    }

}
