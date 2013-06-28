/**
 */
package org.limepepper.chefclipse.common.chefclient;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
<<<<<<< HEAD
import org.limepepper.chefclipse.utility.UtilityPackage;
=======
import org.limepepper.chefclipse.ChefclipsePackage;
>>>>>>> origin/tomhodder

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
<<<<<<< HEAD
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
	String eNS_URI = "http://limepepper.org/v1/chefclipse/chefclient";

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
	ChefclientPackage eINSTANCE = org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefclient.impl.ChefClientImpl <em>Chef Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.chefclient.impl.ChefClientImpl
	 * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getChefClient()
	 * @generated
	 */
	int CHEF_CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEF_CLIENT__SERVER = 0;

	/**
	 * The number of structural features of the '<em>Chef Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEF_CLIENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefclient.impl.OhaiImpl <em>Ohai</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
=======
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
    String eNS_URI = "http://limepepper.org/v1/chefclipse/chefclient";

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
>>>>>>> origin/tomhodder
	 * @see org.limepepper.chefclipse.common.chefclient.impl.OhaiImpl
	 * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getOhai()
	 * @generated
	 */
<<<<<<< HEAD
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
=======
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
>>>>>>> origin/tomhodder
	 * @see org.limepepper.chefclipse.common.chefclient.impl.SearchImpl
	 * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getSearch()
	 * @generated
	 */
<<<<<<< HEAD
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
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefclient.impl.ClientConfigImpl <em>Client Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
=======
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
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.chefclient.impl.ClientConfigImpl <em>Client Config</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @see org.limepepper.chefclipse.common.chefclient.impl.ClientConfigImpl
	 * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getClientConfig()
	 * @generated
	 */
<<<<<<< HEAD
	int CLIENT_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Chef server url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_CONFIG__CHEF_SERVER_URL = UtilityPackage.CONFIG__CHEF_SERVER_URL;

	/**
	 * The feature id for the '<em><b>Client key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_CONFIG__CLIENT_KEY = UtilityPackage.CONFIG__CLIENT_KEY;

	/**
	 * The feature id for the '<em><b>Node name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_CONFIG__NODE_NAME = UtilityPackage.CONFIG__NODE_NAME;

	/**
	 * The feature id for the '<em><b>Log level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_CONFIG__LOG_LEVEL = UtilityPackage.CONFIG__LOG_LEVEL;

	/**
	 * The feature id for the '<em><b>Validation key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_CONFIG__VALIDATION_KEY = UtilityPackage.CONFIG__VALIDATION_KEY;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_CONFIG__VERSION = UtilityPackage.CONFIG__VERSION;

	/**
	 * The feature id for the '<em><b>Validation client name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_CONFIG__VALIDATION_CLIENT_NAME = UtilityPackage.CONFIG__VALIDATION_CLIENT_NAME;

	/**
	 * The number of structural features of the '<em>Client Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_CONFIG_FEATURE_COUNT = UtilityPackage.CONFIG_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefclient.ChefClient <em>Chef Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chef Client</em>'.
	 * @see org.limepepper.chefclipse.common.chefclient.ChefClient
	 * @generated
	 */
	EClass getChefClient();

	/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.chefclient.ChefClient#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see org.limepepper.chefclipse.common.chefclient.ChefClient#getServer()
	 * @see #getChefClient()
	 * @generated
	 */
	EReference getChefClient_Server();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefclient.Ohai <em>Ohai</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
=======
    int CLIENT_CONFIG = 3;

    /**
	 * The feature id for the '<em><b>Chef server url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLIENT_CONFIG__CHEF_SERVER_URL = ChefclipsePackage.CONFIG__CHEF_SERVER_URL;

    /**
	 * The feature id for the '<em><b>Client key</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLIENT_CONFIG__CLIENT_KEY = ChefclipsePackage.CONFIG__CLIENT_KEY;

    /**
	 * The feature id for the '<em><b>Node name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLIENT_CONFIG__NODE_NAME = ChefclipsePackage.CONFIG__NODE_NAME;

    /**
	 * The feature id for the '<em><b>Log level</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLIENT_CONFIG__LOG_LEVEL = ChefclipsePackage.CONFIG__LOG_LEVEL;

    /**
	 * The feature id for the '<em><b>Validation key</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLIENT_CONFIG__VALIDATION_KEY = ChefclipsePackage.CONFIG__VALIDATION_KEY;

    /**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLIENT_CONFIG__VERSION = ChefclipsePackage.CONFIG__VERSION;

    /**
	 * The feature id for the '<em><b>Validation client name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLIENT_CONFIG__VALIDATION_CLIENT_NAME = ChefclipsePackage.CONFIG__VALIDATION_CLIENT_NAME;

    /**
	 * The number of structural features of the '<em>Client Config</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CLIENT_CONFIG_FEATURE_COUNT = ChefclipsePackage.CONFIG_FEATURE_COUNT + 0;


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
>>>>>>> origin/tomhodder
	 * @return the meta object for class '<em>Ohai</em>'.
	 * @see org.limepepper.chefclipse.common.chefclient.Ohai
	 * @generated
	 */
<<<<<<< HEAD
	EClass getOhai();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefclient.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
=======
    EClass getOhai();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefclient.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @return the meta object for class '<em>Search</em>'.
	 * @see org.limepepper.chefclipse.common.chefclient.Search
	 * @generated
	 */
<<<<<<< HEAD
	EClass getSearch();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefclient.ClientConfig <em>Client Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
=======
    EClass getSearch();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.chefclient.ClientConfig <em>Client Config</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @return the meta object for class '<em>Client Config</em>'.
	 * @see org.limepepper.chefclipse.common.chefclient.ClientConfig
	 * @generated
	 */
<<<<<<< HEAD
	EClass getClientConfig();

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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefclient.impl.ChefClientImpl <em>Chef Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.chefclient.impl.ChefClientImpl
		 * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getChefClient()
		 * @generated
		 */
		EClass CHEF_CLIENT = eINSTANCE.getChefClient();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEF_CLIENT__SERVER = eINSTANCE.getChefClient_Server();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefclient.impl.OhaiImpl <em>Ohai</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
=======
    EClass getClientConfig();

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
>>>>>>> origin/tomhodder
		 * @see org.limepepper.chefclipse.common.chefclient.impl.OhaiImpl
		 * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getOhai()
		 * @generated
		 */
<<<<<<< HEAD
		EClass OHAI = eINSTANCE.getOhai();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefclient.impl.SearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
=======
        EClass OHAI = eINSTANCE.getOhai();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefclient.impl.SearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
		 * @see org.limepepper.chefclipse.common.chefclient.impl.SearchImpl
		 * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getSearch()
		 * @generated
		 */
<<<<<<< HEAD
		EClass SEARCH = eINSTANCE.getSearch();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefclient.impl.ClientConfigImpl <em>Client Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
=======
        EClass SEARCH = eINSTANCE.getSearch();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.chefclient.impl.ClientConfigImpl <em>Client Config</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
		 * @see org.limepepper.chefclipse.common.chefclient.impl.ClientConfigImpl
		 * @see org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl#getClientConfig()
		 * @generated
		 */
<<<<<<< HEAD
		EClass CLIENT_CONFIG = eINSTANCE.getClientConfig();

	}
=======
        EClass CLIENT_CONFIG = eINSTANCE.getClientConfig();

    }
>>>>>>> origin/tomhodder

} //ChefclientPackage
