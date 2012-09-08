/**
 */
package org.limepepper.chefclipse.cookbook.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.limepepper.chefclipse.cookbook.Cookbook;
import org.limepepper.chefclipse.cookbook.CookbookPackage;
import org.limepepper.chefclipse.cookbook.DependencyRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cookbook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.cookbook.impl.CookbookImpl#getDepends <em>Depends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CookbookImpl extends EObjectImpl implements Cookbook {
	/**
	 * The cached value of the '{@link #getDepends() <em>Depends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected DependencyRelation depends;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CookbookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CookbookPackage.Literals.COOKBOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyRelation getDepends() {
		if (depends != null && depends.eIsProxy()) {
			InternalEObject oldDepends = (InternalEObject)depends;
			depends = (DependencyRelation)eResolveProxy(oldDepends);
			if (depends != oldDepends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CookbookPackage.COOKBOOK__DEPENDS, oldDepends, depends));
			}
		}
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyRelation basicGetDepends() {
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepends(DependencyRelation newDepends) {
		DependencyRelation oldDepends = depends;
		depends = newDepends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookPackage.COOKBOOK__DEPENDS, oldDepends, depends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CookbookPackage.COOKBOOK__DEPENDS:
				if (resolve) return getDepends();
				return basicGetDepends();
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
			case CookbookPackage.COOKBOOK__DEPENDS:
				setDepends((DependencyRelation)newValue);
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
			case CookbookPackage.COOKBOOK__DEPENDS:
				setDepends((DependencyRelation)null);
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
			case CookbookPackage.COOKBOOK__DEPENDS:
				return depends != null;
		}
		return super.eIsSet(featureID);
	}

} //CookbookImpl
