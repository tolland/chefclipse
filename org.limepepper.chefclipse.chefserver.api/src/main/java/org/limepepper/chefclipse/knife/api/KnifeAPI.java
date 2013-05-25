package org.limepepper.chefclipse.knife.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipselabs.emfjson.EMFJs;
import org.eclipselabs.emfjson.resource.JsResourceFactoryImpl;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Metadata;

public class KnifeAPI implements IKnifeAPI {

    ResourceSet                    resourceSet = null;

    // @todo this was some attempt to provide singleton per repo support...
    private static List<IKnifeAPI> instances   = new ArrayList<IKnifeAPI>();

    public static IKnifeAPI instance() throws IOException {

        return instance("default");
    }

    public static IKnifeAPI instance(String name) throws IOException {
        IKnifeAPI knifeAPI = null;
        if (instances.isEmpty()) {
            knifeAPI = new KnifeAPI();
            instances.add(knifeAPI);
            return knifeAPI;
        }
        // @todo but current is only implemented for the 1
        return instances.get(0);
    }

    private KnifeAPI() throws IOException {

        resourceSet = new ResourceSetImpl();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
                "json", new JsResourceFactoryImpl());

    }

    @Override
    public void createCookbook(String name) {
    }

    @Override
    public void generateAllMetadata() {

    }

    @Override
    public void generateMetadata(String name) {

    }

    @Override
    public Metadata getMetadata(String name) {

        return null;
    }

    @Override
    public Metadata getMetadata(CookbookVersion cookbook) {

        Map<String, Object> options = new HashMap<String, Object>();
        options.put(EMFJs.OPTION_ROOT_ELEMENT,
                CookbookPackage.eINSTANCE.getMetadata());

/*
 * ChefRep
 * 
 * Resource resource = resourceSet.createResource(URI
 * .createURI("metadata.json"));
 * assertNotNull(resource);
 * try {
 * resource.load(options);
 * } catch (IOException e) {
 * e.printStackTrace();
 * }
 * 
 * assertNotNull(resource);
 * MinimalMetadata user = (MinimalMetadata) resource.getContents().get(0);
 */

        return null;
    }

    @Override
    public Metadata getCookbookMetadata(File file) {
        Map<String, Object> options = new HashMap<String, Object>();
        options.put(EMFJs.OPTION_ROOT_ELEMENT,
                CookbookPackage.eINSTANCE.getMetadata());


        Metadata user = null;
        Resource resource;
        try {
            resource = resourceSet.createResource(URI
                    .createFileURI(file.getCanonicalPath()));

            resource.load(options);
          user = (Metadata) resource.getContents().get(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user;
    }
}
