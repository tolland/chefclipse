/**
 */
package org.limepepper.chefclipse.common.chefclient;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.common.chefclient.ChefclientPackage
 * @generated
 */
public interface ChefclientFactory extends EFactory {
<<<<<<< HEAD
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChefclientFactory eINSTANCE = org.limepepper.chefclipse.common.chefclient.impl.ChefclientFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Chef Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chef Client</em>'.
	 * @generated
	 */
	ChefClient createChefClient();

	/**
	 * Returns a new object of class '<em>Ohai</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ohai</em>'.
	 * @generated
	 */
	Ohai createOhai();

	/**
	 * Returns a new object of class '<em>Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search</em>'.
	 * @generated
	 */
	Search createSearch();

	/**
	 * Returns a new object of class '<em>Client Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Config</em>'.
	 * @generated
	 */
	ClientConfig createClientConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChefclientPackage getChefclientPackage();
=======
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    ChefclientFactory eINSTANCE = org.limepepper.chefclipse.common.chefclient.impl.ChefclientFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Client</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client</em>'.
	 * @generated
	 */
    Client createClient();

    /**
	 * Returns a new object of class '<em>Ohai</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ohai</em>'.
	 * @generated
	 */
    Ohai createOhai();

    /**
	 * Returns a new object of class '<em>Search</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Search</em>'.
	 * @generated
	 */
    Search createSearch();

    /**
	 * Returns a new object of class '<em>Client Config</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Client Config</em>'.
	 * @generated
	 */
    ClientConfig createClientConfig();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    ChefclientPackage getChefclientPackage();
>>>>>>> origin/tomhodder

} //ChefclientFactory
