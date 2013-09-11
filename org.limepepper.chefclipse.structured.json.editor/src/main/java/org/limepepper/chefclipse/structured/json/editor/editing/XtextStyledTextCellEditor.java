package org.limepepper.chefclipse.structured.json.editor.editing;

import java.util.List;

import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

/**
 * This class integrates Xtext features into a {@link CellEditor} and can be
 * used e.g. in jFace {@link StructuredViewer}s or in GMF EditParts via
 * DirectEditManager.
 * 
 * The current implementation supports, code completion, syntax highlighting and
 * validation
 * 
 * @see XtextStyledTextProvider
 * 
 * @author andreas.muelder@itemis.de
 * @author alexander.nyssen@itemis.de
 * @author patrick.koenemann@itemis.de
 */
public class XtextStyledTextCellEditor extends StyledTextCellEditor {

	private Injector injector;
	private StyledTextXtextAdapter xtextAdapter;
	private  IXtextFakeContextResourcesProvider contextFakeResourceProvider;

	public XtextStyledTextCellEditor(int style, Injector injector,
			IXtextFakeContextResourcesProvider contextFakeResourceProvider) {
		this(style, injector);
		this.contextFakeResourceProvider = contextFakeResourceProvider;
	}


	public XtextStyledTextCellEditor(int style, Injector injector) {
		setStyle(style);
		this.injector = injector;
	}

	/**
	 * Creates an {@link SourceViewer} and returns the {@link StyledText} widget
	 * of the viewer as the cell editors control. Some code is copied from
	 * {@link XtextEditor}.
	 */
	@Override
	protected Control createControl(Composite parent) {
		StyledText styledText = (StyledText) super.createControl(parent);
		styledText.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				XtextStyledTextCellEditor.this.focusLost();
			}
		});

		// adapt to xtext
		xtextAdapter = new StyledTextXtextAdapter(injector,
				contextFakeResourceProvider == null ? IXtextFakeContextResourcesProvider.NULL_CONTEXT_PROVIDER: contextFakeResourceProvider);
		xtextAdapter.adapt(styledText);

		// configure content assist
		final IContentAssistant contentAssistant = xtextAdapter
				.getContentAssistant();
		completionProposalAdapter = new CompletionProposalAdapter(styledText,
				contentAssistant, KeyStroke.getInstance(SWT.CTRL, SWT.SPACE),
				null);

		if ((styledText.getStyle() & SWT.SINGLE) != 0) {

			// The regular key down event is too late (after popup is closed
			// again).
			// when using the StyledText.VerifyKey event (3005), we get the
			// event early enough!
			styledText.addListener(3005, new Listener() {
				public void handleEvent(Event event) {
					if (event.character == SWT.CR
							&& !completionProposalAdapter.isProposalPopupOpen()) {
						focusLost();
					} else if (event.character == SWT.ESC
							&& !completionProposalAdapter.isProposalPopupOpen()) {
						XtextStyledTextCellEditor.this.fireCancelEditor();
					}
				}
			});
		}

		return styledText;
	}

	@Override
	public boolean isUndoEnabled() {
		return xtextAdapter.sourceviewer.getUndoManager().undoable();
	}

	@Override
	public void performUndo() {
		xtextAdapter.sourceviewer.getUndoManager().undo();
	}

	@Override
	public boolean isRedoEnabled() {
		return xtextAdapter.sourceviewer.getUndoManager().redoable();
	}

	@Override
	public void performRedo() {
		xtextAdapter.sourceviewer.getUndoManager().redo();
	}
	
	@Override
	public boolean isFindEnabled() {
		return true;
	}

	// in gtk, we need this flag to let one focus lost event pass. See
	// focusLost() for details.
	private boolean ignoreNextFocusLost = false;
	private CompletionProposalAdapter completionProposalAdapter;

	/*
	 * In gtk, the focus lost event is fired _after_ the CR event, so we need to
	 * remember the state when the proposal popup window is open.
	 */
	@Override
	protected void focusLost() {
		if (SWT.getPlatform().equals("gtk")) {
			if (ignoreNextFocusLost) {
				ignoreNextFocusLost = false;
				return;
			}

			if (completionProposalAdapter.isProposalPopupOpen()) {
				ignoreNextFocusLost = true;
				return;
			}
		}

		if (!completionProposalAdapter.isProposalPopupOpen())
			super.focusLost();
	}

	@Override
	public void dispose() {
		xtextAdapter.dispose();
		super.dispose();
	}

	/*
	 * This is damn important! If we don't return false here, the
	 * ColumnEditorViewer calls applyEditorValue on FocusLostEvents!
	 */
	@Override
	protected boolean dependsOnExternalFocusListener() {
		return false;
	}

	public List<Issue> getXtextValidationIssues() {
		return xtextAdapter.getXtextValidationIssues();
	}

	public IParseResult getXtextParseResult() {
		return xtextAdapter.getXtextParseResult();
	}

	public void setVisibleRegion(int start, int length) {
		xtextAdapter.setVisibleRegion(start, length);
	}

}
