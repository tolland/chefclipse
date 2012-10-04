/**
 */
package org.limepepper.chefclipse.chefserver;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
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

import org.limepepper.chefclipse.chefclient.Client;

import org.limepepper.chefclipse.cookbook.Cookbook;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Server#getCookbooksList <em>Cookbooks</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Server#getRolesList <em>Roles</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Server#getNodesList <em>Nodes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Server#getDatabagsList <em>Databags</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Server#getEnvironmentsList <em>Environments</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Server#getClientsList <em>Clients</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Server#getWebuiport <em>Webuiport</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getServer()
 * @model kind="class"
 * @generated
 */
public class Server extends EObjectImpl implements EObject {
	/**
	 * The cached value of the '{@link #getCookbooksList() <em>Cookbooks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookbooksList()
	 * @generated
	 * @ordered
	 */
	protected EList<Cookbook> cookbooks;

	/**
	 * The empty value for the '{@link #getCookbooks() <em>Cookbooks</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookbooks()
	 * @generated
	 * @ordered
	 */
	protected static final Cookbook[] COOKBOOKS_EEMPTY_ARRAY = new Cookbook [0];

	/**
	 * The cached value of the '{@link #getRolesList() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolesList()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The empty value for the '{@link #getRoles() <em>Roles</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected static final Role[] ROLES_EEMPTY_ARRAY = new Role [0];

	/**
	 * The cached value of the '{@link #getNodesList() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesList()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The empty value for the '{@link #getNodes() <em>Nodes</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected static final Node[] NODES_EEMPTY_ARRAY = new Node [0];

	/**
	 * The cached value of the '{@link #getDatabagsList() <em>Databags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabagsList()
	 * @generated
	 * @ordered
	 */
	protected EList<DataBag> databags;

	/**
	 * The empty value for the '{@link #getDatabags() <em>Databags</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabags()
	 * @generated
	 * @ordered
	 */
	protected static final DataBag[] DATABAGS_EEMPTY_ARRAY = new DataBag [0];

	/**
	 * The cached value of the '{@link #getEnvironmentsList() <em>Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environments;

	/**
	 * The empty value for the '{@link #getEnvironments() <em>Environments</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironments()
	 * @generated
	 * @ordered
	 */
	protected static final Environment[] ENVIRONMENTS_EEMPTY_ARRAY = new Environment [0];

