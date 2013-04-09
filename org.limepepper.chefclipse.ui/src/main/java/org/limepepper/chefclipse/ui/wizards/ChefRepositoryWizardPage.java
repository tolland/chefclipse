package org.limepepper.chefclipse.ui.wizards;

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
import org.limepepper.chefclipse.ui.Messages;

public class ChefRepositoryWizardPage extends WizardPage {
	
	private Text locationText;
    private ChefConfigSelectionWizardPage chefConfigPage;
	
	protected ChefRepositoryWizardPage() {
		super("ChefRepositoryWizardPage"); //$NON-NLS-1$
		setTitle(Messages.ChefRepositoryWizardPage_AddChefRepo);
		setDescription(Messages.ChefRepositoryWizardPage_ChefRepo);
        chefConfigPage = new ChefConfigSelectionWizardPage(getWizard());
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
		if(getLocationPath().length() == 0){
			updateStatus(Messages.ChefRepositoryWizardPage_LocationRequired);
			return;
		}
		
		updateStatus("is good!");
	}
	
	private void handleLocationBrowse() {
		DirectoryDialog dialog = new DirectoryDialog(getShell());
		dialog.setText(Messages.ChefRepositoryWizardPage_SelectLocation);
		String path = dialog.open();
		if(path != null){
			locationText.setText(path);
		}				
	}
	
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message != null);
		
	}
			
	public String getLocationPath() {
		return locationText.getText();
	}
	
	@Override
	public IWizardPage getNextPage() {
	    WizardNewProjectCreationPage chefProjectPage = (WizardNewProjectCreationPage) getWizard().getPage(ChefProjectWizardPage.CHEF_PROJECT_WIZARD_PAGE);
	    chefConfigPage.setElement(chefProjectPage.getProjectHandle());
	    if (((Wizard) getWizard()).getPage(chefConfigPage.getName()) == null) {
	        ((Wizard) getWizard()).addPage(chefConfigPage);
	    }
	    return chefConfigPage;
	}
}
