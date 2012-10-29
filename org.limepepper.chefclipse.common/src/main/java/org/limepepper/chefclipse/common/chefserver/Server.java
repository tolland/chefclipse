/**
 */
package org.limepepper.chefclipse.common.chefserver;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.limepepper.chefclipse.common.chefclient.Client;

import org.limepepper.chefclipse.common.cookbook.Cookbook;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getCookbooks <em>Cookbooks</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getDatabags <em>Databags</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getEnvironments <em>Environments</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getClients <em>Clients</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Server#getWebuiport <em>Webuiport</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer()
 * @model kind="class"
 * @generated
 */
public class Server extends EObjectImpl implements EObject {
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
	protected Server() {
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
	 * Returns the value of the '<em><b>Cookbooks</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Cookbook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbooks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbooks</em>' reference list.
	 * @see #isSetCookbooks()
	 * @see #unsetCookbooks()
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Cookbooks()
	 * @model unsettable="true"
	 * @generated
	 */
	public EList<Cookbook> getCookbooks() {
		if (cookbooks == null) {
			cookbooks = new EObjectResolvingEList.Unsettable<Cookbook>(Cookbook.class, this, ChefserverPackage.SERVER__COOKBOOKS);
		}
		return cookbooks;
	}

	/**
	 * Unsets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Server#getCookbooks <em>Cookbooks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCookbooks()
	 * @see #getCookbooks()
	 * @generated
	 */
	public void unsetCookbooks() {
		if (cookbooks != null) ((InternalEList.Unsettable<?>)cookbooks).unset();
	}

	/**
	 * Returns whether the value of the '{@link org.limepepper.chefclipse.common.chefserver.Server#getCookbooks <em>Cookbooks</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cookbooks</em>' reference list is set.
	 * @see #unsetCookbooks()
	 * @see #getCookbooks()
	 * @generated
	 */
	public boolean isSetCookbooks() {
		return cookbooks != null && ((InternalEList.Unsettable<?>)cookbooks).isSet();
	}

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Roles()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, ChefserverPackage.SERVER__ROLES);
		}
		return roles;
	}

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, ChefserverPackage.SERVER__NODES);
		}
		return nodes;
	}

	/**
	 * Returns the value of the '<em><b>Databags</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.DataBag}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.common.chefserver.DataBag#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databags</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Databags()
	 * @see org.limepepper.chefclipse.common.chefserver.DataBag#getServer
	 * @model opposite="server" containment="true"
	 * @generated
	 */
	public EList<DataBag> getDatabags() {
		if (databags == null) {
			databags = new EObjectContainmentWithInverseEList<DataBag>(DataBag.class, this, ChefserverPackage.SERVER__DATABAGS, ChefserverPackage.DATA_BAG__SERVER);
		}
		return databags;
	}

	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.Environment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Environments()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Environment> getEnvironments() {
		if (environments == null) {
			environments = new EObjectContainmentEList<Environment>(Environment.class, this, ChefserverPackage.SERVER__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * Returns the value of the '<em><b>Clients</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefclient.Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Clients()
	 * @model
	 * @generated
	 */
	public EList<Client> getClients() {
		if (clients == null) {
			clients = new EObjectResolvingEList<Client>(Client.class, this, ChefserverPackage.SERVER__CLIENTS);
		}
		return clients;
	}

	/**
	 * Returns the value of the '<em><b>Webuiport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Webuiport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Webuiport</em>' attribute.
	 * @see #setWebuiport(int)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServer_Webuiport()
	 * @model
	 * @generated
	 */
	public int getWebuiport() {
		return webuiport;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Server#getWebuiport <em>Webuiport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Webuiport</em>' attribute.
	 * @see #getWebuiport()
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

} // Server
