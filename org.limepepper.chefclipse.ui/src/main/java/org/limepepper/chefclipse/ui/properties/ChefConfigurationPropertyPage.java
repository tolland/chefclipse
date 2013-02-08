package org.limepepper.chefclipse.ui.properties;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PropertyPage;
import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.ui.Activator;

/**
 * 
 * @author Guillermo Zunino
 *
 */
public class ChefConfigurationPropertyPage extends PropertyPage {

	private static final String PATH_TITLE = "Path:";
	private static final String OWNER_TITLE = "&Owner:";
	private static final String OWNER_PROPERTY = "OWNER";
	private static final String DEFAULT_OWNER = "John Doe";

	private static final String CHEFCONFIG_PROPERTY = "CHEF_CONFIGURATION";
	private static final int REPOSITORY_LIST_MULTIPLIER = 30;
	private static final String PROPERTIES_PAGE = Activator.PLUGIN_ID + ".chef_config__properties_page";;
	private IProject project;
	private boolean modified = false;
//	private CheckboxTableViewer listViewer;
	private ChefConfigurationsViewer fJREBlock;

	/**
	 * Constructor for SamplePropertyPage.
	 */
	public ChefConfigurationPropertyPage() {
		super();
	}

	private void addFirstSection(Composite parent) {
		Composite composite = createDefaultComposite(parent);

		//Label for path field
		Label pathLabel = new Label(composite, SWT.NONE);
		pathLabel.setText(PATH_TITLE);

		// Path text field
		Text pathValueText = new Text(composite, SWT.WRAP | SWT.READ_ONLY);
		pathValueText.setText(((IResource) getElement()).getFullPath().toString());
	}

	private void addSeparator(Composite parent) {
		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		separator.setLayoutData(gridData);
	}

	private void addSecondSection(Composite parent) {
//		Composite composite = createDefaultComposite(parent);
//
//		// Label for owner field
//		Label ownerLabel = new Label(composite, SWT.NONE);
//		ownerLabel.setText(OWNER_TITLE);
//
//		// Owner text field
//		ownerText = new Text(composite, SWT.SINGLE | SWT.BORDER);
//		GridData gd = new GridData();
//		gd.widthHint = convertWidthInCharsToPixels(TEXT_FIELD_WIDTH);
//		ownerText.setLayoutData(gd);
//
//		// Populate owner text field
//		try {
//			String owner =
//				((IResource) getElement()).getPersistentProperty(
//					new QualifiedName("", OWNER_PROPERTY));
//			ownerText.setText((owner != null) ? owner : DEFAULT_OWNER);
//		} catch (CoreException e) {
//			ownerText.setText(DEFAULT_OWNER);
//		}
	}

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
//		Composite composite = new Composite(parent, SWT.NONE);
//		GridLayout layout = new GridLayout();
//		composite.setLayout(layout);
//		GridData data = new GridData(GridData.FILL);
//		data.grabExcessHorizontalSpace = true;
//		composite.setLayoutData(data);

//		addFirstSection(composite);
//		addSeparator(composite);
//		addSecondSection(composite);
//		return composite;
		Font font = parent.getFont();

		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		composite.setFont(font);

		initialize();

		Label description = createDescriptionLabel(composite);
		description.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

		fJREBlock = new ChefConfigurationsViewer();
		fJREBlock.createControl(composite);
		Control control = fJREBlock.getControl();
		GridData data = new GridData(GridData.FILL_BOTH);
		data.horizontalSpan = 1;
		control.setLayoutData(data);
		
		fJREBlock.restoreColumnSettings(Activator.getDefault().getDialogSettings(), PROPERTIES_PAGE);

		
//		listViewer = CheckboxTableViewer.newCheckList(composite, SWT.TOP | SWT.BORDER);
//		listViewer.getTable().setFont(font);
//		GridData data = new GridData(GridData.FILL_BOTH);
//		data.grabExcessHorizontalSpace = true;

