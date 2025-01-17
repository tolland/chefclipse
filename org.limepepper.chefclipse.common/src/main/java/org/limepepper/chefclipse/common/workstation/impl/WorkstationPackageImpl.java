/**
 */
package org.limepepper.chefclipse.common.workstation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
<<<<<<< HEAD
=======
import org.limepepper.chefclipse.ChefclipsePackage;
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;
import org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.impl.CookbookPackageImpl;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl;
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
<<<<<<< HEAD
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.limepepper.chefclipse.utility.impl.UtilityPackageImpl;
=======
import org.limepepper.chefclipse.impl.ChefclipsePackageImpl;
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
<<<<<<< HEAD
public class WorkstationPackageImpl extends EPackageImpl implements
		WorkstationPackage {
=======
public class WorkstationPackageImpl extends EPackageImpl implements WorkstationPackage {
>>>>>>> origin/tomhodder
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificatesFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBagsFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentsFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolesFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rakefileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	private EClass workstationFolderEClass = null;
=======
	private EClass cookbooksFolderEClass = null;
>>>>>>> origin/tomhodder

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	private EClass cookbooksFolderEClass = null;
=======
	private EClass workstationFolderEClass = null;
>>>>>>> origin/tomhodder

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.limepepper.chefclipse.common.workstation.WorkstationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkstationPackageImpl() {
		super(eNS_URI, WorkstationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WorkstationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkstationPackage init() {
<<<<<<< HEAD
		if (isInited)
			return (WorkstationPackage) EPackage.Registry.INSTANCE
					.getEPackage(WorkstationPackage.eNS_URI);

		// Obtain or create and register package
		WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new WorkstationPackageImpl());
=======
		if (isInited) return (WorkstationPackage)EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI);

		// Obtain or create and register package
		WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkstationPackageImpl());
>>>>>>> origin/tomhodder

		isInited = true;

		// Obtain or create and register interdependencies
<<<<<<< HEAD
		ChefserverPackageImpl theChefserverPackage = (ChefserverPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ChefserverPackage.eNS_URI) instanceof ChefserverPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ChefserverPackage.eNS_URI)
				: ChefserverPackage.eINSTANCE);
		ChefclientPackageImpl theChefclientPackage = (ChefclientPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ChefclientPackage.eNS_URI) instanceof ChefclientPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ChefclientPackage.eNS_URI)
				: ChefclientPackage.eINSTANCE);
		CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CookbookPackage.eNS_URI)
				: CookbookPackage.eINSTANCE);
		KnifePackageImpl theKnifePackage = (KnifePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilityPackage.eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilityPackage.eNS_URI) : UtilityPackage.eINSTANCE);

		// Create package meta-data objects
		theWorkstationPackage.createPackageContents();
=======
		ChefclipsePackageImpl theChefclipsePackage = (ChefclipsePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) instanceof ChefclipsePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) : ChefclipsePackage.eINSTANCE);
		ChefserverPackageImpl theChefserverPackage = (ChefserverPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) instanceof ChefserverPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) : ChefserverPackage.eINSTANCE);
		ChefclientPackageImpl theChefclientPackage = (ChefclientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) instanceof ChefclientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) : ChefclientPackage.eINSTANCE);
		CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) : CookbookPackage.eINSTANCE);
		KnifePackageImpl theKnifePackage = (KnifePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);

		// Create package meta-data objects
		theWorkstationPackage.createPackageContents();
		theChefclipsePackage.createPackageContents();
>>>>>>> origin/tomhodder
		theChefserverPackage.createPackageContents();
		theChefclientPackage.createPackageContents();
		theCookbookPackage.createPackageContents();
		theKnifePackage.createPackageContents();
<<<<<<< HEAD
		theUtilityPackage.createPackageContents();

		// Initialize created meta-data
		theWorkstationPackage.initializePackageContents();
=======

		// Initialize created meta-data
		theWorkstationPackage.initializePackageContents();
		theChefclipsePackage.initializePackageContents();
>>>>>>> origin/tomhodder
		theChefserverPackage.initializePackageContents();
		theChefclientPackage.initializePackageContents();
		theCookbookPackage.initializePackageContents();
		theKnifePackage.initializePackageContents();
<<<<<<< HEAD
		theUtilityPackage.initializePackageContents();
=======
>>>>>>> origin/tomhodder

		// Mark meta-data to indicate it can't be changed
		theWorkstationPackage.freeze();

<<<<<<< HEAD
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkstationPackage.eNS_URI,
				theWorkstationPackage);
=======
  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkstationPackage.eNS_URI, theWorkstationPackage);
