/**
 */
package org.limepepper.chefclipse.common.cookbook;

import java.io.InputStream;

import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.SandboxedObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getCookbook <em>Cookbook</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.cookbook.CookbookFile#getBytes <em>Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#getCookbookFile()
 * @model abstract="true"
 * @generated
 */
public interface CookbookFile extends NamedObject, ChecksumFile, SandboxedObject {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.limepepper.chefclipse.EInputStream" required="true"
	 * @generated
	 */
	InputStream getContentStream();

} // CookbookFile
