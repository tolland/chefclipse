package org.limepepper.chefclipse.chefserver.api.ui.handler.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.NameUrlMap;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestChefServerApi {

    private Properties    props  = new Properties();
    private String        client_name;
    private File          client_key;
    private URL           chef_server_url;
    KnifeConfigController api    = KnifeConfigController.INSTANCE;
    KnifeConfig           knifeConfig;
    Logger                logger = LoggerFactory
                                         .getLogger(TestChefServerApi.class);

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

    ChefServerApi chefServer = null;

    @Test
    public void createServerObject() {

        chefServer = api.getServer(knifeConfig);
        assertNotNull(chefServer);

    }

    @Test
    public void test() {

        String headerInfo;
        if (chefServer == null) {
            createServerObject();
        }
        assertNotNull(chefServer);

        headerInfo = chefServer.getServerInfo();

        assertNotNull(headerInfo);
        System.out.println(headerInfo);

    }

    @Test
    public void testGetListOfNodesName() throws Exception {

        Properties props = new Properties();
        try {
            FileInputStream fis = new FileInputStream(
                    "opscode-tests.properties");
            props.load(fis);
            fis.close();
 

            NameUrlMap nodes = api.getServer(knifeConfig).getNodeList();
                    

            assertNotNull(nodes);
            assertTrue(nodes.getEntries().size() > 0);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
