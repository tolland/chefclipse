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
import java.util.Arrays;
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
 * @author Guillermo Zunino
 *
 */
public class CookbookSiteRepository implements ICookbooksRepository {
	
	private WebResource service;

	private IDownloadCookbookStrategy downloadCookbookStrategy;
	
	private static final String REPOSITORY_URI = "http://cookbooks.opscode.com";
	
	private static final String REPOSITORY_ID = "cookbooks.opscode.com";


	protected WebResource getService() {
		return service;
	}

	public CookbookSiteRepository() {
		ClientConfig config = new DefaultClientConfig();
//	    config.getClasses().add(JacksonJsonProvider.class);
		
		Client client = Client.create(config);
		service = client.resource(getRepositoryURI());
		
		downloadCookbookStrategy = new CookbookSiteDownloadStrategy(REPOSITORY_URI);
	}

	/**
	 * /cookbooks
	 * Gets a listing of the available cookbooks. It is a good idea to use the optional parameters start and items to limit and paginate the results.
	 * @param start The offset into the cookbook list at which you would like the result set to start.
	 * @param items The number of items to return in the result set.
	 * @return List of cookbooks
	 */
	private JSONObject getRestCookbooks(int start, int items) {
	    return getService().path("api").path("v1").path("cookbooks")
	    		.queryParam("items", String.valueOf(items))
	    		.accept(MediaType.APPLICATION_JSON_TYPE)
	    		.get(JSONObject.class);
	}
	
	/* (non-Javadoc)
	 * @see org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository#getCookbooks(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public List<RemoteCookbook> getCookbooks() {
		List<RemoteCookbook> cookbooks = new ArrayList<RemoteCookbook>();
		JSONObject json = getRestCookbooks(0, 100);
		try {
			JSONArray items = json.getJSONArray("items");
			for (int i = 0; i < items.length(); i++) {
				try {
					JSONObject cookbookJson = items.getJSONObject(i);
					String name = createCookbook(cookbookJson).getName();
					cookbooks.add(getCookbook(name));
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return cookbooks;
	}

	private RemoteCookbook createCookbook(JSONObject cookbookJson) {
		RemoteCookbook cookbook = CookbookrepositoryFactory.eINSTANCE.createRemoteCookbook();
		try {
			cookbook.setName(cookbookJson.getString("cookbook_name"));
			cookbook.setUrl(cookbookJson.getString("cookbook"));
			cookbook.setDescription(cookbookJson.getString("cookbook_description"));
			cookbook.setMaintainer(cookbookJson.getString("cookbook_maintainer"));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cookbook;
	}

	/**
	 * /cookbooks/{cookbook}
	 * Gets a cookbook.
	 * @param cookbook
	 * @return
	 */
	private JSONObject restCookbook(String cookbook) {
	    return getService().path("api").path("v1").path("cookbooks")
	    		.path(cookbook)
	    		.accept(MediaType.APPLICATION_JSON_TYPE)
	    		.get(JSONObject.class);
	}
	
	/* (non-Javadoc)
	 * @see org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository#getCookbook(java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public RemoteCookbook getCookbook(String name) {
		JSONObject cookbookJson = restCookbook(name);
		
		String url = UriBuilder.fromUri(getRepositoryURI()).path("api").path("v1")
				.path("cookbooks").path(name)
				.build().toString();
		
		RemoteCookbook cookbook = createCookbookDetail(cookbookJson, url);
		return cookbook;
	}

	private RemoteCookbook createCookbookDetail(JSONObject cookbookJson, String url) {
		RemoteCookbook cookbook = CookbookrepositoryFactory.eINSTANCE.createRemoteCookbook();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		try {
			cookbook.setName(cookbookJson.getString("name"));
			cookbook.setUrl(url);
			cookbook.setDescription(cookbookJson.getString("description"));
			cookbook.setCategory(cookbookJson.getString("category"));
			cookbook.setUpdatedAt(format.parse(cookbookJson.getString("updated_at")));
			cookbook.setCreatedAt(format.parse(cookbookJson.getString("created_at")));
			cookbook.setDeprecated(cookbookJson.optBoolean("deprecated"));
			cookbook.setExternalUrl(cookbookJson.optString("external_url"));
			cookbook.setLatestVersion(cookbookJson.getString("latest_version"));
			cookbook.setMaintainer(cookbookJson.getString("maintainer"));
			cookbook.setRating(cookbookJson.optDouble("average_rating"));
			cookbook.setReplacement(cookbookJson.optString("replacement"));
			JSONArray versionsJson = cookbookJson.optJSONArray("versions");
			String[] versions = new String[versionsJson.length()];
			for (int i = 0; i < versionsJson.length(); i++) {
				versions[i] = versionsJson.getString(i);
			}
			cookbook.getVersions().addAll(Arrays.asList(versions));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e1){
			e1.printStackTrace();
		}
		return cookbook;
	}

	@Override
	public URI getRepositoryURI() {
	
		return UriBuilder.fromUri(REPOSITORY_URI)
				.build();
	}

	@Override
	public String getRepositoryId() {
		return REPOSITORY_ID;
	}

	@Override
	public boolean isUpdated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public File downloadCookbook(String cookbookName) throws InstallCookbookException {
		RemoteCookbook cookbook = getCookbook(cookbookName);
		File downloadedCookbook = downloadCookbookStrategy.downloadCookbook(cookbook);
		return downloadedCookbook;
	}

}
