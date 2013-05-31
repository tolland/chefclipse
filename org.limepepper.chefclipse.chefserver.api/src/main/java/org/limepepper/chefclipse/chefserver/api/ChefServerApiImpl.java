/**
 *
 */
package org.limepepper.chefclipse.chefserver.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.limepepper.chefclipse.emfjson.chefserver.internal.ChefServerClient.getConnection;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import opscode.chef.REST.AuthCredentials;
import opscode.chef.REST.JSONRestWrapper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.EMFJs;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.Client;
import org.limepepper.chefclipse.common.chefserver.CookbookListResp;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.Server;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.emfjson.EmfJsonWrapper;
import org.limepepper.chefclipse.emfjson.chefserver.ChefServerURIHandler;
import org.limepepper.chefclipse.emfjson.chefserver.internal.ChefRequest;
import org.limepepper.chefclipse.utility.Config;
import org.limepepper.chefclipse.utility.NameUrlMap;
import org.limepepper.chefclipse.utility.NameVersionMap;
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.limepepper.chefclipse.utility.VersionUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author tolland
 */
public class ChefServerApiImpl implements ChefServerApi {

	static Logger logger = LoggerFactory.getLogger(ChefServerApiImpl.class);

	AuthCredentials auth = null;
	Map<String, Object> options = new HashMap<String, Object>();

	ChefServerApiImpl(KnifeConfig knifeConfig) {

		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
				"http", new JsResourceFactoryImpl());

		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
				"https", new JsResourceFactoryImpl());

		Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put(
				"application/json", new JsResourceFactoryImpl());

		options.put("knifeConfig", knifeConfig);

	}

	URL getUrl() {
		return ((KnifeConfig) options.get("knifeConfig")).getChef_server_url();
	}

	KnifeConfig getConfig() {
		return (KnifeConfig) options.get("knifeConfig");
	}

	public ServerCookbookVersion getCookbookVersion(String string,
			String version) {

		options.put(EMFJs.OPTION_ROOT_ELEMENT,
				ChefserverPackage.eINSTANCE.getServerCookbookVersion());

		ResourceSetImpl resourceSet = new ResourceSetImpl();

		resourceSet.getURIConverter().getURIHandlers()
				.add(0, new ChefServerURIHandler());

		KnifeConfig knifeConfig = (KnifeConfig) options.get("knifeConfig");
		URI uri = URI.createURI((knifeConfig).getChef_server_url().toString()
				+ "/cookbooks/" + string + "/" + version);

		Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(options);
		} catch (IOException e) {
			e.printStackTrace();
			fail("failed to load resource");
		}

		ServerCookbookVersion cookbook = (ServerCookbookVersion) resource
				.getContents().get(0);

		cookbook.setKnifeConfig(knifeConfig);

		assertNotNull(cookbook);
		assertTrue(cookbook.getCookbook_name() != null);

		return cookbook;

	}

	public CookbookListResp getCookbookInfo(String cookbook) {

		/*
		 * JSONObject json; try { json = getRestCookbook(cookbook);
		 *
		 * System.out.println(json); return createCookbookListResp(cookbook,
		 * json); } catch (MalformedURLException e) { e.printStackTrace(); }
		 */
		return null;
	}

	@Override
	public ServerCookbookVersion getCookbookVersion(String name) {
		return getCookbookVersion(name, "_latest");
	}

	@Override
	public List<Node> getNodes() {

		List<Node> nodes = new ArrayList<Node>();
		Map<String, String> list = getNodeList();
		for (Entry<String, String> entry : list.entrySet()) {
			nodes.add(getNode(entry.getKey()));
		}
		return nodes;
	}

	@Override
	public Node getNode(String name) {

		options.put(EMFJs.OPTION_ROOT_ELEMENT,
				ChefserverPackage.eINSTANCE.getNode());

		ResourceSetImpl resourceSet = new ResourceSetImpl();

		resourceSet.getURIConverter().getURIHandlers()
				.add(0, new ChefServerURIHandler());

		URI uri = URI.createURI(((Config) options.get("knifeConfig"))
				.getChef_server_url().toString() + "/nodes/" + name);

		Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(options);
		} catch (IOException e) {
			e.printStackTrace();
			fail("failed to load resource");
		}

		Node eObject = (Node) resource.getContents().get(0);

		assertNotNull(eObject);
		assertTrue(eObject.getName() != null);

		EList<String> runList = eObject.getRun_list_items();
		for (String runListItem : runList) {
			System.out.println("text is :" + runListItem);
			if (runListItem.startsWith("role[")) {
				Role role = getRole(runListItem.substring("role[".length(),
						runListItem.length() - 1));

				eObject.getRun_list().add(role);

			} else if (runListItem.startsWith("recipe[")) {

			}
		}

		return eObject;
	}

	@Override
	public Server getChefServer() {

		try {
			getServerInfo();
		} catch (IOException e) {

		}

		Server server;
		KnifeConfig knifeConfig = (KnifeConfig) options.get("knifeConfig");

		if (knifeConfig.getServer() == null) {
			server = ChefserverFactory.eINSTANCE.createServer();
		} else {
			server = knifeConfig.getServer();
		}

		return null;
	}

	@Override
	public String getServerInfo() throws IOException {

		options.put(EMFJs.OPTION_ROOT_ELEMENT,
				ChefserverPackage.eINSTANCE.getNode());

		ResourceSetImpl resourceSet = new ResourceSetImpl();

		resourceSet.getURIConverter().getURIHandlers()
				.add(0, new ChefServerURIHandler());

		URI uri = URI
				.createURI(((Config) options.get("knifeConfig"))
						.getChef_server_url().toString()
						+ "/nodes/non_existing_node_but_should_return_404_for_correct_auth");

		Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(options);
		} catch (FileNotFoundException e) {
			// return "OK-Authenticated";
		} catch (IOException e) {
			throw e;
		}
