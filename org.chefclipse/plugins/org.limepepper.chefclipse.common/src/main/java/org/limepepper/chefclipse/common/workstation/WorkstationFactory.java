/**
 */
package org.limepepper.chefclipse.common.workstation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage
 * @generated
 */
public interface WorkstationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkstationFactory eINSTANCE = org.limepepper.chefclipse.common.workstation.impl.WorkstationFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	Repository createRepository();

	/**
	 * Returns a new object of class '<em>Config Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Folder</em>'.
	 * @generated
	 */
	ConfigFolder createConfigFolder();

	/**
	 * Returns a new object of class '<em>Certificates Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Certificates Folder</em>'.
	 * @generated
	 */
	CertificatesFolder createCertificatesFolder();

	/**
	 * Returns a new object of class '<em>Data Bags Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Bags Folder</em>'.
	 * @generated
	 */
	DataBagsFolder createDataBagsFolder();

	/**
	 * Returns a new object of class '<em>Environments Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environments Folder</em>'.
	 * @generated
	 */
	EnvironmentsFolder createEnvironmentsFolder();

	/**
	 * Returns a new object of class '<em>Roles Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roles Folder</em>'.
	 * @generated
	 */
	RolesFolder createRolesFolder();

	/**
	 * Returns a new object of class '<em>Rakefile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rakefile</em>'.
	 * @generated
	 */
	Rakefile createRakefile();

	/**
	 * Returns a new object of class '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder</em>'.
	 * @generated
	 */
	WorkstationFolder createWorkstationFolder();

	/**
	 * Returns a new object of class '<em>Cookbooks Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cookbooks Folder</em>'.
	 * @generated
	 */
	CookbooksFolder createCookbooksFolder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WorkstationPackage getWorkstationPackage();

} //WorkstationFactory
