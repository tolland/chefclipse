package org.limepepper.chefclipse.chefserver.api;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.chefserver.Client;
import org.limepepper.chefclipse.common.chefserver.CookbookListResp;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.Server;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.utility.VersionUrl;

/**
 * @author tomhodder
 *
 */
public interface ChefServerApi {

	String getServerInfo() throws IOException;

	Server getChefServer();

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

	List<Client> getClients();

	Client getClient(String name);

	void setClient(String name);

	List<DataBag> getDataBags();

	DataBag getDataBag(String name);

	void setDataBag(String name);

	EObject createDataBag(IFolder resource) throws CoreException;

	EObject createDataBagItem(IFile resource);




}