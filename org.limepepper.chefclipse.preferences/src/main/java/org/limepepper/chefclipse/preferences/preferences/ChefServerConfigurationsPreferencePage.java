/**
 * 
 */
package org.limepepper.chefclipse.preferences.preferences;

import java.util.Iterator;

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
import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.preferences.dialogs.AddChefConfigurationDialog;
import org.limepepper.chefclipse.preferences.utils.SWTFactory;
import org.limepepper.chefclipse.ui.Activator;
import org.limepepper.chefclipse.ui.properties.ChefConfigurationsViewer;

/**
 * @author Sebastian Sampaoli
 *
 */
public class ChefServerConfigurationsPreferencePage extends PreferencePage implements IWorkbenchPreferencePage{

	private static final String PREFERENCE_PAGE = Activator.PLUGIN_ID + ".chef_configs_preference_page";;
//	public static final String ID = "org.limepepper.chefclipse.preferences.ChefServerConfigurationsPage";
	private ChefConfigurationsViewer chefConfigurationsViewer;
	private Button editButton;
	private Button addButton;
	private Button removeButton;
	/**
	 * 
	 */
	public ChefServerConfigurationsPreferencePage() {
		super("Chef Configurations Page");
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
		
		SWTFactory.createWrapLabel(ancestor, "Add, remove or edit Chef Configurations definitions.", 1, 300);
		SWTFactory.createVerticalSpacer(ancestor, 1);
		
		chefConfigurationsViewer = new ChefConfigurationsViewer();
		chefConfigurationsViewer.createControl(ancestor);
		GridDataFactory.fillDefaults().span(1, 1).applyTo(chefConfigurationsViewer.getControl());
		
		chefConfigurationsViewer.restoreColumnSettings(Activator.getDefault().getDialogSettings(), PREFERENCE_PAGE);
		
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
				"Add...", null);
		addButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				addChefConfig();
			}
		});

		editButton = SWTFactory.createPushButton(buttons,
				"Edit...", null);
		editButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				editChefConfig();
			}
		});

		removeButton = SWTFactory.createPushButton(buttons,
				"Remove", null);
		removeButton.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event evt) {
				removeChefConfigs();
			}
		});

//		SWTFactory.createVerticalSpacer(parent, 1);

//		fSearchButton = SWTFactory.createPushButton(buttons,
//				JREMessages.InstalledJREsBlock_6, null);
//		fSearchButton.addListener(SWT.Selection, new Listener() {
//			public void handleEvent(Event evt) {
//				search();
//			}
//		});
					
//		fCompliance = new Link(ancestor, SWT.NONE);
//		fCompliance.setText(JREMessages.JREsPreferencePage_14);
//		fCompliance.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
//		fCompliance.setVisible(false);
//		fCompliance.addSelectionListener(new SelectionListener() {
//			public void widgetDefaultSelected(SelectionEvent e) {}
//			public void widgetSelected(SelectionEvent e) {openCompliancePreferencePage();}
//		});
		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(ancestor, PREFERENCE_PAGE);		
		initDefaultChefConfig();
		chefConfigurationsViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				Config installed = getCurrentDefaultConfig();
				if (installed == null) {
					setValid(false);
					setErrorMessage("Select a default Chef configuration"); 
				} else {
					//if we change the VM make sure the compliance level supports 
					//generated class files
//					String compliance = getCurrentCompilerCompliance();
//					if(!supportsCurrentCompliance(installed, compliance)) {
//						setMessage(NLS.bind(JREMessages.JREsPreferencePage_0, new String[] {compliance}), IMessageProvider.WARNING);
//						fCompliance.setVisible(true);
//					}
//					else {
//						setMessage(null);
//						fCompliance.setVisible(false);
//					}
					setValid(true);
					setErrorMessage(null);
				}
			}
		});
		applyDialogFont(ancestor);
		enableButtons();
		return ancestor;
	}
	
	private Config getCurrentDefaultConfig() {
		return chefConfigurationsViewer.getCheckedConfig();
	}
	
	/**
	 * Initialize the default chef configuration.
	 * Find & verify the default VM.
	 */
	private void initDefaultChefConfig() {
//		IVMInstall realDefault= JavaRuntime.getDefaultVMInstall();
//		if (realDefault != null) {
//			IVMInstall[] vms= fJREBlock.getJREs();
//			for (int i = 0; i < vms.length; i++) {
//				IVMInstall fakeVM= vms[i];
//				if (fakeVM.equals(realDefault)) {
//					verifyDefaultVM(fakeVM);
//					break;
//				}
//			}
//		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.IPreferencePage#performOk()
	 */
	@Override
	public boolean performOk() {
		final boolean[] canceled = new boolean[] {false};
		BusyIndicator.showWhile(null, new Runnable() {
			public void run() {
				Config defaultVM = getCurrentDefaultConfig();
				Config[] configs = chefConfigurationsViewer.getChefConfigs();
//				JREsUpdater updater = new JREsUpdater();
//				if (!updater.updateJRESettings(configs, defaultVM)) {
//					canceled[0] = true;
//				}
			}
		});
		
		if(canceled[0]) {
			return false;
		}
		
		// save column widths
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
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
		if (selectionCount > 0 && selectionCount < chefConfigurationsViewer.getItemCount()) {
			removeButton.setEnabled(true);
		} else {
			removeButton.setEnabled(false);
		}
	}
	
	/**
	 * Bring up a wizard that lets the user create a new VM definition.
	 */
	private void addChefConfig() {
		AddChefConfigurationDialog dialog = new AddChefConfigurationDialog(this.getShell());
		if (dialog.open() == IDialogConstants.OK_ID) {
			Config config = dialog.getCreatedChefConfig();
			if (config != null) {
				chefConfigurationsViewer.add(config);
				chefConfigurationsViewer.refresh();
				chefConfigurationsViewer.setSelection(new StructuredSelection(config));
			}
		}
	}
	
	/**
	 * Performs the edit VM action when the Edit... button is pressed
	 */
	private void editChefConfig() {
		IStructuredSelection selection = (IStructuredSelection) chefConfigurationsViewer.getSelection();
		Config config = (Config) selection.getFirstElement();
		if (config == null) {
			return;
		}
		AddChefConfigurationDialog dialog = new AddChefConfigurationDialog(this.getShell());
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
	 * Performs the remove VM(s) action when the Remove... button is pressed
	 */
	@SuppressWarnings("unchecked")
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

}
