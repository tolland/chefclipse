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
 *   <li>{@link org.limepepper.chefclipse.cookbook.Recipe#getRunlistList <em>Runlist</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.cookbook.Recipe#getRole <em>Role</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.cookbook.Recipe#getResourcesList <em>Resources</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.cookbook.Recipe#getCookbookList <em>Cookbook</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getRecipe()
 * @model kind="class"
 * @generated
 */
public class Recipe extends EObjectImpl implements EObject {
	/**
	 * The cached value of the '{@link #getRunlistList() <em>Runlist</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunlistList()
	 * @generated
	 * @ordered
	 */
	protected EList<RunList> runlist;

	/**
	 * The empty value for the '{@link #getRunlist() <em>Runlist</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunlist()
	 * @generated
	 * @ordered
	 */
	protected static final RunList[] RUNLIST_EEMPTY_ARRAY = new RunList [0];

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
	 * The cached value of the '{@link #getResourcesList() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcesList()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The empty value for the '{@link #getResources() <em>Resources</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected static final Resource[] RESOURCES_EEMPTY_ARRAY = new Resource [0];

	/**
	 * The cached value of the '{@link #getCookbookList() <em>Cookbook</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookbookList()
	 * @generated
	 * @ordered
	 */
	protected EList<Cookbook> cookbook;

	/**
	 * The empty value for the '{@link #getCookbook() <em>Cookbook</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookbook()
	 * @generated
	 * @ordered
	 */
	protected static final Cookbook[] COOKBOOK_EEMPTY_ARRAY = new Cookbook [0];

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunList[] getRunlist() {
		if (runlist == null || runlist.isEmpty()) return RUNLIST_EEMPTY_ARRAY;
		BasicEList<RunList> list = (BasicEList<RunList>)runlist;
		list.shrink();
		return (RunList[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunList getRunlist(int index) {
		return getRunlistList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRunlistLength() {
		return runlist == null ? 0 : runlist.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunlist(RunList[] newRunlist) {
		((BasicEList<RunList>)getRunlistList()).setData(newRunlist.length, newRunlist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunlist(int index, RunList element) {
		getRunlistList().set(index, element);
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
	public EList<RunList> getRunlistList() {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource[] getResources() {
		if (resources == null || resources.isEmpty()) return RESOURCES_EEMPTY_ARRAY;
		BasicEList<Resource> list = (BasicEList<Resource>)resources;
		list.shrink();
		return (Resource[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResources(int index) {
		return getResourcesList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResourcesLength() {
		return resources == null ? 0 : resources.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(Resource[] newResources) {
		((BasicEList<Resource>)getResourcesList()).setData(newResources.length, newResources);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(int index, Resource element) {
		getResourcesList().set(index, element);
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
	public EList<Resource> getResourcesList() {
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
	public Cookbook[] getCookbook() {
		if (cookbook == null || cookbook.isEmpty()) return COOKBOOK_EEMPTY_ARRAY;
		BasicEList<Cookbook> list = (BasicEList<Cookbook>)cookbook;
		list.shrink();
		return (Cookbook[])list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cookbook getCookbook(int index) {
		return getCookbookList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCookbookLength() {
		return cookbook == null ? 0 : cookbook.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCookbook(Cookbook[] newCookbook) {
		((BasicEList<Cookbook>)getCookbookList()).setData(newCookbook.length, newCookbook);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCookbook(int index, Cookbook element) {
		getCookbookList().set(index, element);
	}

	/**
	 * Returns the value of the '<em><b>Cookbook</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.cookbook.Cookbook}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.cookbook.Cookbook#getRecipesList <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbook</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbook</em>' reference list.
	 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getRecipe_Cookbook()
	 * @see org.limepepper.chefclipse.cookbook.Cookbook#getRecipesList
	 * @model opposite="recipes"
	 * @generated
	 */
	public EList<Cookbook> getCookbookList() {
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
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourcesList()).basicAdd(otherEnd, msgs);
			case CookbookPackage.RECIPE__COOKBOOK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCookbookList()).basicAdd(otherEnd, msgs);
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
				return ((InternalEList<?>)getResourcesList()).basicRemove(otherEnd, msgs);
			case CookbookPackage.RECIPE__COOKBOOK:
				return ((InternalEList<?>)getCookbookList()).basicRemove(otherEnd, msgs);
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
				return getRunlistList();
			case CookbookPackage.RECIPE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case CookbookPackage.RECIPE__RESOURCES:
				return getResourcesList();
			case CookbookPackage.RECIPE__COOKBOOK:
				return getCookbookList();
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
				getRunlistList().clear();
				getRunlistList().addAll((Collection<? extends RunList>)newValue);
				return;
			case CookbookPackage.RECIPE__ROLE:
				setRole((Role)newValue);
				return;
			case CookbookPackage.RECIPE__RESOURCES:
				getResourcesList().clear();
				getResourcesList().addAll((Collection<? extends Resource>)newValue);
				return;
			case CookbookPackage.RECIPE__COOKBOOK:
				getCookbookList().clear();
				getCookbookList().addAll((Collection<? extends Cookbook>)newValue);
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
				getRunlistList().clear();
				return;
			case CookbookPackage.RECIPE__ROLE:
				setRole((Role)null);
				return;
			case CookbookPackage.RECIPE__RESOURCES:
				getResourcesList().clear();
				return;
			case CookbookPackage.RECIPE__COOKBOOK:
				getCookbookList().clear();
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
