package org.limepepper.chefclipse.navigator;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class ChefRepositoryWizardPage extends WizardPage {

    private Text locationText;

    protected ChefRepositoryWizardPage() {
        super("ChefRepositoryWizardPage");
        setTitle("Add Chef Repository");
        setDescription("Chef Repository");
    }

    @Override
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 3;
        layout.verticalSpacing = 9;

        Text text = new Text(parent, SWT.NULL);
        text.setText("Install (and overwrite) the chef-repo-example project into your current workspace");

        dialogChanged();
        setControl(container);

    }

    private void dialogChanged() {

        updateStatus(null);
    }

    private void updateStatus(String message) {
        setErrorMessage(message);
        setPageComplete(message == null);
    }

}