/*
		Node eObject = (Node) resource.getContents().get(0);

		assertNotNull(eObject);
		assertTrue(eObject.getName() != null);

		EList<String> runList = eObject.getRun_list_items();
		for (String runListItem : runList) {
			System.out.println("text is :" + runListItem);
			if (runListItem.startsWith("role[")) {
				Role role = getRole(runListItem.substring("role[".length(),
						runListItem.length() - 1));

				eObject.getRun_list().add(role);

			} else if (runListItem.startsWith("recipe[")) {

			}
		}*/

		return "OK-Authenticated";

	}

	public void connectChefServer() {

		EmfJsonWrapper.instance().getOjectFromJson();

	}

	@Override
	public Map<String, String> getNodeList() {

		URI uri = URI.createURI(getUrl().toString() + "/nodes");
		try {

			assertNotNull(uri);
			ResourceSetImpl resourceSet = new ResourceSetImpl();

			HttpURLConnection connection = getConnection(new ChefRequest(uri,
					getConfig()), "GET");

			Map<String, Object> options = new HashMap<String, Object>();

			options.put(EMFJs.OPTION_ROOT_ELEMENT,
					UtilityPackage.eINSTANCE.getNameUrlMap());

			URL url = null;

			Resource resource = resourceSet.createResource(uri,
					"application/json");

			assertNotNull(resource);

			final InputStream inStream = connection.getInputStream();

			resource.load(inStream, options);

			inStream.close();

			NameUrlMap user = (NameUrlMap) resource.getContents().get(0);

			assertTrue(user.getEntries() != null);

			return user.getEntries().map();

		} catch (IOException e) {
			e.printStackTrace();
			fail("error");
		} finally {

		}

		return null;
	}

	public List<ServerCookbookVersion> getCookbooks() {

		List<ServerCookbookVersion> items = new ArrayList<ServerCookbookVersion>();
		Map<String, VersionUrl> list = getCookbooksVersions("1");
		for (Entry<String, VersionUrl> entry : list.entrySet()) {
			items.add(getCookbookVersion(entry.getKey()));
		}
		return items;

	}

	@Override
	public Map<String, VersionUrl> getCookbookList() {
		return getCookbooksVersions("all");
	}

	/**
	 * @param numVersions
	 * @return
	 */
	protected Map<String, VersionUrl> getCookbooksVersions(String numVersions) {
		URI uri = URI.createURI(getUrl().toString()
				+ "/cookbooks?num_versions=" + numVersions
				+ "&start=0&items=25");

		try {

			assertNotNull(uri);
			ResourceSetImpl resourceSet = new ResourceSetImpl();

			HttpURLConnection connection = getConnection(new ChefRequest(uri,
					getConfig()), "GET");

			Map<String, Object> options = new HashMap<String, Object>();

			options.put(EMFJs.OPTION_ROOT_ELEMENT,
					UtilityPackage.eINSTANCE.getNameVersionMap());

			URL url = null;

			Resource resource = resourceSet.createResource(uri,
					"application/json");

			assertNotNull(resource);

			final InputStream inStream = connection.getInputStream();

			resource.load(inStream, options);

			inStream.close();

			NameVersionMap user = (NameVersionMap) resource.getContents()
					.get(0);

			assertNotNull(user);

			return user.getEntries().map();

		} catch (IOException e) {
			e.printStackTrace();
			fail("error");
		} finally {

		}
		return null;
	}

	public static List<KnifeConfig> getKnifeConfigs() {
		return null;
	}

	@Override
	public Map<String, String> getEnvironmentsList() {
		URI uri = URI.createURI(getUrl().toString() + "/environments");

		try {

			assertNotNull(uri);
			ResourceSetImpl resourceSet = new ResourceSetImpl();

			HttpURLConnection connection = getConnection(new ChefRequest(uri,
					getConfig()), "GET");

			Map<String, Object> options = new HashMap<String, Object>();

			options.put(EMFJs.OPTION_ROOT_ELEMENT,
					UtilityPackage.eINSTANCE.getNameUrlMap());

			URL url = null;

			Resource resource = resourceSet.createResource(uri,
					"application/json");

			assertNotNull(resource);

			final InputStream inStream = connection.getInputStream();

			resource.load(inStream, options);

			inStream.close();

			NameUrlMap itemMap = (NameUrlMap) resource.getContents().get(0);

			assertNotNull(itemMap);

			return itemMap.getEntries().map();

		} catch (IOException e) {
			e.printStackTrace();
			fail("error");
		} finally {

		}
		return null;
	}

	@Override
	public List<Environment> getEnvironments() {

		List<Environment> environments = new ArrayList<Environment>();
		Map<String, String> list = getEnvironmentsList();
		for (Entry<String, String> entry : list.entrySet()) {
			environments.add(getEnvironment(entry.getKey()));
		}
		return environments;
	}

	@Override
	public Environment getEnvironment(String name) {

		options.put(EMFJs.OPTION_ROOT_ELEMENT,
				ChefserverPackage.eINSTANCE.getEnvironment());

		ResourceSetImpl resourceSet = new ResourceSetImpl();

		resourceSet.getURIConverter().getURIHandlers()
				.add(0, new ChefServerURIHandler());

		URI uri = URI.createURI(((Config) options.get("knifeConfig"))
				.getChef_server_url().toString() + "/environments/" + name);

		Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(options);
		} catch (IOException e) {
			e.printStackTrace();
			fail("failed to load resource");
		}

		Environment eObject = (Environment) resource.getContents().get(0);

		assertNotNull(eObject);
		assertTrue(eObject.getName() != null);

		return eObject;
	}

	@Override
	public List<Role> getRoles() {

		List<Role> items = new ArrayList<Role>();
		Map<String, String> list = getRolesList();
		for (Entry<String, String> entry : list.entrySet()) {
			items.add(getRole(entry.getKey()));
		}
		return items;

	}

	@Override
	public Role getRole(String name) {
		options.put(EMFJs.OPTION_ROOT_ELEMENT,
				ChefserverPackage.eINSTANCE.getRole());

		ResourceSetImpl resourceSet = new ResourceSetImpl();

		resourceSet.getURIConverter().getURIHandlers()
				.add(0, new ChefServerURIHandler());

		URI uri = URI.createURI(((Config) options.get("knifeConfig"))
				.getChef_server_url().toString() + "/roles/" + name);

		Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(options);
		} catch (IOException e) {
			e.printStackTrace();
			fail("failed to load resource");
		}

		Role eObject = (Role) resource.getContents().get(0);

		assertNotNull(eObject);
		assertTrue(eObject.getName() != null);

		return eObject;
	}

	@Override
	public Map<String, String> getRolesList() {
		URI uri = URI.createURI(getUrl().toString() + "/roles");
		try {

			assertNotNull(uri);
			ResourceSetImpl resourceSet = new ResourceSetImpl();

			HttpURLConnection connection = getConnection(new ChefRequest(uri,
					getConfig()), "GET");

			Map<String, Object> options = new HashMap<String, Object>();

			options.put(EMFJs.OPTION_ROOT_ELEMENT,
					UtilityPackage.eINSTANCE.getNameUrlMap());

			URL url = null;

			Resource resource = resourceSet.createResource(uri,
					"application/json");

			assertNotNull(resource);

			final InputStream inStream = connection.getInputStream();

			resource.load(inStream, options);

			inStream.close();

			NameUrlMap user = (NameUrlMap) resource.getContents().get(0);

			assertTrue(user.getEntries() != null);

			return user.getEntries().map();

		} catch (IOException e) {
			e.printStackTrace();
			fail("error");
		} finally {

		}

		return null;
	}

	@Override
	public InputStream getCookbookFileStream(CookbookFile cookbookFile) {
		HttpURLConnection connection;
		try {

			if (cookbookFile.getUrl().toString().contains("amazonaws.com")) {

				connection = (HttpURLConnection) cookbookFile.getUrl()
						.openConnection();

			} else {
				connection = getConnection(
						new ChefRequest(URI.createURI(cookbookFile.getUrl()
								.toString()), getConfig()), "GET");
			}

			final InputStream inStream = connection.getInputStream();

			ByteArrayOutputStream buffer = new ByteArrayOutputStream();

			int nRead;
			byte[] data = new byte[16384];

			while ((nRead = inStream.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
			}

			buffer.flush();
			inStream.close();

			return new ByteArrayInputStream(buffer.toByteArray());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getClient(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setClient(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<DataBag> getDataBags() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataBag getDataBag(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDataBag(String name) {
		// TODO Auto-generated method stub

	}

}
