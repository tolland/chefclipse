/**
 */
package org.limepepper.chefclipse.chefserver;

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
import org.eclipse.emf.ecore.util.InternalEList;

import org.limepepper.chefclipse.chefclient.Client;

import org.limepepper.chefclipse.cookbook.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Node#getRun_list <em>Run list</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Node#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Node#getServer <em>Server</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Node#getClient <em>Client</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.chefserver.Node#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getNode()
 * @model kind="class"
 * @generated
 */
public class Node extends EObjectImpl implements EObject {
	/**
	 * The cached value of the '{@link #getRun_list() <em>Run list</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun_list()
	 * @generated
	 * @ordered
	 */
	protected EList<RunList> run_list;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected Server server;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected Client client;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChefPackage.Literals.NODE;
	}

	/**
	 * Returns the value of the '<em><b>Run list</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.chefserver.RunList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run list</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run list</em>' containment reference list.
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getNode_Run_list()
	 * @model containment="true"
	 * @generated
	 */
	public EList<RunList> getRun_list() {
		if (run_list == null) {
			run_list = new EObjectContainmentEList<RunList>(RunList.class, this, ChefPackage.NODE__RUN_LIST);
		}
		return run_list;
	}

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(Environment)
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getNode_Environment()
	 * @model
	 * @generated
	 */
	public Environment getEnvironment() {
		if (environment != null && environment.eIsProxy()) {
			InternalEObject oldEnvironment = (InternalEObject)environment;
			environment = (Environment)eResolveProxy(oldEnvironment);
			if (environment != oldEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChefPackage.NODE__ENVIRONMENT, oldEnvironment, environment));
			}
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment basicGetEnvironment() {
		return environment;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.chefserver.Node#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChefPackage.NODE__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(Server)
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getNode_Server()
	 * @model required="true"
	 * @generated
	 */
	public Server getServer() {
		if (server != null && server.eIsProxy()) {
			InternalEObject oldServer = (InternalEObject)server;
			server = (Server)eResolveProxy(oldServer);
			if (server != oldServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChefPackage.NODE__SERVER, oldServer, server));
			}
		}
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server basicGetServer() {
		return server;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.chefserver.Node#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
	public void setServer(Server newServer) {
		Server oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChefPackage.NODE__SERVER, oldServer, server));
	}

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(Client)
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getNode_Client()
	 * @model
	 * @generated
	 */
	public Client getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (Client)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChefPackage.NODE__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client basicGetClient() {
		return client;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.chefserver.Node#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	public void setClient(Client newClient) {
		Client oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChefPackage.NODE__CLIENT, oldClient, client));
	}

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference.
	 * @see #setAttributes(Attribute)
	 * @see org.limepepper.chefclipse.chefserver.ChefPackage#getNode_Attributes()
	 * @model
	 * @generated
	 */
	public Attribute getAttributes() {
		if (attributes != null && attributes.eIsProxy()) {
			InternalEObject oldAttributes = (InternalEObject)attributes;
			attributes = (Attribute)eResolveProxy(oldAttributes);
			if (attributes != oldAttributes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChefPackage.NODE__ATTRIBUTES, oldAttributes, attributes));
			}
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributes() {
		return attributes;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.chefserver.Node#getAttributes <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' reference.
	 * @see #getAttributes()
	 * @generated
	 */
	public void setAttributes(Attribute newAttributes) {
		Attribute oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChefPackage.NODE__ATTRIBUTES, oldAttributes, attributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChefPackage.NODE__RUN_LIST:
				return ((InternalEList<?>)getRun_list()).basicRemove(otherEnd, msgs);
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
			case ChefPackage.NODE__RUN_LIST:
				return getRun_list();
			case ChefPackage.NODE__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case ChefPackage.NODE__SERVER:
				if (resolve) return getServer();
				return basicGetServer();
			case ChefPackage.NODE__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case ChefPackage.NODE__ATTRIBUTES:
				if (resolve) return getAttributes();
				return basicGetAttributes();
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
			case ChefPackage.NODE__RUN_LIST:
				getRun_list().clear();
				getRun_list().addAll((Collection<? extends RunList>)newValue);
				return;
			case ChefPackage.NODE__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case ChefPackage.NODE__SERVER:
				setServer((Server)newValue);
				return;
			case ChefPackage.NODE__CLIENT:
				setClient((Client)newValue);
				return;
			case ChefPackage.NODE__ATTRIBUTES:
				setAttributes((Attribute)newValue);
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
			case ChefPackage.NODE__RUN_LIST:
				getRun_list().clear();
				return;
			case ChefPackage.NODE__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case ChefPackage.NODE__SERVER:
				setServer((Server)null);
				return;
			case ChefPackage.NODE__CLIENT:
				setClient((Client)null);
				return;
			case ChefPackage.NODE__ATTRIBUTES:
				setAttributes((Attribute)null);
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
			case ChefPackage.NODE__RUN_LIST:
				return run_list != null && !run_list.isEmpty();
			case ChefPackage.NODE__ENVIRONMENT:
				return environment != null;
			case ChefPackage.NODE__SERVER:
				return server != null;
			case ChefPackage.NODE__CLIENT:
				return client != null;
			case ChefPackage.NODE__ATTRIBUTES:
				return attributes != null;
		}
		return super.eIsSet(featureID);
	}

} // Node
