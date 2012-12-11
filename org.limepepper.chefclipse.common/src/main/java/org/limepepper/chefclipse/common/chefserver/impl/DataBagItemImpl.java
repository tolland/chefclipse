/**
 */
package org.limepepper.chefclipse.common.chefserver.impl;

import org.eclipse.emf.ecore.EClass;

import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;

import org.limepepper.chefclipse.impl.NamedObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Bag Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.DataBagItemImpl#getDataBag <em>Data Bag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataBagItemImpl extends NamedObjectImpl implements DataBagItem {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataBagItemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ChefserverPackage.Literals.DATA_BAG_ITEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataBag getDataBag() {
        return (DataBag)eGet(ChefserverPackage.Literals.DATA_BAG_ITEM__DATA_BAG, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDataBag(DataBag newDataBag) {
        eSet(ChefserverPackage.Literals.DATA_BAG_ITEM__DATA_BAG, newDataBag);
    }

} //DataBagItemImpl
