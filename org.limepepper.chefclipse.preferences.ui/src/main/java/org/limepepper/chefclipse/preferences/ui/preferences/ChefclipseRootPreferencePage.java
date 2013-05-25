package org.limepepper.chefclipse.preferences.ui.preferences;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.limepepper.chefclipse.preferences.ui.Activator;

import chefclipse.ui.messages.Messages;

/**
 * Chefclipse's root preference page.
 */

public class ChefclipseRootPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public ChefclipseRootPreferencePage() {
		super(GRID);
		setPreferenceStore(new ScopedPreferenceStore(ConfigurationScope.INSTANCE, Activator.PLUGIN_ID));
		setDescription(Messages.ChefclipseRootPreferencePage_Description);
	}

	@Override
	public void createFieldEditors() {
		StringFieldEditor cookbookCopyrightEditor = new StringFieldEditor(PreferenceConstants.P_COOKBOOK_COPYRIGHT, Messages.ChefclipseRootPreferencePage_CookbookCopyright, getFieldEditorParent());
		addField(cookbookCopyrightEditor);

		StringFieldEditor cookbookEmailEditor = new StringFieldEditor(PreferenceConstants.P_COOKBOOK_EMAIL, Messages.ChefclipseRootPreferencePage_CookbookEmail, getFieldEditorParent());
		addField(cookbookEmailEditor);

		StringFieldEditor cookbookLicense = new StringFieldEditor(PreferenceConstants.P_COOKBOOK_LICENSE, Messages.ChefclipseRootPreferencePage_CookbookLicense, getFieldEditorParent());
		addField(cookbookLicense);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {

	}
}
