/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.eclipse.core.resources.IResource;
import org.limepepper.chefclipse.utility.IdentObject;
import org.limepepper.chefclipse.utility.JsonObject;
import org.limepepper.chefclipse.utility.NamedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Bag Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.DataBagItem#getDataBag <em>Data Bag</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.DataBagItem#getJsonResource <em>Json Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getDataBagItem()
 * @model
 * @generated
 */
<<<<<<< HEAD
public interface DataBagItem extends IdentObject, JsonObject {
	/**
	 * Returns the value of the '<em><b>Data Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Bag</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
=======
public interface DataBagItem extends NamedObject {
    /**
	 * Returns the value of the '<em><b>Data Bag</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Data Bag</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @return the value of the '<em>Data Bag</em>' reference.
	 * @see #setDataBag(DataBag)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getDataBagItem_DataBag()
	 * @model required="true"
	 * @generated
	 */
<<<<<<< HEAD
	DataBag getDataBag();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.DataBagItem#getDataBag <em>Data Bag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
=======
    DataBag getDataBag();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.DataBagItem#getDataBag <em>Data Bag</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @param value the new value of the '<em>Data Bag</em>' reference.
	 * @see #getDataBag()
	 * @generated
	 */
<<<<<<< HEAD
	void setDataBag(DataBag value);

	/**
	 * Returns the value of the '<em><b>Json Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Resource</em>' attribute.
	 * @see #setJsonResource(IResource)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getDataBagItem_JsonResource()
	 * @model dataType="org.limepepper.chefclipse.utility.IResource" required="true"
	 * @generated
	 */
	IResource getJsonResource();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.DataBagItem#getJsonResource <em>Json Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Resource</em>' attribute.
	 * @see #getJsonResource()
	 * @generated
	 */
	void setJsonResource(IResource value);
=======
    void setDataBag(DataBag value);
>>>>>>> origin/tomhodder

} // DataBagItem
