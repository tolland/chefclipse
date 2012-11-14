package org.limepepper.chefclipse.remotepicker.ui.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.equinox.internal.p2.ui.discovery.wizards.CatalogConfiguration;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;

/**
 * @author Sebastian Sampaoli
 */
public class CookbookCatalogConfiguration extends CatalogConfiguration {
	
	private List<CatalogDescriptor> catalogDescriptors = new ArrayList<CatalogDescriptor>();

	private CatalogDescriptor catalogDescriptor;

	public CookbookCatalogConfiguration() {
		setShowTagFilter(false);
		setShowInstalled(true);
		setShowInstalledFilter(false);
		setVerifyUpdateSiteAvailability(true);
		setShowCategories(false);
	}

	public List<CatalogDescriptor> getCatalogDescriptors() {
		return catalogDescriptors;
	}

	public void setCatalogDescriptors(List<CatalogDescriptor> catalogDescriptors) {
		this.catalogDescriptors = catalogDescriptors;
	}

	public CatalogDescriptor getCatalogDescriptor() {
		return catalogDescriptor;
	}

	public void setCatalogDescriptor(CatalogDescriptor catalogDescriptor) {
		this.catalogDescriptor = catalogDescriptor;
	}

}
