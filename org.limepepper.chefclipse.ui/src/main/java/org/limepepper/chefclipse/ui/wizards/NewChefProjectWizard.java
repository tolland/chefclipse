package org.limepepper.chefclipse.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import org.limepepper.chefclipse.common.ui.resources.ChefProjectManager;


public class NewChefProjectWizard extends Wizard implements INewWizard {
						
	private ChefProjectWizardPage projectPage;
	private ChefRepositoryWizardPage repoPage;
	
	public NewChefProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	

	public void addPages() {								
		projectPage = new ChefProjectWizardPage();
		repoPage = new ChefRepositoryWizardPage();
		
		addPage(projectPage);
		addPage(repoPage);
	}


	public boolean performFinish() {				
		final IProject proj = projectPage.getProjectHandle();		
		final String repoPath = repoPage.getLocationPath();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					ChefProjectManager.instance().createChefProject(proj, repoPath, monitor);
					
					if(!proj.isOpen()){
						proj.open(monitor);
					}
				} catch (CoreException e) {
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

	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {				
	}
		
}
