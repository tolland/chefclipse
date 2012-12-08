package org.limepepper.chefclipse.emfjson.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.EMFJs;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.NameUrlMap;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.emfjson.EmfJsonWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmfJsonWrapperTest {
    static Logger logger = LoggerFactory.getLogger(EmfJsonWrapperTest.class);

    @Before
    public void setUp() throws Exception {

        Properties props = new Properties();

        KnifeConfig knifeConfig = KnifeFactory.eINSTANCE.createKnifeConfig();

        try {

            props.load(new FileInputStream("opscode-tests.properties"));

            knifeConfig = KnifeFactory.eINSTANCE.createKnifeConfig();
            knifeConfig.setChef_server_url(new URL(props
                    .getProperty("chef_server_url")));
            knifeConfig
                    .setClient_key(new File(props.getProperty("client_key")));
            knifeConfig.setNode_name(props.getProperty("client_name"));

            assertNotNull(props);
            assertTrue(knifeConfig.getClient_key().exists());
            assertTrue(knifeConfig.getNode_name().length() > 0);

        } catch (IOException ex) {
            ex.printStackTrace();
            fail();

        }
    }

    @Test
    public void testBasic1() {

        EmfJsonWrapper.instance().getOjectFromJson();

    }

    @Test
    public void testGetNodes() {
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
                "json", new JsResourceFactoryImpl());

        ResourceSetImpl resourceSet = new ResourceSetImpl();
        // EmfJsonWrapper.instance().getOjectFromJson();

        Map<String, Object> options = new HashMap<String, Object>();
        options.put(EMFJs.OPTION_ROOT_ELEMENT,
                ChefclipsePackage.eINSTANCE.getNameUrlMap());
        URL url = null;

        try {
            url = new URL("file:resources/node-list.json");

            InputStream inputStream = url.openConnection().getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    inputStream));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                // System.out.println(inputLine);
            }

            in.close();

            Resource resource = resourceSet.createResource(URI
                    .createURI("resources/node-list.json"));

            resource.load(options);

            NameUrlMap user = (NameUrlMap) resource.getContents().get(0);

            assertTrue(user.getEntry() != null);
            System.out.println("number of items was" + user.getEntry().size());

            for (Entry<String, String> iterable_element : user.getEntry()) {
                System.out.println(iterable_element.getKey() + ":val:"
                        + iterable_element.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
