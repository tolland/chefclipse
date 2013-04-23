/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.NamedDescribedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Bag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.DataBag#getServer <em>Server</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.DataBag#getItems <em>Items</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.DataBag#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getDataBag()
 * @model
 * @generated
 */
public interface DataBag extends NamedDescribedObject {
    /**
	 * Returns the value of the '<em><b>Server</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.common.chefserver.Server#getDatabags <em>Databags</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Server</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' container reference.
	 * @see #setServer(Server)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getDataBag_Server()
	 * @see org.limepepper.chefclipse.common.chefserver.Server#getDatabags
	 * @model opposite="databags" transient="false"
	 * @generated
	 */
    Server getServer();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.DataBag#getServer <em>Server</em>}' container reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' container reference.
	 * @see #getServer()
	 * @generated
	 */
    void setServer(Server value);

    /**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.DataBagItem}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getDataBag_Items()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
    EList<DataBagItem> getItems();

    /**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resource</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(IResource)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getDataBag_Resource()
	 * @model default="" dataType="org.limepepper.chefclipse.IResource" required="true"
	 * @generated
	 */
    IResource getResource();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.DataBag#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
    void setResource(IResource value);

} // DataBag
