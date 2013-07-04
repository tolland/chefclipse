package chefclipse.ui.importWizards;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
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
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.limepepper.chefclipse.preferences.ui.utils.SWTFactory;

import chefclipse.ui.messages.Messages;
import chefclipse.ui.wizards.ChefConfigSelectionWizardPage;

public class NewProjectExistingChefRepoWizardPage extends WizardPage {

	private Text locationText;
	private Button searchButton;
	@SuppressWarnings("unused")
	private ChefConfigSelectionWizardPage chefConfigPage = new ChefConfigSelectionWizardPage(
			getWizard());

	/**
	 * @wbp.parser.constructor
	 */
	protected NewProjectExistingChefRepoWizardPage() {
		super("ExistingRepoNewChefWizardPage1"); //$NON-NLS-1$
		setTitle(Messages.ChefRepositoryWizardPage_AddChefRepo);
		setDescription(Messages.ChefRepositoryWizardPage_ChefRepo);
	}

	/**
	 * @wbp.parser.constructor
	 */
	public NewProjectExistingChefRepoWizardPage(String string) {
		super(string); //$NON-NLS-1$
		setTitle(Messages.ChefRepositoryWizardPage_AddChefRepo);
		setDescription(Messages.ChefRepositoryWizardPage_ChefRepo);
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
		container.setLayout(new GridLayout(3, false));

		Label label = new Label(container, SWT.NULL);
		label.setText("&Repository location:");

		locationText = new Text(container, SWT.BORDER | SWT.SINGLE);
		locationText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
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

		// Create a new label that will spam two columns
		label = new Label(container, SWT.BORDER);
		label.setText("Search for a local chef respository");
		// Create new layout data
		GridData data = new GridData(SWT.FILL, SWT.LEFT, true, false, 2, 1);
		label.setLayoutData(data);

/*		searchButton = SWTFactory.createPushButton(container,
				Messages.ChefConfigurationPreferencePage_SearchButton, null);
		searchButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 1, 1));
		searchButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				search();
			}
		});*/

		/*
		 * Label iconLabel = new Label(container, SWT.NONE);
		 *
		 * final Button checkbox; checkbox = new Button(container, SWT.CHECK |
		 * SWT.INHERIT_FORCE); checkbox.setSelection(false);
		 * checkbox.setText("Configure Server Settings for this Repository");
		 * //$NON-NLS-1$ // help UI tests checkbox.setData("connectorId",
		 * "test"); //$NON-NLS-1$
		 * GridDataFactory.swtDefaults().align(SWT.CENTER, SWT.CENTER)
		 * .applyTo(checkbox);
		 *
		 * checkbox.addSelectionListener(new SelectionListener() { public void
		 * widgetDefaultSelected(SelectionEvent e) { widgetSelected(e); }
		 *
		 * public void widgetSelected(SelectionEvent e) { boolean selected =
		 * checkbox.getSelection(); maybeModifySelection(selected); } });
		 */

		dialogChanged();
		setControl(container);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);

	}

	protected boolean maybeModifySelection(boolean selected) {
		if (selected) {
			((ImportRepositoryToProjectWizard) getWizard())
					.setDoChefConfigSelection(true);
			((ImportRepositoryToProjectWizard) getWizard())
					.addChefConfigPage(true);

		} else {
			((ImportRepositoryToProjectWizard) getWizard())
					.setDoChefConfigSelection(false);
			((ImportRepositoryToProjectWizard) getWizard())
					.addChefConfigPage(false);

		}
		return true;
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
			((ImportRepositoryToProjectWizard) getWizard())
					.setLocationPath(new Path(path));
		}
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getLocationPath() {
		return locationText.getText();
	}

	/**
	 * Search for chef-repo in local filesystem.
	 *
	 */
	private void search() {

		SearchChefReposAction searchAction = new SearchChefReposAction(
				getShell());
		searchAction.run();
	}

}
