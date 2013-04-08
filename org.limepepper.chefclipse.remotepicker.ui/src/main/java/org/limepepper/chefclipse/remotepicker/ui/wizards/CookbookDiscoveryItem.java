package org.limepepper.chefclipse.remotepicker.ui.wizards;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.equinox.internal.p2.discovery.model.CatalogItem;
import org.eclipse.equinox.internal.p2.discovery.model.Overview;
import org.eclipse.equinox.internal.p2.ui.discovery.util.WorkbenchUtil;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.AbstractDiscoveryItem;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.CatalogViewer;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.DiscoveryResources;
import org.eclipse.equinox.internal.p2.ui.discovery.wizards.Messages;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.ui.wizards.CookbookCatalogPage.CookbookCatalogViewer;

/**
 * @author Sebastian Sampaoli
 */
@SuppressWarnings("restriction")
public class CookbookDiscoveryItem<T extends CatalogItem> extends AbstractDiscoveryItem<T> implements PropertyChangeListener {

	Button checkbox;

	private Composite checkboxContainer;

	private final CatalogItem item;

	private Label description;

	private Label iconLabel;

	private ToolItem infoButton;

	private Label nameLabel;

	private Link providerLabel;

	private final IShellProvider shellProvider;

	private final CookbookCatalogViewer viewer;

    private Label versionLabel;

