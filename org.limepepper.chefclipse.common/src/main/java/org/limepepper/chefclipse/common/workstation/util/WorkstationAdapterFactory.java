/**
 */
package org.limepepper.chefclipse.common.workstation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.workstation.*;
=======
import org.limepepper.chefclipse.DescribedObject;
import org.limepepper.chefclipse.NamedDescribedObject;
import org.limepepper.chefclipse.NamedObject;
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.workstation.CertificatesFolder;
import org.limepepper.chefclipse.common.workstation.ConfigFolder;
import org.limepepper.chefclipse.common.workstation.CookbooksFolder;
import org.limepepper.chefclipse.common.workstation.DataBagsFolder;
import org.limepepper.chefclipse.common.workstation.EnvironmentsFolder;
import org.limepepper.chefclipse.common.workstation.Rakefile;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.common.workstation.RolesFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationPackage;
<<<<<<< HEAD
import org.limepepper.chefclipse.utility.DescribedObject;
import org.limepepper.chefclipse.utility.NamedDescribedObject;
import org.limepepper.chefclipse.utility.NamedObject;
=======
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage
 * @generated
 */
public class WorkstationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkstationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WorkstationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
<<<<<<< HEAD
			return ((EObject) object).eClass().getEPackage() == modelPackage;
=======
			return ((EObject)object).eClass().getEPackage() == modelPackage;
>>>>>>> origin/tomhodder
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	protected WorkstationSwitch<Adapter> modelSwitch = new WorkstationSwitch<Adapter>() {
		@Override
		public Adapter caseRepository(Repository object) {
			return createRepositoryAdapter();
		}

		@Override
		public Adapter caseConfigFolder(ConfigFolder object) {
			return createConfigFolderAdapter();
		}

		@Override
		public Adapter caseCertificatesFolder(CertificatesFolder object) {
			return createCertificatesFolderAdapter();
		}

		@Override
		public Adapter caseDataBagsFolder(DataBagsFolder object) {
			return createDataBagsFolderAdapter();
		}

		@Override
		public Adapter caseEnvironmentsFolder(EnvironmentsFolder object) {
			return createEnvironmentsFolderAdapter();
		}

		@Override
		public Adapter caseRolesFolder(RolesFolder object) {
			return createRolesFolderAdapter();
		}

		@Override
		public Adapter caseRakefile(Rakefile object) {
			return createRakefileAdapter();
		}

		@Override
		public Adapter caseWorkstationFolder(WorkstationFolder object) {
			return createWorkstationFolderAdapter();
		}

		@Override
		public Adapter caseCookbooksFolder(CookbooksFolder object) {
			return createCookbooksFolderAdapter();
		}

		@Override
		public Adapter caseDescribedObject(DescribedObject object) {
			return createDescribedObjectAdapter();
		}

		@Override
		public Adapter caseNamedObject(NamedObject object) {
			return createNamedObjectAdapter();
		}

		@Override
		public Adapter caseNamedDescribedObject(NamedDescribedObject object) {
			return createNamedDescribedObjectAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};
=======
	protected WorkstationSwitch<Adapter> modelSwitch =
		new WorkstationSwitch<Adapter>() {
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseConfigFolder(ConfigFolder object) {
				return createConfigFolderAdapter();
			}
			@Override
			public Adapter caseCertificatesFolder(CertificatesFolder object) {
				return createCertificatesFolderAdapter();
			}
			@Override
			public Adapter caseDataBagsFolder(DataBagsFolder object) {
				return createDataBagsFolderAdapter();
			}
			@Override
			public Adapter caseEnvironmentsFolder(EnvironmentsFolder object) {
				return createEnvironmentsFolderAdapter();
			}
			@Override
			public Adapter caseRolesFolder(RolesFolder object) {
				return createRolesFolderAdapter();
			}
			@Override
			public Adapter caseRakefile(Rakefile object) {
				return createRakefileAdapter();
			}
			@Override
			public Adapter caseCookbooksFolder(CookbooksFolder object) {
				return createCookbooksFolderAdapter();
			}
			@Override
			public Adapter caseWorkstationFolder(WorkstationFolder object) {
				return createWorkstationFolderAdapter();
			}
			@Override
			public Adapter caseDescribedObject(DescribedObject object) {
				return createDescribedObjectAdapter();
			}
			@Override
			public Adapter caseNamedObject(NamedObject object) {
				return createNamedObjectAdapter();
			}
			@Override
			public Adapter caseNamedDescribedObject(NamedDescribedObject object) {
				return createNamedDescribedObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};
>>>>>>> origin/tomhodder

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
<<<<<<< HEAD
		return modelSwitch.doSwitch((EObject) target);
	}

=======
		return modelSwitch.doSwitch((EObject)target);
	}


