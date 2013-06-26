/**
 */
package org.limepepper.chefclipse.common.chefclient.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.chefclient.*;
import org.limepepper.chefclipse.common.chefclient.ChefClient;
import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;
import org.limepepper.chefclipse.common.chefclient.ClientConfig;
import org.limepepper.chefclipse.common.chefclient.Ohai;
import org.limepepper.chefclipse.common.chefclient.Search;
import org.limepepper.chefclipse.utility.Config;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.common.chefclient.ChefclientPackage
 * @generated
 */
public class ChefclientAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChefclientPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefclientAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ChefclientPackage.eINSTANCE;
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
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChefclientSwitch<Adapter> modelSwitch = new ChefclientSwitch<Adapter>() {
		@Override
		public Adapter caseChefClient(ChefClient object) {
			return createChefClientAdapter();
		}

		@Override
		public Adapter caseOhai(Ohai object) {
			return createOhaiAdapter();
		}

		@Override
		public Adapter caseSearch(Search object) {
			return createSearchAdapter();
		}

		@Override
		public Adapter caseClientConfig(ClientConfig object) {
			return createClientConfigAdapter();
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
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefclient.ChefClient <em>Chef Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefclient.ChefClient
	 * @generated
	 */
	public Adapter createChefClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefclient.Ohai <em>Ohai</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefclient.Ohai
	 * @generated
	 */
	public Adapter createOhaiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefclient.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefclient.Search
	 * @generated
	 */
	public Adapter createSearchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefclient.ClientConfig <em>Client Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefclient.ClientConfig
	 * @generated
	 */
	public Adapter createClientConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.utility.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.utility.Config
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

} //ChefclientAdapterFactory
