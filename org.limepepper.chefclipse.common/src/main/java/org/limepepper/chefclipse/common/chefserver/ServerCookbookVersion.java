/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.Cookbook;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Cookbook Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getRoot_files <em>Root files</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getTemplates <em>Templates</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getProviders <em>Providers</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getResources <em>Resources</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getFiles <em>Files</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getVersion <em>Version</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getCookbook_name <em>Cookbook name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion()
 * @model
 * @generated
 */
public interface ServerCookbookVersion extends Cookbook {
    /**
	 * Returns the value of the '<em><b>Root files</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.ServerCookbookFile}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root files</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Root files</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion_Root_files()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
    EList<ServerCookbookFile> getRoot_files();

    /**
	 * Returns the value of the '<em><b>Recipes</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.ServerCookbookFile}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recipes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipes</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion_Recipes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
    EList<ServerCookbookFile> getRecipes();

    /**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.ServerCookbookFile}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion_Templates()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
    EList<ServerCookbookFile> getTemplates();

    /**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.ServerCookbookFile}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion_Libraries()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
    EList<ServerCookbookFile> getLibraries();

    /**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.ServerCookbookFile}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Providers</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion_Providers()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
    EList<ServerCookbookFile> getProviders();

    /**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.ServerCookbookFile}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion_Resources()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
    EList<ServerCookbookFile> getResources();

    /**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.ServerCookbookFile}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion_Files()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
    EList<ServerCookbookFile> getFiles();

    /**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.ServerCookbookFile}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion_Definitions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
    EList<ServerCookbookFile> getDefinitions();

    /**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.ServerCookbookFile}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion_Attributes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
    EList<ServerCookbookFile> getAttributes();

    /**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"0.0.0"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion_Version()
	 * @model default="0.0.0" dataType="org.limepepper.chefclipse.Version" required="true"
	 * @generated
	 */
    String getVersion();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
    void setVersion(String value);

    /**
	 * Returns the value of the '<em><b>Cookbook name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbook name</em>' attribute.
	 * @see #setCookbook_name(String)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookVersion_Cookbook_name()
	 * @model required="true"
	 * @generated
	 */
    String getCookbook_name();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion#getCookbook_name <em>Cookbook name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookbook name</em>' attribute.
	 * @see #getCookbook_name()
	 * @generated
	 */
    void setCookbook_name(String value);

} // ServerCookbookVersion
