package org.limepepper.chefclipse.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.limepepper.chefclipse.ui.messages"; //$NON-NLS-1$
	public static String ChefConfigurationPropertyPage_CONFIGURE_WORKSPACE;
	public static String ChefConfigurationPropertyPage_Description;
	public static String ChefConfigurationPropertyPage_No_Selection;
	public static String ChefConfigurationsViewer_ColumnNodeName;
	public static String ChefConfigurationsViewer_ColumnServerUrl;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
