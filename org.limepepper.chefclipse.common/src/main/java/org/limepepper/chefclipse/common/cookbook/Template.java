/**
 */
package org.limepepper.chefclipse.common.cookbook;

import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.SandboxedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Template#getCookbook <em>Cookbook</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends SandboxedObject, ChecksumFile {
    /**
     * Returns the value of the '<em><b>Cookbook</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion#getTemplates <em>Templates</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cookbook</em>' container reference.
     * @see #setCookbook(CookbookVersion)
     * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getTemplate_Cookbook()
     * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion#getTemplates
     * @model opposite="templates" required="true" transient="false"
     * @generated
     */
    CookbookVersion getCookbook();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.Template#getCookbook <em>Cookbook</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cookbook</em>' container reference.
     * @see #getCookbook()
     * @generated
     */
    void setCookbook(CookbookVersion value);

} // Template
