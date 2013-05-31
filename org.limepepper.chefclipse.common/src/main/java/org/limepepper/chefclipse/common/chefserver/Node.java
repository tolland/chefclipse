/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.common.chefclient.ChefClient;
import org.limepepper.chefclipse.common.cookbook.Attribute;
import org.limepepper.chefclipse.utility.NamedDescribedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Node#getClient <em>Client</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Node#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getNode()
 * @model annotation="JSON root='true'"
 * @generated
 */
public interface Node extends NamedDescribedObject, RunList {
    /**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Client</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(ChefClient)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getNode_Client()
	 * @model
	 * @generated
	 */
    ChefClient getClient();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Node#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(ChefClient value);

				/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference.
	 * @see #setAttributes(Attribute)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getNode_Attributes()
	 * @model
	 * @generated
	 */
    Attribute getAttributes();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Node#getAttributes <em>Attributes</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' reference.
	 * @see #getAttributes()
	 * @generated
	 */
    void setAttributes(Attribute value);

} // Node
