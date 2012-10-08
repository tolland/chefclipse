/**
 */
package org.limepepper.chefclipse.model.knife;

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
 * @see org.limepepper.chefclipse.model.knife.KnifeFactory
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
	String eNS_URI = "http://limepepper.org/chefclipse/knife";

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
	KnifePackage eINSTANCE = org.limepepper.chefclipse.model.knife.impl.KnifePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.knife.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.knife.impl.ConfigImpl
	 * @see org.limepepper.chefclipse.model.knife.impl.KnifePackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__PLUGINS = 0;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.knife.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.knife.impl.PluginImpl
	 * @see org.limepepper.chefclipse.model.knife.impl.KnifePackageImpl#getPlugin()
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
	 * The meta object id for the '{@link org.limepepper.chefclipse.model.knife.impl.KnifeSearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.model.knife.impl.KnifeSearchImpl
	 * @see org.limepepper.chefclipse.model.knife.impl.KnifePackageImpl#getKnifeSearch()
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
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.knife.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.limepepper.chefclipse.model.knife.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.model.knife.Config#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugins</em>'.
	 * @see org.limepepper.chefclipse.model.knife.Config#getPlugins()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Plugins();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.knife.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see org.limepepper.chefclipse.model.knife.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.model.knife.KnifeSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see org.limepepper.chefclipse.model.knife.KnifeSearch
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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.knife.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.knife.impl.ConfigImpl
		 * @see org.limepepper.chefclipse.model.knife.impl.KnifePackageImpl#getConfig()
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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.knife.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.knife.impl.PluginImpl
		 * @see org.limepepper.chefclipse.model.knife.impl.KnifePackageImpl#getPlugin()
		 * @generated
		 */
		EClass PLUGIN = eINSTANCE.getPlugin();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.model.knife.impl.KnifeSearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.model.knife.impl.KnifeSearchImpl
		 * @see org.limepepper.chefclipse.model.knife.impl.KnifePackageImpl#getKnifeSearch()
		 * @generated
		 */
		EClass KNIFE_SEARCH = eINSTANCE.getKnifeSearch();

	}

} //KnifePackage
