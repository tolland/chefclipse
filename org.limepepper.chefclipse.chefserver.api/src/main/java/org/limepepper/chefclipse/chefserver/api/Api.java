package org.limepepper.chefclipse.chefserver.api;

import java.util.List;

import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.knife.KnifeConfig;

public interface Api {

	Api INSTANCE = org.limepepper.chefclipse.chefserver.api.ApiImpl.init();

	List<Node> getNodes(KnifeConfig config);

	Node getNode(KnifeConfig config, String string);
}
