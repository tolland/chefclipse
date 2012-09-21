package org.limepepper.rcp.templateproject.ui.wizards;

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

import org.limepepper.rcp.templateproject.common.resources.TemplateResources;


public class NewModuleWizard extends Wizard implements INewWizard {
	private NewModuleWizardPage1 page1;
	private NewModuleWizardPageConfirm pageConfirm;
	private IStructuredSelection selection;


	public NewModuleWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	

	public void addPages() {
		page1 = new NewModuleWizardPage1("New Module Page 1");
		pageConfirm = new NewModuleWizardPageConfirm(selection);
		
		addPage(page1);
		addPage(pageConfirm);
	}

	
	public boolean performFinish() {
		final String moduleName = pageConfirm.getModuleName();
		final IProject container = pageConfirm.getContainerHandle(); 
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {					
					TemplateResources.createTemplateModule(moduleName, container , monitor);
					
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
			
	

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}