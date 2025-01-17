/**
 */
package org.limepepper.chefclipse.common.chefclient.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.chefclient.*;
import org.limepepper.chefclipse.common.chefclient.ChefClient;
import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;
import org.limepepper.chefclipse.common.chefclient.ClientConfig;
import org.limepepper.chefclipse.common.chefclient.Ohai;
import org.limepepper.chefclipse.common.chefclient.Search;
import org.limepepper.chefclipse.utility.Config;
=======
import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;
import org.limepepper.chefclipse.common.chefclient.Client;
import org.limepepper.chefclipse.common.chefclient.ClientConfig;
import org.limepepper.chefclipse.common.chefclient.Ohai;
import org.limepepper.chefclipse.common.chefclient.Search;
>>>>>>> origin/tomhodder

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
 * @see org.limepepper.chefclipse.common.chefclient.ChefclientPackage
 * @generated
 */
public class ChefclientSwitch<T> extends Switch<T> {
<<<<<<< HEAD
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChefclientPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefclientSwitch() {
=======
    /**
	 * The cached model package
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static ChefclientPackage modelPackage;

    /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ChefclientSwitch() {
>>>>>>> origin/tomhodder
		if (modelPackage == null) {
			modelPackage = ChefclientPackage.eINSTANCE;
		}
	}

<<<<<<< HEAD
	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
=======
    /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
<<<<<<< HEAD
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
		case ChefclientPackage.CHEF_CLIENT: {
			ChefClient chefClient = (ChefClient) theEObject;
			T result = caseChefClient(chefClient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChefclientPackage.OHAI: {
			Ohai ohai = (Ohai) theEObject;
			T result = caseOhai(ohai);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChefclientPackage.SEARCH: {
			Search search = (Search) theEObject;
			T result = caseSearch(search);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ChefclientPackage.CLIENT_CONFIG: {
			ClientConfig clientConfig = (ClientConfig) theEObject;
			T result = caseClientConfig(clientConfig);
			if (result == null)
				result = caseConfig(clientConfig);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chef Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chef Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChefClient(ChefClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ohai</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
=======
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
			case ChefclientPackage.CLIENT: {
				Client client = (Client)theEObject;
				T result = caseClient(client);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefclientPackage.OHAI: {
				Ohai ohai = (Ohai)theEObject;
				T result = caseOhai(ohai);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefclientPackage.SEARCH: {
				Search search = (Search)theEObject;
				T result = caseSearch(search);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChefclientPackage.CLIENT_CONFIG: {
				ClientConfig clientConfig = (ClientConfig)theEObject;
				T result = caseClientConfig(clientConfig);
				if (result == null) result = caseConfig(clientConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Client</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseClient(Client object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Ohai</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ohai</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
<<<<<<< HEAD
	public T caseOhai(Ohai object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
=======
    public T caseOhai(Ohai object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Search</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
<<<<<<< HEAD
	public T caseSearch(Search object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Client Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
=======
    public T caseSearch(Search object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Client Config</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Client Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
<<<<<<< HEAD
	public T caseClientConfig(ClientConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
=======
    public T caseClientConfig(ClientConfig object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Config</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
<<<<<<< HEAD
	public T caseConfig(Config object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
=======
    public T caseConfig(Config object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
<<<<<<< HEAD
	@Override
	public T defaultCase(EObject object) {
=======
    @Override
    public T defaultCase(EObject object) {
>>>>>>> origin/tomhodder
		return null;
	}

} //ChefclientSwitch
