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

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.io.IOUtils;
import org.limepepper.chefclipse.remotepicker.api.IDownloadCookbookStrategy;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;

/**
 * @author Sebastian Sampaoli
 *
 */
public class CookbookSiteDownloadStrategy implements
		IDownloadCookbookStrategy {

	private String repositoryURI;

	public CookbookSiteDownloadStrategy(String repositoryURI){
		
		this.repositoryURI = repositoryURI;
	}
	/* (non-Javadoc)
	 * @see org.limepepper.chefclipse.remotepicker.api.IDownloadCookbookStrategy#downloadCookbook(org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook)
	 */
	@Override
	public File downloadCookbook(RemoteCookbook cookbook) throws InstallCookbookException {
		
		URLConnection connection = null;
		try {
			String latestVersion = cookbook.getLatestVersion();
			String lastVersion = latestVersion
					.substring(latestVersion.length() - 5);
			URL cookbookURL = new URL(repositoryURI + File.separator
					+ "cookbooks" + File.separator + cookbook.getName()
					+ File.separator + "versions" + File.separator
					+ lastVersion + File.separator + "downloads");
			connection = cookbookURL.openConnection();
			InputStream stream = connection.getInputStream();
			BufferedInputStream in = new BufferedInputStream(stream);
			File tempZipFile = File.createTempFile("temp", Long.toString(System.nanoTime()) + ".gz");
			FileOutputStream fileOutputStream = new FileOutputStream(tempZipFile);
			BufferedOutputStream out = new BufferedOutputStream(fileOutputStream);
			int i;
			while ((i = in.read()) != -1) {
				out.write(i);
			}
			out.flush();
			out.close();
			File decompressedCookbook = decompressCookbook(tempZipFile);
			return new File(decompressedCookbook, cookbook.getName());
		} catch (FileNotFoundException e) {
			if (connection != null){
				throw new InstallCookbookException(InstallCookbookException.DOWNLOAD_COOKBOOK_EXCEPTION_MESSAGE + cookbook.getName() + ".\nThe file " + connection.getURL().toString() + " could not be found.", e);
			} else {
				throw new InstallCookbookException(InstallCookbookException.DOWNLOAD_COOKBOOK_EXCEPTION_MESSAGE + cookbook.getName() + ".\nThe cookbook related file could not be found.", e);
			}
		} catch (UnknownHostException e) {
			throw new InstallCookbookException(InstallCookbookException.DOWNLOAD_COOKBOOK_EXCEPTION_MESSAGE + cookbook.getName() + ".\nThe host " + e.getMessage() + " is unknown.", e);
		} catch (IOException e) {
			throw new InstallCookbookException(InstallCookbookException.DOWNLOAD_COOKBOOK_EXCEPTION_MESSAGE + cookbook.getName(), e);
		}
	}

	/* (non-Javadoc)
	 * @see org.limepepper.chefclipse.remotepicker.api.IDownloadCookbookStrategy#decompressCookbook(java.io.File)
	 */
	@Override
	public File decompressCookbook(File compressedFile) throws IOException {
		
		String absolutePath = compressedFile.getParent() + File.separator;
		try {
			File unGzip = unGzip(compressedFile);
			File outputDir = new File(absolutePath);
			unTar(unGzip, outputDir);
			return outputDir;
		} catch (ArchiveException e1) {
			throw new IOException(e1.getMessage(), e1);
		} 
	}
	
	/** Untar an input file into an output file.

	 * The output file is created in the output folder, having the same name
	 * as the input file, minus the '.tar' extension. 
	 * 
	 * @param inputFile     the input .tar file
	 * @param outputDir     the output directory file. 
	 * @throws IOException 
	 * @throws FileNotFoundException
	 *  
	 * @return  The {@link List} of {@link File}s with the untared content.
	 * @throws ArchiveException 
	 */
	private List<File> unTar(final File inputFile, final File outputDir) throws FileNotFoundException, IOException, ArchiveException {

//	    System.out.println("Untaring %s to dir %s." + inputFile.getAbsolutePath() + outputDir.getAbsolutePath());
		//LOG.info(String.format("Untaring %s to dir %s.", inputFile.getAbsolutePath(), outputDir.getAbsolutePath()));

	    final List<File> untaredFiles = new LinkedList<File>();
	    final InputStream is = new FileInputStream(inputFile); 
	    final TarArchiveInputStream debInputStream = (TarArchiveInputStream) new ArchiveStreamFactory().createArchiveInputStream("tar", is);
	    TarArchiveEntry entry = null; 
	    while ((entry = (TarArchiveEntry)debInputStream.getNextEntry()) != null) {
	        final File outputFile = new File(outputDir, entry.getName());
	        if (entry.getName().endsWith(File.separator)) {
	            //LOG.info(String.format("Attempting to write output directory %s.", outputFile.getAbsolutePath()));
	            if (!outputFile.exists()) {
	                //LOG.info(String.format("Attempting to create output directory %s.", outputFile.getAbsolutePath()));
	                if (!outputFile.mkdirs()) {
	                    throw new IllegalStateException(String.format("Couldn't create directory %s.", outputFile.getAbsolutePath()));
	                }
	            }
	        } else {
	            //LOG.info(String.format("Creating output file %s.", outputFile.getAbsolutePath()));
	        	if (!outputFile.getParentFile().exists()){
	        		if (!outputFile.getParentFile().mkdirs()) {
	                    throw new IllegalStateException(String.format("Couldn't create directory %s.", outputFile.getAbsolutePath()));
	                }
	        	}
	            final OutputStream outputFileStream = new FileOutputStream(outputFile); 
	            IOUtils.copy(debInputStream, outputFileStream);
	            outputFileStream.close();
	        }
	        untaredFiles.add(outputFile);
	    }
	    debInputStream.close(); 

	    return untaredFiles;
	}

	/**
	 * Ungzip an input file into an output file.
	 * <p>
	 * The output file is created in the output folder, having the same name
	 * as the input file, minus the '.gz' extension. 
	 * 
	 * @param inputFile     the input .gz file
	 * @param outputDir     the output directory file. 
	 * @throws IOException 
	 * @throws FileNotFoundException
	 *  
	 * @return  The {@File} with the ungzipped content.
	 */
	private File unGzip(final File inputFile) throws FileNotFoundException, IOException {
		
//		System.out.println("Ungzipping %s to dir %s." + inputFile.getParent() + inputFile.getName().substring(0, inputFile.getName().length() - 3));
	    //LOG.info(String.format("Ungzipping %s to dir %s.", inputFile.getAbsolutePath(), outputDir.getAbsolutePath()));

	    final File outputFile = new File(inputFile.getParent(), inputFile.getName().substring(0, inputFile.getName().length() - 3));

	    final GZIPInputStream in = new GZIPInputStream(new FileInputStream(inputFile));
	    final FileOutputStream out = new FileOutputStream(outputFile);

	    for (int c = in.read(); c != -1; c = in.read()) {
	        out.write(c);
	    }

	    in.close();
	    out.close();

	    return outputFile;
	}

}
