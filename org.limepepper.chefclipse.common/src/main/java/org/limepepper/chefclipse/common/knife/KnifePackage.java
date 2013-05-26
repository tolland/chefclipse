/**
 */
package org.limepepper.chefclipse.common.knife;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.limepepper.chefclipse.utility.UtilityPackage;

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
 * @see org.limepepper.chefclipse.common.knife.KnifeFactory
 * @model kind="package"
 * @generated
 */
public interface KnifePackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "knife";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://limepepper.org/v1/chefclipse/knife";

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
    KnifePackage eINSTANCE = org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl.init();

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl
	 * @see org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl#getKnifeConfig()
	 * @generated
	 */
    int KNIFE_CONFIG = 0;

    /**
	 * The feature id for the '<em><b>Chef server url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__CHEF_SERVER_URL = UtilityPackage.CONFIG__CHEF_SERVER_URL;

    /**
	 * The feature id for the '<em><b>Client key</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__CLIENT_KEY = UtilityPackage.CONFIG__CLIENT_KEY;

    /**
	 * The feature id for the '<em><b>Node name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__NODE_NAME = UtilityPackage.CONFIG__NODE_NAME;

    /**
	 * The feature id for the '<em><b>Log level</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__LOG_LEVEL = UtilityPackage.CONFIG__LOG_LEVEL;

    /**
	 * The feature id for the '<em><b>Validation key</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__VALIDATION_KEY = UtilityPackage.CONFIG__VALIDATION_KEY;

    /**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__VERSION = UtilityPackage.CONFIG__VERSION;

    /**
	 * The feature id for the '<em><b>Validation client name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__VALIDATION_CLIENT_NAME = UtilityPackage.CONFIG__VALIDATION_CLIENT_NAME;

    /**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__PLUGINS = UtilityPackage.CONFIG_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Cache type</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__CACHE_TYPE = UtilityPackage.CONFIG_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Cache option</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__CACHE_OPTION = UtilityPackage.CONFIG_FEATURE_COUNT + 2;

    /**
	 * The feature id for the '<em><b>Cookbook path</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__COOKBOOK_PATH = UtilityPackage.CONFIG_FEATURE_COUNT + 3;

    /**
	 * The feature id for the '<em><b>Cookbook copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__COOKBOOK_COPYRIGHT = UtilityPackage.CONFIG_FEATURE_COUNT + 4;

    /**
	 * The feature id for the '<em><b>Cookbook email</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__COOKBOOK_EMAIL = UtilityPackage.CONFIG_FEATURE_COUNT + 5;

    /**
	 * The feature id for the '<em><b>Cookbook license</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__COOKBOOK_LICENSE = UtilityPackage.CONFIG_FEATURE_COUNT + 6;

    /**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__PATH = UtilityPackage.CONFIG_FEATURE_COUNT + 7;

    /**
	 * The feature id for the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG__SERVER = UtilityPackage.CONFIG_FEATURE_COUNT + 8;

    /**
	 * The feature id for the '<em><b>Server Cookbook Version</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIFE_CONFIG__SERVER_COOKBOOK_VERSION = UtilityPackage.CONFIG_FEATURE_COUNT + 9;

				/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNIFE_CONFIG__REPOSITORY = UtilityPackage.CONFIG_FEATURE_COUNT + 10;

				/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_CONFIG_FEATURE_COUNT = UtilityPackage.CONFIG_FEATURE_COUNT + 11;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.knife.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.knife.impl.PluginImpl
	 * @see org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl#getPlugin()
	 * @generated
	 */
    int PLUGIN = 1;

    /**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PLUGIN_FEATURE_COUNT = 0;

    /**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.knife.impl.KnifeSearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.knife.impl.KnifeSearchImpl
	 * @see org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl#getKnifeSearch()
	 * @generated
	 */
    int KNIFE_SEARCH = 2;

    /**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int KNIFE_SEARCH_FEATURE_COUNT = 0;


    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.knife.KnifeConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig
	 * @generated
	 */
    EClass getKnifeConfig();

    /**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugins</em>'.
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig#getPlugins()
	 * @see #getKnifeConfig()
	 * @generated
	 */
    EReference getKnifeConfig_Plugins();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCache_type <em>Cache type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache type</em>'.
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig#getCache_type()
	 * @see #getKnifeConfig()
	 * @generated
	 */
    EAttribute getKnifeConfig_Cache_type();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCache_option <em>Cache option</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache option</em>'.
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig#getCache_option()
	 * @see #getKnifeConfig()
	 * @generated
	 */
    EAttribute getKnifeConfig_Cache_option();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_path <em>Cookbook path</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cookbook path</em>'.
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_path()
	 * @see #getKnifeConfig()
	 * @generated
	 */
    EAttribute getKnifeConfig_Cookbook_path();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_copyright <em>Cookbook copyright</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cookbook copyright</em>'.
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_copyright()
	 * @see #getKnifeConfig()
	 * @generated
	 */
    EAttribute getKnifeConfig_Cookbook_copyright();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_email <em>Cookbook email</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cookbook email</em>'.
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_email()
	 * @see #getKnifeConfig()
	 * @generated
	 */
    EAttribute getKnifeConfig_Cookbook_email();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_license <em>Cookbook license</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cookbook license</em>'.
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig#getCookbook_license()
	 * @see #getKnifeConfig()
	 * @generated
	 */
    EAttribute getKnifeConfig_Cookbook_license();

    /**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig#getPath()
	 * @see #getKnifeConfig()
	 * @generated
	 */
    EAttribute getKnifeConfig_Path();

    /**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Server</em>'.
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig#getServer()
	 * @see #getKnifeConfig()
	 * @generated
	 */
    EReference getKnifeConfig_Server();

    /**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getServerCookbookVersion <em>Server Cookbook Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Server Cookbook Version</em>'.
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig#getServerCookbookVersion()
	 * @see #getKnifeConfig()
	 * @generated
	 */
	EReference getKnifeConfig_ServerCookbookVersion();

				/**
	 * Returns the meta object for the reference '{@link org.limepepper.chefclipse.common.knife.KnifeConfig#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig#getRepository()
	 * @see #getKnifeConfig()
	 * @generated
	 */
	EReference getKnifeConfig_Repository();

				/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.knife.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see org.limepepper.chefclipse.common.knife.Plugin
	 * @generated
	 */
    EClass getPlugin();

    /**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.knife.KnifeSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see org.limepepper.chefclipse.common.knife.KnifeSearch
	 * @generated
	 */
    EClass getKnifeSearch();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    KnifeFactory getKnifeFactory();

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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.knife.impl.KnifeConfigImpl
		 * @see org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl#getKnifeConfig()
		 * @generated
		 */
        EClass KNIFE_CONFIG = eINSTANCE.getKnifeConfig();

        /**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference KNIFE_CONFIG__PLUGINS = eINSTANCE.getKnifeConfig_Plugins();

        /**
		 * The meta object literal for the '<em><b>Cache type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute KNIFE_CONFIG__CACHE_TYPE = eINSTANCE.getKnifeConfig_Cache_type();

        /**
		 * The meta object literal for the '<em><b>Cache option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute KNIFE_CONFIG__CACHE_OPTION = eINSTANCE.getKnifeConfig_Cache_option();

        /**
		 * The meta object literal for the '<em><b>Cookbook path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute KNIFE_CONFIG__COOKBOOK_PATH = eINSTANCE.getKnifeConfig_Cookbook_path();

        /**
		 * The meta object literal for the '<em><b>Cookbook copyright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute KNIFE_CONFIG__COOKBOOK_COPYRIGHT = eINSTANCE.getKnifeConfig_Cookbook_copyright();

        /**
		 * The meta object literal for the '<em><b>Cookbook email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute KNIFE_CONFIG__COOKBOOK_EMAIL = eINSTANCE.getKnifeConfig_Cookbook_email();

        /**
		 * The meta object literal for the '<em><b>Cookbook license</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute KNIFE_CONFIG__COOKBOOK_LICENSE = eINSTANCE.getKnifeConfig_Cookbook_license();

        /**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute KNIFE_CONFIG__PATH = eINSTANCE.getKnifeConfig_Path();

        /**
		 * The meta object literal for the '<em><b>Server</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference KNIFE_CONFIG__SERVER = eINSTANCE.getKnifeConfig_Server();

        /**
		 * The meta object literal for the '<em><b>Server Cookbook Version</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNIFE_CONFIG__SERVER_COOKBOOK_VERSION = eINSTANCE.getKnifeConfig_ServerCookbookVersion();

								/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNIFE_CONFIG__REPOSITORY = eINSTANCE.getKnifeConfig_Repository();

								/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.knife.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.knife.impl.PluginImpl
		 * @see org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl#getPlugin()
		 * @generated
		 */
        EClass PLUGIN = eINSTANCE.getPlugin();

        /**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.knife.impl.KnifeSearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.knife.impl.KnifeSearchImpl
		 * @see org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl#getKnifeSearch()
		 * @generated
		 */
        EClass KNIFE_SEARCH = eINSTANCE.getKnifeSearch();

    }

} //KnifePackage
