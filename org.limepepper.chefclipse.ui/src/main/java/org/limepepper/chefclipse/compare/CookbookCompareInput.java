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
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;

public class CookbookCompareInput extends CompareEditorInput {

    private static final boolean NORMALIZE_CASE = true;
    private Object               fRoot;
    private IStructureComparator fAncestor;
    private IStructureComparator fLeft;
    private IStructureComparator fRight;

    private Object               fAncestorResource;
    private Object               fLeftResource;
    private Object               fRightResource;

    public CookbookCompareInput(IResource item1, IResource item2) {
        super(new CompareConfiguration());

        fLeftResource = item1;
        fRightResource = item2;

        fLeft = getStructure(item1);
        fRight = getStructure(item2);

    }

    public CookbookCompareInput(IResource item1, ServerCookbookVersion item2) {
        super(new CompareConfiguration());

        fLeftResource = item1;
        fRightResource = item2;

        fLeft = getStructure((IResource) fLeftResource);
        fRight = getStructure(item2);

    }

    protected Object prepareInput(IProgressMonitor pm) {
        System.out.println("preparing input");

        // ResourceNode ancestor = null;

        // ResourceNode left = new ResourceNode((IResource) fLeftResource);
        // ResourceNode right = new ResourceNode((IResource) fRightResource);

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
        
        @Override
        public boolean equals(Object other) {
            return super.equals(other);
        }
        
        @Override
        public int hashCode() {
            return super.hashCode();
        }
        
    }

    public IStructureComparator getStructure(IResource input) {

        System.out.println("object is:" + input);

        if ((input instanceof ResourceNode)) {

            System.out.println(((ResourceNode) input).getType());
            if (((ResourceNode) input).getType().equals("cookbook")) {
                System.out.println(((ITypedElement) input).getType());

                if ((((ResourceNode) input).getResource()).getParent()
                        .getParent() != null) {

                    if ((((ResourceNode) input).getResource()).getParent()
                            .getParent().getName().equals("cookbooks")) {

                        System.err.println("here");
                        System.err.println("here2");

                        EObject eObject = ChefRepositoryManager.INSTANCE
                                .getElement((((ResourceNode) input)
                                        .getResource()).getParent());

                        IResource cookbookResource = (((ResourceNode) input)
                                .getResource()).getParent();

                        if (cookbookResource instanceof IContainer)
                            return new FilteredBufferedResourceNode(
                                    cookbookResource);

                    }
                }
            }
        }
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

    @SuppressWarnings("unused")
    private IStructureComparator getStructure(CookbookFolder input) {

        if (input.getResource() != null)
            return new FilteredBufferedResourceNode(input.getResource());

        return null;
    }

    private IStructureComparator getStructure(ServerCookbookVersion input) {

        return new CookbookFolderNode(input);

    }

    @Override
    public void saveChanges(IProgressMonitor monitor) throws CoreException {

        super.saveChanges(monitor);
    }

    @Override
    public boolean isSaveNeeded() {
        return false;
    }

    private static String normalizeCase(String s) {
        if (NORMALIZE_CASE && s != null)
            return s.toUpperCase();
        return s;
    }

}
