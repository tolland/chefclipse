/**
 * 
 */
package org.limepepper.chefclipse.preferences.ui.dialogs;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.preference.IPreferencePageContainer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.preferences.ui.preferences.AddChefConfigurationPreferencePage;
import org.limepepper.chefclipse.preferences.ui.preferences.ChefConfigurationPreferenceStore;
import org.limepepper.chefclipse.preferences.ui.preferences.PreferenceConstants;

/**
 * Dialog which allow to create and add a new Chef configuration or edit an
 * existing one.
 * 
 * @author Sebastian Sampaoli
 *
 */
public class AddChefConfigurationPreferenceContainer extends TitleAreaDialog implements IPreferencePageContainer{

	private static final String DEFAULT_VALUE = "";
	private static final int TEST_BUTTON_ID = 34;
	private PreferenceStore preferenceStore;
	private boolean addMode;
	private AddChefConfigurationPreferencePage preferencePage;

	public AddChefConfigurationPreferenceContainer(Shell parentShell, KnifeConfig knifeConfig, boolean addMode) {
		super(parentShell);
		this.preferenceStore = createChefConfigurationStore(knifeConfig);
		this.addMode = addMode;
	}
	
	/**
	 * Create a dummy and temporary preference store.
	 * 
	 * @param knifeConfig
	 * @return
	 */
	private PreferenceStore createChefConfigurationStore(KnifeConfig knifeConfig) {
		PreferenceStore preferenceStore = new ChefConfigurationPreferenceStore();
		URL chef_server_url = knifeConfig.getChef_server_url();
		preferenceStore.setValue(PreferenceConstants.P_CHEF_SERVER_URL, chef_server_url != null ? chef_server_url.toExternalForm() : DEFAULT_VALUE);
		String node_name = knifeConfig.getNode_name();
		preferenceStore.setValue(PreferenceConstants.P_NODE_NAME, node_name != null ? node_name : DEFAULT_VALUE);
		File client_key = knifeConfig.getClient_key();
		preferenceStore.setValue(PreferenceConstants.P_CLIENT_KEY, client_key != null ? client_key.getAbsolutePath() : DEFAULT_VALUE);
		File cookbook_path = knifeConfig.getCookbook_path();
		preferenceStore.setValue(PreferenceConstants.P_COOKBOOK_PATH, cookbook_path != null ? cookbook_path.getAbsolutePath() : DEFAULT_VALUE);
		String validation_client_name = knifeConfig.getValidation_client_name();
		preferenceStore.setValue(PreferenceConstants.P_VALIDATION_CLIENT_NAME, validation_client_name != null ? validation_client_name : DEFAULT_VALUE);
		File validation_key = knifeConfig.getValidation_key();
		preferenceStore.setValue(PreferenceConstants.P_VALIDATION_KEY, validation_key != null ? validation_key.getAbsolutePath() : DEFAULT_VALUE);
		return preferenceStore;
	}

	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite parentComposite = (Composite) super.createDialogArea(parent);
		
		if (addMode){
			setTitle("Add Chef server configuration");
			setMessage("Add a new Chef server configuration to the existing list.");
		} else {
			setTitle("Edit Chef server configuration");
			setMessage("Edit the selected Chef server configuration.");
		}
				
