/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.repositories;

import java.io.File;
import java.net.URI;
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
	
	public ChefServerCookbookRepository(KnifeConfig knifeConfig) {
		chefServerApi = KnifeConfigController.INSTANCE.getServer(knifeConfig);
	}

	@Override
	public String getRepositoryId() {
		return "org.limepepper.chefclipse.ChefServerCookbookRepository";
	}

	@Override
	public URI getRepositoryURI() {
		return UriBuilder.fromUri("https://api.opscode.com/organizations/chefclipse").build();
	}

	@Override
	public RemoteCookbook getCookbook(String name) {
		ServerCookbookVersion cbVersion = chefServerApi.getCookbookVersion(name);
		RemoteCookbook cookbook = createCookbook(cbVersion);
		getVersions(cbVersion.getCookbook_name(), cookbook);
		return cookbook;
	}

	/**
	 * @param cookbookVersion
	 * @return
	 */
	protected RemoteCookbook createCookbook(ServerCookbookVersion cookbookVersion) {
		RemoteCookbook cookbook = CookbookrepositoryFactory.eINSTANCE.createRemoteCookbook();
		cookbook.setName(cookbookVersion.getCookbook_name());
		cookbook.setMaintainer(cookbookVersion.getMetadata().getMaintainer());
		cookbook.setCategory(cookbookVersion.getJson_class());
		cookbook.setDescription(cookbookVersion.getMetadata().getDescription());
		cookbook.setDeprecated(cookbookVersion.getMetadata().getReplacing() != null);
		cookbook.setReplacement(cookbookVersion.getMetadata().getReplacing());
		cookbook.setRepositoryId(getRepositoryId());
		
		//TODO use readme.me file
		cookbook.setUrl(cookbook.getExternalUrl());
		
		return cookbook;
	}

	/**
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

	@Override
	public Collection<RemoteCookbook> getCookbooks() {
		Collection<RemoteCookbook> remotes = new ArrayList<RemoteCookbook>();

		Map<String, VersionUrl> list = chefServerApi.getCookbookList();
        
        for (Entry<String, VersionUrl> entry : list.entrySet()) {
        	RemoteCookbook c = createCookbook(chefServerApi.getCookbookVersion(entry.getKey()));
        	c.setUrl(entry.getValue().getUrl());
        	
        	for (URLEntryTest version : entry.getValue().getVersions()) {
        		c.getVersions().add(version.getUrl());
			}
        	
        	remotes.add(c);
        }
		
		return remotes;
	}


	@Override
	public boolean isUpdated(RemoteRepository repo) {
		Map<String, VersionUrl> cookbookVersions = chefServerApi.getCookbookList();
		
		if (repo.getCookbooks().size() != cookbookVersions.keySet().size())
			return true;
		
		for (RemoteCookbook cookbook : repo.getCookbooks()) {
			VersionUrl version = cookbookVersions.get(cookbook.getName());
			
			if (version.getVersions().size() != cookbook.getVersions().size())
				return true;
		}
		return false;
	}

	@Override
	public File downloadCookbook(RemoteCookbook remoteCookbook, String version)
			throws InstallCookbookException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getReadableVersion(RemoteCookbook cookbook, String version) {
		if (version.endsWith("/"))
			version = version.substring(0, version.length()-1);
		return version.substring(version.lastIndexOf("/")+1);
	}

}
