/**
 */
package org.limepepper.chefclipse.impl;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.MapTestContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Test Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.impl.MapTestContainerImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapTestContainerImpl extends EObjectImpl implements MapTestContainer {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MapTestContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ChefclipsePackage.Literals.MAP_TEST_CONTAINER;
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
    public EList<HashMap> getEntries() {
        return (EList<HashMap>)eGet(ChefclipsePackage.Literals.MAP_TEST_CONTAINER__ENTRIES, true);
    }

} //MapTestContainerImpl
