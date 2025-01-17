/*******************************************************************************
 * Copyright (c) 2012 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Guillaume Hillairet - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.emfjson.junit.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.emfjson.junit.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipselabs.org/emfjson/junit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.emfjson.junit.model.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emfjson.junit.model.impl.UserImpl
	 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BIRTH_DATE = 2;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SEX = 3;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FRIENDS = 4;

	/**
	 * The feature id for the '<em><b>Unique Friend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__UNIQUE_FRIEND = 5;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ADDRESS = 6;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emfjson.junit.model.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emfjson.junit.model.impl.AddressImpl
	 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Add Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ADD_ID = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 1;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__NUMBER = 3;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emfjson.junit.model.impl.ETypesImpl <em>ETypes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emfjson.junit.model.impl.ETypesImpl
	 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getETypes()
	 * @generated
	 */
	int ETYPES = 2;

	/**
	 * The feature id for the '<em><b>EString</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__ESTRING = 0;

	/**
	 * The feature id for the '<em><b>EStrings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__ESTRINGS = 1;

	/**
	 * The feature id for the '<em><b>EBoolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__EBOOLEAN = 2;

	/**
	 * The feature id for the '<em><b>EBooleans</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__EBOOLEANS = 3;

	/**
	 * The feature id for the '<em><b>EInt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__EINT = 4;

	/**
	 * The feature id for the '<em><b>EInts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__EINTS = 5;

	/**
	 * The feature id for the '<em><b>Double Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__DOUBLE_VALUE = 6;

	/**
	 * The feature id for the '<em><b>EDouble</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__EDOUBLE = 7;

	/**
	 * The feature id for the '<em><b>EDoubles</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__EDOUBLES = 8;

	/**
	 * The feature id for the '<em><b>EBig Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__EBIG_DECIMAL = 9;

	/**
	 * The feature id for the '<em><b>EBig Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__EBIG_INTEGER = 10;

	/**
	 * The feature id for the '<em><b>EByte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__EBYTE = 11;

	/**
	 * The feature id for the '<em><b>EByte Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__EBYTE_ARRAY = 12;

	/**
	 * The feature id for the '<em><b>EChar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__ECHAR = 13;

	/**
	 * The feature id for the '<em><b>EDate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__EDATE = 14;

	/**
	 * The feature id for the '<em><b>EFloat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__EFLOAT = 15;

	/**
	 * The feature id for the '<em><b>ELong</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__ELONG = 16;

	/**
	 * The feature id for the '<em><b>EShort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__ESHORT = 17;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES__URIS = 18;

	/**
	 * The number of structural features of the '<em>ETypes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPES_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emfjson.junit.model.impl.PrimaryObjectImpl <em>Primary Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emfjson.junit.model.impl.PrimaryObjectImpl
	 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getPrimaryObject()
	 * @generated
	 */
	int PRIMARY_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__ID_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Unsettable Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__UNSETTABLE_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Unsettable Attribute With Non Null Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__UNSETTABLE_ATTRIBUTE_WITH_NON_NULL_DEFAULT = 3;

	/**
	 * The feature id for the '<em><b>Unsettable Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__UNSETTABLE_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Containment Reference Same Collectioin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__CONTAINMENT_REFERENCE_SAME_COLLECTIOIN = 5;

	/**
	 * The feature id for the '<em><b>Single Non Containment Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__SINGLE_NON_CONTAINMENT_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Multiple Non Containment Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__MULTIPLE_NON_CONTAINMENT_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Single Containment Reference No Proxies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__SINGLE_CONTAINMENT_REFERENCE_NO_PROXIES = 8;

	/**
	 * The feature id for the '<em><b>Multiple Containment Reference No Proxies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__MULTIPLE_CONTAINMENT_REFERENCE_NO_PROXIES = 9;

	/**
	 * The feature id for the '<em><b>Single Containment Reference Proxies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__SINGLE_CONTAINMENT_REFERENCE_PROXIES = 10;

	/**
	 * The feature id for the '<em><b>Multiple Containment Reference Proxies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__MULTIPLE_CONTAINMENT_REFERENCE_PROXIES = 11;

	/**
	 * The feature id for the '<em><b>Single Non Containment Reference No Proxies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__SINGLE_NON_CONTAINMENT_REFERENCE_NO_PROXIES = 12;

	/**
	 * The feature id for the '<em><b>Feature Map Reference Type1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__FEATURE_MAP_REFERENCE_TYPE1 = 13;

	/**
	 * The feature id for the '<em><b>Feature Map Reference Type2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__FEATURE_MAP_REFERENCE_TYPE2 = 14;

	/**
	 * The feature id for the '<em><b>Feature Map Reference Collection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__FEATURE_MAP_REFERENCE_COLLECTION = 15;

	/**
	 * The feature id for the '<em><b>Feature Map Attribute Type1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__FEATURE_MAP_ATTRIBUTE_TYPE1 = 16;

	/**
	 * The feature id for the '<em><b>Feature Map Attribute Type2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__FEATURE_MAP_ATTRIBUTE_TYPE2 = 17;

	/**
	 * The feature id for the '<em><b>Feature Map Attribute Collection</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT__FEATURE_MAP_ATTRIBUTE_COLLECTION = 18;

	/**
	 * The number of structural features of the '<em>Primary Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OBJECT_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emfjson.junit.model.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emfjson.junit.model.impl.ContainerImpl
	 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emfjson.junit.model.impl.TargetObjectImpl <em>Target Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emfjson.junit.model.impl.TargetObjectImpl
	 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getTargetObject()
	 * @generated
	 */
	int TARGET_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Single Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OBJECT__SINGLE_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Array Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OBJECT__ARRAY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Target Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emfjson.junit.model.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emfjson.junit.model.impl.AbstractTypeImpl
	 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getAbstractType()
	 * @generated
	 */
	int ABSTRACT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE__REF_PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emfjson.junit.model.impl.ConcreteTypeOneImpl <em>Concrete Type One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emfjson.junit.model.impl.ConcreteTypeOneImpl
	 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getConcreteTypeOne()
	 * @generated
	 */
	int CONCRETE_TYPE_ONE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE_ONE__NAME = ABSTRACT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Ref Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE_ONE__REF_PROPERTY = ABSTRACT_TYPE__REF_PROPERTY;

	/**
	 * The feature id for the '<em><b>Prop Type One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE_ONE__PROP_TYPE_ONE = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Type One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE_ONE_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emfjson.junit.model.impl.ConcreteTypeTwoImpl <em>Concrete Type Two</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emfjson.junit.model.impl.ConcreteTypeTwoImpl
	 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getConcreteTypeTwo()
	 * @generated
	 */
	int CONCRETE_TYPE_TWO = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE_TWO__NAME = ABSTRACT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Ref Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE_TWO__REF_PROPERTY = ABSTRACT_TYPE__REF_PROPERTY;

	/**
	 * The feature id for the '<em><b>Prop Type Two</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE_TWO__PROP_TYPE_TWO = ABSTRACT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concrete Type Two</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_TYPE_TWO_FEATURE_COUNT = ABSTRACT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emfjson.junit.model.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emfjson.junit.model.impl.NodeImpl
	 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Many Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MANY_REF = 3;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILD = 4;

	/**
	 * The feature id for the '<em><b>Unique Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__UNIQUE_CHILD = 5;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emfjson.junit.model.impl.ObjectWithMapImpl <em>Object With Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emfjson.junit.model.impl.ObjectWithMapImpl
	 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getObjectWithMap()
	 * @generated
	 */
	int OBJECT_WITH_MAP = 10;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WITH_MAP__DEPENDENCIES = 0;

	/**
	 * The number of structural features of the '<em>Object With Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_WITH_MAP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emfjson.junit.model.Sex <em>Sex</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emfjson.junit.model.Sex
	 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getSex()
	 * @generated
	 */
	int SEX = 11;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getURI()
	 * @generated
	 */
	int URI = 12;


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emfjson.junit.model.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.User#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.User#getUserId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.User#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.User#getBirthDate()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_BirthDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.User#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.User#getSex()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Sex();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.emfjson.junit.model.User#getFriends <em>Friends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Friends</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.User#getFriends()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Friends();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emfjson.junit.model.User#getUniqueFriend <em>Unique Friend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unique Friend</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.User#getUniqueFriend()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_UniqueFriend();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.emfjson.junit.model.User#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.User#getAddress()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Address();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emfjson.junit.model.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.Address#getAddId <em>Add Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Add Id</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Address#getAddId()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_AddId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.Address#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Address#getNumber()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Number();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emfjson.junit.model.ETypes <em>ETypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETypes</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes
	 * @generated
	 */
	EClass getETypes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEString <em>EString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EString</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEString()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EString();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEStrings <em>EStrings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EStrings</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEStrings()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EStrings();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#isEBoolean <em>EBoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EBoolean</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#isEBoolean()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EBoolean();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEBooleans <em>EBooleans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EBooleans</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEBooleans()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EBooleans();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEInt <em>EInt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EInt</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEInt()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EInt();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEInts <em>EInts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EInts</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEInts()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EInts();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#getDoubleValue <em>Double Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double Value</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getDoubleValue()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_DoubleValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEDouble <em>EDouble</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EDouble</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEDouble()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EDouble();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEDoubles <em>EDoubles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EDoubles</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEDoubles()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EDoubles();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEBigDecimal <em>EBig Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EBig Decimal</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEBigDecimal()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EBigDecimal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEBigInteger <em>EBig Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EBig Integer</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEBigInteger()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EBigInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEByte <em>EByte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EByte</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEByte()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EByte();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEByteArray <em>EByte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EByte Array</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEByteArray()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EByteArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEChar <em>EChar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EChar</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEChar()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EChar();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEDate <em>EDate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EDate</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEDate()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEFloat <em>EFloat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EFloat</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEFloat()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EFloat();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#getELong <em>ELong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ELong</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getELong()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_ELong();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ETypes#getEShort <em>EShort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EShort</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getEShort()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_EShort();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipselabs.emfjson.junit.model.ETypes#getUris <em>Uris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uris</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ETypes#getUris()
	 * @see #getETypes()
	 * @generated
	 */
	EAttribute getETypes_Uris();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject <em>Primary Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Object</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject
	 * @generated
	 */
	EClass getPrimaryObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getName()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EAttribute getPrimaryObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getIdAttribute <em>Id Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Attribute</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getIdAttribute()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EAttribute getPrimaryObject_IdAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getUnsettableAttribute <em>Unsettable Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsettable Attribute</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getUnsettableAttribute()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EAttribute getPrimaryObject_UnsettableAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getUnsettableAttributeWithNonNullDefault <em>Unsettable Attribute With Non Null Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsettable Attribute With Non Null Default</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getUnsettableAttributeWithNonNullDefault()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EAttribute getPrimaryObject_UnsettableAttributeWithNonNullDefault();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getUnsettableReference <em>Unsettable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unsettable Reference</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getUnsettableReference()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EReference getPrimaryObject_UnsettableReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getContainmentReferenceSameCollectioin <em>Containment Reference Same Collectioin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Containment Reference Same Collectioin</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getContainmentReferenceSameCollectioin()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EReference getPrimaryObject_ContainmentReferenceSameCollectioin();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getSingleNonContainmentReference <em>Single Non Containment Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single Non Containment Reference</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getSingleNonContainmentReference()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EReference getPrimaryObject_SingleNonContainmentReference();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getMultipleNonContainmentReference <em>Multiple Non Containment Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Multiple Non Containment Reference</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getMultipleNonContainmentReference()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EReference getPrimaryObject_MultipleNonContainmentReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getSingleContainmentReferenceNoProxies <em>Single Containment Reference No Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Containment Reference No Proxies</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getSingleContainmentReferenceNoProxies()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EReference getPrimaryObject_SingleContainmentReferenceNoProxies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getMultipleContainmentReferenceNoProxies <em>Multiple Containment Reference No Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multiple Containment Reference No Proxies</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getMultipleContainmentReferenceNoProxies()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EReference getPrimaryObject_MultipleContainmentReferenceNoProxies();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getSingleContainmentReferenceProxies <em>Single Containment Reference Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Containment Reference Proxies</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getSingleContainmentReferenceProxies()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EReference getPrimaryObject_SingleContainmentReferenceProxies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getMultipleContainmentReferenceProxies <em>Multiple Containment Reference Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multiple Containment Reference Proxies</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getMultipleContainmentReferenceProxies()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EReference getPrimaryObject_MultipleContainmentReferenceProxies();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getSingleNonContainmentReferenceNoProxies <em>Single Non Containment Reference No Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single Non Containment Reference No Proxies</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getSingleNonContainmentReferenceNoProxies()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EReference getPrimaryObject_SingleNonContainmentReferenceNoProxies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getFeatureMapReferenceType1 <em>Feature Map Reference Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Map Reference Type1</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getFeatureMapReferenceType1()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EReference getPrimaryObject_FeatureMapReferenceType1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getFeatureMapReferenceType2 <em>Feature Map Reference Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Map Reference Type2</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getFeatureMapReferenceType2()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EReference getPrimaryObject_FeatureMapReferenceType2();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getFeatureMapReferenceCollection <em>Feature Map Reference Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Map Reference Collection</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getFeatureMapReferenceCollection()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EAttribute getPrimaryObject_FeatureMapReferenceCollection();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getFeatureMapAttributeType1 <em>Feature Map Attribute Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Map Attribute Type1</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getFeatureMapAttributeType1()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EAttribute getPrimaryObject_FeatureMapAttributeType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getFeatureMapAttributeType2 <em>Feature Map Attribute Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Map Attribute Type2</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getFeatureMapAttributeType2()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EAttribute getPrimaryObject_FeatureMapAttributeType2();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipselabs.emfjson.junit.model.PrimaryObject#getFeatureMapAttributeCollection <em>Feature Map Attribute Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Map Attribute Collection</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.PrimaryObject#getFeatureMapAttributeCollection()
	 * @see #getPrimaryObject()
	 * @generated
	 */
	EAttribute getPrimaryObject_FeatureMapAttributeCollection();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emfjson.junit.model.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emfjson.junit.model.Container#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Container#getElements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emfjson.junit.model.TargetObject <em>Target Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Object</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.TargetObject
	 * @generated
	 */
	EClass getTargetObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.TargetObject#getSingleAttribute <em>Single Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Attribute</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.TargetObject#getSingleAttribute()
	 * @see #getTargetObject()
	 * @generated
	 */
	EAttribute getTargetObject_SingleAttribute();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipselabs.emfjson.junit.model.TargetObject#getArrayAttribute <em>Array Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Array Attribute</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.TargetObject#getArrayAttribute()
	 * @see #getTargetObject()
	 * @generated
	 */
	EAttribute getTargetObject_ArrayAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emfjson.junit.model.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.AbstractType
	 * @generated
	 */
	EClass getAbstractType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.AbstractType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.AbstractType#getName()
	 * @see #getAbstractType()
	 * @generated
	 */
	EAttribute getAbstractType_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.emfjson.junit.model.AbstractType#getRefProperty <em>Ref Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref Property</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.AbstractType#getRefProperty()
	 * @see #getAbstractType()
	 * @generated
	 */
	EReference getAbstractType_RefProperty();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emfjson.junit.model.ConcreteTypeOne <em>Concrete Type One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Type One</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ConcreteTypeOne
	 * @generated
	 */
	EClass getConcreteTypeOne();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ConcreteTypeOne#getPropTypeOne <em>Prop Type One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prop Type One</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ConcreteTypeOne#getPropTypeOne()
	 * @see #getConcreteTypeOne()
	 * @generated
	 */
	EAttribute getConcreteTypeOne_PropTypeOne();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emfjson.junit.model.ConcreteTypeTwo <em>Concrete Type Two</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Type Two</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ConcreteTypeTwo
	 * @generated
	 */
	EClass getConcreteTypeTwo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.ConcreteTypeTwo#getPropTypeTwo <em>Prop Type Two</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prop Type Two</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ConcreteTypeTwo#getPropTypeTwo()
	 * @see #getConcreteTypeTwo()
	 * @generated
	 */
	EAttribute getConcreteTypeTwo_PropTypeTwo();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emfjson.junit.model.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emfjson.junit.model.Node#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Node#getLabel()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Label();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emfjson.junit.model.Node#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Node#getTarget()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Target();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emfjson.junit.model.Node#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Node#getSource()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Source();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipselabs.emfjson.junit.model.Node#getManyRef <em>Many Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Many Ref</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Node#getManyRef()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ManyRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emfjson.junit.model.Node#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Node#getChild()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Child();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipselabs.emfjson.junit.model.Node#getUniqueChild <em>Unique Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unique Child</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Node#getUniqueChild()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_UniqueChild();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emfjson.junit.model.ObjectWithMap <em>Object With Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object With Map</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ObjectWithMap
	 * @generated
	 */
	EClass getObjectWithMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipselabs.emfjson.junit.model.ObjectWithMap#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Dependencies</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.ObjectWithMap#getDependencies()
	 * @see #getObjectWithMap()
	 * @generated
	 */
	EReference getObjectWithMap_Dependencies();

	/**
	 * Returns the meta object for enum '{@link org.eclipselabs.emfjson.junit.model.Sex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sex</em>'.
	 * @see org.eclipselabs.emfjson.junit.model.Sex
	 * @generated
	 */
	EEnum getSex();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipselabs.emfjson.junit.model.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emfjson.junit.model.impl.UserImpl
		 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_ID = eINSTANCE.getUser_UserId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__BIRTH_DATE = eINSTANCE.getUser_BirthDate();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__SEX = eINSTANCE.getUser_Sex();

		/**
		 * The meta object literal for the '<em><b>Friends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__FRIENDS = eINSTANCE.getUser_Friends();

		/**
		 * The meta object literal for the '<em><b>Unique Friend</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__UNIQUE_FRIEND = eINSTANCE.getUser_UniqueFriend();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ADDRESS = eINSTANCE.getUser_Address();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emfjson.junit.model.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emfjson.junit.model.impl.AddressImpl
		 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Add Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ADD_ID = eINSTANCE.getAddress_AddId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__NUMBER = eINSTANCE.getAddress_Number();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emfjson.junit.model.impl.ETypesImpl <em>ETypes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emfjson.junit.model.impl.ETypesImpl
		 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getETypes()
		 * @generated
		 */
		EClass ETYPES = eINSTANCE.getETypes();

		/**
		 * The meta object literal for the '<em><b>EString</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__ESTRING = eINSTANCE.getETypes_EString();

		/**
		 * The meta object literal for the '<em><b>EStrings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__ESTRINGS = eINSTANCE.getETypes_EStrings();

		/**
		 * The meta object literal for the '<em><b>EBoolean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__EBOOLEAN = eINSTANCE.getETypes_EBoolean();

		/**
		 * The meta object literal for the '<em><b>EBooleans</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__EBOOLEANS = eINSTANCE.getETypes_EBooleans();

		/**
		 * The meta object literal for the '<em><b>EInt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__EINT = eINSTANCE.getETypes_EInt();

		/**
		 * The meta object literal for the '<em><b>EInts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__EINTS = eINSTANCE.getETypes_EInts();

		/**
		 * The meta object literal for the '<em><b>Double Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__DOUBLE_VALUE = eINSTANCE.getETypes_DoubleValue();

		/**
		 * The meta object literal for the '<em><b>EDouble</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__EDOUBLE = eINSTANCE.getETypes_EDouble();

		/**
		 * The meta object literal for the '<em><b>EDoubles</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__EDOUBLES = eINSTANCE.getETypes_EDoubles();

		/**
		 * The meta object literal for the '<em><b>EBig Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__EBIG_DECIMAL = eINSTANCE.getETypes_EBigDecimal();

		/**
		 * The meta object literal for the '<em><b>EBig Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__EBIG_INTEGER = eINSTANCE.getETypes_EBigInteger();

		/**
		 * The meta object literal for the '<em><b>EByte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__EBYTE = eINSTANCE.getETypes_EByte();

		/**
		 * The meta object literal for the '<em><b>EByte Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__EBYTE_ARRAY = eINSTANCE.getETypes_EByteArray();

		/**
		 * The meta object literal for the '<em><b>EChar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__ECHAR = eINSTANCE.getETypes_EChar();

		/**
		 * The meta object literal for the '<em><b>EDate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__EDATE = eINSTANCE.getETypes_EDate();

		/**
		 * The meta object literal for the '<em><b>EFloat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__EFLOAT = eINSTANCE.getETypes_EFloat();

		/**
		 * The meta object literal for the '<em><b>ELong</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__ELONG = eINSTANCE.getETypes_ELong();

		/**
		 * The meta object literal for the '<em><b>EShort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__ESHORT = eINSTANCE.getETypes_EShort();

		/**
		 * The meta object literal for the '<em><b>Uris</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPES__URIS = eINSTANCE.getETypes_Uris();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emfjson.junit.model.impl.PrimaryObjectImpl <em>Primary Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emfjson.junit.model.impl.PrimaryObjectImpl
		 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getPrimaryObject()
		 * @generated
		 */
		EClass PRIMARY_OBJECT = eINSTANCE.getPrimaryObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_OBJECT__NAME = eINSTANCE.getPrimaryObject_Name();

		/**
		 * The meta object literal for the '<em><b>Id Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_OBJECT__ID_ATTRIBUTE = eINSTANCE.getPrimaryObject_IdAttribute();

		/**
		 * The meta object literal for the '<em><b>Unsettable Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_OBJECT__UNSETTABLE_ATTRIBUTE = eINSTANCE.getPrimaryObject_UnsettableAttribute();

		/**
		 * The meta object literal for the '<em><b>Unsettable Attribute With Non Null Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_OBJECT__UNSETTABLE_ATTRIBUTE_WITH_NON_NULL_DEFAULT = eINSTANCE.getPrimaryObject_UnsettableAttributeWithNonNullDefault();

		/**
		 * The meta object literal for the '<em><b>Unsettable Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_OBJECT__UNSETTABLE_REFERENCE = eINSTANCE.getPrimaryObject_UnsettableReference();

		/**
		 * The meta object literal for the '<em><b>Containment Reference Same Collectioin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_OBJECT__CONTAINMENT_REFERENCE_SAME_COLLECTIOIN = eINSTANCE.getPrimaryObject_ContainmentReferenceSameCollectioin();

		/**
		 * The meta object literal for the '<em><b>Single Non Containment Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_OBJECT__SINGLE_NON_CONTAINMENT_REFERENCE = eINSTANCE.getPrimaryObject_SingleNonContainmentReference();

		/**
		 * The meta object literal for the '<em><b>Multiple Non Containment Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_OBJECT__MULTIPLE_NON_CONTAINMENT_REFERENCE = eINSTANCE.getPrimaryObject_MultipleNonContainmentReference();

		/**
		 * The meta object literal for the '<em><b>Single Containment Reference No Proxies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_OBJECT__SINGLE_CONTAINMENT_REFERENCE_NO_PROXIES = eINSTANCE.getPrimaryObject_SingleContainmentReferenceNoProxies();

		/**
		 * The meta object literal for the '<em><b>Multiple Containment Reference No Proxies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_OBJECT__MULTIPLE_CONTAINMENT_REFERENCE_NO_PROXIES = eINSTANCE.getPrimaryObject_MultipleContainmentReferenceNoProxies();

		/**
		 * The meta object literal for the '<em><b>Single Containment Reference Proxies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_OBJECT__SINGLE_CONTAINMENT_REFERENCE_PROXIES = eINSTANCE.getPrimaryObject_SingleContainmentReferenceProxies();

		/**
		 * The meta object literal for the '<em><b>Multiple Containment Reference Proxies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_OBJECT__MULTIPLE_CONTAINMENT_REFERENCE_PROXIES = eINSTANCE.getPrimaryObject_MultipleContainmentReferenceProxies();

		/**
		 * The meta object literal for the '<em><b>Single Non Containment Reference No Proxies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_OBJECT__SINGLE_NON_CONTAINMENT_REFERENCE_NO_PROXIES = eINSTANCE.getPrimaryObject_SingleNonContainmentReferenceNoProxies();

		/**
		 * The meta object literal for the '<em><b>Feature Map Reference Type1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_OBJECT__FEATURE_MAP_REFERENCE_TYPE1 = eINSTANCE.getPrimaryObject_FeatureMapReferenceType1();

		/**
		 * The meta object literal for the '<em><b>Feature Map Reference Type2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_OBJECT__FEATURE_MAP_REFERENCE_TYPE2 = eINSTANCE.getPrimaryObject_FeatureMapReferenceType2();

		/**
		 * The meta object literal for the '<em><b>Feature Map Reference Collection</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_OBJECT__FEATURE_MAP_REFERENCE_COLLECTION = eINSTANCE.getPrimaryObject_FeatureMapReferenceCollection();

		/**
		 * The meta object literal for the '<em><b>Feature Map Attribute Type1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_OBJECT__FEATURE_MAP_ATTRIBUTE_TYPE1 = eINSTANCE.getPrimaryObject_FeatureMapAttributeType1();

		/**
		 * The meta object literal for the '<em><b>Feature Map Attribute Type2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_OBJECT__FEATURE_MAP_ATTRIBUTE_TYPE2 = eINSTANCE.getPrimaryObject_FeatureMapAttributeType2();

		/**
		 * The meta object literal for the '<em><b>Feature Map Attribute Collection</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMARY_OBJECT__FEATURE_MAP_ATTRIBUTE_COLLECTION = eINSTANCE.getPrimaryObject_FeatureMapAttributeCollection();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emfjson.junit.model.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emfjson.junit.model.impl.ContainerImpl
		 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ELEMENTS = eINSTANCE.getContainer_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emfjson.junit.model.impl.TargetObjectImpl <em>Target Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emfjson.junit.model.impl.TargetObjectImpl
		 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getTargetObject()
		 * @generated
		 */
		EClass TARGET_OBJECT = eINSTANCE.getTargetObject();

		/**
		 * The meta object literal for the '<em><b>Single Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_OBJECT__SINGLE_ATTRIBUTE = eINSTANCE.getTargetObject_SingleAttribute();

		/**
		 * The meta object literal for the '<em><b>Array Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_OBJECT__ARRAY_ATTRIBUTE = eINSTANCE.getTargetObject_ArrayAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emfjson.junit.model.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emfjson.junit.model.impl.AbstractTypeImpl
		 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getAbstractType()
		 * @generated
		 */
		EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TYPE__NAME = eINSTANCE.getAbstractType_Name();

		/**
		 * The meta object literal for the '<em><b>Ref Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE__REF_PROPERTY = eINSTANCE.getAbstractType_RefProperty();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emfjson.junit.model.impl.ConcreteTypeOneImpl <em>Concrete Type One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emfjson.junit.model.impl.ConcreteTypeOneImpl
		 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getConcreteTypeOne()
		 * @generated
		 */
		EClass CONCRETE_TYPE_ONE = eINSTANCE.getConcreteTypeOne();

		/**
		 * The meta object literal for the '<em><b>Prop Type One</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_TYPE_ONE__PROP_TYPE_ONE = eINSTANCE.getConcreteTypeOne_PropTypeOne();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emfjson.junit.model.impl.ConcreteTypeTwoImpl <em>Concrete Type Two</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emfjson.junit.model.impl.ConcreteTypeTwoImpl
		 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getConcreteTypeTwo()
		 * @generated
		 */
		EClass CONCRETE_TYPE_TWO = eINSTANCE.getConcreteTypeTwo();

		/**
		 * The meta object literal for the '<em><b>Prop Type Two</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_TYPE_TWO__PROP_TYPE_TWO = eINSTANCE.getConcreteTypeTwo_PropTypeTwo();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emfjson.junit.model.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emfjson.junit.model.impl.NodeImpl
		 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__LABEL = eINSTANCE.getNode_Label();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TARGET = eINSTANCE.getNode_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SOURCE = eINSTANCE.getNode_Source();

		/**
		 * The meta object literal for the '<em><b>Many Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__MANY_REF = eINSTANCE.getNode_ManyRef();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILD = eINSTANCE.getNode_Child();

		/**
		 * The meta object literal for the '<em><b>Unique Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__UNIQUE_CHILD = eINSTANCE.getNode_UniqueChild();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emfjson.junit.model.impl.ObjectWithMapImpl <em>Object With Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emfjson.junit.model.impl.ObjectWithMapImpl
		 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getObjectWithMap()
		 * @generated
		 */
		EClass OBJECT_WITH_MAP = eINSTANCE.getObjectWithMap();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_WITH_MAP__DEPENDENCIES = eINSTANCE.getObjectWithMap_Dependencies();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emfjson.junit.model.Sex <em>Sex</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emfjson.junit.model.Sex
		 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getSex()
		 * @generated
		 */
		EEnum SEX = eINSTANCE.getSex();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see org.eclipselabs.emfjson.junit.model.impl.ModelPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

	}

} //ModelPackage
