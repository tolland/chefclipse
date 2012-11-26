/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.test.api;

import java.io.File;
import java.util.List;

import org.junit.Test;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.repositories.CookbookSiteRepository;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * @author Guillermo Zunino
 *
 */
public class CookbookSiteRepositoryTest {
	
	private CookbookSiteRepository repo = new CookbookSiteRepository();
	
	@Test
	public void testGetCookbooks() {
		List<RemoteCookbook> results = repo.getCookbooks();
		assertThat(results, notNullValue());
		assertThat(results.size(), not(0));
		assertThat(results.get(0).getName(), both(notNullValue(String.class)).and(not(equalTo(""))));
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
//		,"updated_at":"2012-03-13T13:46:24Z","created_at":"2011-11-08T13:52:21Z",
	}
	
	@Test
	public void testDownloadCookbook() throws InstallCookbookException {
		RemoteCookbook result = repo.getCookbook("apache");
		File downloadCookbook = repo.downloadCookbook(result);
		
		assertThat(downloadCookbook.getPath(), equalTo("/tmp/apache"));
	}
}
