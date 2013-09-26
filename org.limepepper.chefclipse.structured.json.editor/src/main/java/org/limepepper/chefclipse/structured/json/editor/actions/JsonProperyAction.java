package org.limepepper.chefclipse.structured.json.editor.actions;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.limepepper.chefclipse.structured.json.editor.commands.ModifyXTextDocumentCommand;
import org.limepepper.chefclipse.structured.json.editor.editors.MultiPageStructuredJsonEditor;
import org.limepepper.chefclipse.structured.json.editor.editors.StructuredJsonEditorManager;

public abstract class JsonProperyAction extends CommandActionHandler implements ModifyXTextDocumentCommand {

	private MultiPageStructuredJsonEditor editor;

	public JsonProperyAction(EditingDomain domain, MultiPageStructuredJsonEditor editor, String label) {
		super(domain, label);
		this.editor = editor;
	}

	protected Collection<EObject> getXtextEObjectsOfKey(final EObject key) {
		Collection<EObject> eObjects = new ArrayList<EObject>();
		for (Resource r : domain.getResourceSet().getResources()) {
			eObjects.add(editor.getXtextDocument(r).readOnly(new IUnitOfWork<EObject, XtextResource>() {
				@Override
				public EObject exec(XtextResource state) {
					return StructuredJsonEditorManager.INSTANCE.getEObjectOfKey(key, state);
				}
			}));
		}
		return eObjects;
	}

	@Override
	public MultiPageStructuredJsonEditor getEditor() {
	    return editor;
	}

}