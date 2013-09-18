/**
 * 
 */
package org.limepepper.chefclipse.databag.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.structured.json.editor.actions.OpenStructuredJSONEditorAction;
import org.limepepper.chefclipse.structured.json.editor.editors.MultiPageStructuredJsonEditor;
import org.limepepper.chefclipse.structured.json.editor.editors.ResourceDeltaVisitor;
import org.limepepper.chefclipse.structured.json.editor.editors.StructuredJsonEditorInput;

/**
 * Handler which allows to open the {@link MultiPageStructuredJsonEditor} from a
 * selection of {@link DataBag}s or {@link DataBagItem}s.
 * 
 * @author Sebastian Sampaoli
 * 
 */
public class OpenStructuredJsonEditorHandler extends AbstractHandler implements
		IHandler, IResourceChangeListener {

	private OpenStructuredJSONEditorAction openEditorAction;

	public OpenStructuredJsonEditorHandler() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		final IStructuredSelection selection = (IStructuredSelection) activeWorkbenchWindow
				.getSelectionService().getSelection();
		@SuppressWarnings("unchecked")
		List<IResource> jsonFiles = retrieveJsonFiles(selection.toList());
		openEditorAction = new OpenStructuredJSONEditorAction(
				activeWorkbenchWindow.getActivePage(), jsonFiles);
		openEditorAction.run();
		return null;
	}

	private List<IResource> retrieveJsonFiles(List<Object> list) {
		List<IResource> jsonFiles = new ArrayList<IResource>();
		for (Object object : list) {
			if (object instanceof DataBag) {
				DataBag dataBag = (DataBag) object;
				jsonFiles.add(dataBag.getResource());
			} else {
				DataBagItem dataBagItem = (DataBagItem) object;
				jsonFiles.add(dataBagItem.getJsonResource());
			}
		}
		return jsonFiles;
	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		MultiPageStructuredJsonEditor activeStructureJsonEditor = openEditorAction
				.getActiveStructureJsonEditor();
		if (activeStructureJsonEditor != null) {
			final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor(
					activeStructureJsonEditor);
			final IResourceDelta delta = event.getDelta();
			boolean visited = visitor.visit(delta);
			if (visited) {
//				StructuredJsonEditorInput editorInput = (StructuredJsonEditorInput) activeStructureJsonEditor.getEditorInput();
//				MyWorkspaceJob job = new MyWorkspaceJob(editorInput);
//				job.setRule(editorInput.getParentFolder().getProject());
//				job.schedule();
			}
		}
	}
}
