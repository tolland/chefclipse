package org.limepepper.knife;

import java.net.URI;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.limepepper.jruby.GemProjectHelper;

public class NewKnifePluginProjectWizard extends Wizard implements INewWizard , IExecutableExtension {

	private WizardNewProjectCreationPage _pageOne;
//	private WizardNewFileCreationPage _pageTwo;
	private static final String PAGE_NAME = "Custom Plug-in Project Wizard"; //$NON-NLS-1$
	private static final String WIZARD_NAME = "New Custom Plug-in Project"; //$NON-NLS-1$
	private IConfigurationElement _configurationElement;
	private IWorkbench _workbench;
	private IStructuredSelection _selection;
	
	public NewKnifePluginProjectWizard() {
		setWindowTitle(WIZARD_NAME);

	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		_workbench = workbench;
		_selection = selection;

	}

	@Override
	public boolean performFinish() {
	    boolean result = false;
	    String name = _pageOne.getProjectName();
	    URI location = null;
	    if (!_pageOne.useDefaults()) {
	        location = _pageOne.getLocationURI();
	        System.err.println("location: " + location.toString()); //$NON-NLS-1$
	    } // else location == null

	    KnifeProjectSupport.createProject(name, location);
	    
	    
	    GemProjectHelper.SetupSimpleProject(name);
	    // Add this
	    

	    
	    
	    
	    BasicNewProjectResourceWizard.updatePerspective(_configurationElement);

	    return true;
	}

	@Override
	public void addPages() {
	    super.addPages();

	    _pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
	    _pageOne.setTitle("the wized ttle");
	    _pageOne.setDescription("this is a prject descrtopsoin");
	    

		//_pageTwo = new WizardKnifeNewFileCreationPage(_selection);

	    addPage(_pageOne);

	    //addPage(_pageTwo);

	}

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
	    _configurationElement = config;
	}
	
	
	
}
