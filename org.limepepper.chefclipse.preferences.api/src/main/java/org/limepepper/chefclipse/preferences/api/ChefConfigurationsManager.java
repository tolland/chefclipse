/**
 * 
 */
package org.limepepper.chefclipse.preferences.api;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

/**
 * Manager that allow to persist and retrieve chef configurations.
 * 
 * @author Sebastian Sampaoli
 * 
 */
public class ChefConfigurationsManager {

	private static final String CHEF_CONFIGS_LIST = "chefConfigsList"; //$NON-NLS-1$
	private static final String DEFAULT_CHEF_CONFIG = "defaultChefConfig"; //$NON-NLS-1$
	private static final Object KNIFE_CONFIG_EXT = "knife";
	
	private static final String CHEFCONFIG_URL_PROPERTY = "CHEF_CONFIGURATION_URL"; //$NON-NLS-1$
	private static final String CHEFCONFIG_NAME_PROPERTY = "CHEF_CONFIGURATION_NAME"; //$NON-NLS-1$

	private static ChefConfigurationsManager instance;

	/**
	 * Private Constructor.
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
		Preferences preferences = ConfigurationScope.INSTANCE.getNode(Activator.PLUGIN_ID);
		String defaultChefConfigsList = preferences.get(CHEF_CONFIGS_LIST, CHEF_CONFIGS_LIST);

		if (defaultChefConfigsList != null && !defaultChefConfigsList.equals(CHEF_CONFIGS_LIST)) {
			KnifePackage.eINSTANCE.eClass();

			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("knife", new XMIResourceFactoryImpl()); //$NON-NLS-1$

			ResourceSet resSet = new ResourceSetImpl();
			
			Resource resource = resSet.createResource(URI.createFileURI(getConfigListFile() + ".tmp"));
			try {
				resource.load(new URIConverter.ReadableInputStream(defaultChefConfigsList), null);
				EList<EObject> result = resource.getContents();
				List<KnifeConfig> configs = new ArrayList<KnifeConfig>();
				configs.addAll((Collection<? extends KnifeConfig>) result);
				return configs;
			} catch (IOException e) {
				e.printStackTrace();
			}

			// Resource resource = resSet.getResource(
			// URI.createFileURI(getConfigListFile()), true);
			
//			XMLProcessor processor = new XMLProcessor();
//			Resource resource;
//			try {
//				resource = processor.load(new ByteArrayInputStream(defaultChefConfigsList.getBytes()), null);
//				EList<EObject> result = resource.getContents();
//				List<KnifeConfig> configs = new ArrayList<KnifeConfig>();
//				configs.addAll((Collection<? extends KnifeConfig>) result);
//				return configs;
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
		return null;
	}
			 

//		 try {
		 // ChefclipsePackage chefclipsePackage = ChefclipsePackageImpl.eINSTANCE;
		 // chefclipsePackage.eClass();
		 // EPackage.Registry.INSTANCE.put(ChefclipsePackageImpl.eNS_URI,
//		 ChefclipsePackageImpl.eINSTANCE);
//		 //
//		 Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml",
//		 new ChefclipseFactoryImpl());
//		 ChefclipsePackageImpl.eINSTANCE.eClass();
//		 // Register the XMI resource factory for the .cookbookrepo extension
//		 Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		 Map<String, Object> m = reg.getExtensionToFactoryMap();
//		 m.put("xml", new XMLResourceFactoryImpl());
//		 Resource resource = processor.load(new
//		 ByteArrayInputStream(defaultChefConfigsList.getBytes()), null);
//		 EList<EObject> result = resource.getContents();
//		 List<KnifeConfig> configs = new ArrayList<KnifeConfig>();
//		 configs.addAll((Collection<? extends KnifeConfig>) result);
//		 return configs;
//		 } catch (IOException e) {
//		 e.printStackTrace();
//		 }
//		
//		 }
//		 return null;
			 
//		if (isPreferenceStored(getConfigListFile())){
//			KnifePackage.eINSTANCE.eClass();
//
//			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//			Map<String, Object> m = reg.getExtensionToFactoryMap();
//			m.put("knife", new XMIResourceFactoryImpl()); //$NON-NLS-1$
//
//			ResourceSet resSet = new ResourceSetImpl();
//
//			Resource resource = resSet.getResource(
//					URI.createFileURI(getConfigListFile()), true);
//
//			EList<EObject> result = resource.getContents();
//			List<KnifeConfig> configs = new ArrayList<KnifeConfig>();
//			configs.addAll((Collection<? extends KnifeConfig>) result);
//			return configs;
//		}
//		return new ArrayList<KnifeConfig>();
//	}

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
		m.put("knife", new XMIResourceFactoryImpl()); //$NON-NLS-1$

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.createResource(URI
				.createFileURI(getConfigListFile()));

		resource.getContents().addAll(configList);
		
		StringWriter stringWriter = new StringWriter();
		try {
			resource.save(new URIConverter.WriteableOutputStream(stringWriter, "UTF-8"), null);
			Preferences preferences = ConfigurationScope.INSTANCE.getNode(Activator.PLUGIN_ID);
			preferences.put(CHEF_CONFIGS_LIST, stringWriter.toString());
			preferences.flush();
		} catch (IOException | BackingStoreException e) {
			e.printStackTrace();
		}
//
//		XMLProcessor processor = new XMLProcessor();
//		try {
//			resource.save(Collections.EMPTY_MAP);
//			String configsAsString = processor.saveToString(resource, null);
//			Preferences preferences = ConfigurationScope.INSTANCE.getNode(Activator.PLUGIN_ID);
//			preferences.put(CHEF_CONFIGS_LIST, configsAsString);
//			preferences.flush();
//		} catch (IOException | BackingStoreException e) {
//			e.printStackTrace();
//		}
	}

	/**
	 * Retrieve the default Chef configuration previously chosen by the user in
	 * the Chef configuration preference page.
	 * 
	 * @return the default knifeconfig
	 */
	public KnifeConfig retrieveDefaultChefConfiguration() {
		Preferences preferences = ConfigurationScope.INSTANCE
				.getNode(Activator.PLUGIN_ID);
		String defaultChefConfig = preferences.get(DEFAULT_CHEF_CONFIG, DEFAULT_CHEF_CONFIG);
		if (defaultChefConfig != null && !defaultChefConfig.equals(DEFAULT_CHEF_CONFIG)) {
			XMLProcessor processor = new XMLProcessor();
			try {
				Resource resource = processor.load(new ByteArrayInputStream(defaultChefConfig.getBytes()), null);
				EObject result = resource.getContents().get(0);
				return (KnifeConfig) result;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
//		if (isPreferenceStored(getDefaultConfigFile())) {
//			// Initialize the model
//			KnifePackage.eINSTANCE.eClass();
//			// Register the XMI resource factory for the .website extension
//			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//			Map<String, Object> m = reg.getExtensionToFactoryMap();
//			m.put("knife", new XMIResourceFactoryImpl()); //$NON-NLS-1$
//			// Obtain a new resource set
//			ResourceSet resSet = new ResourceSetImpl();
//			// Get the resource
//			Resource resource = resSet.getResource(
//					URI.createFileURI(getDefaultConfigFile()), true);
//			// Get the model element and cast it to the right type
//			KnifeConfig defaultConfig = (KnifeConfig) resource.getContents()
//					.get(0);
//			return defaultConfig;
//		}
//		return null;
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

		XMLProcessor processor = new XMLProcessor();
		try {
			resource.save(Collections.EMPTY_MAP);
			String defaultConfigAsString = processor.saveToString(resource, null);
			Preferences preferences = ConfigurationScope.INSTANCE.getNode(Activator.PLUGIN_ID);
			preferences.put(DEFAULT_CHEF_CONFIG, defaultConfigAsString);
			preferences.flush();
		} catch (IOException | BackingStoreException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Sets the given {@link Config} as the project configured chef-server configuration.
	 * @param project the projcet to apply the chef-server configuration
	 * @param config the {@link Config} to apply
	 */
	public void setProjectChefConfiguration(IResource project, Config config) {
		assert project != null;
		IProject iproject = project.getProject();
		if (iproject == null || !iproject.isAccessible()) {
			return;
		}

		IScopeContext projectScope = new ProjectScope(iproject);
		IEclipsePreferences projectNode = projectScope.getNode(Activator.PLUGIN_ID);
		if (projectNode != null) {
			if (config != null) {
				projectNode.put(CHEFCONFIG_URL_PROPERTY, serverUrl(config));
				projectNode.put(CHEFCONFIG_NAME_PROPERTY, config.getNode_name());
			} else {
				projectNode.remove(CHEFCONFIG_URL_PROPERTY);
				projectNode.remove(CHEFCONFIG_NAME_PROPERTY);
			}
			try {
				projectNode.flush();
			} catch (BackingStoreException e) {
				Platform.getLog(Activator.getContext().getBundle()).log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
						"Failed to save Chef Configuration to project association preference", e)); //$NON-NLS-1$
			}
		}
	}
	
	/**
	 * Retrieves the Chef-server configured for the given project.
	 * @param project a resource or project
	 * @return the {@link Config} configured for the project
	 */
	public Config getProjectChefConfiguration(IResource project) {
		assert project != null;
		List<KnifeConfig> configs = retrieveChefConfigurations();
		Config defaultConfig = retrieveDefaultChefConfiguration();

		IScopeContext projectScope = new ProjectScope(project.getProject());
		IEclipsePreferences projectNode = projectScope.getNode(Activator.PLUGIN_ID);
		String selectedUrl = ""; //$NON-NLS-1$
		String selectedName = ""; //$NON-NLS-1$
		if (defaultConfig  != null) {
			selectedUrl = serverUrl(defaultConfig);
			selectedName = (defaultConfig.getNode_name() == null) ? "" : defaultConfig.getNode_name(); //$NON-NLS-1$
		}
		if (projectNode != null) {
			selectedUrl = projectNode.get(CHEFCONFIG_URL_PROPERTY, selectedUrl);
			selectedName = projectNode.get(CHEFCONFIG_NAME_PROPERTY, selectedName);
		}
		
		for (KnifeConfig knifeConfig : configs) {
			if (selectedUrl.equals(serverUrl(knifeConfig))
					&& selectedName.equals(knifeConfig.getNode_name())) {
				return knifeConfig;
			}
		}
		return defaultConfig;
	}

	/**
	 * Safe method to get getChef_server_url for {@link KnifeConfig}
	 * @param config the {@link KnifeConfig}
	 * @return non-null String
	 */
	private String serverUrl(Config config) {
		if (config.getChef_server_url() != null)
			return config.getChef_server_url().toExternalForm();
		return ""; //$NON-NLS-1$
	}
	
	private String getConfigListFile() {
		String tempFolderPath = System.getProperty("java.io.tmpdir");//$NON-NLS-1$
		return new StringBuilder(tempFolderPath).append(CHEF_CONFIGS_LIST)
				.append(".").append(KNIFE_CONFIG_EXT).toString();
	}

	private String getDefaultConfigFile() {
		String tempFolderPath = System.getProperty("java.io.tmpdir");//$NON-NLS-1$
		return new StringBuilder(tempFolderPath).append(DEFAULT_CHEF_CONFIG)
				.append(".").append(KNIFE_CONFIG_EXT).toString();
	}
	
	private boolean isPreferenceStored(String path) {
		File file = new File(path);
		return file.exists() && file.canRead();
	}
}
