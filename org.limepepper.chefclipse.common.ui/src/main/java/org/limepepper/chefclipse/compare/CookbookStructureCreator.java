package org.limepepper.chefclipse.compare;

import org.eclipse.compare.structuremergeviewer.IStructureComparator;
import org.eclipse.compare.structuremergeviewer.IStructureCreator;

public class CookbookStructureCreator implements IStructureCreator {

    public CookbookStructureCreator() {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public IStructureComparator getStructure(Object input) {
        return null;
    }

    @Override
    public IStructureComparator locate(Object path, Object input) {
        return null;
    }

    @Override
    public String getContents(Object node, boolean ignoreWhitespace) {
        return null;
    }

    @Override
    public void save(IStructureComparator node, Object input) {
    }

}