	/**
	 * The cached value of the '{@link #getClientsList() <em>Clients</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Client> clients;

	/**
	 * The empty value for the '{@link #getClients() <em>Clients</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClients()
	 * @generated
	 * @ordered
	 */
	protected static final Client[] CLIENTS_EEMPTY_ARRAY = new Client [0];

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
		return ChefPackage.Literals.SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cookbook[] getCookbooks() {
		if (cookbooks == null || cookbooks.isEmpty()) return COOKBOOKS_EEMPTY_ARRAY;
		BasicEList<Cookbook> list = (BasicEList<Cookbook>)cookbooks;
		list.shrink();
		return (Cookbook[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cookbook getCookbooks(int index) {
		return getCookbooksList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCookbooksLength() {
		return cookbooks == null ? 0 : cookbooks.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCookbooks(Cookbook[] newCookbooks) {
		((BasicEList<Cookbook>)getCookbooksList()).setData(newCookbooks.length, newCookbooks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCookbooks(int index, Cookbook element) {
		getCookbooksList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Cookbooks</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.cookbook.Cookbook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbooks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbooks</em>' reference list.
	 * @see #isSetCookbooks()
	 * @see #unsetCookbooks()
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getServer_Cookbooks()
	 * @model unsettable="true"
	 * @generated
	 */
	public EList<Cookbook> getCookbooksList() {
		if (cookbooks == null) {
			cookbooks = new EObjectResolvingEList.Unsettable<Cookbook>(Cookbook.class, this, ChefPackage.SERVER__COOKBOOKS);
		}
		return cookbooks;
	}

	/**
	 * Unsets the value of the '{@link org.limepepper.chefclipse.chefserver.Server#getCookbooksList <em>Cookbooks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCookbooks()
	 * @see #getCookbooksList()
	 * @generated
	 */
	public void unsetCookbooks() {
		if (cookbooks != null) ((InternalEList.Unsettable<?>)cookbooks).unset();
	}

	/**
	 * Returns whether the value of the '{@link org.limepepper.chefclipse.chefserver.Server#getCookbooksList <em>Cookbooks</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cookbooks</em>' reference list is set.
	 * @see #unsetCookbooks()
	 * @see #getCookbooksList()
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
	public Role[] getRoles() {
		if (roles == null || roles.isEmpty()) return ROLES_EEMPTY_ARRAY;
		BasicEList<Role> list = (BasicEList<Role>)roles;
		list.shrink();
		return (Role[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRoles(int index) {
		return getRolesList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRolesLength() {
		return roles == null ? 0 : roles.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(Role[] newRoles) {
		((BasicEList<Role>)getRolesList()).setData(newRoles.length, newRoles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(int index, Role element) {
		getRolesList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.chefserver.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getServer_Roles()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Role> getRolesList() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, ChefPackage.SERVER__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node[] getNodes() {
		if (nodes == null || nodes.isEmpty()) return NODES_EEMPTY_ARRAY;
		BasicEList<Node> list = (BasicEList<Node>)nodes;
		list.shrink();
		return (Node[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNodes(int index) {
		return getNodesList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNodesLength() {
		return nodes == null ? 0 : nodes.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodes(Node[] newNodes) {
		((BasicEList<Node>)getNodesList()).setData(newNodes.length, newNodes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodes(int index, Node element) {
		getNodesList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.chefserver.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getServer_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Node> getNodesList() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, ChefPackage.SERVER__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBag[] getDatabags() {
		if (databags == null || databags.isEmpty()) return DATABAGS_EEMPTY_ARRAY;
		BasicEList<DataBag> list = (BasicEList<DataBag>)databags;
		list.shrink();
		return (DataBag[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBag getDatabags(int index) {
		return getDatabagsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDatabagsLength() {
		return databags == null ? 0 : databags.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabags(DataBag[] newDatabags) {
		((BasicEList<DataBag>)getDatabagsList()).setData(newDatabags.length, newDatabags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabags(int index, DataBag element) {
		getDatabagsList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Databags</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.chefserver.DataBag}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.chefserver.DataBag#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databags</em>' containment reference list.
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getServer_Databags()
	 * @see org.limepepper.chefclipse.chefserver.DataBag#getServer
	 * @model opposite="server" containment="true"
	 * @generated
	 */
	public EList<DataBag> getDatabagsList() {
		if (databags == null) {
			databags = new EObjectContainmentWithInverseEList<DataBag>(DataBag.class, this, ChefPackage.SERVER__DATABAGS, ChefPackage.DATA_BAG__SERVER);
		}
		return databags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment[] getEnvironments() {
		if (environments == null || environments.isEmpty()) return ENVIRONMENTS_EEMPTY_ARRAY;
		BasicEList<Environment> list = (BasicEList<Environment>)environments;
		list.shrink();
		return (Environment[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironments(int index) {
		return getEnvironmentsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnvironmentsLength() {
		return environments == null ? 0 : environments.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironments(Environment[] newEnvironments) {
		((BasicEList<Environment>)getEnvironmentsList()).setData(newEnvironments.length, newEnvironments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironments(int index, Environment element) {
		getEnvironmentsList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Environments</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.chefserver.Environment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environments</em>' containment reference list.
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getServer_Environments()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Environment> getEnvironmentsList() {
		if (environments == null) {
			environments = new EObjectContainmentEList<Environment>(Environment.class, this, ChefPackage.SERVER__ENVIRONMENTS);
		}
		return environments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client[] getClients() {
		if (clients == null || clients.isEmpty()) return CLIENTS_EEMPTY_ARRAY;
		BasicEList<Client> list = (BasicEList<Client>)clients;
		list.shrink();
		return (Client[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client getClients(int index) {
		return getClientsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClientsLength() {
		return clients == null ? 0 : clients.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClients(Client[] newClients) {
		((BasicEList<Client>)getClientsList()).setData(newClients.length, newClients);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClients(int index, Client element) {
		getClientsList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Clients</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.chefclient.Client}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' reference list.
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getServer_Clients()
	 * @model
	 * @generated
	 */
	public EList<Client> getClientsList() {
		if (clients == null) {
			clients = new EObjectResolvingEList<Client>(Client.class, this, ChefPackage.SERVER__CLIENTS);
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
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getServer_Webuiport()
	 * @model
	 * @generated
	 */
	public int getWebuiport() {
		return webuiport;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.chefserver.Server#getWebuiport <em>Webuiport</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChefPackage.SERVER__WEBUIPORT, oldWebuiport, webuiport));
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
			case ChefPackage.SERVER__DATABAGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDatabagsList()).basicAdd(otherEnd, msgs);
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
			case ChefPackage.SERVER__ROLES:
				return ((InternalEList<?>)getRolesList()).basicRemove(otherEnd, msgs);
			case ChefPackage.SERVER__NODES:
				return ((InternalEList<?>)getNodesList()).basicRemove(otherEnd, msgs);
			case ChefPackage.SERVER__DATABAGS:
				return ((InternalEList<?>)getDatabagsList()).basicRemove(otherEnd, msgs);
			case ChefPackage.SERVER__ENVIRONMENTS:
				return ((InternalEList<?>)getEnvironmentsList()).basicRemove(otherEnd, msgs);
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
			case ChefPackage.SERVER__COOKBOOKS:
				return getCookbooksList();
			case ChefPackage.SERVER__ROLES:
				return getRolesList();
			case ChefPackage.SERVER__NODES:
				return getNodesList();
			case ChefPackage.SERVER__DATABAGS:
				return getDatabagsList();
			case ChefPackage.SERVER__ENVIRONMENTS:
				return getEnvironmentsList();
			case ChefPackage.SERVER__CLIENTS:
				return getClientsList();
			case ChefPackage.SERVER__WEBUIPORT:
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
			case ChefPackage.SERVER__COOKBOOKS:
				getCookbooksList().clear();
				getCookbooksList().addAll((Collection<? extends Cookbook>)newValue);
				return;
			case ChefPackage.SERVER__ROLES:
				getRolesList().clear();
				getRolesList().addAll((Collection<? extends Role>)newValue);
				return;
			case ChefPackage.SERVER__NODES:
				getNodesList().clear();
				getNodesList().addAll((Collection<? extends Node>)newValue);
				return;
			case ChefPackage.SERVER__DATABAGS:
				getDatabagsList().clear();
				getDatabagsList().addAll((Collection<? extends DataBag>)newValue);
				return;
			case ChefPackage.SERVER__ENVIRONMENTS:
				getEnvironmentsList().clear();
				getEnvironmentsList().addAll((Collection<? extends Environment>)newValue);
				return;
			case ChefPackage.SERVER__CLIENTS:
				getClientsList().clear();
				getClientsList().addAll((Collection<? extends Client>)newValue);
				return;
			case ChefPackage.SERVER__WEBUIPORT:
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
			case ChefPackage.SERVER__COOKBOOKS:
				unsetCookbooks();
				return;
			case ChefPackage.SERVER__ROLES:
				getRolesList().clear();
				return;
			case ChefPackage.SERVER__NODES:
				getNodesList().clear();
				return;
			case ChefPackage.SERVER__DATABAGS:
				getDatabagsList().clear();
				return;
			case ChefPackage.SERVER__ENVIRONMENTS:
				getEnvironmentsList().clear();
				return;
			case ChefPackage.SERVER__CLIENTS:
				getClientsList().clear();
				return;
			case ChefPackage.SERVER__WEBUIPORT:
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
			case ChefPackage.SERVER__COOKBOOKS:
				return isSetCookbooks();
			case ChefPackage.SERVER__ROLES:
				return roles != null && !roles.isEmpty();
			case ChefPackage.SERVER__NODES:
				return nodes != null && !nodes.isEmpty();
			case ChefPackage.SERVER__DATABAGS:
				return databags != null && !databags.isEmpty();
			case ChefPackage.SERVER__ENVIRONMENTS:
				return environments != null && !environments.isEmpty();
			case ChefPackage.SERVER__CLIENTS:
				return clients != null && !clients.isEmpty();
			case ChefPackage.SERVER__WEBUIPORT:
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
