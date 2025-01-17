package org.limepepper.chefclipse.emfjson.chefserver.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.limepepper.chefclipse.emfjson.chefserver.internal.ChefServerClient.getConnection;
import static org.limepepper.chefclipse.emfjson.chefserver.internal.ChefServerClient.getContent;
import static org.limepepper.chefclipse.emfjson.chefserver.internal.ChefServerClient.getGetConnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.codehaus.jackson.JsonNode;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.EMFJs;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.emfjson.chefserver.ChefServerURIHandler;
import org.limepepper.chefclipse.emfjson.chefserver.internal.ChefRequest;
import org.limepepper.chefclipse.emfjson.chefserver.internal.ChefServerClient;
import org.limepepper.chefclipse.utility.NameUrlMap;
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class EmfJsonChefServerApiTest {

	static Logger logger = LoggerFactory
			.getLogger(EmfJsonChefServerApiTest.class);
	Map<String, Object> options = new HashMap<String, Object>();

	KnifeConfig knifeConfig = KnifeFactory.eINSTANCE.createKnifeConfig();

	@Before
	public void setUp() throws Exception {

		Properties props = new Properties();

		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
				"http", new JsResourceFactoryImpl());

		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
				"https", new JsResourceFactoryImpl());
		try {

			props.load(new FileInputStream("resources/opscode-tests.properties"));

			knifeConfig = KnifeFactory.eINSTANCE.createKnifeConfig();
			knifeConfig.setChef_server_url(new URL(props
					.getProperty("chef_server_url")));
			knifeConfig
					.setClient_key(new File(props.getProperty("client_key")));
			knifeConfig.setNode_name(props.getProperty("client_name"));

			assertNotNull(props);
			assertTrue(knifeConfig.getClient_key().exists());
			assertTrue(knifeConfig.getNode_name().length() > 0);

			options.put(EMFJs.OPTION_ROOT_ELEMENT,
					UtilityPackage.eINSTANCE.getNameUrlMap());

			options.put("knifeConfig", knifeConfig);
		} catch (IOException ex) {
			ex.printStackTrace();
			fail();

		}
	}

	@Test
	public void testNoAuthenticatedRequest() {

		int responseCode = 0;
		String responseMessage;

		if (knifeConfig == null)
			return;

		URI uri = URI.createURI(knifeConfig.getChef_server_url().toString()
				+ "/nodes");
		try {

			ChefServerClient
					.getGetConnection(new ChefRequest(uri, knifeConfig));
			HttpURLConnection connection = getGetConnection(new ChefRequest(
					uri, knifeConfig));
			InputStream inStream = connection.getInputStream();

			responseCode = connection.getResponseCode();

			logger.debug("response code was", connection.getResponseCode());
		} catch (IOException e) {
			e.printStackTrace();

			logger.debug("message was", e.getMessage());
		} finally {

		}
		System.out.println("response code uis:" + responseCode);
		// @todo this should fail
		// assertTrue(responseCode == 401);
		assertTrue(responseCode == 200);
	}

	@Test
	public void testGetRolesRawJsonUsingConfig() throws Exception {
		if (knifeConfig == null)
			return;

		URI uri = URI.createURI(knifeConfig.getChef_server_url().toString()
				+ "/roles");
		try {

			assertNotNull(uri);

			if (uri == null)
				throw new Exception("uri is null");

			ChefServerClient.getConnection(new ChefRequest(uri, knifeConfig),
					"GET");
			JsonNode json = getContent(new ChefRequest(uri, knifeConfig), "GET");

			assertNotNull(json);
			assertTrue(json.toString().contains("monitoring"));

			logger.debug(json.toString());

		} catch (IOException e) {
			e.printStackTrace();
			fail("error");
		} finally {

		}
	}

	@Test
	public void testGetNodesRawJsonUsingConfig() throws Exception {
		if (knifeConfig == null)
			return;

		URI uri = URI.createURI(knifeConfig.getChef_server_url().toString()
				+ "/nodes");
		try {

			assertNotNull(uri);

			if (uri == null)
				throw new Exception("uri is null");

			ChefServerClient.getConnection(new ChefRequest(uri, knifeConfig),
					"GET");
			JsonNode json = getContent(new ChefRequest(uri, knifeConfig), "GET");

			assertNotNull(json);
			assertTrue(json.toString().contains("test1"));

			logger.debug(json.toString());

		} catch (IOException e) {
			e.printStackTrace();
			fail("error");
		} finally {

		}
	}

	@Test
	public void testDeserializeNodeListUsingEmfJson() throws Exception {
		if (knifeConfig == null)
			return;

		URI uri = URI.createURI(knifeConfig.getChef_server_url().toString()
				+ "/nodes");
		try {

			assertNotNull(uri);
			ResourceSetImpl resourceSet = new ResourceSetImpl();

			if (uri == null)
				throw new Exception("uri is null");

			HttpURLConnection connection = getConnection(new ChefRequest(uri,
					knifeConfig), "GET");

			Map<String, Object> options = new HashMap<String, Object>();

			options.put(EMFJs.OPTION_ROOT_ELEMENT,
					UtilityPackage.eINSTANCE.getNameUrlMap());

			URL url = null;

			Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap()
					.put("application/json", new JsResourceFactoryImpl());

			Resource resource = resourceSet.createResource(uri,
					"application/json");

			assertNotNull(resource);

			final InputStream inStream = connection.getInputStream();

			resource.load(inStream, options);

			inStream.close();

			NameUrlMap user = (NameUrlMap) resource.getContents().get(0);

			assertTrue(user.getEntries() != null);
			System.out
					.println("number of items was" + user.getEntries().size());

			for (Entry<String, String> iterable_element : user.getEntries()) {
				System.out.println(iterable_element.getKey() + ":val:"
						+ iterable_element.getValue());
			}

		} catch (IOException e) {
			e.printStackTrace();
			fail("error");
		} finally {

		}
	}

	@Test
	public void testDeserializeNodeUsingUriHandler() throws Exception {

		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
				"http", new JsResourceFactoryImpl());

		Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
				"https", new JsResourceFactoryImpl());

		options.put(EMFJs.OPTION_ROOT_ELEMENT,
				ChefserverPackage.eINSTANCE.getNode());

		ResourceSetImpl resourceSet = new ResourceSetImpl();

		resourceSet.getURIConverter().getURIHandlers()
				.add(0, new ChefServerURIHandler());

		URI uri = URI.createURI(knifeConfig.getChef_server_url().toString()
				+ "/nodes/test1");

		Resource resource = resourceSet.createResource(uri);

		assertNotNull(resource);

		resource.load(options);

		Node node = (Node) resource.getContents().get(0);

		assertTrue(node.getName().equals("test1"));
	}

	@Test
	public void testGetCookbookVersionFromSErver() throws Exception {

		options.put(EMFJs.OPTION_ROOT_ELEMENT,
				ChefserverPackage.eINSTANCE.getServerCookbookVersion());

		ResourceSetImpl resourceSet = new ResourceSetImpl();
		// EmfJsonWrapper.instance().getOjectFromJson();

		resourceSet.getURIConverter().getURIHandlers()
				.add(0, new ChefServerURIHandler());

		URI uri = URI.createURI(knifeConfig.getChef_server_url().toString()
				+ "/cookbooks/apache2/_latest");

		Resource resource = resourceSet.createResource(uri);
		assertNotNull(resource);
		resource.load(options);

		ServerCookbookVersion user = (ServerCookbookVersion) resource
				.getContents().get(0);

		assertNotNull(user);
		assertTrue(user.getCookbook_name() != null);
		assertTrue(user.getRoot_files().size() > 0);

	}

}
