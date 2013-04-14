package org.limepepper.chefclipse.remotepicker.test.api;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryFactory;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.repositories.MultipleVendorCookbookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Sebastian Sampaoli
 *
 */
public class MultipleVendorCookbookRepositoryTest {
	
	static final Logger logger = LoggerFactory.getLogger(MultipleVendorCookbookRepositoryTest.class);

	private static final CookbookrepositoryFactory factory = CookbookrepositoryFactory.eINSTANCE;

	private MultipleVendorCookbookRepository repo = new MultipleVendorCookbookRepository();
	
	@Test
	public void testGetCookbooks() {
		long t1 = System.currentTimeMillis();
		
		List<RemoteCookbook> results = (List<RemoteCookbook>) repo.getCookbooks();
		assertThat(results, notNullValue());
		logger.info("get {} Cookbooks in {}ms", results.size(), System.currentTimeMillis() - t1);
		assertThat(results.size(), greaterThan(600));
		assertThat(results.get(0).getName(), both(notNullValue(String.class)).and(not(equalTo(""))));
		assertThat(results.get(500).getName(), both(notNullValue(String.class)).and(not(equalTo(""))));
	}
	
	@Test
	public void testGetCookbook() {
		
		RemoteCookbook result = repo.getCookbook("ap-cookbook-oracle");
	
		assertThat(result, notNullValue());
		assertThat(result.getName(), equalTo("ap-cookbook-oracle"));
		assertThat(result.getCategory(), equalTo("Individual Owner"));
		assertThat(result.getExternalUrl(), equalTo("https://github.com/cookbooks/ap-cookbook-oracle"));
		assertThat(result.getUrl(), equalTo("https://github.com/cookbooks/ap-cookbook-oracle"));
		assertThat(result.getMaintainer(), equalTo("cookbooks"));
		assertThat(String.valueOf(result.getRating()), equalTo("0.0"));
		assertThat(result.getLatestVersion(), equalTo("https://github.com/cookbooks/ap-cookbook-oracle/archive/master.zip"));
		assertThat(result.getVersions().size(), greaterThan(1));
//		assertThat(result.getVersions(), hasItem("https://github.com/cookbooks/ap-cookbook-oracle/archive/master.zip"));
//		assertThat(result.getVersions(), hasItem("https://api.github.com/repos/cookbooks/ap-cookbook-oracle/zipball/0.0.9"));
//		assertThat(result.getVersions(), hasItem("https://api.github.com/repos/cookbooks/ap-cookbook-oracle/zipball/0.0.6"));
	}
	
	@Test
	public void testDownloadCookbook() throws InstallCookbookException {
		RemoteCookbook c = repo.getCookbook("ap-cookbook-oracle");
		c.setName("ap-cookbook-oracle");
		File downloadCookbook = repo.downloadCookbook(c, c.getLatestVersion());
		
		String tmpDirectory = System.getProperty("java.io.tmpdir");
		
		assertThat(downloadCookbook.getPath(), equalTo(Paths.get(tmpDirectory, "ap-cookbook-oracle_master").toString()));
	}

	@Test
	public void testReadableVersion() throws InstallCookbookException {
		RemoteCookbook c = repo.getCookbook("ap-cookbook-oracle");
		
		String v = repo.getReadableVersion(c, c.getLatestVersion());
		assertThat(v, equalTo("master"));
		v = repo.getReadableVersion(c, c.getVersions().get(1));
		assertThat(v, equalTo("qa-0.0.9"));
	}
	
	@Test
	public void testIsUpdated() {
		RemoteRepository r = factory.createRemoteRepository();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, -30);
		r.setUpdatedAt(calendar.getTime());
		
		assertThat(repo.isUpdated(r), is(true));
	}

}
