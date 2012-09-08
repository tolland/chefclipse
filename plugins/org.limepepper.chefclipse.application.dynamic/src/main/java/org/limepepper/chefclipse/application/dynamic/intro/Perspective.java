package org.limepepper.chefclipse.application.dynamic.intro;


import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.progress.IProgressConstants;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		addFolders(layout);
		addViews(layout);
	}

	protected void addFolders(IPageLayout layout) {
		IFolderLayout leftFolder = layout.createFolder(
				"left", IPageLayout.LEFT, (float) 0.2, layout.getEditorArea()); //$NON-NLS-1$
	//	leftFolder.addView(DLTKUIPlugin.ID_SCRIPT_EXPLORER);
		leftFolder.addView("org.eclipse.dltk.testing.ResultView"); //$NON-NLS-1$
		leftFolder.addPlaceholder("org.eclipse.dltk.ui.TypeHierarchy"); //$NON-NLS-1$
		leftFolder.addPlaceholder(IPageLayout.ID_BOOKMARKS);

		IFolderLayout bottomFolder = layout
				.createFolder(
						"bottom", IPageLayout.BOTTOM, (float) 0.75, layout.getEditorArea()); //$NON-NLS-1$
		bottomFolder.addView(IPageLayout.ID_PROBLEM_VIEW);
		bottomFolder.addView(IPageLayout.ID_TASK_LIST);
		bottomFolder.addView("org.eclipse.dltk.ruby.ui.RubyDocumentationView"); //$NON-NLS-1$
//		bottomFolder.addView(IConsoleConstants.ID_CONSOLE_VIEW);

		bottomFolder.addPlaceholder("org.eclipse.dltk.callhierarchy.view"); //$NON-NLS-1$
	//	bottomFolder.addPlaceholder(NewSearchUI.SEARCH_VIEW_ID);
		bottomFolder.addPlaceholder(IProgressConstants.PROGRESS_VIEW_ID);
	}

	protected void addViews(IPageLayout layout) {
		layout.addView(IPageLayout.ID_OUTLINE, IPageLayout.RIGHT, (float) 0.75,
				layout.getEditorArea());
	}
}
