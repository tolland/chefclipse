package opscode.chef.REST.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import opscode.chef.REST.AuthCredentials;

import org.junit.Before;
import org.junit.Test;

public class JSONWrapperTests {

    private Properties props = new Properties();
    private URL        rest_server_url;
    private String              client_name;
    private File                client_key;
    AuthCredentials auth;

    /**
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {

        try {

            props.load(new FileInputStream("resources/opscode-tests.properties"));
            client_name = props.getProperty("client_name");
            rest_server_url = new URL(props.getProperty("rest_server_url"));
            client_key = new File(props.getProperty("client_key"));
            assertNotNull(props);
            assertTrue(rest_server_url.toString().length() > 0);
            assertTrue(client_key.exists());

        } catch (IOException ex) {
            ex.printStackTrace();
            fail();

        }
    }

    @Test
    public void testWrapperConfig() throws Exception {

      auth   = new AuthCredentials(client_name, client_key);
        assertNotNull(auth);

    }

}
