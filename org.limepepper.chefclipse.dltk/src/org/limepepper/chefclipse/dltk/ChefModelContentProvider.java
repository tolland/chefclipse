package org.limepepper.chefclipse.dltk;

import java.util.List;

import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.ui.IModelContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.limepepper.chefclipse.dltk.model.ChefParser;
import org.limepepper.chefclipse.dltk.model.ModelRoot;
import org.limepepper.chefclipse.dltk.model.Resource;

public class ChefModelContentProvider implements IModelContentProvider {

	private ChefParser parser;

	public ChefModelContentProvider() {
		parser = new ChefParser();
	}

	@Override
	public void provideModelChanges(Object parentElement, List children,
			ITreeContentProvider iTreeContentProvider) {

		if (parentElement instanceof ISourceModule) {
			ISourceModule sourceModule = (ISourceModule) parentElement;
			ModelRoot modelRoot = parser.parse(sourceModule);
			for (Resource resource : modelRoot.getResources()) {
				children.add(new ChefResourceModelElement(resource,
						sourceModule));
			}
		}
	}

	@Override
	public Object getParentElement(Object element,
			ITreeContentProvider iTreeContentProvider) {
		return null;
	}

}
