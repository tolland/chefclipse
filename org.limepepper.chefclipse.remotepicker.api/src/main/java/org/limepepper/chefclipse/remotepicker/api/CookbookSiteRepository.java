/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.api;

import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.eclipse.core.runtime.IProgressMonitor;

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

	protected WebResource getService() {
		return service;
	}

	public CookbookSiteRepository() {
		ClientConfig config = new DefaultClientConfig();
//	    config.getClasses().add(JacksonJsonProvider.class);
		
		Client client = Client.create(config);
		service = client.resource(getRepositoryURI());
	}

	/**
	 * /cookbooks
	 * Gets a listing of the available cookbooks. It is a good idea to use the optional parameters start and items to limit and paginate the results.
	 * @param start The offset into the cookbook list at which you would like the result set to start.
	 * @param items The number of items to return in the result set.
	 * @return List of cookbooks
	 */
	private JSONObject getRestCookbooks(int start, int items) {
	    return getService().path("cookbooks")
	    		.accept(MediaType.APPLICATION_JSON_TYPE)
	    		.get(JSONObject.class);
	}
	
	/* (non-Javadoc)
	 * @see org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository#getCookbooks(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public List<CookbookInfo> getCookbooks(IProgressMonitor monitor) {
		List<CookbookInfo> cookbooks = new ArrayList<CookbookInfo>();
		JSONObject json = getRestCookbooks(0, 1000);
		try {
			JSONArray items = json.getJSONArray("items");
			for (int i = 0; i < items.length(); i++) {
				try {
					JSONObject cookbookJson = items.getJSONObject(i);
					cookbooks.add(createCookbook(cookbookJson));
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

	private CookbookInfo createCookbook(JSONObject cookbookJson) {
		CookbookInfo cookbook = new CookbookInfo();
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
	    return getService().path("cookbooks")
	    		.path(cookbook)
	    		.accept(MediaType.APPLICATION_JSON_TYPE)
	    		.get(JSONObject.class);
	}
	
	/* (non-Javadoc)
	 * @see org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository#getCookbook(java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public CookbookInfo getCookbook(String name, IProgressMonitor monitor) {
		JSONObject cookbookJson = restCookbook(name);
		
		String url = UriBuilder.fromUri(getRepositoryURI())
				.path("cookbook").path(name)
				.build().toString();
		
		CookbookInfo cookbook = createCookbookDetail(cookbookJson, url);
		return cookbook;
	}

	private CookbookInfo createCookbookDetail(JSONObject cookbookJson, String url) {
		CookbookInfo cookbook = new CookbookInfo();
		try {
			cookbook.setName(cookbookJson.getString("name"));
			cookbook.setUrl(url);
			cookbook.setDescription(cookbookJson.getString("description"));
			cookbook.setCategory(cookbookJson.getString("category"));
			cookbook.setCreatedAt(DateFormat.getInstance().parse(cookbookJson.getString("created_at")));
			cookbook.setUpdatedAt(DateFormat.getInstance().parse(cookbookJson.getString("updated_at")));
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
			cookbook.setVersions(versions);
		} catch (JSONException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cookbook;
	}

	@Override
	public URI getRepositoryURI() {
		return UriBuilder.fromUri("http://cookbooks.opscode.com/api/v1/")
				.build();
	}

	@Override
	public String getRepositoryId() {
		return "cookbooks.opscode.com";
	}

}
