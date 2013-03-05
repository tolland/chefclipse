/**
 * 
 */
package org.limepepper.chefclipse.preferences.ui.preferences;

import org.apache.commons.validator.UrlValidator;
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

	public static final String URL_PREFIX = "http://"; //$NON-NLS-1$
	public static final String URL_INVALID_PREFIX = "http:"; //$NON-NLS-1$
	public static final String DEFAULT_VALUE = "";
	
	private StringFieldEditor chefServerUrlEditor;
	private StringFieldEditor nodeNameEditor;
	private StringFieldEditor clientKeyEditor;
	private StringFieldEditor cookbookPathEditor;
	private StringFieldEditor validationClientNameEditor;
	private StringFieldEditor validationKeyEditor;
	private UrlValidator urlValidator;
	
	public AddChefConfigurationPreferencePage(PreferenceStore preferenceStore) {
		super(GRID);
		setPreferenceStore(preferenceStore);
	}

	@Override
	protected void createFieldEditors() {
		chefServerUrlEditor = new StringFieldEditor(PreferenceConstants.P_CHEF_SERVER_URL, Messages.AddChefConfigurationPreferencePage_ChefServerURL, getFieldEditorParent());
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER).hint(400, SWT.DEFAULT)
          .grab(true, true).applyTo(chefServerUrlEditor.getTextControl(getFieldEditorParent()));
		chefServerUrlEditor.setEmptyStringAllowed(false);
		chefServerUrlEditor.setErrorMessage(Messages.AddChefConfigurationPreferencePage_EmptyURL);
		urlValidator = new UrlValidator();
		chefServerUrlEditor.getTextControl(getFieldEditorParent()).addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				getContainer().updateMessage();
			}
		});
		addField(chefServerUrlEditor);
		
		nodeNameEditor = new StringFieldEditor(PreferenceConstants.P_NODE_NAME, Messages.AddChefConfigurationPreferencePage_NodeName, getFieldEditorParent());
		nodeNameEditor.setEmptyStringAllowed(false);
		nodeNameEditor.setErrorMessage(Messages.AddChefConfigurationPreferencePage_EmptyNodeName);
		addField(nodeNameEditor);
		
		clientKeyEditor = new FileFieldEditor(PreferenceConstants.P_CLIENT_KEY, Messages.AddChefConfigurationPreferencePage_ClientKey, true, getFieldEditorParent());
		clientKeyEditor.setEmptyStringAllowed(false);
		clientKeyEditor.setErrorMessage(Messages.AddChefConfigurationPreferencePage_InvalidClientKey);
		addField(clientKeyEditor);
		
		cookbookPathEditor = new DirectoryFieldEditor(PreferenceConstants.P_COOKBOOK_PATH, Messages.AddChefConfigurationPreferencePage_CookbookPath, getFieldEditorParent());
		addField(cookbookPathEditor);
		
		validationClientNameEditor = new StringFieldEditor(PreferenceConstants.P_VALIDATION_CLIENT_NAME, Messages.AddChefConfigurationPreferencePage_ValidationClientName, getFieldEditorParent());
		validationClientNameEditor.getTextControl(getFieldEditorParent()).addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				getContainer().updateMessage();
			}
		});
		addField(validationClientNameEditor);
		
		validationKeyEditor = new FileFieldEditor(PreferenceConstants.P_VALIDATION_KEY, Messages.AddChefConfigurationPreferencePage_ValidationKey, true, getFieldEditorParent());
		addField(validationKeyEditor);
		
		noDefaultAndApplyButton();
	}
	
	@Override
	public boolean isValid() {
		String urlValue = chefServerUrlEditor.getTextControl(getFieldEditorParent()).getText();
		if (urlValue.isEmpty() || urlValue.equals(AddChefConfigurationPreferencePage.URL_PREFIX) || !urlValidator.isValid(urlValue)) {
			return false;
		}
		String validationValue = validationClientNameEditor.getTextControl(getFieldEditorParent()).getText();
		if (!validationValue.startsWith("#{ENV[")){
			return false;
		}
		if (!validationValue.endsWith("]}")){ //$NON-NLS-1$
			return false;
		}
		return super.isValid();
	}
	
	public String getURLText() {
		if (chefServerUrlEditor != null) {
			return chefServerUrlEditor.getTextControl(getFieldEditorParent()).getText();
		}
		return DEFAULT_VALUE;
	}
	
	public String getValidationClientNameText() {
		if (validationClientNameEditor != null) {
			return validationClientNameEditor.getTextControl(getFieldEditorParent()).getText();
		}
		return DEFAULT_VALUE;
	}
}
