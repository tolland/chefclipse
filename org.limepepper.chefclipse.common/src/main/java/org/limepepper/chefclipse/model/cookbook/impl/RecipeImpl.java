/**
 */
package org.limepepper.chefclipse.model.cookbook.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.limepepper.chefclipse.model.chefserver.Role;
import org.limepepper.chefclipse.model.chefserver.RunList;

import org.limepepper.chefclipse.model.cookbook.Cookbook;
import org.limepepper.chefclipse.model.cookbook.CookbookPackage;
import org.limepepper.chefclipse.model.cookbook.Recipe;
import org.limepepper.chefclipse.model.cookbook.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.impl.RecipeImpl#getRunlist <em>Runlist</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.impl.RecipeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.impl.RecipeImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.impl.RecipeImpl#getCookbook <em>Cookbook</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.impl.RecipeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecipeImpl extends EObjectImpl implements Recipe {
	/**
	 * The cached value of the '{@link #getRunlist() <em>Runlist</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunlist()
	 * @generated
	 * @ordered
	 */
	protected EList<RunList> runlist;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getCookbook() <em>Cookbook</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookbook()
	 * @generated
	 * @ordered
	 */
	protected EList<Cookbook> cookbook;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CookbookPackage.Literals.RECIPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RunList> getRunlist() {
		if (runlist == null) {
			runlist = new EObjectResolvingEList<RunList>(RunList.class, this, CookbookPackage.RECIPE__RUNLIST);
		}
		return runlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (Role)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CookbookPackage.RECIPE__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookPackage.RECIPE__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, CookbookPackage.RECIPE__RESOURCES, CookbookPackage.RESOURCE__RECIPE);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cookbook> getCookbook() {
		if (cookbook == null) {
			cookbook = new EObjectWithInverseResolvingEList.ManyInverse<Cookbook>(Cookbook.class, this, CookbookPackage.RECIPE__COOKBOOK, CookbookPackage.COOKBOOK__RECIPES);
		}
		return cookbook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookPackage.RECIPE__NAME, oldName, name));
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
			case CookbookPackage.RECIPE__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
			case CookbookPackage.RECIPE__COOKBOOK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCookbook()).basicAdd(otherEnd, msgs);
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
			case CookbookPackage.RECIPE__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case CookbookPackage.RECIPE__COOKBOOK:
				return ((InternalEList<?>)getCookbook()).basicRemove(otherEnd, msgs);
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
			case CookbookPackage.RECIPE__RUNLIST:
				return getRunlist();
			case CookbookPackage.RECIPE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case CookbookPackage.RECIPE__RESOURCES:
				return getResources();
			case CookbookPackage.RECIPE__COOKBOOK:
				return getCookbook();
			case CookbookPackage.RECIPE__NAME:
				return getName();
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
			case CookbookPackage.RECIPE__RUNLIST:
				getRunlist().clear();
				getRunlist().addAll((Collection<? extends RunList>)newValue);
				return;
			case CookbookPackage.RECIPE__ROLE:
				setRole((Role)newValue);
				return;
			case CookbookPackage.RECIPE__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case CookbookPackage.RECIPE__COOKBOOK:
				getCookbook().clear();
				getCookbook().addAll((Collection<? extends Cookbook>)newValue);
				return;
			case CookbookPackage.RECIPE__NAME:
				setName((String)newValue);
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
			case CookbookPackage.RECIPE__RUNLIST:
				getRunlist().clear();
				return;
			case CookbookPackage.RECIPE__ROLE:
				setRole((Role)null);
				return;
			case CookbookPackage.RECIPE__RESOURCES:
				getResources().clear();
				return;
			case CookbookPackage.RECIPE__COOKBOOK:
				getCookbook().clear();
				return;
			case CookbookPackage.RECIPE__NAME:
				setName(NAME_EDEFAULT);
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
			case CookbookPackage.RECIPE__RUNLIST:
				return runlist != null && !runlist.isEmpty();
			case CookbookPackage.RECIPE__ROLE:
				return role != null;
			case CookbookPackage.RECIPE__RESOURCES:
				return resources != null && !resources.isEmpty();
			case CookbookPackage.RECIPE__COOKBOOK:
				return cookbook != null && !cookbook.isEmpty();
			case CookbookPackage.RECIPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RecipeImpl
