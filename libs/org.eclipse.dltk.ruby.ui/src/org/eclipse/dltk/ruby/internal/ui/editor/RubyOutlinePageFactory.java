package org.eclipse.dltk.ruby.internal.ui.editor;

import org.eclipse.jface.preference.IPreferenceStore;

/**
 * A factory class to delegate outline page creation, so that Chefclipse is able
 * to customize it
 * 
 */
public class RubyOutlinePageFactory {
	public RubyOutlinePage createOutlinePage(RubyEditor editor,
			IPreferenceStore preferenceStore) {
		return new RubyOutlinePage(editor, preferenceStore);
	}
}
