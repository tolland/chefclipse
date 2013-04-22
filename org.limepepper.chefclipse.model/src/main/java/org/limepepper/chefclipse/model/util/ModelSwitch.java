/**
 */
package org.limepepper.chefclipse.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.limepepper.chefclipse.model.*;

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
 * @see org.limepepper.chefclipse.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ModelPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelSwitch() {
        if (modelPackage == null) {
            modelPackage = ModelPackage.eINSTANCE;
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
            case ModelPackage.CHEF_CONTAINER: {
                ChefContainer chefContainer = (ChefContainer)theEObject;
                T result = caseChefContainer(chefContainer);
                if (result == null) result = caseChefResource(chefContainer);
                if (result == null) result = caseChefObject(chefContainer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CHEF_FILE: {
                ChefFile chefFile = (ChefFile)theEObject;
                T result = caseChefFile(chefFile);
                if (result == null) result = caseChefResource(chefFile);
                if (result == null) result = caseChefObject(chefFile);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CHEF_FOLDER: {
                ChefFolder chefFolder = (ChefFolder)theEObject;
                T result = caseChefFolder(chefFolder);
                if (result == null) result = caseChefContainer(chefFolder);
                if (result == null) result = caseChefResource(chefFolder);
                if (result == null) result = caseChefObject(chefFolder);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CHEF_OBJECT: {
                ChefObject chefObject = (ChefObject)theEObject;
                T result = caseChefObject(chefObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CHEF_OBJECT_DEFINITION_FILE: {
                ChefObjectDefinitionFile chefObjectDefinitionFile = (ChefObjectDefinitionFile)theEObject;
                T result = caseChefObjectDefinitionFile(chefObjectDefinitionFile);
                if (result == null) result = caseChefFile(chefObjectDefinitionFile);
                if (result == null) result = caseChefResource(chefObjectDefinitionFile);
                if (result == null) result = caseChefObject(chefObjectDefinitionFile);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CHEF_OBJECT_ELEMENT_FILE: {
                ChefObjectElementFile chefObjectElementFile = (ChefObjectElementFile)theEObject;
                T result = caseChefObjectElementFile(chefObjectElementFile);
                if (result == null) result = caseChefFile(chefObjectElementFile);
                if (result == null) result = caseChefResource(chefObjectElementFile);
                if (result == null) result = caseChefObject(chefObjectElementFile);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CHEF_PROJECT: {
                ChefProject chefProject = (ChefProject)theEObject;
                T result = caseChefProject(chefProject);
                if (result == null) result = caseChefContainer(chefProject);
                if (result == null) result = caseChefResource(chefProject);
                if (result == null) result = caseChefObject(chefProject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CHEF_RESOURCE: {
                ChefResource chefResource = (ChefResource)theEObject;
                T result = caseChefResource(chefResource);
                if (result == null) result = caseChefObject(chefResource);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CHEF_WORKSPACE: {
                ChefWorkspace chefWorkspace = (ChefWorkspace)theEObject;
                T result = caseChefWorkspace(chefWorkspace);
                if (result == null) result = caseChefContainer(chefWorkspace);
                if (result == null) result = caseChefResource(chefWorkspace);
                if (result == null) result = caseChefObject(chefWorkspace);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CHANGE_TRACKER: {
                ChangeTracker changeTracker = (ChangeTracker)theEObject;
                T result = caseChangeTracker(changeTracker);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.CHEF_SERVER: {
                ChefServer chefServer = (ChefServer)theEObject;
                T result = caseChefServer(chefServer);
                if (result == null) result = caseChefObject(chefServer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.COOKBOOK_FOLDER: {
                CookbookFolder cookbookFolder = (CookbookFolder)theEObject;
                T result = caseCookbookFolder(cookbookFolder);
                if (result == null) result = caseChefFolder(cookbookFolder);
                if (result == null) result = caseChefContainer(cookbookFolder);
                if (result == null) result = caseChefResource(cookbookFolder);
                if (result == null) result = caseChefObject(cookbookFolder);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ModelPackage.DATA_BAGS_FOLDER: {
                DataBagsFolder dataBagsFolder = (DataBagsFolder)theEObject;
                T result = caseDataBagsFolder(dataBagsFolder);
                if (result == null) result = caseChefFolder(dataBagsFolder);
                if (result == null) result = caseChefContainer(dataBagsFolder);
                if (result == null) result = caseChefResource(dataBagsFolder);
                if (result == null) result = caseChefObject(dataBagsFolder);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Chef Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chef Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChefContainer(ChefContainer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Chef File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chef File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChefFile(ChefFile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Chef Folder</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chef Folder</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChefFolder(ChefFolder object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Chef Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chef Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChefObject(ChefObject object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Chef Object Definition File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chef Object Definition File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChefObjectDefinitionFile(ChefObjectDefinitionFile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Chef Object Element File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chef Object Element File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChefObjectElementFile(ChefObjectElementFile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Chef Project</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chef Project</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChefProject(ChefProject object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Chef Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chef Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChefResource(ChefResource object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Chef Workspace</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chef Workspace</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChefWorkspace(ChefWorkspace object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Change Tracker</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Change Tracker</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChangeTracker(ChangeTracker object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Chef Server</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Chef Server</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseChefServer(ChefServer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cookbook Folder</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cookbook Folder</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCookbookFolder(CookbookFolder object) {
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

} //ModelSwitch
