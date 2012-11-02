package org.limepepper.chefclipse.remotepicker.ui;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


/**
 * @author Sebastian Sampaoli
 */
public class CatalogRegistry {

	private static CatalogRegistry instance;
	
	private final List<CatalogDescriptor> catalogDescriptors = new CopyOnWriteArrayList<CatalogDescriptor>();

	public synchronized static CatalogRegistry getInstance() {
		
		if (instance == null) {
			instance = new CatalogRegistry();
		}
		return instance;
	}
	
	public CatalogRegistry() {
		catalogDescriptors.addAll(new CatalogExtensionPointReader().getCatalogDescriptors());
	}

	public void register(CatalogDescriptor catalogDescriptor) {
		catalogDescriptors.add(new CatalogDescriptor(catalogDescriptor));
	}

	public void unregister(CatalogDescriptor catalogDescriptor) {
		catalogDescriptors.remove(catalogDescriptor);
	}

	public List<CatalogDescriptor> getCatalogDescriptors() {
		return Collections.unmodifiableList(catalogDescriptors);
	}

	public CatalogDescriptor findCatalogDescriptor(String url) {
		if (url == null || url.length() == 0) {
			return null;
		}
		for (CatalogDescriptor catalogDescriptor : catalogDescriptors) {
			if (url.startsWith(catalogDescriptor.getUrl().toExternalForm())) {
				return catalogDescriptor;
			}
		}
		return null;
	}
}
