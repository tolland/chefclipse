/**
 */
package org.limepepper.chefclipse.model.chefserver.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.limepepper.chefclipse.model.chefclient.Client;

import org.limepepper.chefclipse.model.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.model.chefserver.DataBag;
import org.limepepper.chefclipse.model.chefserver.Environment;
import org.limepepper.chefclipse.model.chefserver.Node;
import org.limepepper.chefclipse.model.chefserver.Role;
import org.limepepper.chefclipse.model.chefserver.Server;

import org.limepepper.chefclipse.model.cookbook.Cookbook;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.impl.ServerImpl#getCookbooks <em>Cookbooks</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.impl.ServerImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.impl.ServerImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.impl.ServerImpl#getDatabags <em>Databags</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.impl.ServerImpl#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.impl.ServerImpl#getClients <em>Clients</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.chefserver.impl.ServerImpl#getWebuiport <em>Webuiport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServerImpl extends EObjectImpl implements Server {
	/**
	 * The cached value of the '{@link #getCookbooks() <em>Cookbooks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookbooks()
	 * @generated
	 * @ordered
	 */
	protected EList<Cookbook> cookbooks;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getDatabags() <em>Databags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabags()
	 * @generated
	 * @ordered
	 */
	protected EList<DataBag> databags;

	/**
	 * The cached value of the '{@link #getEnvironments() <em>Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environments;

	/**
	 * The cached value of the '{@link #getClients() <em>Clients</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> clients;

	/**
	 * The default value of the '{@link #getWebuiport() <em>Webuiport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebuiport()
	 * @generated
	 * @ordered
	 */
	protected static final int WEBUIPORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWebuiport() <em>Webuiport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebuiport()
	 * @generated
	 * @ordered
	 */
	protected int webuiport = WEBUIPORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
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
	public EList<Cookbook> getCookbooks() {
		if (cookbooks == null) {
			cookbooks = new EObjectResolvingEList.Unsettable<Cookbook>(Cookbook.class, this, ChefserverPackage.SERVER__COOKBOOKS);
		}
		return cookbooks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCookbooks() {
		if (cookbooks != null) ((InternalEList.Unsettable<?>)cookbooks).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCookbooks() {
		return cookbooks != null && ((InternalEList.Unsettable<?>)cookbooks).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, ChefserverPackage.SERVER__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, ChefserverPackage.SERVER__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataBag> getDatabags() {
		if (databags == null) {
			databags = new EObjectContainmentWithInverseEList<DataBag>(DataBag.class, this, ChefserverPackage.SERVER__DATABAGS, ChefserverPackage.DATA_BAG__SERVER);
		}
		return databags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Environment> getEnvironments() {
		if (environments == null) {
			environments = new EObjectContainmentEList<Environment>(Environment.class, this, ChefserverPackage.SERVER__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Client> getClients() {
		if (clients == null) {
			clients = new EObjectResolvingEList<Client>(Client.class, this, ChefserverPackage.SERVER__CLIENTS);
		}
		return clients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWebuiport() {
		return webuiport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebuiport(int newWebuiport) {
		int oldWebuiport = webuiport;
		webuiport = newWebuiport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChefserverPackage.SERVER__WEBUIPORT, oldWebuiport, webuiport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChefserverPackage.SERVER__DATABAGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDatabags()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChefserverPackage.SERVER__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case ChefserverPackage.SERVER__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case ChefserverPackage.SERVER__DATABAGS:
				return ((InternalEList<?>)getDatabags()).basicRemove(otherEnd, msgs);
			case ChefserverPackage.SERVER__ENVIRONMENTS:
				return ((InternalEList<?>)getEnvironments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChefserverPackage.SERVER__COOKBOOKS:
				return getCookbooks();
			case ChefserverPackage.SERVER__ROLES:
				return getRoles();
			case ChefserverPackage.SERVER__NODES:
				return getNodes();
			case ChefserverPackage.SERVER__DATABAGS:
				return getDatabags();
			case ChefserverPackage.SERVER__ENVIRONMENTS:
				return getEnvironments();
			case ChefserverPackage.SERVER__CLIENTS:
				return getClients();
			case ChefserverPackage.SERVER__WEBUIPORT:
				return getWebuiport();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChefserverPackage.SERVER__COOKBOOKS:
				getCookbooks().clear();
				getCookbooks().addAll((Collection<? extends Cookbook>)newValue);
				return;
			case ChefserverPackage.SERVER__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ChefserverPackage.SERVER__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case ChefserverPackage.SERVER__DATABAGS:
				getDatabags().clear();
				getDatabags().addAll((Collection<? extends DataBag>)newValue);
				return;
			case ChefserverPackage.SERVER__ENVIRONMENTS:
				getEnvironments().clear();
				getEnvironments().addAll((Collection<? extends Environment>)newValue);
				return;
			case ChefserverPackage.SERVER__CLIENTS:
				getClients().clear();
				getClients().addAll((Collection<? extends Client>)newValue);
				return;
			case ChefserverPackage.SERVER__WEBUIPORT:
				setWebuiport((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ChefserverPackage.SERVER__COOKBOOKS:
				unsetCookbooks();
				return;
			case ChefserverPackage.SERVER__ROLES:
				getRoles().clear();
				return;
			case ChefserverPackage.SERVER__NODES:
				getNodes().clear();
				return;
			case ChefserverPackage.SERVER__DATABAGS:
				getDatabags().clear();
				return;
			case ChefserverPackage.SERVER__ENVIRONMENTS:
				getEnvironments().clear();
				return;
			case ChefserverPackage.SERVER__CLIENTS:
				getClients().clear();
				return;
			case ChefserverPackage.SERVER__WEBUIPORT:
				setWebuiport(WEBUIPORT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ChefserverPackage.SERVER__COOKBOOKS:
				return isSetCookbooks();
			case ChefserverPackage.SERVER__ROLES:
				return roles != null && !roles.isEmpty();
			case ChefserverPackage.SERVER__NODES:
				return nodes != null && !nodes.isEmpty();
			case ChefserverPackage.SERVER__DATABAGS:
				return databags != null && !databags.isEmpty();
			case ChefserverPackage.SERVER__ENVIRONMENTS:
				return environments != null && !environments.isEmpty();
			case ChefserverPackage.SERVER__CLIENTS:
				return clients != null && !clients.isEmpty();
			case ChefserverPackage.SERVER__WEBUIPORT:
				return webuiport != WEBUIPORT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (webuiport: ");
		result.append(webuiport);
		result.append(')');
		return result.toString();
	}

} //ServerImpl
