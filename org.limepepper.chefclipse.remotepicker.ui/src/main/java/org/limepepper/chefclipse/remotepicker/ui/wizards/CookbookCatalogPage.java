package org.limepepper.chefclipse.remotepicker.ui.wizards;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.equinox.internal.p2.discovery.Catalog;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogCategory;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogItem;
import org.eclipse.equinox.internal.p2.ui.discovery.util.ControlListItem;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.CatalogPage;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.CatalogViewer;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.CategoryItem;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.DiscoveryItem;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;

/**
 * @author Sebastian Sampaoli
 */
public class CookbookCatalogPage extends CatalogPage {

	private final CookbookCatalogConfiguration configuration;

	private CatalogDescriptor previousCatalogDescriptor;

	private boolean updated;

	protected boolean disableTabSelection;

	protected CatalogDescriptor lastSelection;

	public CookbookCatalogPage(Catalog catalog, CookbookCatalogConfiguration configuration) {
		super(catalog);
		this.configuration = configuration;
		updateTitle();
	}

	private void updateTitle() {
		if (configuration.getCatalogDescriptor() != null) {
			setTitle(configuration.getCatalogDescriptor().getLabel());
		}
	}

	@Override
	public void createControl(final Composite originalParent) {
		
		Composite parent = new Composite(originalParent, SWT.NULL);	
		
		boolean needSwitchMarketplaceControl = configuration.getCatalogDescriptors().size() > 1;

		GridLayoutFactory.fillDefaults().numColumns(1).spacing(0, 5).applyTo(parent);
		
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(parent);
		
		super.createControl(parent);

		if (needSwitchMarketplaceControl) {
			createRepositorySwitcher(parent);
		}
		setControl(parent);
	}

	private void createRepositorySwitcher(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout());

		final CatalogSwitcher switcher = new CatalogSwitcher(composite, SWT.BORDER, configuration);
		switcher.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				CatalogDescriptor descriptor = (CatalogDescriptor) ((IStructuredSelection) event.getSelection()).getFirstElement();
				lastSelection = descriptor;
				configuration.setCatalogDescriptor(descriptor);
				getWizard().initializeCatalog();
				getViewer().updateCatalog();
				updateTitle();
			}
		});
		CatalogDescriptor selectedDescriptor = configuration.getCatalogDescriptor();
		if (selectedDescriptor != null) {
			switcher.setSelection(new StructuredSelection(selectedDescriptor));
		}
		GridDataFactory.fillDefaults()
		.align(SWT.FILL, SWT.FILL)
		.grab(true, true)
		.minSize(1, switcher.getPreferredHeight())
		.hint(500, switcher.getPreferredHeight())
		.applyTo(composite);
	}

	@Override
	public IWizardPage getPreviousPage() {
		return super.getPreviousPage();
	}

	@Override
	public CookbookDiscoveryWizard getWizard() {
		return (CookbookDiscoveryWizard) super.getWizard();
	}

	protected CatalogViewer doCreateViewer(Composite parent) {
		CatalogViewer viewer = new CatalogViewer(getCatalog(), this, getContainer(), getWizard().getConfiguration()) {
			CookbookDiscoveryResources resources = new CookbookDiscoveryResources(getShell().getDisplay(), (CookbookCatalogConfiguration)getConfiguration());

			@Override
			protected Set<String> getInstalledFeatures(IProgressMonitor monitor) {
				return Collections.emptySet();
			}
			@Override
			protected ControlListItem<?> doCreateViewerItem(Composite parent, Object element) {
				if (element instanceof CatalogItem) {
					resources.setCurrentCatalogItem((CatalogItem) element);
					return new DiscoveryItem(parent, SWT.NONE, resources, shellProvider, (CatalogItem) element, this);
				} else if (element instanceof CatalogCategory) {
					resources.setCurrentCatalogItem((CatalogCategory) element);
					return new CategoryItem(parent, SWT.NONE, resources, (CatalogCategory) element);
				}
				return null;
			}
		};
		viewer.setMinimumHeight(MINIMUM_HEIGHT);
		viewer.createControl(parent);
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(viewer.getControl());
		return viewer;
	}

	@Override
	protected void doUpdateCatalog() {
		if (!updated) {
			updated = true;
			Display.getCurrent().asyncExec(new Runnable() {
				public void run() {
					if (!getControl().isDisposed() && isCurrentPage()) {
						getViewer().updateCatalog();
					}
				}
			});
		}
	}

	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			CatalogDescriptor catalogDescriptor = configuration.getCatalogDescriptor();
			if (catalogDescriptor != null) {
				setTitle(catalogDescriptor.getLabel());
			}
			if (previousCatalogDescriptor == null || !previousCatalogDescriptor.equals(catalogDescriptor)) {
				previousCatalogDescriptor = catalogDescriptor;
				getWizard().initializeCatalog();
				updated = false;
			}
		}
		super.setVisible(visible);
	}
	
	public List<CatalogItem> getInstallableCookbooks() {
		return getViewer().getCheckedItems();
	}

	@Override
	public void performHelp() {
		getControl().notifyListeners(SWT.Help, new Event());
	}
}
