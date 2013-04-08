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
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

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
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * @author Sebastian Sampaoli
 *
 */
public class MultipleVendorCookbookRepository implements ICookbooksRepository {

	static final Logger logger = LoggerFactory.getLogger(MultipleVendorCookbookRepository.class);
	
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
		
		downloadCookbookStrategy = new MultipleVendorDownloadStrategy(this);
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
		try{
			do {
				JSONArray jsonArray = getRestCookbooks(start++, 100);
				for (int i = 0; i < jsonArray.length(); i++) {
					try {
						JSONObject cookbookJson = jsonArray.getJSONObject(i);
						cookbooks.add(createCookbook(cookbookJson));
					} catch (JSONException e) {
						logger.error("Error getting cookbooks", e);
					}
				}
				more = jsonArray.length() > 0;
			} while (more);
		} catch (ClientHandlerException e) {
			logger.error("Error getting cookbooks", e);
		} catch (UniformInterfaceException e) {
			logger.error("Error getting cookbooks", e);
		}
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
			cookbook.setMaintainer(cookbookJson.getJSONObject("owner").getString("login"));
			cookbook.setRating(cookbookJson.optDouble("watchers_count"));
			
			fillVersions(cookbook, cookbookJson);
		} catch (JSONException e) {
			logger.error("Error getting cookbooks", e);
		} catch (ParseException e){
			logger.error("Error getting cookbooks", e);
		}
		return cookbook;
	}

	protected void fillVersions(RemoteCookbook cookbook, JSONObject cookbookJson)
			throws JSONException {
		String tags_url = cookbookJson.getString("tags_url");
		tags_url = tags_url.replace(REPOSITORY_URI, "").replace("{/tag}", "");
		
		String latest = cookbook.getUrl() + "/archive/" + cookbookJson.getString("default_branch") + ".zip";
		cookbook.setLatestVersion(latest);
		
		JSONArray tags = getService().path(tags_url)
			.accept(MediaType.APPLICATION_JSON_TYPE).get(JSONArray.class);
		
		String[] versions = new String[tags.length()+1];
		versions[0] = latest;
		for (int i = 0; i < tags.length(); i++) {
			try {
				JSONObject tagJson = tags.getJSONObject(i);
				versions[i+1] = tagJson.getString("zipball_url");
			} catch (JSONException e) {
				logger.error("Error getting cookbooks", e);
			}
		}
		cookbook.getVersions().addAll(Arrays.asList(versions));
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
	public boolean isUpdated(RemoteRepository repo) {
		SimpleDateFormat fo = new SimpleDateFormat(
			"EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
		fo.setTimeZone(TimeZone.getTimeZone("GMT"));
		if (repo.getUpdatedAt() == null)
			return false;
		String date = fo.format(repo.getUpdatedAt());
		ClientResponse response = null;
		try {
			response = getService()
					.path("users").path("cookbooks").path("repos")
					.header("If-Modified-Since", date)
					.get(ClientResponse.class);
		} catch (ClientHandlerException e) {
			logger.error("Error checking isUpdated", e);
			return false;
		} catch (UniformInterfaceException e) {
			logger.error("Error checking isUpdated", e);
			return false;
		}
		if (response != null){
			return !Status.NOT_MODIFIED.equals(response.getClientResponseStatus());
		}
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
	public File downloadCookbook(RemoteCookbook cookbook, String version) throws InstallCookbookException {
		File downloadedCookbook = downloadCookbookStrategy.downloadCookbook(cookbook, version);
		return downloadedCookbook;
	}

	@Override
	public String getReadableVersion(RemoteCookbook cookbook, String version) {
		return version.substring(version.lastIndexOf("/")+1).replace(".zip", "");
	}
}
