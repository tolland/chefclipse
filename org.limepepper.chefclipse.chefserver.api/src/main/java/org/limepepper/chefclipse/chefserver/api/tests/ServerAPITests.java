package org.limepepper.chefclipse.chefserver.api.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Properties;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.NameUrlMap;
import org.limepepper.chefclipse.REST.CookbookListResp;
import org.limepepper.chefclipse.REST.CookbookVersionResp;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerAPITests {

    private Properties    props  = new Properties();
    private String        client_name;
    private File          client_key;
    private URL           chef_server_url;
    private ChefServerApi chefServerApi;
    KnifeConfig           knifeConfig;
    Logger                logger = LoggerFactory
                                         .getLogger(ServerAPITests.class);

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

        headerInfo = api.getServer(knifeConfig).getServerInfo();

        assertNotNull(headerInfo);
        System.out.println(headerInfo);

    }

    @SuppressWarnings("deprecation")
    @Test
    public void getCookbooksTest() throws Exception {
        if (chefServerApi == null) {
            createServerObject();
        }

        List<CookbookListResp> cookbook = chefServerApi.getCookbooks();

        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.defaultPrettyPrintingWriter()
                    .writeValueAsString(cookbook));
        } catch (JsonGenerationException | JsonMappingException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void getCookbookInfoVersionsTest() throws Exception {

        if (chefServerApi == null) {
            createServerObject();
        }
        CookbookListResp cookbook = chefServerApi.getCookbookInfo("apache2");

        assertNotNull(cookbook);

        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.defaultPrettyPrintingWriter()
                    .writeValueAsString(cookbook));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Test
    public void getCookbookVersionTest() throws Exception {
        if (chefServerApi == null) {
            createServerObject();
        }

        CookbookVersionResp cookbook = chefServerApi
                .getCookbookVersion("tomcat", "_latest");

        assertNotNull(cookbook);

        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.defaultPrettyPrintingWriter()
                    .writeValueAsString(cookbook));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

/*
 * @Test
 * public void testGetCookbookInfo() throws Exception {
 *
 * if (auth == null) {
 * createAuthenticationObject();
 * }
 *
 * ClientConfig cc = new DefaultClientConfig();
 *
 * ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
 * // CookbookInfoREST cookbook = mapper.readValue(new File("user.json"),
 * User.class);
 *
 * cc.getClasses().add( CookbookListResp.class);
 * cc.getClasses().add( JSONListElementProvider.General.class);
 *
 * cc.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
 * Client c = Client.create(cc);
 *
 * JSONRestWrapper jSONRestWrapper = new JSONRestWrapper(auth,c);
 *
 * Map<String, List<String>> params = new HashMap<String, List<String>>();
 * // params.put("num_versions", Arrays.asList(new String[] { "1" }));
 *
 * final String method = "GET";
 *
 * Map<String, String> headers = new HashMap<String, String>();
 *
 * MultivaluedMap<String, String> query_params = new MultivaluedMapImpl();
 * query_params.putAll(params);
 *
 * WebResource.Builder builder =
 * jSONRestWrapper.getService().path("/cookbooks/apache2")
 * .queryParams(query_params).getRequestBuilder();
 *
 * Map<String, String> auth_headers = null;
 * try {
 * String path = "/cookbooks/apache2";
 * auth_headers = jSONRestWrapper.build_headers(method, new
 * URL(chefServerApi.getChef_server_url() + path), headers, null, false);
 * } catch (MalformedURLException e) {
 * e.printStackTrace();
 * }
 * for (String key : auth_headers.keySet()) {
 * builder.header(key, auth_headers.get(key));
 * }
 *
 * System.out.println( builder.accept(MediaType.APPLICATION_JSON_TYPE).get(
 * CookbookListResp.class ));
 * }
 *
 * @Test
 * public void testGetCookbooksInfo() throws Exception {
 *
 * if (auth == null) {
 * createAuthenticationObject();
 * }
 *
 * ClientConfig cc = new DefaultClientConfig();
 *
 * ObjectMapper mapper = new ObjectMapper(); // can reuse, share globally
 * // CookbookInfoREST cookbook = mapper.readValue(new File("user.json"),
 * User.class);
 *
 * cc.getClasses().add( CookbookListResp.class);
 * cc.getClasses().add( JSONListElementProvider.General.class);
 *
 * cc.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
 * Client c = Client.create(cc);
 *
 * JSONRestWrapper jSONRestWrapper = new JSONRestWrapper(auth,c);
 *
 * Map<String, List<String>> params = new HashMap<String, List<String>>();
 * // params.put("num_versions", Arrays.asList(new String[] { "1" }));
 *
 * final String method = "GET";
 *
 * Map<String, String> headers = new HashMap<String, String>();
 *
 * MultivaluedMap<String, String> query_params = new MultivaluedMapImpl();
 * query_params.putAll(params);
 *
 * WebResource.Builder builder = jSONRestWrapper.getService().path("/cookbooks")
 * .queryParams(query_params).getRequestBuilder();
 *
 * Map<String, String> auth_headers = null;
 * try {
 * String path = "/cookbooks";
 * auth_headers = jSONRestWrapper.build_headers(method, new
 * URL(chefServerApi.getChef_server_url()
 * .toString() + path), headers, null, false);
 * } catch (MalformedURLException e) {
 * e.printStackTrace();
 * }
 * for (String key : auth_headers.keySet()) {
 * builder.header(key, auth_headers.get(key));
 * }
 *
 * System.out.println( builder.accept(MediaType.APPLICATION_JSON_TYPE).get(
 * String.class ));
 * }
 */
    @Test
    public void getRolesTest() {

        if (chefServerApi == null) {
            createServerObject();
        }

        NameUrlMap roles = chefServerApi.getRoleList();
        assertNotNull(roles);
        assertNotNull(roles.getEntries());
        assertTrue(roles.getEntries().size()>0);
        assertTrue(roles.getEntries().get(0).getValue().length()>0);
    }

    @Test
    public void getNodesTest() {

        if (chefServerApi == null) {
            createServerObject();
        }

        NameUrlMap nodes = chefServerApi.getNodeList();
        assertNotNull(nodes);
        assertNotNull(nodes.getEntries());
        assertTrue(nodes.getEntries().size()>0);
        assertTrue(nodes.getEntries().get(0).getValue().length()>0);
    }



    @Test
    public void getCookbooksTest2() {

        if (chefServerApi == null) {
            createServerObject();
        }

        List<CookbookListResp> nodes = chefServerApi.getCookbooks();
        assertNotNull(nodes);    }






}
