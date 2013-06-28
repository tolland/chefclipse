/**
 */
package org.limepepper.chefclipse.common.cookbook;

import java.io.InputStream;

<<<<<<< HEAD
import org.limepepper.chefclipse.utility.ChecksumFile;
import org.limepepper.chefclipse.utility.NamedObject;
import org.limepepper.chefclipse.utility.SandboxedObject;
=======
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.NamedObject;
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getBytes <em>Bytes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getPath <em>Path</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getSpecificity <em>Specificity</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getCookbook <em>Cookbook</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getBytes <em>Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookFile()
 * @model abstract="true"
 * @generated
 */
<<<<<<< HEAD
public interface CookbookFile extends NamedObject, ChecksumFile,
		SandboxedObject {
=======
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

>>>>>>> origin/tomhodder
	/**
	 * Returns the value of the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bytes</em>' attribute.
	 * @see #isSetBytes()
	 * @see #unsetBytes()
	 * @see #setBytes(byte[])
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookFile_Bytes()
	 * @model unsettable="true" transient="true" volatile="true"
	 * @generated
	 */
	byte[] getBytes();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getBytes <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes</em>' attribute.
	 * @see #isSetBytes()
	 * @see #unsetBytes()
	 * @see #getBytes()
	 * @generated
	 */
	void setBytes(byte[] value);

	/**
	 * Unsets the value of the '{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getBytes <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBytes()
	 * @see #getBytes()
	 * @see #setBytes(byte[])
	 * @generated
	 */
	void unsetBytes();

	/**
	 * Returns whether the value of the '{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getBytes <em>Bytes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bytes</em>' attribute is set.
	 * @see #unsetBytes()
	 * @see #getBytes()
	 * @see #setBytes(byte[])
	 * @generated
	 */
	boolean isSetBytes();

	/**
<<<<<<< HEAD
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookFile_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Specificity</b></em>' attribute.
	 * The default value is <code>"default"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specificity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specificity</em>' attribute.
	 * @see #setSpecificity(String)
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookFile_Specificity()
	 * @model default="default" required="true"
	 * @generated
	 */
	String getSpecificity();

	/**
	 * Sets the value of the '{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getSpecificity <em>Specificity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specificity</em>' attribute.
	 * @see #getSpecificity()
	 * @generated
	 */
	void setSpecificity(String value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.limepepper.chefclipse.utility.EInputStream" required="true"
=======
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Stream</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.limepepper.chefclipse.EInputStream" required="true"
>>>>>>> origin/tomhodder
	 * @generated
	 */
	InputStream getContentStream();

} // CookbookFile
