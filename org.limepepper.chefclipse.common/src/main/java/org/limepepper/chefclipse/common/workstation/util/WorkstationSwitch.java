/**
 */
package org.limepepper.chefclipse.common.workstation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.limepepper.chefclipse.DescribedObject;
import org.limepepper.chefclipse.NamedDescribedObject;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.common.workstation.*;
import org.limepepper.chefclipse.common.workstation.CertificatesFolder;
import org.limepepper.chefclipse.common.workstation.ConfigFolder;
import org.limepepper.chefclipse.common.workstation.CookbooksFolder;
import org.limepepper.chefclipse.common.workstation.DataBagsFolder;
import org.limepepper.chefclipse.common.workstation.EnvironmentsFolder;
import org.limepepper.chefclipse.common.workstation.Rakefile;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.common.workstation.RolesFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationPackage;

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
 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage
 * @generated
 */
public class WorkstationSwitch<T> extends Switch<T> {
    /**
	 * The cached model package
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static WorkstationPackage modelPackage;

    /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public WorkstationSwitch() {
		if (modelPackage == null) {
			modelPackage = WorkstationPackage.eINSTANCE;
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
			case WorkstationPackage.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = caseNamedDescribedObject(repository);
				if (result == null) result = caseDescribedObject(repository);
				if (result == null) result = caseNamedObject(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkstationPackage.CONFIG_FOLDER: {
				ConfigFolder configFolder = (ConfigFolder)theEObject;
				T result = caseConfigFolder(configFolder);
				if (result == null) result = caseWorkstationFolder(configFolder);
				if (result == null) result = caseNamedObject(configFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkstationPackage.CERTIFICATES_FOLDER: {
				CertificatesFolder certificatesFolder = (CertificatesFolder)theEObject;
				T result = caseCertificatesFolder(certificatesFolder);
				if (result == null) result = caseWorkstationFolder(certificatesFolder);
				if (result == null) result = caseNamedObject(certificatesFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkstationPackage.DATA_BAGS_FOLDER: {
				DataBagsFolder dataBagsFolder = (DataBagsFolder)theEObject;
				T result = caseDataBagsFolder(dataBagsFolder);
				if (result == null) result = caseWorkstationFolder(dataBagsFolder);
				if (result == null) result = caseNamedObject(dataBagsFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkstationPackage.ENVIRONMENTS_FOLDER: {
				EnvironmentsFolder environmentsFolder = (EnvironmentsFolder)theEObject;
				T result = caseEnvironmentsFolder(environmentsFolder);
				if (result == null) result = caseWorkstationFolder(environmentsFolder);
				if (result == null) result = caseNamedObject(environmentsFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkstationPackage.ROLES_FOLDER: {
				RolesFolder rolesFolder = (RolesFolder)theEObject;
				T result = caseRolesFolder(rolesFolder);
				if (result == null) result = caseWorkstationFolder(rolesFolder);
				if (result == null) result = caseNamedObject(rolesFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkstationPackage.RAKEFILE: {
				Rakefile rakefile = (Rakefile)theEObject;
				T result = caseRakefile(rakefile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkstationPackage.COOKBOOKS_FOLDER: {
				CookbooksFolder cookbooksFolder = (CookbooksFolder)theEObject;
				T result = caseCookbooksFolder(cookbooksFolder);
				if (result == null) result = caseWorkstationFolder(cookbooksFolder);
				if (result == null) result = caseNamedObject(cookbooksFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkstationPackage.WORKSTATION_FOLDER: {
				WorkstationFolder workstationFolder = (WorkstationFolder)theEObject;
				T result = caseWorkstationFolder(workstationFolder);
				if (result == null) result = caseNamedObject(workstationFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRepository(Repository object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Config Folder</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseConfigFolder(ConfigFolder object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Certificates Folder</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificates Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCertificatesFolder(CertificatesFolder object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Bags Folder</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Bags Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDataBagsFolder(DataBagsFolder object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Environments Folder</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environments Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseEnvironmentsFolder(EnvironmentsFolder object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Roles Folder</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roles Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRolesFolder(RolesFolder object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Rakefile</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rakefile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRakefile(Rakefile object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbooks Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbooks Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCookbooksFolder(CookbooksFolder object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkstationFolder(WorkstationFolder object) {
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

} //WorkstationSwitch
