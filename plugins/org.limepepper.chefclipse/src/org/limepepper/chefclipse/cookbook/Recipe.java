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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.limepepper.chefclipse.chefserver.Role;
import org.limepepper.chefclipse.chefserver.RunList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.cookbook.Recipe#getRunlist <em>Runlist</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.cookbook.Recipe#getRole <em>Role</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.cookbook.Recipe#getResources <em>Resources</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.cookbook.Recipe#getCookbook <em>Cookbook</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getRecipe()
 * @model kind="class"
 * @generated
 */
public class Recipe extends EObjectImpl implements EObject {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Recipe() {
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
	 * Returns the value of the '<em><b>Runlist</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.chefserver.RunList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runlist</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runlist</em>' reference list.
	 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getRecipe_Runlist()
	 * @model
	 * @generated
	 */
	public EList<RunList> getRunlist() {
		if (runlist == null) {
			runlist = new EObjectResolvingEList<RunList>(RunList.class, this, CookbookPackage.RECIPE__RUNLIST);
		}
		return runlist;
	}

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getRecipe_Role()
	 * @model
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
	 * Sets the value of the '{@link org.limepepper.chefclipse.cookbook.Recipe#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookPackage.RECIPE__ROLE, oldRole, role));
	}

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.cookbook.Resource}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.cookbook.Resource#getRecipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getRecipe_Resources()
	 * @see org.limepepper.chefclipse.cookbook.Resource#getRecipe
	 * @model opposite="recipe" containment="true"
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, CookbookPackage.RECIPE__RESOURCES, CookbookPackage.RESOURCE__RECIPE);
		}
		return resources;
	}

	/**
	 * Returns the value of the '<em><b>Cookbook</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.cookbook.Cookbook}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.cookbook.Cookbook#getRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbook</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbook</em>' reference list.
	 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getRecipe_Cookbook()
	 * @see org.limepepper.chefclipse.cookbook.Cookbook#getRecipes
	 * @model opposite="recipes"
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
		}
		return super.eIsSet(featureID);
	}

} // Recipe
