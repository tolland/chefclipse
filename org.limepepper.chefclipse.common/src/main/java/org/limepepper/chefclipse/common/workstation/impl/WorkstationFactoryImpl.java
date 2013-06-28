/**
 */
package org.limepepper.chefclipse.common.workstation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.workstation.*;
=======
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.workstation.CertificatesFolder;
import org.limepepper.chefclipse.common.workstation.ConfigFolder;
import org.limepepper.chefclipse.common.workstation.CookbooksFolder;
import org.limepepper.chefclipse.common.workstation.DataBagsFolder;
import org.limepepper.chefclipse.common.workstation.EnvironmentsFolder;
import org.limepepper.chefclipse.common.workstation.Rakefile;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.common.workstation.RolesFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationFactory;
import org.limepepper.chefclipse.common.workstation.WorkstationFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
<<<<<<< HEAD
public class WorkstationFactoryImpl extends EFactoryImpl implements
		WorkstationFactory {
=======
public class WorkstationFactoryImpl extends EFactoryImpl implements WorkstationFactory {
>>>>>>> origin/tomhodder
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkstationFactory init() {
		try {
<<<<<<< HEAD
			WorkstationFactory theWorkstationFactory = (WorkstationFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://limepepper.org/v1/chefclipse/workstation");
			if (theWorkstationFactory != null) {
				return theWorkstationFactory;
			}
		} catch (Exception exception) {
=======
			WorkstationFactory theWorkstationFactory = (WorkstationFactory)EPackage.Registry.INSTANCE.getEFactory("http://limepepper.org/v1/chefclipse/workstation"); 
			if (theWorkstationFactory != null) {
				return theWorkstationFactory;
			}
		}
		catch (Exception exception) {
>>>>>>> origin/tomhodder
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkstationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
<<<<<<< HEAD
		case WorkstationPackage.REPOSITORY:
			return createRepository();
		case WorkstationPackage.CONFIG_FOLDER:
			return createConfigFolder();
		case WorkstationPackage.CERTIFICATES_FOLDER:
			return createCertificatesFolder();
		case WorkstationPackage.DATA_BAGS_FOLDER:
			return createDataBagsFolder();
		case WorkstationPackage.ENVIRONMENTS_FOLDER:
			return createEnvironmentsFolder();
		case WorkstationPackage.ROLES_FOLDER:
			return createRolesFolder();
		case WorkstationPackage.RAKEFILE:
			return createRakefile();
		case WorkstationPackage.WORKSTATION_FOLDER:
			return createWorkstationFolder();
		case WorkstationPackage.COOKBOOKS_FOLDER:
			return createCookbooksFolder();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
=======
			case WorkstationPackage.REPOSITORY: return createRepository();
			case WorkstationPackage.CONFIG_FOLDER: return createConfigFolder();
			case WorkstationPackage.CERTIFICATES_FOLDER: return createCertificatesFolder();
			case WorkstationPackage.DATA_BAGS_FOLDER: return createDataBagsFolder();
			case WorkstationPackage.ENVIRONMENTS_FOLDER: return createEnvironmentsFolder();
			case WorkstationPackage.ROLES_FOLDER: return createRolesFolder();
			case WorkstationPackage.RAKEFILE: return createRakefile();
			case WorkstationPackage.COOKBOOKS_FOLDER: return createCookbooksFolder();
			case WorkstationPackage.WORKSTATION_FOLDER: return createWorkstationFolder();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
>>>>>>> origin/tomhodder
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFolder createConfigFolder() {
		ConfigFolderImpl configFolder = new ConfigFolderImpl();
		return configFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificatesFolder createCertificatesFolder() {
		CertificatesFolderImpl certificatesFolder = new CertificatesFolderImpl();
		return certificatesFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBagsFolder createDataBagsFolder() {
		DataBagsFolderImpl dataBagsFolder = new DataBagsFolderImpl();
		return dataBagsFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentsFolder createEnvironmentsFolder() {
		EnvironmentsFolderImpl environmentsFolder = new EnvironmentsFolderImpl();
		return environmentsFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesFolder createRolesFolder() {
		RolesFolderImpl rolesFolder = new RolesFolderImpl();
		return rolesFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rakefile createRakefile() {
		RakefileImpl rakefile = new RakefileImpl();
		return rakefile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public WorkstationFolder createWorkstationFolder() {
		WorkstationFolderImpl workstationFolder = new WorkstationFolderImpl();
		return workstationFolder;
=======
	public CookbooksFolder createCookbooksFolder() {
		CookbooksFolderImpl cookbooksFolder = new CookbooksFolderImpl();
		return cookbooksFolder;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public CookbooksFolder createCookbooksFolder() {
		CookbooksFolderImpl cookbooksFolder = new CookbooksFolderImpl();
		return cookbooksFolder;
=======
	public WorkstationFolder createWorkstationFolder() {
		WorkstationFolderImpl workstationFolder = new WorkstationFolderImpl();
		return workstationFolder;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstationPackage getWorkstationPackage() {
<<<<<<< HEAD
		return (WorkstationPackage) getEPackage();
=======
		return (WorkstationPackage)getEPackage();
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkstationPackage getPackage() {
		return WorkstationPackage.eINSTANCE;
	}

} //WorkstationFactoryImpl
