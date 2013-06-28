/**
 */
package org.limepepper.chefclipse.common.chefserver;

<<<<<<< HEAD
import org.eclipse.emf.common.util.EList;
=======
>>>>>>> origin/tomhodder
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cookbook List Resp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.CookbookListResp#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.CookbookListResp#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getCookbookListResp()
 * @model
 * @generated
 */
public interface CookbookListResp extends EObject {
<<<<<<< HEAD
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
=======
    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getCookbookListResp_Name()
	 * @model required="true"
	 * @generated
	 */
<<<<<<< HEAD
	String getName();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.CookbookListResp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
=======
    String getName();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.CookbookListResp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
<<<<<<< HEAD
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.CookbookListVersionResp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getCookbookListResp_Versions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<CookbookListVersionResp> getVersions();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
=======
    void setName(String value);

    /**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Url</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getCookbookListResp_Url()
	 * @model required="true"
	 * @generated
	 */
<<<<<<< HEAD
	String getUrl();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.CookbookListResp#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
=======
    String getUrl();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.CookbookListResp#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
>>>>>>> origin/tomhodder
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
<<<<<<< HEAD
	void setUrl(String value);
=======
    void setUrl(String value);
>>>>>>> origin/tomhodder

} // CookbookListResp
