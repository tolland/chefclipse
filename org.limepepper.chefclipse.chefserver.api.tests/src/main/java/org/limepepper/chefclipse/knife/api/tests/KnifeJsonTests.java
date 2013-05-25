package org.limepepper.chefclipse.knife.api.tests;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
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
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.Metadata;

public class KnifeJsonTests {
	/**
	 * @todo no idea!
	 *
	 */
	private ResourceSet resourceSet = new ResourceSetImpl();

	@Before
	public void setUp() throws Exception {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"json", new JsResourceFactoryImpl());

	}

	@Test
	public void testLoadMetaData() throws Exception {

		resourceSet = new ResourceSetImpl();

		Map<String, Object> options = new HashMap<String, Object>();
		options.put(EMFJs.OPTION_ROOT_ELEMENT,
				CookbookPackage.eINSTANCE.getMetadata());
		URL url = null;

		try {
			url = new URL("file:resources/knife-generated-metadata.json");

			InputStream inputStream = url.openConnection().getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					inputStream));
			while ((in.readLine()) != null) {
				// System.out.println(inputLine);
			}

			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		Resource resource = resourceSet.createResource(URI
				.createURI("resources/knife-generated-metadata.json"));

		resource.load(options);

		Metadata user = (Metadata) resource.getContents().get(0);

		assertTrue(user.getName().equals("php"));
	}

}
