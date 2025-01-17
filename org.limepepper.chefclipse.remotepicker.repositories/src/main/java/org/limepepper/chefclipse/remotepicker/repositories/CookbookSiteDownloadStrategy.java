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
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.GZIPInputStream;

import javax.ws.rs.core.UriBuilder;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.limepepper.chefclipse.remotepicker.api.IDownloadCookbookStrategy;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;

/**
 * @author Sebastian Sampaoli
 * 
 */
public class CookbookSiteDownloadStrategy implements IDownloadCookbookStrategy {

	private String repositoryURI;
	private ICookbooksRepository repo;

<<<<<<< HEAD
	public CookbookSiteDownloadStrategy(String repositoryURI,
			ICookbooksRepository repo) {
		this.repo = repo;
=======
	public CookbookSiteDownloadStrategy(String repositoryURI) {

>>>>>>> origin/tomhodder
		this.repositoryURI = repositoryURI;
	}

	/*
	 * (non-Javadoc)
<<<<<<< HEAD
	 *
=======
	 * 
>>>>>>> origin/tomhodder
	 * @see
	 * org.limepepper.chefclipse.remotepicker.api.IDownloadCookbookStrategy#
	 * downloadCookbook
	 * (org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook)
	 */
	@Override
<<<<<<< HEAD
	public File downloadCookbook(RemoteCookbook cookbook, String version)
=======
	public File downloadCookbook(RemoteCookbook cookbook)
>>>>>>> origin/tomhodder
			throws InstallCookbookException {

		URLConnection connection = null;
		try {
<<<<<<< HEAD
			String latestVersion = version;
=======
			String latestVersion = cookbook.getLatestVersion();
>>>>>>> origin/tomhodder
			String lastVersion = latestVersion.substring(latestVersion
					.lastIndexOf("/") + 1);
			String url = UriBuilder.fromUri(repositoryURI).path("cookbooks")
					.path(cookbook.getName()).path("versions")
					.path(lastVersion).path("downloads").build().toString();
			URL cookbookURL = new URL(url);
			connection = cookbookURL.openConnection();
			InputStream stream = connection.getInputStream();
			BufferedInputStream in = new BufferedInputStream(stream);
			File tempZipFile = File.createTempFile("temp",
					Long.toString(System.nanoTime()) + ".gz");
			FileOutputStream fileOutputStream = new FileOutputStream(
					tempZipFile);
			BufferedOutputStream out = new BufferedOutputStream(
					fileOutputStream);
			int i;
			while ((i = in.read()) != -1) {
				out.write(i);
			}
			out.flush();
			out.close();
			File decompressedCookbook = decompressCookbook(tempZipFile);
<<<<<<< HEAD
			File tmpCookbook = new File(decompressedCookbook.getParentFile(),
					cookbook.getName() + "_"
							+ repo.getReadableVersion(cookbook, version));
			FileUtils.deleteDirectory(tmpCookbook);
			in.close();
			if (!decompressedCookbook.renameTo(tmpCookbook))
				throw new IOException("Could not rename folder "
						+ decompressedCookbook + " to " + tmpCookbook);

			return tmpCookbook;
=======
			in.close();
			return new File(decompressedCookbook, cookbook.getName());
>>>>>>> origin/tomhodder
		} catch (FileNotFoundException e) {
			if (connection != null) {
				throw new InstallCookbookException(
						InstallCookbookException.DOWNLOAD_COOKBOOK_EXCEPTION_MESSAGE
								+ cookbook.getName()
								+ ".\nThe file "
								+ connection.getURL().toString()
								+ " could not be found.", e);
			} else {
				throw new InstallCookbookException(
						InstallCookbookException.DOWNLOAD_COOKBOOK_EXCEPTION_MESSAGE
								+ cookbook.getName()
								+ ".\nThe cookbook related file could not be found.",
						e);
			}
		} catch (UnknownHostException e) {
			throw new InstallCookbookException(
					InstallCookbookException.DOWNLOAD_COOKBOOK_EXCEPTION_MESSAGE
							+ cookbook.getName()
							+ ".\nThe host "
							+ e.getMessage() + " is unknown.", e);
		} catch (IOException e) {
			throw new InstallCookbookException(
					InstallCookbookException.DOWNLOAD_COOKBOOK_EXCEPTION_MESSAGE
							+ cookbook.getName(), e);
		}
	}

	/*
	 * (non-Javadoc)
<<<<<<< HEAD
	 *
=======
	 * 
>>>>>>> origin/tomhodder
	 * @see
	 * org.limepepper.chefclipse.remotepicker.api.IDownloadCookbookStrategy#
	 * decompressCookbook(java.io.File)
	 */
	@Override
	public File decompressCookbook(File compressedFile) throws IOException {

		String absolutePath = compressedFile.getParent() + File.separator;
		try {
			File unGzip = unGzip(compressedFile);
			File outputDir = new File(absolutePath);
			List<File> files = unTar(unGzip, outputDir);
			return files.get(0);
		} catch (ArchiveException e1) {
			throw new IOException(e1.getMessage(), e1);
		}
	}

	/**
	 * Untar an input file into an output file.
<<<<<<< HEAD
	 *
	 * The output file is created in the output folder, having the same name as
	 * the input file, minus the '.tar' extension.
	 *
=======
	 * 
	 * The output file is created in the output folder, having the same name as
	 * the input file, minus the '.tar' extension.
	 * 
>>>>>>> origin/tomhodder
	 * @param inputFile
	 *            the input .tar file
	 * @param outputDir
	 *            the output directory file.
	 * @throws IOException
	 * @throws FileNotFoundException
<<<<<<< HEAD
	 *
=======
	 * 
>>>>>>> origin/tomhodder
	 * @return The {@link List} of {@link File}s with the untared content.
	 * @throws ArchiveException
	 */
	private List<File> unTar(final File inputFile, final File outputDir)
			throws FileNotFoundException, IOException, ArchiveException {

		// System.out.println("Untaring %s to dir %s." +
		// inputFile.getAbsolutePath() + outputDir.getAbsolutePath());
		// LOG.info(String.format("Untaring %s to dir %s.",
		// inputFile.getAbsolutePath(), outputDir.getAbsolutePath()));

		final List<File> untaredFiles = new LinkedList<File>();
		final InputStream is = new FileInputStream(inputFile);
		final TarArchiveInputStream debInputStream = (TarArchiveInputStream) new ArchiveStreamFactory()
				.createArchiveInputStream("tar", is);
		TarArchiveEntry entry = null;
		while ((entry = (TarArchiveEntry) debInputStream.getNextEntry()) != null) {
			final File outputFile = new File(outputDir, entry.getName());
			if (entry.isDirectory() || entry.getName().endsWith(File.separator)) {
				// LOG.info(String.format("Attempting to write output directory %s.",
				// outputFile.getAbsolutePath()));
				if (!outputFile.exists()) {
					// LOG.info(String.format("Attempting to create output directory %s.",
					// outputFile.getAbsolutePath()));
					if (!outputFile.mkdirs()) {
<<<<<<< HEAD
=======
						is.close();
						debInputStream.close();
>>>>>>> origin/tomhodder
						throw new IllegalStateException(String.format(
								"Couldn't create directory %s.",
								outputFile.getAbsolutePath()));
					}
				}
			} else {
				// LOG.info(String.format("Creating output file %s.",
				// outputFile.getAbsolutePath()));
				if (!outputFile.getParentFile().exists()) {
					if (!outputFile.getParentFile().mkdirs()) {
<<<<<<< HEAD
=======
						is.close();
						debInputStream.close();
>>>>>>> origin/tomhodder
						throw new IllegalStateException(String.format(
								"Couldn't create directory %s.",
								outputFile.getAbsolutePath()));
					}
				}
				final OutputStream outputFileStream = new FileOutputStream(
						outputFile);
				IOUtils.copy(debInputStream, outputFileStream);
				outputFileStream.close();
			}
			untaredFiles.add(outputFile);
		}
		debInputStream.close();
<<<<<<< HEAD

=======
		is.close();
>>>>>>> origin/tomhodder
		return untaredFiles;
	}

	/**
	 * Ungzip an input file into an output file.
	 * <p>
	 * The output file is created in the output folder, having the same name as
	 * the input file, minus the '.gz' extension.
<<<<<<< HEAD
	 *
=======
	 * 
>>>>>>> origin/tomhodder
	 * @param inputFile
	 *            the input .gz file
	 * @param outputDir
	 *            the output directory file.
	 * @throws IOException
	 * @throws FileNotFoundException
<<<<<<< HEAD
	 *
=======
	 * 
>>>>>>> origin/tomhodder
	 * @return The {@File} with the ungzipped content.
	 */
	private File unGzip(final File inputFile) throws FileNotFoundException,
			IOException {
<<<<<<< HEAD

		// System.out.println("Ungzipping %s to dir %s." + inputFile.getParent()
		// + inputFile.getName().substring(0, inputFile.getName().length() -
		// 3));
		// LOG.info(String.format("Ungzipping %s to dir %s.",
		// inputFile.getAbsolutePath(), outputDir.getAbsolutePath()));

		final File outputFile = new File(inputFile.getParent(), inputFile
				.getName().substring(0, inputFile.getName().length() - 3));

		final GZIPInputStream in = new GZIPInputStream(new FileInputStream(
				inputFile));
		final FileOutputStream out = new FileOutputStream(outputFile);

=======

		// System.out.println("Ungzipping %s to dir %s." + inputFile.getParent()
		// + inputFile.getName().substring(0, inputFile.getName().length() -
		// 3));
		// LOG.info(String.format("Ungzipping %s to dir %s.",
		// inputFile.getAbsolutePath(), outputDir.getAbsolutePath()));

		final File outputFile = new File(inputFile.getParent(), inputFile
				.getName().substring(0, inputFile.getName().length() - 3));

		final GZIPInputStream in = new GZIPInputStream(new FileInputStream(
				inputFile));
		final FileOutputStream out = new FileOutputStream(outputFile);

>>>>>>> origin/tomhodder
		for (int c = in.read(); c != -1; c = in.read()) {
			out.write(c);
		}

		in.close();
		out.close();

		return outputFile;
	}

}
