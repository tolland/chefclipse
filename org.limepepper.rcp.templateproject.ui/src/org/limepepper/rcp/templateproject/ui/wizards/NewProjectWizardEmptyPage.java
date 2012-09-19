package org.limepepper.rcp.templateproject.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class NewProjectWizardEmptyPage extends WizardPage{

	protected NewProjectWizardEmptyPage(String pageName) {
		super(pageName);
		this.setTitle("New Template Project");
		this.setDescription(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NO_FOCUS);
		this.setControl(container);		
	}

}
