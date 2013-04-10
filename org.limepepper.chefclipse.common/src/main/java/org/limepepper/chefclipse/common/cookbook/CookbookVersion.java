/**
 */
package org.limepepper.chefclipse.common.cookbook;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.limepepper.chefclipse.NamedDescribedObject;

import org.limepepper.chefclipse.common.chefserver.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getTemplates <em>Templates</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getFiles <em>Files</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getResources <em>Resources</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getProviders <em>Providers</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getRoot_files <em>Root files</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getMissing <em>Missing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion()
 * @model
 * @generated
 */
public interface CookbookVersion extends NamedDescribedObject, Cookbook {
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
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Environment()
	 * @model
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Template}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Templates()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Template> getTemplates();

	/**
	 * Returns the value of the '<em><b>Recipes</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Recipe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipes</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Recipes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Recipe> getRecipes();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Definition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Definitions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Definition> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Files()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Resources()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Library}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Libraries()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Library> getLibraries();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.common.cookbook.Metadata#getCookbookVersion <em>Cookbook Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Metadata()
	 * @see org.limepepper.chefclipse.common.cookbook.Metadata#getCookbookVersion
	 * @model opposite="cookbookVersion" containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Provider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Providers()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Provider> getProviders();

	/**
	 * Returns the value of the '<em><b>Root files</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Root_file}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root files</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Root_files()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Root_file> getRoot_files();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Attributes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Attributes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Attributes> getAttributes();

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catalog</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' attribute.
	 * @see #setCatalog(String)
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Catalog()
	 * @model
	 * @generated
	 */
	String getCatalog();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getCatalog <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' attribute.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(String value);

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.CookbookVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference list.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Depends()
	 * @model
	 * @generated
	 */
	EList<CookbookVersion> getDepends();

	/**
	 * Returns the value of the '<em><b>Missing</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}&lt;java.lang.String, java.lang.String>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing</em>' reference list.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Missing()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EList<Map.Entry<String, String>> getMissing();

} // CookbookVersion
