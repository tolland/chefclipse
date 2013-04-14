

import java.util.List;

import org.limepepper.chefclipse.common.knife.KnifeConfig;

public interface KnifeConfigController {

    KnifeConfigController INSTANCE = org.limepepper.chefclipse.chefserver.api.KnifeConfigControllerImpl
                                           .init();

    ChefServerApi getServer(KnifeConfig knifeConfig);


    List<KnifeConfig> knifeConfigs = ChefServerApiImpl.getKnifeConfigs();

}
