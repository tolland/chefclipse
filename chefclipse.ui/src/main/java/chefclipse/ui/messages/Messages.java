package chefclipse.ui.messages;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "chefclipse.ui.messages.messages"; //$NON-NLS-1$

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
	public static String AddChefConfigurationPreferencePage_TestingConnection;
	public static String AddChefConfigurationPreferencePage_ConnectionSuccessful;
	public static String AddChefConfigurationPreferencePage_TestingConnectionMsg;
	public static String AddChefConfigurationPreferencePage_ConnectionError;
	public static String AddChefConfigurationPreferencePage_ConnectionErrorMsj1;
	public static String AddChefConfigurationPreferencePage_ConnectionErrorMsj2;
	public static String AddChefConfigurationPreferencePage_ChefServerURL;
	public static String AddChefConfigurationPreferencePage_NodeName;
	public static String AddChefConfigurationPreferencePage_ClientKey;
	public static String AddChefConfigurationPreferencePage_CookbookPath;
	public static String AddChefConfigurationPreferencePage_ValidationClientName;
	public static String AddChefConfigurationPreferencePage_ValidationKey;
	public static String AddChefConfigurationPreferencePage_ValidURL;

	public static String ChefclipseRootPreferencePage_Description;
	public static String ChefclipseRootPreferencePage_CookbookCopyright;
	public static String ChefclipseRootPreferencePage_CookbookEmail;
	public static String ChefclipseRootPreferencePage_CookbookLicense;

	public static String ChefConfigurationPreferencePage_Desc;
	public static String ChefConfigurationPreferencePage_SelectDefault;
	public static String ChefConfigurationPreferencePage_Title;
	public static String ChefConfigurationPreferencePage_AddButton;
	public static String ChefConfigurationPreferencePage_EditButton;
	public static String ChefConfigurationPreferencePage_RemoveButton;
	public static String ChefConfigurationPreferencePage_DuplicateButton;
	public static String ChefConfigurationPreferencePage_SearchButton;
	public static String ChefConfigurationPreferencePage_SearchFile;

	public static String ChefConfigSelectWizardPage_SelectTitle;
	public static String ChefConfigSelectWizardPage_SelectDescription;

	public static String ChefProjectWizardPage_Title;
	public static String ChefProjectWizardPage_Description;

	public static String ChefRepositoryWizardPage_SelectLocation;
	public static String ChefRepositoryWizardPage_LocationRequired;
	public static String ChefRepositoryWizardPage_AddChefRepo;
    public static String ChefRepositoryWizardPage_ChefRepo;

//	public static String ChefConfigurationPreferencePage_ADD_CHEF_SERVER_CONFIGURATION = "Add Chef server configuration";
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
