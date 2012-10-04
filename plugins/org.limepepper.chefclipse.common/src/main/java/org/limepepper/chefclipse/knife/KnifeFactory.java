/**
 */
package org.limepepper.chefclipse.knife;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.knife.KnifePackage
 * @generated
 */
public class KnifeFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final KnifeFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KnifeFactory init() {
		try {
			KnifeFactory theKnifeFactory = (KnifeFactory)EPackage.Registry.INSTANCE.getEFactory("http://limepepper.org/chefclipse/v0.0.1//knife"); 
			if (theKnifeFactory != null) {
				return theKnifeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KnifeFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifeFactory() {
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
			case KnifePackage.KNIFE_CONFIG: return createKnifeConfig();
			case KnifePackage.KNIFE_PLUGIN: return createKnifePlugin();
			case KnifePackage.KNIFE_SEARCH: return createKnifeSearch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifeConfig createKnifeConfig() {
		KnifeConfig knifeConfig = new KnifeConfig();
		return knifeConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifePlugin createKnifePlugin() {
		KnifePlugin knifePlugin = new KnifePlugin();
		return knifePlugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifeSearch createKnifeSearch() {
		KnifeSearch knifeSearch = new KnifeSearch();
		return knifeSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifePackage getKnifePackage() {
		return (KnifePackage)getEPackage();
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

} //KnifeFactory
