/**
 */
package org.limepepper.chefclipse.cookbook;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.limepepper.chefclipse.chefserver.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cookbook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.cookbook.Cookbook#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.cookbook.Cookbook#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.cookbook.Cookbook#getRecipes <em>Recipes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getCookbook()
 * @model kind="class"
 * @generated
 */
public class Cookbook extends EObjectImpl implements EObject {
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
	protected Cookbook() {
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
	 * Returns the value of the '<em><b>Depends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference.
	 * @see #setDepends(DependencyRelation)
	 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getCookbook_Depends()
	 * @model
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
	 * Sets the value of the '{@link org.limepepper.chefclipse.cookbook.Cookbook#getDepends <em>Depends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends</em>' reference.
	 * @see #getDepends()
	 * @generated
	 */
	public void setDepends(DependencyRelation newDepends) {
		DependencyRelation oldDepends = depends;
		depends = newDepends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookPackage.COOKBOOK__DEPENDS, oldDepends, depends));
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
	 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getCookbook_Environment()
	 * @model required="true"
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
	 * Sets the value of the '{@link org.limepepper.chefclipse.cookbook.Cookbook#getEnvironment <em>Environment</em>}' reference.
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
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookPackage.COOKBOOK__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * Returns the value of the '<em><b>Recipes</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.cookbook.Recipe}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.cookbook.Recipe#getCookbook <em>Cookbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipes</em>' reference list.
	 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getCookbook_Recipes()
	 * @see org.limepepper.chefclipse.cookbook.Recipe#getCookbook
	 * @model opposite="cookbook"
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

} // Cookbook
