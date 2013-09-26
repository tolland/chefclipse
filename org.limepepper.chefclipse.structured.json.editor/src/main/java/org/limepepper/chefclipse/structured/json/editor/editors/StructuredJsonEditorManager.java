/**
 * 
 */

package org.limepepper.chefclipse.structured.json.editor.editors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections.IteratorUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.node.ArrayNode;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.limepepper.chefclipse.json.json.JsonFactory;
import org.limepepper.chefclipse.json.json.JsonObject;
import org.limepepper.chefclipse.json.json.JsonObjectValue;
import org.limepepper.chefclipse.json.json.Model;
import org.limepepper.chefclipse.json.json.Pair;
import org.limepepper.chefclipse.json.json.StringValue;
import org.limepepper.chefclipse.json.json.Value;

/**
 * Provides methods to perform operations that access or modify JSON files. 
 * 
 * It also provides methods to put and retrieve values from an specific {@link JsonNode}.
 * 
 * @author Sebastian Sampaoli
 */
public enum StructuredJsonEditorManager {

    INSTANCE;

    /**
     * Returns the value which has a JSON file for an specific JSON property.
     * It's highly recommended that the method {@link #createAllFieldsNode(Map)} is used
     * first, in order to create and have a suitable structure to add, remove, or get 
     * values from JSON files.
     * 
     * @param element an entry in the JsonNode structure. The key of such entry is the name of a JSON property
     * @param jsonFileName the name of the JSON file to fetch the value
     * @return the value for the given JSON property in the JSON file, otherwise it returns null
     */
    public JsonNode getValue(Entry<String, JsonNode> element, String jsonFileName) {
        JsonNode elementArray = element.getValue();
        for (Iterator<JsonNode> elements = elementArray.getElements(); elements.hasNext(); ) {
            JsonNode childElement = elements.next();
            Iterator<Entry<String, JsonNode>> childFields = childElement.getFields();
            Entry<String, JsonNode> childNode = childFields.next();
            if (childNode.getKey().equals(jsonFileName) && (childNode.getValue().isValueNode() || childNode.getValue().isArray())) {
                return childNode.getValue();
            }
        }
        return null;
    }

