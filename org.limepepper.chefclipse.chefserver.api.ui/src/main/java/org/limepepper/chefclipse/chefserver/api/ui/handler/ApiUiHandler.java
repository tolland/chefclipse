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
import org.limepepper.chefclipse.common.knife.KnifeConfig;
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

        System.err.println("execturing the handler");

        IWorkbenchWindow window = HandlerUtil
                .getActiveWorkbenchWindowChecked(event);

        IStructuredSelection selection = (IStructuredSelection) PlatformUI
                .getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        Object item = selection.getFirstElement();

        String name = event.getParameter("commandParameter1");

        if (name.equals("get.cookbooks")) {

            logger.info("made the call");

        } else if (name.equals("connect.chefserver")) {

            if(item instanceof KnifeConfig){



            }

        }

        return null;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isHandled() {
        return true;
    }

    @Override
    public void removeHandlerListener(IHandlerListener handlerListener) {
    }

}
