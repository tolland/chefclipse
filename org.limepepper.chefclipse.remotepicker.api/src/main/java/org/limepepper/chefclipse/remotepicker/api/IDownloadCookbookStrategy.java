/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.api;

import java.io.File;
import java.io.IOException;

import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;

/**
 * @author Sebastian Sampaoli
 *
 */
public interface IDownloadCookbookStrategy {
	
	/**
	 * Download the cookbook specified as parameter and returns the cookbook
	 * root directory as a file.
	 * @throws InstallCookbookException 
	 **/
	File downloadCookbook(RemoteCookbook cookbook) throws InstallCookbookException;

	/**
	* Decompress a cookbook (compressed in a file) in a root hierarchy directory in the temp directory.
	* This method should be called by downloadCookbook to decompress a file.
	 * @throws IOException 
	 * @throws InstallCookbookException 
	**/
	File decompressCookbook(File compressedFile) throws IOException;

}
