package org.limepepper.chefclipse.remotepicker.test.api;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.repositories.CookbookSiteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Guillermo Zunino
 *
 */
public class CookbookSiteRepositoryTest {
	
	static final Logger logger = LoggerFactory.getLogger(CookbookSiteRepositoryTest.class);
	
	private CookbookSiteRepository repo = new CookbookSiteRepository();
	
	@Test
	public void testGetCookbooks() {
		long t1 = System.currentTimeMillis();
		List<RemoteCookbook> results = repo.getCookbooks();
		assertThat(results, notNullValue());
		logger.info("get {} Cookbooks in {}ms", results.size(), System.currentTimeMillis() - t1);
		assertThat(results.size(), greaterThan(500));
		assertThat(results.get(0).getName(), both(notNullValue(String.class)).and(not(equalTo(""))));
		assertThat(results.get(500).getName(), both(notNullValue(String.class)).and(not(equalTo(""))));
	}
	
	@Test
	public void testGetCookbook() {
		RemoteCookbook result = repo.getCookbook("apache");
		
		assertThat(result, notNullValue());
		assertThat(result.getMaintainer(), equalTo("melezhik"));
		assertThat(result.getName(), equalTo("apache"));
		assertThat(result.getCategory(), equalTo("Web Servers"));
		assertThat(result.getExternalUrl(), equalTo("github.com/melezhik/cookbooks/tree/master/apache"));
		assertThat(result.getUrl(), equalTo("http://cookbooks.opscode.com/api/v1/cookbooks/apache"));
		assertThat(result.getDescription(), equalTo("various apache server related resource provides (LWRP)"));
		assertThat(result.getMaintainer(), equalTo("melezhik"));
		assertThat(result.getLatestVersion(), equalTo("http://cookbooks.opscode.com/api/v1/cookbooks/apache/versions/0_0_5"));
		assertThat(result.getVersions(), hasItem("http://cookbooks.opscode.com/api/v1/cookbooks/apache/versions/0_0_5"));
//		,"updated_at":"2012-03-13T13:46:24Z","created_at":"2011-11-08T13:52:21Z",
	}
	
	@Test
	public void testDownloadCookbook() throws InstallCookbookException {
		RemoteCookbook result = repo.getCookbook("apache");
		File downloadCookbook = repo.downloadCookbook(result, result.getLatestVersion());
		String tmpDirectory = System.getProperty("java.io.tmpdir");		
		assertThat(downloadCookbook.getPath(), equalTo(
				Paths.get(tmpDirectory, "apache" + "_" + repo.getReadableVersion(result, result.getLatestVersion())).toString()));
	}
	
	@Test
    public void testCookbookVersion() throws InstallCookbookException {
        RemoteCookbook result = repo.getCookbook("apache");
        String latestVersion = result.getLatestVersion().replaceAll(".+?versions/", "").replace("_", ".");
        assertThat(latestVersion, equalTo("0.0.5"));
    }

	@Test
	public void testCookbookReadableVersion() throws InstallCookbookException {
		RemoteCookbook result = repo.getCookbook("apache");
		String v = repo.getReadableVersion(result, result.getLatestVersion());
		assertThat(v, equalTo("0.0.5"));
	}
}
