/**
 */
package org.limepepper.chefclipse.common.chefclient;

import org.eclipse.emf.ecore.EClass;
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
 * @see org.limepepper.chefclipse.common.chefclient.ChefclientFactory
 * @model kind="package"
 * @generated
 */
public interface ChefclientPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "chefclient";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://limepepper.org/chefclipse/1.0.0/chefclient";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "org.limepepper.chefclipse";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ChefclientPackage eINSTANCE = org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl.init();

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.chefclient.impl.ClientImpl <em>Client</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.chefclient.impl.ClientImpl
     * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getClient()
     * @generated
     */
    int CLIENT = 0;

    /**
     * The feature id for the '<em><b>Server</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT__SERVER = 0;

    /**
     * The number of structural features of the '<em>Client</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CLIENT_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.chefclient.impl.OhaiImpl <em>Ohai</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.chefclient.impl.OhaiImpl
     * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getOhai()
     * @generated
     */
    int OHAI = 1;

    /**
     * The number of structural features of the '<em>Ohai</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OHAI_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.common.chefclient.impl.SearchImpl <em>Search</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.chefclient.impl.SearchImpl
     * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getSearch()
     * @generated
     */
    int SEARCH = 2;

    /**
     * The number of structural features of the '<em>Search</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEARCH_FEATURE_COUNT = 0;


    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefclient.Client <em>Client</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Client</em>'.
     * @see org.limepepper.chefclipse.common.chefclient.Client
     * @generated
     */
    EClass getClient();

    /**
     * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefclient.Client#getServer <em>Server</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Server</em>'.
     * @see org.limepepper.chefclipse.common.chefclient.Client#getServer()
     * @see #getClient()
     * @generated
     */
    EReference getClient_Server();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefclient.Ohai <em>Ohai</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ohai</em>'.
     * @see org.limepepper.chefclipse.common.chefclient.Ohai
     * @generated
     */
    EClass getOhai();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefclient.Search <em>Search</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Search</em>'.
     * @see org.limepepper.chefclipse.common.chefclient.Search
     * @generated
     */
    EClass getSearch();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ChefclientFactory getChefclientFactory();

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
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefclient.impl.ClientImpl <em>Client</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.chefclient.impl.ClientImpl
         * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getClient()
         * @generated
         */
        EClass CLIENT = eINSTANCE.getClient();

        /**
         * The meta object literal for the '<em><b>Server</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CLIENT__SERVER = eINSTANCE.getClient_Server();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefclient.impl.OhaiImpl <em>Ohai</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.chefclient.impl.OhaiImpl
         * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getOhai()
         * @generated
         */
        EClass OHAI = eINSTANCE.getOhai();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefclient.impl.SearchImpl <em>Search</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.chefclient.impl.SearchImpl
         * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getSearch()
         * @generated
         */
        EClass SEARCH = eINSTANCE.getSearch();

    }

} //ChefclientPackage
