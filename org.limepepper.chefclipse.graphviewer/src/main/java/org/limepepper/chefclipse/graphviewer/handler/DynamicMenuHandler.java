package org.limepepper.chefclipse.graphviewer.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.limepepper.chefclipse.graphviewer.ui.CookbookGraphEditor;
import org.limepepper.chefclipse.graphviewer.ui.CookbookGraphEditorInput;
import org.limepepper.chefclipse.graphviewer.ui.DependencyGraphEditor;
import org.limepepper.chefclipse.graphviewer.ui.DependencyGraphEditorInput;

import chefclipse.core.CookbookFolder;

public class DynamicMenuHandler extends AbstractHandler {

    // @todo is it reasonable to initialize this and leave the value?
    IWorkbenchWindow workbench  = PlatformUI.getWorkbench()
                                        .getActiveWorkbenchWindow();

    static String    COMMAND_ID = "org.limepepper.chefclipse.graphviewer.popupContext";

    public DynamicMenuHandler() {
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

        String commandParameter = event.getParameter("commandParameter");

        System.err.println("processing dynamic handle");

        if (commandParameter == null)
            return null;
        // @todo throw new Exception("need paramter");

        try {

            IWorkbenchWindow window = HandlerUtil
                    .getActiveWorkbenchWindowChecked(event);
            IWorkbenchPage page = window.getActivePage();
            IStructuredSelection selection = (IStructuredSelection) PlatformUI
                    .getWorkbench().getActiveWorkbenchWindow()
                    .getSelectionService().getSelection();

            if (selection == null) {
                return null;
            }

            Object firstElement = selection.getFirstElement();
            if (firstElement instanceof IAdaptable) {
                IResource resource = (IResource) ((IAdaptable) firstElement)
                        .getAdapter(IResource.class);
                if (resource != null) {

                    if (commandParameter.equals("Dependency.Graph.Editor")) {

                        page.openEditor(
                                new DependencyGraphEditorInput(resource),
                                DependencyGraphEditor.ID);
                        return null;
                    } else if (commandParameter
                            .equals("Structure.Graph.Editor")) {

                        page.openEditor(new CookbookGraphEditorInput(resource),
                                CookbookGraphEditor.ID);
                        return null;
                    } else {

                        // @todo error catching
                    }
                }
            } else if (firstElement instanceof CookbookFolder) {
                IResource resource = (IResource) ((CookbookFolder) firstElement)
                        .getResource();
                if (resource != null) {

                    if (commandParameter.equals("Dependency.Graph.Editor")) {

                        page.openEditor(
                                new DependencyGraphEditorInput(resource),
                                DependencyGraphEditor.ID);
                        return null;
                    } else if (commandParameter
                            .equals("Structure.Graph.Editor")) {

                        page.openEditor(new CookbookGraphEditorInput(resource),
                                CookbookGraphEditor.ID);
                        return null;
                    } else {

                        // @todo error catching
                    }
                }
            }

        } catch (PartInitException e) {
            e.printStackTrace();
        }

        return null;
    }
}
