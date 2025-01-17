package chefclipse.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;


public class NewProjectNewRepositoryWizard extends Wizard implements INewWizard {	
	private NewProjectNewRepositoryWizardPageConfirm pageConfirm;
	private IStructuredSelection selection;


	public NewProjectNewRepositoryWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	

	public void addPages() {		
		pageConfirm = new NewProjectNewRepositoryWizardPageConfirm(selection);				
		addPage(pageConfirm);
	}

	
	public boolean performFinish() {
		final String repoName = pageConfirm.getRepoName();
		final String location = pageConfirm.getLocationName();
		final IProject container = pageConfirm.getContainerHandle(); 
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {										
					//ChefRepositoryManagerImpl.instance().createChefRepository(repoName, location, container, monitor);															
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		
		
		try {
			this.getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
				
		return true;
	}
			
	

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}
