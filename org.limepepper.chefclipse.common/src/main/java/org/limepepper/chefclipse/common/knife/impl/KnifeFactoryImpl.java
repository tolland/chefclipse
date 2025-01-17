/**
 */
package org.limepepper.chefclipse.common.knife.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.knife.*;
=======
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.limepepper.chefclipse.common.knife.KnifeSearch;
import org.limepepper.chefclipse.common.knife.Plugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KnifeFactoryImpl extends EFactoryImpl implements KnifeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KnifeFactory init() {
		try {
<<<<<<< HEAD
			KnifeFactory theKnifeFactory = (KnifeFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://limepepper.org/v1/chefclipse/knife");
			if (theKnifeFactory != null) {
				return theKnifeFactory;
			}
		} catch (Exception exception) {
=======
			KnifeFactory theKnifeFactory = (KnifeFactory)EPackage.Registry.INSTANCE.getEFactory("http://limepepper.org/v1/chefclipse/knife"); 
			if (theKnifeFactory != null) {
				return theKnifeFactory;
			}
		}
		catch (Exception exception) {
>>>>>>> origin/tomhodder
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KnifeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
<<<<<<< HEAD
		case KnifePackage.KNIFE_CONFIG:
			return createKnifeConfig();
		case KnifePackage.PLUGIN:
			return createPlugin();
		case KnifePackage.KNIFE_SEARCH:
			return createKnifeSearch();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
=======
			case KnifePackage.KNIFE_CONFIG: return createKnifeConfig();
			case KnifePackage.PLUGIN: return createPlugin();
			case KnifePackage.KNIFE_SEARCH: return createKnifeSearch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
>>>>>>> origin/tomhodder
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifeConfig createKnifeConfig() {
		KnifeConfigImpl knifeConfig = new KnifeConfigImpl();
		return knifeConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plugin createPlugin() {
		PluginImpl plugin = new PluginImpl();
		return plugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifeSearch createKnifeSearch() {
		KnifeSearchImpl knifeSearch = new KnifeSearchImpl();
		return knifeSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifePackage getKnifePackage() {
<<<<<<< HEAD
		return (KnifePackage) getEPackage();
=======
		return (KnifePackage)getEPackage();
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KnifePackage getPackage() {
		return KnifePackage.eINSTANCE;
	}

} //KnifeFactoryImpl
