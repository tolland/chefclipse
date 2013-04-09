package chefclipse.internal.ui.navigator;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import chefclipse.core.ChefCore;
import chefclipse.core.builders.ChefProjectNature;

/**
 * http://devdesignandstuff.blogspot.co.uk/2010/10/contributing-to-eclipse-
 * common.html
 * 
 * @author tomhodder
 * 
 */
public class ChefNavigatorContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getElements(Object inputElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		ArrayList<Object> children = new ArrayList<Object>();
		try {
			if ((parentElement instanceof IProject)
					&& ((IProject) parentElement)
							.hasNature(ChefProjectNature.NATURE_ID)) {
				children.add(ChefCore.create((IProject) parentElement));
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return children.toArray();
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		try {
			if ((element instanceof IProject)
					&& ((IProject) element)
							.hasNature(ChefProjectNature.NATURE_ID)) {
				return true;
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
