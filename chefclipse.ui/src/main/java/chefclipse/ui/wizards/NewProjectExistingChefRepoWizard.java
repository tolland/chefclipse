package chefclipse.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewProjectExistingChefRepoWizard extends Wizard implements
		INewWizard {

	
	private NewProjectExistingChefRepoWizardPage projectPage;
	
	public NewProjectExistingChefRepoWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	

	public void addPages() {								
		projectPage = new NewProjectExistingChefRepoWizardPage();
		
		
		addPage(projectPage);
	}
	
}
