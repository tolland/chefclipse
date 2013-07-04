package org.limepepper.chefclipse;

import java.util.List;

import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.knife.KnifeConfig;

public interface Api {

    Api INSTANCE = org.limepepper.chefclipse.ApiImpl.init();

    List<Node> getNodes(KnifeConfig config);

    Node getNode(KnifeConfig config, String string);
}
