package org.limepepper.chefclipse.chefserver.api;

import java.util.List;

import org.limepepper.chefclipse.common.knife.KnifeConfig;

public interface KnifeConfigController {

    KnifeConfigController INSTANCE = org.limepepper.chefclipse.chefserver.api.KnifeConfigControllerImpl
                                           .init();

    ChefServerApi getServer(KnifeConfig knifeConfig);


    List<KnifeConfig> knifeConfigs = KnifeConfigControllerImpl.init().getKnifeConfigs();

	List<KnifeConfig> getKnifeConfigs();

}
