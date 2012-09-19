package org.limepepper.rcp.templateproject.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.IWorkbench;




public class NewProjectWizard extends Wizard implements INewWizard {
		
	private WizardNewProjectCreationPage projPage;	
	
	private NewProjectWizardEmptyPage emptyPage1;
	private NewProjectWizardEmptyPage emptyPage2;
	

	
	public NewProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	


	public void addPages() {		
		projPage = new WizardNewProjectCreationPage("New Template Project");
		projPage.setTitle("New Template Project");
		projPage.setDescription("");
		
		emptyPage1 = new NewProjectWizardEmptyPage("Empty Page 1");
		emptyPage2 = new NewProjectWizardEmptyPage("Empty Page 2");
								
		addPage(emptyPage1);
		addPage(emptyPage2);
		
		addPage(projPage);
	}


	public boolean performFinish() {				
		final IProject proj = projPage.getProjectHandle();		
		final IProjectDescription desc = 
				proj.getWorkspace().newProjectDescription(proj.getName());
		
		desc.setNatureIds(new String[]{"org.limepepper.rcp.templateproject.common.resources.ProjectNature"});
						
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					proj.create(desc, monitor);
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
			getContainer().run(true, false, op);
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