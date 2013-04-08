/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.test.api;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.repositories.MultipleVendorCookbookRepository;

/**
 * @author Sebastian Sampaoli
 *
 */
public class MultipleVendorCookbookRepositoryTest {

	private MultipleVendorCookbookRepository repo = new MultipleVendorCookbookRepository();
	
	@Test
	public void testGetCookbooks() {
		List<RemoteCookbook> results = (List<RemoteCookbook>) repo.getCookbooks();
		assertThat(results, notNullValue());
		assertThat(results.size(), not(0));
		assertThat(results.get(0).getName(), both(notNullValue(String.class)).and(not(equalTo(""))));
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
		assertThat(result.getVersions(), Matchers.hasItems("https://github.com/cookbooks/ap-cookbook-oracle/archive/master.zip",
				"https://api.github.com/repos/cookbooks/ap-cookbook-oracle/zipball/0.0.9", 
				"https://api.github.com/repos/cookbooks/ap-cookbook-oracle/zipball/0.0.6") );
	}
	
	@Test
	public void testDownloadCookbook() throws InstallCookbookException {
		RemoteCookbook c = repo.getCookbook("ap-cookbook-oracle");
		c.setName("ap-cookbook-oracle");
		File downloadCookbook = repo.downloadCookbook(c, c.getLatestVersion());
		
		String tmpDirectory = System.getProperty("java.io.tmpdir");
		
		assertThat(downloadCookbook.getPath(), equalTo(tmpDirectory + "ap-cookbook-oracle-master"));
	}

	@Test
	public void testReadableVersion() throws InstallCookbookException {
		RemoteCookbook c = repo.getCookbook("ap-cookbook-oracle");
		
		String v = repo.getReadableVersion(c, c.getLatestVersion());
		assertThat(v, equalTo("master"));
		v = repo.getReadableVersion(c, c.getVersions().get(1));
		assertThat(v, equalTo("qa-0.0.9"));
	}

}
