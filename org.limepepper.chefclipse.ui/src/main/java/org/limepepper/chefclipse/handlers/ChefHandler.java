package org.limepepper.chefclipse.handlers;

import org.eclipse.compare.CompareUI;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.team.internal.ui.TeamUIPlugin;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.ui.resources.ChefRepositoryManager;
import org.limepepper.chefclipse.compare.CookbookCompareInput;
import org.limepepper.chefclipse.compare.Utilities;
import org.limepepper.chefclipse.ui.Activator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 * 
 */

@SuppressWarnings("unused")
public class ChefHandler extends AbstractHandler implements
        IObjectActionDelegate {

    private Logger           logger              = LoggerFactory
                                                         .getLogger(ChefHandler.class);

    private Shell            shell;

    // Constants for determining the type of progress. Subclasses may
    // pass one of these values to the run method.
    public final static int  PROGRESS_DIALOG     = 1;
    public final static int  PROGRESS_BUSYCURSOR = 2;

    private IWorkbenchPart   targetPart;
    private IWorkbenchWindow window;

    /**
     * The constructor.
     * 
     */
    public ChefHandler() {
    }

    /**
     * the command has been executed, so extract extract the needed information
     * from the application context.
     * 
     */
    @Override
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        IWorkbenchWindow window = HandlerUtil
                .getActiveWorkbenchWindowChecked(event);

        IStructuredSelection selection = (IStructuredSelection) PlatformUI
                .getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        Object item = selection.getFirstElement();

        String name = event.getParameter("commandParameter1");

        if (name.equals("get.cookbooks")) {

            logger.error("need to make this call in the api.ui plugin");

        } else if (name.equals("refresh.workstation")) {
            // @todo is stupid to have this random IResource checking
            // would like gatekeeper all these checks.
            if (item instanceof IResource) {

                ChefRepositoryManager.INSTANCE
                        .resetRepository((IResource) item);

            }

        } else if (name.equals("open.knifeconfig")) {
            ChefRepositoryManager.INSTANCE
                    .readInKnifeConfigs(((IResource) item).getProject());

        } else if (name.equals("compare.cookbook")) {

            logger.error("made the call to the coompare cookbook");

            if (item instanceof CookbookFolder) {

                if (selection.size() == 1) {
                    Activator.log("is cookbook folder");
                    Utilities.compareWithServer((CookbookFolder) item);

                } else {
                    Activator.log("need on 1 selection to compare with server");
                }

            } else if (item instanceof IResource) {

                Activator.log("is resource");
                if (selection.size() == 2) {
                    logger.debug("selection size==2");

                    IResource sel1 = (IResource) selection.toArray()[0];
                    IResource sel2 = (IResource) selection.toArray()[1];

                    CompareUI.openCompareEditor(new CookbookCompareInput(sel1,
                            sel2));

                } else if (selection.size() == 1) {
                    logger.debug("comparing with server");

                    IResource sel1 = (IResource) selection.toArray()[0];

                    KnifeConfig knifeConfig = ChefConfigManager.instance()
                            .retrieveProjectChefConfig(sel1);
                }

            }

        }
        /*
         * EObject eObject = CookbookFactory.eINSTANCE
         * .create(CookbookPackage.eINSTANCE.getCookbookVersion());
         * 
         * Resource eResource = eObject.eResource();
         * URI eUri = eResource.getURI();
         * if (eUri.isPlatformResource()) {
         * String platformString = eUri.toPlatformString(true);
         * return ResourcesPlugin.getWorkspace().getRoot()
         * .findMember(platformString);
         * }
         */

        return null;
    }

    /**
     * Return the path that was active when the menu item was selected.
     * 
     * @return IWorkbenchPage
     */
    protected IWorkbenchPage getTargetPage() {
        if (getTargetPart() == null) {
            return TeamUIPlugin.getActivePage();
        }
        return getTargetPart().getSite().getPage();
    }

    /**
     * @return IWorkbenchPart
     */
    protected IWorkbenchPart getTargetPart() {
        if (targetPart == null) {
            IWorkbenchPage page = TeamUIPlugin.getActivePage();
            if (page != null) {
                targetPart = page.getActivePart();
            }
        }
        return targetPart;

    }

    @Override
    public void run(final IAction action) {
    }

    @Override
    public void selectionChanged(final IAction action, final ISelection selection) {
    }

    @Override
    public void setActivePart(final IAction action, final IWorkbenchPart targetPart) {
    }

}
