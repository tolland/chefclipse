/**
 */
package org.limepepper.chefclipse.common.chefserver.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.impl.DescribedObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.EnvironmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.EnvironmentImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.EnvironmentImpl#getOverride_attributes <em>Override attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentImpl extends DescribedObjectImpl implements Environment {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnvironmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ChefserverPackage.Literals.ENVIRONMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eGet(ChefclipsePackage.Literals.NAMED_OBJECT__NAME, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eSet(ChefclipsePackage.Literals.NAMED_OBJECT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getID() {
        return (String)eGet(ChefclipsePackage.Literals.NAMED_OBJECT__ID, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setID(String newID) {
        eSet(ChefclipsePackage.Literals.NAMED_OBJECT__ID, newID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<String> getOverride_attributes() {
        return (EList<String>)eGet(ChefserverPackage.Literals.ENVIRONMENT__OVERRIDE_ATTRIBUTES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == NamedObject.class) {
            switch (derivedFeatureID) {
                case ChefserverPackage.ENVIRONMENT__NAME: return ChefclipsePackage.NAMED_OBJECT__NAME;
                case ChefserverPackage.ENVIRONMENT__ID: return ChefclipsePackage.NAMED_OBJECT__ID;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == NamedObject.class) {
            switch (baseFeatureID) {
                case ChefclipsePackage.NAMED_OBJECT__NAME: return ChefserverPackage.ENVIRONMENT__NAME;
                case ChefclipsePackage.NAMED_OBJECT__ID: return ChefserverPackage.ENVIRONMENT__ID;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //EnvironmentImpl
