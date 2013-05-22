/**
 * 
 */
package org.limepepper.chefclipse.databag.editor.actions;

import java.io.IOException;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.limepepper.chefclipse.databag.editor.editors.DataBagEditorInput;
import org.limepepper.chefclipse.databag.editor.editors.DataBagEditorManager;
import org.limepepper.chefclipse.databag.editor.editors.MultiPageDataBagEditor;

/**
 * Action to open the Data Bag editor.
 * 
 * @author Sebastian Sampaoli
 *
 */
public class OpenDataBagEditorAction extends Action {

    private ISelectionProvider selectionProvider;
    private EObject eObject;
    private IWorkbenchPage page;

    public OpenDataBagEditorAction(IWorkbenchPage page, ISelectionProvider selectionProvider) {
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
            try {
                Map<String, JsonNode> nodesMap = DataBagEditorManager.INSTANCE.retrieveNodes(eObject);
                DataBagEditorInput input = new DataBagEditorInput(eObject, nodesMap);
                page.openEditor(input, MultiPageDataBagEditor.ID);
//                page.openEditor(input, "org.limepepper.chefclipse.databag.mpe.editor.DatabagMPE");
            } catch (PartInitException e) {
                e.printStackTrace();
            } catch (IOException e) {
                // TODO log the exception and present some error dialog: some file
                // could not be parsed.
                MessageDialog.open(MessageDialog.ERROR, page.getActivePart().getSite().getShell(), "Error while trying to read JSON file", e.getMessage(), SWT.NONE);
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
