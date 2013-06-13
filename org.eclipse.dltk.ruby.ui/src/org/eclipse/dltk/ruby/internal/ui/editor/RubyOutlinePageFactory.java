package org.eclipse.dltk.ruby.internal.ui.editor;

import org.eclipse.jface.preference.IPreferenceStore;

public class RubyOutlinePageFactory {
	public RubyOutlinePage createOutlinePage(RubyEditor editor, IPreferenceStore preferenceStore) {
		return new RubyOutlinePage(editor, preferenceStore);
	}
}
