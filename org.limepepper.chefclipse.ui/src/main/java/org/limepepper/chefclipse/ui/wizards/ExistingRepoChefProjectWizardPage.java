package org.limepepper.chefclipse.ui.wizards;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.internal.ide.dialogs.ProjectContentsLocationArea;

import chefclipse.ui.Messages;

public class ExistingRepoChefProjectWizardPage extends WizardPage {

	private Text locationText;
	private ChefConfigSelectionWizardPage chefConfigPage;

	private ProjectContentsLocationArea locationArea;

	protected ExistingRepoChefProjectWizardPage() {
		super("ExistingRepoNewChefWizardPage1"); //$NON-NLS-1$
		setTitle(Messages.ChefRepositoryWizardPage_AddChefRepo);
		setDescription(Messages.ChefRepositoryWizardPage_ChefRepo);
		chefConfigPage = new ChefConfigSelectionWizardPage(getWizard());
	}

	public IProject getProjectHandle() {
		return ResourcesPlugin.getWorkspace().getRoot()
				.getProject(getProjectName());
	}

	private String getProjectNameFieldValue() {
		if (projectNameField == null) {
			return ""; //$NON-NLS-1$
		}

		return projectNameField.getText().trim();
	}

	// widgets
	Text projectNameField;

	public String getProjectName() {
		if (locationText != null) {
			String buf = locationText.getText();
			int lastIndex = buf.lastIndexOf(File.pathSeparator);
			if (lastIndex != -1) {
				return buf.substring(lastIndex + 1, buf.length());
			}
			return "not found";
		}

		return getProjectNameFieldValue();
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;

		Label label = new Label(container, SWT.NULL);
		label.setText("&Repository location:");

		locationText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		locationText.setLayoutData(gd);
		locationText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleLocationBrowse();
			}
		});

		dialogChanged();
		setControl(container);

	}

	private void dialogChanged() {
		if (getLocationPath().length() == 0) {
			updateStatus(Messages.ChefRepositoryWizardPage_LocationRequired);
			return;
		}

		updateStatus(null);
	}

	private void handleLocationBrowse() {
		DirectoryDialog dialog = new DirectoryDialog(getShell());
		dialog.setText(Messages.ChefRepositoryWizardPage_SelectLocation);
		String path = dialog.open();
		if (path != null) {
			locationText.setText(path);
		}
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getLocationPath() {
		return locationText.getText();
	}

	@Override
	public IWizardPage getNextPage() {
		WizardNewProjectCreationPage chefProjectPage = (WizardNewProjectCreationPage) getWizard()
				.getPage("ExistingRepoNewChefWizardPage1");
		IProject adaptableItem = chefProjectPage.getProjectHandle();
		chefConfigPage.setElement(adaptableItem);
		if (((Wizard) getWizard()).getPage(chefConfigPage.getName()) == null) {
			((Wizard) getWizard()).addPage(chefConfigPage);
		}
		return chefConfigPage;
	}

}
