/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.ui.preferences;

import java.util.Collection;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.ui.Activator;

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
		Collection<RemoteRepository> repositories = CookbookRepositoryManager.getInstance().getRepositories();
		for (RemoteRepository remoteRepository : repositories) {
			RemoteRepository defaultRepository = remoteRepository;
			store.setDefault(IRemotePickerPreferences.DEFAULT_REPOSITORY, defaultRepository.getId());
			return;
		}
	}

}
