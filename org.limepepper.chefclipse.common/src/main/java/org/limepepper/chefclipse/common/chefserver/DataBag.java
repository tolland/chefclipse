/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Bag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.DataBag#getServer <em>Server</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getDataBag()
 * @model kind="class"
 * @generated
 */
public class DataBag extends EObjectImpl implements EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBag() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChefserverPackage.Literals.DATA_BAG;
	}

	/**
	 * Returns the value of the '<em><b>Server</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.common.chefserver.Server#getDatabags <em>Databags</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' container reference.
	 * @see #setServer(Server)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getDataBag_Server()
	 * @see org.limepepper.chefclipse.common.chefserver.Server#getDatabags
	 * @model opposite="databags" transient="false"
	 * @generated
	 */
	public Server getServer() {
		if (eContainerFeatureID() != ChefserverPackage.DATA_BAG__SERVER) return null;
		return (Server)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(Server newServer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newServer, ChefserverPackage.DATA_BAG__SERVER, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.DataBag#getServer <em>Server</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' container reference.
	 * @see #getServer()
	 * @generated
	 */
	public void setServer(Server newServer) {
		if (newServer != eInternalContainer() || (eContainerFeatureID() != ChefserverPackage.DATA_BAG__SERVER && newServer != null)) {
			if (EcoreUtil.isAncestor(this, newServer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, ChefserverPackage.SERVER__DATABAGS, Server.class, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChefserverPackage.DATA_BAG__SERVER, newServer, newServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChefserverPackage.DATA_BAG__SERVER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetServer((Server)otherEnd, msgs);
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
			case ChefserverPackage.DATA_BAG__SERVER:
				return basicSetServer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ChefserverPackage.DATA_BAG__SERVER:
				return eInternalContainer().eInverseRemove(this, ChefserverPackage.SERVER__DATABAGS, Server.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChefserverPackage.DATA_BAG__SERVER:
				return getServer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChefserverPackage.DATA_BAG__SERVER:
				setServer((Server)newValue);
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
			case ChefserverPackage.DATA_BAG__SERVER:
				setServer((Server)null);
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
			case ChefserverPackage.DATA_BAG__SERVER:
				return getServer() != null;
		}
		return super.eIsSet(featureID);
	}

} // DataBag
