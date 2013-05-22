/**
 * 
 */

package org.limepepper.chefclipse.databag.editor.actions;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.limepepper.chefclipse.common.ui.builder.ChefProjectNature;
import org.limepepper.chefclipse.databag.editor.Activator;
import org.limepepper.chefclipse.databag.editor.wizards.BasicNewDataBagWizard;

/**
 * Action to open the Data Bag editor.
 * 
 * @author Sebastian Sampaoli
 */
public class CreateNewDataBagAction extends Action {

    private ISelectionProvider selectionProvider;
    private EObject eObject;
    private IWorkbenchPage page;

    public CreateNewDataBagAction(IWorkbenchPage page, ISelectionProvider selectionProvider) {
        this.selectionProvider = selectionProvider;
        this.page = page;
        initAction();
    }

    /**
     * Initializes for the constructor.
     */
    private void initAction() {
        setText("Data Bag");
        setImageDescriptor(Activator.getDefault().getImageRegistry()
                .getDescriptor(Activator.DATA_BAG_EDITOR));
        setToolTipText("Create a new data bag");
        setId("new.databag.action");
        // PlatformUI.getWorkbench().getHelpSystem().setHelp(this,
        // IIDEHelpContextIds.CREATE_FOLDER_ACTION);
    }

    @Override
    public boolean isEnabled() {
        ISelection sel = selectionProvider.getSelection();
        if (!sel.isEmpty()) {
            IStructuredSelection selection = (IStructuredSelection) sel;
            if (selection.size() == 1 && selection.getFirstElement() instanceof IResource) {
                IResource resource = (IResource) selection.getFirstElement();
                IProject project = resource.getProject();
                if (project.isOpen()) {
                    try {
                        IProjectNature nature = project
                                .getNature(ChefProjectNature.NATURE_ID);
                        return (nature != null);
                    } catch (CoreException e) {
                        Activator
                                .getDefault()
                                .getLog()
                                .log(new Status(Status.ERROR, Activator.PLUGIN_ID, Status.ERROR, e
                                        .getMessage(), e));
                        e.printStackTrace();
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void run() {
        IStructuredSelection selection = (IStructuredSelection) selectionProvider.getSelection();
        IResource chefResource = (IResource) selection.getFirstElement();
        IProject chefProject = chefResource.getProject();
//        IResource findMember = chefProject.getFolder(chefResource.getName());
        BasicNewDataBagWizard wizard = new BasicNewDataBagWizard(chefProject);
        WizardDialog dialog = new WizardDialog(page.getActivePart().getSite().getShell(), wizard);
        dialog.create();
        dialog.open();
        // BasicNewFolderResourceWizard wizard = new
        // BasicNewFolderResourceWizard();
        // wizard.init(PlatformUI.getWorkbench(), getStructuredSelection());
        // wizard.setNeedsProgressMonitor(true);
        // WizardDialog dialog = new WizardDialog(shellProvider.getShell(),
        // wizard);
        // dialog.create();
        // dialog.getShell().setText(
        // IDEWorkbenchMessages.CreateFolderAction_title);
        // PlatformUI.getWorkbench().getHelpSystem().setHelp(dialog.getShell(),
        // IIDEHelpContextIds.NEW_FOLDER_WIZARD);
        // dialog.open();
        // if (eObject != null) {
        // try {
        // Map<String, JsonNode> nodesMap =
        // DataBagEditorManager.INSTANCE.retrieveNodes(eObject);
        // DataBagEditorInput input = new DataBagEditorInput(eObject, nodesMap);
        // page.openEditor(input, MultiPageDataBagEditor.ID);
        // } catch (PartInitException e) {
        // e.printStackTrace();
        // } catch (IOException e) {
        // // TODO log the exception and present some error dialog: some file
        // // could not be parsed.
        // MessageDialog.open(MessageDialog.ERROR,
        // page.getActivePart().getSite().getShell(),
        // "Error while trying to read JSON file", e.getMessage(), SWT.NONE);
        // e.printStackTrace();
        // }
        // }
    }

    public EObject geteObject() {
        return eObject;
    }

    public void seteObject(EObject eObject) {
        this.eObject = eObject;
    }
}
