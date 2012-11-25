/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.repositories;

import java.io.File;
import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.limepepper.chefclipse.remotepicker.api.IDownloadCookbookStrategy;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryFactory;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * @author Sebastian Sampaoli
 *
 */
public class MultipleVendorCookbookRepository implements ICookbooksRepository {

	private WebResource service;
	
	private static final String REPOSITORY_URI = "https://api.github.com";
	
	private static final String REPOSITORY_ID = "Multiple vendor Chef cookbooks";
	
	private IDownloadCookbookStrategy downloadCookbookStrategy;

	protected WebResource getService() {
		return service;
	}
	
	/**
	 * 
	 */
	public MultipleVendorCookbookRepository() {
		
		ClientConfig config = new DefaultClientConfig();
		
//	    config.getClasses().add(JacksonJsonProvider.class);
		
		Client client = Client.create(config);
		service = client.resource(getRepositoryURI());
		
		downloadCookbookStrategy = new MultipleVendorDownloadStrategy();
	}

	/* (non-Javadoc)
	 * @see org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository#getRepositoryId()
	 */
	@Override
	public String getRepositoryId() {
		return REPOSITORY_ID;
	}

	/* (non-Javadoc)
	 * @see org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository#getRepositoryURI()
	 */
	@Override
	public URI getRepositoryURI() {
		return UriBuilder.fromUri(REPOSITORY_URI)
				.build();
	}

	/* (non-Javadoc)
	 * @see org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository#getCookbooks(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public Collection<RemoteCookbook> getCookbooks() {
		List<RemoteCookbook> cookbooks = new ArrayList<RemoteCookbook>();
		int start = 1;
		boolean more = true;
		do {
			JSONArray jsonArray = getRestCookbooks(start++, 100);
			for (int i = 0; i < jsonArray.length(); i++) {
				try {
					JSONObject cookbookJson = jsonArray.getJSONObject(i);
					cookbooks.add(createCookbook(cookbookJson));
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}
			more = jsonArray.length() > 0;
		} while (more);
		return cookbooks;
	}

	private RemoteCookbook createCookbook(JSONObject cookbookJson) {
		
		RemoteCookbook cookbook = CookbookrepositoryFactory.eINSTANCE.createRemoteCookbook();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		try {
			cookbook.setName(cookbookJson.getString("name"));
			cookbook.setUrl(cookbookJson.optString("html_url"));
			cookbook.setDescription(cookbookJson.getString("description"));
			cookbook.setCategory(MultipleVendorCategoryProvider.INSTANCE.getCategory(cookbook.getName()));
			cookbook.setUpdatedAt(format.parse(cookbookJson.getString("updated_at")));
			cookbook.setCreatedAt(format.parse(cookbookJson.getString("created_at")));
			cookbook.setExternalUrl(cookbookJson.optString("html_url"));
//			cookbook.setLatestVersion(cookbookJson.getString("latest_version"));
			cookbook.setMaintainer(cookbookJson.getJSONObject("owner").getString("login"));
			cookbook.setRating(cookbookJson.optDouble("watchers_count"));
//			JSONArray versionsJson = cookbookJson.optJSONArray("versions");
//			String[] versions = new String[versionsJson.length()];
//			for (int i = 0; i < versionsJson.length(); i++) {
//				versions[i] = versionsJson.getString(i);
//			}
//			cookbook.getVersions().addAll(Arrays.asList(versions));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e1){
			e1.printStackTrace();
		}
		return cookbook;
	}

	private JSONArray getRestCookbooks(int page, int items) {
		
		return getService().path("users").path("cookbooks").path("repos")
				.queryParam("page", String.valueOf(page))
				.queryParam("per_page", String.valueOf(items))
				.accept(MediaType.APPLICATION_JSON_TYPE).get(JSONArray.class);
	}

	/* (non-Javadoc)
	 * @see org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository#isUpdated()
	 */
	@Override
	public boolean isUpdated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RemoteCookbook getCookbook(String name) {
		
		JSONObject cookbookJson = restCookbook(name);
		RemoteCookbook cookbook = createCookbook(cookbookJson);
		return cookbook;
	}
	
	/**
	 * /cookbooks/{cookbook}
	 * Gets a cookbook.
	 * @param cookbook
	 * @return
	 */
	private JSONObject restCookbook(String name) {
	    return getService().path("repos").path("cookbooks").path(name)
	    		.accept(MediaType.APPLICATION_JSON_TYPE)
	    		.get(JSONObject.class);
	}
	
	@Override
	public File downloadCookbook(String cookbookName) throws InstallCookbookException {
		RemoteCookbook cookbook = getCookbook(cookbookName);
		File downloadedCookbook = downloadCookbookStrategy.downloadCookbook(cookbook);
		return downloadedCookbook;
	}

}
