/**
 */
package org.limepepper.chefclipse.common.chefserver.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.limepepper.chefclipse.common.chefclient.ChefClient;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.Sandbox;
import org.limepepper.chefclipse.common.chefserver.Server;
import org.limepepper.chefclipse.common.chefserver.ServerConfig;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerImpl#getCookbooks <em>Cookbooks</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerImpl#getDatabags <em>Databags</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerImpl#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerImpl#getClients <em>Clients</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerImpl#getWebuiport <em>Webuiport</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerImpl#getSandboxes <em>Sandboxes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.ServerImpl#getKnifeConfig <em>Knife Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerImpl extends EObjectImpl implements Server {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChefserverPackage.Literals.SERVER;
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
	@SuppressWarnings("unchecked")
	public EList<ServerCookbookVersion> getCookbooks() {
		return (EList<ServerCookbookVersion>) eGet(
				ChefserverPackage.Literals.SERVER__COOKBOOKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCookbooks() {
		eUnset(ChefserverPackage.Literals.SERVER__COOKBOOKS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCookbooks() {
		return eIsSet(ChefserverPackage.Literals.SERVER__COOKBOOKS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getRoles() {
		return (EList<Role>) eGet(ChefserverPackage.Literals.SERVER__ROLES,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getNodes() {
		return (EList<Node>) eGet(ChefserverPackage.Literals.SERVER__NODES,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DataBag> getDatabags() {
		return (EList<DataBag>) eGet(
				ChefserverPackage.Literals.SERVER__DATABAGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Environment> getEnvironments() {
		return (EList<Environment>) eGet(
				ChefserverPackage.Literals.SERVER__ENVIRONMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ChefClient> getClients() {
		return (EList<ChefClient>) eGet(
				ChefserverPackage.Literals.SERVER__CLIENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWebuiport() {
		return (Integer) eGet(ChefserverPackage.Literals.SERVER__WEBUIPORT,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebuiport(int newWebuiport) {
		eSet(ChefserverPackage.Literals.SERVER__WEBUIPORT, newWebuiport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Sandbox> getSandboxes() {
		return (EList<Sandbox>) eGet(
				ChefserverPackage.Literals.SERVER__SANDBOXES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerConfig getConfig() {
		return (ServerConfig) eGet(ChefserverPackage.Literals.SERVER__CONFIG,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(ServerConfig newConfig) {
		eSet(ChefserverPackage.Literals.SERVER__CONFIG, newConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<KnifeConfig> getKnifeConfig() {
		return (EList<KnifeConfig>) eGet(
				ChefserverPackage.Literals.SERVER__KNIFE_CONFIG, true);
	}

} //ServerImpl
