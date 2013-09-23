/**
 * 
 */

package org.limepepper.chefclipse.structured.json.editor.actions;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.limepepper.chefclipse.json.json.JsonFactory;
import org.limepepper.chefclipse.json.json.JsonObject;
import org.limepepper.chefclipse.json.json.JsonObjectValue;
import org.limepepper.chefclipse.json.json.JsonPackage;
import org.limepepper.chefclipse.json.json.Pair;
import org.limepepper.chefclipse.json.json.StringValue;
import org.limepepper.chefclipse.structured.json.editor.commands.ModifyXTextDocumentCommand;
import org.limepepper.chefclipse.structured.json.editor.commands.XTextCompoundCommand;
import org.limepepper.chefclipse.structured.json.editor.editors.MultiPageStructuredJsonEditor;
import org.limepepper.chefclipse.structured.json.editor.editors.StructuredJsonEditorManager;

/**
 * Adds a new key to all resources. 
 * 
 * @author Sebastian Sampaoli
 */
public class AddJsonPropertyAction extends CommandActionHandler implements
        ModifyXTextDocumentCommand {

    private static final String ADD_PROPERTY_TOOLTIP = "Add a new property to the current editor";
    private static final String ADD_PROPERTY_ITEM_ACTION = "Add new JSON property";
    public static final String ID = ADD_PROPERTY_ITEM_ACTION;
    private MultiPageStructuredJsonEditor editor;

    public AddJsonPropertyAction(EditingDomain editingDomain,
            MultiPageStructuredJsonEditor multiPageStructuredJsonEditor) {
        super(editingDomain, ADD_PROPERTY_ITEM_ACTION);
        setId(ID);
        this.editor = multiPageStructuredJsonEditor;
        setToolTipText(ADD_PROPERTY_TOOLTIP);
        setText(ADD_PROPERTY_ITEM_ACTION);
        setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
                .getImageDescriptor(ISharedImages.IMG_OBJ_ADD));
    }

    @Override
    public Command createCommand(Collection<?> selection) {
        CompoundCommand compoundCommand = new XTextCompoundCommand(this);
        Object[] selectionArray = selection.toArray();
        if (selectionArray.length == 1) {
            final EObject entryElement = (EObject) selectionArray[0];
            
            Collection<EObject> eObjects = new ArrayList<EObject>();
            for (Resource r : domain.getResourceSet().getResources()) {
            	eObjects.add(editor.getXtextDocument(r).readOnly(new IUnitOfWork<EObject, XtextResource>() {
					@Override
					public EObject exec(XtextResource state)
							throws Exception {
						return StructuredJsonEditorManager.INSTANCE.getEObjectOfKey(entryElement, state);
					}
            	}));
            }
            
//            Collection<EObject> eObjects = StructuredJsonEditorManager.INSTANCE.getEObjectsOfKey(
//                    entryElement, domain.getResourceSet().getResources());
            for (EObject eObject : eObjects) {
                if (eObject != null) {
                    CompoundCommand addCompoundCommand = new CompoundCommand();
                    if (eObject instanceof Pair) {
                        Pair key = (Pair) eObject;
                        if (key.getValue() instanceof JsonObjectValue) {
                            JsonObjectValue jsonObjectValue = (JsonObjectValue) key.getValue();
                            JsonObject jsonObject = jsonObjectValue.getValue();
                            createAddCommand(addCompoundCommand, jsonObject);
                        } else if (key.getValue() == null || (key.getValue() instanceof StringValue && ((StringValue)key.getValue()).getValue().isEmpty())) {
                            JsonObject jsonObject = createJsonObjectParent(addCompoundCommand, key);
                            createAddCommand(addCompoundCommand, jsonObject);
                        }
                    } else if (eObject instanceof JsonObject) {
                        createAddCommand(addCompoundCommand, (JsonObject) eObject);
                    }
                    compoundCommand.append(addCompoundCommand);
                }
            }
            return compoundCommand;
        }
        return UnexecutableCommand.INSTANCE;
    }

    private JsonObject createJsonObjectParent(CompoundCommand addCompoundCommand, Pair key) {
        JsonObjectValue createdJsonObjectValue = JsonFactory.eINSTANCE
                .createJsonObjectValue();
        Command setJsonObjectValuecommand = SetCommand.create(domain, key,
                JsonPackage.eINSTANCE.getPair_Value(), createdJsonObjectValue);
        addCompoundCommand.append(setJsonObjectValuecommand);

        JsonObject jsonObject = JsonFactory.eINSTANCE.createJsonObject();
        Command setJsonObjectCommand = SetCommand.create(domain,
                createdJsonObjectValue,
                JsonPackage.eINSTANCE.getJsonObjectValue_Value(), jsonObject);
        addCompoundCommand.append(setJsonObjectCommand);
        
        return jsonObject;
   }

   private void createAddCommand(CompoundCommand addCompoundCommand,
            JsonObject jsonObject) {
        Pair createdPair = JsonFactory.eINSTANCE.createPair();
        createdPair.setString("new_key");
        Command command = AddCommand.create(domain, jsonObject,
                JsonPackage.eINSTANCE.getJsonObject_Pairs(), createdPair);
        addCompoundCommand.append(command);
        
        Command setNullValuecommand = createEmptyValueCommand(createdPair);
        addCompoundCommand.append(setNullValuecommand);
    }
   
    private Command createEmptyValueCommand(Pair key) {
        StringValue emptyValue = JsonFactory.eINSTANCE.createStringValue();
        emptyValue.setValue("");
        Command setEmptyValuecommand = SetCommand.create(domain, key,
                JsonPackage.eINSTANCE.getPair_Value(), emptyValue);
        return setEmptyValuecommand;
    }

    public void setActiveWorkbenchPart(IWorkbenchPart workbenchPart) {
        if (workbenchPart instanceof IEditingDomainProvider) {
            domain = ((IEditingDomainProvider) workbenchPart).getEditingDomain();
        }
    }

    @Override
    public EObject getAffectedEObject(Command command) {
        if (command instanceof CompoundCommand) {
            CompoundCommand compoundCommand = (CompoundCommand) command;
            Command modifyCommand = compoundCommand.getCommandList().get(0);
            if (modifyCommand instanceof AddCommand) {
                return ((AddCommand)modifyCommand).getOwner();
            }
            return ((SetCommand)modifyCommand).getOwner();
        }
        return null;
    }

    @Override
    public MultiPageStructuredJsonEditor getEditor() {
        return editor;
    }
}
