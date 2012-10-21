package org.limepepper.chefclipse.navigator.providers;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.limepepper.chefclipse.model.cookbook.Cookbook;


public class ChefCookbookContentProvider implements ICommonContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {		
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		ArrayList<Object> children = new ArrayList<Object>();
		if(parentElement instanceof Cookbook){
			Cookbook cookbook = (Cookbook)parentElement;			
			String path = cookbook.getRepository().getBasepath() + "/cookbooks/" + cookbook.getName();						
			IPath location = new Path(path + "/metadata.rb");
			
//			IWorkspace ws = ResourcesPlugin.getWorkspace();
//			IProject project = ws.getRoot().getProject("chef");
//			
			
//			IFile file = project.getFile(location.lastSegment());
//			try {
//				file.createLink(location, IResource.NONE, null);
//			} catch (CoreException e) {				
//				e.printStackTrace();
//			}
									
			IFileStore file = EFS.getLocalFileSystem().getStore(location);
			children.add(file);
			children.addAll(((Cookbook)parentElement).getRecipes());			
		}
		
		return children.toArray();
	}

	@Override
	public Object getParent(Object element) {		
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return false;
	}

	@Override
	public void dispose() {		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {		
	}

	@Override
	public void restoreState(IMemento aMemento) {		
	}

	@Override
	public void saveState(IMemento aMemento) {		
	}

	@Override
	public void init(ICommonContentExtensionSite aConfig) {
	}

}
