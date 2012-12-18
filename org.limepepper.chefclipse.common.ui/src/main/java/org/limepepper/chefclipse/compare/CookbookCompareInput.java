package org.limepepper.chefclipse.compare;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.ResourceNode;
import org.eclipse.compare.ZipFileStructureCreator;
import org.eclipse.compare.internal.BufferedResourceNode;
import org.eclipse.compare.internal.CompareUIPlugin;
import org.eclipse.compare.structuremergeviewer.DiffNode;
import org.eclipse.compare.structuremergeviewer.Differencer;
import org.eclipse.compare.structuremergeviewer.IDiffContainer;
import org.eclipse.compare.structuremergeviewer.IStructureComparator;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class CookbookCompareInput extends CompareEditorInput {

    private static final boolean NORMALIZE_CASE = true;
    private Object               fRoot;
    private IStructureComparator fAncestor;
    private IStructureComparator fLeft;
    private IStructureComparator fRight;
    private IResource            fAncestorResource;
    private IResource            fLeftResource;
    private IResource            fRightResource;

    public CookbookCompareInput(IResource item1, IResource item2) {
        super(new CompareConfiguration());

        fLeftResource = item1;
        fRightResource = item2;

        fLeft = getStructure(fLeftResource);
        fRight = getStructure(fRightResource);

    }

    protected Object prepareInput(IProgressMonitor pm) {
        ResourceNode ancestor = null;
        System.out.println("preparing input22");
        ResourceNode left = new ResourceNode((IResource) fLeftResource);
        ResourceNode right = new ResourceNode((IResource) fRightResource);

        Differencer d = new Differencer() {
            protected Object visit(Object parent, int description,
                    Object ancestor, Object left, Object right) {
                return new DiffNode((IDiffContainer) parent, description,
                        (ITypedElement) ancestor, (ITypedElement) left,
                        (ITypedElement) right);
            }
        };

        fRoot = d.findDifferences(false, pm, null, fAncestor, fLeft, fRight);
        return fRoot;

    }

    static class FilteredBufferedResourceNode extends BufferedResourceNode {
        FilteredBufferedResourceNode(IResource resource) {
            super(resource);
        }

        protected IStructureComparator createChild(IResource child) {
            String name = child.getName();
            if (CompareUIPlugin.getDefault().filter(name,
                    child instanceof IContainer, false))
                return null;
            return new FilteredBufferedResourceNode(child);
        }
    }

    private IStructureComparator getStructure(IResource input) {

        if (input instanceof IContainer)
            return new FilteredBufferedResourceNode(input);

        if (input instanceof IFile) {
            IStructureComparator rn = new FilteredBufferedResourceNode(input);
            IFile file = (IFile) input;
            String type = normalizeCase(file.getFileExtension());
            if ("JAR".equals(type) || "ZIP".equals(type)) //$NON-NLS-2$ //$NON-NLS-1$
                return new ZipFileStructureCreator().getStructure(rn);
            return rn;
        }
        return null;
    }

    @Override
    public void saveChanges(IProgressMonitor monitor) throws CoreException {

        super.saveChanges(monitor);
    }

    @Override
    public boolean isSaveNeeded() {
        return true;
    }

    private static String normalizeCase(String s) {
        if (NORMALIZE_CASE && s != null)
            return s.toUpperCase();
        return s;
    }

}
