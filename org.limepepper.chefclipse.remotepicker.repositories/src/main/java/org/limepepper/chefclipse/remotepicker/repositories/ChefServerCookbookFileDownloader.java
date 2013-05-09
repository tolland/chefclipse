package org.limepepper.chefclipse.remotepicker.repositories;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.SandboxedObject;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.Provider;

/**
 * Utility class to download chef server cookbook files.
 *
 * @author Guillermo Zunino
 */
public class ChefServerCookbookFileDownloader {

	/**
	 * Downloads files from chef server cookbook to destination folder.
	 * @param cookbookVer the {@link ServerCookbookVersion} to download
	 * @param dstDir dstDir destination {@link File}
	 * @return the folder where files are downloaded
	 * @throws IOException
	 */

	// @todo nasty Tom hack. need to fix the subclassing... blah!
	@SuppressWarnings("unchecked")
	public File downloadCookbook(ServerCookbookVersion cookbookVer, File dstDir) throws IOException {
		downloadFiles((List<CookbookFile>)(List<?>)cookbookVer.getRoot_files(), dstDir);
		downloadFiles((List<CookbookFile>)(List<?>)cookbookVer.getAttributes(), new File(dstDir, "attributes"));
		downloadFiles((List<CookbookFile>)(List<?>)cookbookVer.getDefinitions(), new File(dstDir, "definitions"));
		downloadFiles((List<CookbookFile>)(List<?>)cookbookVer.getFiles(), new File(dstDir, "files"));
		downloadFiles((List<CookbookFile>)(List<?>)cookbookVer.getLibraries(), new File(dstDir, "libraries"));
		downloadFiles((List<CookbookFile>)(List<?>)cookbookVer.getProviders(), new File(dstDir, "providers"));
		downloadFiles((List<CookbookFile>)(List<?>)cookbookVer.getRecipes(), new File(dstDir, "recipes"));
		downloadFiles((List<CookbookFile>)(List<?>)cookbookVer.getResources(), new File(dstDir, "resources"));
		downloadFiles((List<CookbookFile>)(List<?>)cookbookVer.getTemplates(), new File(dstDir, "templates"));
		return dstDir;
	}

	/**
	 * Downloads cookbook files from files list into dstDir.
	 * @param eList a list of {@link CookbookFile}
	 * @param dstDir destination {@link File}
	 * @throws IOException
	 */
	public void downloadFiles(List<CookbookFile> eList, File dstDir)
			throws IOException {

		for (CookbookFile file : eList) {
			FileUtils.copyURLToFile(file.getUrl(), new File(dstDir, file.getName()));
		}
	}

}
