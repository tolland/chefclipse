/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage
 * @generated
 */
public interface ChefserverFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ChefserverFactory eINSTANCE = org.limepepper.chefclipse.common.chefserver.impl.ChefserverFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Environment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Environment</em>'.
     * @generated
     */
    Environment createEnvironment();

    /**
     * Returns a new object of class '<em>Data Bag</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Bag</em>'.
     * @generated
     */
    DataBag createDataBag();

    /**
     * Returns a new object of class '<em>Role</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Role</em>'.
     * @generated
     */
    Role createRole();

    /**
     * Returns a new object of class '<em>Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Node</em>'.
     * @generated
     */
    Node createNode();

    /**
     * Returns a new object of class '<em>Server</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Server</em>'.
     * @generated
     */
    Server createServer();

    /**
     * Returns a new object of class '<em>Platform</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Platform</em>'.
     * @generated
     */
    Platform createPlatform();

    /**
     * Returns a new object of class '<em>Run List</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Run List</em>'.
     * @generated
     */
    RunList createRunList();

    /**
     * Returns a new object of class '<em>Server Config</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Server Config</em>'.
     * @generated
     */
    ServerConfig createServerConfig();

    /**
     * Returns a new object of class '<em>Data Bag Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Bag Item</em>'.
     * @generated
     */
    DataBagItem createDataBagItem();

    /**
     * Returns a new object of class '<em>Sandbox</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sandbox</em>'.
     * @generated
     */
    Sandbox createSandbox();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ChefserverPackage getChefserverPackage();

} //ChefserverFactory
