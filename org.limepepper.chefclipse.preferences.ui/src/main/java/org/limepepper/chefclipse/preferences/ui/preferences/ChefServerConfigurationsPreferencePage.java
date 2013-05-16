/**
 *
 */
package org.limepepper.chefclipse.preferences.ui.preferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.preferences.api.ChefConfigManager;
import org.limepepper.chefclipse.preferences.ui.actions.SearchKnifeConfigAction;
import org.limepepper.chefclipse.preferences.ui.dialogs.AddChefConfigurationPreferenceContainer;
import org.limepepper.chefclipse.preferences.ui.utils.SWTFactory;
import org.limepepper.chefclipse.ui.properties.ChefConfigurationsViewer;
import org.limepepper.chefclipse.utility.Config;

import chefclipse.ui.ChefPlugin;
import chefclipse.ui.messages.Messages;

/**
 * Preference page which allow to add, remove, or edit Chef server configurations.
 *
 * @author Sebastian Sampaoli
 */

public class ChefServerConfigurationsPreferencePage extends PreferencePage implements IWorkbenchPreferencePage{

	private static final String PREFERENCE_PAGE = ChefPlugin.PLUGIN_ID + ".chef_configs_preference_page"; //$NON-NLS-1$
	private ChefConfigurationsViewer chefConfigurationsViewer;
	private Button editButton;
	private Button addButton;
	private Button removeButton;
	private Button duplicateButton;
    private Button searchButton;
	/**
	 *
	 */
	public ChefServerConfigurationsPreferencePage() {
		super(Messages.ChefConfigurationPreferencePage_Title);
	}

	@Override
	public void init(IWorkbench workbench) {

	}

	@Override
	protected Control createContents(Composite ancestor) {
		Font font = ancestor.getFont();

		initializeDialogUnits(ancestor);

		noDefaultAndApplyButton();

		GridLayoutFactory.fillDefaults().numColumns(2).applyTo(ancestor);

		SWTFactory.createWrapLabel(ancestor, Messages.ChefConfigurationPreferencePage_Desc, 1, 300);
		SWTFactory.createVerticalSpacer(ancestor, 1);

		chefConfigurationsViewer = new ChefConfigurationsViewer();
		chefConfigurationsViewer.createControl(ancestor);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(chefConfigurationsViewer.getControl());

		chefConfigurationsViewer.restoreColumnSettings(ChefPlugin.getDefault().getDialogSettings(), PREFERENCE_PAGE);

		chefConfigurationsViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent e) {
				if (!chefConfigurationsViewer.getSelection().isEmpty()) {
					editChefConfig();
				}
			}
		});

		Composite buttons = SWTFactory.createComposite(ancestor, font, 1, 1,
				GridData.VERTICAL_ALIGN_BEGINNING, 0, 0);
		GridDataFactory.fillDefaults().span(1, 1).applyTo(buttons);

		addButton = SWTFactory.createPushButton(buttons,
				Messages.ChefConfigurationPreferencePage_AddButton, null);
		addButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				addChefConfig();
			}
		});

		editButton = SWTFactory.createPushButton(buttons,
				Messages.ChefConfigurationPreferencePage_EditButton, null);
		editButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				editChefConfig();
			}
		});

		duplicateButton = SWTFactory.createPushButton(buttons,
				Messages.ChefConfigurationPreferencePage_DuplicateButton, null);
		duplicateButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				duplicateChefConfig();
			}
		});

		removeButton = SWTFactory.createPushButton(buttons,
				Messages.ChefConfigurationPreferencePage_RemoveButton, null);
		removeButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				removeChefConfigs();
			}
		});

        searchButton = SWTFactory.createPushButton(buttons,
                Messages.ChefConfigurationPreferencePage_SearchButton, null);
        searchButton.addListener(SWT.Selection, new Listener() {
            public void handleEvent(Event evt) {
                search();
            }
        });

