/**
 */
package org.limepepper.chefclipse.common.chefserver;

import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.utility.SandboxedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Cookbook File</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookFile()
 * @model
 * @generated
 */
<<<<<<< HEAD
public interface ServerCookbookFile extends SandboxedObject, CookbookFile {
=======
public interface ServerCookbookFile extends NamedObject, ChecksumFile, SandboxedObject {
    /**
	 * Returns the value of the '<em><b>Cookbook</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cookbook</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookbook</em>' reference.
	 * @see #setCookbook(ServerCookbookVersion)
	 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage#getServerCookbookFile_Cookbook()
	 * @model required="true"
	 * @generated
	 */
    ServerCookbookVersion getCookbook();

    /**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookFile#getCookbook <em>Cookbook</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookbook</em>' reference.
	 * @see #getCookbook()
	 * @generated
	 */
    void setCookbook(ServerCookbookVersion value);
>>>>>>> origin/tomhodder

} // ServerCookbookFile
