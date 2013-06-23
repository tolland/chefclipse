package org.limepepper.chefclipse.dltk.tests;

import org.eclipse.core.runtime.Path;
import org.eclipse.dltk.core.IScriptModel;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.limepepper.chefclipse.dltk.model.ChefParser;
import org.limepepper.chefclipse.dltk.model.ModelRoot;
import org.limepepper.chefclipse.dltk.model.Resource;
import org.limepepper.chefclipse.dltk.tests.utils.AbstractModelTests;

public class ChefParserTest extends AbstractModelTests {

	private static final String PROJECT_NAME = "chefparser";

	public ChefParserTest(String name) {
		super(Activator.PLUGIN_ID, name);
	}

	public void setUp() throws Exception {
		super.setUp();
		setUpScriptProject(PROJECT_NAME);
		waitUntilIndexesReady();
	}

	public void tearDown() throws Exception {
		deleteProject(PROJECT_NAME);
		super.tearDown();
	}

	/**
	 * Verify that chef resources are properly extracted from the openjdk.rb script
	 * @throws ModelException
	 */
	public void testParser() throws ModelException {
		final IScriptModel model = getScriptModel();
		final IScriptProject project1 = model.getScriptProject(PROJECT_NAME);
		assertNotNull(project1);
		final ISourceModule sourceModule = (ISourceModule) project1
				.findElement(new Path("openjdk.rb"));
		assertNotNull(sourceModule);
		
		ChefParser chefParser = new ChefParser();
		ModelRoot modelRoot = chefParser.parse(sourceModule);
		assertNotNull(modelRoot);
		assertEquals(modelRoot.getResources().size(), 2);
		
		Resource resource = modelRoot.getResources().get(0);
		assertEquals(resource.getName(), "\"set-env-java-home\"");
		
	}

}
