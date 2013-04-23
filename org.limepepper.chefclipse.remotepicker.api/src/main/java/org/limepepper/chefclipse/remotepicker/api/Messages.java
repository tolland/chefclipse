package org.limepepper.chefclipse.remotepicker.api;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.limepepper.chefclipse.remotepicker.api.messages"; //$NON-NLS-1$
	public static String CookbookRepositoryManager_CompositeDescription;
	public static String CookbookRepositoryManager_CompositeName;
	public static String CookbookRepositoryManager_ErrorSaving;
	public static String CookbookRepositoryManager_ErrorSource;
	public static String CookbookRepositoryManager_InvalidRepo;
	public static String CookbookRepositoryManager_InvalidUrl;
	public static String CookbookRepositoryManager_NotTemplate;
	public static String CookbookRepositoryManager_NotTemplate1;
	public static String InstallCookbookException_ErrorDownload;
	public static String InstallCookbookException_ErrorInstall;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
