package org.limepepper.rcp.templateproject.app;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class TemplatePerspectiveFactory implements IPerspectiveFactory{

	@Override
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);		
	}

}
