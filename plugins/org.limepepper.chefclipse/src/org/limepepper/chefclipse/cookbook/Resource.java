/**
 */
package org.limepepper.chefclipse.cookbook;

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
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.cookbook.Resource#getRecipe <em>Recipe</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getResource()
 * @model kind="class"
 * @generated
 */
public class Resource extends EObjectImpl implements EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Resource() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CookbookPackage.Literals.RESOURCE;
	}

	/**
	 * Returns the value of the '<em><b>Recipe</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.cookbook.Recipe#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipe</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipe</em>' container reference.
	 * @see #setRecipe(Recipe)
	 * @see org.limepepper.chefclipse.cookbook.CookbookPackage#getResource_Recipe()
	 * @see org.limepepper.chefclipse.cookbook.Recipe#getResources
	 * @model opposite="resources" required="true" transient="false"
	 * @generated
	 */
	public Recipe getRecipe() {
		if (eContainerFeatureID() != CookbookPackage.RESOURCE__RECIPE) return null;
		return (Recipe)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipe(Recipe newRecipe, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRecipe, CookbookPackage.RESOURCE__RECIPE, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.cookbook.Resource#getRecipe <em>Recipe</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipe</em>' container reference.
	 * @see #getRecipe()
	 * @generated
	 */
	public void setRecipe(Recipe newRecipe) {
		if (newRecipe != eInternalContainer() || (eContainerFeatureID() != CookbookPackage.RESOURCE__RECIPE && newRecipe != null)) {
			if (EcoreUtil.isAncestor(this, newRecipe))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRecipe != null)
				msgs = ((InternalEObject)newRecipe).eInverseAdd(this, CookbookPackage.RECIPE__RESOURCES, Recipe.class, msgs);
			msgs = basicSetRecipe(newRecipe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CookbookPackage.RESOURCE__RECIPE, newRecipe, newRecipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CookbookPackage.RESOURCE__RECIPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRecipe((Recipe)otherEnd, msgs);
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
			case CookbookPackage.RESOURCE__RECIPE:
				return basicSetRecipe(null, msgs);
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
			case CookbookPackage.RESOURCE__RECIPE:
				return eInternalContainer().eInverseRemove(this, CookbookPackage.RECIPE__RESOURCES, Recipe.class, msgs);
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
			case CookbookPackage.RESOURCE__RECIPE:
				return getRecipe();
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
			case CookbookPackage.RESOURCE__RECIPE:
				setRecipe((Recipe)newValue);
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
			case CookbookPackage.RESOURCE__RECIPE:
				setRecipe((Recipe)null);
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
			case CookbookPackage.RESOURCE__RECIPE:
				return getRecipe() != null;
		}
		return super.eIsSet(featureID);
	}

} // Resource
