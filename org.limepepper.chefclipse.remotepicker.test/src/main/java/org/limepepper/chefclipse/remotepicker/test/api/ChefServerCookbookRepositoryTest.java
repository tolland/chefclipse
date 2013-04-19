/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.test.api;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryFactory;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.repositories.ChefServerCookbookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Guillermo Zunino
 *
 */
public class ChefServerCookbookRepositoryTest {
	
	final static Logger logger = LoggerFactory.getLogger(ChefServerCookbookRepositoryTest.class);
	
	private static final CookbookrepositoryFactory factory = CookbookrepositoryFactory.eINSTANCE;

	private ChefServerCookbookRepository repo = null;
	
	@Before
	public void setup() throws IOException {
		String serverFile = "resources/opscode-tests.properties";
		
		KnifeConfig knifeConfig = createKnifeConfig(serverFile);
		
		repo = new ChefServerCookbookRepository(knifeConfig);	
	}

	/**
	 * @param file
	 * @return
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws MalformedURLException
	 */
	protected KnifeConfig createKnifeConfig(String file) throws FileNotFoundException,
			MalformedURLException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream(file));
        String client_name = props.getProperty("client_name");
        File client_key = new File(props.getProperty("client_key"));
        URL chef_server_url = new URL(props.getProperty("chef_server_url"));

        KnifeConfig knifeConfig = KnifeFactory.eINSTANCE.createKnifeConfig();
        knifeConfig.setChef_server_url(chef_server_url);
        knifeConfig.setClient_key(client_key);
        knifeConfig.setNode_name(client_name);
		return knifeConfig;
	}
	
	@Test
	public void testGetCookbook() {
		RemoteCookbook cookbook = repo.getCookbook("apache2");
		
		assertThat(cookbook, notNullValue());
		assertThat(cookbook.getMaintainer(), equalTo("Opscode, Inc."));
		assertThat(cookbook.getName(), equalTo("apache2"));
		assertThat(cookbook.getCategory(), equalTo("Chef::CookbookVersion"));
		assertThat(cookbook.getExternalUrl(), equalTo("https://api.opscode.com/organizations/chefclipse/cookbooks/apache2/1.0.8"));
		assertThat(cookbook.getUrl(), equalTo("https://api.opscode.com/organizations/chefclipse/cookbooks/apache2/1.0.8"));
		assertThat(cookbook.getDescription(), equalTo("Installs and configures all aspects of apache2 using Debian style symlinks with helper definitions"));
		assertThat(cookbook.getLatestVersion(), equalTo("https://api.opscode.com/organizations/chefclipse/cookbooks/apache2/1.0.8"));
		assertThat(cookbook.getVersions(), hasItem("https://api.opscode.com/organizations/chefclipse/cookbooks/apache2/1.0.8"));
		assertThat(cookbook.getCreatedAt(), nullValue());
		assertThat(cookbook.getInstalledAt(), nullValue());
		assertThat(cookbook.getUpdatedAt(), nullValue());
		assertThat(cookbook.getRating(), equalTo(0.0));
		assertThat(cookbook.getReplacement(), nullValue());
	}
	
	@Test
	public void testGetCookbooks() {
		long t1 = System.currentTimeMillis();
		
		List<RemoteCookbook> results = (List<RemoteCookbook>) repo.getCookbooks();
		assertThat(results, notNullValue());
		logger.info("get {} Cookbooks in {}ms", results.size(), System.currentTimeMillis() - t1);
		assertThat(results.size(), greaterThan(2));
		assertThat(results.get(0).getName(), not(isEmptyOrNullString()));
		assertThat(results.get(0).getDescription(), not(isEmptyOrNullString()));
		assertThat(results.get(0).getUrl(), not(isEmptyOrNullString()));
		assertThat(results.get(2).getName(), not(isEmptyOrNullString()));
		assertThat(results.get(2).getDescription(), not(isEmptyOrNullString()));
		assertThat(results.get(2).getUrl(), not(isEmptyOrNullString()));
		
		RemoteRepository mockRepo = factory.createRemoteRepository();
		mockRepo.getCookbooks().addAll(results);
		
		assertThat("Repo should not be updated", repo.isUpdated(mockRepo), is(false));
	}
	
	@Test
	public void testReadableVersion() {
		RemoteCookbook cookbook = factory.createRemoteCookbook();
		
		String version = repo.getReadableVersion(cookbook, "http://cookbook.com/cookbooks/apache/1.2.1");
		assertThat(version, equalTo("1.2.1"));
		version = repo.getReadableVersion(cookbook, "http://cookbook.com/cookbooks/apache/1.2/");
		assertThat(version, equalTo("1.2"));
	}
	
	@Test
	public void testIsUpdated() {
		RemoteRepository r = factory.createRemoteRepository();
		
		assertThat(repo.isUpdated(r), is(true));
	}

	@Test
	public void testIds() {
		assertThat(repo.getRepositoryId(), not(isEmptyOrNullString()));
		assertThat(repo.getRepositoryURI(), notNullValue());
	}

}
