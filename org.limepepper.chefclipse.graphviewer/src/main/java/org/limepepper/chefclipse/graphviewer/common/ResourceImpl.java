/**
 */
package org.limepepper.chefclipse.graphviewer.common;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.Recipe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.impl.ResourceImpl#getRecipe <em>Recipe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceImpl extends org.limepepper.chefclipse.common.cookbook.impl.ResourceImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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

    @Override
    public String getExtension() {
        return null;
    }

    @Override
    public void setExtension(String value) {
    }

    @Override
    public EClass eClass() {
        return null;
    }

    @Override
    public org.eclipse.emf.ecore.resource.Resource eResource() {
        return null;
    }

    @Override
    public EObject eContainer() {
        return null;
    }

    @Override
    public EStructuralFeature eContainingFeature() {
        return null;
    }

    @Override
    public EReference eContainmentFeature() {
        return null;
    }

    @Override
    public EList<EObject> eContents() {
        return null;
    }

    @Override
    public TreeIterator<EObject> eAllContents() {
        return null;
    }

    @Override
    public boolean eIsProxy() {
        return false;
    }

    @Override
    public EList<EObject> eCrossReferences() {
        return null;
    }

    @Override
    public Object eGet(EStructuralFeature feature) {
        return null;
    }

    @Override
    public Object eGet(EStructuralFeature feature, boolean resolve) {
        return null;
    }

    @Override
    public void eSet(EStructuralFeature feature, Object newValue) {
    }

    @Override
    public boolean eIsSet(EStructuralFeature feature) {
        return false;
    }

    @Override
    public void eUnset(EStructuralFeature feature) {
    }

    @Override
    public Object eInvoke(EOperation operation, EList<?> arguments)
            throws InvocationTargetException {
        return null;
    }

    @Override
    public EList<Adapter> eAdapters() {
        return null;
    }

    @Override
    public boolean eDeliver() {
        return false;
    }

    @Override
    public void eSetDeliver(boolean deliver) {
    }

    @Override
    public void eNotify(Notification notification) {
    }

    @Override
    public String getChecksum() {
        return null;
    }

    @Override
    public void setChecksum(String value) {
    }

    @Override
    public String getPath() {
        return null;
    }

    @Override
    public void setPath(String value) {
    }

    @Override
    public String getSpecificity() {
        return null;
    }

    @Override
    public void setSpecificity(String value) {
    }

    @Override
    public URL getUrl() {
        return null;
    }

    @Override
    public void setUrl(URL value) {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String value) {
    }

} //ResourceImpl
