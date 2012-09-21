package org.limepepper.rcp.templateproject.common.resources;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class TemplateContentProvider implements ITreeContentProvider{

	@Override
	public void dispose() {				
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {				
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof IWorkspaceRoot){
			return ((IWorkspaceRoot)inputElement).getProjects();
		}
								
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {				
		if (parentElement instanceof IProject){
			TemplateProject project = TemplateResources.getProject((IProject)parentElement);
			if(project != null)
				return project.getMembers();
			else
				try {
					return ((IProject)parentElement).members();
				} catch (CoreException e) {					
					e.printStackTrace();
				}
		}
				
		return null;
	}

	@Override
	public Object getParent(Object element) {		
		if (element instanceof IProject){
			return ((IProject)element).getParent();
		}
		else if (element instanceof TemplateModule){
			return ((TemplateModule)element).getProject();
		}
		else {
			return null;
		}				
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof TemplateModule){			
			return false;
		}
		else {
			return true;
		}
	}

}
