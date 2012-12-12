/**
 */
package org.limepepper.chefclipse.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.Cookbook;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cookbook</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.impl.CookbookImpl#getJson_class <em>Json class</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.impl.CookbookImpl#getChef_type <em>Chef type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CookbookImpl extends EObjectImpl implements Cookbook {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ChefclipsePackage.Literals.COOKBOOK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getJson_class() {
        return (String)eGet(ChefclipsePackage.Literals.COOKBOOK__JSON_CLASS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setJson_class(String newJson_class) {
        eSet(ChefclipsePackage.Literals.COOKBOOK__JSON_CLASS, newJson_class);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getChef_type() {
        return (String)eGet(ChefclipsePackage.Literals.COOKBOOK__CHEF_TYPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChef_type(String newChef_type) {
        eSet(ChefclipsePackage.Literals.COOKBOOK__CHEF_TYPE, newChef_type);
    }

} //CookbookImpl
