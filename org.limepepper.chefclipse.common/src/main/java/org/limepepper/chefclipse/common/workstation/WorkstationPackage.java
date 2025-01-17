/**
 */
package org.limepepper.chefclipse.common.workstation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
<<<<<<< HEAD
import org.limepepper.chefclipse.utility.UtilityPackage;
=======
import org.limepepper.chefclipse.ChefclipsePackage;
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.common.workstation.WorkstationFactory
 * @model kind="package"
 * @generated
 */
public interface WorkstationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workstation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://limepepper.org/v1/chefclipse/workstation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.limepepepper.chefclipse";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	WorkstationPackage eINSTANCE = org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl
			.init();
=======
	WorkstationPackage eINSTANCE = org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl.init();
>>>>>>> origin/tomhodder

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.workstation.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.workstation.impl.RepositoryImpl
	 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
<<<<<<< HEAD
	int REPOSITORY__DESCRIPTION = UtilityPackage.NAMED_DESCRIBED_OBJECT__DESCRIPTION;
=======
	int REPOSITORY__DESCRIPTION = ChefclipsePackage.NAMED_DESCRIBED_OBJECT__DESCRIPTION;
>>>>>>> origin/tomhodder

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
<<<<<<< HEAD
	int REPOSITORY__NAME = UtilityPackage.NAMED_DESCRIBED_OBJECT__NAME;
=======
	int REPOSITORY__NAME = ChefclipsePackage.NAMED_DESCRIBED_OBJECT__NAME;
>>>>>>> origin/tomhodder

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
<<<<<<< HEAD
	int REPOSITORY__ID = UtilityPackage.NAMED_DESCRIBED_OBJECT__ID;
=======
	int REPOSITORY__ID = ChefclipsePackage.NAMED_DESCRIBED_OBJECT__ID;
>>>>>>> origin/tomhodder

	/**
	 * The feature id for the '<em><b>OS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
<<<<<<< HEAD
	int REPOSITORY__OS = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 0;
=======
	int REPOSITORY__OS = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 0;
>>>>>>> origin/tomhodder

	/**
	 * The feature id for the '<em><b>Basepath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
<<<<<<< HEAD
	int REPOSITORY__BASEPATH = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 1;
=======
	int REPOSITORY__BASEPATH = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 1;
>>>>>>> origin/tomhodder

	/**
	 * The feature id for the '<em><b>Cookbooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
<<<<<<< HEAD
	int REPOSITORY__COOKBOOKS = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Knives</b></em>' reference list.
=======
	int REPOSITORY__COOKBOOKS = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Knife</b></em>' reference list.
>>>>>>> origin/tomhodder
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
<<<<<<< HEAD
	int REPOSITORY__KNIVES = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 3;
=======
	int REPOSITORY__KNIFE = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 3;
>>>>>>> origin/tomhodder

	/**
	 * The feature id for the '<em><b>Cookbook Folders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
<<<<<<< HEAD
	int REPOSITORY__COOKBOOK_FOLDERS = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 4;
=======
	int REPOSITORY__COOKBOOK_FOLDERS = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 4;
>>>>>>> origin/tomhodder

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
<<<<<<< HEAD
	int REPOSITORY_FEATURE_COUNT = UtilityPackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 5;
=======
	int REPOSITORY_FEATURE_COUNT = ChefclipsePackage.NAMED_DESCRIBED_OBJECT_FEATURE_COUNT + 5;
>>>>>>> origin/tomhodder

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.workstation.impl.WorkstationFolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationFolderImpl
	 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getWorkstationFolder()
	 * @generated
	 */
<<<<<<< HEAD
	int WORKSTATION_FOLDER = 7;
=======
	int WORKSTATION_FOLDER = 8;
>>>>>>> origin/tomhodder

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
<<<<<<< HEAD
	int WORKSTATION_FOLDER__NAME = UtilityPackage.NAMED_OBJECT__NAME;
