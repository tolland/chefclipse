/**
 */
package org.limepepper.chefclipse.impl;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.NameUrlMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Url Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.impl.NameUrlMapImpl#getEntry <em>Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NameUrlMapImpl extends EObjectImpl implements NameUrlMap {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NameUrlMapImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ChefclipsePackage.Literals.NAME_URL_MAP;
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
    @SuppressWarnings("unchecked")
    public EMap<String, String> getEntry() {
        return (EMap<String, String>)eGet(ChefclipsePackage.Literals.NAME_URL_MAP__ENTRY, true);
    }

} //NameUrlMapImpl
