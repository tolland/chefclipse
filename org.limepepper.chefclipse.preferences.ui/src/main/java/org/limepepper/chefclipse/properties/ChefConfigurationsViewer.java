/**
 * 
 */
package org.limepepper.chefclipse.properties;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import chefclipse.ui.ChefPlugin;

import chefclipse.ui.messages.Messages;

/**
 * A composite that displays installed Chef Config's in a table. Chef Configs
 * can be added, removed, edited, and searched for.
 * <p>
 * This block implements ISelectionProvider - it sends selection change events
 * when the checked Chef Config in the table changes, or when the "use default"
 * button check state changes.
 * </p>
 * 
 * @author Guillermo Zunino
 */
public class ChefConfigurationsViewer implements ISelectionProvider {

	/**
	 * Chef Configs being displayed
	 */
	private List<Object> configs = new ArrayList<Object>();

	/**
	 * The main list control
	 */
	private CheckboxTableViewer configViewer;

	/**
	 * Selection listeners
	 */
	private ListenerList selectionListeners = new ListenerList();

	/**
	 * Previous selection
	 */
	private ISelection prevChecked = new StructuredSelection();
	private ISelection prevSelected = new StructuredSelection();

	private Table table;

	/**
	 * Content provider to show a list of Chef Configs
	 */
	class ConfigContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object input) {
			return configs.toArray();
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}
	}

	/**
	 * Label provider for installed Chef Configs table.
	 */
	class ConfigLabelProvider extends LabelProvider implements
			ITableLabelProvider {

		/**
		 * @see ITableLabelProvider#getColumnText(Object, int)
		 */
		public String getColumnText(Object element, int columnIndex) {
			if (element instanceof Config) {
				Config config = (Config) element;
				switch (columnIndex) {
				case 0:
					return config.getNode_name();
				case 1:
					URL chef_server_url = config.getChef_server_url();
					if (chef_server_url != null) {
						return chef_server_url.toExternalForm();
					} else {
						return "";
					}
				}
			}
			return element.toString();
		}

		/**
		 * @see ITableLabelProvider#getColumnImage(Object, int)
		 */
		public Image getColumnImage(Object element, int columnIndex) {
			if (columnIndex == 0) {
				return ChefPlugin
						.getImageDescriptor("icons/chefserver.png").createImage(); //$NON-NLS-1$
			}
			return null;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ISelectionProvider#addSelectionChangedListener
	 * (org.eclipse.jface.viewers.ISelectionChangedListener)
	 */
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionListeners.add(listener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ISelectionProvider#getSelection()
	 */
	public ISelection getSelection() {
		return configViewer.getSelection();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ISelectionProvider#removeSelectionChangedListener
	 * (org.eclipse.jface.viewers.ISelectionChangedListener)
	 */
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		selectionListeners.remove(listener);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.viewers.ISelectionProvider#setSelection(org.eclipse
	 * .jface.viewers.ISelection)
	 */
	public void setSelection(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			if (!selection.equals(prevSelected)) {
				prevSelected = selection;
				configViewer.setSelection(prevSelected);
				fireSelectionChanged();
			}
		}
	}

	/**
	 * Creates this block's control in the given control.
	 * 
	 * @param ancestor
	 *            containing control
	 * @param useManageButton
	 *            whether to present a single 'manage...' button to the user
	 *            that opens the installed Chef Configs pref page for Chef
	 *            Config management, or to provide 'add, remove, edit, and
	 *            search' buttons.
	 */
	public void createControl(Composite ancestor) {
		Font font = ancestor.getFont();
		// Composite parent= SWTFactory.createComposite(ancestor, font, 2, 1,
		// GridData.FILL_BOTH);
		// fControl = parent;

		Composite parent = ancestor;

		// SWTFactory.createLabel(parent, JREMessages.InstalledJREsBlock_15, 2);

		table = new Table(parent, SWT.CHECK | SWT.BORDER | SWT.MULTI
				| SWT.FULL_SELECTION);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 250;
		gd.widthHint = 350;
		table.setLayoutData(gd);
		table.setFont(font);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumn column = new TableColumn(table, SWT.NULL);
		column.setText(Messages.ChefConfigurationsViewer_ColumnNodeName);
		column.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// sortByName();
			}
		});
		int defaultwidth = 350 / 2 + 1;
		column.setWidth(defaultwidth);

		column = new TableColumn(table, SWT.NULL);
		column.setText(Messages.ChefConfigurationsViewer_ColumnServerUrl);
		column.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// sortByLocation();
			}
		});
		column.setWidth(defaultwidth);

		configViewer = new CheckboxTableViewer(table);
		configViewer.setLabelProvider(new ConfigLabelProvider());
		configViewer.setContentProvider(new ConfigContentProvider());
		// by default, sort by name
		// sortByName();

		// configViewer.addSelectionChangedListener(new
		// ISelectionChangedListener() {
		// public void selectionChanged(SelectionChangedEvent evt) {
		// enableButtons();
		// }
		// });

		configViewer.addCheckStateListener(new ICheckStateListener() {
			public void checkStateChanged(CheckStateChangedEvent event) {
				if (event.getChecked()) {
					setCheckedConfig((Config) event.getElement());
				} else {
					setSelectedConfig(null);
				}
			}
		});

		configViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						setSelection(event.getSelection());
					}
				});

		// configViewer.addDoubleClickListener(new IDoubleClickListener() {
		// public void doubleClick(DoubleClickEvent e) {
		// if (!configViewer.getSelection().isEmpty()) {
		// editVM();
		// }
		// }
		// });
		// fTable.addKeyListener(new KeyAdapter() {
		// @Override
		// public void keyPressed(KeyEvent event) {
		// if (event.character == SWT.DEL && event.stateMask == 0) {
		// if (fRemoveButton.isEnabled()){
		// removeVMs();
		// }
		// }
		// }
		// });

		// Composite buttons = SWTFactory.createComposite(parent, font, 1, 1,
		// GridData.VERTICAL_ALIGN_BEGINNING, 0, 0);
		//
		// fAddButton = SWTFactory.createPushButton(buttons,
		// JREMessages.InstalledJREsBlock_3, null);
		// fAddButton.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event evt) {
		// addVM();
		// }
		// });
		//
		// fEditButton= SWTFactory.createPushButton(buttons,
		// JREMessages.InstalledJREsBlock_4, null);
		// fEditButton.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event evt) {
		// editVM();
		// }
		// });
		//
		// fCopyButton = SWTFactory.createPushButton(buttons,
		// JREMessages.InstalledJREsBlock_16, null);
		// fCopyButton.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event evt) {
		// copyVM();
		// }
		// });
		//
		// fRemoveButton= SWTFactory.createPushButton(buttons,
		// JREMessages.InstalledJREsBlock_5, null);
		// fRemoveButton.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event evt) {
		// removeVMs();
		// }
		// });
		//
		// SWTFactory.createVerticalSpacer(parent, 1);
		//
		// fSearchButton = SWTFactory.createPushButton(buttons,
		// JREMessages.InstalledJREsBlock_6, null);
		// fSearchButton.addListener(SWT.Selection, new Listener() {
		// public void handleEvent(Event evt) {
		// search();
		// }
		// });

		// fillWithWorkspaceJREs();
		// enableButtons();
		// fAddButton.setEnabled(JavaRuntime.getVMInstallTypes().length > 0);
	}

	/**
	 * Returns this block's control
	 * 
	 * @return control
	 */
	public Control getControl() {
		return table;
	}

	/**
	 * Sets the checked Chef Config, possible <code>null</code>
	 * 
	 * @param config
	 *            Chef Config or <code>null</code>
	 */
	public void setCheckedConfig(Config config) {
		if (config == null) {
			setSelectedConfig(new StructuredSelection());
		} else {
			setSelectedConfig(new StructuredSelection(config));
		}
	}

	private void setSelectedConfig(StructuredSelection selection) {
		if (selection instanceof IStructuredSelection) {
			if (!selection.equals(prevChecked)) {
				prevChecked = selection;
				Object config = ((IStructuredSelection) selection)
						.getFirstElement();
				if (config == null) {
					configViewer.setCheckedElements(new Object[0]);
				} else {
					configViewer.setCheckedElements(new Object[] { config });
					configViewer.reveal(config);
				}
				fireSelectionChanged();
			}
		}
	}

	/**
	 * Returns the checked Chef Config or <code>null</code> if none.
	 * 
	 * @return the checked Chef Config or <code>null</code> if none
	 */
	public Config getCheckedConfig() {
		Object[] objects = configViewer.getCheckedElements();
		if (objects.length == 0) {
			return null;
		}
		return (Config) objects[0];
	}

	/**
	 * Sets the Chef Configs to be displayed in this block
	 * 
	 * @param chefs
	 *            Chef Configs to be displayed
	 */
	public void setChefConfigs(Config[] chefs) {
		configs.clear();
		for (int i = 0; i < chefs.length; i++) {
			configs.add(chefs[i]);
		}
		configViewer.setInput(configs);
		configViewer.refresh();
	}

	/**
	 * Returns the Chef Configs currently being displayed in this block
	 * 
	 * @return Chef Configs currently being displayed in this block
	 */
	public Config[] getChefConfigs() {
		return configs.toArray(new Config[configs.size()]);
	}

	/**
	 * Fire current selection
	 */
	private void fireSelectionChanged() {
		SelectionChangedEvent event = new SelectionChangedEvent(this,
				getSelection());
		Object[] listeners = selectionListeners.getListeners();
		for (int i = 0; i < listeners.length; i++) {
			ISelectionChangedListener listener = (ISelectionChangedListener) listeners[i];
			listener.selectionChanged(event);
		}
	}

	/**
	 * Persist table settings into the give dialog store, prefixed with the
	 * given key.
	 * 
	 * @param settings
	 *            dialog store
	 * @param qualifier
	 *            key qualifier
	 */
	public void saveColumnSettings(IDialogSettings settings, String qualifier) {
		int columnCount = table.getColumnCount();
		for (int i = 0; i < columnCount; i++) {
			settings.put(
					qualifier + ".columnWidth" + i, table.getColumn(i).getWidth()); //$NON-NLS-1$
		}
		//		settings.put(qualifier + ".sortColumn", fSortColumn); //$NON-NLS-1$
	}

	/**
	 * Restore table settings from the given dialog store using the given key.
	 * 
	 * @param settings
	 *            dialog settings store
	 * @param qualifier
	 *            key to restore settings from
	 */
	public void restoreColumnSettings(IDialogSettings settings, String qualifier) {
		configViewer.getTable().layout(true);
		restoreColumnWidths(settings, qualifier);
		// try {
		//			fSortColumn = settings.getInt(qualifier + ".sortColumn"); //$NON-NLS-1$
		// } catch (NumberFormatException e) {
		// fSortColumn = 1;
		// }
		// switch (fSortColumn) {
		// case 1:
		// sortByName();
		// break;
		// case 2:
		// sortByLocation();
		// break;
		// case 3:
		// sortByType();
		// break;
		// }
	}

	/**
	 * Restores the column widths from dialog settings
	 * 
	 * @param settings
	 * @param qualifier
	 */
	private void restoreColumnWidths(IDialogSettings settings, String qualifier) {
		int columnCount = table.getColumnCount();
		for (int i = 0; i < columnCount; i++) {
			int width = -1;
			try {
				width = settings.getInt(qualifier + ".columnWidth" + i); //$NON-NLS-1$
			} catch (NumberFormatException e) {
			}

			if ((width <= 0) || (i == table.getColumnCount() - 1)) {
				table.getColumn(i).pack();
			} else {
				table.getColumn(i).setWidth(width);
			}
		}
	}

	public int getItemCount() {
		return configViewer.getTable().getItemCount();
	}

	public void addDoubleClickListener(IDoubleClickListener iDoubleClickListener) {
		configViewer.addDoubleClickListener(iDoubleClickListener);
	}

	public void add(Config config) {
		configs.add(config);
		setChefConfigs(getChefConfigs());
		setSelection(new StructuredSelection(config));
	}

	public void replace(Config config, Config editedConfig) {
		int index = configs.indexOf(config);
		configs.remove(index);
		configs.add(index, editedConfig);
	}

	/**
	 * Remove a chef config.
	 * 
	 * @param config
	 */
	public void remove(Config config) {
		configs.remove(config);
	}

	public void refresh() {
		configViewer.refresh();
	}

	/**
	 * Remove a list of selected Chef's configs.
	 * 
	 * @param chefConfigs
	 */
	public void removeChefConfigs(Config[] chefConfigs) {
		IStructuredSelection prev = (IStructuredSelection) getSelection();
		for (int i = 0; i < chefConfigs.length; i++) {
			remove((Config) chefConfigs[i]);
		}
		refresh();
		IStructuredSelection curr = (IStructuredSelection) getSelection();
		if (!curr.equals(prev)) {
			Config[] installs = getChefConfigs();
			if (curr.size() == 0 && installs.length == 1) {
				// pick a default VM automatically
				setSelection(new StructuredSelection(installs[0]));
			} else {
				fireSelectionChanged();
			}
		}
	}

	public Config clone(KnifeConfig config) {
		KnifeConfig clonedConfig = KnifeFactory.eINSTANCE.createKnifeConfig();
		URL chef_server_url = config.getChef_server_url();
		try {
			clonedConfig.setChef_server_url(chef_server_url != null ? new URL(
					chef_server_url.toExternalForm()) : null);
		} catch (MalformedURLException e) {

		}
		clonedConfig.setNode_name(config.getNode_name());
		File cookbook_path = config.getCookbook_path();
		clonedConfig.setCookbook_path(cookbook_path != null ? new File(
				cookbook_path.getAbsolutePath()) : null);
		clonedConfig.setCookbook_copyright(config.getCookbook_copyright());
		clonedConfig.setCookbook_email(config.getCookbook_email());
		clonedConfig.setCookbook_license(config.getCookbook_license());
		File client_key = config.getClient_key();
		clonedConfig.setClient_key(client_key != null ? new File(client_key
				.getAbsolutePath()) : null);
		clonedConfig.setValidation_client_name(config
				.getValidation_client_name());
		File validation_key = config.getValidation_key();
		clonedConfig.setValidation_key(validation_key != null ? new File(
				validation_key.getAbsolutePath()) : null);

		clonedConfig.setCache_option(config.getCache_option());
		clonedConfig.setCache_type(config.getCache_type());
		clonedConfig.setLog_level(config.getLog_level());
		File path = config.getPath();
		clonedConfig.setPath(path != null ? new File(path.getAbsolutePath())
				: null);
		clonedConfig.setVersion(config.getVersion());
		clonedConfig.setServer(config.getServer());

		return clonedConfig;
	}

	/**
	 * Compares the given name against current names and adds the appropriate
	 * numerical suffix to ensure that it is unique.
	 * 
	 * @param name
	 *            the name with which to ensure uniqueness
	 * @return the unique version of the given name
	 * @since 3.2
	 */
	public String generateName(String name) {
		if (!isDuplicateName(name)) {
			return name;
		}
		if (name.matches(".*\\(\\d*\\)")) { //$NON-NLS-1$
			int start = name.lastIndexOf('(');
			int end = name.lastIndexOf(')');
			String stringInt = name.substring(start + 1, end);
			int numericValue = Integer.parseInt(stringInt);
			String newName = name.substring(0, start + 1) + (numericValue + 1)
					+ ")"; //$NON-NLS-1$
			return generateName(newName);
		}
		return generateName(name + " (1)"); //$NON-NLS-1$
	}

	/**
	 * @see IAddVMDialogRequestor#isDuplicateName(String)
	 */
	public boolean isDuplicateName(String name) {
		for (int i = 0; i < configs.size(); i++) {
			Config config = (Config) configs.get(i);
			if (config.getNode_name().equals(name)) {
				return true;
			}
		}
		return false;
	}
}
