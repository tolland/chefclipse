package org.limepepper.chefclipse.remotepicker.test.api;

import static org.fest.assertions.api.Assertions.assertThat;

import java.io.File;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryFactory;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.repositories.GitHubCookbookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Sebastian Sampaoli
 *
 */
public class MultipleVendorCookbookRepositoryTest {
	
	static final Logger logger = LoggerFactory.getLogger(MultipleVendorCookbookRepositoryTest.class);

	private static final CookbookrepositoryFactory factory = CookbookrepositoryFactory.eINSTANCE;

	private GitHubCookbookRepository repo = new GitHubCookbookRepository("cookbooks");
	
	@Test
	public void testGetCookbooks() throws InstallCookbookException {
		long t1 = System.currentTimeMillis();
		
		List<RemoteCookbook> results = (List<RemoteCookbook>) repo.getCookbooks();
		assertThat(results).isNotNull();
		logger.info("get {} Cookbooks in {}ms", results.size(), System.currentTimeMillis() - t1);
		assertThat(results.size()).isGreaterThan(600);
		assertThat(results.get(0).getName()).isNotEmpty();
		assertThat(results.get(500).getName()).isNotEmpty();
	}
	
	@Test
	public void testGetCookbook() throws InstallCookbookException {
		
		RemoteCookbook result = repo.getCookbook("ap-cookbook-oracle");
	
		assertThat(result).isNotNull();
		assertThat(result.getName()).isEqualTo("ap-cookbook-oracle");
		assertThat(result.getCategory()).isEqualTo("Individual Owner");
		assertThat(result.getExternalUrl()).isEqualTo("https://github.com/cookbooks/ap-cookbook-oracle");
		assertThat(result.getUrl()).isEqualTo("https://github.com/cookbooks/ap-cookbook-oracle");
		assertThat(result.getMaintainer()).isEqualTo("cookbooks");
		assertThat(String.valueOf(result.getRating())).isEqualTo("0.0");
		assertThat(result.getLatestVersion()).isEqualTo("https://github.com/cookbooks/ap-cookbook-oracle/archive/master.zip");
		assertThat(result.getVersions().size()).isGreaterThan(1);
		assertThat(result.getVersions()).contains("https://github.com/cookbooks/ap-cookbook-oracle/archive/master.zip",
				"https://api.github.com/repos/cookbooks/ap-cookbook-oracle/zipball/0.0.9",
				"https://api.github.com/repos/cookbooks/ap-cookbook-oracle/zipball/0.0.6");
	}
	
	@Test
	public void testDownloadCookbook() throws InstallCookbookException {
		RemoteCookbook c = repo.getCookbook("ap-cookbook-oracle");
		c.setName("ap-cookbook-oracle");
		File downloadCookbook = repo.downloadCookbook(c, c.getLatestVersion());
		
		String tmpDirectory = System.getProperty("java.io.tmpdir");
		
		assertThat(downloadCookbook.getPath()).isEqualTo(Paths.get(tmpDirectory, "ap-cookbook-oracle_master").toString());
	}

	@Test
	public void testReadableVersion() throws InstallCookbookException {
		RemoteCookbook c = repo.getCookbook("ap-cookbook-oracle");
		
		String v = repo.getReadableVersion(c, c.getLatestVersion());
		assertThat(v).isEqualTo("master");
		v = repo.getReadableVersion(c, c.getVersions().get(1));
		assertThat(v).isEqualTo("qa-0.0.9");
	}
	
	@Test
	public void testIsUpdated() {
		RemoteRepository r = factory.createRemoteRepository();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, -30);
		r.setUpdatedAt(calendar.getTime());
		
		assertThat(repo.isUpdated(r)).isTrue();
	}

}
