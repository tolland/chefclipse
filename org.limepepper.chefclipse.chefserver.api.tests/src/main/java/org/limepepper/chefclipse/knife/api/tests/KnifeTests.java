package org.limepepper.chefclipse.knife.api.tests;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;

public class KnifeTests {
    /**
     * @todo no idea!
     *
     */
    private ResourceSet                  resourceSet    = new ResourceSetImpl();
    private Resource                     masterResource = null;
    @Before
    public void setUp() throws Exception {
    }

    //@SuppressWarnings("deprecation")
    @Test
    public void testGenerateMetadata() {

        /*
         *         URI fileURI = URI.createPlatformResourceURI(path, true);
        masterResource = resourceSet.createResource(fileURI);
         *
         */


/*        Map<String, Object> options = new HashMap<String, Object>();
        options.put(JsURIHandlerImpl.OPTION_ROOT_ELEMENT,
                CookbookPackage.eINSTANCE.getCookbookVersion());

        Resource resource = resourceSet.createResource(
                URI.createPlatformResourceURI(
                        ("file:cookbookVersion.json"))
                        );
        resource.load(options);

        CookbookVersion user = (CookbookVersion) resource.getContents().get(0);*/

    }

    @Test
    public void testLoadMetaData() throws Exception {



    }

}
