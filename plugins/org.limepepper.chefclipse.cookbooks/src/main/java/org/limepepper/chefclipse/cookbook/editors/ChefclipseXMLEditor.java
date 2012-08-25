package org.limepepper.chefclipse.cookbook.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class ChefclipseXMLEditor extends TextEditor {

	private ColorManager colorManager;

	public ChefclipseXMLEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
