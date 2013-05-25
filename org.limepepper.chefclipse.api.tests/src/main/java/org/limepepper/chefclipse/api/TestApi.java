package org.limepepper.chefclipse.api;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.Api;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;

public class TestApi {

    private final Properties props = new Properties();
    private String client_name;
    private File client_key;
    private URL chef_server_url;
    KnifeConfig knifeConfig;

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
    public void testApiGetNodes() {

        List<Node> list = Api.INSTANCE.getNodes(knifeConfig);
        assertNotNull(list);
        assertTrue(list.size() > 0);

    }

    @Test
    public void testApiGetSinglenode() {

        Node list = Api.INSTANCE.getNode(knifeConfig, "test1");
        assertNotNull(list);
        assertTrue(list.getName().length() > 0);

    }

}