	public CookbookDiscoveryItem(Composite parent, int style, DiscoveryResources resources, IShellProvider shellProvider, final T item, CatalogViewer viewer) {
		super(parent, style, resources, item);
		this.shellProvider = shellProvider;
		this.item = item;
		this.viewer = (CookbookCatalogViewer) viewer;
		item.addPropertyChangeListener(this);
		this.addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				item.removePropertyChangeListener(CookbookDiscoveryItem.this);
			}
		});
		createContent();
		initializeListeners();
	}

	private void createContent() {
		GridLayout layout = new GridLayout(4, false);
		layout.marginLeft = 7;
		layout.marginTop = 2;
		layout.marginBottom = 2;
		setLayout(layout);

		checkboxContainer = new Composite(this, SWT.INHERIT_NONE);
		GridDataFactory.swtDefaults().align(SWT.CENTER, SWT.BEGINNING).span(1, 2).applyTo(checkboxContainer);
		GridLayoutFactory.fillDefaults().spacing(1, 1).numColumns(2).applyTo(checkboxContainer);

		checkbox = new Button(checkboxContainer, SWT.CHECK | SWT.INHERIT_FORCE);
		checkbox.setSelection(item.isSelected());
		checkbox.setText(" "); //$NON-NLS-1$
		// help UI tests
		checkbox.setData("connectorId", item.getId()); //$NON-NLS-1$
		GridDataFactory.swtDefaults().align(SWT.CENTER, SWT.CENTER).applyTo(checkbox);

		iconLabel = new Label(checkboxContainer, SWT.NONE);
		GridDataFactory.swtDefaults().align(SWT.CENTER, SWT.CENTER).applyTo(iconLabel);
		if (item.getIcon() != null) {
			iconLabel.setImage(resources.getIconImage(item.getSource(), item.getIcon(), 32, false));
		}

		nameLabel = new Label(this, SWT.NONE);
		GridDataFactory.fillDefaults().grab(false, false).align(SWT.BEGINNING, SWT.CENTER).applyTo(nameLabel);
		nameLabel.setFont(resources.getSmallHeaderFont());
		if (item.isInstalled()) {
			nameLabel.setText(NLS.bind(Messages.DiscoveryItem_Extension_installed, item.getName()));
		} else {
			nameLabel.setText(item.getName());
		}
		
		versionLabel = new Label(this, SWT.NONE);
        GridDataFactory.fillDefaults().grab(true, false).align(SWT.BEGINNING, SWT.CENTER).applyTo(versionLabel);
        versionLabel.setForeground(resources.getColorDisabled());
//        versionLabel.setFont(resources.getSmallHeaderFont());
        versionLabel.setText(createVersion(item));

		if (hasTooltip()) {
			ToolBar toolBar = new ToolBar(this, SWT.FLAT);
			GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).applyTo(toolBar);

			infoButton = new ToolItem(toolBar, SWT.PUSH);
			infoButton.setImage(resources.getInfoImage());
			infoButton.setToolTipText(Messages.ConnectorDiscoveryWizardMainPage_tooltip_showOverview);
			hookTooltip(toolBar, infoButton, this, nameLabel, item.getSource(), item.getOverview(), null);
		} else {
			Label label = new Label(this, SWT.NULL);
			label.setText(" "); //$NON-NLS-1$
		}

		description = new Label(this, SWT.NULL | SWT.WRAP);
		GridDataFactory.fillDefaults().grab(true, false).span(4, 1).hint(100, SWT.DEFAULT).applyTo(description);
		String descriptionText = item.getDescription();
		int maxDescriptionLength = 162;
		if (descriptionText == null) {
			descriptionText = ""; //$NON-NLS-1$
		}
		if (descriptionText.length() > maxDescriptionLength) {
			descriptionText = descriptionText.substring(0, maxDescriptionLength);
		}
		description.setText(descriptionText.replaceAll("(\\r\\n)|\\n|\\r", " ")); //$NON-NLS-1$ //$NON-NLS-2$

		createProviderLabel();
	}

	private String createVersion(CatalogItem cookbookItem) {
        RemoteCookbook cookbookInfo = (RemoteCookbook) cookbookItem.getData();
        String latestVersion = cookbookInfo.getLatestVersion();
        if (latestVersion != null) {
        	String v = CookbookRepositoryManager.getInstance().getReadableVersion(cookbookInfo, latestVersion);
            return "Version " + v;
        } 
        return "";
    }

    public void createProviderLabel() {
		providerLabel = new Link(this, SWT.RIGHT);
		GridDataFactory.fillDefaults().span(4, 1).align(SWT.BEGINNING, SWT.CENTER).applyTo(providerLabel);
		// always disabled color to make it less prominent
		providerLabel.setForeground(resources.getColorDisabled());
		if (item.getCertification() != null) {
			providerLabel.setText(NLS.bind(Messages.DiscoveryViewer_Certification_Label0, new String[] {item.getProvider(), item.getLicense(), item.getCertification().getName()}));
			if (item.getCertification().getUrl() != null) {
				providerLabel.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						WorkbenchUtil.openUrl(item.getCertification().getUrl(), IWorkbenchBrowserSupport.AS_EXTERNAL);
					}
				});
			}
			Overview overview = new Overview();
			overview.setSummary(item.getCertification().getDescription());
			overview.setUrl(item.getCertification().getUrl());
			Image image = resources.getIconImage(item.getSource(), item.getCertification().getIcon(), 48, true);
			hookTooltip(providerLabel, providerLabel, this, providerLabel, item.getSource(), overview, image);
		} else if (item.getLicense() != null) {
			providerLabel.setText(NLS.bind(Messages.ConnectorDiscoveryWizardMainPage_provider_and_license, item.getProvider(), item.getLicense()));
		} else {
			providerLabel.setText(item.getProvider());
		}
	}

	protected boolean hasTooltip() {
		return item.getOverview() != null && item.getOverview().getSummary() != null && item.getOverview().getSummary().length() > 0;
	}

	public void initializeListeners() {
		checkbox.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}

			public void widgetSelected(SelectionEvent e) {
				boolean selected = checkbox.getSelection();
				maybeModifySelection(selected);
			}
		});
		MouseListener connectorItemMouseListener = new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				boolean selected = !checkbox.getSelection();
				if (maybeModifySelection(selected)) {
					checkbox.setSelection(selected);
				}
			}
		};
		checkboxContainer.addMouseListener(connectorItemMouseListener);
		this.addMouseListener(connectorItemMouseListener);
		iconLabel.addMouseListener(connectorItemMouseListener);
		nameLabel.addMouseListener(connectorItemMouseListener);
		// the provider has clickable links
		//providerLabel.addMouseListener(connectorItemMouseListener);
		description.addMouseListener(connectorItemMouseListener);
	}

	protected boolean maybeModifySelection(boolean selected) {
		if (selected) {
			if (item.isInstalled()) {
				MessageDialog.openWarning(shellProvider.getShell(), Messages.DiscoveryItem_Connector_already_installed_Error_Title, NLS.bind(Messages.DiscoveryItem_Connector_already_installed_Error_Message, item.getName()));
				return false;
			}
			if (item.getAvailable() != null && !item.getAvailable()) {
				MessageDialog.openWarning(shellProvider.getShell(), Messages.ConnectorDiscoveryWizardMainPage_warningTitleConnectorUnavailable, NLS.bind(Messages.ConnectorDiscoveryWizardMainPage_warningMessageConnectorUnavailable, item.getName()));
				return false;
			}
		}
		viewer.modifySelection(item, selected);
		return true;
	}

	public void propertyChange(PropertyChangeEvent evt) {
		if (!isDisposed()) {
			getDisplay().asyncExec(new Runnable() {
				public void run() {
					if (!isDisposed()) {
						refresh();
					}
				}
			});
		}
	}

	@Override
	protected void refresh() {
		boolean enabled = !item.isInstalled() && (item.getAvailable() == null || item.getAvailable());

		checkbox.setEnabled(enabled);
		nameLabel.setEnabled(enabled);
		providerLabel.setEnabled(enabled);
		description.setEnabled(enabled);

		Color foreground;
		if (enabled) {
			foreground = getForeground();
		} else {
			foreground = resources.getColorDisabled();
		}
		nameLabel.setForeground(foreground);
		description.setForeground(foreground);
	}

}
