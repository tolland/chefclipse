/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.repositories;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.core.UriBuilder;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.URLEntryTest;
import org.limepepper.chefclipse.VersionUrl;
import org.limepepper.chefclipse.REST.CookbookListResp;
import org.limepepper.chefclipse.REST.CookbookListVersionResp;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.chefserver.api.KnifeConfigController;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryFactory;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Guillermo Zunino
 *
 */
public class ChefServerCookbookRepository implements ICookbooksRepository {
	
	static final Logger logger = LoggerFactory.getLogger(ChefServerCookbookRepository.class);

	private ChefServerApi chefServerApi;
	private KnifeConfig knifeConfig;
	
	public ChefServerCookbookRepository(KnifeConfig knifeConfig) {
		this.knifeConfig = knifeConfig;
		chefServerApi = KnifeConfigController.INSTANCE.getServer(knifeConfig);
	}

	@Override
	public String getRepositoryId() {
		return "org.limepepper.chefclipse.ChefServerCookbookRepository";
	}

	@Override
	public URI getRepositoryURI() {
		try {
			return knifeConfig.getChef_server_url().toURI();
		} catch (URISyntaxException e) {
			logger.error(e.getMessage());
		}
		return UriBuilder.fromUri("https://api.opscode.com/organizations").build();
	}

	/**
	 * Gets a cookbook by name.
	 */
	@Override
	public RemoteCookbook getCookbook(String name) {
		ServerCookbookVersion cbVersion = chefServerApi.getCookbookVersion(name);
		RemoteCookbook cookbook = createCookbook(cbVersion);
		getVersions(cbVersion.getCookbook_name(), cookbook);
		return cookbook;
	}

	protected RemoteCookbook createCookbook(ServerCookbookVersion cookbookVersion) {
		RemoteCookbook cookbook = CookbookrepositoryFactory.eINSTANCE.createRemoteCookbook();
		cookbook.setName(cookbookVersion.getCookbook_name());
		cookbook.setMaintainer(cookbookVersion.getMetadata().getMaintainer());
		cookbook.setCategory(cookbookVersion.getJson_class());
		cookbook.setDescription(cookbookVersion.getMetadata().getDescription());
		cookbook.setDeprecated(cookbookVersion.getMetadata().getReplacing() != null);
		cookbook.setReplacement(cookbookVersion.getMetadata().getReplacing());
		cookbook.setRepositoryId(getRepositoryId());
		
		cookbook.setUrl(cookbook.getExternalUrl());
		
		return cookbook;
	}

	/**
	 * Gets available versions for given cookbook.
	 * @param cookbookVersion
	 * @param cookbook
	 */
	protected void getVersions(String cookbookName, RemoteCookbook cookbook) {
		CookbookListResp info = chefServerApi.getCookbookInfo(cookbookName);
		cookbook.setUrl(info.getUrl());
		EList<CookbookListVersionResp> versions = info.getVersions();
		for (CookbookListVersionResp cookbookListVersionResp : versions) {
			 cookbook.getVersions().add(cookbookListVersionResp.getUrl());
		}
		if (!cookbook.getVersions().isEmpty()) {
			cookbook.setLatestVersion(cookbook.getVersions().get(0));
			cookbook.setExternalUrl(cookbook.getVersions().get(0));
		}
	}

	/**
	 * Gets avalilable cookbooks on this chef server.
	 */
	@Override
	public Collection<RemoteCookbook> getCookbooks() {
		Collection<RemoteCookbook> remotes = new ArrayList<RemoteCookbook>();

		Map<String, VersionUrl> list = chefServerApi.getCookbookList();
		if (list == null) {
			throw new RuntimeException("Could not download cookbooks");
		}
        
        for (Entry<String, VersionUrl> entry : list.entrySet()) {
        	RemoteCookbook c = createCookbook(chefServerApi.getCookbookVersion(entry.getKey()));
        	
        	getVersions(c.getName(), c);
        	c.setUrl(entry.getValue().getUrl());
        	
        	for (URLEntryTest version : entry.getValue().getVersions()) {
        		c.getVersions().add(version.getUrl());
			}
        	
        	remotes.add(c);
        }
		
		return remotes;
	}

	/**
	 * Checks if server has new cookbooks or versions.
	 */
	@Override
	public boolean isUpdated(RemoteRepository repo) {
		Map<String, VersionUrl> cookbookVersions = chefServerApi.getCookbookList();
		
		if (repo.getCookbooks().size() != cookbookVersions.keySet().size())
			return true;
		
		for (RemoteCookbook cookbook : repo.getCookbooks()) {
			VersionUrl version = cookbookVersions.get(cookbook.getName());
			
			if (version.getVersions().size() > cookbook.getVersions().size())
				return true;
		}
		return false;
	}

	/**
	 * Downloads all files of coookbook into tmp folder.
	 */
	@Override
	public File downloadCookbook(RemoteCookbook cookbook, String version)
			throws InstallCookbookException {
		ServerCookbookVersion cookbookVer = chefServerApi.
				getCookbookVersion(cookbook.getName(), getReadableVersion(cookbook, version));
		
		try {
			Path tmpDir = Files.createTempDirectory(cookbook.getName());
			File dstDir = new File(tmpDir.getParent().toFile(), cookbook.getName() + "_" + getReadableVersion(cookbook, version));
			
			ChefServerCookbookFileDownloader downloader = new ChefServerCookbookFileDownloader();
			downloader.downloadCookbook(cookbookVer, dstDir);
			return dstDir;
		} catch (IOException e) {
			logger.error("Error downloading cookbook", e);
			throw new InstallCookbookException(e);
		}
	}

	/**
	 * Returns the latest part of the version url.
	 */
	@Override
	public String getReadableVersion(RemoteCookbook cookbook, String version) {
		if (version.endsWith("/"))
			version = version.substring(0, version.length()-1);
		return version.substring(version.lastIndexOf("/")+1);
	}

}
