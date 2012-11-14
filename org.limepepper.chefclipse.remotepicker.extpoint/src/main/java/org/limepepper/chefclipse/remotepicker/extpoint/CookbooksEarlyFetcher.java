/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.extpoint;

import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IStartup;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;

/**
 * @author Guillermo Zunino
 *
 */
public class CookbooksEarlyFetcher implements IStartup {

	@Override
	public void earlyStartup() {
		CookbookRepositoryManager repoManager = CookbookRepositoryManager.getInstance();
		repoManager.setCacheFolder(Platform.getStateLocation(Platform.getBundle(Activator.PLUGIN_ID)).toOSString());
		
		ExtensionPointHandler ep = new ExtensionPointHandler();
		ep.setRepoManager(repoManager);
		
		ep.read(Platform.getExtensionRegistry());
	}

}
