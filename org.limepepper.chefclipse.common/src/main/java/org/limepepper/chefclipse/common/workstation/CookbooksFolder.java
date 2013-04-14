/**
 */
package org.limepepper.chefclipse.common.workstation;

import org.eclipse.emf.common.util.EList;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cookbooks Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.CookbooksFolder#getCookbooks <em>Cookbooks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#getCookbooksFolder()
 * @model
 * @generated
 */
public interface CookbooksFolder extends WorkstationFolder {
	/**
	 * Returns the value of the '<em><b>Cookbooks</b></em>' reference list.
	 * The list contents are of type {@link org.limepepper.chefclipse.common.cookbook.CookbookVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbooks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbooks</em>' reference list.
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#getCookbooksFolder_Cookbooks()
	 * @model
	 * @generated
	 */
	EList<CookbookVersion> getCookbooks();

} // CookbooksFolder
