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
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Node#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Node#getServer <em>Server</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Node#getClient <em>Client</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Node#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Node#getRun_list_items <em>Run list items</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Node#getRun_list <em>Run list</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getNode()
 * @model annotation="JSON root='true'"
 * @generated
 */
public interface Node extends NamedDescribedObject {
    /**
	 * Returns the value of the '<em><b>Run list</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Run list</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Run list</em>' reference.
	 * @see #setRun_list(RunList)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getNode_Run_list()
	 * @model
	 * @generated
	 */
    RunList getRun_list();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Node#getRun_list <em>Run list</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run list</em>' reference.
	 * @see #getRun_list()
	 * @generated
	 */
    void setRun_list(RunList value);

    /**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Environment</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(Environment)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getNode_Environment()
	 * @model
	 * @generated
	 */
    Environment getEnvironment();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Node#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
    void setEnvironment(Environment value);

    /**
	 * Returns the value of the '<em><b>Server</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Server</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' reference.
	 * @see #setServer(Server)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getNode_Server()
	 * @model required="true"
	 * @generated
	 */
    Server getServer();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Node#getServer <em>Server</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' reference.
	 * @see #getServer()
	 * @generated
	 */
    void setServer(Server value);

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

    /**
	 * Returns the value of the '<em><b>Run list items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Run list items</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Run list items</em>' attribute list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getNode_Run_list_items()
	 * @model annotation="JSON element='run_list'"
	 * @generated
	 */
    EList<String> getRun_list_items();

} // Node
