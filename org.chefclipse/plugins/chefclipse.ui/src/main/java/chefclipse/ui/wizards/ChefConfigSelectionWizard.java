package chefclipse.ui.wizards;

import org.eclipse.jface.wizard.Wizard;

public class ChefConfigSelectionWizard extends Wizard {

	protected ChefConfigSelectionWizardPage one;

	public ChefConfigSelectionWizard() {

		super();

		setNeedsProgressMonitor(true);

	}

	@Override
	public void addPages() {

		one = new ChefConfigSelectionWizardPage(this);
		addPage(one);

	}

	@Override
	public boolean performFinish() {

		// Print the result to the console

		System.out.println("performating finish on the chef config wizard");

		return true;

	}

}