		Composite composite = new Composite(parentComposite, SWT.NONE);
		GridLayoutFactory.swtDefaults().equalWidth(false).numColumns(1).applyTo(composite);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).applyTo(composite);

		preferencePage = new AddChefConfigurationPreferencePage(preferenceStore);
		preferencePage.setMessage(this.getMessage());
		preferencePage.setContainer(this);
		preferencePage.createControl(composite);
		
		return composite;
	}
	
	/**
	 * Create a knife config based on the preference store's content.
	 * @return
	 */
	public Config getCreatedChefConfig() {
		KnifeConfig createdKnifeConfig = KnifeFactory.eINSTANCE.createKnifeConfig();
		String stringURL = preferenceStore.getString(PreferenceConstants.P_CHEF_SERVER_URL);
		try {
			createdKnifeConfig.setChef_server_url(new URL(stringURL));
		} catch (MalformedURLException e) {
			boolean openQuestion = MessageDialog.openQuestion(getShell(), "Problem with URL", "The URL you have chosen is not correct. Do you want to continue anyway?");
			if (!openQuestion){
				return null;
			}
		};
		
		createdKnifeConfig.setNode_name(preferenceStore.getString(PreferenceConstants.P_NODE_NAME));
		
		String clientPath = preferenceStore.getString(PreferenceConstants.P_CLIENT_KEY);
		createdKnifeConfig.setClient_key(new File(clientPath));
		
		String cookbookPath = preferenceStore.getString(PreferenceConstants.P_COOKBOOK_PATH);
		createdKnifeConfig.setCookbook_path(new File(cookbookPath));
		
		createdKnifeConfig.setValidation_client_name(preferenceStore.getString(PreferenceConstants.P_VALIDATION_CLIENT_NAME));
		
		String validationKey = preferenceStore.getString(PreferenceConstants.P_VALIDATION_KEY);
		createdKnifeConfig.setValidation_key(new File(validationKey));
		
		return createdKnifeConfig;
	}

	@Override
	protected Control createButtonBar(Composite parent) {
		Control bar = super.createButtonBar(parent);
		return bar;
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButton(parent, TEST_BUTTON_ID,
				"Test Connection", false);
		super.createButtonsForButtonBar(parent);
	}
	
	@Override
	protected void buttonPressed(int buttonId) {
		super.buttonPressed(buttonId);
		
		if (buttonId == TEST_BUTTON_ID) {
			testConnection();
		}
	}
	
	@Override
	protected void okPressed() {
		if (preferencePage.isValid()){
			preferencePage.performOk();
			super.okPressed();
		}
	}

	/**
	 * Test Connection to Chef-Server returned by {@link #getCreatedChefConfig()}.
	 * Shows test result in an informational or error dialog.
	 */
	public void testConnection() {
		preferencePage.performOk();
		
		Config knifeConfig = getCreatedChefConfig();
		if (knifeConfig == null){
			return;
		}
		
		if (hasKey(knifeConfig)){
			ChefServerApi server = KnifeConfigController.INSTANCE.getServer((KnifeConfig) knifeConfig);
			
			try {
				String info = server.getServerInfo();
			
				MessageDialog.openInformation(getShell(), "Connection Succesfull", "Test connection to Chef-Server: OK\n\nServer Info:\n" + info);
			} catch (Exception e) {
				MessageDialog.openError(getShell(), "Connection Error", "Could not connect to Chef server. \n\nError message is:\n" + 
						e.getLocalizedMessage() + "\n" );
			}
		} else {
			MessageDialog.openError(getShell(), "Connection Error", "Could not connect to chef server. The client key doesn't exist or is invalid.");
		}
	}
	
	private boolean hasKey(Config knifeConfig) {
		File client_key = knifeConfig.getClient_key();
		return (client_key != null && client_key.exists() && client_key.canRead());
	}

	@Override
	public IPreferenceStore getPreferenceStore() {
		return preferenceStore;
	}

	@Override
	public void updateButtons() {
		if (getButton(IDialogConstants.OK_ID) != null) {
			getButton(IDialogConstants.OK_ID).setEnabled(preferencePage.isValid());
		}
	}

	@Override
	public void updateMessage() {
		if (preferencePage != null) {
			String pageMessage = preferencePage.getMessage();
			String pageErrorMessage = preferencePage.getErrorMessage();

			if (!preferencePage.isValid() && pageErrorMessage != null) {
				setErrorMessage(pageErrorMessage);
			} else if (preferencePage.isValid()) {
				setMessage(pageMessage);
				setErrorMessage(null);
			}	
			updateButtons();
	    }
	}

	@Override
	public void updateTitle() {
		
	}
	
}