package org.limepepper.chefclipse.dltk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.ElementChangedEvent;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.ui.editor.ScriptEditor;
import org.eclipse.dltk.ruby.internal.ui.editor.RubyOutlinePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.limepepper.chefclipse.dltk.model.ChefParser;
import org.limepepper.chefclipse.dltk.model.ModelRoot;
import org.limepepper.chefclipse.dltk.model.Resource;

public class ChefRubyOutlinePage extends RubyOutlinePage {

	/**
	 * The default listener does not update the outline tree in case a chef
	 * element changes, because it is not recognised / not included in the DLTK
	 * model. So we need to override the default element change listener in
	 * order to make the outline view to refresh when a chef element changes.
	 * 
	 */
	private class GreedyElementChangeListener extends ElementChangedListener {
		@Override
		public void elementChanged(final ElementChangedEvent e) {
			if (getControl() == null) {
				return;
			}

			Display d = getControl().getDisplay();
			if (d != null) {
				d.asyncExec(new Runnable() {
					public void run() {
						if (e.getDelta() != null && fOutlineViewer != null) {
							fOutlineViewer.reconcile(e.getDelta());
						}

					}
				});
			}
		}
	}

	private class DelegatingLabelProvider implements ILabelProvider {

		private final ILabelProvider wrapped;

		public DelegatingLabelProvider(ILabelProvider wrapped) {
			this.wrapped = wrapped;
		}

		public Image getImage(Object element) {
			if (element instanceof ChefResourceOutlineElement) {
				return Activator.getDefault().getImageRegistry()
						.get(Activator.CHEFCLIPSE_ICON);
			}
			return wrapped.getImage(element);
		}

		public String getText(Object element) {
			if (element instanceof ChefResourceOutlineElement) {
				return ((ChefResourceOutlineElement) element).getChefResource().getDisplayName();
			}
			return wrapped.getText(element);
		}

		public void addListener(ILabelProviderListener listener) {
			wrapped.addListener(listener);
		}

		public void dispose() {
			wrapped.dispose();
		}

		public boolean isLabelProperty(Object element, String property) {
			return wrapped.isLabelProperty(element, property);
		}

		public void removeListener(ILabelProviderListener listener) {
			wrapped.removeListener(listener);
		}
	}

	private class DelegatingContentProvider implements ITreeContentProvider {

		private final ITreeContentProvider wrapped;

		private ChefParser parser = new ChefParser();

		private ElementChangedListener fListener;

		/**
		 * Override this method to add parsed chef elements
		 */
		public Object[] getElements(Object inputElement) {
			List elements = new ArrayList();
			elements.addAll(Arrays.asList(wrapped.getElements(inputElement)));

			if (inputElement instanceof ISourceModule) {
				ISourceModule sourceModule = (ISourceModule) inputElement;
				ModelRoot modelRoot = parser.parse(sourceModule);
				for (Resource resource : modelRoot.getResources()) {
					elements.add(new ChefResourceOutlineElement(resource, sourceModule));
				}
			}

			return elements.toArray();
		}

		public void dispose() {
			wrapped.dispose();
		}

		/**
		 * Override this method to add a custom listener to trigger refresh
		 */
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			boolean isCU = (newInput instanceof ISourceModule);

			if (isCU && fListener == null) {
				fListener = new GreedyElementChangeListener();
				DLTKCore.addElementChangedListener(fListener);
			} else if (!isCU && fListener != null) {
				DLTKCore.removeElementChangedListener(fListener);
				fListener = null;
			}
		}

		public Object[] getChildren(Object parentElement) {
			return wrapped.getChildren(parentElement);
		}

		public Object getParent(Object element) {
			return wrapped.getParent(element);
		}

		public boolean hasChildren(Object element) {
			return wrapped.hasChildren(element);
		}

		public DelegatingContentProvider(ITreeContentProvider wrapped) {
			this.wrapped = wrapped;
		}
	}

	public ChefRubyOutlinePage(ScriptEditor editor, IPreferenceStore store) {
		super(editor, store);
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);

		ScriptOutlineViewer viewer = getOutlineViewer();

		ITreeContentProvider contentProvider = (ITreeContentProvider) viewer
				.getContentProvider();
		viewer.setContentProvider(new DelegatingContentProvider(contentProvider));

		ILabelProvider labelProvider = (ILabelProvider) viewer
				.getLabelProvider();
		viewer.setLabelProvider(new DelegatingLabelProvider(labelProvider));
	}
}
