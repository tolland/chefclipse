/**
 */
package org.limepepper.chefclipse.common.knife.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.knife.*;
=======
import org.limepepper.chefclipse.Config;
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.limepepper.chefclipse.common.knife.KnifeSearch;
import org.limepepper.chefclipse.common.knife.Plugin;
<<<<<<< HEAD
import org.limepepper.chefclipse.utility.Config;
=======
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.common.knife.KnifePackage
 * @generated
 */
public class KnifeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KnifePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnifeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KnifePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
<<<<<<< HEAD
			return ((EObject) object).eClass().getEPackage() == modelPackage;
=======
			return ((EObject)object).eClass().getEPackage() == modelPackage;
>>>>>>> origin/tomhodder
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	protected KnifeSwitch<Adapter> modelSwitch = new KnifeSwitch<Adapter>() {
		@Override
		public Adapter caseKnifeConfig(KnifeConfig object) {
			return createKnifeConfigAdapter();
		}

		@Override
		public Adapter casePlugin(Plugin object) {
			return createPluginAdapter();
		}

		@Override
		public Adapter caseKnifeSearch(KnifeSearch object) {
			return createKnifeSearchAdapter();
		}

		@Override
		public Adapter caseConfig(Config object) {
			return createConfigAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};
=======
	protected KnifeSwitch<Adapter> modelSwitch =
		new KnifeSwitch<Adapter>() {
			@Override
			public Adapter caseKnifeConfig(KnifeConfig object) {
				return createKnifeConfigAdapter();
			}
			@Override
			public Adapter casePlugin(Plugin object) {
				return createPluginAdapter();
			}
			@Override
			public Adapter caseKnifeSearch(KnifeSearch object) {
				return createKnifeSearchAdapter();
			}
			@Override
			public Adapter caseConfig(Config object) {
				return createConfigAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};
>>>>>>> origin/tomhodder

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
<<<<<<< HEAD
		return modelSwitch.doSwitch((EObject) target);
	}

=======
		return modelSwitch.doSwitch((EObject)target);
	}


>>>>>>> origin/tomhodder
	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.knife.KnifeConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.knife.KnifeConfig
	 * @generated
	 */
	public Adapter createKnifeConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.knife.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.knife.Plugin
	 * @generated
	 */
	public Adapter createPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.knife.KnifeSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.knife.KnifeSearch
	 * @generated
	 */
	public Adapter createKnifeSearchAdapter() {
		return null;
	}

	/**
<<<<<<< HEAD
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.utility.Config <em>Config</em>}'.
=======
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.Config <em>Config</em>}'.
>>>>>>> origin/tomhodder
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
<<<<<<< HEAD
	 * @see org.limepepper.chefclipse.utility.Config
=======
	 * @see org.limepepper.chefclipse.Config
>>>>>>> origin/tomhodder
	 * @generated
	 */
	public Adapter createConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //KnifeAdapterFactory
