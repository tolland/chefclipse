package org.limepepper.templateproject.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class TemplatePerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
        
		// Add Project Explorer view
        IFolderLayout topLeft = layout.createFolder(
                "topLeft", IPageLayout.LEFT, (float) 0.28, editorArea);		
        topLeft.addView(IPageLayout.ID_PROJECT_EXPLORER);
        
        // Add Outline view
        IFolderLayout bottomLeft = layout.createFolder(
                "bottomLeft", IPageLayout.BOTTOM, (float) 0.50, "topLeft");
        bottomLeft.addView(IPageLayout.ID_OUTLINE);

        // Add Properties view
		IFolderLayout bottomRight = layout.createFolder(
                "bottomRight", IPageLayout.BOTTOM, (float) 0.65, editorArea);
		
		bottomRight.addView(IPageLayout.ID_PROP_SHEET);	
	}

}
