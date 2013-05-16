package org.limepepper.chefclipse.remotepicker.repositories;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;

/**
 * Utility class to download chef server cookbook files.
 *
 * @author Guillermo Zunino
 */
public class ChefServerCookbookFileDownloader {

	/**
	 * Downloads files from chef server cookbook to destination folder.
	 *
	 * @param cookbookVer
	 *            the {@link ServerCookbookVersion} to download
	 * @param dstDir
	 *            dstDir destination {@link File}
	 * @return the folder where files are downloaded
	 * @throws IOException
	 */
	public File downloadCookbook(ServerCookbookVersion cookbookVer, File dstDir)
			throws IOException {
		downloadFiles(cookbookVer.getRoot_files(), dstDir);
		downloadFiles(cookbookVer.getAttributes(), new File(dstDir,
				"attributes"));
		downloadFiles(cookbookVer.getDefinitions(), new File(dstDir,
				"definitions"));
		downloadFiles(cookbookVer.getFiles(), new File(dstDir, "files"));
		downloadFiles(cookbookVer.getLibraries(), new File(dstDir, "libraries"));
		downloadFiles(cookbookVer.getProviders(), new File(dstDir, "providers"));
		downloadFiles(cookbookVer.getRecipes(), new File(dstDir, "recipes"));
		downloadFiles(cookbookVer.getResources(), new File(dstDir, "resources"));
		downloadFiles(cookbookVer.getTemplates(), new File(dstDir, "templates"));
		return dstDir;
	}

	/**
	 * Downloads cookbook files from files list into dstDir.
	 *
	 * @param files
	 *            a list of {@link ServerCookbookFile}
	 * @param dstDir
	 *            destination {@link File}
	 * @throws IOException
	 */
	public void downloadFiles(EList<? extends CookbookFile> files, File dstDir)
			throws IOException {
		for (CookbookFile file : files) {
			FileUtils.copyURLToFile(file.getUrl(),
					new File(dstDir, file.getName()));
		}
	}

}
