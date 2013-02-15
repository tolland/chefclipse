/**
 * 
 */
package org.limepepper.chefclipse.preferences.ui.preferences;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.limepepper.chefclipse.preferences.ui.dialogs.AddChefConfigurationPreferenceContainer;
import org.limepepper.chefclipse.ui.Messages;

/**
 * Preference page which allow to create and add a new Chef configuration or edit an
 * existing one. It's used to fill the dialog area of {@link AddChefConfigurationPreferenceContainer}.
 * This way, this preference page manage the store, retrieval and validation of preferences.
 * 
 * @author Sebastian Sampaoli
 *
 */
public class AddChefConfigurationPreferencePage extends FieldEditorPreferencePage {

	private StringFieldEditor chefServerUrlEditor;
	private StringFieldEditor nodeNameEditor;
	private StringFieldEditor clientKeyEditor;
	private StringFieldEditor cookbookPathEditor;
	private StringFieldEditor validationClientNameEditor;
	private StringFieldEditor validationKeyEditor;
	
	public AddChefConfigurationPreferencePage(PreferenceStore preferenceStore) {
		super(GRID);
		setPreferenceStore(preferenceStore);
	}

	@Override
	protected void createFieldEditors() {
		chefServerUrlEditor = new StringFieldEditor(PreferenceConstants.P_CHEF_SERVER_URL, "Chef server &URL:", getFieldEditorParent());
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER).hint(400, SWT.DEFAULT)
          .grab(true, true).applyTo(chefServerUrlEditor.getTextControl(getFieldEditorParent()));
		chefServerUrlEditor.setEmptyStringAllowed(false);
		chefServerUrlEditor.setErrorMessage(Messages.AddChefConfigurationPreferencePage_EmptyURL);
		addField(chefServerUrlEditor);
		
		nodeNameEditor = new StringFieldEditor(PreferenceConstants.P_NODE_NAME, "&Node name:", getFieldEditorParent());
		nodeNameEditor.setEmptyStringAllowed(false);
		nodeNameEditor.setErrorMessage(Messages.AddChefConfigurationPreferencePage_EmptyNodeName);
		addField(nodeNameEditor);
		
		clientKeyEditor = new FileFieldEditor(PreferenceConstants.P_CLIENT_KEY, "&Client key:", true, getFieldEditorParent());
		clientKeyEditor.setEmptyStringAllowed(false);
		clientKeyEditor.setErrorMessage(Messages.AddChefConfigurationPreferencePage_InvalidClientKey);
		addField(clientKeyEditor);
		
		cookbookPathEditor = new DirectoryFieldEditor(PreferenceConstants.P_COOKBOOK_PATH, "Cookbook &path:", getFieldEditorParent());
		addField(cookbookPathEditor);
		
		validationClientNameEditor = new StringFieldEditor(PreferenceConstants.P_VALIDATION_CLIENT_NAME, "&Validation client name:", getFieldEditorParent());
		validationClientNameEditor.getTextControl(getFieldEditorParent()).addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				String text = validationClientNameEditor.getTextControl(getFieldEditorParent()).getText();
				if (text.startsWith("#{ENV[") && text.endsWith("]}")){
					setValid(true);
					setErrorMessage(null);
				} else {
					setValid(false);
					setErrorMessage(Messages.AddChefConfigurationPreferencePage_InvalidValidationKey);
				}
			}
		});
		addField(validationClientNameEditor);
		
		validationKeyEditor = new FileFieldEditor(PreferenceConstants.P_VALIDATION_KEY, "Validation &key:", true, getFieldEditorParent());
		addField(validationKeyEditor);
		
		noDefaultAndApplyButton();
	}
}