//		SWTFactory.createVerticalSpacer(parent, 1);

		PlatformUI.getWorkbench().getHelpSystem().setHelp(ancestor, PREFERENCE_PAGE);
		chefConfigurationsViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				chefConfigurationsViewer.setSelection(event.getSelection());
				enableButtons();
				Config installed = getCurrentDefaultConfig();
				if (installed == null) {
					setValid(false);
					setErrorMessage(Messages.ChefConfigurationPreferencePage_SelectDefault);
				} else {
					setValid(true);
					setErrorMessage(null);
				}
			}
		});
		chefConfigurationsViewer.setChefConfigs(getChefServerConfigs());
		setDefaultConfig();

		applyDialogFont(ancestor);
		enableButtons();
		return ancestor;
	}

	private void setDefaultConfig() {

		KnifeConfig defaultChefConfiguration = ChefConfigManager.instance().retrieveDefaultChefConfig();
		if (defaultChefConfiguration != null) {
			Config[] chefConfigs = chefConfigurationsViewer.getChefConfigs();
			for (Config config : chefConfigs) {
				boolean equalsUrl = defaultChefConfiguration.getChef_server_url().toExternalForm().equals(config.getChef_server_url().toExternalForm());
				if (defaultChefConfiguration.getNode_name().equals(config.getNode_name()) && equalsUrl){
					chefConfigurationsViewer.setCheckedConfig(config);
					return;
				}
			}
		}
	}

	private Config getCurrentDefaultConfig() {
		return chefConfigurationsViewer.getCheckedConfig();
	}

	private KnifeConfig[] getChefServerConfigs(){
		List<KnifeConfig> chefConfigurations = ChefConfigManager.instance().retrieveChefConfigurations();
		if (chefConfigurations != null){
			return chefConfigurations.toArray(new KnifeConfig[0]);
		}
		return new KnifeConfig[]{};
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferencePage#performOk()
	 */
	@Override
	public boolean performOk() {
		BusyIndicator.showWhile(null, new Runnable() {
			public void run() {
				Config[] configs = chefConfigurationsViewer.getChefConfigs();
				List<Config> configsToSave = new ArrayList<Config>();
				configsToSave.addAll(Arrays.asList(configs));
				ChefConfigManager.instance().saveChefConfigs(configsToSave);
				ChefConfigManager.instance().saveDefaultChefConfig(getCurrentDefaultConfig());
			}
		});
		IDialogSettings settings = ChefPlugin.getDefault().getDialogSettings();
		chefConfigurationsViewer.saveColumnSettings(settings, PREFERENCE_PAGE);

		return super.performOk();
	}

	/**
	 * Enables the buttons based on selected items counts in the config's viewer
	 */
	private void enableButtons() {
		IStructuredSelection selection = (IStructuredSelection) chefConfigurationsViewer.getSelection();
		int selectionCount= selection.size();
		editButton.setEnabled(selectionCount == 1);
		duplicateButton.setEnabled(selectionCount == 1);
		if (selectionCount > 0 && selectionCount < chefConfigurationsViewer.getItemCount()) {
			removeButton.setEnabled(true);
		} else {
			removeButton.setEnabled(false);
		}
	}

	/**
	 * Bring up a wizard that lets the user create a new knife config.
	 */
	private void addChefConfig() {
		KnifeConfig knifeConfig = KnifeFactory.eINSTANCE.createKnifeConfig();

		AddChefConfigurationPreferenceContainer dialog = new AddChefConfigurationPreferenceContainer(this.getShell(), knifeConfig, true);
		if (dialog.open() == IDialogConstants.OK_ID) {
			Config config = dialog.getCreatedChefConfig();
			if (config != null) {
				chefConfigurationsViewer.add(config);
			}
		}
	}

	/**
	 * Performs the edit action when the Edit... button is pressed
	 */
	private void editChefConfig() {
		IStructuredSelection selection = (IStructuredSelection) chefConfigurationsViewer.getSelection();
		KnifeConfig config = (KnifeConfig) selection.getFirstElement();
		if (config == null) {
			return;
		}
		AddChefConfigurationPreferenceContainer dialog = new AddChefConfigurationPreferenceContainer(this.getShell(), config, false);
		if (dialog.open() == Window.OK) {
			Config editedConfig = dialog.getCreatedChefConfig();
			if (editedConfig != null) {
				// replace with the edited Config
				chefConfigurationsViewer.replace(config, editedConfig);
				chefConfigurationsViewer.refresh();
				chefConfigurationsViewer.setSelection(new StructuredSelection(editedConfig));
			}
		}
	}

	/**
	 * Performs the remove knife configs action when the Remove... button is pressed
	 */
	@SuppressWarnings("unchecked") //$NON-NLS-1$
	private void removeChefConfigs() {
		IStructuredSelection selection= (IStructuredSelection)chefConfigurationsViewer.getSelection();
		Config[] chefConfigs = new Config[selection.size()];
		Iterator<Config> iter = selection.iterator();
		int i = 0;
		while (iter.hasNext()) {
			chefConfigs[i] = iter.next();
			i++;
		}
		chefConfigurationsViewer.removeChefConfigs(chefConfigs);
	}

	/**
	 * Add a duplicate of the selected config to the table.
	 */
	private void duplicateChefConfig() {
		IStructuredSelection selection = (IStructuredSelection) chefConfigurationsViewer.getSelection();
		KnifeConfig config = (KnifeConfig) selection.getFirstElement();
		if (config == null) {
			return;
		}
		Config clonedConfig = chefConfigurationsViewer.clone(config);
		clonedConfig.setNode_name(chefConfigurationsViewer.generateName(clonedConfig.getNode_name()));

		AddChefConfigurationPreferenceContainer dialog = new AddChefConfigurationPreferenceContainer(this.getShell(), (KnifeConfig) clonedConfig, true);
		if (dialog.open() == Window.OK) {
			Config editedConfig = dialog.getCreatedChefConfig();
			if (editedConfig != null) {
				chefConfigurationsViewer.add(editedConfig);
			}
		}
	}

	/**
     * Search for Knife config files (.rb) and create a Knife config from the selected file.
     * The created config will be the default one.
     *
     */
	private void search() {
	    SearchKnifeConfigAction searchAction = new SearchKnifeConfigAction(getShell());
	    searchAction.run();
	    KnifeConfig generatedKnifeConfig = searchAction.getGeneratedKnifeConfig();
        if (generatedKnifeConfig != null) {
	        chefConfigurationsViewer.add(generatedKnifeConfig);
	        chefConfigurationsViewer.setCheckedConfig(generatedKnifeConfig);
	    }
    }

}
