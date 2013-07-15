package org.limepepper.chefclipse.remotepicker.ui.wizards;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.ui.Activator;
import org.limepepper.chefclipse.remotepicker.ui.CatalogDescriptor;
import org.limepepper.chefclipse.remotepicker.ui.CatalogRegistry;
import org.limepepper.chefclipse.remotepicker.ui.handlers.RemotePickerHandler;

/**
 * @author Sebastian Sampaoli
 */
public class CatalogSwitcher extends Composite implements ISelectionProvider {

	private static final int ITEM_MARGIN = 5;

	private static final int MIN_SCROLL_HEIGHT = 32 + (2 * ITEM_MARGIN);
	
	private static final String RETRIEVE_METADATA = "Retrieving catalog meta information";
	
	private static final String DOWNLOAD_CATALOG_IMAGE = "Downloading catalog images for";

	private final CookbookCatalogConfiguration configuration;

	private final ImageRegistry imageRegistry = new ImageRegistry();

	private final List<ISelectionChangedListener> listeners = new LinkedList<ISelectionChangedListener>();

	private CatalogDescriptor selection;

	private Composite repositoriesArea;

	public CatalogSwitcher(Composite parent, int style, CookbookCatalogConfiguration configuration) {
		super(parent, style);
		this.configuration = configuration;
		setLayout(new FillLayout());
		createContents(this);
	}

	private void createContents(final Composite parent) {
		final ScrolledComposite scrollArea = new ScrolledComposite(parent, SWT.V_SCROLL);
		scrollArea.setLayout(new FillLayout());

		repositoriesArea = new Composite(scrollArea, SWT.NONE);

		RowLayout layout = new RowLayout(SWT.HORIZONTAL);
		repositoriesArea.setLayout(layout);

		Color listBackground = getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND);
		setBackground(listBackground);
		repositoriesArea.setBackground(listBackground);
		scrollArea.setBackground(listBackground);

		List<CatalogDescriptor> catalogDescriptors = configuration.getCatalogDescriptors();
		CatalogDescriptor compositeAndLastRepo = null;
		for (CatalogDescriptor catalogDescriptor : catalogDescriptors) {
			if (!catalogDescriptor.getId().equals(CookbookRepositoryManager.COMPOSITE_REPOSITORY_ID)){
				createCookbookRepositories(repositoriesArea, catalogDescriptor);
			} else {
				compositeAndLastRepo = catalogDescriptor;
			}
		}
		if (compositeAndLastRepo != null){
			createCookbookRepositories(repositoriesArea, compositeAndLastRepo);
		}

