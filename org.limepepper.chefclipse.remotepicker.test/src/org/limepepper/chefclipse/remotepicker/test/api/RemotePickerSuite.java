/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.test.api;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
//import static org.junit.matchers.JUnitMatchers.*;

import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.Test;
import org.limepepper.chefclipse.remotepicker.api.CookbookInfo;
import org.limepepper.chefclipse.remotepicker.api.CookbookSiteRepository;

/**
 * @author Guillermo Zunino
 *
 */
public class RemotePickerSuite {
	
	private CookbookSiteRepository repo = new CookbookSiteRepository();
	
//	@Test
//	public void testGetCookbooks() {
//		List<CookbookInfo> results = repo.getCookbooks(new NullProgressMonitor());
//		assertThat(results, notNullValue());
//		assertThat(results.size(), not(0));
//		assertThat(results.get(0).getName(), both(notNullValue(String.class)).and(not(equalTo(""))));
//	}
//	
//	@Test
//	public void testGetCookbook() {
//		CookbookInfo result = repo.getCookbook("apache", new NullProgressMonitor());
//		
//		assertThat(result, notNullValue());
//		assertThat(result.getMaintainer(), equalTo("melezhik"));
//		assertThat(result.getName(), equalTo("apache"));
//		assertThat(result.getCategory(), equalTo("Web Servers"));
//		assertThat(result.getExternalUrl(), equalTo("github.com/melezhik/cookbooks/tree/master/apache"));
//		assertThat(result.getUrl(), equalTo("http://cookbooks.opscode.com/api/v1/cookbooks/apache"));
//		assertThat(result.getDescription(), equalTo("various apache server related resource provides (LWRP)"));
//		assertThat(result.getMaintainer(), equalTo("melezhik"));
//		assertThat(result.getLatestVersion(), equalTo("http://cookbooks.opscode.com/api/v1/cookbooks/apache/versions/0_0_5"));
////		,"updated_at":"2012-03-13T13:46:24Z","created_at":"2011-11-08T13:52:21Z",
//	}
}
