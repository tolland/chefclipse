/**
 */
package org.limepepper.chefclipse.common.chefserver.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.Cookbook;
import org.limepepper.chefclipse.DescribedObject;
import org.limepepper.chefclipse.NamedDescribedObject;
import org.limepepper.chefclipse.NamedObject;

import org.limepepper.chefclipse.SandboxedObject;
import org.limepepper.chefclipse.common.chefserver.*;

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
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage
 * @generated
 */
public class ChefserverSwitch<T> extends Switch<T> {
    /**
	 * The cached model package
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static ChefserverPackage modelPackage;

    /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ChefserverSwitch() {
		if (modelPackage == null) {
			modelPackage = ChefserverPackage.eINSTANCE;
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
			case ChefserverPackage.ENVIRONMENT: {
				Environment environment = (Environment)theEObject;
				T result = caseEnvironment(environment);
				if (result == null) result = caseNamedDescribedObject(environment);
				if (result == null) result = caseDescribedObject(environment);
				if (result == null) result = caseNamedObject(environment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefserverPackage.DATA_BAG: {
				DataBag dataBag = (DataBag)theEObject;
				T result = caseDataBag(dataBag);
				if (result == null) result = caseNamedDescribedObject(dataBag);
				if (result == null) result = caseDescribedObject(dataBag);
				if (result == null) result = caseNamedObject(dataBag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefserverPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseNamedDescribedObject(role);
				if (result == null) result = caseRunListItem(role);
				if (result == null) result = caseDescribedObject(role);
				if (result == null) result = caseNamedObject(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefserverPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = caseNamedDescribedObject(node);
				if (result == null) result = caseDescribedObject(node);
				if (result == null) result = caseNamedObject(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefserverPackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefserverPackage.PLATFORM: {
				Platform platform = (Platform)theEObject;
				T result = casePlatform(platform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefserverPackage.RUN_LIST: {
				RunList runList = (RunList)theEObject;
				T result = caseRunList(runList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefserverPackage.SERVER_CONFIG: {
				ServerConfig serverConfig = (ServerConfig)theEObject;
				T result = caseServerConfig(serverConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefserverPackage.DATA_BAG_ITEM: {
				DataBagItem dataBagItem = (DataBagItem)theEObject;
				T result = caseDataBagItem(dataBagItem);
				if (result == null) result = caseNamedObject(dataBagItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefserverPackage.SANDBOX: {
				Sandbox sandbox = (Sandbox)theEObject;
				T result = caseSandbox(sandbox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefserverPackage.COOKBOOK_LIST_RESP: {
				CookbookListResp cookbookListResp = (CookbookListResp)theEObject;
				T result = caseCookbookListResp(cookbookListResp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefserverPackage.SERVER_COOKBOOK_FILE: {
				ServerCookbookFile serverCookbookFile = (ServerCookbookFile)theEObject;
				T result = caseServerCookbookFile(serverCookbookFile);
				if (result == null) result = caseNamedObject(serverCookbookFile);
				if (result == null) result = caseChecksumFile(serverCookbookFile);
				if (result == null) result = caseSandboxedObject(serverCookbookFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefserverPackage.SERVER_COOKBOOK_VERSION: {
				ServerCookbookVersion serverCookbookVersion = (ServerCookbookVersion)theEObject;
				T result = caseServerCookbookVersion(serverCookbookVersion);
				if (result == null) result = caseCookbook(serverCookbookVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefserverPackage.RUN_LIST_ITEM: {
				RunListItem runListItem = (RunListItem)theEObject;
				T result = caseRunListItem(runListItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseEnvironment(Environment object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Bag</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Bag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDataBag(DataBag object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRole(Role object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNode(Node object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseServer(Server object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T casePlatform(Platform object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Run List</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRunList(RunList object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Server Config</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseServerConfig(ServerConfig object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Bag Item</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Bag Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseDataBagItem(DataBagItem object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Sandbox</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sandbox</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSandbox(Sandbox object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook List Resp</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook List Resp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbookListResp(CookbookListResp object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Server Cookbook File</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Cookbook File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseServerCookbookFile(ServerCookbookFile object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Server Cookbook Version</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Cookbook Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseServerCookbookVersion(ServerCookbookVersion object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Run List Item</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRunListItem(RunListItem object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Cookbook</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cookbook</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseCookbook(Cookbook object) {
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

} //ChefserverSwitch
