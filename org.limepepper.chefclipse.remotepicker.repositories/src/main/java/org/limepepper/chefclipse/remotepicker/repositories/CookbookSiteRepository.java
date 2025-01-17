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
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * @author Guillermo Zunino
 *
 */
public class CookbookSiteRepository implements ICookbooksRepository {

	private static final int THREADS = 10;

	static final Logger logger = LoggerFactory
			.getLogger(CookbookSiteRepository.class);

	private final class GetPages implements Runnable {
		private final int start;
		private final List<RemoteCookbook> cookbooks;

		private GetPages(int start, List<RemoteCookbook> cookbooks) {
			this.start = start;
			this.cookbooks = cookbooks;
		}

		@Override
		public void run() {
			ExecutorService pool = Executors.newFixedThreadPool(THREADS / 2);
			try {
				JSONObject json = getRestCookbooks(start, 100);
				JSONArray items = json.getJSONArray("items");
				for (int i = 0; i < items.length(); i++) {
					try {
						JSONObject cookbookJson = items.getJSONObject(i);
						pool.execute(new GetCookbook(cookbookJson, cookbooks));
					} catch (JSONException e) {
						logger.error("Error getting cookbooks", e);
					}
				}
				pool.shutdown();
				pool.awaitTermination(20, TimeUnit.MINUTES);
			} catch (JSONException e) {
				logger.error("Error getting cookbooks", e);
			} catch (ClientHandlerException e) {
				logger.error("Error getting cookbooks", e);
			} catch (UniformInterfaceException e) {
				logger.error("Error getting cookbooks", e);
			} catch (InterruptedException e) {

				logger.error("Error getting cookbooks", e);
			}
		}
	}

	private final class GetCookbook implements Runnable {
		private final JSONObject cookbookJson;
		private final List<RemoteCookbook> cookbooks;

		private GetCookbook(JSONObject cookbookJson,
				List<RemoteCookbook> cookbooks) {
			this.cookbookJson = cookbookJson;
			this.cookbooks = cookbooks;
		}

		@Override
		public void run() {
			String name = createCookbook(cookbookJson).getName();
			cookbooks.add(getCookbook(name));
		}
	}

	private WebResource service;

	private IDownloadCookbookStrategy downloadCookbookStrategy;

	private static final String REPOSITORY_URI = "http://cookbooks.opscode.com";

	private static final String REPOSITORY_ID = "cookbooks.opscode.com";

	protected WebResource getService() {
		return service;
	}

	public CookbookSiteRepository() {
		ClientConfig config = new DefaultClientConfig();

		Client client = Client.create(config);
		service = client.resource(getRepositoryURI());

		downloadCookbookStrategy = new CookbookSiteDownloadStrategy(
				REPOSITORY_URI, this);
	}

