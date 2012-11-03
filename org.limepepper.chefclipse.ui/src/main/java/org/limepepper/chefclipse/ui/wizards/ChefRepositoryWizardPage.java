package org.limepepper.chefclipse.ui.wizards;

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
			updateStatus("Repository location must be specified");
			return;
		}
		
		updateStatus(null);
	}
	
	private void handleLocationBrowse() {
		DirectoryDialog dialog = new DirectoryDialog(getShell());
		dialog.setText("Select location of the local repository");
		String path = dialog.open();
		if(path != null){
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
}
