/**
 */
package org.limepepper.chefclipse.common.workstation;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.NamedDescribedObject;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.knife.KnifeConfig;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.Repository#getOS <em>OS</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.Repository#getBasepath <em>Basepath</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.Repository#getCookbooks <em>Cookbooks</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.Repository#getKnife <em>Knife</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.Repository#getCookbookFolders <em>Cookbook Folders</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends NamedDescribedObject {
	/**
	 * Returns the value of the '<em><b>OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OS</em>' attribute.
	 * @see #setOS(String)
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#getRepository_OS()
	 * @model
	 * @generated
	 */
	String getOS();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.workstation.Repository#getOS <em>OS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS</em>' attribute.
	 * @see #getOS()
	 * @generated
	 */
	void setOS(String value);

	/**
	 * Returns the value of the '<em><b>Basepath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basepath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basepath</em>' attribute.
	 * @see #setBasepath(String)
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#getRepository_Basepath()
	 * @model
	 * @generated
	 */
	String getBasepath();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.workstation.Repository#getBasepath <em>Basepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basepath</em>' attribute.
	 * @see #getBasepath()
	 * @generated
	 */
	void setBasepath(String value);

	/**
	 * Returns the value of the '<em><b>Cookbooks</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.CookbookVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbooks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbooks</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#getRepository_Cookbooks()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<CookbookVersion> getCookbooks();

	/**
	 * Returns the value of the '<em><b>Knife</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.knife.KnifeConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Knife</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knife</em>' reference list.
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#getRepository_Knife()
	 * @model
	 * @generated
	 */
	EList<KnifeConfig> getKnife();

	/**
	 * Returns the value of the '<em><b>Cookbook Folders</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.workstation.CookbooksFolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbook Folders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbook Folders</em>' reference list.
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#getRepository_CookbookFolders()
	 * @model required="true"
	 * @generated
	 */
	EList<CookbooksFolder> getCookbookFolders();

} // Repository
