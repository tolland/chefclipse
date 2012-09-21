package org.limepepper.rcp.templateproject.common.resources;


import org.eclipse.core.resources.IWorkspaceRoot;
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
		if (inputElement instanceof TemplateProject){
			return ((TemplateProject)inputElement).getMembers();
		}
		else if (inputElement instanceof IWorkspaceRoot){
			return TemplateResources.getProjects((IWorkspaceRoot)inputElement);
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {		
		if (parentElement instanceof TemplateProject){
			return ((TemplateProject)parentElement).getMembers();
		}
		else if (parentElement instanceof TemplateModule){
			return null;
		}
		else if (parentElement instanceof IWorkspaceRoot){
			TemplateResources.getProjects((IWorkspaceRoot)parentElement);
		}
		
		return null;
	}

	@Override
	public Object getParent(Object element) {		
		if (element instanceof TemplateProject){
			return ((TemplateProject)element).getProject().getParent();
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
		if (element instanceof TemplateProject){
			return true;
		}
		else if (element instanceof TemplateModule){			
			return false;
		}
		else {
			return true;
		}
	}

}
