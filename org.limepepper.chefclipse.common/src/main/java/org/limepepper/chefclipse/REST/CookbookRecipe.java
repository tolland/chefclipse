/**
 */
package org.limepepper.chefclipse.REST;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cookbook Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.REST.CookbookRecipe#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookRecipe()
 * @model
 * @generated
 */
public interface CookbookRecipe extends EObject {
    /**
     * Returns the value of the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Path</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Path</em>' attribute.
     * @see #setPath(String)
     * @see org.limepepper.chefclipse.REST.RESTPackage#getCookbookRecipe_Path()
     * @model required="true"
     * @generated
     */
    String getPath();

    /**
     * Sets the value of the '{@link org.limepepper.chefclipse.REST.CookbookRecipe#getPath <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Path</em>' attribute.
     * @see #getPath()
     * @generated
     */
    void setPath(String value);

} // CookbookRecipe
