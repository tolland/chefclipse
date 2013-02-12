/**
 * 
 */
package org.limepepper.chefclipse.api;

import java.util.List;

import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.common.knife.KnifeConfig;


/**
 * Manager that allow to persist and retrieve chef configurations.
 * 
 * @author Sebastian Sampaoli
 *
 */
public class ChefConfigurationsManager {

	private static ChefConfigurationsManager instance;
	/**
	 * 
	 */
	private ChefConfigurationsManager() {

	}
	
	public static synchronized ChefConfigurationsManager getManager() {
		if (instance == null){
			instance = new ChefConfigurationsManager();
		}
		return instance;
	}
	
	public List<KnifeConfig> getChefConfigurations() {
		// TODO implement
		return null;
	}
	
	public void saveChefConfigurations(List<Config> chefConfigs){
		
	}

	public KnifeConfig getDefaultChefConfiguration() {
		// TODO implement
		return null;
	}

}
