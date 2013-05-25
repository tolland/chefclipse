package org.limepepper.chefclipse.chefserver.api;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.limepepper.chefclipse.common.chefserver.CookbookListResp;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.utility.VersionUrl;

/**
 * @author tomhodder
 *
 */
public interface ChefServerApi {

	String getServerInfo();

	List<ServerCookbookVersion> getCookbooks();

	Map<String, VersionUrl> getCookbookList();

	CookbookListResp getCookbookInfo(String name);

	InputStream getCookbookFileStream(CookbookFile cookbookFile);

	ServerCookbookVersion getCookbookVersion(String name);

	ServerCookbookVersion getCookbookVersion(String name, String version);

	List<Node> getNodes();

	Map<String, String> getNodeList();

	Node getNode(String fqdn);

	Map<String, String> getEnvironmentsList();

	List<Environment> getEnvironments();

	Environment getEnvironment(String name);

	Map<String, String> getRolesList();

	List<Role> getRoles();

	Role getRole(String name);
}