package org.limepepper.chefclipse.chefserver.api;

import org.limepepper.chefclipse.common.knife.KnifeConfig;

public interface KnifeConfigController {

    KnifeConfigController INSTANCE = org.limepepper.chefclipse.chefserver.api.KnifeConfigControllerImpl
                                           .init();

    ChefServerApi getServer(KnifeConfig knifeConfig);
}
