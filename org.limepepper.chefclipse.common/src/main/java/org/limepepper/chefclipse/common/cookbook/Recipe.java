/**
 */
package org.limepepper.chefclipse.common.cookbook;

import org.eclipse.emf.common.util.EList;
<<<<<<< HEAD
=======
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.RubyFile;
import org.limepepper.chefclipse.SandboxedObject;
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.RunList;
import org.limepepper.chefclipse.common.chefserver.RunListItem;
import org.limepepper.chefclipse.utility.RubyFile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Recipe#getRole <em>Role</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.Recipe#getRunlist <em>Runlist</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getRecipe()
 * @model
 * @generated
 */
<<<<<<< HEAD
public interface Recipe extends CookbookFile, RubyFile, RunListItem {
=======
public interface Recipe extends SandboxedObject, RubyFile, ChecksumFile, NamedObject, CookbookFile, RunListItem {
>>>>>>> origin/tomhodder
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

} // Recipe
