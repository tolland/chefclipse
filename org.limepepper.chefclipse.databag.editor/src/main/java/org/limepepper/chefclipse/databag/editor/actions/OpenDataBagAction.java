/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.actions;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.limepepper.chefclipse.databag.editor.editors.DataBagEditorInput;
import org.limepepper.chefclipse.databag.editor.editors.MultiPageDataBagEditor;

/**
 * Action to open the Data Bag editor.
 * 
 * @author Sebastian Sampaoli
 *
 */
public class OpenDataBagAction extends Action {

    private ISelectionProvider selectionProvider;
    private EObject eObject;
    private IWorkbenchPage page;

    public OpenDataBagAction(IWorkbenchPage page, ISelectionProvider selectionProvider) {
        setText("Open");
        this.selectionProvider = selectionProvider;
        this.page = page;
    }
    
    @Override
    public boolean isEnabled() {
        ISelection sel = selectionProvider.getSelection();
        if (!sel.isEmpty()) {
            IStructuredSelection selection = (IStructuredSelection) sel;
            if (selection.size() == 1) {
                if (isDataBagOrDataBagItem(selection.getFirstElement())) {
                    seteObject((EObject) selection.getFirstElement());
                    return true;
                } else if (selection.getFirstElement() instanceof IResource) {
                    IResource resource = (IResource) selection.getFirstElement();
                    EObject eObject = ChefRepositoryManager.INSTANCE.getElement(resource);
                    seteObject(eObject);
                    return (isDataBagOrDataBagItem(eObject));
                }
            }
            return false;
        }
        return false;
    }

    private boolean isDataBagOrDataBagItem(Object firstElement) {
        return (firstElement instanceof DataBag || firstElement instanceof DataBagItem);
    }
    
    @Override
    public void run() {
        if (eObject != null) {
            DataBagEditorInput input = new DataBagEditorInput(eObject);
            try {
                page.openEditor(input, MultiPageDataBagEditor.ID);
            } catch (PartInitException e) {
                e.printStackTrace();
            }
        }
    }

    public EObject geteObject() {
        return eObject;
    }

    public void seteObject(EObject eObject) {
        this.eObject = eObject;
    }
}
