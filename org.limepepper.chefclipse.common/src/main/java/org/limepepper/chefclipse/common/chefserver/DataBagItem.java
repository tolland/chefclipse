/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.limepepper.chefclipse.NamedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Bag Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.DataBagItem#getDataBag <em>Data Bag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getDataBagItem()
 * @model
 * @generated
 */
public interface DataBagItem extends NamedObject {
    /**
     * Returns the value of the '<em><b>Data Bag</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Bag</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Bag</em>' reference.
     * @see #setDataBag(DataBag)
     * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getDataBagItem_DataBag()
     * @model required="true"
     * @generated
     */
    DataBag getDataBag();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.DataBagItem#getDataBag <em>Data Bag</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Bag</em>' reference.
     * @see #getDataBag()
     * @generated
     */
    void setDataBag(DataBag value);

} // DataBagItem