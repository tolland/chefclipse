package org.limepepper.chefclipse.graphviewer.actions;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.limepepper.chefclipse.graphviewer.ui.CookbookGraphEditor;
import org.limepepper.chefclipse.graphviewer.ui.CookbookGraphEditorInput;

public class OpenCookbookGraphEditorAction implements IObjectActionDelegate{

	//private Shell shell;
	private IWorkbenchPart targetPart;
		
	@Override
	public void run(IAction action) {
		try {
		//PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(GraphView.ID);
		IStructuredSelection selection = (IStructuredSelection)targetPart.getSite().getWorkbenchWindow().getSelectionService().getSelection();
		if(selection==null)
		{
			return;
		}
		Object firstElement = selection.getFirstElement();
        if (firstElement instanceof IAdaptable)
        {
        	IProject project = (IProject)((IAdaptable)firstElement).getAdapter(IProject.class);
        	 targetPart.getSite().getWorkbenchWindow().getActivePage().openEditor(new CookbookGraphEditorInput(project.getFullPath().toString()), CookbookGraphEditor.ID);
        }
	} catch (PartInitException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}


	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart=targetPart;
	}

}
