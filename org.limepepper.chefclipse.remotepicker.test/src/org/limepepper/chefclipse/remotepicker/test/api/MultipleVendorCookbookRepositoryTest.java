/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.test.api;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.Test;
import org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.api.MultipleVendorCookbookRepository;

/**
 * @author Sebastian Sampaoli
 *
 */
public class MultipleVendorCookbookRepositoryTest {

	private MultipleVendorCookbookRepository repo = new MultipleVendorCookbookRepository();
	/**
	 * 
	 */
	public MultipleVendorCookbookRepositoryTest() {
		
	}
	
	@Test
	public void testGetCookbooks() {
		List<RemoteCookbook> results = (List<RemoteCookbook>) repo.getCookbooks(new NullProgressMonitor());
		assertThat(results, notNullValue());
		assertThat(results.size(), not(0));
		assertThat(results.get(0).getName(), both(notNullValue(String.class)).and(not(equalTo(""))));
	}
	
	@Test
	public void testGetCookbook() {
		
		RemoteCookbook result = repo.getCookbook("ap-cookbook-oracle", new NullProgressMonitor());
	
		assertThat(result, notNullValue());
		assertThat(result.getName(), equalTo("ap-cookbook-oracle"));
		assertThat(result.getCategory(), equalTo("Individual Owner"));
		assertThat(result.getExternalUrl(), equalTo("https://github.com/cookbooks/ap-cookbook-oracle"));
		assertThat(result.getUrl(), equalTo("https://github.com/cookbooks/ap-cookbook-oracle"));
		assertThat(result.getMaintainer(), equalTo("cookbooks"));
		assertThat(String.valueOf(result.getRating()), equalTo("0.0"));
	}

}