	/**
	 * /cookbooks Gets a listing of the available cookbooks. It is a good idea
	 * to use the optional parameters start and items to limit and paginate the
	 * results.
	 *
	 * @param start
	 *            The offset into the cookbook list at which you would like the
	 *            result set to start.
	 * @param items
	 *            The number of items to return in the result set.
	 * @return List of cookbooks
	 */
	private JSONObject getRestCookbooks(int start, int items) {
		return getService().path("api").path("v1").path("cookbooks")
				.queryParam("start", String.valueOf(start))
				.queryParam("items", String.valueOf(items))
				.accept(MediaType.APPLICATION_JSON_TYPE).get(JSONObject.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository#getCookbooks
	 * (org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public List<RemoteCookbook> getCookbooks() {
		ExecutorService pool = Executors.newFixedThreadPool(THREADS);
		List<RemoteCookbook> list = new ArrayList<RemoteCookbook>();
		final List<RemoteCookbook> cookbooks = Collections
				.synchronizedList(list);
		int start = 0;
		int total = 100;
		try {
			JSONObject json = getRestCookbooks(0, 1);
			total = json.getInt("total");
		} catch (JSONException e) {
			logger.error("Error getting cookbooks", e);
		} catch (ClientHandlerException e) {
			logger.error("Error getting cookbooks", e);
		} catch (UniformInterfaceException e) {
			logger.error("Error getting cookbooks", e);

		}
		long t1 = System.currentTimeMillis();
		do {
			pool.execute(new GetPages(start, cookbooks));
			start += 100;
		} while (start < total);
		logger.info("get Cookbooks info in {}ms", System.currentTimeMillis()
				- t1);
		try {
			pool.shutdown();
			pool.awaitTermination(20, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			logger.error("Error getting cookbooks", e);
		}
		return list;
	}

	private RemoteCookbook createCookbook(JSONObject cookbookJson) {
		RemoteCookbook cookbook = CookbookrepositoryFactory.eINSTANCE
				.createRemoteCookbook();
		try {
			cookbook.setName(cookbookJson.getString("cookbook_name"));
			cookbook.setUrl(cookbookJson.getString("cookbook"));
			cookbook.setDescription(cookbookJson
					.getString("cookbook_description"));
			cookbook.setMaintainer(cookbookJson
					.getString("cookbook_maintainer"));
		} catch (JSONException e) {
			logger.error("Error getting cookbooks", e);
		}
		return cookbook;
	}

	/**
	 * /cookbooks/{cookbook} Gets a cookbook.
	 *
	 * @param cookbook
	 * @return
	 */
	private JSONObject restCookbook(String cookbook) {
		return getService().path("api").path("v1").path("cookbooks")
				.path(cookbook).accept(MediaType.APPLICATION_JSON_TYPE)
				.get(JSONObject.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository#getCookbook
	 * (java.lang.String, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public RemoteCookbook getCookbook(String name) {
		JSONObject cookbookJson = restCookbook(name);

		String url = UriBuilder.fromUri(getRepositoryURI()).path("api")
				.path("v1").path("cookbooks").path(name).build().toString();

		RemoteCookbook cookbook = createCookbookDetail(cookbookJson, url);
		return cookbook;
	}

	private RemoteCookbook createCookbookDetail(JSONObject cookbookJson,
			String url) {
		RemoteCookbook cookbook = CookbookrepositoryFactory.eINSTANCE
				.createRemoteCookbook();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		try {
			cookbook.setName(cookbookJson.getString("name"));
			cookbook.setUrl(url);
			cookbook.setDescription(cookbookJson.getString("description"));
			cookbook.setCategory(cookbookJson.getString("category"));
			cookbook.setUpdatedAt(format.parse(cookbookJson
					.getString("updated_at")));
			cookbook.setCreatedAt(format.parse(cookbookJson
					.getString("created_at")));
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
			logger.error("Error getting cookbooks", e);
		} catch (ParseException e) {
			logger.error("Error getting cookbooks", e);
		}
		return cookbook;
	}

	@Override
	public URI getRepositoryURI() {
		return UriBuilder.fromUri(REPOSITORY_URI).build();
	}

	@Override
	public String getRepositoryId() {
		return REPOSITORY_ID;
	}

	@Override
	public boolean isUpdated(RemoteRepository repo) {
		try {
			JSONObject json = getRestCookbooks(0, 1);
			int total = json.getInt("total");
			if (total != repo.getCookbooks().size())
				return true;
		} catch (JSONException e) {
			logger.error("Error checking isUpdated", e);
		} catch (ClientHandlerException e) {
			logger.error("Error checking isUpdated", e);
		} catch (UniformInterfaceException e) {
			logger.error("Error checking isUpdated", e);
		}

		return false;
	}

	@Override
	public File downloadCookbook(RemoteCookbook cookbook, String version)
			throws InstallCookbookException {
		File downloadedCookbook = downloadCookbookStrategy.downloadCookbook(
				cookbook, version);
		return downloadedCookbook;
	}

	@Override
	public String getReadableVersion(RemoteCookbook cookbook, String version) {
		return version.replaceAll(".+?versions/", "").replace("_", ".");
	}

}
