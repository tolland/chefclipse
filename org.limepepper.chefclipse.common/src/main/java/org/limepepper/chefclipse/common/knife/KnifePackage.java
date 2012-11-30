/**
 */
package org.limepepper.chefclipse.common.knife;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.limepepper.chefclipse.ChefclipsePackage;

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
    String eNS_URI = "http://limepepper.org/chefclipse/1.0.0/knife";

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
     * The meta object id for the '{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl <em>Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.common.knife.impl.ConfigImpl
     * @see org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl#getConfig()
     * @generated
     */
    int CONFIG = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__NAME = ChefclipsePackage.NAMED_DESCRIBED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__DESCRIPTION = ChefclipsePackage.NAMED_DESCRIBED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__PLUGINS = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Node name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__NODE_NAME = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Client key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__CLIENT_KEY = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Chef server url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__CHEF_SERVER_URL = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Cache type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__CACHE_TYPE = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Cache option</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__CACHE_OPTION = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Validation client name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__VALIDATION_CLIENT_NAME = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Validation key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__VALIDATION_KEY = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Cookbook path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__COOKBOOK_PATH = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Cookbook copyright</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__COOKBOOK_COPYRIGHT = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 9;

    /**
     * The feature id for the '<em><b>Cookbook email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__COOKBOOK_EMAIL = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 10;

    /**
     * The feature id for the '<em><b>Cookbook license</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__COOKBOOK_LICENSE = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 11;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__PATH = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 12;

    /**
     * The number of structural features of the '<em>Config</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_FEATURE_COUNT = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 13;

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
     * Returns the meta object for class '{@link org.limepepper.chefclipse.common.knife.Config <em>Config</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Config</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config
     * @generated
     */
    EClass getConfig();

    /**
     * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.knife.Config#getPlugins <em>Plugins</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Plugins</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config#getPlugins()
     * @see #getConfig()
     * @generated
     */
    EReference getConfig_Plugins();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.Config#getNode_name <em>Node name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Node name</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config#getNode_name()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Node_name();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.Config#getClient_key <em>Client key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Client key</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config#getClient_key()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Client_key();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.Config#getChef_server_url <em>Chef server url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Chef server url</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config#getChef_server_url()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Chef_server_url();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.Config#getCache_type <em>Cache type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cache type</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config#getCache_type()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Cache_type();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.Config#getCache_option <em>Cache option</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cache option</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config#getCache_option()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Cache_option();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.Config#getValidation_client_name <em>Validation client name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Validation client name</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config#getValidation_client_name()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Validation_client_name();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.Config#getValidation_key <em>Validation key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Validation key</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config#getValidation_key()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Validation_key();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.Config#getCookbook_path <em>Cookbook path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cookbook path</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config#getCookbook_path()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Cookbook_path();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.Config#getCookbook_copyright <em>Cookbook copyright</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cookbook copyright</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config#getCookbook_copyright()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Cookbook_copyright();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.Config#getCookbook_email <em>Cookbook email</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cookbook email</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config#getCookbook_email()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Cookbook_email();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.Config#getCookbook_license <em>Cookbook license</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cookbook license</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config#getCookbook_license()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Cookbook_license();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.knife.Config#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.limepepper.chefclipse.common.knife.Config#getPath()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Path();

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
         * The meta object literal for the '{@link org.limepepper.chefclipse.common.knife.impl.ConfigImpl <em>Config</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.common.knife.impl.ConfigImpl
         * @see org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl#getConfig()
         * @generated
         */
        EClass CONFIG = eINSTANCE.getConfig();

        /**
         * The meta object literal for the '<em><b>Plugins</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONFIG__PLUGINS = eINSTANCE.getConfig_Plugins();

        /**
         * The meta object literal for the '<em><b>Node name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__NODE_NAME = eINSTANCE.getConfig_Node_name();

        /**
         * The meta object literal for the '<em><b>Client key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__CLIENT_KEY = eINSTANCE.getConfig_Client_key();

        /**
         * The meta object literal for the '<em><b>Chef server url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__CHEF_SERVER_URL = eINSTANCE.getConfig_Chef_server_url();

        /**
         * The meta object literal for the '<em><b>Cache type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__CACHE_TYPE = eINSTANCE.getConfig_Cache_type();

        /**
         * The meta object literal for the '<em><b>Cache option</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__CACHE_OPTION = eINSTANCE.getConfig_Cache_option();

        /**
         * The meta object literal for the '<em><b>Validation client name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__VALIDATION_CLIENT_NAME = eINSTANCE.getConfig_Validation_client_name();

        /**
         * The meta object literal for the '<em><b>Validation key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__VALIDATION_KEY = eINSTANCE.getConfig_Validation_key();

        /**
         * The meta object literal for the '<em><b>Cookbook path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__COOKBOOK_PATH = eINSTANCE.getConfig_Cookbook_path();

        /**
         * The meta object literal for the '<em><b>Cookbook copyright</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__COOKBOOK_COPYRIGHT = eINSTANCE.getConfig_Cookbook_copyright();

        /**
         * The meta object literal for the '<em><b>Cookbook email</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__COOKBOOK_EMAIL = eINSTANCE.getConfig_Cookbook_email();

        /**
         * The meta object literal for the '<em><b>Cookbook license</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__COOKBOOK_LICENSE = eINSTANCE.getConfig_Cookbook_license();

        /**
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__PATH = eINSTANCE.getConfig_Path();

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
