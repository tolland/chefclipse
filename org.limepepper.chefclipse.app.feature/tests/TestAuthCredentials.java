package opscode.chef.REST.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import opscode.chef.REST.AuthCredentials;

import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestAuthCredentials {

    private Properties props  = new Properties();
    private String     client_name;
    private File       client_key;
    KnifeConfig             config;
    AuthCredentials    auth;

    Logger             logger = LoggerFactory
                                      .getLogger(TestAuthCredentials.class);

    @Before
    public void setUp() throws Exception {

        try {

            props.load(new FileInputStream("opscode-tests.properties"));
            client_name = props.getProperty("client_name");
            client_key = new File(props.getProperty("client_key"));
            assertNotNull(props);
            assertTrue(client_key.exists());

        } catch (IOException ex) {
            ex.printStackTrace();
            fail();

        }
    }

    @Test
    public void testWrapperConfig() throws Exception {

        auth = new AuthCredentials(client_name, client_key);
        assertNotNull(auth);

    }

    @Test
    public void testLoadKey() throws Exception {
        if (auth == null) {
            testWrapperConfig();
        }
        
        assertNotNull(auth.getRaw_key());
        assertTrue(auth.getRaw_key().length()>0);

    }

    @Test
    public void testsignatureHeaders() throws Exception {
        if (auth == null) {
            testLoadKey();
        }
        
        Map<String, String> request_params = new HashMap<String, String>();
        request_params.put("timestamp", "2012-11-14T11:02:00Z");
        request_params.put("client_name", "chefclipse");
        request_params.put("method", "GET");
        request_params.put("path", "/cookbooks");
        request_params.put("body", "");

        Map<String, String> auth_headers = new HashMap<String, String>();
        try {
            auth_headers =  auth.signature_headers(request_params);
        } catch (SignatureException | IllegalBlockSizeException
                | NoSuchPaddingException | BadPaddingException e) {
            e.printStackTrace();
            fail();
        }
        
        for (Entry<String, String> entry : auth_headers.entrySet()) {
            logger.debug("header:"+ entry.getValue());
        }
        
        for (String key : auth_headers.keySet()) {
            logger.debug( key + ":"+ auth_headers.get(key));
        }
        
        assertTrue(auth_headers.size()>0);
        
        

    }
}
