package org.limepepper.chefclipse.ui.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class NewchefclipseWizardPage1 extends WizardPage{

	protected NewchefclipseWizardPage1(String pageName) {
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
