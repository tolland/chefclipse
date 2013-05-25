/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.api;

/**
 * @author Sebastian Sampaoli
 *
 */
public class InstallCookbookException extends Exception {

	public static final String DOWNLOAD_COOKBOOK_EXCEPTION_MESSAGE = Messages.InstallCookbookException_ErrorDownload;
	
	public static final String INSTALL_COOKBOOK_EXCEPTION_MESSAGE = Messages.InstallCookbookException_ErrorInstall;
	/**
	 * 
	 */
	private static final long serialVersionUID = 2465682410648581279L;

	/**
	 * 
	 */
	public InstallCookbookException() {
		super();
	}

	public InstallCookbookException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public InstallCookbookException(String arg0) {
		super(arg0);
	}

	public InstallCookbookException(Throwable arg0) {
		super(arg0);
	}
}
