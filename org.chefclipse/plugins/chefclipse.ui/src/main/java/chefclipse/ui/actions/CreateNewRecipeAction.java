/**
 *
 */

package chefclipse.ui.actions;

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

import chefclipse.core.builders.ChefProjectNature;
import chefclipse.ui.ChefUI;
import chefclipse.ui.wizards.NewRecipeWizard;

/**
 * Action to open the Data Bag editor.
 *
 * @author Sebastian Sampaoli
 */
public class CreateNewRecipeAction extends Action {

	private ISelectionProvider selectionProvider;
	private EObject eObject;
	private IWorkbenchPage page;

	public CreateNewRecipeAction(IWorkbenchPage page,
			ISelectionProvider selectionProvider) {
		this.selectionProvider = selectionProvider;
		this.page = page;
		initAction();
	}

	/**
	 * Initializes for the constructor.
	 */
	private void initAction() {
		setText("Recipe");
		// setImageDescriptor(DatabagEditorActivator.getDefault().getImageRegistry()
		// .getDescriptor(DatabagEditorActivator.DATA_BAG_EDITOR));
		setToolTipText("Create a new recipe");
		setId("new.recipe.action");
		// PlatformUI.getWorkbench().getHelpSystem().setHelp(this,
		// IIDEHelpContextIds.CREATE_FOLDER_ACTION);
	}

	@Override
	public boolean isEnabled() {
		ISelection sel = selectionProvider.getSelection();
		if (!sel.isEmpty()) {
			IStructuredSelection selection = (IStructuredSelection) sel;
			if (selection.size() == 1
					&& selection.getFirstElement() instanceof IResource) {
				IResource resource = (IResource) selection.getFirstElement();
				IProject project = resource.getProject();
				if (project.isOpen()) {
					try {
						IProjectNature nature = project
								.getNature(ChefProjectNature.NATURE_ID);
						return (nature != null);
					} catch (CoreException e) {
						ChefUI.getDefault()
								.getLog()
								.log(new Status(Status.ERROR, ChefUI.PLUGIN_ID,
										Status.ERROR, e.getMessage(), e));
						e.printStackTrace();
					}
				}
			}
		}
		return false;
	}

	@Override
	public void run() {
		IStructuredSelection selection = (IStructuredSelection) selectionProvider
				.getSelection();
		IResource chefResource = (IResource) selection.getFirstElement();
		IProject chefProject = chefResource.getProject();
		// IResource findMember = chefProject.getFolder(chefResource.getName());
		NewRecipeWizard wizard = new NewRecipeWizard(null);
		WizardDialog dialog = new WizardDialog(page.getActivePart().getSite()
				.getShell(), wizard);
		dialog.create();
		dialog.open();
	}

	public EObject geteObject() {
		return eObject;
	}

	public void seteObject(EObject eObject) {
		this.eObject = eObject;
	}
}
