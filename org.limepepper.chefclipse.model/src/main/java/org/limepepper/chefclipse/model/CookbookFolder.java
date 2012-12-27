/**
 */
package org.limepepper.chefclipse.model;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cookbook Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.CookbookFolder#getCookbookVersion <em>Cookbook Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.model.ModelPackage#getCookbookFolder()
 * @model kind="class"
 * @generated
 */
public class CookbookFolder extends ChefFolder {
    /**
     * The cached value of the '{@link #getCookbookVersion() <em>Cookbook Version</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCookbookVersion()
     * @generated
     * @ordered
     */
    protected org.limepepper.chefclipse.common.cookbook.CookbookVersion cookbookVersion;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CookbookFolder() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelPackage.Literals.COOKBOOK_FOLDER;
    }

    /**
     * Returns the value of the '<em><b>Cookbook Version</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook Version</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cookbook Version</em>' reference.
     * @see #setCookbookVersion(org.limepepper.chefclipse.common.cookbook.CookbookVersion)
     * @see org.limepepper.chefclipse.model.ModelPackage#getCookbookFolder_CookbookVersion()
     * @model required="true"
     * @generated
     */
    public org.limepepper.chefclipse.common.cookbook.CookbookVersion getCookbookVersion() {
        if (cookbookVersion != null && cookbookVersion.eIsProxy()) {
            InternalEObject oldCookbookVersion = (InternalEObject)cookbookVersion;
            cookbookVersion = (org.limepepper.chefclipse.common.cookbook.CookbookVersion)eResolveProxy(oldCookbookVersion);
            if (cookbookVersion != oldCookbookVersion) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.COOKBOOK_FOLDER__COOKBOOK_VERSION, oldCookbookVersion, cookbookVersion));
            }
        }
        return cookbookVersion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.limepepper.chefclipse.common.cookbook.CookbookVersion basicGetCookbookVersion() {
        return cookbookVersion;
    }

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.model.CookbookFolder#getCookbookVersion <em>Cookbook Version</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cookbook Version</em>' reference.
     * @see #getCookbookVersion()
     * @generated
     */
    public void setCookbookVersion(org.limepepper.chefclipse.common.cookbook.CookbookVersion newCookbookVersion) {
        org.limepepper.chefclipse.common.cookbook.CookbookVersion oldCookbookVersion = cookbookVersion;
        cookbookVersion = newCookbookVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COOKBOOK_FOLDER__COOKBOOK_VERSION, oldCookbookVersion, cookbookVersion));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.COOKBOOK_FOLDER__COOKBOOK_VERSION:
                if (resolve) return getCookbookVersion();
                return basicGetCookbookVersion();
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
            case ModelPackage.COOKBOOK_FOLDER__COOKBOOK_VERSION:
                setCookbookVersion((org.limepepper.chefclipse.common.cookbook.CookbookVersion)newValue);
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
            case ModelPackage.COOKBOOK_FOLDER__COOKBOOK_VERSION:
                setCookbookVersion((org.limepepper.chefclipse.common.cookbook.CookbookVersion)null);
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
            case ModelPackage.COOKBOOK_FOLDER__COOKBOOK_VERSION:
                return cookbookVersion != null;
        }
        return super.eIsSet(featureID);
    }

} // CookbookFolder
