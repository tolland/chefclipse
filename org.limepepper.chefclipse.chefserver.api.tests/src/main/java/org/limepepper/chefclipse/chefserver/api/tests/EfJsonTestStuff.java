package org.limepepper.chefclipse.chefserver.api.tests;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.EMFJs;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.MinimalMetadata;

public class EfJsonTestStuff {

    ResourceSet resourceSet = null;

    @Before
    public void setUp() throws Exception {

        resourceSet = new ResourceSetImpl();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
                "json", new JsResourceFactoryImpl());

    }

    @Test
    public void testIn() throws IOException {
        MinimalMetadata cookbook = CookbookFactory.eINSTANCE
                .createMinimalMetadata();

        Resource resource = resourceSet.createResource(URI
                .createURI("resources/model2.json"));
        Map<String, Object> options = new HashMap<String, Object>();
        options.put(EMFJs.OPTION_INDENT_OUTPUT, true);
        options.put(EMFJs.OPTION_SERIALIZE_TYPE, false);

        resource.getContents().add(cookbook);
        resource.save(System.out, options);

       // Debug.inspect(cookbook);
    }

    @Test
    public void testOut() throws Exception {

        Map<String, Object> options = new HashMap<String, Object>();
        options.put(EMFJs.OPTION_ROOT_ELEMENT,
                CookbookPackage.eINSTANCE.getMinimalMetadata());

        Resource resource = resourceSet.createResource(URI
                .createURI("resources/model1.json"));
        assertNotNull(resource);
        resource.load(options);

        assertNotNull(resource);
        MinimalMetadata user = (MinimalMetadata) resource.getContents().get(0);

        System.err.println("hgyg");
        System.err.println(user.getVersion());

       // Debug.inspect(user);

    }

    @Test
    public void testMetadataDeserialization() throws Exception {
        resourceSet = new ResourceSetImpl();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
                "json", new JsResourceFactoryImpl());
        Map<String, Object> options = new HashMap<String, Object>();
        options.put(EMFJs.OPTION_ROOT_ELEMENT,
                CookbookPackage.eINSTANCE.getMinimalMetadata());

        Resource resource = resourceSet.createResource(URI
                .createURI("resources/metadata.json"));
        assertNotNull(resource);
        resource.load(options);

        assertNotNull(resource);
        MinimalMetadata user = (MinimalMetadata) resource.getContents().get(0);

    }

}
