package org.limepepper.chefclipse.remotepicker.repositories;

import java.util.List;

import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.PreferenceChangeEvent;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.resource.JFaceColors;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.limepepper.chefclipse.utility.Config;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.preferences.api.ChefConfigManager;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import chefclipse.ui.messages.Messages;
import org.limepepper.chefclipse.ui.properties.ChefConfigurationPropertyPage;
import org.limepepper.chefclipse.ui.properties.ChefConfigurationsViewer;

/**
 * Implements {@link ICookbooksRepository.Builder} to provide a dialog to select a Chef Server Configuration.
 *
 * @author Guillermo Zunino
 */
public class ChefServerCookbookRepositoryConfig implements ICookbooksRepository.Builder<KnifeConfig> {

	@Override
	public ICookbooksRepository createRepository(KnifeConfig parameter) {
		return new ChefServerCookbookRepository(parameter);
	}

	@Override
	public KnifeConfig configure(RemoteRepository repo) {
		KnifeConfig server = null;
		Shell shell = Display.getCurrent().getActiveShell();
		ChefConfigDialog dialog = new ChefConfigDialog(shell);
		dialog.create();
		if (dialog.open() == Window.OK && dialog.getChefServer() != null) {
			server = dialog.getChefServer();
			repo.setName(repo.getName() + " (" + server.getNode_name() + ")");
			repo.setDescription("Install cookbooks from a Chef Server \n"+ "Configured for server: " + server.getNode_name() + " (" + server.getChef_server_url() + ")");
			repo.setUri(server.getChef_server_url().toExternalForm());
		}
		return server;
	}

	/**
	 * Dialog wrapping ChefConfigurationsViewer.
	 *
	 * @author Guillermo Zunino
	 */
	class ChefConfigDialog extends TitleAreaDialog implements IPreferenceChangeListener {
		private KnifeConfig server;
		private ChefConfigurationsViewer configsViewer;
		private Shell parentShell;

		public ChefConfigDialog(Shell parentShell) {
			super(parentShell);
			this.parentShell = parentShell;
			setShellStyle(SWT.CLOSE | SWT.TITLE | SWT.BORDER | SWT.OK);
		}

		@Override
		protected Point getInitialSize() {
			return new Point(480, 380);
		}

		@Override
		public void create() {
			super.create();
			setTitle("Select a Chef Server Configuration");
			setMessage("Select a Chef Server configuration to use as cookbook repository. Follow link to wokspace settings to edit chef servers.",
					IMessageProvider.INFORMATION);
			getButton(IDialogConstants.OK_ID).setEnabled(false);
		}

		@Override
		protected void configureShell(Shell newShell) {
			super.configureShell(newShell);
			newShell.setText("Select a Chef Server Configuration");
		}

		@Override
		protected Control createDialogArea(Composite parent) {
			Font font = parent.getFont();

			Composite composite = new Composite(parent, SWT.NONE);
			composite.setLayout(new GridLayout());
			composite.setLayoutData(new GridData(GridData.FILL_BOTH));
			composite.setFont(font);

			createHeader(composite);

			configsViewer = new ChefConfigurationsViewer();
			configsViewer.createControl(composite);
			Control control = configsViewer.getControl();
			GridData data = new GridData(GridData.FILL_BOTH);
			data.horizontalSpan = 1;
			control.setLayoutData(data);

			configsViewer.addSelectionChangedListener(new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					Config current = configsViewer.getCheckedConfig();
					if (current == null) {
						getButton(IDialogConstants.OK_ID).setEnabled(false);
						setErrorMessage(Messages.ChefConfigurationPropertyPage_No_Selection);
					} else {
						getButton(IDialogConstants.OK_ID).setEnabled(true);
						setErrorMessage(null);
					}
				}
			});

			ChefConfigManager.instance().getPreferences().addPreferenceChangeListener(this);
			loadChefServerConfigs();

			return parent;
		}

		@Override
		public void preferenceChange(PreferenceChangeEvent event) {
			loadChefServerConfigs();
		}

		@Override
		public boolean close() {
			boolean ret = super.close();
	    	ChefConfigManager.instance().getPreferences().removePreferenceChangeListener(this);
	    	return ret;
		}

		/**
		 * Load workspace chef configuration on viewer and select default or saved configuration.
		 */
		private void loadChefServerConfigs() {
			List<KnifeConfig> configs = getChefServerConfigs();

			configsViewer.setChefConfigs(configs.toArray(new KnifeConfig[0]));
		}

		/**
		 * Gets Chef-server configuration from workspace preferences.
		 * @return List of configurations
		 */
		public List<KnifeConfig> getChefServerConfigs() {
			return ChefConfigManager.instance().retrieveChefConfigurations();
		}

		/**
		 * Create description label and workspace settings link.
		 * @param parent {@link Composite}
		 * @return the created composite to host label and link
		 */
		protected Composite createHeader(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			composite.setFont(parent.getFont());
			GridLayout layout = new GridLayout();
			layout.marginHeight = 0;
			layout.marginWidth = 0;
			layout.numColumns = 2;
			composite.setLayout(layout);
			composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

			Label description = createDescriptionLabel(composite);
			GridDataFactory.fillDefaults().grab(true, false).applyTo(description);

			Hyperlink configurationHyperlink = new Hyperlink(composite, SWT.NONE);
			configurationHyperlink.setUnderlined(true);
			configurationHyperlink.setText(Messages.ChefConfigurationPropertyPage_CONFIGURE_WORKSPACE);
			configurationHyperlink.setForeground(JFaceColors.getHyperlinkText(getShell().getDisplay()));
			configurationHyperlink.addHyperlinkListener(new HyperlinkAdapter() {
				@Override
				public void linkActivated(HyperlinkEvent e) {
					final PreferenceDialog dlg = PreferencesUtil.createPreferenceDialogOn(getShell(),
							ChefConfigurationPropertyPage.CHEF_CONFIG_PREFERENCE_ID, null, null);
					if (parentShell == dlg.getShell()) {
						close();
					}
					dlg.open();
				}
			});

			return composite;
		}

		protected Label createDescriptionLabel(Composite parent) {
	        Label result = null;
            result = new Label(parent, SWT.WRAP);
            result.setFont(parent.getFont());
	        return result;
	    }

		@Override
		protected void okPressed() {
			server = (KnifeConfig) configsViewer.getCheckedConfig();
			super.okPressed();
		}

		public KnifeConfig getChefServer() {
			return server;
		}
	}

}