>>>>>>> origin/tomhodder
		return theWorkstationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_OS() {
<<<<<<< HEAD
		return (EAttribute) repositoryEClass.getEStructuralFeatures().get(0);
=======
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(0);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Basepath() {
<<<<<<< HEAD
		return (EAttribute) repositoryEClass.getEStructuralFeatures().get(1);
=======
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(1);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Cookbooks() {
<<<<<<< HEAD
		return (EReference) repositoryEClass.getEStructuralFeatures().get(2);
=======
		return (EReference)repositoryEClass.getEStructuralFeatures().get(2);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public EReference getRepository_Knives() {
		return (EReference) repositoryEClass.getEStructuralFeatures().get(3);
=======
	public EReference getRepository_Knife() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(3);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_CookbookFolders() {
<<<<<<< HEAD
		return (EReference) repositoryEClass.getEStructuralFeatures().get(4);
=======
		return (EReference)repositoryEClass.getEStructuralFeatures().get(4);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigFolder() {
		return configFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificatesFolder() {
		return certificatesFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBagsFolder() {
		return dataBagsFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentsFolder() {
		return environmentsFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRolesFolder() {
		return rolesFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRakefile() {
		return rakefileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public EClass getWorkstationFolder() {
		return workstationFolderEClass;
=======
	public EClass getCookbooksFolder() {
		return cookbooksFolderEClass;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public EClass getCookbooksFolder() {
		return cookbooksFolderEClass;
=======
	public EReference getCookbooksFolder_Cookbooks() {
		return (EReference)cookbooksFolderEClass.getEStructuralFeatures().get(0);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public EReference getCookbooksFolder_Cookbooks() {
		return (EReference) cookbooksFolderEClass.getEStructuralFeatures().get(
				0);
=======
	public EClass getWorkstationFolder() {
		return workstationFolderEClass;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkstationFactory getWorkstationFactory() {
<<<<<<< HEAD
		return (WorkstationFactory) getEFactoryInstance();
=======
		return (WorkstationFactory)getEFactoryInstance();
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
<<<<<<< HEAD
		if (isCreated)
			return;
=======
		if (isCreated) return;
>>>>>>> origin/tomhodder
		isCreated = true;

		// Create classes and their features
		repositoryEClass = createEClass(REPOSITORY);
		createEAttribute(repositoryEClass, REPOSITORY__OS);
		createEAttribute(repositoryEClass, REPOSITORY__BASEPATH);
		createEReference(repositoryEClass, REPOSITORY__COOKBOOKS);
<<<<<<< HEAD
		createEReference(repositoryEClass, REPOSITORY__KNIVES);
=======
		createEReference(repositoryEClass, REPOSITORY__KNIFE);
>>>>>>> origin/tomhodder
		createEReference(repositoryEClass, REPOSITORY__COOKBOOK_FOLDERS);

		configFolderEClass = createEClass(CONFIG_FOLDER);

		certificatesFolderEClass = createEClass(CERTIFICATES_FOLDER);

		dataBagsFolderEClass = createEClass(DATA_BAGS_FOLDER);

		environmentsFolderEClass = createEClass(ENVIRONMENTS_FOLDER);

		rolesFolderEClass = createEClass(ROLES_FOLDER);

		rakefileEClass = createEClass(RAKEFILE);

<<<<<<< HEAD
		workstationFolderEClass = createEClass(WORKSTATION_FOLDER);

		cookbooksFolderEClass = createEClass(COOKBOOKS_FOLDER);
		createEReference(cookbooksFolderEClass, COOKBOOKS_FOLDER__COOKBOOKS);
=======
		cookbooksFolderEClass = createEClass(COOKBOOKS_FOLDER);
		createEReference(cookbooksFolderEClass, COOKBOOKS_FOLDER__COOKBOOKS);

		workstationFolderEClass = createEClass(WORKSTATION_FOLDER);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
<<<<<<< HEAD
		if (isInitialized)
			return;
=======
		if (isInitialized) return;
>>>>>>> origin/tomhodder
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
<<<<<<< HEAD
		UtilityPackage theUtilityPackage = (UtilityPackage) EPackage.Registry.INSTANCE
				.getEPackage(UtilityPackage.eNS_URI);
		CookbookPackage theCookbookPackage = (CookbookPackage) EPackage.Registry.INSTANCE
				.getEPackage(CookbookPackage.eNS_URI);
		KnifePackage theKnifePackage = (KnifePackage) EPackage.Registry.INSTANCE
				.getEPackage(KnifePackage.eNS_URI);
=======
		ChefclipsePackage theChefclipsePackage = (ChefclipsePackage)EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI);
		CookbookPackage theCookbookPackage = (CookbookPackage)EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI);
		KnifePackage theKnifePackage = (KnifePackage)EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI);
>>>>>>> origin/tomhodder

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
<<<<<<< HEAD
		repositoryEClass.getESuperTypes().add(
				theUtilityPackage.getNamedDescribedObject());
		configFolderEClass.getESuperTypes().add(this.getWorkstationFolder());
		certificatesFolderEClass.getESuperTypes().add(
				this.getWorkstationFolder());
		dataBagsFolderEClass.getESuperTypes().add(this.getWorkstationFolder());
		environmentsFolderEClass.getESuperTypes().add(
				this.getWorkstationFolder());
		rolesFolderEClass.getESuperTypes().add(this.getWorkstationFolder());
		workstationFolderEClass.getESuperTypes().add(
				theUtilityPackage.getNamedObject());
		cookbooksFolderEClass.getESuperTypes().add(this.getWorkstationFolder());

		// Initialize classes and features; add operations and parameters
		initEClass(repositoryEClass, Repository.class, "Repository",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepository_OS(), ecorePackage.getEString(), "OS",
				null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRepository_Basepath(), ecorePackage.getEString(),
				"basepath", null, 0, 1, Repository.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Cookbooks(),
				theCookbookPackage.getCookbookVersion(), null, "cookbooks",
				null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Knives(),
				theKnifePackage.getKnifeConfig(),
				theKnifePackage.getKnifeConfig_Repository(), "knives", null, 0,
				-1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_CookbookFolders(),
				this.getCookbooksFolder(), null, "cookbookFolders", null, 1,
				-1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configFolderEClass, ConfigFolder.class, "ConfigFolder",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(certificatesFolderEClass, CertificatesFolder.class,
				"CertificatesFolder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataBagsFolderEClass, DataBagsFolder.class,
				"DataBagsFolder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(environmentsFolderEClass, EnvironmentsFolder.class,
				"EnvironmentsFolder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(rolesFolderEClass, RolesFolder.class, "RolesFolder",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rakefileEClass, Rakefile.class, "Rakefile", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(workstationFolderEClass, WorkstationFolder.class,
				"WorkstationFolder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(cookbooksFolderEClass, CookbooksFolder.class,
				"CookbooksFolder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCookbooksFolder_Cookbooks(),
				theCookbookPackage.getCookbookVersion(), null, "cookbooks",
				null, 0, -1, CookbooksFolder.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
=======
		repositoryEClass.getESuperTypes().add(theChefclipsePackage.getNamedDescribedObject());
		configFolderEClass.getESuperTypes().add(this.getWorkstationFolder());
		certificatesFolderEClass.getESuperTypes().add(this.getWorkstationFolder());
		dataBagsFolderEClass.getESuperTypes().add(this.getWorkstationFolder());
		environmentsFolderEClass.getESuperTypes().add(this.getWorkstationFolder());
		rolesFolderEClass.getESuperTypes().add(this.getWorkstationFolder());
		cookbooksFolderEClass.getESuperTypes().add(this.getWorkstationFolder());
		workstationFolderEClass.getESuperTypes().add(theChefclipsePackage.getNamedObject());

		// Initialize classes and features; add operations and parameters
		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepository_OS(), ecorePackage.getEString(), "OS", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Basepath(), ecorePackage.getEString(), "basepath", null, 0, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Cookbooks(), theCookbookPackage.getCookbookVersion(), null, "cookbooks", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Knife(), theKnifePackage.getKnifeConfig(), null, "knife", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_CookbookFolders(), this.getCookbooksFolder(), null, "cookbookFolders", null, 1, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configFolderEClass, ConfigFolder.class, "ConfigFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(certificatesFolderEClass, CertificatesFolder.class, "CertificatesFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataBagsFolderEClass, DataBagsFolder.class, "DataBagsFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(environmentsFolderEClass, EnvironmentsFolder.class, "EnvironmentsFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rolesFolderEClass, RolesFolder.class, "RolesFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rakefileEClass, Rakefile.class, "Rakefile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cookbooksFolderEClass, CookbooksFolder.class, "CookbooksFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCookbooksFolder_Cookbooks(), theCookbookPackage.getCookbookVersion(), null, "cookbooks", null, 0, -1, CookbooksFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workstationFolderEClass, WorkstationFolder.class, "WorkstationFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
>>>>>>> origin/tomhodder
	}

} //WorkstationPackageImpl
