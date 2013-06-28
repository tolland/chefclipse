/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.common.cookbook.Attribute;
import org.limepepper.chefclipse.utility.NamedDescribedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.Role#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends NamedDescribedObject, RunListItem, RunList {

<<<<<<< HEAD
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRole_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();
=======
    /**
	 * Returns the value of the '<em><b>Run list</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Run list</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Run list</em>' containment reference.
	 * @see #setRun_list(RunList)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRole_Run_list()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
    RunList getRun_list();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Role#getRun_list <em>Run list</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run list</em>' containment reference.
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
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getRole_Environment()
	 * @model
	 * @generated
	 */
    Environment getEnvironment();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.Role#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
    void setEnvironment(Environment value);
>>>>>>> origin/tomhodder
} // Role
