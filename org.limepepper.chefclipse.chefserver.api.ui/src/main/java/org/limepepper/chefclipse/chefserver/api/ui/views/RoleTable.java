package org.limepepper.chefclipse.chefserver.api.ui.views;

import java.util.List;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.limepepper.chefclipse.chefserver.api.ChefServerApi;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.ui.providers.ChefProjectAdapterFactory;

public class RoleTable extends Composite {

	private TableViewer tableViewer;
	private Table table;
	private ChefServerApi api;
	
    public RoleTable(Composite parent, ChefServerApi api)
    {
    	super(parent,SWT.NONE);
        setLayout(new FillLayout());
        
    	this.api=api;
        
        tableViewer = new TableViewer(this, SWT.MULTI | SWT.H_SCROLL
                | SWT.V_SCROLL);

        tableViewer.setContentProvider(new RoleContentProvider());
        tableViewer.setLabelProvider(new RoleLabelProvider());
        tableViewer.setSorter(new NameSorter());
        tableViewer.getTable().setLinesVisible(true);
        tableViewer.setInput(api.getRoles());
    }
    
    class NameSorter extends ViewerSorter {
    }
    
    class RoleLabelProvider extends AdapterFactoryLabelProvider {

        public RoleLabelProvider() {
            super(ChefProjectAdapterFactory.getAdapterFactory());
        }

        public String getText(Object element) {

            return super.getText(element);
        }

        public String getColumnText(Object obj, int index) {
            return getText(obj);
        }

        public Image getColumnImage(Object obj, int index) {
            return getImage(obj);
        }
        public Image getImage(Object obj) {
            return PlatformUI.getWorkbench().getSharedImages()
                    .getImage(ISharedImages.IMG_OBJ_ELEMENT);
        }
    }
    
    class RoleContentProvider extends AdapterFactoryContentProvider {
    	RoleContentProvider() {
            super(ChefProjectAdapterFactory.getAdapterFactory());
        }

        @Override
        public void dispose() {
        }

        @Override
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }

        @Override
        public Object[] getElements(Object inputElement) {
        	List<Role> roles = (List<Role>)inputElement;
        	return roles.toArray(new Role[roles.size()]);
        }
    }
    
}
