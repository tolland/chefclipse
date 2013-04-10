package org.limepepper.chefclipse.ui.wizards;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import chefclipse.ui.Messages;

public class ChefProjectWizardPage extends WizardNewProjectCreationPage{

	public static final String CHEF_PROJECT_WIZARD_PAGE = "ChefProjectWizardPage"; //$NON-NLS-1$

    public ChefProjectWizardPage() {
		super(CHEF_PROJECT_WIZARD_PAGE);
		setTitle(Messages.ChefProjectWizardPage_Title);
		setDescription(Messages.ChefProjectWizardPage_Description);
	}

}
