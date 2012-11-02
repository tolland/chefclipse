package org.limepepper.chefclipse.remotepicker.ui.wizards;

import org.eclipse.equinox.internal.p2.discovery.Catalog;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.CatalogPage;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.CatalogViewer;
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
import org.eclipse.swt.widgets.Link;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;

/**
 * @author Sebastian Sampaoli
 */
public class CookbookCatalogPage extends CatalogPage {

	private final CookbookCatalogConfiguration configuration;

	private CatalogDescriptor previousCatalogDescriptor;

	private boolean updated;

	private Link selectionLink;

//	private TabFolder tabFolder;
//
//	private TabItem searchTabItem;
//
//	private TabItem recentTabItem;
//
//	private TabItem popularTabItem;

//	private Control tabContent;
//
//	private TabItem installedTabItem;

	protected boolean disableTabSelection;

	protected CatalogDescriptor lastSelection;

	private Composite composite;

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
	
//	public void createControl(Composite parent) {
//		viewer = doCreateViewer(parent);
//		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
//			public void selectionChanged(SelectionChangedEvent event) {
//				setPageComplete(!viewer.getCheckedItems().isEmpty());
//			}
//		});
//		boolean needSwitchMarketplaceControl = configuration.getCatalogDescriptors().size() > 1;
//		setControl(viewer.getControl());
//	}

	@Override
	public void createControl(final Composite originalParent) {
		
		Composite parent = new Composite(originalParent, SWT.NULL);	
		
		boolean needSwitchMarketplaceControl = configuration.getCatalogDescriptors().size() > 1;

		//parent = new Composite(parent, SWT.NULL);
		GridLayoutFactory.fillDefaults().numColumns(1).spacing(0, 5).applyTo(parent);
		
		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(parent);
		
		super.createControl(parent);
//		composite = new Composite(parent, SWT.NULL);

//		tabFolder = new TabFolder(parent, SWT.TOP);
//		if (originalParent != parent) {
//			GridDataFactory.fillDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(tabFolder);
//		}
//		composite.setLayout(new org.eclipse.swt.layout.GridLayout(1, false));
//		GridLayoutFactory.fillDefaults().numColumns(1).spacing(0, 5).applyTo(composite);
		
//		super.createControl(composite);

//		tabContent = getControl();
//		createSearchTab();
//		createRecentTab();
//		createPopularTab();
//		createInstalltedTab();
//
//		tabFolder.addSelectionListener(new SelectionListener() {
//			public void widgetSelected(SelectionEvent e) {
//				if (disableTabSelection) {
//					return;
//				}
//				MarketplaceViewer.ContentType contentType;
//				if (e.item == searchTabItem) {
//					contentType = ContentType.SEARCH;
//				} else if (e.item == recentTabItem) {
//					contentType = ContentType.RECENT;
//				} else if (e.item == popularTabItem) {
//					contentType = ContentType.POPULAR;
//				} else if (e.item == installedTabItem) {
//					contentType = ContentType.INSTALLED;
//				} else {
//					throw new IllegalStateException();
//				}
//				getViewer().setContentType(contentType);
//			}
//
//			public void widgetDefaultSelected(SelectionEvent e) {
//				widgetSelected(e);
//			}
//		});

//		{
//			selectionLink = new Link(parent, SWT.NULL);
//			selectionLink.setToolTipText(Messages.MarketplacePage_showSelection);
//			selectionLink.addSelectionListener(new SelectionListener() {
//				public void widgetSelected(SelectionEvent e) {
//					selectionLinkActivated();
//				}
//
//				public void widgetDefaultSelected(SelectionEvent e) {
//					widgetSelected(e);
//
//				}
//			});
//			GridDataFactory.swtDefaults().align(SWT.CENTER, SWT.CENTER).applyTo(selectionLink);
//			computeSelectionLinkText();
//		}

//		if (needSwitchMarketplaceControl) {
			createRepositorySwitcher(parent);
//		}
//		updateBranding();

		// bug 312411: a selection listener so that we can streamline install of single product
//		getViewer().addSelectionChangedListener(new ISelectionChangedListener() {
//
//			private int previousSelectionSize = 0;
//
//			public void selectionChanged(SelectionChangedEvent event) {
//				if (!isCurrentPage()) {
//					return;
//				}
//				SelectionModel selectionModel = getWizard().getSelectionModel();
//				int newSelectionSize = selectionModel.getItemToOperation().size();
//
//				// important: we don't do anything if the selection is empty, since CatalogViewer
//				// sets the empty selection whenever the catalog is updated.
//				if (!event.getSelection().isEmpty()) {
//
//					if (previousSelectionSize == 0 && newSelectionSize == 1
//							&& selectionModel.computeProvisioningOperationViable()) {
//						IWizardPage currentPage = getContainer().getCurrentPage();
//						if (currentPage.isPageComplete()) {
//							IWizardPage nextPage = getWizard().getNextPage(CookbookCatalogPage.this);
//							if (nextPage != null) {
//								getContainer().showPage(nextPage);
//							}
//						}
//					}
//				}
//				previousSelectionSize = newSelectionSize;
//			}
//		});
//		getViewer().addPropertyChangeListener(new IPropertyChangeListener() {
//
//			public void propertyChange(PropertyChangeEvent event) {
//				if (event.getProperty().equals(MarketplaceViewer.CONTENT_TYPE_PROPERTY)) {
//					if (event.getNewValue() == ContentType.SEARCH) {
//						tabFolder.setSelection(searchTabItem);
//					}
//				}
//			}
//		});
//		setControl(parent == originalParent ? tabFolder : parent);
		setControl(parent);
//		MarketplaceClientUi.setDefaultHelp(tabContent);
	}

//	private void createInstalltedTab() {
//		installedTabItem = new TabItem(tabFolder, SWT.NULL);
//		installedTabItem.setText(Messages.MarketplacePage_installed);
//		installedTabItem.setControl(tabContent);
//	}
//
//	private void createPopularTab() {
//		popularTabItem = new TabItem(tabFolder, SWT.NULL);
//		popularTabItem.setText(Messages.MarketplacePage_popular);
//		popularTabItem.setControl(tabContent);
//	}
//
//	private void createRecentTab() {
//		recentTabItem = new TabItem(tabFolder, SWT.NULL);
//		recentTabItem.setText(Messages.MarketplacePage_recent);
//		recentTabItem.setControl(tabContent);
//	}
//
//	private void createSearchTab() {
//		searchTabItem = new TabItem(tabFolder, SWT.NULL);
//		searchTabItem.setText(Messages.MarketplacePage_search);
//		searchTabItem.setControl(tabContent);
//	}