		// Only set a height hint if it will not result in a cut off dialog
//		if (DialogUtil.inRegularFontMode(parent)) {
//			data.heightHint = getDefaultFontHeight(listViewer.getTable(), REPOSITORY_LIST_MULTIPLIER);
//		}
//		listViewer.getTable().setLayoutData(data);
//		listViewer.getTable().setFont(font);

//		listViewer.setLabelProvider(new DecoratingLabelProvider(new TaskRepositoryLabelProvider(),
//				PlatformUI.getWorkbench().getDecoratorManager().getLabelDecorator()));
//		listViewer.setContentProvider(new IStructuredContentProvider() {
//			public void inputChanged(Viewer v, Object oldInput, Object newInput) {
//			}
//
//			public void dispose() {
//			}
//
//			public Object[] getElements(Object parent) {
//				return new String[] {"Chef Server 1", "Cherf Server 2"};
//			}
//
//		});

//		listViewer.setSorter(new TaskRepositoriesSorter());
//		listViewer.setInput(project.getWorkspace());

//		listViewer.addCheckStateListener(new ICheckStateListener() {
//			public void checkStateChanged(CheckStateChangedEvent event) {
//				if (event.getChecked()) {
//					// only allow single selection
//					listViewer.setAllChecked(false);
//					listViewer.setChecked(event.getElement(), event.getChecked());
//				}
//				modified = true;
//			}
//		});
		updateLinkedRepository();
		return composite;
	}

	private void initialize() {
		project = (IProject) getElement().getAdapter(IResource.class);
		noDefaultAndApplyButton();
		setDescription("Select a Chef Configuration to associate with this project below");
	}
	
	void updateLinkedRepository() {
		KnifeConfig kconfig = KnifeFactory.eINSTANCE.createKnifeConfig();
		kconfig.setNode_name("node 1");
		try {
			kconfig.setChef_server_url(new URL("http://chef.server1.com"));
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		fJREBlock.setChefConfigs(new KnifeConfig[]{kconfig});
		
		try {
			String config = ((IResource) getElement()).getPersistentProperty(
						new QualifiedName("", CHEFCONFIG_PROPERTY));
			if (config != null) {
				fJREBlock.setCheckedConfig(kconfig);
//				listViewer.setCheckedElements(new Object[] { config });
			}
		} catch (CoreException e) {
			// TODO: log
		}
	}
	
	private static int getDefaultFontHeight(Control control, int lines) {
		FontData[] viewerFontData = control.getFont().getFontData();
		int fontHeight = 10;

		// If we have no font data use our guess
		if (viewerFontData.length > 0) {
			fontHeight = viewerFontData[0].getHeight();
		}
		return lines * fontHeight;

	}
	
	private Composite createDefaultComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);

		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		composite.setLayoutData(data);

		return composite;
	}

	protected void performDefaults() {
		super.performDefaults();
		// Populate the owner text field with the default value
//		ownerText.setText(DEFAULT_OWNER);
	}
	
	@Override
	public boolean performOk() {
		if (!modified) {
			return true;
		}
//		if ( != ) {
//			TaskRepository selectedRepository = (TaskRepository) listViewer.getCheckedElements()[0];
//			TasksUiPlugin.getDefault().setRepositoryForResource(project, selectedRepository);
//			savePreference(listViewer.getCheckedElements()[0].toString());
//		} else {
			savePreference(fJREBlock.getCheckedConfig());
//		}
		
		// save column widths
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		fJREBlock.saveColumnSettings(settings, PROPERTIES_PAGE);
		return super.performOk();
	}

	/**
	 * @param selected 
	 * @throws CoreException
	 */
	private void savePreference(Config selected) {
		try {
			((IResource) getElement()).setPersistentProperty(
					new QualifiedName("", CHEFCONFIG_PROPERTY),
					selected.getChef_server_url().toExternalForm());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
		}
	}
	
//	public boolean performOk() {
//		// store the value in the owner text field
//		try {
//			((IResource) getElement()).setPersistentProperty(
//				new QualifiedName("", OWNER_PROPERTY),
//				ownerText.getText());
//		} catch (CoreException e) {
//			return false;
//		}
//		return true;
//	}

}