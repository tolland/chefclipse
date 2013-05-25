package org.limepepper.chefclipse.ui.properties;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.PreferenceChangeEvent;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.JFaceColors;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.preferences.api.ChefConfigManager;
import org.limepepper.chefclipse.utility.Config;

import chefclipse.ui.ChefPlugin;
import chefclipse.ui.messages.Messages;

/**
 * Project property page to select Chef-server configuration for chef project.
 * This property page is only enabled for project with chef nature.
 *
 * @author Guillermo Zunino
 *
 */
public class ChefConfigurationPropertyPage extends PropertyPage {

	public static final String CHEF_CONFIG_PREFERENCE_ID = "org.limepepper.chefclipse.preferences.ui.preferences.ChefServerConfigurationsPreferencePage"; //$NON-NLS-1$
	public static final String PROPERTIES_PAGE = ChefPlugin.PLUGIN_ID
			+ ".chef_config__properties_page"; //$NON-NLS-1$

	private IProject project;
	private boolean modified = false;
	protected ChefConfigurationsViewer configsViewer;

	/**
	 * Constructor for ChefConfigurationPropertyPage.
	 */
	public ChefConfigurationPropertyPage() {
		super();
	}

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
		Font font = parent.getFont();

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setFont(font);

		initialize();

		createHeader(composite);

		configsViewer = new ChefConfigurationsViewer();
		configsViewer.createControl(composite);
		Control control = configsViewer.getControl();
		GridData data = new GridData(GridData.FILL_BOTH);
		data.horizontalSpan = 1;
		control.setLayoutData(data);

		configsViewer.restoreColumnSettings(ChefPlugin.getDefault()
				.getDialogSettings(), PROPERTIES_PAGE);

		configsViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						setModified(true);
						Config current = configsViewer.getCheckedConfig();
						if (current == null) {
							setValid(false);
							setErrorMessage(Messages.ChefConfigurationPropertyPage_No_Selection);
						} else {
							setValid(true);
							setErrorMessage(null);
						}
					}
				});

		ChefConfigManager.instance().getPreferences()
				.addPreferenceChangeListener(new IPreferenceChangeListener() {

					@Override
					public void preferenceChange(PreferenceChangeEvent event) {
						loadChefServerConfigs();
					}
				});
		return composite;
	}

	/**
	 * Create description label and workspace settings link.
	 *
	 * @param parent
	 *            {@link Composite}
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
		composite
				.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		Label description = createDescriptionLabel(composite);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(description);

		Hyperlink configurationHyperlink = new Hyperlink(composite, SWT.NONE);
		configurationHyperlink.setUnderlined(true);
		configurationHyperlink
				.setText(Messages.ChefConfigurationPropertyPage_CONFIGURE_WORKSPACE);
		configurationHyperlink.setForeground(JFaceColors
				.getHyperlinkText(getShell().getDisplay()));
		configurationHyperlink.addHyperlinkListener(new HyperlinkAdapter() {
			@Override
			public void linkActivated(HyperlinkEvent e) {
				PreferenceDialog dlg = PreferencesUtil
						.createPreferenceDialogOn(getShell(),
								CHEF_CONFIG_PREFERENCE_ID,
								new String[] { CHEF_CONFIG_PREFERENCE_ID },
								null);
				dlg.open();
			}
		});

		return composite;
	}

	/**
	 * Initialize dialog.
	 */
	protected void initialize() {
		project = (IProject) getElement().getAdapter(IResource.class);
		setDescription(Messages.ChefConfigurationPropertyPage_Description);
	}

	/**
	 * Load workspace chef configuration on viewer and select default or saved
	 * configuration.
	 */
	private void loadChefServerConfigs() {
		List<KnifeConfig> configs = getChefServerConfigs();

		configsViewer.setChefConfigs(configs.toArray(new KnifeConfig[0]));

		setDefaultProjectConfig();
	}

	protected void setDefaultProjectConfig() {

		Config projectConfig = ChefConfigManager.instance()
				.retrieveProjectChefConfig(project);
		if (projectConfig != null) {
			Config[] chefConfigs = configsViewer.getChefConfigs();
			for (Config config : chefConfigs) {
				boolean equalsUrl = projectConfig.getChef_server_url()
						.toExternalForm()
						.equals(config.getChef_server_url().toExternalForm());
				if (projectConfig.getNode_name().equals(config.getNode_name())
						&& equalsUrl) {
					configsViewer.setCheckedConfig(config);
					return;
				}
			}
		}
	}

	@Override
	public void setVisible(boolean visible) {
		if (visible && configsViewer != null)
			loadChefServerConfigs();
		super.setVisible(visible);
	}

	/**
	 * Gets the workspace wide default chef server configuration.
	 *
	 * @return the default {@link KnifeConfig}, can be null.
	 */
	public KnifeConfig getDefaultChefServerConfig() {
		return ChefConfigManager.instance().retrieveDefaultChefConfig();
	}

	/**
	 * Gets Chef-server configuration from workspace preferences.
	 *
	 * @return List of configurations
	 */
	public List<KnifeConfig> getChefServerConfigs() {
		return ChefConfigManager.instance().retrieveChefConfigurations();
	}

	protected void performDefaults() {
		super.performDefaults();
		configsViewer.setCheckedConfig(getDefaultChefServerConfig());
	}

	@Override
	public boolean performOk() {
		if (!isModified()) {
			return true;
		}
		savePreference(configsViewer.getCheckedConfig());

		// save column widths
		IDialogSettings settings = ChefPlugin.getDefault().getDialogSettings();
		configsViewer.saveColumnSettings(settings, PROPERTIES_PAGE);
		return super.performOk();
	}

	/**
	 * Save selected Chef-server configuration for this project.
	 *
	 * @param selected
	 *            {@link KnifeConfig}
	 */
	private void savePreference(Config selected) {
		ChefConfigManager.instance().saveProjectChefConfig(this.project,
				selected);
	}

	public boolean isModified() {
		return modified;
	}

	public void setModified(boolean modified) {
		this.modified = modified;
	}

}