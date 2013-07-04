/**
 * 
 */
package org.limepepper.chefclipse.json.tests;

import static org.fest.assertions.api.Assertions.*;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.limepepper.chefclipse.databag.editor.editors.DataBagEditorManager;
import org.limepepper.chefclipse.json.JsonInjectorProvider;
import org.limepepper.chefclipse.json.json.JsonObjectValue;
import org.limepepper.chefclipse.json.json.Model;
import org.limepepper.chefclipse.json.json.Value;

/**
 * @author Guillermo Zunino
 *
 */
@InjectWith(JsonInjectorProvider.class)
@RunWith(XtextRunner.class)
public class DatabagSchemaTest {

	private XtextResourceSet resSet;
	private Resource res1;
	private Resource res2;
	private Resource res3;
	private DataBagEditorManager manager;

	@Before
	public void setUp() throws Exception {
		resSet = new XtextResourceSet();
		res1 = resSet.getResource(URI.createFileURI("resources/databagItem1.json"), true);
		assertThat(res1).isNotNull();
		res2 = resSet.getResource(URI.createFileURI("resources/databagItem2.json"), true);
		assertThat(res2).isNotNull();
		res3 = resSet.getResource(URI.createFileURI("resources/databagItem3.json"), true);
		assertThat(res3).isNotNull();
		manager = DataBagEditorManager.INSTANCE;
	}
	
	@Test
	public void testSchema() {
		Model schema = manager.createSchemaModel(resSet);
		assertThat(schema).isNotNull();
		Resource schemaRes = new XMIResourceImpl();
		schemaRes.getContents().add(schema);
		
		assertSchemaContains(schemaRes, res1);
		assertSchemaContains(schemaRes, res2);
		assertSchemaContains(schemaRes, res3);
	}

	private void assertSchemaContains(Resource schemaRes, Resource res) {
		assertThat(res.getContents()).isNotEmpty();
		TreeIterator<EObject> resIt = res.getAllContents();
		while (resIt.hasNext()) {
			EObject eObject = (EObject) resIt.next();
			String fragment = res.getURIFragment(eObject);
			EObject schemaObj = schemaRes.getEObject(fragment);
			
			if (eObject instanceof Value && !(eObject instanceof JsonObjectValue)) {
				assertThat(schemaObj).as("primitive value not in schema").isNull();
			} else {
				assertThat(schemaObj).isNotNull();
				assertThat(eObject).isNotSameAs(schemaObj);
				
				assertNotDuplicated(schemaRes, fragment);
			}
		}
	}

	private void assertNotDuplicated(Resource schemaRes, String fragment) {
		boolean found = false;
		TreeIterator<EObject> resIt = schemaRes.getAllContents();
		while (resIt.hasNext()) {
			EObject eObject = (EObject) resIt.next();
			if (schemaRes.getURIFragment(eObject).equals(fragment)) {
				if (found) {
					fail(fragment + " already found, duplicated in: "+ eObject);
				}
				found = true;
			}
		}
		assertThat(found).as("fragment " + fragment + " not found on schema").isTrue();
	}
	
}
