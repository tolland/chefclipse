package org.limepepper.chefclipse.chefserver.api.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.RunList;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Root_file;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.tools.ChefUtils;
import org.limepepper.chefclipse.utility.VersionUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerAPITests {

	private Properties props = new Properties();
	private String client_name;
	private File client_key;
	private URL chef_server_url;
	private ChefServerApi chefServerApi;
	KnifeConfig knifeConfig;
	static Logger logger = LoggerFactory.getLogger(ServerAPITests.class);

	KnifeConfigController api = KnifeConfigController.INSTANCE;

	/**
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {

		try {

			props.load(new FileInputStream("resources/opscode-tests.properties"));
			client_name = props.getProperty("client_name");
			client_key = new File(props.getProperty("client_key"));
			chef_server_url = new URL(props.getProperty("chef_server_url"));

			knifeConfig = KnifeFactory.eINSTANCE.createKnifeConfig();
			knifeConfig.setChef_server_url(chef_server_url);
			knifeConfig.setClient_key(client_key);
			knifeConfig.setNode_name(client_name);

			assertNotNull(props);
			assertTrue(client_key.exists());
			assertTrue(client_name.length() > 0);

		} catch (IOException ex) {
			ex.printStackTrace();
			fail();

		}

	}

	@Test
	public void createServerObject() {

		chefServerApi = api.getServer(knifeConfig);
		assertNotNull(chefServerApi);

	}

	@Test
	public void connectionTest() throws Exception {
		String headerInfo;

		if (chefServerApi == null) {
			createServerObject();
		}

		assertNotNull(chefServerApi);
		headerInfo = chefServerApi.getServerInfo();
		assertNotNull(headerInfo);

	}

	@Test
	public void getNodesListTest() {

		if (chefServerApi == null) {
			createServerObject();
		}

		Map<String, String> items = chefServerApi.getNodeList();
		assertNotNull(items);
		assertNotNull(items.keySet());
		assertTrue(items.keySet().size() > 0);

	}

	@Test
	public void getCookbookListTest() {

		if (chefServerApi == null) {
			createServerObject();
		}

		Map<String, VersionUrl> items = chefServerApi.getCookbookList();
		assertNotNull(items);
		assertNotNull(items.keySet());
		assertTrue(items.keySet().size() > 0);
		assertNotNull(items.keySet().iterator().next());
	}

	@Test
	public void getCookbooksTest2() {

		if (chefServerApi == null) {
			createServerObject();
		}

		List<ServerCookbookVersion> items = chefServerApi.getCookbooks();
		assertNotNull(items);
		assertTrue(items.size() > 0);

	}

	@Test
	public void getCookbookVersionTest1() {

		if (chefServerApi == null) {
			createServerObject();
		}

		ServerCookbookVersion cookbook = chefServerApi
				.getCookbookVersion("sudo");

		assertNotNull(cookbook);
		assertTrue(cookbook.getCookbook_name().equals("sudo"));
		assertTrue(cookbook.getRecipes().size() > 0);

	}

	@Test
	public void getCookbookVersionTest2() throws Exception {
		if (chefServerApi == null) {
			createServerObject();
		}

		ServerCookbookVersion cookbook = chefServerApi
				.getCookbookVersion("XXchecksum-test-cookbook");

		assertNotNull(cookbook);
		assertTrue(cookbook.getCookbook_name().equals(
				"XXchecksum-test-cookbook"));
		assertTrue(cookbook.getRecipes().size() > 0);
		assertTrue(cookbook.getRoot_files().size() > 0);
		assertTrue(!cookbook.getVersion().equals(""));

	}

	/*
	 *
	 * "name":"metadata.rb", "url":
	 * "https://s3.amazonaws.com/opscode-platform-production-data/organization-203fc1d14d95451f9fe423d0b8b121d7/checksum-dae935bbc74049333a3a4997211ea470?AWSAccessKeyId=AKIAIN4GUX4PULV7JQSA&Expires=1355431779&Signature=5fdND7dqhIZCxN45qTGlv7o5Of8%3D"
	 * , "checksum":"dae935bbc74049333a3a4997211ea470", "path":"metadata.rb",
	 * "specificity":"default"
	 */

	@Test
	public void getCookbookVersionTest3() throws Exception {
		if (chefServerApi == null) {
			createServerObject();
		}

		ServerCookbookVersion cookbook = chefServerApi
				.getCookbookVersion("XXchecksum-test-cookbook");

		assertNotNull(cookbook);
		assertTrue(cookbook.getCookbook_name().equals(
				"XXchecksum-test-cookbook"));
		assertTrue(cookbook.getRecipes().size() > 0);
		assertTrue(cookbook.getRoot_files().size() > 0);
		assertTrue(!cookbook.getVersion().equals(""));
		for (Root_file file : cookbook.getRoot_files()) {
			logger.debug("chefserver: " + file.getName() + "-->checksum: {}",
					file.getChecksum());
			if (file.getName().equals("metadata.rb")) {
				assertTrue(file.getChecksum().equals(
						"dae935bbc74049333a3a4997211ea470"));
				assertTrue(file.getChecksum().length() > 0);
			}
		}
	}

	@Test
	public void checkMd5matchesExpectedTest() throws IOException {
		if (chefServerApi == null) {
			createServerObject();
		}

		FileInputStream fis = new FileInputStream("resources/metadata.rb");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int available = bis.available();
		byte[] filebytes = new byte[bis.available()];

		int read = bis.read(filebytes);

		assertTrue(read == available);

		String md5sum = ChefUtils.hexMd5Sum(filebytes);

		assertTrue("dae935bbc74049333a3a4997211ea470".equals(md5sum));

		logger.debug("md5 sum was {}", md5sum);

		bis.close();
		fis.close();

	}

	@Test
	public void getEnvironmentsListTest() {

		if (chefServerApi == null) {
			createServerObject();
		}

		Map<String, String> items = chefServerApi.getEnvironmentsList();
		assertNotNull(items);
		assertNotNull(items.keySet());
		assertTrue(items.keySet().size() > 0);

	}

	@Test
	public void getEnvironmentsTest() {

		if (chefServerApi == null) {
			createServerObject();
		}

		List<Environment> items = chefServerApi.getEnvironments();
		assertNotNull(items);
		assertTrue(items.size() > 0);

	}

	@Test
	public void getEnvironmentTest() {

		if (chefServerApi == null) {
			createServerObject();
		}

		Environment item = chefServerApi.getEnvironment("_default");
		assertNotNull(item);
		assertTrue(item.getName().equals("_default"));

	}

	@Test
	public void getRolesListTest() {

		if (chefServerApi == null) {
			createServerObject();
		}

		Map<String, String> items = chefServerApi.getRolesList();
		assertNotNull(items);
		assertNotNull(items.keySet());
		assertTrue(items.keySet().size() > 0);

	}

	@Test
	public void getRolesTest() {

		if (chefServerApi == null) {
			createServerObject();
		}

		List<Role> items = chefServerApi.getRoles();
		assertNotNull(items);
		assertTrue(items.size() > 0);

	}

	@Test
	public void getRoleTest() {

		if (chefServerApi == null) {
			createServerObject();
		}

		Role item = chefServerApi.getRole("monitoring");
		assertNotNull(item);
		assertTrue(item.getName().equals("monitoring"));

	}

	@Test
	public void getDataBagsItemsTest() {

		if (chefServerApi == null) {
			createServerObject();
		}

		List<DataBagItem> items = chefServerApi.getDataBagItems("users");
		assertNotNull(items);
		assertTrue(items.size() > 0);

	}

/*	@Test
	public void getDataBagTest() {

		if (chefServerApi == null) {
			createServerObject();
		}

		DataBag item = chefServerApi.getDataBag("users");
		assertNotNull(item);
		assertTrue(item.getName().equals("users"));

	}*/

	@Test
	public void getDataBagItemsListTest() {

		if (chefServerApi == null) {
			createServerObject();
		}

		Map<String, String> items = chefServerApi.getDataBagItemsList("users");
		assertNotNull(items);
		assertTrue(items.get("tomhodder") != null);
		System.out.println(items.get("tomhodder"));

	}

	@Test
	public void getDataBagItemTest() {

		if (chefServerApi == null) {
			createServerObject();
		}

		DataBagItem item = chefServerApi.getDataBagItem("users", "tomhodder");
		assertNotNull(item);
		assertTrue(item.getId().equals("tomhodder"));

	}

	/*
	 * @Test public void getDataBagItemTest() {
	 *
	 * if (chefServerApi == null) { createServerObject(); }
	 *
	 * DataBagItem item = chefServerApi.getDataBagItem("users","tomhodder");
	 * assertNotNull(item); assertTrue(item.getName().equals("tomhodder"));
	 *
	 * }
	 */

	@Test
	public void getNodeRunListTest() {

		if (chefServerApi == null) {
			createServerObject();
		}

		Node item = chefServerApi.getNode("node2");
		assertNotNull(item);
		assertNotNull(item.getName());

		RunList runList = item;
		assertNotNull(runList);
		assertNotNull(runList.getRun_list_items());
		assertTrue(runList.getRun_list_items().size() > 0);
		assertNotNull(runList.getRun_list_items().get(0));

	}

}
