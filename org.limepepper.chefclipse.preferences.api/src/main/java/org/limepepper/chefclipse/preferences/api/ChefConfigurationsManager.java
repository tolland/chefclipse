/**
 * 
 */
package org.limepepper.chefclipse.preferences.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifePackage;

/**
 * Manager that allow to persist and retrieve chef configurations.
 * 
 * @author Sebastian Sampaoli
 * 
 */
public class ChefConfigurationsManager {

	private static final String CHEF_CONFIGS_LIST = "chefConfigsList";
	private static final String DEFAULT_CHEF_CONFIG = "defaultChefConfig";
	private static final Object KNIFE_CONFIG_EXT = "knife";
	private static ChefConfigurationsManager instance;

	/**
	 * 
	 */
	private ChefConfigurationsManager() {

	}

	public static synchronized ChefConfigurationsManager getManager() {
		if (instance == null) {
			instance = new ChefConfigurationsManager();
		}
		return instance;
	}

	/**
	 * Retrieve the list of persisted chef configurations from disk.
	 * 
	 * @return a list of KnifeConfig's
	 */
	@SuppressWarnings("unchecked")
	public List<KnifeConfig> retrieveChefConfigurations() {
		if (isPreferenceStored(getConfigListFile())){
			KnifePackage.eINSTANCE.eClass();

			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("knife", new XMIResourceFactoryImpl());

			ResourceSet resSet = new ResourceSetImpl();

			Resource resource = resSet.getResource(
					URI.createFileURI(getConfigListFile()), true);

			EList<EObject> result = resource.getContents();
			List<KnifeConfig> configs = new ArrayList<KnifeConfig>();
			configs.addAll((Collection<? extends KnifeConfig>) result);
			return configs;
		}
		return new ArrayList<KnifeConfig>();
	}

	/**
	 * Save the list of Chef configurations. This saved list will be used to
	 * retrieve the configurations and show them in the Chef configuration preference page
	 * and others. 
	 * 
	 * @param chefConfigs
	 */
	public void saveChefConfigurations(List<Config> chefConfigs) {
		EList<Config> configList = new BasicEList<Config>();
		configList.addAll(chefConfigs);

		KnifePackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("knife", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.createResource(URI.createFileURI(getConfigListFile()));

		resource.getContents().addAll(configList);
		// Now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Retrieve the default Chef configuration previously chosen by the user
	 * in the Chef configuration preference page.
	 * 
	 * @return the default knifeconfig
	 */
	public KnifeConfig retrieveDefaultChefConfiguration() {
		if (isPreferenceStored(getDefaultConfigFile())){
			// Initialize the model
			KnifePackage.eINSTANCE.eClass();
			// Register the XMI resource factory for the .website extension
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("knife", new XMIResourceFactoryImpl());
			// Obtain a new resource set
			ResourceSet resSet = new ResourceSetImpl();
			// Get the resource
			Resource resource = resSet.getResource(URI.createFileURI(getDefaultConfigFile()), true);
			// Get the model element and cast it to the right type
			KnifeConfig defaultConfig = (KnifeConfig) resource.getContents().get(0);
			return defaultConfig;
		}
		return null;
	}

	/**
	 * Save the default Chef configuration chosen by the user.
	 * 
	 * @param currentDefaultConfig
	 */
	public void saveDefaultChefConfiguration(Config currentDefaultConfig) {
		KnifePackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("knife", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.createResource(URI.createFileURI(getDefaultConfigFile()));

		resource.getContents().add(currentDefaultConfig);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String getConfigListFile() {
		return new StringBuilder(ConfigurationScope.INSTANCE.getLocation()
				.toOSString()).append(File.separatorChar)
				.append(CHEF_CONFIGS_LIST).append(".").append(KNIFE_CONFIG_EXT)
				.toString();
	}

	private String getDefaultConfigFile() {
		return new StringBuilder(ConfigurationScope.INSTANCE.getLocation()
				.toOSString()).append(File.separatorChar)
				.append(DEFAULT_CHEF_CONFIG).append(".")
				.append(KNIFE_CONFIG_EXT).toString();
	}
	
	private boolean isPreferenceStored(String path) {
		File file = new File(path);
		return file.exists() && file.canRead();
	}
}
