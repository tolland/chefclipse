/*******************************************************************************
 * Copyright (c) 2011 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Guillaume Hillairet - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.emfjson.internal;

import static org.eclipselabs.emfjson.common.Constants.EJS_REF_KEYWORD;
import static org.eclipselabs.emfjson.common.Constants.EJS_TYPE_KEYWORD;
import static org.eclipselabs.emfjson.common.ModelUtil.getElementName;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipselabs.emfjson.EMFJs;
import org.eclipselabs.emfjson.common.ModelUtil;

/**
 * 
 * A JSON Writer for EMF Models.
 *
 */
public class JSONSave {
	
	protected final ObjectMapper mapper;
	protected JsonNode rootNode;
	protected boolean serializeTypes = true;
	protected boolean serializeRefTypes = true;
	protected boolean indent = true;
	protected Map<?, ?> options;
	
	public JSONSave(Map<?, ?> options) {
		this.options = options;
		configure();
		this.mapper = new ObjectMapper();
		this.mapper.configure(Feature.INDENT_OUTPUT, indent);
	}
	
	public ObjectMapper getDelegate() {
		return mapper;
	}
	
	public JsonNode genJson(Resource resource, Map<?, ?> options) {
		final JsonNode rootNode;
		
		if (resource.getContents().size() == 1) {
			EObject rootObject = resource.getContents().get(0);
			rootNode = writeEObject(rootObject, resource);
		} else {
			
			final Collection<JsonNode> nodes = new ArrayList<JsonNode>();
			rootNode = mapper.createArrayNode();

			for (EObject obj: resource.getContents()) {
				JsonNode node = writeEObject(obj, resource);
				if (node != null) {
					nodes.add(node);
				}
			}

			((ArrayNode)rootNode).addAll(nodes);
		}

		return rootNode;
	}

	public JsonNode genJson(Resource resource) {
		return genJson(resource, Collections.emptyMap());
	}
	
	protected JsonNode writeEObject(EObject object, Resource resource) {
		final ObjectNode node = mapper.createObjectNode();
		
		writeEObjectAttributes(object, node);
		writeEObjectReferences(object, node, resource);

		return node;
	}
	
	protected void writeEObjectAttributes(EObject object, ObjectNode node) {
		final URI eClassURI = EcoreUtil.getURI(object.eClass());
		if (serializeTypes) {
			node.put(EJS_TYPE_KEYWORD, eClassURI.toString());
		}
		
		for (EAttribute attribute: object.eClass().getEAllAttributes()) {

			if (object.eIsSet(attribute) && !attribute.isDerived() 
					&& !attribute.isTransient() && !attribute.isUnsettable()) {

				if (FeatureMapUtil.isFeatureMap(attribute)) {

					FeatureMap.Internal featureMap = (FeatureMap.Internal) object.eGet(attribute);
					Iterator<FeatureMap.Entry> iterator = featureMap.basicIterator();

					while (iterator.hasNext()) {

						FeatureMap.Entry entry = iterator.next();
						EStructuralFeature feature = entry.getEStructuralFeature();
						
						if (feature instanceof EAttribute) {
							setJsonValue(node, entry.getValue(), (EAttribute) feature);
						}
						
					}

				} else if (attribute.isMany()) {

					EList<?> rawValues = (EList<?>) object.eGet(attribute);

					if (!rawValues.isEmpty()) {
						ArrayNode arrayNode = mapper.createArrayNode();
						node.put(getElementName(attribute), arrayNode);

						for (Object val: rawValues) {
							setJsonValue(arrayNode, val, attribute);
						}
					}

				} else {

					final Object value = object.eGet(attribute);
					setJsonValue(node, value, attribute);

				}
			}
		}
	}

