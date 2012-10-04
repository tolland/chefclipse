package org.limepepper.templateproject.ui.wizards;

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

import org.limepepper.templateproject.common.resources.TemplateResources;


public class NewProjectWizard extends Wizard implements INewWizard {
					
	private NewTemplateProjectWizardPage1 page1;
	private NewTemplateProjectWizardPage2 page2;
	private NewTemplateProjectWizardPageConfirm pageConfirm;

	
	public NewProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	


	public void addPages() {						
		page1 = new NewTemplateProjectWizardPage1("New Template Project Page 1");
		page2 = new NewTemplateProjectWizardPage2("Nwe Template Project Page 2");
		pageConfirm = new NewTemplateProjectWizardPageConfirm("New Template Project");
		
		addPage(page1);
		addPage(page2);		
		addPage(pageConfirm);
	}


	public boolean performFinish() {				
		final IProject proj = pageConfirm.getProjectHandle();		
								
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					TemplateResources.createTemplateProject(proj, monitor);
					
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