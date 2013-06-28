/**
 *
 */
package org.limepepper.chefclipse.knife.api;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
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
import org.eclipse.emf.ecore.resource.URIConverter.ReadableInputStream;
import org.eclipse.emf.ecore.resource.URIConverter.WriteableOutputStream;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.osgi.service.prefs.BackingStoreException;

/**
 * Manager that allow to persist and retrieve chef configurations.
 *
 * @author Sebastian Sampaoli
 *
 */
public class ChefConfigManager {

	private static final String CHEF_CONFIGS_LIST = "chefConfigsList"; //$NON-NLS-1$
	private static final Object KNIFE_CONFIG_EXT = "knife"; //$NON-NLS-1$

	private static final String CHEFCONFIG_URL_PROPERTY = "CHEF_CONFIGURATION_URL"; //$NON-NLS-1$
	private static final String CHEFCONFIG_NAME_PROPERTY = "CHEF_CONFIGURATION_NAME"; //$NON-NLS-1$

	private static ChefConfigManager instance;

	/**
	 * Private Constructor.
	 */
	private ChefConfigManager() {
	}

	public static synchronized ChefConfigManager instance() {
		if (instance == null) {
			instance = new ChefConfigManager();
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
		IEclipsePreferences preferences = getPreferences();
		String defaultChefConfigsList = preferences.get(CHEF_CONFIGS_LIST,
				CHEF_CONFIGS_LIST);

		if (defaultChefConfigsList != null
				&& !defaultChefConfigsList.equals(CHEF_CONFIGS_LIST)) {
			KnifePackage.eINSTANCE.eClass();

			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("knife", new XMIResourceFactoryImpl()); //$NON-NLS-1$

			ResourceSet resSet = new ResourceSetImpl();

			Resource resource = resSet.createResource(URI
					.createFileURI(getConfigListFile() + ".tmp")); //$NON-NLS-1$

			ReadableInputStream is = new URIConverter.ReadableInputStream(
					defaultChefConfigsList);

			try {
				resource.load(is, null);
				EList<EObject> result = resource.getContents();
				List<KnifeConfig> configs = new ArrayList<KnifeConfig>();
				configs.addAll((Collection<? extends KnifeConfig>) result);
				return configs;
			} catch (IOException e) {
				Platform.getLog(Activator.getContext().getBundle())
						.log(new Status(
								IStatus.ERROR,
								Activator.PLUGIN_ID,
								"Failed to retrieve Chef Configuration from configuration preference", e)); //$NON-NLS-1$
			} finally {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
		return new ArrayList<KnifeConfig>();
	}

	public IEclipsePreferences getPreferences() {
		return ConfigurationScope.INSTANCE.getNode(Activator.PLUGIN_ID);
	}

	/**
	 * Save the list of Chef configurations. This saved list will be used to
	 * retrieve the configurations and show them in the Chef configuration
	 * preference page and others.
	 *
	 * @param chefConfigs
	 */
	public void saveChefConfigs(final List<? extends Config> chefConfigs) {
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
		WriteableOutputStream os = new URIConverter.WriteableOutputStream(
				stringWriter, "UTF-8");
		try {

			resource.save(os, null);
			IEclipsePreferences preferences = getPreferences();
			preferences.put(CHEF_CONFIGS_LIST, stringWriter.toString());
			preferences.flush();
		} catch (IOException | BackingStoreException e) {
			Platform.getLog(Activator.getContext().getBundle())
					.log(new Status(
							IStatus.ERROR,
							Activator.PLUGIN_ID,
							"Failed to save Chef Configuration to configuration preference", e)); //$NON-NLS-1$
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Retrieve the default Chef configuration previously chosen by the user in
	 * the Chef configuration preference page.
	 *
	 * @return the default knifeconfig
	 */
	public KnifeConfig retrieveDefaultChefConfig() {
		IEclipsePreferences preferences = getPreferences();

		String defaultConfigUrl = preferences.get(CHEFCONFIG_URL_PROPERTY, ""); //$NON-NLS-1$
		String defaultConfigName = preferences
				.get(CHEFCONFIG_NAME_PROPERTY, ""); //$NON-NLS-1$

		List<KnifeConfig> chefConfigs = retrieveChefConfigurations();

		for (KnifeConfig knifeConfig : chefConfigs) {
			if (defaultConfigUrl.equals(serverUrl(knifeConfig))
					&& defaultConfigName.equals(knifeConfig.getNode_name())) {
				return knifeConfig;
			}
		}

		return null;
	}

	/**
	 * Save the default Chef configuration chosen by the user.
	 *
	 * @param currentDefaultConfig
	 */
	public void saveDefaultChefConfig(final Config currentDefaultConfig) {
		IEclipsePreferences preferences = getPreferences();
		try {
			saveChefConfig(currentDefaultConfig, preferences);
		} catch (BackingStoreException e) {

			Platform.getLog(Activator.getContext().getBundle())
					.log(new Status(
							IStatus.ERROR,
							Activator.PLUGIN_ID,
							"Failed to save default Chef Configuration to configuration preference", e)); //$NON-NLS-1$

		}
	}

	private void saveChefConfig(final Config currentDefaultConfig,
			final IEclipsePreferences preferences) throws BackingStoreException {
		if (currentDefaultConfig != null) {
			preferences.put(CHEFCONFIG_URL_PROPERTY,
					serverUrl(currentDefaultConfig));
			preferences.put(CHEFCONFIG_NAME_PROPERTY,
					currentDefaultConfig.getNode_name());
		} else {
			preferences.remove(CHEFCONFIG_URL_PROPERTY);
			preferences.remove(CHEFCONFIG_NAME_PROPERTY);
		}
		preferences.flush();
	}

	/**
	 * Sets the given {@link Config} as the project configured chef-server
	 * configuration.
	 *
	 * @param project
	 *            the projcet to apply the chef-server configuration
	 * @param config
	 *            the {@link Config} to apply
	 */
	public void saveProjectChefConfig(final IResource project,
			final Config config) {
		assert project != null;
		IProject iproject = project.getProject();
		if (iproject == null || !iproject.isAccessible()) {
			return;
		}

		IScopeContext projectScope = new ProjectScope(iproject);
		IEclipsePreferences projectNode = projectScope
				.getNode(Activator.PLUGIN_ID);
		if (projectNode != null) {
			try {
				saveChefConfig(config, projectNode);
			} catch (BackingStoreException e) {
				Platform.getLog(Activator.getContext().getBundle())
						.log(new Status(
								IStatus.ERROR,
								Activator.PLUGIN_ID,
								"Failed to save Chef Configuration to project association preference", e)); //$NON-NLS-1$
			}
		}
	}

	/**
	 * Retrieves the Chef-server configured for the given project.
	 *
	 * @param project
	 *            a resource or project
	 * @return the {@link Config} configured for the project
	 */
	public KnifeConfig retrieveProjectChefConfig(final IResource project) {
		assert project != null;
		List<KnifeConfig> configs = retrieveChefConfigurations();
		KnifeConfig defaultConfig = retrieveDefaultChefConfig();

		IScopeContext projectScope = new ProjectScope(project.getProject());
		IEclipsePreferences projectNode = projectScope
				.getNode(Activator.PLUGIN_ID);
		String selectedUrl = ""; //$NON-NLS-1$
		String selectedName = ""; //$NON-NLS-1$
		if (defaultConfig != null) {
			selectedUrl = serverUrl(defaultConfig);
			selectedName = (defaultConfig.getNode_name() == null) ? "" : defaultConfig.getNode_name(); //$NON-NLS-1$
		}
		if (projectNode != null) {
			selectedUrl = projectNode.get(CHEFCONFIG_URL_PROPERTY, selectedUrl);
			selectedName = projectNode.get(CHEFCONFIG_NAME_PROPERTY,
					selectedName);
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
	 *
	 * @param config
	 *            the {@link KnifeConfig}
	 * @return non-null String
	 */
	private String serverUrl(final Config config) {
		if (config.getChef_server_url() != null) {
			return config.getChef_server_url().toExternalForm();
		}
		return ""; //$NON-NLS-1$
	}

	private String getConfigListFile() {
		String tempFolderPath = System.getProperty("java.io.tmpdir");//$NON-NLS-1$
		return new StringBuilder(tempFolderPath).append(CHEF_CONFIGS_LIST)
				.append(".").append(KNIFE_CONFIG_EXT).toString();
	}
}
