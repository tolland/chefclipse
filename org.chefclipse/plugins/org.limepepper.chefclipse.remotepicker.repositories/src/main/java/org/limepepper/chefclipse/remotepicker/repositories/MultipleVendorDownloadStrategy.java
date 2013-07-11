/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.repositories;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.limepepper.chefclipse.remotepicker.api.IDownloadCookbookStrategy;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;

/**
 * @author Sebastian Sampaoli
 *
 */

public class MultipleVendorDownloadStrategy implements IDownloadCookbookStrategy{

	private ICookbooksRepository repo;

	public MultipleVendorDownloadStrategy(ICookbooksRepository repo) {
		this.repo = repo;
	}

	@Override
	public File downloadCookbook(RemoteCookbook cookbook, String version) throws InstallCookbookException {
	    URLConnection connection = null;
		try {
			String url = version;
		    URL cookbookURL = new URL(url);
			connection = cookbookURL.openConnection();
			InputStream stream = connection.getInputStream();
			BufferedInputStream in = new BufferedInputStream(stream);
			File tempZipFile = File.createTempFile("temp", Long.toString(System.nanoTime()) + ".zip");
			FileOutputStream fileOutputStream = new FileOutputStream(tempZipFile);
			BufferedOutputStream out = new BufferedOutputStream(fileOutputStream);
			int i;
			while ((i = in.read()) != -1) {
			    out.write(i);
			}
			out.flush();
			out.close();
			decompressCookbook(tempZipFile);
			
			String readableVersion = repo.getReadableVersion(cookbook, version);
			File decompressedCookbook = new File(tempZipFile.getParentFile(), cookbook.getName() + "-" + readableVersion);
			File tmpCookbook = new File(decompressedCookbook.getParentFile(), cookbook.getName() + "_" + readableVersion);
			FileUtils.deleteDirectory(tmpCookbook);
			if (!decompressedCookbook.renameTo(tmpCookbook))
				throw new IOException("Could not rename folder " + decompressedCookbook + " to " + tmpCookbook );
			return tmpCookbook;
		} catch (FileNotFoundException e) {
			if (connection != null){
				throw new InstallCookbookException(InstallCookbookException.DOWNLOAD_COOKBOOK_EXCEPTION_MESSAGE + cookbook.getName() + ".\nThe file " + connection.getURL().toString() + " could not be found.", e);
			} else {
				throw new InstallCookbookException(InstallCookbookException.DOWNLOAD_COOKBOOK_EXCEPTION_MESSAGE + cookbook.getName() + ". The cookbook related file could not be found.", e);
			}
		} catch (UnknownHostException e) {
			throw new InstallCookbookException(InstallCookbookException.DOWNLOAD_COOKBOOK_EXCEPTION_MESSAGE + cookbook.getName() + ".\nThe host " + e.getMessage() + " is unknown.", e);
		} catch (IOException e) {
			throw new InstallCookbookException(InstallCookbookException.DOWNLOAD_COOKBOOK_EXCEPTION_MESSAGE + cookbook.getName(), e);
		}
	}

	@SuppressWarnings("resource")
	@Override
	public File decompressCookbook(File compressedFile)
			throws IOException {

		String absolutePath = compressedFile.getParent();
		InputStream fileInputStream = null;
		ZipInputStream zipInputStream = null;

		fileInputStream = new FileInputStream(compressedFile);
		zipInputStream = new ZipInputStream(fileInputStream);
		ZipEntry zipEntry = null;
		File targetDirectory = null;

		while ((zipEntry = zipInputStream.getNextEntry()) != null) {

			if (zipEntry.isDirectory() || zipEntry.getName().endsWith(File.separator)) {
				targetDirectory = new File(absolutePath, zipEntry.getName());
				if (!targetDirectory.exists()) {
					final boolean mkdirs = targetDirectory.mkdirs();
					if (!mkdirs) {
						throw new IOException();
					}
				}
			} else {// the zip entry is a file
				String targetPath = absolutePath + File.separator
						+ zipEntry.getName();
				FileOutputStream fileOutputStream = new FileOutputStream(
						targetPath);
				for (int c = zipInputStream.read(); c != -1; c = zipInputStream
						.read()) {
					fileOutputStream.write(c);
				}
				fileOutputStream.close();
			}
			zipInputStream.closeEntry();
		}
		closeResources(fileInputStream, zipInputStream);
		return targetDirectory;
	}

	private void closeResources(InputStream fileInputStream,
			ZipInputStream zipInputStream) {
		try {
			if (fileInputStream != null){
				fileInputStream.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			if (zipInputStream != null){
				zipInputStream.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}