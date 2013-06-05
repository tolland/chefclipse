package org.limepepper.chefclipse.databag.editor.commands;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.databag.editor.editors.MultiPageDataBagEditor;

public interface ModifyXTextDocumentCommand {

    EObject getEObjectFromCommand(Command command);

    MultiPageDataBagEditor getEditor();
}
