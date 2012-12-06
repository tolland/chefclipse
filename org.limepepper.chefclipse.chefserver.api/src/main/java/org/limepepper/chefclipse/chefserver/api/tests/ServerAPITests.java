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
import org.limepepper.chefclipse.REST.CookbookListResp;
import org.limepepper.chefclipse.REST.CookbookVersionResp;
import org.limepepper.chefclipse.chefserver.api.ChefServerAPI;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerAPITests {

    private Properties    props  = new Properties();
    private String        client_name;
    private File          client_key;
    private URL           chef_server_url;
    private ChefServerAPI chefServerAPI;
    KnifeConfig knifeConfig ;
    Logger                logger = LoggerFactory
                                         .getLogger(ServerAPITests.class);

    /**
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {

        try {

            props.load(new FileInputStream("opscode-tests.properties"));
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
    public void createServerObject() throws Exception {

        chefServerAPI = ChefServerAPI.getInstance(knifeConfig);
        assertNotNull(chefServerAPI);

    }

    @Test
    public void connectionTest() throws Exception {
        String headerInfo;

        if (chefServerAPI == null) {
            createServerObject();
        }
        assertNotNull(chefServerAPI);

        headerInfo = chefServerAPI.getServerInfo();

        assertNotNull(headerInfo);
        System.out.println(headerInfo);

    }

    @SuppressWarnings("deprecation")
    @Test
    public void getCookbooksTest() throws Exception {
        if (chefServerAPI == null) {
            createServerObject();
        }

        List<CookbookListResp> cookbook = chefServerAPI.getCookbooks();

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

        if (chefServerAPI == null) {
            createServerObject();
        }
        CookbookListResp cookbook = chefServerAPI.getCookbookInfo("apache2");

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
        if (chefServerAPI == null) {
            createServerObject();
        }

        CookbookVersionResp cookbook = chefServerAPI
                .getCookbookVersion("tomcat");

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
 * URL(chefServerAPI.getChef_server_url() + path), headers, null, false);
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
 * URL(chefServerAPI.getChef_server_url()
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

}
