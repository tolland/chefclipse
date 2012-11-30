/**
 */
package org.limepepper.chefclipse.common.cookbook;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.RubyFile;
import org.limepepper.chefclipse.SandboxedObject;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.RunList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Recipe#getCookbook <em>Cookbook</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Recipe#getResources <em>Resources</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Recipe#getRole <em>Role</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Recipe#getRunlist <em>Runlist</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Recipe#getOldCookbook <em>Old Cookbook</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getRecipe()
 * @model
 * @generated
 */
public interface Recipe extends SandboxedObject, RubyFile, ChecksumFile {
    /**
     * Returns the value of the '<em><b>Cookbook</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getRecipes <em>Recipes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cookbook</em>' container reference.
     * @see #setCookbook(CookbookVersion)
     * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getRecipe_Cookbook()
     * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getRecipes
     * @model opposite="recipes" required="true" transient="false"
     * @generated
     */
    CookbookVersion getCookbook();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.Recipe#getCookbook <em>Cookbook</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cookbook</em>' container reference.
     * @see #getCookbook()
     * @generated
     */
    void setCookbook(CookbookVersion value);

    /**
     * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
     * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.Resource}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resources</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resources</em>' containment reference list.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getRecipe_Resources()
     * @model containment="true" resolveProxies="true" required="true"
     * @generated
     */
    EList<Resource> getResources();

    /**
     * Returns the value of the '<em><b>Role</b></em>' reference list.
     * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.Role}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role</em>' reference list.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getRecipe_Role()
     * @model
     * @generated
     */
    EList<Role> getRole();

    /**
     * Returns the value of the '<em><b>Runlist</b></em>' reference list.
     * The list contents are of type {@link org.limepepper.chefclipse.common.chefserver.RunList}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Runlist</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Runlist</em>' reference list.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getRecipe_Runlist()
     * @model
     * @generated
     */
    EList<RunList> getRunlist();

    /**
     * Returns the value of the '<em><b>Old Cookbook</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Old Cookbook</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Old Cookbook</em>' reference.
     * @see #setOldCookbook(Cookbook)
     * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getRecipe_OldCookbook()
     * @model required="true"
     * @generated
     */
    Cookbook getOldCookbook();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.Recipe#getOldCookbook <em>Old Cookbook</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Old Cookbook</em>' reference.
     * @see #getOldCookbook()
     * @generated
     */
    void setOldCookbook(Cookbook value);

} // Recipe
