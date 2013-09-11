/**
 *
 */
package org.limepepper.chefclipse.structured.json.editor.actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchPage;
import org.limepepper.chefclipse.structured.json.editor.StructuredJsonEditorActivator;
import org.limepepper.chefclipse.structured.json.editor.editors.MultiPageStructuredJsonEditor;
import org.limepepper.chefclipse.structured.json.editor.editors.StructuredJsonEditorInput;
import org.limepepper.chefclipse.structured.json.editor.utils.StructuredEditorFactory;

/**
 * Action to open the Structured JSON editor.
 *
 * @author Sebastian Sampaoli
 *
 */
public class OpenStructuredJSONEditorAction extends Action {

    private ISelectionProvider selectionProvider;
    private IWorkbenchPage page;
	private List<?> elements;

    public OpenStructuredJSONEditorAction(IWorkbenchPage page, ISelectionProvider selectionProvider) {
        setText("Open with Structured JSON Editor");
        this.selectionProvider = selectionProvider;
        this.page = page;
    }

    @Override
    public boolean isEnabled() {
        ISelection sel = selectionProvider.getSelection();
        if (!sel.isEmpty()) {
            IStructuredSelection selection = (IStructuredSelection) sel;
            if (selection.size() >= 1) {
            	List<?> elements = selection.toList();
				setElements(elements);
            	return containsJSONFiles(elements);
            }
        }
        return false;
    }

    private void setElements(List<?> elements) {
    	this.elements = elements;
	}

	private boolean containsJSONFiles(List<?> elements) {
		for (Object element : elements) {
			if (element instanceof IFile && ((IFile)element).getName().toLowerCase().endsWith(StructuredJsonEditorActivator.JSON_EXTENSION)) {
				return true;
			} else if (element instanceof IFolder) {
				try {
					return containsJSONFiles(new ArrayList<>(Arrays.asList(((IFolder)element).members())));
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

    @Override
    public void run() {
    	StructuredJsonEditorInput editorInput;
		try {
			editorInput = StructuredEditorFactory.INSTANCE.createEditorInput(elements);
			page.openEditor(editorInput, MultiPageStructuredJsonEditor.ID);
		} catch (CoreException e) {
			MessageDialog.open(MessageDialog.ERROR, page.getActivePart().getSite().getShell(), "Error while trying to read JSON file", e.getMessage(), SWT.NONE);
            e.printStackTrace();
		}
    }
}
