/**
 */
package org.limepepper.chefclipse.utility.impl;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.limepepper.chefclipse.utility.*;
import org.limepepper.chefclipse.utility.ChecksumFile;
import org.limepepper.chefclipse.utility.Config;
import org.limepepper.chefclipse.utility.DescribedObject;
import org.limepepper.chefclipse.utility.MaintainedObject;
import org.limepepper.chefclipse.utility.MapTestContainer;
import org.limepepper.chefclipse.utility.NameUrlMap;
import org.limepepper.chefclipse.utility.NameVersionMap;
import org.limepepper.chefclipse.utility.NamedObject;
import org.limepepper.chefclipse.utility.RubyFile;
import org.limepepper.chefclipse.utility.SandboxedObject;
import org.limepepper.chefclipse.utility.URLEntryTest;
import org.limepepper.chefclipse.utility.UtilityFactory;
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.limepepper.chefclipse.utility.VersionUrl;
import org.limepepper.chefclipse.utility.VersionedObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilityFactoryImpl extends EFactoryImpl implements UtilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UtilityFactory init() {
		try {
			UtilityFactory theUtilityFactory = (UtilityFactory)EPackage.Registry.INSTANCE.getEFactory("http://limepepper.org/v1/chefclipse/internal"); 
			if (theUtilityFactory != null) {
				return theUtilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UtilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UtilityPackage.VERSIONED_OBJECT: return createVersionedObject();
			case UtilityPackage.SANDBOXED_OBJECT: return createSandboxedObject();
			case UtilityPackage.RUBY_FILE: return createRubyFile();
			case UtilityPackage.NAMED_OBJECT: return createNamedObject();
			case UtilityPackage.DESCRIBED_OBJECT: return createDescribedObject();
			case UtilityPackage.CHECKSUM_FILE: return createChecksumFile();
			case UtilityPackage.MAINTAINED_OBJECT: return createMaintainedObject();
			case UtilityPackage.CONFIG: return createConfig();
			case UtilityPackage.NAME_URL_MAP: return createNameUrlMap();
			case UtilityPackage.MAP_TEST_CONTAINER: return createMapTestContainer();
			case UtilityPackage.ESTRING_TO_VERSION_URL_MAP: return (EObject)createEStringToVersionUrlMap();
			case UtilityPackage.VERSION_URL: return createVersionUrl();
			case UtilityPackage.URL_ENTRY_TEST: return createURLEntryTest();
			case UtilityPackage.NAME_VERSION_MAP: return createNameVersionMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UtilityPackage.URL:
				return createURLFromString(eDataType, initialValue);
			case UtilityPackage.FILE:
				return createFileFromString(eDataType, initialValue);
			case UtilityPackage.CHEF_TYPE:
				return createChef_typeFromString(eDataType, initialValue);
			case UtilityPackage.EMAIL:
				return createEmailFromString(eDataType, initialValue);
			case UtilityPackage.TEXT:
				return createTextFromString(eDataType, initialValue);
			case UtilityPackage.VERSION:
				return createVersionFromString(eDataType, initialValue);
			case UtilityPackage.NAME:
				return createNameFromString(eDataType, initialValue);
			case UtilityPackage.DESCRIPTION:
				return createDescriptionFromString(eDataType, initialValue);
			case UtilityPackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			case UtilityPackage.NAME_URL_DATA_TYPE:
				return createNameUrlDataTypeFromString(eDataType, initialValue);
			case UtilityPackage.MAP_TEST:
				return createMapTestFromString(eDataType, initialValue);
			case UtilityPackage.IRESOURCE:
				return createIResourceFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UtilityPackage.URL:
				return convertURLToString(eDataType, instanceValue);
			case UtilityPackage.FILE:
				return convertFileToString(eDataType, instanceValue);
			case UtilityPackage.CHEF_TYPE:
				return convertChef_typeToString(eDataType, instanceValue);
			case UtilityPackage.EMAIL:
				return convertEmailToString(eDataType, instanceValue);
			case UtilityPackage.TEXT:
				return convertTextToString(eDataType, instanceValue);
			case UtilityPackage.VERSION:
				return convertVersionToString(eDataType, instanceValue);
			case UtilityPackage.NAME:
				return convertNameToString(eDataType, instanceValue);
			case UtilityPackage.DESCRIPTION:
				return convertDescriptionToString(eDataType, instanceValue);
			case UtilityPackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			case UtilityPackage.NAME_URL_DATA_TYPE:
				return convertNameUrlDataTypeToString(eDataType, instanceValue);
			case UtilityPackage.MAP_TEST:
				return convertMapTestToString(eDataType, instanceValue);
			case UtilityPackage.IRESOURCE:
				return convertIResourceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedObject createVersionedObject() {
		VersionedObjectImpl versionedObject = new VersionedObjectImpl();
		return versionedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SandboxedObject createSandboxedObject() {
		SandboxedObjectImpl sandboxedObject = new SandboxedObjectImpl();
		return sandboxedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyFile createRubyFile() {
		RubyFileImpl rubyFile = new RubyFileImpl();
		return rubyFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedObject createNamedObject() {
		NamedObjectImpl namedObject = new NamedObjectImpl();
		return namedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescribedObject createDescribedObject() {
		DescribedObjectImpl describedObject = new DescribedObjectImpl();
		return describedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChecksumFile createChecksumFile() {
		ChecksumFileImpl checksumFile = new ChecksumFileImpl();
		return checksumFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintainedObject createMaintainedObject() {
		MaintainedObjectImpl maintainedObject = new MaintainedObjectImpl();
		return maintainedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config createConfig() {
		ConfigImpl config = new ConfigImpl();
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameUrlMap createNameUrlMap() {
		NameUrlMapImpl nameUrlMap = new NameUrlMapImpl();
		return nameUrlMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapTestContainer createMapTestContainer() {
		MapTestContainerImpl mapTestContainer = new MapTestContainerImpl();
		return mapTestContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, VersionUrl> createEStringToVersionUrlMap() {
		EStringToVersionUrlMapImpl eStringToVersionUrlMap = new EStringToVersionUrlMapImpl();
		return eStringToVersionUrlMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionUrl createVersionUrl() {
		VersionUrlImpl versionUrl = new VersionUrlImpl();
		return versionUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLEntryTest createURLEntryTest() {
		URLEntryTestImpl urlEntryTest = new URLEntryTestImpl();
		return urlEntryTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameVersionMap createNameVersionMap() {
		NameVersionMapImpl nameVersionMap = new NameVersionMapImpl();
		return nameVersionMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL createURLFromString(EDataType eDataType, String initialValue) {
		return (URL)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURLToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFileFromString(EDataType eDataType, String initialValue) {
		return (File)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createChef_typeFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChef_typeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEmailFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmailToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNameFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDescriptionFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDescriptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNameUrlDataTypeFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameUrlDataTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap createMapTestFromString(EDataType eDataType, String initialValue) {
		return (HashMap)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapTestToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IResource createIResourceFromString(EDataType eDataType, String initialValue) {
		return (IResource)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIResourceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilityPackage getUtilityPackage() {
		return (UtilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UtilityPackage getPackage() {
		return UtilityPackage.eINSTANCE;
	}

} //UtilityFactoryImpl
