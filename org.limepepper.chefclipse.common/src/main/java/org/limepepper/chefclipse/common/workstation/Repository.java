/**
 */
package org.limepepper.chefclipse.common.workstation;

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

import org.limepepper.chefclipse.common.cookbook.Cookbook;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.Repository#getCookbooks <em>Cookbooks</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.Repository#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.Repository#getOS <em>OS</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.Repository#getBasepath <em>Basepath</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#getRepository()
 * @model kind="class"
 * @generated
 */
public class Repository extends EObjectImpl implements EObject {
	/**
	 * The cached value of the '{@link #getCookbooks() <em>Cookbooks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookbooks()
	 * @generated
	 * @ordered
	 */
	protected EList<Cookbook> cookbooks;

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
	 * The default value of the '{@link #getOS() <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOS() <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOS()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasepath() <em>Basepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasepath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASEPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasepath() <em>Basepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasepath()
	 * @generated
	 * @ordered
	 */
	protected String basepath = BASEPATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Repository() {
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
	 * Returns the value of the '<em><b>Cookbooks</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Cookbook}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbooks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbooks</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#getRepository_Cookbooks()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	public EList<Cookbook> getCookbooks() {
		if (cookbooks == null) {
			cookbooks = new EObjectContainmentEList<Cookbook>(Cookbook.class, this, WorkstationPackage.REPOSITORY__COOKBOOKS);
		}
		return cookbooks;
	}

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Config)
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#getRepository_Configuration()
	 * @model containment="true" required="true"
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
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.workstation.Repository#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
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
	 * Returns the value of the '<em><b>OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS</em>' attribute.
	 * @see #setOS(String)
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#getRepository_OS()
	 * @model
	 * @generated
	 */
	public String getOS() {
		return os;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.workstation.Repository#getOS <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS</em>' attribute.
	 * @see #getOS()
	 * @generated
	 */
	public void setOS(String newOS) {
		String oldOS = os;
		os = newOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkstationPackage.REPOSITORY__OS, oldOS, os));
	}

	/**
	 * Returns the value of the '<em><b>Basepath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basepath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basepath</em>' attribute.
	 * @see #setBasepath(String)
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#getRepository_Basepath()
	 * @model
	 * @generated
	 */
	public String getBasepath() {
		return basepath;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.workstation.Repository#getBasepath <em>Basepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basepath</em>' attribute.
	 * @see #getBasepath()
	 * @generated
	 */
	public void setBasepath(String newBasepath) {
		String oldBasepath = basepath;
		basepath = newBasepath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkstationPackage.REPOSITORY__BASEPATH, oldBasepath, basepath));
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
				return ((InternalEList<?>)getCookbooks()).basicRemove(otherEnd, msgs);
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
			case WorkstationPackage.REPOSITORY__OS:
				return getOS();
			case WorkstationPackage.REPOSITORY__BASEPATH:
				return getBasepath();
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
			case WorkstationPackage.REPOSITORY__COOKBOOKS:
				getCookbooks().clear();
				getCookbooks().addAll((Collection<? extends Cookbook>)newValue);
				return;
			case WorkstationPackage.REPOSITORY__CONFIGURATION:
				setConfiguration((Config)newValue);
				return;
			case WorkstationPackage.REPOSITORY__OS:
				setOS((String)newValue);
				return;
			case WorkstationPackage.REPOSITORY__BASEPATH:
				setBasepath((String)newValue);
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
				getCookbooks().clear();
				return;
			case WorkstationPackage.REPOSITORY__CONFIGURATION:
				setConfiguration((Config)null);
				return;
			case WorkstationPackage.REPOSITORY__OS:
				setOS(OS_EDEFAULT);
				return;
			case WorkstationPackage.REPOSITORY__BASEPATH:
				setBasepath(BASEPATH_EDEFAULT);
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
				return cookbooks != null && !cookbooks.isEmpty();
			case WorkstationPackage.REPOSITORY__CONFIGURATION:
				return configuration != null;
			case WorkstationPackage.REPOSITORY__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case WorkstationPackage.REPOSITORY__BASEPATH:
				return BASEPATH_EDEFAULT == null ? basepath != null : !BASEPATH_EDEFAULT.equals(basepath);
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
		result.append(" (OS: ");
		result.append(os);
		result.append(", basepath: ");
		result.append(basepath);
		result.append(')');
		return result.toString();
	}

} // Repository
