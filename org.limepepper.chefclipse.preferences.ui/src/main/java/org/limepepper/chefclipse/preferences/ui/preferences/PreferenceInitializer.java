package org.limepepper.chefclipse.preferences.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.limepepper.chefclipse.preferences.ui.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault("cache_type", "'BasicFile'");
		store.setDefault("cache_options", ":path => \"#{ENV['HOME']}/.chef/checksums\"");
		store.setDefault("ssl_verify_mode", ":verify_none");
	}

}
