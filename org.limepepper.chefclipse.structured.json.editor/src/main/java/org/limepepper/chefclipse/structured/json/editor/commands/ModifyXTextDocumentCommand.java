package org.limepepper.chefclipse.structured.json.editor.commands;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.structured.json.editor.editors.MultiPageStructuredJsonEditor;

public interface ModifyXTextDocumentCommand {

    EObject getAffectedEObject(Command command);

    MultiPageStructuredJsonEditor getEditor();
}
