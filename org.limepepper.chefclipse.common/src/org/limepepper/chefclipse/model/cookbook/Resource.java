/**
 */
package org.limepepper.chefclipse.model.cookbook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.Resource#getRecipe <em>Recipe</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.model.cookbook.CookbookPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Recipe</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.model.cookbook.Recipe#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipe</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipe</em>' container reference.
	 * @see #setRecipe(Recipe)
	 * @see org.limepepper.chefclipse.model.cookbook.CookbookPackage#getResource_Recipe()
	 * @see org.limepepper.chefclipse.model.cookbook.Recipe#getResources
	 * @model opposite="resources" required="true" transient="false"
	 * @generated
	 */
	Recipe getRecipe();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.cookbook.Resource#getRecipe <em>Recipe</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipe</em>' container reference.
	 * @see #getRecipe()
	 * @generated
	 */
	void setRecipe(Recipe value);

} // Resource