=======
	int WORKSTATION_FOLDER__NAME = ChefclipsePackage.NAMED_OBJECT__NAME;
>>>>>>> origin/tomhodder

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
<<<<<<< HEAD
	int WORKSTATION_FOLDER__ID = UtilityPackage.NAMED_OBJECT__ID;
=======
	int WORKSTATION_FOLDER__ID = ChefclipsePackage.NAMED_OBJECT__ID;
>>>>>>> origin/tomhodder

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
<<<<<<< HEAD
	int WORKSTATION_FOLDER_FEATURE_COUNT = UtilityPackage.NAMED_OBJECT_FEATURE_COUNT + 0;
=======
	int WORKSTATION_FOLDER_FEATURE_COUNT = ChefclipsePackage.NAMED_OBJECT_FEATURE_COUNT + 0;
>>>>>>> origin/tomhodder

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.workstation.impl.ConfigFolderImpl <em>Config Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.workstation.impl.ConfigFolderImpl
	 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getConfigFolder()
	 * @generated
	 */
	int CONFIG_FOLDER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FOLDER__NAME = WORKSTATION_FOLDER__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FOLDER__ID = WORKSTATION_FOLDER__ID;

	/**
	 * The number of structural features of the '<em>Config Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FOLDER_FEATURE_COUNT = WORKSTATION_FOLDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.workstation.impl.CertificatesFolderImpl <em>Certificates Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.workstation.impl.CertificatesFolderImpl
	 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getCertificatesFolder()
	 * @generated
	 */
	int CERTIFICATES_FOLDER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES_FOLDER__NAME = WORKSTATION_FOLDER__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES_FOLDER__ID = WORKSTATION_FOLDER__ID;

	/**
	 * The number of structural features of the '<em>Certificates Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATES_FOLDER_FEATURE_COUNT = WORKSTATION_FOLDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.workstation.impl.DataBagsFolderImpl <em>Data Bags Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.workstation.impl.DataBagsFolderImpl
	 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getDataBagsFolder()
	 * @generated
	 */
	int DATA_BAGS_FOLDER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAGS_FOLDER__NAME = WORKSTATION_FOLDER__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAGS_FOLDER__ID = WORKSTATION_FOLDER__ID;

	/**
	 * The number of structural features of the '<em>Data Bags Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BAGS_FOLDER_FEATURE_COUNT = WORKSTATION_FOLDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.workstation.impl.EnvironmentsFolderImpl <em>Environments Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.workstation.impl.EnvironmentsFolderImpl
	 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getEnvironmentsFolder()
	 * @generated
	 */
	int ENVIRONMENTS_FOLDER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTS_FOLDER__NAME = WORKSTATION_FOLDER__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTS_FOLDER__ID = WORKSTATION_FOLDER__ID;

	/**
	 * The number of structural features of the '<em>Environments Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENTS_FOLDER_FEATURE_COUNT = WORKSTATION_FOLDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.workstation.impl.RolesFolderImpl <em>Roles Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.workstation.impl.RolesFolderImpl
	 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getRolesFolder()
	 * @generated
	 */
	int ROLES_FOLDER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_FOLDER__NAME = WORKSTATION_FOLDER__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_FOLDER__ID = WORKSTATION_FOLDER__ID;

	/**
	 * The number of structural features of the '<em>Roles Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_FOLDER_FEATURE_COUNT = WORKSTATION_FOLDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.workstation.impl.RakefileImpl <em>Rakefile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.workstation.impl.RakefileImpl
	 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getRakefile()
	 * @generated
	 */
	int RAKEFILE = 6;

	/**
	 * The number of structural features of the '<em>Rakefile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAKEFILE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.workstation.impl.CookbooksFolderImpl <em>Cookbooks Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.workstation.impl.CookbooksFolderImpl
	 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getCookbooksFolder()
	 * @generated
	 */
<<<<<<< HEAD
	int COOKBOOKS_FOLDER = 8;
