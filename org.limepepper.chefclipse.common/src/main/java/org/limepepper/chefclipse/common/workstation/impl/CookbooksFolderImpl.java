/**
 */
package org.limepepper.chefclipse.common.workstation.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

import org.limepepper.chefclipse.common.workstation.CookbooksFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cookbooks Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.workstation.impl.CookbooksFolderImpl#getCookbooks <em>Cookbooks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CookbooksFolderImpl extends WorkstationFolderImpl implements CookbooksFolder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbooksFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkstationPackage.Literals.COOKBOOKS_FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CookbookVersion> getCookbooks() {
		return (EList<CookbookVersion>)eGet(WorkstationPackage.Literals.COOKBOOKS_FOLDER__COOKBOOKS, true);
	}

} //CookbooksFolderImpl
