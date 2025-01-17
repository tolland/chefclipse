/**
 *
 */
package org.limepepper.chefclipse.preferences.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.preferences.api.ChefConfigManager;
import org.limepepper.chefclipse.utility.Config;

/**
 * JUnit Plugin Test.
 *
 * @author Guillermo Zunino
 */
public class ChefConfigManagerTest {

	private static final KnifeFactory factory = KnifeFactory.eINSTANCE;
	private ChefConfigManager manager;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		manager = ChefConfigManager.instance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	@Ignore
	public void testSaveInvalidProjectConfig() {
		IProject project = mockProject();
		Config config = mock(KnifeConfig.class, RETURNS_MOCKS);

		manager.saveProjectChefConfig(project, config);

		Config savedConfig = manager.retrieveProjectChefConfig(project);
		assertThat(savedConfig, nullValue());
	}

	@Test
	@Ignore
	public void testSaveValidProjectConfig() {
		IProject project = mockProject();
		KnifeConfig config = createConfig();

		manager.saveChefConfigs(Collections.singletonList(config));
		manager.saveProjectChefConfig(project, config);

		KnifeConfig savedConfig = manager.retrieveProjectChefConfig(project);
		assertThat(savedConfig, notNullValue());
		assertThat(savedConfig.getNode_name(), equalTo(config.getNode_name()));
		assertThat(savedConfig.getChef_server_url(), equalTo(config.getChef_server_url()));
	}

	private IProject mockProject() {
		IProject project = mock(IProject.class, RETURNS_MOCKS);
		when(project.getProject()).thenReturn(project);
		when(project.isAccessible()).thenReturn(true);
		return project;
	}

	private KnifeConfig createConfig() {
		KnifeConfig config = factory.createKnifeConfig();
		config.setNode_name("node1");
		try {
			config.setChef_server_url(new URL("http://server.com"));
		} catch (MalformedURLException e) {
		}
		return config;
	}
}
