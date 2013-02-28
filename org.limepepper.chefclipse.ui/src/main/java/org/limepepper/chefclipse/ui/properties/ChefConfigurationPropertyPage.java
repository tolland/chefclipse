package org.limepepper.chefclipse.ui.properties;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
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
import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.preferences.api.ChefConfigurationsManager;
import org.limepepper.chefclipse.ui.Activator;
import org.limepepper.chefclipse.ui.Messages;

/**
 * Project property page to select Chef-server configuration for chef project.
 * This property page is only enabled for project with chef nature.
 * 
 * @author Guillermo Zunino
 *
 */
public class ChefConfigurationPropertyPage extends PropertyPage {

	private static final String CHEF_CONFIG_PREFERENCE_ID = "org.limepepper.chefclipse.preferences.ui.preferences.ChefServerConfigurationsPreferencePage"; //$NON-NLS-1$
	private static final String PROPERTIES_PAGE = Activator.PLUGIN_ID + ".chef_config__properties_page"; //$NON-NLS-1$
	
	private IProject project;
	private boolean modified = false;
	private ChefConfigurationsViewer configsViewer;

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
		
		configsViewer.restoreColumnSettings(Activator.getDefault().getDialogSettings(), PROPERTIES_PAGE);

		configsViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				modified = true;
				if (event.getSelection().isEmpty()) {
					setValid(false);
					setErrorMessage(Messages.ChefConfigurationPropertyPage_No_Selection);
				} else {
					setValid(true);
					setErrorMessage(null);
				}
			}
		});
		return composite;
	}

	/**
	 * Create description label and workspace settings link.
	 * @param parent {@link Composite}
	 * @return the created composite to host label and link
	 */
	private Composite createHeader(Composite parent) {
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
				PreferenceDialog dlg = PreferencesUtil.createPreferenceDialogOn(getShell(),
						CHEF_CONFIG_PREFERENCE_ID, new String[] { CHEF_CONFIG_PREFERENCE_ID }, null);
				dlg.open();
			}
		});

		return composite;
	}

	/**
	 * Initialize dialog.
	 */
	private void initialize() {
		project = (IProject) getElement().getAdapter(IResource.class);
		setDescription(Messages.ChefConfigurationPropertyPage_Description);
	}
	
	/**
	 * Load workspace chef configuration on viewer and select default or saved configuration.
	 */
	private void loadChefServerConfigs() {
		List<KnifeConfig> configs = getChefServerConfigs();
		
		configsViewer.setChefConfigs(configs.toArray(new KnifeConfig[0]));
		
		Config knifeConfig = ChefConfigurationsManager.getManager().retrieveProjectChefConfiguration(project);
		configsViewer.setCheckedConfig(knifeConfig);
	}
	
	@Override
	public void setVisible(boolean visible) {
		if (visible && configsViewer != null)
			loadChefServerConfigs();
		super.setVisible(visible);
	}

	/**
	 * Gets the workspace wide default chef server configuration.
	 * @return the default {@link KnifeConfig}, can be null.
	 */
	public KnifeConfig getDefaultChefServerConfig() {
		return ChefConfigurationsManager.getManager().retrieveDefaultChefConfiguration();
	}

	/**
	 * Gets Chef-server configuration from workspace preferences.
	 * @return List of configurations
	 */
	public List<KnifeConfig> getChefServerConfigs() {
		return ChefConfigurationsManager.getManager().retrieveChefConfigurations();
	}

	protected void performDefaults() {
		super.performDefaults();
		configsViewer.setCheckedConfig(getDefaultChefServerConfig());
	}
	
	@Override
	public boolean performOk() {
		if (!modified) {
			return true;
		}
		savePreference(configsViewer.getCheckedConfig());
		
		// save column widths
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		configsViewer.saveColumnSettings(settings, PROPERTIES_PAGE);
		return super.performOk();
	}

	/**
	 * Save selected Chef-server configuration for this project.
	 * @param selected {@link KnifeConfig}
	 */
	private void savePreference(Config selected) {
		ChefConfigurationsManager.getManager().saveProjectChefConfiguration(this.project, selected);
	}

}