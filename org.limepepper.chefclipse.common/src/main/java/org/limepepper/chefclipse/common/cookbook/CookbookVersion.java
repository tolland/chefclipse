/**
 */
package org.limepepper.chefclipse.common.cookbook;

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
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getTemplates <em>Templates</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getFiles <em>Files</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion()
 * @model
 * @generated
 */
public interface CookbookVersion extends NamedDescribedObject {
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
     * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.common.cookbook.Template#getCookbook <em>Cookbook</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Templates</em>' containment reference list.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Templates()
     * @see org.limepepper.chefclipse.common.cookbook.Template#getCookbook
     * @model opposite="cookbook" containment="true" resolveProxies="true"
     * @generated
     */
    EList<Template> getTemplates();

    /**
     * Returns the value of the '<em><b>Recipes</b></em>' containment reference list.
     * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Recipe}.
     * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.common.cookbook.Recipe#getCookbook <em>Cookbook</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recipes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Recipes</em>' containment reference list.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookVersion_Recipes()
     * @see org.limepepper.chefclipse.common.cookbook.Recipe#getCookbook
     * @model opposite="cookbook" containment="true" resolveProxies="true"
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

} // CookbookVersion
