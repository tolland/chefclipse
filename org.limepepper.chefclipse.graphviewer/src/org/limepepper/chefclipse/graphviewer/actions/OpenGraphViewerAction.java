package org.limepepper.chefclipse.graphviewer.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.limepepper.chefclipse.graphviewer.views.GraphView;


public class OpenGraphViewerAction implements IObjectActionDelegate {

	private Shell shell;
	private IWorkbenchPart targetPart;
	
	/**
	 * Constructor for Action1.
	 */
	public OpenGraphViewerAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		this.targetPart=targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			
			//PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(GraphView.ID);
			targetPart.getSite().getWorkbenchWindow().getActivePage().showView(GraphView.ID);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}