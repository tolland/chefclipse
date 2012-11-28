package org.limepepper.chefclipse.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class ChefPerspectiveFactory implements IPerspectiveFactory {

    public static final  String ID = "org.limepepper.chefclipse.perspective"; //$NON-NLS-1$

    @Override
    public void createInitialLayout(IPageLayout layout) {
        String editorArea = layout.getEditorArea();

        // Add Project Explorer view
        IFolderLayout topLeft = layout.createFolder(
                "topLeft", IPageLayout.LEFT, (float) 0.28, editorArea);
        topLeft.addView(IPageLayout.ID_PROJECT_EXPLORER);

        // Add Properties view
        IFolderLayout bottomRight = layout.createFolder(
                "bottomRight", IPageLayout.BOTTOM, (float) 0.65, editorArea);

        bottomRight.addView(IPageLayout.ID_PROP_SHEET);

        // Add Outline view
        IFolderLayout topRight = layout.createFolder(
                "topRight", IPageLayout.RIGHT, (float) 0.70, editorArea);
        topRight.addView(IPageLayout.ID_OUTLINE);






    }

}
