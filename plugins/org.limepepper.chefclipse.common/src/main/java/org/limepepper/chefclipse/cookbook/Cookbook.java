/**
 */
package org.limepepper.chefclipse.cookbook;

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
 *   <li>{@link org.limepepper.chefclipse.cookbook.Cookbook#getRecipesList <em>Recipes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.cookbook.Cookbook#getSupports <em>Supports</em>}</li>
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
	 * The cached value of the '{@link #getRecipesList() <em>Recipes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipesList()
	 * @generated
	 * @ordered
	 */
	protected EList<Recipe> recipes;

	/**
	 * The empty value for the '{@link #getRecipes() <em>Recipes</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipes()
	 * @generated
	 * @ordered
	 */
	protected static final Recipe[] RECIPES_EEMPTY_ARRAY = new Recipe [0];

	/**
	 * The default value of the '{@link #getSupports() <em>Supports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupports()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupports() <em>Supports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupports()
	 * @generated
	 * @ordered
	 */
	protected String supports = SUPPORTS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipe[] getRecipes() {
		if (recipes == null || recipes.isEmpty()) return RECIPES_EEMPTY_ARRAY;
		BasicEList<Recipe> list = (BasicEList<Recipe>)recipes;
		list.shrink();
		return (Recipe[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recipe getRecipes(int index) {
		return getRecipesList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRecipesLength() {
		return recipes == null ? 0 : recipes.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipes(Recipe[] newRecipes) {
		((BasicEList<Recipe>)getRecipesList()).setData(newRecipes.length, newRecipes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipes(int index, Recipe element) {
		getRecipesList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Recipes</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.cookbook.Recipe}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.cookbook.Recipe#getCookbookList <em>Cookbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipes</em>' reference list.
	 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getCookbook_Recipes()
	 * @see org.limepepper.chefclipse.cookbook.Recipe#getCookbookList
	 * @model opposite="cookbook"
	 * @generated
	 */
	public EList<Recipe> getRecipesList() {
		if (recipes == null) {
			recipes = new EObjectWithInverseResolvingEList.ManyInverse<Recipe>(Recipe.class, this, CookbookPackage.COOKBOOK__RECIPES, CookbookPackage.RECIPE__COOKBOOK);
		}
		return recipes;
	}

	/**
	 * Returns the value of the '<em><b>Supports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports</em>' attribute.
	 * @see #setSupports(String)
	 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getCookbook_Supports()
	 * @model
	 * @generated
	 */
	public String getSupports() {
		return supports;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.cookbook.Cookbook#getSupports <em>Supports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports</em>' attribute.
	 * @see #getSupports()
	 * @generated
	 */
	public void setSupports(String newSupports) {
		String oldSupports = supports;
		supports = newSupports;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookPackage.COOKBOOK__SUPPORTS, oldSupports, supports));
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
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecipesList()).basicAdd(otherEnd, msgs);
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
				return ((InternalEList<?>)getRecipesList()).basicRemove(otherEnd, msgs);
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
				return getRecipesList();
			case CookbookPackage.COOKBOOK__SUPPORTS:
				return getSupports();
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
				getRecipesList().clear();
				getRecipesList().addAll((Collection<? extends Recipe>)newValue);
				return;
			case CookbookPackage.COOKBOOK__SUPPORTS:
				setSupports((String)newValue);
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
				getRecipesList().clear();
				return;
			case CookbookPackage.COOKBOOK__SUPPORTS:
				setSupports(SUPPORTS_EDEFAULT);
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
			case CookbookPackage.COOKBOOK__SUPPORTS:
				return SUPPORTS_EDEFAULT == null ? supports != null : !SUPPORTS_EDEFAULT.equals(supports);
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
		result.append(" (supports: ");
		result.append(supports);
		result.append(')');
		return result.toString();
	}

} // Cookbook
