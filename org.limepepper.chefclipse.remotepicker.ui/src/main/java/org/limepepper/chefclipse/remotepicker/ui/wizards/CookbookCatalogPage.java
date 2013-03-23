package org.limepepper.chefclipse.remotepicker.ui.wizards;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.equinox.internal.p2.discovery.Catalog;
import org.eclipse.equinox.internal.p2.discovery.model.AbstractCatalogItem;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogCategory;
import org.eclipse.equinox.internal.p2.discovery.model.CatalogItem;
import org.eclipse.equinox.internal.p2.discovery.util.CatalogCategoryComparator;
import org.eclipse.equinox.internal.p2.discovery.util.CatalogItemComparator;
import org.eclipse.equinox.internal.p2.ui.discovery.util.ControlListItem;
import org.eclipse.equinox.internal.p2.ui.discovery.util.ControlListViewer;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.CatalogConfiguration;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.CatalogPage;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.CatalogViewer;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.CategoryItem;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.swt.widgets.Widget;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;

/**
 * @author Sebastian Sampaoli
 */
@SuppressWarnings("restriction")
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
				getViewer().setSelection(new StructuredSelection());
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
		CatalogViewer viewer = new CookbookCatalogViewer(getCatalog(), this, getContainer(), getWizard().getConfiguration());
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

	public final class CookbookCatalogViewer extends CatalogViewer {
		
		@Override
		public void modifySelection(final CatalogItem connector, boolean selected) {
		    super.modifySelection(connector, selected);
		}

		private final class CoookbookControlListViewer extends ControlListViewer {

			private int pageSize = 100;

			private int pagesLoaded = 0;
			
			private CoookbookControlListViewer(Composite parent, int style) {
				super(parent, style);
				final ScrollBar vBar = getControl().getVerticalBar();
				vBar.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event e) {
						int hSelection = vBar.getSelection(); // Get the current position of the ScrollBar
						ScrolledComposite scrolled = getControl();
						Composite control = (Composite) getControl().getContent();
						Rectangle clientArea = scrolled.getClientArea();
						if (control.getChildren().length > 0) {
							Control last = control.getChildren()[control.getChildren().length - 1];
							while (hSelection + clientArea.height >= last.getLocation().y) {
								if (!loadMoreItems())
									break;
								last = control.getChildren()[control.getChildren().length - 1];
							}
							vBar.setSelection(hSelection);
						}
					}
				});
			}

			@Override
			protected ControlListItem<? extends AbstractCatalogItem> doCreateItem(Composite parent, Object element) {
				return doCreateViewerItem(parent, element);
			}
			
			@Override
			protected void inputChanged(Object input, Object oldInput) {
				refreshAll();
				doUpdateContent();
			}

			@SuppressWarnings("unchecked")
            @Override
			protected void internalRefresh(Object element) {
				if (element == null) {
					return;
				}

				if (element.equals(getRoot())) {
					refreshAll();
					return;
				}
				Widget widget = findItem(element);
				if (widget == null) {
					add(new Object[] {element});
					return;
				}
				if (widget instanceof CookbookDiscoveryItem)
					((CookbookDiscoveryItem<CatalogItem>) widget).refresh();

				updateSize(getControl());
			}

			private void updateSize(Control control) {
				if (control == null) {
					return;
				}
				ScrolledComposite scrolled = getControl();
				Composite contr = (Composite) scrolled.getContent();
				Point size = control.computeSize(scrolled.getClientArea().width - 20, SWT.DEFAULT, true);
				control.setSize(size);

				if (contr.getChildren().length != 0) {
					int itemHeight = contr.getChildren()[1].getSize().y;
					int items = getSortedChildren(getRoot()).length;

					size.y = (items * itemHeight) + 40;
				}
				scrolled.setMinSize(size);
			}

			protected void doUpdateContent() {
				ScrolledComposite scrolled = getControl();
				Composite control = (Composite) scrolled.getContent();
				
				if (control.getChildren().length > 0) {
					updateSize(control);
					scrolled.setContent(control);
				}
			}
			
			/**
			 * Refresh everything as the root is being refreshed.
			 */
			private void refreshAll() {
				ScrolledComposite scrolled = getControl();
				Composite control = (Composite) scrolled.getContent();
				
				Control[] existingChildren = control.getChildren();

				for (Control element : existingChildren) {
					element.dispose();
				}
				pagesLoaded = 0;
				loadMoreItems();
				doUpdateContent();
			}
			
			private boolean loadMoreItems() {
				final Object[] infos = getSortedChildren(getRoot());

				int start = pagesLoaded * pageSize;

				if (start >= infos.length)
					return false;

				for (int i = start; i < Math.min(start + pageSize, infos.length)/* infos.length*/; i++) {
					ControlListItem<? extends AbstractCatalogItem> item = createNewItem(infos[i]);
					item.updateColors(i);
				}
				pagesLoaded += 1;
				((Composite) getControl().getContent()).layout(true);
				return true;
			}
			
			/**
			 * Create a new item for info.
			 * 
			 * @param element
			 * @return ControlListItem
			 */
			@SuppressWarnings("unchecked")
            private ControlListItem<? extends AbstractCatalogItem> createNewItem(Object element) {
				Composite control = (Composite) getControl().getContent();
				final ControlListItem<? extends AbstractCatalogItem> item = doCreateItem(control, element);
//				item.setIndexListener(new ControlListItem.IndexListener() {
//					public void selectNext() {
//						Control[] children = control.getChildren();
//						for (int i = 0; i < children.length; i++) {
//							if (item == children[i]) {
//								if (i < children.length - 1) {
//									setSelection(new StructuredSelection(children[i + 1].getData()));
//								}
//								break;
//							}
//						}
//					}
//
//					public void selectPrevious() {
//						Control[] children = control.getChildren();
//						for (int i = 0; i < children.length; i++) {
//							if (item == children[i]) {
//								if (i > 0) {
//									setSelection(new StructuredSelection(children[i - 1].getData()));
//								}
//								break;
//							}
//						}
//					}
//
//					public void select() {
//						setSelection(new StructuredSelection(item.getData()));
//						setFocus();
//					}
//
//					public void open() {
//						handleOpen();
//					}
//				});
				GridDataFactory.fillDefaults().grab(true, false).applyTo(item);
//				// Refresh to populate with the current tasks
				if (item instanceof CookbookDiscoveryItem)
					((CookbookDiscoveryItem<CatalogItem>) item).refresh();
				return item;
			}
		}

		CookbookDiscoveryResources resources = new CookbookDiscoveryResources(getShell().getDisplay(), (CookbookCatalogConfiguration)getConfiguration());
	
		private CookbookCatalogViewer(Catalog catalog,
				IShellProvider shellProvider, IRunnableContext context,
				CatalogConfiguration configuration) {
			super(catalog, shellProvider, context, configuration);
		}

		@Override
		protected Set<String> getInstalledFeatures(IProgressMonitor monitor) {
			return Collections.emptySet();
		}

		@Override
		protected ControlListItem<? extends AbstractCatalogItem> doCreateViewerItem(Composite parent, Object element) {
			if (element instanceof CatalogItem) {
				resources.setCurrentCatalogItem((CatalogItem) element);
				return new CookbookDiscoveryItem<CatalogItem>(parent, SWT.NONE, resources, shellProvider,
						(CatalogItem) element, this);
			} else if (element instanceof CatalogCategory) {
				resources.setCurrentCatalogItem((CatalogCategory) element);
				return new CategoryItem<CatalogCategory>(parent, SWT.NONE, resources, (CatalogCategory) element);
			}
			return null;
		}
	
		@Override
		protected StructuredViewer doCreateViewer(Composite container) {
			StructuredViewer viewer = new CoookbookControlListViewer(container, SWT.BORDER);
			viewer.setUseHashlookup(true);
			CatalogContentProvider contentProvider = doCreateContentProvider();
			contentProvider.setHasCategories(isShowCategories());
			viewer.setContentProvider(contentProvider);
			viewer.setSorter(new ViewerSorter() {
				CatalogCategoryComparator categoryComparator = new CatalogCategoryComparator();

				CatalogItemComparator itemComparator = new CatalogItemComparator();

				@Override
				public int compare(Viewer viewer, Object o1, Object o2) {
					CatalogCategory cat1 = getCategory(o1);
					CatalogCategory cat2 = getCategory(o2);

					if (cat1 == null) {
						return (cat2 != null) ? 1 : 0;
					} else if (cat2 == null) {
						return 1;
					}

					int i = categoryComparator.compare(cat1, cat2);
					if (i == 0) {
						if (o1 instanceof CatalogCategory) {
							return -1;
						}
						if (o2 instanceof CatalogCategory) {
							return 1;
						}
						if (cat1 == cat2 && o1 instanceof CatalogItem && o2 instanceof CatalogItem) {
							return itemComparator.compare((CatalogItem) o1, (CatalogItem) o2);
						}
						return super.compare(viewer, o1, o2);
					}
					return i;
				}

				private CatalogCategory getCategory(Object o) {
					if (o instanceof CatalogCategory) {
						return (CatalogCategory) o;
					}
					if (o instanceof CatalogItem) {
						return ((CatalogItem) o).getCategory();
					}
					return null;
				}
			});

//			resources = new DiscoveryResources(container.getDisplay());
			viewer.getControl().addDisposeListener(new DisposeListener() {
				public void widgetDisposed(DisposeEvent e) {
					resources.dispose();
					if (getCatalog() != null)
						getCatalog().dispose();
				}
			});
//			viewer.addFilter(new Filter());
			return viewer;
		}
	}
}
