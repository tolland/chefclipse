package org.limepepper.chefclipse.preferences.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.preference.IPreferenceStore;
import org.limepepper.chefclipse.preferences.ui.PreferencesActivator;

import chefclipse.ui.ChefUI;

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
        IEclipsePreferences node = ConfigurationScope.INSTANCE.getNode(PreferencesActivator.PLUGIN_ID);
        node.put(PreferenceConstants.P_CACHE_TYPE, "'BasicFile'"); //$NON-NLS-1$
        node.put(PreferenceConstants.P_CACHE_OPTIONS, ":path => \"#{ENV['HOME']}/.chef/checksums\""); //$NON-NLS-1$
        node.put(PreferenceConstants.P_SSL_VERIFY_MODE, ":verify_none"); //$NON-NLS-1$

     //   IPreferenceStore store = ChefUI.getDefault().getPreferenceStore();

    }

}
