/**
 */
package org.limepepper.chefclipse.model.cookbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.limepepper.chefclipse.model.chefserver.Environment;
import org.limepepper.chefclipse.model.workstation.Repository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cookbook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.Cookbook#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.Cookbook#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.Cookbook#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.Cookbook#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.model.cookbook.Cookbook#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.model.cookbook.CookbookPackage#getCookbook()
 * @model
 * @generated
 */
public interface Cookbook extends EObject {
	/**
	 * Returns the value of the '<em><b>Depends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' reference.
	 * @see #setDepends(DependencyRelation)
	 * @see org.limepepper.chefclipse.model.cookbook.CookbookPackage#getCookbook_Depends()
	 * @model
	 * @generated
	 */
	DependencyRelation getDepends();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.cookbook.Cookbook#getDepends <em>Depends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends</em>' reference.
	 * @see #getDepends()
	 * @generated
	 */
	void setDepends(DependencyRelation value);

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
	 * @see org.limepepper.chefclipse.model.cookbook.CookbookPackage#getCookbook_Environment()
	 * @model required="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.cookbook.Cookbook#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Recipes</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.model.cookbook.Recipe}.
	 * It is bidirectional and its opposite is '{@link org.limepepper.chefclipse.model.cookbook.Recipe#getCookbook <em>Cookbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipes</em>' reference list.
	 * @see org.limepepper.chefclipse.model.cookbook.CookbookPackage#getCookbook_Recipes()
	 * @see org.limepepper.chefclipse.model.cookbook.Recipe#getCookbook
	 * @model opposite="cookbook"
	 * @generated
	 */
	EList<Recipe> getRecipes();

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
	 * @see org.limepepper.chefclipse.model.cookbook.CookbookPackage#getCookbook_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.cookbook.Cookbook#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(Repository)
	 * @see org.limepepper.chefclipse.model.cookbook.CookbookPackage#getCookbook_Repository()
	 * @model
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.model.cookbook.Cookbook#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // Cookbook
