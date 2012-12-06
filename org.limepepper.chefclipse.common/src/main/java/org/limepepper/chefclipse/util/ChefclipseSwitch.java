/**
 */
package org.limepepper.chefclipse.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.limepepper.chefclipse.*;
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.DescribedObject;
import org.limepepper.chefclipse.MaintainedObject;
import org.limepepper.chefclipse.NamedDescribedObject;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.RubyFile;
import org.limepepper.chefclipse.SandboxedObject;
import org.limepepper.chefclipse.VersionedObject;

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
 * @see org.limepepper.chefclipse.ChefclipsePackage
 * @generated
 */
public class ChefclipseSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ChefclipsePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefclipseSwitch() {
        if (modelPackage == null) {
            modelPackage = ChefclipsePackage.eINSTANCE;
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
            case ChefclipsePackage.NAMED_DESCRIBED_OBJECT: {
                NamedDescribedObject namedDescribedObject = (NamedDescribedObject)theEObject;
                T result = caseNamedDescribedObject(namedDescribedObject);
                if (result == null) result = caseDescribedObject(namedDescribedObject);
                if (result == null) result = caseNamedObject(namedDescribedObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ChefclipsePackage.VERSIONED_OBJECT: {
                VersionedObject versionedObject = (VersionedObject)theEObject;
                T result = caseVersionedObject(versionedObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ChefclipsePackage.SANDBOXED_OBJECT: {
                SandboxedObject sandboxedObject = (SandboxedObject)theEObject;
                T result = caseSandboxedObject(sandboxedObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ChefclipsePackage.RUBY_FILE: {
                RubyFile rubyFile = (RubyFile)theEObject;
                T result = caseRubyFile(rubyFile);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ChefclipsePackage.NAMED_OBJECT: {
                NamedObject namedObject = (NamedObject)theEObject;
                T result = caseNamedObject(namedObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ChefclipsePackage.DESCRIBED_OBJECT: {
                DescribedObject describedObject = (DescribedObject)theEObject;
                T result = caseDescribedObject(describedObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ChefclipsePackage.CHECKSUM_FILE: {
                ChecksumFile checksumFile = (ChecksumFile)theEObject;
                T result = caseChecksumFile(checksumFile);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ChefclipsePackage.MAINTAINED_OBJECT: {
                MaintainedObject maintainedObject = (MaintainedObject)theEObject;
                T result = caseMaintainedObject(maintainedObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ChefclipsePackage.CONFIG: {
                Config config = (Config)theEObject;
                T result = caseConfig(config);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
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

} //ChefclipseSwitch