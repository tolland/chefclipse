/**
 */
package org.limepepper.chefclipse.workstation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.limepepper.chefclipse.cookbook.Cookbook;

import org.limepepper.chefclipse.workstation.Config;
import org.limepepper.chefclipse.workstation.Repository;
import org.limepepper.chefclipse.workstation.WorkstationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.workstation.impl.RepositoryImpl#getCookbooks <em>Cookbooks</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.workstation.impl.RepositoryImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryImpl extends EObjectImpl implements Repository {
	/**
	 * The cached value of the '{@link #getCookbooks() <em>Cookbooks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookbooks()
	 * @generated
	 * @ordered
	 */
	protected Cookbook cookbooks;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Config configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkstationPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cookbook getCookbooks() {
		return cookbooks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCookbooks(Cookbook newCookbooks, NotificationChain msgs) {
		Cookbook oldCookbooks = cookbooks;
		cookbooks = newCookbooks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkstationPackage.REPOSITORY__COOKBOOKS, oldCookbooks, newCookbooks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCookbooks(Cookbook newCookbooks) {
		if (newCookbooks != cookbooks) {
			NotificationChain msgs = null;
			if (cookbooks != null)
				msgs = ((InternalEObject)cookbooks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkstationPackage.REPOSITORY__COOKBOOKS, null, msgs);
			if (newCookbooks != null)
				msgs = ((InternalEObject)newCookbooks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkstationPackage.REPOSITORY__COOKBOOKS, null, msgs);
			msgs = basicSetCookbooks(newCookbooks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkstationPackage.REPOSITORY__COOKBOOKS, newCookbooks, newCookbooks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Config newConfiguration, NotificationChain msgs) {
		Config oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkstationPackage.REPOSITORY__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Config newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkstationPackage.REPOSITORY__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkstationPackage.REPOSITORY__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkstationPackage.REPOSITORY__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkstationPackage.REPOSITORY__COOKBOOKS:
				return basicSetCookbooks(null, msgs);
			case WorkstationPackage.REPOSITORY__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
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
			case WorkstationPackage.REPOSITORY__COOKBOOKS:
				return getCookbooks();
			case WorkstationPackage.REPOSITORY__CONFIGURATION:
				return getConfiguration();
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
			case WorkstationPackage.REPOSITORY__COOKBOOKS:
				setCookbooks((Cookbook)newValue);
				return;
			case WorkstationPackage.REPOSITORY__CONFIGURATION:
				setConfiguration((Config)newValue);
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
			case WorkstationPackage.REPOSITORY__COOKBOOKS:
				setCookbooks((Cookbook)null);
				return;
			case WorkstationPackage.REPOSITORY__CONFIGURATION:
				setConfiguration((Config)null);
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
			case WorkstationPackage.REPOSITORY__COOKBOOKS:
				return cookbooks != null;
			case WorkstationPackage.REPOSITORY__CONFIGURATION:
				return configuration != null;
		}
		return super.eIsSet(featureID);
	}

} //RepositoryImpl
