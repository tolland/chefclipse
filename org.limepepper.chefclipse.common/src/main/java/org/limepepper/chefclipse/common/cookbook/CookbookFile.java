/**
 */
package org.limepepper.chefclipse.common.cookbook;

import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.NamedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getCookbook <em>Cookbook</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookFile()
 * @model abstract="true"
 * @generated
 */
public interface CookbookFile extends NamedObject, ChecksumFile {
	/**
	 * Returns the value of the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookbook</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbook</em>' reference.
	 * @see #setCookbook(CookbookVersion)
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookFile_Cookbook()
	 * @model required="true"
	 * @generated
	 */
	CookbookVersion getCookbook();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getCookbook <em>Cookbook</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookbook</em>' reference.
	 * @see #getCookbook()
	 * @generated
	 */
	void setCookbook(CookbookVersion value);

} // CookbookFile
