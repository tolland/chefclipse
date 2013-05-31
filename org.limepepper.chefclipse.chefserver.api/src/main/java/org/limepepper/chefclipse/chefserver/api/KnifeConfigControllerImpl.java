package org.limepepper.chefclipse.chefserver.api;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.preferences.api.ChefConfigManager;

/**
 * The Class KnifeConfigControllerImpl.
 */
public class KnifeConfigControllerImpl implements KnifeConfigController {

	static KnifeConfigControllerImpl instance;
	private static Map<KnifeConfig, Object> instances = new HashMap<KnifeConfig, Object>(
			1);
	private static Map<String, KnifeConfig> configs = new HashMap<String, KnifeConfig>(
			1);

	KnifeConfigControllerImpl() {

	}

	public static KnifeConfigController init() {

		if (instance == null) {
			instance = new KnifeConfigControllerImpl();
		}

		return instance;
	}

	/**
	 * Use the configured default chef server.
	 *
	 * @return the knife config
	 */
	private static KnifeConfig useDefaultConfig() {
		return ChefConfigManager.instance().retrieveDefaultChefConfig();
	}

	@Override
	public ChefServerApi getServer(KnifeConfig knifeConfig) {

		if (knifeConfig == null) {
			knifeConfig = useDefaultConfig();
		}

		assertNotNull(knifeConfig);

		if (!instances.containsKey(knifeConfig)) {
			instances.put(knifeConfig, new ChefServerApiImpl(knifeConfig));
		}

		return (ChefServerApi) instances.get(knifeConfig);

	}

}
