/**
 *
 */
package org.limepepper.chefclipse.preferences.ui.dialogs;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.validator.UrlValidator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferencePageContainer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.preferences.ui.Activator;
import org.limepepper.chefclipse.preferences.ui.preferences.AddChefConfigurationPreferencePage;
import org.limepepper.chefclipse.preferences.ui.preferences.ChefConfigurationPreferenceStore;
import org.limepepper.chefclipse.preferences.ui.preferences.PreferenceConstants;
import org.limepepper.chefclipse.utility.Config;

import chefclipse.ui.messages.Messages;

/**
 * Dialog which allow to create and add a new Chef configuration or edit an
 * existing one.
 *
 * @author Sebastian Sampaoli
 *
 */
public class AddChefConfigurationPreferenceContainer extends TitleAreaDialog
		implements IPreferencePageContainer {

	private static final String VALIDATION_CLIENT_NAME_DEFAULT_VALUE = "#{ENV['validation_client_name']}"; //$NON-NLS-1$
	private static final int TEST_BUTTON_ID = 34;
	private PreferenceStore preferenceStore;
	private boolean addMode;
	private AddChefConfigurationPreferencePage preferencePage;
	private boolean valid;
	private UrlValidator urlValidator;

	public AddChefConfigurationPreferenceContainer(Shell parentShell,
			KnifeConfig knifeConfig, boolean addMode) {
		super(parentShell);
		this.preferenceStore = createChefConfigurationStore(knifeConfig);
		this.addMode = addMode;
		urlValidator = new UrlValidator();
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
		if (chef_server_url == null
				|| chef_server_url.toExternalForm().equals(
						AddChefConfigurationPreferencePage.URL_INVALID_PREFIX)) {
			preferenceStore.setValue(PreferenceConstants.P_CHEF_SERVER_URL,
					AddChefConfigurationPreferencePage.URL_PREFIX);
		} else {
			preferenceStore.setValue(PreferenceConstants.P_CHEF_SERVER_URL,
					chef_server_url.toExternalForm());
		}
		String node_name = knifeConfig.getNode_name();
		preferenceStore.setValue(PreferenceConstants.P_NODE_NAME,
				node_name != null ? node_name
						: AddChefConfigurationPreferencePage.DEFAULT_VALUE);
		File client_key = knifeConfig.getClient_key();
		preferenceStore.setValue(PreferenceConstants.P_CLIENT_KEY,
				client_key != null ? client_key.getAbsolutePath()
						: AddChefConfigurationPreferencePage.DEFAULT_VALUE);
		File cookbook_path = knifeConfig.getCookbook_path();
		preferenceStore.setValue(PreferenceConstants.P_COOKBOOK_PATH,
				cookbook_path != null ? cookbook_path.getAbsolutePath()
						: AddChefConfigurationPreferencePage.DEFAULT_VALUE);
		String validation_client_name = knifeConfig.getValidation_client_name();
		preferenceStore.setValue(PreferenceConstants.P_VALIDATION_CLIENT_NAME,
				validation_client_name != null ? validation_client_name
						: VALIDATION_CLIENT_NAME_DEFAULT_VALUE);
		File validation_key = knifeConfig.getValidation_key();
		preferenceStore.setValue(PreferenceConstants.P_VALIDATION_KEY,
				validation_key != null ? validation_key.getAbsolutePath()
						: AddChefConfigurationPreferencePage.DEFAULT_VALUE);
		return preferenceStore;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite parentComposite = (Composite) super.createDialogArea(parent);

		if (addMode) {
			setTitle(Messages.AddChefConfigurationPreferencePage_AddConfigTitle);
			setMessage(Messages.AddChefConfigurationPreferencePage_AddConfigDesc);
		} else {
			setTitle(Messages.AddChefConfigurationPreferencePage_editConfigTitle);
			setMessage(Messages.AddChefConfigurationPreferencePage_editConfigDesc);
		}

		Composite composite = new Composite(parentComposite, SWT.NONE);
		GridLayoutFactory.swtDefaults().equalWidth(false).numColumns(1)
				.applyTo(composite);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL)
				.applyTo(composite);

		preferencePage = new AddChefConfigurationPreferencePage(preferenceStore);
		preferencePage.setMessage(this.getMessage());
		preferencePage.setContainer(this);
		preferencePage.createControl(composite);

		return composite;
	}

	/**
	 * Create a knife config based on the preference store's content.
	 *
	 * @return
	 */
	public Config getCreatedChefConfig() {
		KnifeConfig createdKnifeConfig = KnifeFactory.eINSTANCE
				.createKnifeConfig();
		String stringURL = preferenceStore
				.getString(PreferenceConstants.P_CHEF_SERVER_URL);
		try {
			createdKnifeConfig.setChef_server_url(new URL(stringURL));
		} catch (MalformedURLException e) {

		}
		;

		createdKnifeConfig.setNode_name(preferenceStore
				.getString(PreferenceConstants.P_NODE_NAME));

		String clientPath = preferenceStore
				.getString(PreferenceConstants.P_CLIENT_KEY);
		createdKnifeConfig.setClient_key(getFileOrNull(clientPath));

		String cookbookPath = preferenceStore
				.getString(PreferenceConstants.P_COOKBOOK_PATH);
		createdKnifeConfig.setCookbook_path(getFileOrNull(cookbookPath));

		createdKnifeConfig.setValidation_client_name(preferenceStore
				.getString(PreferenceConstants.P_VALIDATION_CLIENT_NAME));

		String validationKey = preferenceStore
				.getString(PreferenceConstants.P_VALIDATION_KEY);
		createdKnifeConfig.setValidation_key(getFileOrNull(validationKey));

		IEclipsePreferences workspacePreferences = ConfigurationScope.INSTANCE
				.getNode(Activator.PLUGIN_ID);
		String cookbookCopyright = workspacePreferences.get(
				PreferenceConstants.P_COOKBOOK_COPYRIGHT, "");
		createdKnifeConfig.setCookbook_copyright(cookbookCopyright);

		String cookbookEmail = workspacePreferences.get(
				PreferenceConstants.P_COOKBOOK_EMAIL, "");
		createdKnifeConfig.setCookbook_email(cookbookEmail);

		String cookbookLicense = workspacePreferences.get(
				PreferenceConstants.P_COOKBOOK_LICENSE, "");
		createdKnifeConfig.setCookbook_license(cookbookLicense);

		String cacheType = workspacePreferences.get(
				PreferenceConstants.P_CACHE_TYPE, "");
		createdKnifeConfig.setCache_type(cacheType);

		String cacheOptions = workspacePreferences.get(
				PreferenceConstants.P_CACHE_OPTIONS, "");
		createdKnifeConfig.setCache_option(cacheOptions);

		// TODO there is a lack of the attribute below in the model (add it?)...
		// String sslVerifyMode =
		// workspacePreferences.get(PreferenceConstants.P_SSL_VERIFY_MODE, "");
		// createdKnifeConfig.set

		return createdKnifeConfig;
	}

	/**
	 * Returns a {@link File} if path is non empty, otherwise it returns null.
	 *
	 * @param path
	 *            Path to file, can be null or empty
	 * @return a {@link File} or null
	 */
	private File getFileOrNull(String path) {
		if (path != null && !"".equals(path)) //$NON-NLS-1$
			return new File(path);
		return null;
	}

	@Override
	protected Control createButtonBar(Composite parent) {
		Control bar = super.createButtonBar(parent);
		return bar;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButton(parent, TEST_BUTTON_ID, "Test Connection", false); //$NON-NLS-1$
		super.createButtonsForButtonBar(parent);

		updateButtons();
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
		if (preferencePage.isValid()) {
			preferencePage.performOk();
			super.okPressed();
		}
	}

	/**
	 * Test Connection to Chef-Server returned by
	 * {@link #getCreatedChefConfig()}. Shows test result in an informational or
	 * error dialog.
	 */
	public void testConnection() {
		IProgressService progressService = PlatformUI.getWorkbench()
				.getProgressService();
		preferencePage.performOk();
		final Config knifeConfig = getCreatedChefConfig();
		if (knifeConfig == null) {
			return;
		}
		try {
			progressService.busyCursorWhile(new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					monitor.beginTask(
							Messages.AddChefConfigurationPreferencePage_TestingConnection,
							IProgressMonitor.UNKNOWN);

					if (hasKey(knifeConfig)) {
						ChefServerApi server = KnifeConfigController.INSTANCE
								.getServer((KnifeConfig) knifeConfig);

						try {
							final String info = server.getServerInfo();

							showTestConnectionResult(
									Messages.AddChefConfigurationPreferencePage_ConnectionSuccessful,
									Messages.AddChefConfigurationPreferencePage_TestingConnectionMsg
											+ info, MessageDialog.INFORMATION);
						} catch (final Exception e) {
							showTestConnectionResult(
									Messages.AddChefConfigurationPreferencePage_ConnectionError,
									Messages.AddChefConfigurationPreferencePage_ConnectionErrorMsj1
											+ e + "\n", MessageDialog.ERROR); //$NON-NLS-1$
						}
					} else {
						showTestConnectionResult(
								Messages.AddChefConfigurationPreferencePage_ConnectionError,
								Messages.AddChefConfigurationPreferencePage_ConnectionErrorMsj2,
								MessageDialog.ERROR);
					}
					monitor.done();
				}
			});
		} catch (InvocationTargetException e) {
		} catch (InterruptedException e) {
		}
	}

	/**
	 * Show an information or error dialog with the given title and message on
	 * the UI thread.
	 *
	 * @param dlgTitle
	 *            The title of the dialog
	 * @param msg
	 *            the dialog message
	 * @param type
	 *            the dialog type from {@link MessageDialog}
	 */
	private void showTestConnectionResult(final String dlgTitle,
			final String msg, final int type) {
		getShell().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.open(type, getShell(), dlgTitle, msg, SWT.NONE);
			}
		});
	}

	private boolean hasKey(Config knifeConfig) {
		File client_key = knifeConfig.getClient_key();
		return (client_key != null && client_key.exists() && client_key
				.canRead());
	}

	@Override
	public IPreferenceStore getPreferenceStore() {
		return preferenceStore;
	}

	@Override
	public void updateButtons() {
		if (getButton(IDialogConstants.OK_ID) != null) {
			getButton(IDialogConstants.OK_ID).setEnabled(
					preferencePage.isValid());
		}
		if (getButton(TEST_BUTTON_ID) != null) {
			getButton(TEST_BUTTON_ID).setEnabled(preferencePage.isValid());
		}
	}

	@Override
	public void updateMessage() {
		if (preferencePage != null) {
			String pageMessage = preferencePage.getMessage();
			String pageErrorMessage = preferencePage.getErrorMessage();
			if (preferencePage.isValid() && pageErrorMessage == null) {
				setMessage(pageMessage);
				setErrorMessage(null);
			} else {
				setErrorMessage(pageErrorMessage);
			}
			if (!preferencePage.isValid() && getErrorMessage() == null) {
				String errorMessage = getUrlErrorMessage();
				setErrorMessage(errorMessage);
			}
			updateButtons();
		}
	}

	private String getUrlErrorMessage() {
		String urlValue = preferencePage.getURLText();
		if (urlValue.isEmpty()) {
			return Messages.AddChefConfigurationPreferencePage_EmptyURL;
		} else if (urlValue
				.equals(AddChefConfigurationPreferencePage.URL_PREFIX)) {
			return Messages.AddChefConfigurationPreferencePage_ValidURL;
		}
		if (!urlValidator.isValid(urlValue)) {
			return Messages.AddChefConfigurationPreferencePage_ValidURL;
		}
		return null;
	}

	@Override
	public void updateTitle() {

	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

}