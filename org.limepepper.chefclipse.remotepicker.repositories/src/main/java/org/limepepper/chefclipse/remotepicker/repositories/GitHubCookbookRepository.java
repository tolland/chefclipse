/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.repositories;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import com.sun.jersey.core.header.LinkHeader;

/**
 * @author Sebastian Sampaoli
 *
 */
public class GitHubCookbookRepository implements ICookbooksRepository {

	private static final int THREADS = 10;

	static final Logger logger = LoggerFactory.getLogger(GitHubCookbookRepository.class);
	
	private WebResource service;
	
	private static final String REPOSITORY_URI = "https://api.github.com";
	
	private static final String REPOSITORY_ID = "GitHub Chef cookbooks repository";
	
	private IDownloadCookbookStrategy downloadCookbookStrategy;

	private String githubUser;

	private final class GetTask implements Runnable {
		private final int page;
		private final List<RemoteCookbook> cookbooks;

		private GetTask(int page, List<RemoteCookbook> cookbooks) {
			this.page = page;
			this.cookbooks = cookbooks;
		}

		@Override
		public void run() {
			ExecutorService pool = Executors.newFixedThreadPool(THREADS/3);
			try {
				JSONArray jsonArray = getRestCookbooks(page, 100);
				
				for (int i = 0; i < jsonArray.length(); i++) {
					try {
						JSONObject cookbookJson = jsonArray.getJSONObject(i);
						pool.execute(new GetCookbook(cookbookJson, cookbooks));
					} catch (JSONException e) {
						logger.error("Error getting cookbooks", e);
					}
				}
				pool.shutdown();
				pool.awaitTermination(20, TimeUnit.MINUTES);
			} catch (ClientHandlerException | UniformInterfaceException | InterruptedException e) {
				logger.error("Error getting cookbooks", e);
			}
		}
	}
	
	private final class GetCookbook implements Runnable {
		private final JSONObject cookbookJson;
		private final List<RemoteCookbook> cookbooks;

		private GetCookbook(JSONObject cookbookJson, List<RemoteCookbook> cookbooks) {
			this.cookbookJson = cookbookJson;
			this.cookbooks = cookbooks;
		}

		@Override
		public void run() {
			cookbooks.add(createCookbook(cookbookJson));
		}
	}
	
	public GitHubCookbookRepository(String githubUser) {
		this.githubUser = githubUser;
		ClientConfig config = new DefaultClientConfig();
		
		Client client = Client.create(config);
		service = client.resource(getRepositoryURI());
		
		downloadCookbookStrategy = new MultipleVendorDownloadStrategy(this);
	}

	protected WebResource getService() {
		return service;
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
		return repositoryUrl();
	}

	public static URI repositoryUrl() {
		UriBuilder fromUri = UriBuilder.fromUri(REPOSITORY_URI);
		Properties prop = new Properties();
		try (InputStream is = GitHubCookbookRepository.class.getResourceAsStream("/github.properties")) {
			prop.load(is);
			fromUri.queryParam("client_id", prop.getProperty("client_id"))
				.queryParam("client_secret", prop.getProperty("client_secret"));
		} catch (IOException e) {
			logger.error("Cannot load github.properties file", e);
		}
		return fromUri.build();
	}

	/* (non-Javadoc)
	 * @see org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository#getCookbooks(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public Collection<RemoteCookbook> getCookbooks() {
		ExecutorService pool = Executors.newFixedThreadPool(THREADS);
		List<RemoteCookbook> list = new ArrayList<RemoteCookbook>();
		final List<RemoteCookbook> cookbooks = Collections.synchronizedList(list);
		
		int lastPage = getRestCookbooksLast(100);
		int page = 1;
		
		try{
			long t1 = System.currentTimeMillis();
			while (page <= lastPage) {
				pool.execute(new GetTask(page++, cookbooks));
			}
			logger.info("get Cookbooks info in {}ms", System.currentTimeMillis() - t1);
			pool.shutdown();
			pool.awaitTermination(20, TimeUnit.MINUTES);
		} catch (InterruptedException | ClientHandlerException | UniformInterfaceException e) {
			logger.error("Error getting cookbooks", e);
		}
		return list;
	}

	private RemoteCookbook createCookbook(final JSONObject cookbookJson) {
		
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
		} catch (JSONException | ParseException e){
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
		
		try {
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
		} catch (ClientHandlerException | UniformInterfaceException e) {
			logger.error("Error checking isUpdated", e);
		}
	}

	private JSONArray getRestCookbooks(int page, int items) {
		return getService().path("users").path(githubUser).path("repos")
				.queryParam("page", String.valueOf(page))
				.queryParam("per_page", String.valueOf(items))
				.accept(MediaType.APPLICATION_JSON_TYPE).get(JSONArray.class);
	}

	protected int getRestCookbooksLast(int items) {
		ClientResponse r = getService().path("users").path(githubUser).path("repos")
				.queryParam("page", String.valueOf(1))
				.queryParam("per_page", String.valueOf(items))
				.accept(MediaType.APPLICATION_JSON_TYPE).head();
		String link = r.getHeaders().get("Link").get(0);
		String[] links = link.split(",");
		String lastPage = "10";
		
		for (String string : links) {
			LinkHeader h = LinkHeader.valueOf(string.trim());
			String rel = h.getRel().iterator().next();
			if ("last".equals(rel)) {
				URI uri = h.getUri();
				String q = uri.getQuery();
				Matcher matcher = Pattern.compile("page=(.{1,3})&").matcher(q);
				if (matcher.find()) {
					lastPage = matcher.group(1);
				}
			}
		}
		return Integer.valueOf(lastPage);
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
					.path("users").path(githubUser).path("repos")
					.header("If-Modified-Since", date)
					.get(ClientResponse.class);
		} catch (ClientHandlerException | UniformInterfaceException e) {
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
	    return getService().path("repos").path(githubUser).path(name)
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
