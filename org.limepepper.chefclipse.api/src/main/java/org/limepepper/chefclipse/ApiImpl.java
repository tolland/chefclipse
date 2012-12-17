package org.limepepper.chefclipse;

import java.util.List;

import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.Node;

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
    public List<Node> getNodes() {

        ChefServerApi api = configController.getServer(null);
        return api.getNodes();
    }

    @Override
    public Node getNode(String string) {
        ChefServerApi api = configController.getServer(null);
        return api.getNode(string);
    }

}
