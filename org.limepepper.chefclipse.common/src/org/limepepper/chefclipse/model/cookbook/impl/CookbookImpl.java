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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.limepepper.chefclipse.model.chefserver.Environment;

import org.limepepper.chefclipse.model.cookbook.Cookbook;
import org.limepepper.chefclipse.model.cookbook.CookbookPackage;
import org.limepepper.chefclipse.model.cookbook.DependencyRelation;
import org.limepepper.chefclipse.model.cookbook.Recipe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cookbook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.impl.CookbookImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.impl.CookbookImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.impl.CookbookImpl#getRecipes <em>Recipes</em>}</li>
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
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getRecipes() <em>Recipes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipes()
	 * @generated
	 * @ordered
	 */
	protected EList<Recipe> recipes;

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
	public Environment getEnvironment() {
		if (environment != null && environment.eIsProxy()) {
			InternalEObject oldEnvironment = (InternalEObject)environment;
			environment = (Environment)eResolveProxy(oldEnvironment);
			if (environment != oldEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CookbookPackage.COOKBOOK__ENVIRONMENT, oldEnvironment, environment));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookPackage.COOKBOOK__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recipe> getRecipes() {
		if (recipes == null) {
			recipes = new EObjectWithInverseResolvingEList.ManyInverse<Recipe>(Recipe.class, this, CookbookPackage.COOKBOOK__RECIPES, CookbookPackage.RECIPE__COOKBOOK);
		}
		return recipes;
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
			case CookbookPackage.COOKBOOK__RECIPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecipes()).basicAdd(otherEnd, msgs);
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
			case CookbookPackage.COOKBOOK__RECIPES:
				return ((InternalEList<?>)getRecipes()).basicRemove(otherEnd, msgs);
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
			case CookbookPackage.COOKBOOK__DEPENDS:
				if (resolve) return getDepends();
				return basicGetDepends();
			case CookbookPackage.COOKBOOK__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case CookbookPackage.COOKBOOK__RECIPES:
				return getRecipes();
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
			case CookbookPackage.COOKBOOK__DEPENDS:
				setDepends((DependencyRelation)newValue);
				return;
			case CookbookPackage.COOKBOOK__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case CookbookPackage.COOKBOOK__RECIPES:
				getRecipes().clear();
				getRecipes().addAll((Collection<? extends Recipe>)newValue);
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
			case CookbookPackage.COOKBOOK__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case CookbookPackage.COOKBOOK__RECIPES:
				getRecipes().clear();
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
			case CookbookPackage.COOKBOOK__ENVIRONMENT:
				return environment != null;
			case CookbookPackage.COOKBOOK__RECIPES:
				return recipes != null && !recipes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CookbookImpl