=======
	int COOKBOOKS_FOLDER = 7;
>>>>>>> origin/tomhodder

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOKS_FOLDER__NAME = WORKSTATION_FOLDER__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOKS_FOLDER__ID = WORKSTATION_FOLDER__ID;

	/**
	 * The feature id for the '<em><b>Cookbooks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOKS_FOLDER__COOKBOOKS = WORKSTATION_FOLDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cookbooks Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOKBOOKS_FOLDER_FEATURE_COUNT = WORKSTATION_FOLDER_FEATURE_COUNT + 1;

<<<<<<< HEAD
=======

>>>>>>> origin/tomhodder
	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.workstation.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.workstation.Repository#getOS <em>OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OS</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.Repository#getOS()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_OS();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.workstation.Repository#getBasepath <em>Basepath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Basepath</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.Repository#getBasepath()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Basepath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.workstation.Repository#getCookbooks <em>Cookbooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cookbooks</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.Repository#getCookbooks()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Cookbooks();

	/**
<<<<<<< HEAD
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.workstation.Repository#getKnives <em>Knives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Knives</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.Repository#getKnives()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Knives();
=======
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.workstation.Repository#getKnife <em>Knife</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Knife</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.Repository#getKnife()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Knife();
>>>>>>> origin/tomhodder

	/**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.workstation.Repository#getCookbookFolders <em>Cookbook Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cookbook Folders</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.Repository#getCookbookFolders()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_CookbookFolders();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.workstation.ConfigFolder <em>Config Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Folder</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.ConfigFolder
	 * @generated
	 */
	EClass getConfigFolder();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.workstation.CertificatesFolder <em>Certificates Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificates Folder</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.CertificatesFolder
	 * @generated
	 */
	EClass getCertificatesFolder();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.workstation.DataBagsFolder <em>Data Bags Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Bags Folder</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.DataBagsFolder
	 * @generated
	 */
	EClass getDataBagsFolder();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.workstation.EnvironmentsFolder <em>Environments Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environments Folder</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.EnvironmentsFolder
	 * @generated
	 */
	EClass getEnvironmentsFolder();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.workstation.RolesFolder <em>Roles Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roles Folder</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.RolesFolder
	 * @generated
	 */
	EClass getRolesFolder();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.workstation.Rakefile <em>Rakefile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rakefile</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.Rakefile
	 * @generated
	 */
	EClass getRakefile();

	/**
<<<<<<< HEAD
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.workstation.WorkstationFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationFolder
	 * @generated
	 */
	EClass getWorkstationFolder();

	/**
=======
>>>>>>> origin/tomhodder
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.workstation.CookbooksFolder <em>Cookbooks Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cookbooks Folder</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.CookbooksFolder
	 * @generated
	 */
	EClass getCookbooksFolder();

	/**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.common.workstation.CookbooksFolder#getCookbooks <em>Cookbooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cookbooks</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.CookbooksFolder#getCookbooks()
	 * @see #getCookbooksFolder()
	 * @generated
	 */
	EReference getCookbooksFolder_Cookbooks();

	/**
<<<<<<< HEAD
=======
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.workstation.WorkstationFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationFolder
	 * @generated
	 */
	EClass getWorkstationFolder();

	/**
>>>>>>> origin/tomhodder
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkstationFactory getWorkstationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.workstation.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.workstation.impl.RepositoryImpl
		 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>OS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__OS = eINSTANCE.getRepository_OS();

		/**
		 * The meta object literal for the '<em><b>Basepath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__BASEPATH = eINSTANCE.getRepository_Basepath();

		/**
		 * The meta object literal for the '<em><b>Cookbooks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__COOKBOOKS = eINSTANCE.getRepository_Cookbooks();

		/**
<<<<<<< HEAD
		 * The meta object literal for the '<em><b>Knives</b></em>' reference list feature.
=======
		 * The meta object literal for the '<em><b>Knife</b></em>' reference list feature.
>>>>>>> origin/tomhodder
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
<<<<<<< HEAD
		EReference REPOSITORY__KNIVES = eINSTANCE.getRepository_Knives();
=======
		EReference REPOSITORY__KNIFE = eINSTANCE.getRepository_Knife();
>>>>>>> origin/tomhodder

		/**
		 * The meta object literal for the '<em><b>Cookbook Folders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
<<<<<<< HEAD
		EReference REPOSITORY__COOKBOOK_FOLDERS = eINSTANCE
				.getRepository_CookbookFolders();
=======
		EReference REPOSITORY__COOKBOOK_FOLDERS = eINSTANCE.getRepository_CookbookFolders();
>>>>>>> origin/tomhodder

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.workstation.impl.ConfigFolderImpl <em>Config Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.workstation.impl.ConfigFolderImpl
		 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getConfigFolder()
		 * @generated
		 */
		EClass CONFIG_FOLDER = eINSTANCE.getConfigFolder();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.workstation.impl.CertificatesFolderImpl <em>Certificates Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.workstation.impl.CertificatesFolderImpl
		 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getCertificatesFolder()
		 * @generated
		 */
		EClass CERTIFICATES_FOLDER = eINSTANCE.getCertificatesFolder();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.workstation.impl.DataBagsFolderImpl <em>Data Bags Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.workstation.impl.DataBagsFolderImpl
		 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getDataBagsFolder()
		 * @generated
		 */
		EClass DATA_BAGS_FOLDER = eINSTANCE.getDataBagsFolder();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.workstation.impl.EnvironmentsFolderImpl <em>Environments Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.workstation.impl.EnvironmentsFolderImpl
		 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getEnvironmentsFolder()
		 * @generated
		 */
		EClass ENVIRONMENTS_FOLDER = eINSTANCE.getEnvironmentsFolder();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.workstation.impl.RolesFolderImpl <em>Roles Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.workstation.impl.RolesFolderImpl
		 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getRolesFolder()
		 * @generated
		 */
		EClass ROLES_FOLDER = eINSTANCE.getRolesFolder();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.workstation.impl.RakefileImpl <em>Rakefile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.workstation.impl.RakefileImpl
		 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getRakefile()
		 * @generated
		 */
		EClass RAKEFILE = eINSTANCE.getRakefile();

		/**
<<<<<<< HEAD
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.workstation.impl.WorkstationFolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationFolderImpl
		 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getWorkstationFolder()
		 * @generated
		 */
		EClass WORKSTATION_FOLDER = eINSTANCE.getWorkstationFolder();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.workstation.impl.CookbooksFolderImpl <em>Cookbooks Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.workstation.impl.CookbooksFolderImpl
		 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getCookbooksFolder()
		 * @generated
		 */
		EClass COOKBOOKS_FOLDER = eINSTANCE.getCookbooksFolder();

		/**
		 * The meta object literal for the '<em><b>Cookbooks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COOKBOOKS_FOLDER__COOKBOOKS = eINSTANCE
				.getCookbooksFolder_Cookbooks();
=======
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.workstation.impl.CookbooksFolderImpl <em>Cookbooks Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.workstation.impl.CookbooksFolderImpl
		 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getCookbooksFolder()
		 * @generated
		 */
		EClass COOKBOOKS_FOLDER = eINSTANCE.getCookbooksFolder();

		/**
		 * The meta object literal for the '<em><b>Cookbooks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COOKBOOKS_FOLDER__COOKBOOKS = eINSTANCE.getCookbooksFolder_Cookbooks();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.workstation.impl.WorkstationFolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationFolderImpl
		 * @see org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl#getWorkstationFolder()
		 * @generated
		 */
		EClass WORKSTATION_FOLDER = eINSTANCE.getWorkstationFolder();
>>>>>>> origin/tomhodder

	}

} //WorkstationPackage
