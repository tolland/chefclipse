/**
 * 
 */
package org.limepepper.chefclipse.api;

import java.util.List;

import org.limepepper.chefclipse.Config;


/**
 * Manager that allow to persist and retrieve chef configurations.
 * 
 * @author Sebastian Sampaoli
 *
 */
public class ChefConfigurationsManager {

	private ChefConfigurationsManager instance;
	/**
	 * 
	 */
	private ChefConfigurationsManager() {

	}
	
	public synchronized ChefConfigurationsManager getManager() {
		if (instance == null){
			instance = new ChefConfigurationsManager();
		}
		return instance;
	}
	
	public List<Config> retrieveChefConfigurations(){
		return null;
	}
	
	public void saveChefConfigurations(List<Config> chefConfigs){
		
	}

}
