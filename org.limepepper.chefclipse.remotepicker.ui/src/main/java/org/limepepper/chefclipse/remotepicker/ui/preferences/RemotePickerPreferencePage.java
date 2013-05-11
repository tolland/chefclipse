package org.limepepper.chefclipse.remotepicker.ui.preferences;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.limepepper.chefclipse.remotepicker.ui.Activator;
import org.limepepper.chefclipse.remotepicker.ui.handlers.RemotePickerHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Sebastian Sampaoli
 *
 */
public class RemotePickerPreferencePage extends FieldEditorPreferencePage
		implements IWorkbenchPreferencePage {
	
	private class RepositoryFieldEditor extends BooleanFieldEditor {
		private final Composite composite;
		public Button rmButton;
		private Label icon;
		private Image scaledImage;
		private boolean disposed;

		private RepositoryFieldEditor(String name, String label,
				Composite parent, Composite composite) {
			super(name, label, parent);
			this.composite = composite;
		}

		@Override
		public int getNumberOfControls() {
			return 4;
		}
		
		@Override
		protected void doStore() {
			if (!disposed)
				super.doStore();
		}
		
		@Override
		protected void adjustForNumColumns(int numColumns) {
			super.adjustForNumColumns(1);
		}

		/**
		 * @param composite
		 * @return
		 */
		protected Button createRemoveButton(final Composite composite) {
			rmButton = new Button(composite, SWT.PUSH | SWT.CENTER);
			rmButton.setImage(Activator.getDefault().getImageRegistry().get(Activator.REPO_REMOVE));
			rmButton.setToolTipText("Remove Cookbook Repository");
			return rmButton;
		}

		protected Label createIcon(boolean template,
				final RemoteRepository repository, final Composite composite) {
			icon = new Label(composite, SWT.HORIZONTAL);
			icon.setSize(28, 28);
			icon.setToolTipText(repository.getDescription());
			try {
				Image origImage = ImageDescriptor.createFromURL(new URL(repository.getIcon())).createImage();
				scaledImage = null; //the scaled image will be set
				
				scaledImage = new Image(Display.getDefault(), origImage.getImageData().scaledTo(28,28));
				if (template) {
					ImageDescriptor overlay = Activator.getDefault().getImageRegistry().getDescriptor(Activator.TEMPLATE_REPO_OVERLAY);
					DecorationOverlayIcon imageOverlayed = new DecorationOverlayIcon(scaledImage, overlay, IDecoration.BOTTOM_LEFT);
					Image templateImage = imageOverlayed.createImage();
					scaledImage.dispose();
					scaledImage = templateImage;
				}
				origImage.dispose();
				icon.setImage(scaledImage);
			} catch (MalformedURLException e) {
				log.error("Could not load image", e);
			}
			return icon;
		}

		@Override
		public void dispose() {
			disposed = true;
			super.dispose();
			super.getChangeControl(composite).dispose();
			if (rmButton != null)
				rmButton.dispose();
			if (icon != null)
				icon.dispose();
			if (scaledImage != null) {
				scaledImage.dispose();
			}
		}
		
		@Override
		public void setEnabled(boolean enabled, Composite parent) {
			super.setEnabled(enabled, parent);
			if (rmButton != null) {
				rmButton.setEnabled(enabled);
			}
		}
	}

	public static final String ID = "org.limepepper.chefclipse.remotepicker.ui.remotePickerPreferencePage";
	
	final static Logger log = LoggerFactory.getLogger(RemotePickerPreferencePage.class);
	protected Map<String, RepositoryFieldEditor> editors = new HashMap<String, RepositoryFieldEditor>();

	public RemotePickerPreferencePage(){
		super(GRID);
	}
	
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	    setDescription("Set the remote picker general preferences.");
	}

	@Override
	protected void createFieldEditors() {
		String[][] nameAndIdOfRepositories = getRepositoriesInfo(); 
		
		Composite parent = new Composite(getFieldEditorParent(), SWT.NULL);
		GridDataFactory.fillDefaults().span(4, 1).applyTo(parent);
		
		ComboFieldEditor defaultEd = new ComboFieldEditor(IRemotePickerPreferences.DEFAULT_REPOSITORY, 
				"Select the default repository: ", nameAndIdOfRepositories, parent) {
			@Override
			protected void adjustForNumColumns(int numColumns) {}
			
			@Override
			protected void fireValueChanged(String property,
					Object oldValue, Object newValue) {
				super.fireValueChanged(property, oldValue, newValue);
				
				RepositoryFieldEditor ed = editors.get(newValue);
				for (BooleanFieldEditor editor : editors.values()) {
					editor.setEnabled(true, getFieldEditorParent());
				}
				forceEnable(ed);
			}

		};
		addField(defaultEd);
		
		addRepos(CookbookRepositoryManager.getInstance().getRepositories(), false);
		addRepos(CookbookRepositoryManager.getInstance().getTemplateRepositories(), true);
	}
	
	/**
	 * Forces a repository to be enabled and disallows edits.
	 * @param ed editor
	 */
	protected void forceEnable(RepositoryFieldEditor ed) {
		if (!ed.getBooleanValue()) {
			ed.loadDefault();
		}
		ed.setEnabled(false, getFieldEditorParent());
	}
	
	/**
	 * @param composite 
	 * @param repositories
	 * @param template 
	 */
	protected void addRepos(Collection<RemoteRepository> repositories, boolean template) {
		String defaultRepoId = getPreferenceStore().getString(IRemotePickerPreferences.DEFAULT_REPOSITORY);
		for (final RemoteRepository repository : repositories) {
			final Composite composite = getFieldEditorParent();

			final RepositoryFieldEditor ed = new RepositoryFieldEditor(repository.getId(), "", getFieldEditorParent(), composite);
			addField(ed);
			editors.put(repository.getId(), ed);
			
			ed.createIcon(template, repository, composite);
			
			final Label label = new Label(composite, SWT.HORIZONTAL);
			label.setToolTipText(repository.getDescription());
			label.setText(repository.getName());

			final CookbookRepositoryManager manager = CookbookRepositoryManager.getInstance();
			if (template) {
				final Button addButton = new Button(composite, SWT.PUSH | SWT.CENTER);
				addButton.setImage(Activator.getDefault().getImageRegistry().get(Activator.REPO_ADD));
				addButton.setToolTipText("Configure and Add Cookbook Repository");
				addButton.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						RemoteRepository newRepo = manager.configureRepositoryTemplate(repository);
						if (newRepo != null) {
							RemotePickerHandler.startRepositoryJob(newRepo, manager);
							addRepos(Collections.singleton(newRepo), false);
							RepositoryFieldEditor pe = editors.get(newRepo.getId());
							pe.setPage(RemotePickerPreferencePage.this);
			                pe.setPropertyChangeListener(RemotePickerPreferencePage.this);
			                pe.setPreferenceStore(getPreferenceStore());
			                pe.loadDefault();
							Display.getCurrent().asyncExec(new Runnable() {
								@Override
								public void run() {
									adjustGridLayout();
									getControl().redraw();
									composite.layout(true, true);
								}
							});
						}
					}
				});
			} else if (repository.getRetriever() != null) {
				final Button rmButton = ed.createRemoveButton(composite);
				rmButton.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						manager.removeRepository(repository.getId());
						ed.dispose();
						label.dispose();
						composite.layout(true, true);
					}
				});
			} else {
				GridDataFactory.swtDefaults().span(2, 1).applyTo(label);
			}

			if (repository.getId().equals(defaultRepoId)) {
				forceEnable(ed);
			}
		}
	}

	private String[][] getRepositoriesInfo() {
		Collection<RemoteRepository> repositories = CookbookRepositoryManager.getInstance().getRepositories();
		String[][] repositoriesInfo = new String[repositories.size()][2];
		int i = 0;
		for (RemoteRepository remoteRepository : repositories) {			
			String[] repositoryInfo = {remoteRepository.getName(), remoteRepository.getId()};
			repositoriesInfo[i++] = repositoryInfo;
		}
		return repositoriesInfo;
	}

}
