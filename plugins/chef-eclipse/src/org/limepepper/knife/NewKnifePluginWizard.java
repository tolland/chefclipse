package org.limepepper.knife;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;

public class NewKnifePluginWizard extends Wizard implements INewWizard {
	private WizardNewFileCreationPage _pageOne;
	private IWorkbench _workbench;
	private IStructuredSelection _selection;

	public NewKnifePluginWizard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		_workbench = workbench;
		_selection = selection;

	}

	@Override
	public boolean performFinish() {
	    boolean result = false;

	    IFile file = _pageOne.createNewFile();
	    result = file != null;

	    if (result) {
	        try {
	            IDE.openEditor(_workbench.getActiveWorkbenchWindow().getActivePage(), file);
	        } catch (PartInitException e) {
	            e.printStackTrace();
	        }
	    } // else no file created...result == false

	    return result;
	}

	@Override
	public void addPages() {
		//
		super.addPages();

		_pageOne = new WizardKnifeNewFileCreationPage(_selection);
		
		  addPage(_pageOne);
	}

}