>>>>>>> origin/tomhodder
	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.workstation.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.workstation.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.workstation.ConfigFolder <em>Config Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.workstation.ConfigFolder
	 * @generated
	 */
	public Adapter createConfigFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.workstation.CertificatesFolder <em>Certificates Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.workstation.CertificatesFolder
	 * @generated
	 */
	public Adapter createCertificatesFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.workstation.DataBagsFolder <em>Data Bags Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.workstation.DataBagsFolder
	 * @generated
	 */
	public Adapter createDataBagsFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.workstation.EnvironmentsFolder <em>Environments Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.workstation.EnvironmentsFolder
	 * @generated
	 */
	public Adapter createEnvironmentsFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.workstation.RolesFolder <em>Roles Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.workstation.RolesFolder
	 * @generated
	 */
	public Adapter createRolesFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.workstation.Rakefile <em>Rakefile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.workstation.Rakefile
	 * @generated
	 */
	public Adapter createRakefileAdapter() {
		return null;
	}

	/**
<<<<<<< HEAD
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.workstation.WorkstationFolder <em>Folder</em>}'.
=======
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.workstation.CookbooksFolder <em>Cookbooks Folder</em>}'.
>>>>>>> origin/tomhodder
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
<<<<<<< HEAD
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationFolder
	 * @generated
	 */
	public Adapter createWorkstationFolderAdapter() {
=======
	 * @see org.limepepper.chefclipse.common.workstation.CookbooksFolder
	 * @generated
	 */
	public Adapter createCookbooksFolderAdapter() {
>>>>>>> origin/tomhodder
		return null;
	}

	/**
<<<<<<< HEAD
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.workstation.CookbooksFolder <em>Cookbooks Folder</em>}'.
=======
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.workstation.WorkstationFolder <em>Folder</em>}'.
>>>>>>> origin/tomhodder
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
<<<<<<< HEAD
	 * @see org.limepepper.chefclipse.common.workstation.CookbooksFolder
	 * @generated
	 */
	public Adapter createCookbooksFolderAdapter() {
=======
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationFolder
	 * @generated
	 */
	public Adapter createWorkstationFolderAdapter() {
>>>>>>> origin/tomhodder
		return null;
	}

	/**
<<<<<<< HEAD
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.utility.DescribedObject <em>Described Object</em>}'.
=======
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.DescribedObject <em>Described Object</em>}'.
>>>>>>> origin/tomhodder
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
<<<<<<< HEAD
	 * @see org.limepepper.chefclipse.utility.DescribedObject
=======
	 * @see org.limepepper.chefclipse.DescribedObject
>>>>>>> origin/tomhodder
	 * @generated
	 */
	public Adapter createDescribedObjectAdapter() {
		return null;
	}

	/**
<<<<<<< HEAD
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.utility.NamedObject <em>Named Object</em>}'.
=======
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.NamedObject <em>Named Object</em>}'.
>>>>>>> origin/tomhodder
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
<<<<<<< HEAD
	 * @see org.limepepper.chefclipse.utility.NamedObject
=======
	 * @see org.limepepper.chefclipse.NamedObject
>>>>>>> origin/tomhodder
	 * @generated
	 */
	public Adapter createNamedObjectAdapter() {
		return null;
	}

	/**
<<<<<<< HEAD
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.utility.NamedDescribedObject <em>Named Described Object</em>}'.
=======
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.NamedDescribedObject <em>Named Described Object</em>}'.
>>>>>>> origin/tomhodder
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
<<<<<<< HEAD
	 * @see org.limepepper.chefclipse.utility.NamedDescribedObject
=======
	 * @see org.limepepper.chefclipse.NamedDescribedObject
>>>>>>> origin/tomhodder
	 * @generated
	 */
	public Adapter createNamedDescribedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WorkstationAdapterFactory
