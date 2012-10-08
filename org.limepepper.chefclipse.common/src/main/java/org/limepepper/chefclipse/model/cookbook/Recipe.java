/**
 */
package org.limepepper.chefclipse.model.cookbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.limepepper.chefclipse.model.chefserver.Role;
import org.limepepper.chefclipse.model.chefserver.RunList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.Recipe#getRunlist <em>Runlist</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.Recipe#getRole <em>Role</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.Recipe#getResources <em>Resources</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.Recipe#getCookbook <em>Cookbook</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.model.cookbook.CookbookPackage#getRecipe()
 * @model
 * @generated
 */
public interface Recipe extends EObject {
	/**
	 * Returns the value of the '<em><b>Runlist</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.model.chefserver.RunList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runlist</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runlist</em>' reference list.
	 * @see org.limepepper.chefclipse.model.cookbook.CookbookPackage#getRecipe_Runlist()
	 * @model
	 * @generated
	 */
	EList<RunList> getRunlist();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(Role)
	 * @see org.limepepper.chefclipse.model.cookbook.CookbookPackage#getRecipe_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.cookbook.Recipe#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.model.cookbook.Resource}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.model.cookbook.Resource#getRecipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.limepepper.chefclipse.model.cookbook.CookbookPackage#getRecipe_Resources()
	 * @see org.limepepper.chefclipse.model.cookbook.Resource#getRecipe
	 * @model opposite="recipe" containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Cookbook</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.model.cookbook.Cookbook}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.model.cookbook.Cookbook#getRecipes <em>Recipes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbook</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbook</em>' reference list.
	 * @see org.limepepper.chefclipse.model.cookbook.CookbookPackage#getRecipe_Cookbook()
	 * @see org.limepepper.chefclipse.model.cookbook.Cookbook#getRecipes
	 * @model opposite="recipes"
	 * @generated
	 */
	EList<Cookbook> getCookbook();

} // Recipe
