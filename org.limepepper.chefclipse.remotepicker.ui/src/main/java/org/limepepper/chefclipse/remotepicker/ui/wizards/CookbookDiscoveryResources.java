/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.ui.wizards;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.equinox.internal.p2.discovery.AbstractCatalogSource;
import org.eclipse.equinox.internal.p2.discovery.model.AbstractCatalogItem;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogCategory;
import org.eclipse.equinox.internal.p2.discovery.model.Icon;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.DiscoveryResources;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.ui.Activator;

/**
 * @author Sebastian Sampaoli
 *
 */
public class CookbookDiscoveryResources extends DiscoveryResources {

	@Inject
	private CookbookRepositoryManager repoManager;
	private CookbookCatalogConfiguration cookbookCatalogConfiguration;
	private LocalResourceManager resourceManager;
	@SuppressWarnings("restriction")
	private AbstractCatalogItem currentCatalogItem;
	
	/**
	 * @param display
	 * @param cookbookCatalogConfiguration 
	 */
	public CookbookDiscoveryResources(Display display, CookbookCatalogConfiguration cookbookCatalogConfiguration) {
		super(display);
		this.cookbookCatalogConfiguration = cookbookCatalogConfiguration;
		this.resourceManager = new LocalResourceManager(JFaceResources.getResources(display));
		CookbookRepositoryManager repoManager = CookbookRepositoryManager.getInstance();
		setRepoManager(repoManager);
	}
	
	public Image getIconImage(AbstractCatalogSource discoverySource, Icon icon, int dimension, boolean fallback) {
		
		Image baseIconImage = super.getIconImage(discoverySource, icon, dimension, fallback);
		if (getCurrentCatalogItem() instanceof CatalogCategory){
			return baseIconImage;
		}
		String repositoryId = cookbookCatalogConfiguration.getCatalogDescriptor().getId();
		RemoteRepository remoteRepository = repoManager.getInstance().getRepository(repositoryId);
		RemoteCookbook cookbook = (RemoteCookbook) getCurrentCatalogItem().getData();
		List<ImageDescriptor> imageOverlays = new ArrayList<ImageDescriptor>();
		Date updatedAt = remoteRepository.getUpdatedAt();
		if (updatedAt != null && cookbook.getCreatedAt().after(updatedAt)){
			ImageDescriptor overlay = Activator.getDefault().getImageRegistry().getDescriptor(Activator.NEW_ICON_OVERLAY);
			imageOverlays.add(overlay);
		}
		Date installedAt = cookbook.getInstalledAt();
		if (installedAt != null && cookbook.getUpdatedAt().after(installedAt)){
			ImageDescriptor overlay = Activator.getDefault().getImageRegistry().getDescriptor(Activator.DIRTY_ICON_OVERLAY);
			imageOverlays.add(overlay);
		}
		if (installedAt != null){
			ImageDescriptor overlay = Activator.getDefault().getImageRegistry().getDescriptor(Activator.INSTALLED_ICON_OVERLAY);
			imageOverlays.add(overlay);
		}
		if (cookbook.isDeprecated()){
			ImageDescriptor overlay = Activator.getDefault().getImageRegistry().getDescriptor(Activator.DEPRECATED_ICON_OVERLAY);
			imageOverlays.add(overlay);
		}
		DecorationOverlayIcon imageOverlayed = new DecorationOverlayIcon(baseIconImage, imageOverlays.toArray(new ImageDescriptor[]{}));
		return resourceManager.createImage(imageOverlayed);		
	}

	public CookbookRepositoryManager getRepoManager() {
		return repoManager;
	}

	public void setRepoManager(CookbookRepositoryManager repoManager) {
		this.repoManager = repoManager;
	}

	public AbstractCatalogItem getCurrentCatalogItem() {
		return currentCatalogItem;
	}

	public void setCurrentCatalogItem(AbstractCatalogItem currentCatalogItem) {
		this.currentCatalogItem = currentCatalogItem;
	}

}