		scrollArea.setContent(repositoriesArea);
		scrollArea.setExpandVertical(true);
		scrollArea.setExpandHorizontal(true);
		scrollArea.setMinHeight(MIN_SCROLL_HEIGHT);
		scrollArea.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(ControlEvent e) {
				Rectangle r = parent.getClientArea();
				int scrollBarWidth = scrollArea.getVerticalBar().getSize().x;
				scrollArea.setMinSize(repositoriesArea.computeSize(r.width - scrollBarWidth, SWT.DEFAULT));
			}
		});
	}

	private void createCookbookRepositories(final Composite composite, final CatalogDescriptor catalogDescriptor) {
		if ( !Activator.getDefault().getPreferenceStore().getBoolean(catalogDescriptor.getId()) )
			return;
		
		Composite container = new Composite(composite, SWT.NONE);
		Color listBackground = getDisplay().getSystemColor(SWT.COLOR_LIST_BACKGROUND);
		container.setBackground(listBackground);
		container.setData(catalogDescriptor);
		GridLayout layout = new GridLayout(1, false);
		layout.marginHeight = ITEM_MARGIN;
		layout.marginWidth = ITEM_MARGIN;
		container.setLayout(layout);

		final Label label = new Label(container, SWT.NONE);
		label.setBackground(listBackground);
		retrieveCatalogImage(catalogDescriptor, label);
		label.setImage(getDefaultCatalogImage());
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if (catalogDescriptor.isTemplate()) {
					configureRepo(composite, catalogDescriptor);
				} else {
					selection = catalogDescriptor;
					refreshSelection();
					fireSelectionChanged();
				}
			}
		});
		CatalogToolTip.attachCatalogToolTip(label, catalogDescriptor);
	}

	private void retrieveCatalogImage(final CatalogDescriptor catalogDescriptor, final Label label) {
		Job job = new Job(RETRIEVE_METADATA) {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask(
						NLS.bind(DOWNLOAD_CATALOG_IMAGE, catalogDescriptor.getLabel()), 1);
				final Image image = getCatalogIcon(catalogDescriptor);
				monitor.worked(1);
				label.getDisplay().asyncExec(new Runnable() {

					public void run() {
						label.setImage(image);
					}
				});
				monitor.done();
				return Status.OK_STATUS;
			}
		};
		job.setSystem(true);
		job.setPriority(Job.DECORATE);
		job.schedule();
	}

	private void fireSelectionChanged() {
		for (ISelectionChangedListener listener : listeners) {
			SelectionChangedEvent event = new SelectionChangedEvent(this, new StructuredSelection(selection));
			listener.selectionChanged(event);
		}
	}

	private Image getCatalogIcon(final CatalogDescriptor catalogDescriptor) {
		String key = catalogDescriptor.getUrl().toExternalForm();
		Image image = imageRegistry.get(key);
		if (image == null) {
			ImageDescriptor catalogIcon = catalogDescriptor.getIcon();
			if (catalogIcon == null) {
				image = getDefaultCatalogImage();
			} else {
				imageRegistry.put(key, catalogIcon);
				image = imageRegistry.get(key);
			}
			if (catalogDescriptor.isTemplate()) {
				ImageDescriptor overlay = Activator.getDefault().getImageRegistry().getDescriptor(Activator.TEMPLATE_REPO_OVERLAY);
				DecorationOverlayIcon imageOverlayed = new DecorationOverlayIcon(image, overlay, IDecoration.BOTTOM_LEFT);
				image = imageOverlayed.createImage();
			}
		}
		return image;
	}

	private Image getDefaultCatalogImage() {
		Activator.getDefault();
		return Activator.getDefault().getImageRegistry()
				.get(Activator.NO_ICON_PROVIDED_CATALOG);
	}

	@Override
	public void dispose() {
		imageRegistry.dispose();
		super.dispose();
	}

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}

	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.remove(listener);
	}

	public ISelection getSelection() {
		return new StructuredSelection(selection);
	}

	public void setSelection(ISelection newSelection) {
		if (newSelection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) newSelection;
			this.selection = (CatalogDescriptor) structuredSelection.getFirstElement();
			refreshSelection();
		}
	}

	private void refreshSelection() {
		Control[] children = repositoriesArea.getChildren();
		for (Control control : children) {
			int color;
			if (this.selection == control.getData()) {
				color = SWT.COLOR_LIST_SELECTION;
			} else {
				color = SWT.COLOR_WHITE;
			}
			control.setBackground(getDisplay().getSystemColor(color));
			((Composite) control).getChildren()[0].setBackground(getDisplay().getSystemColor(color));
		}
	}

	public int getPreferredHeight() {
		return MIN_SCROLL_HEIGHT + (2 * getBorderWidth()) + 6;
	}

	/**
	 * @param composite
	 * @param catalogDescriptor
	 */
	protected void configureRepo(final Composite composite, final CatalogDescriptor catalogDescriptor) {
		CookbookRepositoryManager man = CookbookRepositoryManager.getInstance();
		try {
			RemoteRepository newRepo = man.configureRepositoryTemplate(man.getTemplateRepository(catalogDescriptor.getId()));
			if (newRepo != null) {
				RemotePickerHandler.startRepositoryJob(newRepo, man);
				CatalogDescriptor newDescriptor = CatalogRegistry.createCatalogDescriptor(newRepo);
				createCookbookRepositories(composite, newDescriptor);
				composite.layout();
				selection = newDescriptor;
				refreshSelection();
				fireSelectionChanged();
			}
		} catch (Exception e) {
			MessageDialog.openError(getShell(), "Could not create repository", "There was an issue creating the repository. Check the error log.");
		}
	}
}
