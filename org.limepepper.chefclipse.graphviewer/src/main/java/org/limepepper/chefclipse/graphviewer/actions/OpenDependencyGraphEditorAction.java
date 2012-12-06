package org.limepepper.chefclipse.graphviewer.actions;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.limepepper.chefclipse.graphviewer.ui.DependencyGraphEditor;
import org.limepepper.chefclipse.graphviewer.ui.DependencyGraphEditorInput;

public class OpenDependencyGraphEditorAction implements IObjectActionDelegate {

    // private Shell shell;
    private IWorkbenchPart targetPart;

    /**
     * Constructor for Action1.
     */
    public OpenDependencyGraphEditorAction() {
        super();
    }

    /**
     * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
     */
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
        // shell = targetPart.getSite().getShell();
        this.targetPart = targetPart;
    }

    /**
     * @see IActionDelegate#run(IAction)
     */
    public void run(IAction action) {
        try {

            // PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(GraphView.ID);
            IStructuredSelection selection = (IStructuredSelection) targetPart
                    .getSite().getWorkbenchWindow().getSelectionService()
                    .getSelection();
            if (selection == null) {
                return;
            }
            Object firstElement = selection.getFirstElement();
            if (firstElement instanceof IAdaptable) {
                IProject project = (IProject) ((IAdaptable) firstElement)
                        .getAdapter(IProject.class);
                targetPart
                        .getSite()
                        .getWorkbenchWindow()
                        .getActivePage()
                        .openEditor(
                                new DependencyGraphEditorInput(
                                        project
                                        ),
                                DependencyGraphEditor.ID);
            }
        } catch (PartInitException e) {
            e.printStackTrace();
        }
    }

    /**
     * @see IActionDelegate#selectionChanged(IAction, ISelection)
     */
    public void selectionChanged(IAction action, ISelection selection) {
    }

}