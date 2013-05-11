package org.limepepper.chefclipse.logger.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import org.limepepper.chefclipse.logger.PreferenceConstants;
import org.limepepper.chefclipse.logger.ui.Activator;

import ch.qos.logback.classic.Level;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_LEVEL, Level.DEBUG.toString());
		store.setDefault(PreferenceConstants.P_REMOTEHOST,
				"logger.limepeppper.co.uk");
		store.setDefault(PreferenceConstants.P_PORT, 9999);
	}

}
