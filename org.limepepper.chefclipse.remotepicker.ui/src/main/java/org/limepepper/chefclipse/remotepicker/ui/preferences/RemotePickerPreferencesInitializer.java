/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.ui.Activator;
import org.limepepper.chefclipse.remotepicker.ui.handlers.RemotePickerHandler;

/**
 * @author Sebastian Sampaoli
 *
 */
public class RemotePickerPreferencesInitializer extends
		AbstractPreferenceInitializer {

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		CookbookRepositoryManager manager = CookbookRepositoryManager.getInstance();
		boolean defaulted = false;
		for (RemoteRepository remoteRepository : manager.getRepositories()) {
			RemotePickerHandler.enableRepository(remoteRepository);
			if (!defaulted && !remoteRepository.getId().equals(CookbookRepositoryManager.COMPOSITE_REPOSITORY_ID)){
				store.setDefault(IRemotePickerPreferences.DEFAULT_REPOSITORY, remoteRepository.getId());
				defaulted = true;
			}
		}
		for (RemoteRepository remoteRepository : manager.getTemplateRepositories()) {
			RemotePickerHandler.enableRepository(remoteRepository);
		}
	}
	
}
