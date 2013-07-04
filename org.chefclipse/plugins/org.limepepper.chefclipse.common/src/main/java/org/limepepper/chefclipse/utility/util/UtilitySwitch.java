/**
 */
package org.limepepper.chefclipse.utility.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.limepepper.chefclipse.utility.*;
import org.limepepper.chefclipse.utility.ChecksumFile;
import org.limepepper.chefclipse.utility.Config;
import org.limepepper.chefclipse.utility.DescribedObject;
import org.limepepper.chefclipse.utility.MaintainedObject;
import org.limepepper.chefclipse.utility.MapTestContainer;
import org.limepepper.chefclipse.utility.NameUrlMap;
import org.limepepper.chefclipse.utility.NameVersionMap;
import org.limepepper.chefclipse.utility.NamedDescribedObject;
import org.limepepper.chefclipse.utility.NamedObject;
import org.limepepper.chefclipse.utility.RubyFile;
import org.limepepper.chefclipse.utility.SandboxedObject;
import org.limepepper.chefclipse.utility.URLEntryTest;
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.limepepper.chefclipse.utility.VersionUrl;
import org.limepepper.chefclipse.utility.VersionedObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.utility.UtilityPackage
 * @generated
 */
public class UtilitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UtilityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilitySwitch() {
		if (modelPackage == null) {
			modelPackage = UtilityPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case UtilityPackage.NAMED_DESCRIBED_OBJECT: {
			NamedDescribedObject namedDescribedObject = (NamedDescribedObject) theEObject;
			T result = caseNamedDescribedObject(namedDescribedObject);
			if (result == null)
				result = caseDescribedObject(namedDescribedObject);
			if (result == null)
				result = caseNamedObject(namedDescribedObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.VERSIONED_OBJECT: {
			VersionedObject versionedObject = (VersionedObject) theEObject;
			T result = caseVersionedObject(versionedObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.SANDBOXED_OBJECT: {
			SandboxedObject sandboxedObject = (SandboxedObject) theEObject;
			T result = caseSandboxedObject(sandboxedObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.RUBY_FILE: {
			RubyFile rubyFile = (RubyFile) theEObject;
			T result = caseRubyFile(rubyFile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.NAMED_OBJECT: {
			NamedObject namedObject = (NamedObject) theEObject;
			T result = caseNamedObject(namedObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.DESCRIBED_OBJECT: {
			DescribedObject describedObject = (DescribedObject) theEObject;
			T result = caseDescribedObject(describedObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.CHECKSUM_FILE: {
			ChecksumFile checksumFile = (ChecksumFile) theEObject;
			T result = caseChecksumFile(checksumFile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.MAINTAINED_OBJECT: {
			MaintainedObject maintainedObject = (MaintainedObject) theEObject;
			T result = caseMaintainedObject(maintainedObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.CONFIG: {
			Config config = (Config) theEObject;
			T result = caseConfig(config);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.NAME_URL_MAP: {
			NameUrlMap nameUrlMap = (NameUrlMap) theEObject;
			T result = caseNameUrlMap(nameUrlMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.MAP_TEST_CONTAINER: {
			MapTestContainer mapTestContainer = (MapTestContainer) theEObject;
			T result = caseMapTestContainer(mapTestContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.ESTRING_TO_VERSION_URL_MAP: {
			@SuppressWarnings("unchecked")
			Map.Entry<String, VersionUrl> eStringToVersionUrlMap = (Map.Entry<String, VersionUrl>) theEObject;
			T result = caseEStringToVersionUrlMap(eStringToVersionUrlMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.VERSION_URL: {
			VersionUrl versionUrl = (VersionUrl) theEObject;
			T result = caseVersionUrl(versionUrl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.URL_ENTRY_TEST: {
			URLEntryTest urlEntryTest = (URLEntryTest) theEObject;
			T result = caseURLEntryTest(urlEntryTest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.NAME_VERSION_MAP: {
			NameVersionMap nameVersionMap = (NameVersionMap) theEObject;
			T result = caseNameVersionMap(nameVersionMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.IDENT_OBJECT: {
			IdentObject identObject = (IdentObject) theEObject;
			T result = caseIdentObject(identObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UtilityPackage.JSON_OBJECT: {
			JsonObject jsonObject = (JsonObject) theEObject;
			T result = caseJsonObject(jsonObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Described Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Described Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedDescribedObject(NamedDescribedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionedObject(VersionedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sandboxed Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sandboxed Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSandboxedObject(SandboxedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruby File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruby File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRubyFile(RubyFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedObject(NamedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribedObject(DescribedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checksum File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checksum File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChecksumFile(ChecksumFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintained Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintained Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintainedObject(MaintainedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfig(Config object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Url Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Url Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameUrlMap(NameUrlMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Test Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Test Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapTestContainer(MapTestContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To Version Url Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To Version Url Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToVersionUrlMap(Map.Entry<String, VersionUrl> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Url</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Url</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionUrl(VersionUrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>URL Entry Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>URL Entry Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURLEntryTest(URLEntryTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Version Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Version Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameVersionMap(NameVersionMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ident Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ident Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentObject(IdentObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonObject(JsonObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UtilitySwitch
