/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.common.cookbook.Recipe;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.RunList#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.RunList#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.RunList#getRun_list_items <em>Run list items</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.RunList#getRun_list <em>Run list</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.RunList#getServer <em>Server</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRunList()
 * @model abstract="true"
 * @generated
 */
public interface RunList extends EObject {
<<<<<<< HEAD
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
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRunList_Environment()
	 * @model
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.RunList#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Recipes</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Recipe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipes</em>' reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRunList_Recipes()
	 * @model
	 * @generated
	 */
	EList<Recipe> getRecipes();

	/**
	 * Returns the value of the '<em><b>Run list items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run list items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run list items</em>' attribute list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRunList_Run_list_items()
	 * @model annotation="JSON element='run_list'"
	 * @generated
	 */
	EList<String> getRun_list_items();

	/**
	 * Returns the value of the '<em><b>Run list</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.RunList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run list</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run list</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRunList_Run_list()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<RunList> getRun_list();

	/**
	 * Returns the value of the '<em><b>Server</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' containment reference.
	 * @see #setServer(Server)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRunList_Server()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Server getServer();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.RunList#getServer <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' containment reference.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(Server value);
=======
    /**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Node</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRunList_Node()
	 * @model
	 * @generated
	 */
    Node getNode();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.RunList#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
    void setNode(Node value);

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
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRunList_Environment()
	 * @model
	 * @generated
	 */
    Environment getEnvironment();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.RunList#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
    void setEnvironment(Environment value);

    /**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRunList_Role()
	 * @model
	 * @generated
	 */
    Role getRole();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.RunList#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
    void setRole(Role value);

    /**
	 * Returns the value of the '<em><b>Recipes</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Recipe}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recipes</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipes</em>' reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRunList_Recipes()
	 * @model
	 * @generated
	 */
    EList<Recipe> getRecipes();

    /**
	 * Returns the value of the '<em><b>Run list items</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.RunListItem}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Run list items</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Run list items</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRunList_Run_list_items()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
    EList<RunListItem> getRun_list_items();
>>>>>>> origin/tomhodder

} // RunList
