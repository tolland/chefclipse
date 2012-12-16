package org.limepepper.chefclipse;

import java.util.List;

import org.limepepper.chefclipse.common.chefserver.Node;

public interface Api {

    Api INSTANCE = org.limepepper.chefclipse.ApiImpl.init();

    List<Node> getNodes();

    Node getNode(String string);
}
