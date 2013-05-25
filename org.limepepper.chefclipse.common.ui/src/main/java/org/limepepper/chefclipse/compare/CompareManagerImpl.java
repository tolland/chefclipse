package org.limepepper.chefclipse.compare;

import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.CompareUI;
import org.eclipse.compare.ITypedElement;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.limepepper.chefclipse.compare.actions.CookbookCompareEditorInput;

public class CompareManagerImpl {

    public static void doit( IResource[] selectedResources) {



        ITypedElement ancestor = null;
        ITypedElement left = null;
        ITypedElement right = null;

        if (selectedResources.length == 2) {
            if (selectedResources[0] != null)
                left = getElementFor(selectedResources[0]);

            if (selectedResources[1] != null)
                right = getElementFor(selectedResources[1]);

        } else if (selectedResources.length == 1) {

            // ancestor = getElementFor(dialog.ancestorResource);
            if (selectedResources[0] != null)
                left = getElementFor(selectedResources[0]);
            // right = getElementFor(dialog.rightResource);
        } else {
            return;
        }
        openInCompare(ancestor, left, right);
    }

    private static void openInCompare(ITypedElement ancestor, ITypedElement left,
            ITypedElement right) {
     //  IWorkbenchPage workBenchPage = getTargetPage();
        CompareEditorInput input = new CookbookCompareEditorInput(ancestor,
                left, right);

        CompareUI.openCompareEditor(input);

    }
    private static ITypedElement getElementFor(IResource resource) {
        return CookbookCompareEditorInput.createFileElement((IFile) resource);
    }
}
