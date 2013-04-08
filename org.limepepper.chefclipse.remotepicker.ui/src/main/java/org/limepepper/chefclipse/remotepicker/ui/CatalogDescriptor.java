package org.limepepper.chefclipse.remotepicker.ui;

import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;

/**
 * A descriptor for identifying a solutions catalog.
 * 
 * @author Sebastian Sampaoli
 */
public final class CatalogDescriptor {
	
	private URL url;

	private String label;

	private String description;

	private ImageDescriptor icon;

	private boolean installFromAllRepositories;

	private URL dependenciesRepository;

	private String id;

	public CatalogDescriptor() {
	}

	/**
	 * @param url
	 *            The URL of the catalog. See {@link #getIcon()}
	 * @param label
	 *            The label identifying the catalog. See {@link #getLabel()}
	 */
	public CatalogDescriptor(URL url, String label) {
		this.url = url;
		this.label = label;
	}

	public CatalogDescriptor(CatalogDescriptor catalogDescriptor) {
		if (catalogDescriptor == null) {
			throw new IllegalArgumentException();
		}
		this.url = catalogDescriptor.url;
		this.label = catalogDescriptor.label;
		this.description = catalogDescriptor.description;
		this.icon = catalogDescriptor.icon;
		this.dependenciesRepository = catalogDescriptor.dependenciesRepository;
		this.installFromAllRepositories = catalogDescriptor.installFromAllRepositories;
	}

	/**
	 * The URL of the catalog.
	 */
	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	/**
	 * A description of the catalog.
	 * 
	 * @return the description or null if there is no description
	 */
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * An icon to be used in branding the catalog. Must refer to an image of size 32x32
	 */
	public ImageDescriptor getIcon() {
		return icon;
	}

	public void setIcon(ImageDescriptor icon) {
		this.icon = icon;
	}

	/**
	 * The label that identifies the catalog. Presented to the user, should be no more than a few words.
	 */
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((url == null) ? 0 : url.toString().hashCode());
		return result;
	}

	/**
	 * identity is determined by the {@link #getUrl()}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CatalogDescriptor other = (CatalogDescriptor) obj;
		if (!urlEquals(url, other.url)) {
			return false;
		}
		return true;
	}

	private static boolean urlEquals(URL url1, URL url2) {
	
		if (url1 == url2) {
			return true;
		} else if (url1 == null) {
			return false;
		} else if (url2 == null) {
			return false;
		}
		try {
			return url1.toURI().equals(url2.toURI());
		} catch (URISyntaxException e) {
			Activator.log(e);
			return false;
		}
	}

	@Override
	public String toString() {
		return "CatalogDescriptor [url=" + url + "]"; //$NON-NLS-1$ //$NON-NLS-2$
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getId(){
		return id;
	}

}
