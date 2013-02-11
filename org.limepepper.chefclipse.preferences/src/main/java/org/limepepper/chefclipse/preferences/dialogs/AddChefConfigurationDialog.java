/**
 * 
 */
package org.limepepper.chefclipse.preferences.dialogs;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.ui.properties.ChefConfigurationPropertyPage;

/**
 * Dialog which allow to create and add a new Chef configuration.
 * 
 * @author Sebastian Sampaoli
 *
 */
public class AddChefConfigurationDialog extends TitleAreaDialog{

	private static final int TEST_BUTTON_ID = 34;

	public AddChefConfigurationDialog(Shell parentShell) {
		super(parentShell);
	}

	public Config getCreatedChefConfig() {
		// TODO remove this
		return ChefConfigurationPropertyPage.DEFAULT_CONFIG;
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

	/**
	 * Test Connection to Chef-Server returned by {@link #getCreatedChefConfig()}.
	 * Shows test result in an informational or error dialog.
	 */
	public void testConnection() {
		Config knifeConfig = getCreatedChefConfig();
		
		ChefServerApi server = KnifeConfigController.INSTANCE.getServer((KnifeConfig) knifeConfig);
		
		try {
			String info = server.getServerInfo();
		
			MessageDialog.openInformation(getShell(), "Connection Succesfull", "Test connection to Chef-Server: OK\n\nServer Info:\n" + info);
		} catch (Exception e) {
			MessageDialog.openError(getShell(), "Connection Error", "Could not connect to chef server. \n\nError message is:\n" + 
					e.getLocalizedMessage() + "\n" );
		}
	}

}
