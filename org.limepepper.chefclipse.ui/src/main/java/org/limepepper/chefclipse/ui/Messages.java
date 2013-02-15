package org.limepepper.chefclipse.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.limepepper.chefclipse.ui.messages"; //$NON-NLS-1$

	public static String ChefConfigurationPropertyPage_CONFIGURE_WORKSPACE;
	public static String ChefConfigurationPropertyPage_Description;
	public static String ChefConfigurationPropertyPage_No_Selection;
	public static String ChefConfigurationsViewer_ColumnNodeName;
	public static String ChefConfigurationsViewer_ColumnServerUrl;
	
	public static String AddChefConfigurationPreferencePage_AddConfigTitle;
	public static String AddChefConfigurationPreferencePage_AddConfigDesc;
	public static String AddChefConfigurationPreferencePage_editConfigTitle;
	public static String AddChefConfigurationPreferencePage_editConfigDesc;
	public static String AddChefConfigurationPreferencePage_EmptyURL;
	public static String AddChefConfigurationPreferencePage_EmptyNodeName;
	public static String AddChefConfigurationPreferencePage_InvalidClientKey;
	public static String AddChefConfigurationPreferencePage_InvalidValidationKey;
	
	public static String ChefConfigurationPreferencePage_Desc;
	public static String ChefConfigurationPreferencePage_SelectDefault;
	
	public static String Config_DefaultValidationClientName;
//	public static String ChefConfigurationPreferencePage_ADD_CHEF_SERVER_CONFIGURATION = "Add Chef server configuration";
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
