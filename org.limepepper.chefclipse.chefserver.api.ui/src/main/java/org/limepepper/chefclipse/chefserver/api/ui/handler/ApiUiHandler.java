package org.limepepper.chefclipse.chefserver.api.ui.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiUiHandler extends AbstractHandler implements IHandler {

    private Logger logger = LoggerFactory.getLogger(ApiUiHandler.class);

    @Override
    public void addHandlerListener(IHandlerListener handlerListener) {
    }

    @Override
    public void dispose() {
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

        IWorkbenchWindow window = HandlerUtil
                .getActiveWorkbenchWindowChecked(event);

        IStructuredSelection selection = (IStructuredSelection) PlatformUI
                .getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        Object item = selection.getFirstElement();

        String name = event.getParameter("commandParameter1");

        if (name.equals("get.cookbooks")) {

            logger.info("made the call");

        }

        return null;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public boolean isHandled() {
        return false;
    }

    @Override
    public void removeHandlerListener(IHandlerListener handlerListener) {
    }

}