    /**
     * Returns whether the given field has children or not.
     * 
     * @param parentElement the field to check if contains children or not
     * @param nodesMap
     * @return true if the given parentElement contains children, false
     *         otherwise
     */
    @SuppressWarnings("unchecked")
    public boolean hasChildren(Entry<String, JsonNode> parentNodeEntry, Map<String, JsonNode> nodesMap) {
        JsonNode valueNode = parentNodeEntry.getValue();
        if (valueNode.isArray()) {
            ArrayNode childrenArray = (ArrayNode) valueNode;
            for (Iterator<JsonNode> children = childrenArray.getElements(); children.hasNext(); ) {
                JsonNode child = children.next();
                //below the field list is obtained, it must have only one element, we don't need to check that.
                List<Entry<String, JsonNode>> fieldList = IteratorUtils.toList(child.getFields());
                Entry<String, JsonNode> childEntry = fieldList.get(0);
                if (!nodesMap.containsKey(childEntry.getKey()) && childEntry.getValue().isArray() && ((ArrayNode)childEntry.getValue()).size() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

	public Model createSchemaModel(ResourceSet resSet) {
		final Resource schemaRes = new XMIResourceImpl();
		
		for (Resource res : resSet.getResources()) {
			mergeResource(schemaRes, res);
		}
		
		trimValues(schemaRes.getAllContents());
		
		if (schemaRes.getContents().size() > 0) {
			return (Model) schemaRes.getContents().get(0);
		}
		return JsonFactory.eINSTANCE.createModel();
	}

	public void trimValues(final TreeIterator<EObject> it) {
		List<EObject> toRemove = new ArrayList<EObject>();
		while (it.hasNext()) {
			EObject eObject = (EObject) it.next();
			if (isPrimitiveValue(eObject)) {
				toRemove.add(eObject);
			}
		}
		for (EObject eObject : toRemove) {
			EcoreUtil.remove(eObject);
		}
	}

	public void mergeResource(final Resource schemaRes, Resource res) {
		TreeIterator<EObject> it = res.getAllContents();
		while (it.hasNext()) {
			EObject eObject = (EObject) it.next();
			if (isPrimitiveValue(eObject)) {
				it.prune();
				continue;
			}
			EObject eObjectSchema = getEObjectOfKey(eObject, schemaRes);
			if (eObjectSchema == null) {
				EObject copy = EcoreUtil.copy(eObject);
				trimValues(copy.eAllContents());
				addToSchema(schemaRes, eObject, copy);
			}
		}
	}

	public void addToSchema(final Resource schemaRes, EObject eObject,
			EObject copy) {
		if (eObject.eContainer() != null) {
			EObject schemaContainer = getEObjectOfKey(eObject.eContainer(), schemaRes);
			if (schemaContainer == null) {
				throw new RuntimeException("This should never happen");
			}
			if (eObject.eContainmentFeature().isMany()) {
				@SuppressWarnings("unchecked")
				List<EObject> list = (List<EObject>) schemaContainer.eGet(eObject.eContainmentFeature());
				list.add(copy);
			} else {
				schemaContainer.eSet(eObject.eContainmentFeature(), copy);
			}
		} else {
			schemaRes.getContents().add(copy);
		}
	}

	public boolean isPrimitiveValue(EObject eObject) {
		return eObject instanceof Value && !(eObject instanceof JsonObjectValue);
	}
	
	public EObject getEObjectOfKey(EObject entryElement, Resource resource) {
		if (entryElement.eResource() == null) {
			throw new IllegalArgumentException("Object is not contained in a resource: "+entryElement);
		}
		String uriFragment = entryElement.eResource().getURIFragment(entryElement);
		EObject value = null;
		try {
			value = resource.getEObject(uriFragment);
		} catch (ClassCastException e) {
			// no EObject found for that key
		}
		return value;
	}
	
	public Collection<EObject> getEObjectsOfKey(EObject entry, List<Resource> resources) {
        List<EObject> values = new ArrayList<EObject>();
        for (Resource resource : resources) {
    		EObject value = getEObjectOfKey(entry, resource);
    		if (value != null) {
    			values.add(value);
    		}
        }
        return values;
    }

    public IResource getResourceFromUri(URI uri) {
        if (uri.isPlatformResource()) {
            String platformString = uri.toPlatformString(true);
            IResource resource = ResourcesPlugin.getWorkspace().getRoot()
                    .findMember(platformString);
            return resource;
        }
        return null;
    }
    
    public void addEmptyModelTo(final XtextResource res, IXtextDocument xtextDocument, final IFile jsonFile) {
		if (xtextDocument != null) {
			xtextDocument.modify(new IUnitOfWork.Void<XtextResource>() {
			    @Override
			    public void process(XtextResource state) throws Exception {
			    	Pair emptyIdElement = addEmptyModel(state);
			    	StringValue stringValue = JsonFactory.eINSTANCE.createStringValue();
			    	String dbItemName = jsonFile.getName();
		            int lastDot = dbItemName.lastIndexOf(".");
		            if (lastDot != -1) {
		                dbItemName = dbItemName.substring(0, lastDot);
		            }
			        stringValue.setValue(dbItemName);
			        emptyIdElement.setValue(stringValue);
			    }
			});
		}
	}
    
    private Pair addEmptyModel(Resource schemaRes) {
    	schemaRes.getContents().add(JsonFactory.eINSTANCE.createModel());
        EObject model = schemaRes.getContents().get(0);
        JsonObject createdJsonObject = JsonFactory.eINSTANCE.createJsonObject();
        ((Model) model).getObjects().add(createdJsonObject);
        Pair createPair = JsonFactory.eINSTANCE.createPair();
        createPair.setString("id");
        createdJsonObject.getPairs().add(createPair);
        return createPair;
	}
}
