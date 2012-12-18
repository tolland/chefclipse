package org.limepepper.chefclipse.chefserver.api;

import java.util.List;
import java.util.Map;

import org.limepepper.chefclipse.VersionUrl;
import org.limepepper.chefclipse.REST.ClientResp;
import org.limepepper.chefclipse.REST.CookbookListResp;
import org.limepepper.chefclipse.REST.CookbookVersionResp;
import org.limepepper.chefclipse.REST.RoleListResp;
import org.limepepper.chefclipse.REST.RoleResp;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;

/**
 * @author tomhodder
 *
 */
public interface ChefServerApi {

    String getServerInfo();

    List<ServerCookbookVersion> getCookbooks();

    Map<String, VersionUrl> getCookbookList();

    List<ClientResp> getClients();

    ClientResp getClient(String name);

    List<CookbookListResp> getCookbooks(int num_versions);


    CookbookListResp getCookbookInfo(String name);

    ServerCookbookVersion getCookbookVersion(String name);

    ServerCookbookVersion getCookbookVersion(String name, String version);


    List<RoleListResp> getRoles();

    RoleResp getRole(String name);

    List<Node> getNodes();


    Map<String, String> getNodeList();

    Map<String, String> getRoleList();

    Node getNode(String fqdn);

    List<CookbookVersionResp> getNodeCookbooks(String name);




}