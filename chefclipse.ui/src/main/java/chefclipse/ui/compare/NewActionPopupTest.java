package chefclipse.ui.compare;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.CompareUI;
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
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.ActionDelegate;

@SuppressWarnings("restriction")
public class NewActionPopupTest extends ActionDelegate implements
        IObjectActionDelegate {

    private static final boolean NORMALIZE_CASE = true;

    private Shell                shell;
    private ISelection           fSelection;
    private IWorkbenchPart       workbenchPart;
    private IWorkbenchPage       fWorkbenchPage;

    /**
     * Constructor for Action1.
     */
    public NewActionPopupTest() {
        super();
    }

    /**
     * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
     */
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
        shell = targetPart.getSite().getShell();
        fWorkbenchPage = targetPart.getSite().getPage();
    }

    public void run(ISelection selection) {
        /*
         * MessageDialog.openInformation(shell,
         * "org.limepepper.chefclipse.common.ui",
         * "New Action was executed.:" + fSelection);
         */
        // CompareUI.openCompareEditorOnPage(fInput, fWorkbenchPage);
        // fInput= null; // don't reuse this input!
        if (((IStructuredSelection) fSelection).size() == 1) {
            Object el = ((IStructuredSelection) selection).getFirstElement();

        } else if (((IStructuredSelection) selection).size() == 2) {

            IResource sel1 = (IResource) ((IStructuredSelection) selection)
                    .toArray()[0];
            IResource sel2 = (IResource) ((IStructuredSelection) selection)
                    .toArray()[1];

            CompareUI.openCompareEditorOnPage(new CompareInput(sel1, sel2),
                    fWorkbenchPage);

        }
    }

    static class FilteredBufferedResourceNode extends BufferedResourceNode {
        FilteredBufferedResourceNode(IResource resource) {
            super(resource);
        }

        @SuppressWarnings("restriction")
		protected IStructureComparator createChild(IResource child) {
            String name = child.getName();
            if (CompareUIPlugin.getDefault().filter(name,
                    child instanceof IContainer, false))
                return null;
            return new FilteredBufferedResourceNode(child);
        }
    }

    class CompareInput extends CompareEditorInput {

        private Object               fRoot;
        private IStructureComparator fAncestor;
        private IStructureComparator fLeft;
        private IStructureComparator fRight;
        private IResource            fAncestorResource;
        private IResource            fLeftResource;
        private IResource            fRightResource;

        public CompareInput(IResource item1, IResource item2) {
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

            Differencer d= new Differencer() {
                protected Object visit(Object parent, int description, Object ancestor, Object left, Object right) {
                    return new DiffNode((IDiffContainer) parent, description, (ITypedElement)ancestor, (ITypedElement)left, (ITypedElement)right);
                }
            };

            fRoot= d.findDifferences(false, pm, null, fAncestor, fLeft, fRight);
            return fRoot;



        }

        private IStructureComparator getStructure(IResource input) {

            if (input instanceof IContainer)
                return new FilteredBufferedResourceNode(input);

            if (input instanceof IFile) {
                IStructureComparator rn = new FilteredBufferedResourceNode(
                        input);
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
    }

    /*
     * (non-Javadoc)
     *
     * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
     */
    final public void run(IAction action) {
        run(fSelection);
    }

    /**
     * @see IActionDelegate#selectionChanged(IAction, ISelection)
     */
    public void selectionChanged(IAction action, ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            fSelection = (IStructuredSelection) selection;
        }
        if (action != null)
            action.setEnabled(isEnabled(fSelection));
    }

    private boolean isEnabled(ISelection selection) {
        System.err.println("checking enabled" + selection.getClass());

        if (selection instanceof IStructuredSelection) {
            if (((IStructuredSelection) selection).size() == 1) {
                Object el = ((IStructuredSelection) selection)
                        .getFirstElement();
                if (el instanceof IFolder)
                    System.err.println("uispwoef fewhfiuw");
                else if (el instanceof IFile) {

                    System.err.println("uispwoef fewhfiuw  fefe ");
                } else
                    return false;
                return true;
            } else if (((IStructuredSelection) selection).size() == 2) {
                return true;
            }
        }
/*
 * if ((sel instanceof IFolder)
 * && (((IFolder) sel).getParent().getName().equals("cookbooks"))) {
 * System.err.println("returning true in ifolder");
 * return true;
 *
 * }
 */
        return false;
    }

    private static String normalizeCase(String s) {
        if (NORMALIZE_CASE && s != null)
            return s.toUpperCase();
        return s;
    }

    public boolean canRunAsJob() {
        return true;
    }
}
