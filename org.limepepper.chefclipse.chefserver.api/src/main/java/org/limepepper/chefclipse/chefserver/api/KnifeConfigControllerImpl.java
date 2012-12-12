package org.limepepper.chefclipse.chefserver.api;

import org.limepepper.chefclipse.common.knife.KnifeConfig;

public class KnifeConfigControllerImpl implements KnifeConfigController {

    static KnifeConfigControllerImpl instance;

    KnifeConfigControllerImpl() {

    }

    public static KnifeConfigController init() {

        if (instance == null) {
            instance = new KnifeConfigControllerImpl();
        }

        return instance;
    }

    public ChefServerApi getServer(KnifeConfig config) {
        return new ChefServerApiImpl(config);
    }

}
