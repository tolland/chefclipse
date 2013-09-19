/**
 *
 */
package org.limepepper.chefclipse.databag.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchPage;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.structured.json.editor.editors.MultiPageStructuredJsonEditor;
import org.limepepper.chefclipse.structured.json.editor.editors.StructuredJsonEditorInput;
import org.limepepper.chefclipse.structured.json.editor.utils.StructuredEditorFactory;

import chefclipse.core.managers.ChefRepositoryManager;

/**
 * Action to open the Structured JSON editor.
 * 
 * @author Sebastian Sampaoli
 * 
 */
public class OpenStructuredJSONEditorAction extends Action {

	private ISelectionProvider selectionProvider;
	private EObject eObject;
	private IWorkbenchPage page;

	public OpenStructuredJSONEditorAction(IWorkbenchPage page,
			ISelectionProvider selectionProvider) {
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
					this.eObject = (EObject) selection.getFirstElement();
					return true;
				} else if (selection.getFirstElement() instanceof IResource) {
					IResource resource = (IResource) selection
							.getFirstElement();
					EObject eObject = ChefRepositoryManager.INSTANCE
							.getElement(resource);
					this.eObject = eObject;
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
			final IStructuredSelection selection = (IStructuredSelection) page
					.getSelection();
			List<IResource> resource = retrieveResource(selection
					.getFirstElement());
			StructuredJsonEditorInput editorInput;
			try {
				editorInput = StructuredEditorFactory.INSTANCE
						.createEditorInput(resource);
				page.openEditor(editorInput, MultiPageStructuredJsonEditor.ID);
			} catch (CoreException e) {
				MessageDialog.open(MessageDialog.ERROR, page.getActivePart()
						.getSite().getShell(),
						"Error while trying to read JSON file", e.getMessage(),
						SWT.NONE);
				e.printStackTrace();
			}

		}

	}

	private List<IResource> retrieveResource(Object eObject) {
		List<IResource> jsonFiles = new ArrayList<IResource>();
		if (eObject instanceof DataBag) {
			DataBag dataBag = (DataBag) eObject;
			jsonFiles.add(dataBag.getResource());
		} else {
			DataBagItem dataBagItem = (DataBagItem) eObject;
			jsonFiles.add(dataBagItem.getJsonResource());
		}
		return jsonFiles;
	}
}