	private void setJsonValue(ObjectNode node, Object value, EAttribute attribute) {
		final EDataType dataType = attribute.getEAttributeType();

		if (value != null) {
			if (dataType.getName().contains("Int")) {
				int intValue = (Integer) value;
				node.put(getElementName(attribute), intValue);	
			} else if (dataType.getName().contains("Boolean")) {
				boolean booleanValue = (Boolean) value;
				node.put(getElementName(attribute), booleanValue);
			} else if (dataType.getName().contains("Double")) {
				double doubleValue = (Double) value;
				node.put(getElementName(attribute), doubleValue);
			} else if (value instanceof Date) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		        String dateValue = sdf.format(value);
		        node.put(getElementName(attribute), dateValue);
			} else {
				node.put(getElementName(attribute), value.toString());
			}
		}
	}

	private void setJsonValue(ArrayNode node, Object value, EAttribute attribute) {
		final EDataType dataType = attribute.getEAttributeType();

		if (value != null) {
			if (dataType.getName().contains("Int")) {
				int intValue = (Integer) value;
				node.add(intValue);	
			} else if (dataType.getName().contains("Boolean")) {
				boolean booleanValue = (Boolean) value;
				node.add(booleanValue);
			} else if (dataType.getName().contains("Double")) {
				double doubleValue = (Double) value;
				node.add(doubleValue);
			} else if (value instanceof Date) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		        String dateValue = sdf.format(value);
		        node.add(dateValue);
			} else {
				node.add(value.toString());
			}
		}
	}
	
	protected void writeEObjectReferences(EObject object, ObjectNode node, Resource resource) {
		
		for (EReference reference: object.eClass().getEAllReferences()) {
			
			if (!reference.isTransient() && object.eIsSet(reference)) {

				if (ModelUtil.isMapEntry(reference.getEType())) {
					
					writeMapEntry(object, reference, node);
					
				} else if (reference.isContainment()) {

					writeEObjectContainments(object, reference, node, resource);

				} else {

					if (reference.isMany()) {

						@SuppressWarnings("unchecked")
						EList<EObject> values = (EList<EObject>) object.eGet(reference);

						if (!values.isEmpty()) {

							final ArrayNode arrayNode = mapper.createArrayNode();
							node.put(getElementName(reference), arrayNode);

							for (EObject value: values) {
								ObjectNode nodeRef = mapper.createObjectNode();
								nodeRef.put(EJS_REF_KEYWORD, getReference(value, resource));
								if (serializeRefTypes) {
									nodeRef.put(EJS_TYPE_KEYWORD, getReference(value.eClass(), resource));
								}
								arrayNode.add(nodeRef);
							}
						}

					} else {
						EObject value = (EObject) object.eGet(reference);
						if (value != null) {
							ObjectNode nodeRef = mapper.createObjectNode();
							nodeRef.put(EJS_REF_KEYWORD, getReference(((EObject)value), resource));
							if (serializeRefTypes) {
								nodeRef.put(EJS_TYPE_KEYWORD, getReference(value.eClass(), resource));
							}
							node.put(reference.getName(), nodeRef);
						}
					}
				}
			}
		}
	}
	
	private void writeMapEntry(EObject object, EReference reference, ObjectNode node) {
		final ObjectNode nodeRef = mapper.createObjectNode();
		if (reference.isMany()) {
			@SuppressWarnings("unchecked")
			Collection<Map.Entry<String, String>> entries = (Collection<Entry<String, String>>) object.eGet(reference);
			for (Map.Entry<String, String> entry: entries) {
				nodeRef.put(entry.getKey(), entry.getValue());
			}
		} else {
			@SuppressWarnings("unchecked")
			Map.Entry<String, String> entry = (Entry<String, String>) object.eGet(reference);
			nodeRef.put(entry.getKey(), entry.getValue());
		}
		node.put(reference.getName(), nodeRef);
	}

	// if reference is containment, then objects are put in an ArrayNode
	protected void writeEObjectContainments(EObject object, EReference reference, ObjectNode node, Resource resource) {

		if (reference.isMany()) {

			@SuppressWarnings("unchecked")
			EList<EObject> values = (EList<EObject>) object.eGet(reference);

			if (!values.isEmpty()) {
				final ArrayNode arrayNode = mapper.createArrayNode();
				node.put(getElementName(reference), arrayNode);

				for (EObject value: values) {
					ObjectNode subNode = arrayNode.addObject();
					if (value.eIsProxy() || !value.eResource().equals(resource)) {
						subNode.put(EJS_REF_KEYWORD, getReference(value, resource));
					} else {
						writeEObjectAttributes(value, subNode);
						writeEObjectReferences(value, subNode, resource);	
					}
				}
			}
			
		} else {

			final EObject value = (EObject) object.eGet(reference);

			if (value != null) {
				final ObjectNode subNode = node.objectNode();
				
				if (value.eIsProxy() || !value.eResource().equals(resource)) {
					node.put(EJS_REF_KEYWORD, getReference(value, resource));
				} else {
					node.put(getElementName(reference), subNode);
					writeEObjectAttributes((EObject) value, subNode);
					writeEObjectReferences((EObject) value, subNode, resource);	
				}
			}
		}

	}

	public void write(OutputStream outStream, Resource resource) {
		JsonNode node = genJson(resource);
		try {
			getDelegate().writeValue(outStream, node);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeValue(OutputStream output, Object current) {
		try {
			getDelegate().writeValue(output, current);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void configure() {
		if (options.containsKey(EMFJs.OPTION_INDENT_OUTPUT)) {
			try {
				indent = (Boolean) options.get(EMFJs.OPTION_INDENT_OUTPUT);
			} catch (ClassCastException e) {
				e.printStackTrace();
			}
		}
		if (options.containsKey(EMFJs.OPTION_SERIALIZE_TYPE)) {
			try {
				serializeTypes = (Boolean) options.get(EMFJs.OPTION_SERIALIZE_TYPE);
			} catch (ClassCastException e) {
				e.printStackTrace();
			}
		}
		if (options.containsKey(EMFJs.OPTION_SERIALIZE_REF_TYPE)) {
			try {
				serializeRefTypes = (Boolean) options.get(EMFJs.OPTION_SERIALIZE_REF_TYPE);
			} catch (ClassCastException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected String getReference(EObject obj, Resource resource) {
		if (obj.eIsProxy()) {
			return ((InternalEObject)obj).eProxyURI().toString();
		}
		URI eObjectURI = EcoreUtil.getURI(obj);
		if (eObjectURI.trimFragment().equals(resource.getURI())) {
			return eObjectURI.fragment();
		}
		return eObjectURI.toString();
	}
}
