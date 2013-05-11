package org.limepepper.chefclipse.logger.ui.preferences;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.limepepper.chefclipse.logger.LoggerPlugin;
import org.limepepper.chefclipse.logger.PreferenceConstants;
import org.limepepper.chefclipse.logger.ui.Activator;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class LoggerPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public LoggerPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Chefclipse logging preferences");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {
		addField(new ComboFieldEditor(PreferenceConstants.P_LEVEL,
				"Logging level: ", new String[][] { { "All", "ALL" },
						{ "Trace", "TRACE" }, { "Debug", "DEBUG" },
						{ "Info", "INFO" }, { "Warn", "WARN" },
						{ "Error", "ERROR" }, { "Off", "OFF" } },
				getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.P_REMOTEHOST,
				"Remote host: ", getFieldEditorParent()));
		addField(new IntegerFieldEditor(PreferenceConstants.P_PORT, "Port: ",
				getFieldEditorParent()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

	@Override
	public boolean performOk() {
		boolean result = super.performOk();
		LoggerPlugin.getDefault().configureLoggers();
		return result;
	}

	@Override
	protected void performApply() {
		super.performApply();
		LoggerPlugin.getDefault().configureLoggers();
	}
	

	
}