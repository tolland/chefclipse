/**
 * 
 */
package org.limepepper.chefclipse.preferences.ui.preferences;

import java.io.IOException;
import java.io.OutputStream;

import org.eclipse.jface.preference.PreferenceStore;

/**
 * Temporary preference store which save and load Chef configuration values in memory.
 * This store is used to populate the add Chef config dialog and to retrieve values from
 * this dialog when adding or editing a Chef config.
 *  
 * @author Sebastian Sampaoli
 */
public class ChefConfigurationPreferenceStore extends PreferenceStore {

	/**
	 * 
	 */
	public ChefConfigurationPreferenceStore() {

	}

	/**
	 * @param filename
	 */
	public ChefConfigurationPreferenceStore(String filename) {
		super(filename);
	}
	
	@Override
	public void save() throws IOException {
		
	}
	
	@Override
	public void save(OutputStream out, String header) throws IOException {
		
	}

}
