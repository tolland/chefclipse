/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.test.api;

import static org.fest.assertions.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryFactory;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.repositories.ChefServerCookbookRepository;
import org.limepepper.chefclipse.testing.KnifeConfigUtils;
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
		KnifeConfig knifeConfig = KnifeConfigUtils.getDefaultKnifeConfig();
		
		repo = new ChefServerCookbookRepository(knifeConfig);	
	}

	@Test
	public void testGetCookbook() {
		RemoteCookbook cookbook = repo.getCookbook("apache2");
		
		assertThat(cookbook).isNotNull();
		assertThat(cookbook.getMaintainer()).isEqualTo("Opscode, Inc.");
		assertThat(cookbook.getName()).isEqualTo("apache2");
		assertThat(cookbook.getCategory()).isEqualTo("Chef::CookbookVersion");
		assertThat(cookbook.getExternalUrl()).isEqualTo("https://api.opscode.com/organizations/chefclipse/cookbooks/apache2/1.0.8");
		assertThat(cookbook.getUrl()).isEqualTo("https://api.opscode.com/organizations/chefclipse/cookbooks/apache2");
		assertThat(cookbook.getDescription()).isEqualTo("Installs and configures all aspects of apache2 using Debian style symlinks with helper definitions");
		assertThat(cookbook.getLatestVersion()).isEqualTo("https://api.opscode.com/organizations/chefclipse/cookbooks/apache2/1.0.8");
		assertThat(cookbook.getVersions()).contains("https://api.opscode.com/organizations/chefclipse/cookbooks/apache2/1.0.8");
		assertThat(cookbook.getCreatedAt()).isNull();
		assertThat(cookbook.getInstalledAt()).isNull();
		assertThat(cookbook.getUpdatedAt()).isNull();
		assertThat(cookbook.getRating()).isEqualTo(0.0);
		assertThat(cookbook.getReplacement()).isNull();
	}
	
	@Test
	public void testGetCookbooks() {
		long t1 = System.currentTimeMillis();
		
		List<RemoteCookbook> results = (List<RemoteCookbook>) repo.getCookbooks();
		assertThat(results).isNotNull();
		logger.info("get {} Cookbooks in {}ms", results.size(), System.currentTimeMillis() - t1);
		assertThat(results.size()).isGreaterThan(2);
		assertThat(results.get(0).getName()).isNotEmpty();
		assertThat(results.get(0).getDescription()).isNotEmpty();
		assertThat(results.get(0).getUrl()).isNotEmpty();
		assertThat(results.get(2).getName()).isNotEmpty();
		assertThat(results.get(2).getDescription()).isNotEmpty();
		assertThat(results.get(2).getUrl()).isNotEmpty();
		
		RemoteRepository mockRepo = factory.createRemoteRepository();
		mockRepo.getCookbooks().addAll(results);
		
		assertThat(repo.isUpdated(mockRepo)).as("Repo should not be updated").isFalse();
	}
	
	@Test
	public void testDownloadCookbook() throws InstallCookbookException {
		RemoteCookbook c = repo.getCookbook("apache2");
		File downloadCookbook = repo.downloadCookbook(c, c.getLatestVersion());

		String tmpDirectory = System.getProperty("java.io.tmpdir");
		
		assertThat(downloadCookbook).isNotNull();
		assertThat(downloadCookbook.getPath()).isEqualTo(
				Paths.get(tmpDirectory, "apache2_" + repo.getReadableVersion(c, c.getLatestVersion())).toString());
		assertThat(FileUtils.sizeOfDirectory(new File(downloadCookbook.getPath()))).isGreaterThan(10000L);
	}
	
	@Test
	public void testReadableVersion() {
		RemoteCookbook cookbook = factory.createRemoteCookbook();
		
		String version = repo.getReadableVersion(cookbook, "http://cookbook.com/cookbooks/apache/1.2.1");
		assertThat(version).isEqualTo("1.2.1");
		version = repo.getReadableVersion(cookbook, "http://cookbook.com/cookbooks/apache/1.2/");
		assertThat(version).isEqualTo("1.2");
	}
	
	@Test
	public void testIsUpdated() {
		RemoteRepository r = factory.createRemoteRepository();
		
		assertThat(repo.isUpdated(r)).isTrue();
	}

	@Test
	public void testIds() {
		assertThat(repo.getRepositoryId()).isNotEmpty();
		assertThat(repo.getRepositoryURI()).isNotNull();
	}

}
