package org.limepepper.chefclipse;

import java.util.List;

import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.knife.KnifeConfig;

public class ApiImpl implements Api {

    KnifeConfigController configController = KnifeConfigController.INSTANCE;
    static ApiImpl        instance;

    public static Api init() {

        if (instance == null) {
            instance = new ApiImpl();
        }

        return instance;
    }

    @Override
    public List<Node> getNodes(final KnifeConfig config) {

        ChefServerApi api = configController.getServer(config);
        return api.getNodes();
    }

    @Override
    public Node getNode(final KnifeConfig config, final String string) {
        ChefServerApi api = configController.getServer(config);

        return api.getNode(string);
    }

}