	private void createRepositorySwitcher(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout());

		final CatalogSwitcher switcher = new CatalogSwitcher(composite, SWT.BORDER, configuration);
		switcher.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				CatalogDescriptor descriptor = (CatalogDescriptor) ((IStructuredSelection) event.getSelection()).getFirstElement();
//				if (getWizard().getSelectionModel().getSelectedCatalogItems().size() > 0) {
//					boolean discardSelection = MessageDialog.openConfirm(getShell(),
//							Messages.MarketplacePage_selectionSolutions,
//							Messages.MarketplacePage_discardPendingSolutions);
//					if (discardSelection) {
//						getWizard().getSelectionModel().clear();
//						computeSelectionLinkText();
//					} else {
//						switcher.setSelection(new StructuredSelection(lastSelection));
//						return;
//					}
//				}
				lastSelection = descriptor;
				configuration.setCatalogDescriptor(descriptor);
				getWizard().initializeCatalog();
				getViewer().updateCatalog();
//				updateBranding();
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

//	private void computeSelectionLinkText() {
//		if (selectionLink != null) {
//			final String originalText = selectionLink.getText();
//
//			String text = " "; //$NON-NLS-1$
//			int count = getWizard().getSelectionModel().getItemToOperation().size();
//			if (count == 1) {
//				text = Messages.MarketplacePage_linkShowSelection_One;
//			} else if (count > 0) {
//				text = NLS.bind(Messages.MarketplacePage_linkShowSelection_Multiple, Integer.valueOf(count));
//			}
//			if (!(text == originalText || (text != null && text.equals(originalText)))) {
//				boolean exclude = text == null || text.trim().length() == 0;
//				boolean originalExclude = ((GridData) selectionLink.getLayoutData()).exclude;
//
//				selectionLink.setText(text);
//				if (originalExclude != exclude) {
//					selectionLink.setVisible(!exclude);
//					((GridData) selectionLink.getLayoutData()).exclude = exclude;
//					((Composite) getControl()).layout(true, true);
//				}
//			}
//		}
//	}

//	protected void selectionLinkActivated() {
//		tabFolder.setSelection(searchTabItem);
//		getViewer().showSelected();
//	}

