/**
 */
package org.limepepper.chefclipse.REST;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cookbook Version Resp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getCategory <em>Category</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getLatestVersion <em>Latest Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getExternalUrl <em>External Url</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getReplacement <em>Replacement</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getFiles <em>Files</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getCookbookName <em>Cookbook Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getVersion <em>Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getJsonClass <em>Json Class</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getChefType <em>Chef Type</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp()
 * @model
 * @generated
 */
public interface CookbookVersionResp extends EObject {
	/**
	 * Returns the value of the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintainer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintainer</em>' attribute.
	 * @see #setMaintainer(String)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_Maintainer()
	 * @model required="true"
	 * @generated
	 */
	String getMaintainer();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getMaintainer <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintainer</em>' attribute.
	 * @see #getMaintainer()
	 * @generated
	 */
	void setMaintainer(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated At</em>' attribute.
	 * @see #setUpdatedAt(Date)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_UpdatedAt()
	 * @model required="true"
	 * @generated
	 */
	Date getUpdatedAt();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getUpdatedAt <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated At</em>' attribute.
	 * @see #getUpdatedAt()
	 * @generated
	 */
	void setUpdatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_CreatedAt()
	 * @model required="true"
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Latest Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Version</em>' attribute.
	 * @see #setLatestVersion(String)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_LatestVersion()
	 * @model required="true"
	 * @generated
	 */
	String getLatestVersion();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getLatestVersion <em>Latest Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Version</em>' attribute.
	 * @see #getLatestVersion()
	 * @generated
	 */
	void setLatestVersion(String value);

	/**
	 * Returns the value of the '<em><b>External Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Url</em>' attribute.
	 * @see #setExternalUrl(String)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_ExternalUrl()
	 * @model
	 * @generated
	 */
	String getExternalUrl();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getExternalUrl <em>External Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Url</em>' attribute.
	 * @see #getExternalUrl()
	 * @generated
	 */
	void setExternalUrl(String value);

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(boolean)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_Deprecated()
	 * @model
	 * @generated
	 */
	boolean isDeprecated();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#isDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #isDeprecated()
	 * @generated
	 */
	void setDeprecated(boolean value);

	/**
	 * Returns the value of the '<em><b>Replacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replacement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement</em>' attribute.
	 * @see #setReplacement(String)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_Replacement()
	 * @model
	 * @generated
	 */
	String getReplacement();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getReplacement <em>Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement</em>' attribute.
	 * @see #getReplacement()
	 * @generated
	 */
	void setReplacement(String value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.REST.CookbookDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' reference list.
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_Definitions()
	 * @model
	 * @generated
	 */
	EList<CookbookDefinition> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.REST.CookbookFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' reference list.
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_Files()
	 * @model
	 * @generated
	 */
	EList<CookbookFile> getFiles();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.REST.CookbookAttributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_Attributes()
	 * @model
	 * @generated
	 */
	EList<CookbookAttributes> getAttributes();

	/**
	 * Returns the value of the '<em><b>Cookbook Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbook Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbook Name</em>' attribute.
	 * @see #setCookbookName(String)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_CookbookName()
	 * @model required="true"
	 * @generated
	 */
	String getCookbookName();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getCookbookName <em>Cookbook Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookbook Name</em>' attribute.
	 * @see #getCookbookName()
	 * @generated
	 */
	void setCookbookName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Json Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json Class</em>' attribute.
	 * @see #setJsonClass(String)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_JsonClass()
	 * @model
	 * @generated
	 */
	String getJsonClass();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getJsonClass <em>Json Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json Class</em>' attribute.
	 * @see #getJsonClass()
	 * @generated
	 */
	void setJsonClass(String value);

	/**
	 * Returns the value of the '<em><b>Chef Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chef Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chef Type</em>' attribute.
	 * @see #setChefType(String)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_ChefType()
	 * @model
	 * @generated
	 */
	String getChefType();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getChefType <em>Chef Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chef Type</em>' attribute.
	 * @see #getChefType()
	 * @generated
	 */
	void setChefType(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(CookbookMetadata)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_Metadata()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	CookbookMetadata getMetadata();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(CookbookMetadata value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookVersionResp_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookVersionResp#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // CookbookVersionResp
