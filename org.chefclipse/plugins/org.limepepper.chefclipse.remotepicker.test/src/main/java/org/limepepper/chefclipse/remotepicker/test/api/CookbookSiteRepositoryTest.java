package org.limepepper.chefclipse.remotepicker.test.api;

import static org.fest.assertions.api.Assertions.assertThat;

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
		assertThat(results).isNotNull();
		logger.info("get {} Cookbooks in {}ms", results.size(), System.currentTimeMillis() - t1);
		assertThat(results.size()).isGreaterThan(500);
		assertThat(results.get(0).getName()).isNotEmpty();
		assertThat(results.get(500).getName()).isNotEmpty();
	}

	@Test
	public void testGetCookbook() {
		RemoteCookbook result = repo.getCookbook("apache");

		assertThat(result).isNotNull();
		assertThat(result.getMaintainer()).isEqualTo("melezhik");
		assertThat(result.getName()).isEqualTo("apache");
		assertThat(result.getCategory()).isEqualTo("Web Servers");
		assertThat(result.getExternalUrl()).isEqualTo("github.com/melezhik/cookbooks/tree/master/apache");
		assertThat(result.getUrl()).isEqualTo("http://cookbooks.opscode.com/api/v1/cookbooks/apache");
		assertThat(result.getDescription()).isEqualTo("various apache server related resource provides (LWRP)");
		assertThat(result.getMaintainer()).isEqualTo("melezhik");
		assertThat(result.getLatestVersion()).isEqualTo("http://cookbooks.opscode.com/api/v1/cookbooks/apache/versions/0_0_5");
		assertThat(result.getVersions()).contains("http://cookbooks.opscode.com/api/v1/cookbooks/apache/versions/0_0_5");
	}

	@Test
	public void testDownloadCookbook() throws InstallCookbookException {
		RemoteCookbook result = repo.getCookbook("apache");
		File downloadCookbook = repo.downloadCookbook(result, result.getLatestVersion());
		String tmpDirectory = System.getProperty("java.io.tmpdir");
		assertThat(downloadCookbook.getPath()).isEqualTo(
				Paths.get(tmpDirectory, "apache" + "_" + repo.getReadableVersion(result, result.getLatestVersion())).toString());
	}

	@Test
    public void testCookbookVersion() throws InstallCookbookException {
        RemoteCookbook result = repo.getCookbook("apache");
        String latestVersion = result.getLatestVersion().replaceAll(".+?versions/", "").replace("_", ".");
        assertThat(latestVersion).isEqualTo("0.0.5");
    }

	@Test
	public void testCookbookReadableVersion() throws InstallCookbookException {
		RemoteCookbook result = repo.getCookbook("apache");
		String v = repo.getReadableVersion(result, result.getLatestVersion());
		assertThat(v).isEqualTo("0.0.5");
	}
}