	@Override
	public IWizardPage getPreviousPage() {
		return super.getPreviousPage();
	}

	@Override
	public CookbookDiscoveryWizard getWizard() {
		return (CookbookDiscoveryWizard) super.getWizard();
	}

//	@Override
//	protected MarketplaceViewer getViewer() {
//		return (MarketplaceViewer) super.getViewer();
//	}

//	@Override
//	protected CatalogViewer doCreateViewer(Composite parent) {
//		Viewer viewer = new CatalogViewer(getCatalog(), this, getWizard());
//		viewer.setMinimumHeight(MINIMUM_HEIGHT);
//		viewer.createControl(parent);
//		return viewer;
//	}
	
	protected CatalogViewer doCreateViewer(Composite parent) {
		CatalogViewer viewer = new CatalogViewer(getCatalog(), this, getContainer(), getWizard().getConfiguration());
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
//				tabFolder.setSelection(searchTabItem);
//				getViewer().setContentType(ContentType.SEARCH);
				getWizard().initializeCatalog();
				updated = false;
			}
		}
		super.setVisible(visible);
	}

//	@Override
//	public void setPageComplete(boolean complete) {
//		if (complete) {
//			complete = getWizard().getSelectionModel().computeProvisioningOperationViable();
//		}
//		computeMessages();
//		super.setPageComplete(complete);
//	}
//
//	private void computeMessages() {
//		computeStatusMessage();
//		computeSelectionLinkText();
//	}
//
//	private void computeStatusMessage() {
//		String message = null;
//		int messageType = IMessageProvider.NONE;
//
//		if (getWizard() != null) {
//			IStatus viability = getWizard().getSelectionModel().computeProvisioningOperationViability();
//			if (viability != null) {
//				message = viability.getMessage();
//				messageType = Util.computeMessageType(viability);
//			}
//		}
//
//		setMessage(message, messageType);
//	}

	@Override
	public void performHelp() {
		getControl().notifyListeners(SWT.Help, new Event());
	}

//	private void updateBranding() {
//		disableTabSelection = true;
//		updateTitle();
//		CatalogDescriptor descriptor = configuration.getCatalogDescriptor();
//		CatalogBranding branding = CatalogRegistry.getInstance().getCatalogBranding(descriptor);
//		if (branding == null) {
//			branding = getDefaultBranding();
//		}
//
//		searchTabItem.dispose();
//		recentTabItem.dispose();
//		popularTabItem.dispose();
//		installedTabItem.dispose();
//
//		boolean hasSearchTab = branding.hasSearchTab();
//		if (hasSearchTab) {
//			createSearchTab();
//			searchTabItem.setText(branding.getSearchTabName());
//		}
//		boolean hasRecentTab = branding.hasRecentTab();
//		if (hasRecentTab) {
//			createRecentTab();
//			recentTabItem.setText(branding.getRecentTabName());
//		}
//
//		boolean hasPopularTab = branding.hasPopularTab();
//		if (hasPopularTab) {
//			createPopularTab();
//			popularTabItem.setText(branding.getPopularTabName());
//		}
//
//		createInstalltedTab();
//
//		tabFolder.setSelection(0);
//
//		try {
//			ImageDescriptor wizardIconDescriptor;
//			if (branding.getWizardIcon() == null) {
//				wizardIconDescriptor = DiscoveryImages.BANNER_DISOVERY;
//			} else {
//				wizardIconDescriptor = ImageDescriptor.createFromURL(new URL(branding.getWizardIcon()));
//			}
//			setImageDescriptor(wizardIconDescriptor);
//		} catch (MalformedURLException e) {
//			MarketplaceClientUi.error(e);
//		}
//		disableTabSelection = false;
//	}
//
//	private CatalogBranding getDefaultBranding() {
//		CatalogBranding branding = new CatalogBranding();
//		branding.setHasSearchTab(true);
//		branding.setHasPopularTab(true);
//		branding.setHasRecentTab(true);
//		branding.setSearchTabName(Messages.MarketplacePage_search);
//		branding.setPopularTabName(Messages.MarketplacePage_popular);
//		branding.setRecentTabName(Messages.MarketplacePage_recent);
//		branding.setWizardTitle(Messages.MarketplacePage_eclipseMarketplaceSolutions);
//		return branding;
//	}
}
