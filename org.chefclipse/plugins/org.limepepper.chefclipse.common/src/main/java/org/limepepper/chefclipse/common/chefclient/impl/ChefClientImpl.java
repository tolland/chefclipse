/**
 */
package org.limepepper.chefclipse.common.chefclient.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.common.chefclient.ChefClient;
import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;
import org.limepepper.chefclipse.common.chefserver.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chef Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefclient.impl.ChefClientImpl#getServer <em>Server</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChefClientImpl extends EObjectImpl implements ChefClient {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChefclientPackage.Literals.CHEF_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getServer() {
		return (Server) eGet(ChefclientPackage.Literals.CHEF_CLIENT__SERVER,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		eSet(ChefclientPackage.Literals.CHEF_CLIENT__SERVER, newServer);
	}

} //ChefClientImpl
