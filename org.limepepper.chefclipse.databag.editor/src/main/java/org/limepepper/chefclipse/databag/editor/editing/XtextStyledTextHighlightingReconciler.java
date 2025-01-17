package org.limepepper.chefclipse.databag.editor.editing;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextInputListener;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AttributedPosition;
import org.eclipse.xtext.ui.editor.syntaxcoloring.HighlightingPresenter;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ITextAttributeProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.MergingHighlightedPositionAcceptor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;


/**
 * Modified copy of org.eclipse.xtext.ui.editor.syntaxcoloring.HighlightingReconciler
 */
class XtextStyledTextHighlightingReconciler implements
		ITextInputListener, IXtextModelListener, IHighlightedPositionAcceptor {

	@Inject(optional = true)
	private ISemanticHighlightingCalculator calculator;

	@Inject
	private ITextAttributeProvider attributeProvider;

	/** The Xtext editor this highlighting reconciler is installed on */
	private StyledTextXtextAdapter styledTextXtextAdapter;
	/** The source viewer this highlighting reconciler is installed on */
	private XtextSourceViewer sourceViewer;
	/** The highlighting presenter */
	private HighlightingPresenter presenter;

	/** Background job's added highlighted positions */
	private final List<AttributedPosition> addedPositions = new ArrayList<AttributedPosition>();
	/** Background job's removed highlighted positions */
	private List<AttributedPosition> removedPositions = new ArrayList<AttributedPosition>();
	/** Number of removed positions */
	private int removedPositionCount;

	/**
	 * Reconcile operation lock.
	 * 
	 * @since 3.2
	 */
	private final Object fReconcileLock = new Object();
	/**
	 * <code>true</code> if any thread is executing <code>reconcile</code>,
	 * <code>false</code> otherwise.
	 * 
	 * @since 3.2
	 */
	private boolean reconciling = false;

	/**
	 * Start reconciling positions.
	 */
	private void startReconcilingPositions() {
		presenter.addAllPositions(removedPositions);
		removedPositionCount = removedPositions.size();
	}

	/**
	 * Reconcile positions based on the AST subtrees
	 * 
	 * @param subtrees
	 *            the AST subtrees
	 */
	private void reconcilePositions(XtextResource resource) {
		// for (int i= 0, n= subtrees.length; i < n; i++)
		// subtrees[i].accept(fCollector);
		MergingHighlightedPositionAcceptor acceptor = new MergingHighlightedPositionAcceptor(
				calculator);
		acceptor.provideHighlightingFor(resource, this);
		// calculator.provideHighlightingFor(resource, this);
		List<AttributedPosition> oldPositions = removedPositions;
		List<AttributedPosition> newPositions = new ArrayList<AttributedPosition>(
				removedPositionCount);
		for (int i = 0, n = oldPositions.size(); i < n; i++) {
			AttributedPosition current = oldPositions.get(i);
			if (current != null)
				newPositions.add(current);
		}
		removedPositions = newPositions;
	}

	/**
	 * Add a position with the given range and highlighting if it does not exist
	 * already.
	 * 
	 * @param offset
	 *            The range offset
	 * @param length
	 *            The range length
	 * @param highlighting
	 *            The highlighting
	 */
	public void addPosition(int offset, int length, String... ids) {
		TextAttribute highlighting = ids.length == 1 ? attributeProvider
				.getAttribute(ids[0]) : attributeProvider
				.getMergedAttributes(ids);
		boolean isExisting = false;
		// TODO: use binary search
		for (int i = 0, n = removedPositions.size(); i < n; i++) {
			AttributedPosition position = removedPositions.get(i);
			if (position == null)
				continue;
			if (position.isEqual(offset, length, highlighting)) {
				isExisting = true;
				removedPositions.set(i, null);
				removedPositionCount--;
				break;
			}
		}

		if (!isExisting) {
			AttributedPosition position = presenter.createHighlightedPosition(
					offset, length, highlighting);
			addedPositions.add(position);
		}
	}

	/**
	 * Update the presentation.
	 * 
	 * @param textPresentation
	 *            the text presentation
	 * @param addedPositions
	 *            the added positions
	 * @param removedPositions
	 *            the removed positions
	 */
	private void updatePresentation(TextPresentation textPresentation,
			List<AttributedPosition> addedPositions,
			List<AttributedPosition> removedPositions) {
		Runnable runnable = presenter.createUpdateRunnable(textPresentation,
				addedPositions, removedPositions);
		if (runnable == null)
			return;

		Display display = Display.getDefault();
		display.asyncExec(runnable);
	}

	/**
	 * Stop reconciling positions.
	 */
	private void stopReconcilingPositions() {
		removedPositions.clear();
		removedPositionCount = 0;
		addedPositions.clear();
	}

	/**
	 * Install this reconciler on the given editor and presenter.
	 * 
	 * @param editor
	 *            the editor
	 * @param sourceViewer
	 *            the source viewer
	 * @param presenter
	 *            the highlighting presenter
	 */
	public void install(StyledTextXtextAdapter xtextStyledText, XtextSourceViewer sourceViewer,
			HighlightingPresenter presenter) {
		this.presenter = presenter;
		this.styledTextXtextAdapter = xtextStyledText;
		this.sourceViewer = sourceViewer;
		if (calculator != null) {
			if (styledTextXtextAdapter.getXtextDocument() != null)
				styledTextXtextAdapter.getXtextDocument().addModelListener(this);

			sourceViewer.addTextInputListener(this);
		}
		refresh();
	}

	/**
	 * Uninstall this reconciler from the editor
	 */
	public void uninstall() {
		if (presenter != null)
			presenter.setCanceled(true);

		if (styledTextXtextAdapter != null) {
			if (calculator != null) {
				if (styledTextXtextAdapter.getXtextDocument() != null)
					styledTextXtextAdapter.getXtextDocument().removeModelListener(this);
				sourceViewer.removeTextInputListener(this);
			}
			styledTextXtextAdapter = null;
		}

		sourceViewer = null;
		presenter = null;
	}

	/*
	 * @see
	 * org.eclipse.jface.text.ITextInputListener#inputDocumentAboutToBeChanged
	 * (org.eclipse.jface.text.IDocument, org.eclipse.jface.text.IDocument)
	 */
	public void inputDocumentAboutToBeChanged(IDocument oldInput,
			IDocument newInput) {
		if (oldInput != null)
			((IXtextDocument) oldInput).removeModelListener(this);
	}

	/*
	 * @see
	 * org.eclipse.jface.text.ITextInputListener#inputDocumentChanged(org.eclipse
	 * .jface.text.IDocument, org.eclipse.jface.text.IDocument)
	 */
	public void inputDocumentChanged(IDocument oldInput, IDocument newInput) {
		if (newInput != null) {
			refresh();
			((IXtextDocument) newInput).addModelListener(this);
		}
	}

	/**
	 * Refreshes the highlighting.
	 */
	public void refresh() {
		if (calculator != null) {
			styledTextXtextAdapter.getXtextDocument().readOnly(
					new IUnitOfWork.Void<XtextResource>() {
						@Override
						public void process(XtextResource state)
								throws Exception {
							modelChanged(state);
						}
					});
		} else {
			Display display = Display.getDefault();
			display.asyncExec(presenter.createSimpleUpdateRunnable());
		}
	}

	public void modelChanged(XtextResource resource) {
		// ensure at most one thread can be reconciling at any time
		synchronized (fReconcileLock) {
			if (reconciling)
				return;
			reconciling = true;
		}
		final HighlightingPresenter highlightingPresenter = presenter;
		try {
			if (highlightingPresenter == null)
				return;

			highlightingPresenter.setCanceled(false);

			if (highlightingPresenter.isCanceled())
				return;

			startReconcilingPositions();

			if (!highlightingPresenter.isCanceled()) {
				reconcilePositions(resource);
			}

			final TextPresentation[] textPresentation = new TextPresentation[1];
			if (!highlightingPresenter.isCanceled()) {
				textPresentation[0] = highlightingPresenter.createPresentation(
						addedPositions, removedPositions);
			}

			if (!highlightingPresenter.isCanceled())
				updatePresentation(textPresentation[0], addedPositions,
						removedPositions);

			stopReconcilingPositions();
		} finally {
			synchronized (fReconcileLock) {
				reconciling = false;
			}
		}
	}

	public void setCalculator(ISemanticHighlightingCalculator calculator) {
		this.calculator = calculator;
	}

	public ISemanticHighlightingCalculator getCalculator() {
		return calculator;
	}
}
