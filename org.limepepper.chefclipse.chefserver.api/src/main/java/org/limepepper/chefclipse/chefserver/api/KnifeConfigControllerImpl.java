package org.limepepper.chefclipse.chefserver.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.osgi.framework.Bundle;

public class KnifeConfigControllerImpl implements KnifeConfigController {

    static KnifeConfigControllerImpl        instance;
    private static Map<KnifeConfig, Object> instances = new HashMap<KnifeConfig, Object>(
                                                              1);
    private static Map<String, KnifeConfig> configs   = new HashMap<String, KnifeConfig>(
                                                              1);

    KnifeConfigControllerImpl() {

    }

    public static KnifeConfigController init() {

        if (instance == null) {
            instance = new KnifeConfigControllerImpl();
        }

        return instance;
    }

    private static KnifeConfig useDefaultConfig() {

        if (configs.get("default") != null) {
            return configs.get("default");
        } else {

            try {

                ResourceBundle rb = ResourceBundle.getBundle("plugin");


                Bundle bundle = Platform.getBundle(ServerApiActivator.PLUGIN_ID);
                Path path = new Path(rb.getString("client_key"));
                URL fileURL = Platform.find(bundle, path);
                System.out.println(fileURL);
                System.out.println(FileLocator.toFileURL(fileURL));
                File file2 = new File(FileLocator.toFileURL(fileURL).toURI());

                KnifeConfig knifeConfig = KnifeFactory.eINSTANCE
                        .createKnifeConfig();
                knifeConfig.setChef_server_url(new URL(rb
                        .getString("chef_server_url")));
                knifeConfig.setClient_key(file2);
                knifeConfig.setNode_name(rb.getString("client_name"));


                System.out.println(knifeConfig.getClient_key().exists());

                assertTrue(knifeConfig.getClient_key().exists());
                assertTrue(knifeConfig.getNode_name().length() > 0);

                configs.put("default", knifeConfig);
                return knifeConfig;

            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
        return null;

    }

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
