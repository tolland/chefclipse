/**
 */
package org.limepepper.chefclipse.common.cookbook;

import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.RubyFile;
import org.limepepper.chefclipse.SandboxedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Resource#getRecipe <em>Recipe</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends RubyFile, SandboxedObject, ChecksumFile {

    /**
     * Returns the value of the '<em><b>Recipe</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Recipe</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Recipe</em>' reference.
     * @see #setRecipe(Recipe)
     * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getResource_Recipe()
     * @model required="true"
     * @generated
     */
    Recipe getRecipe();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.Resource#getRecipe <em>Recipe</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Recipe</em>' reference.
     * @see #getRecipe()
     * @generated
     */
    void setRecipe(Recipe value);
} // Resource
