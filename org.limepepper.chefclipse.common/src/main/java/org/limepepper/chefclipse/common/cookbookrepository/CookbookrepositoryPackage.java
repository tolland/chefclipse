/**
 */
package org.limepepper.chefclipse.common.cookbookrepository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;

import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;

import org.limepepper.chefclipse.common.cookbook.CookbookPackage;

import org.limepepper.chefclipse.common.knife.KnifePackage;

import org.limepepper.chefclipse.common.workstation.WorkstationPackage;

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
 * @see org.limepepper.chefclipse.common.cookbookrepository.CookbookrepositoryFactory
 * @model kind="package"
 * @generated
 */
public class CookbookrepositoryPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "cookbookrepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://limepepper.org/chefclipse/cookbookrepository";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "org.limepepepper.chefclipse";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CookbookrepositoryPackage eINSTANCE = org.limepepper.chefclipse.common.cookbookrepository.CookbookrepositoryPackage.init();

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository <em>Remote Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository
	 * @see org.limepepper.chefclipse.common.cookbookrepository.CookbookrepositoryPackage#getRemoteRepository()
	 * @generated
	 */
	public static final int REMOTE_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Cookbooks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_REPOSITORY__COOKBOOKS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_REPOSITORY__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_REPOSITORY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_REPOSITORY__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_REPOSITORY__ICON = 4;

	/**
	 * The feature id for the '<em><b>Retriever</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_REPOSITORY__RETRIEVER = 5;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_REPOSITORY__URI = 6;

	/**
	 * The number of structural features of the '<em>Remote Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_REPOSITORY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook <em>Remote Cookbook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook
	 * @see org.limepepper.chefclipse.common.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook()
	 * @generated
	 */
	public static final int REMOTE_COOKBOOK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK__URL = 2;

	/**
	 * The feature id for the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK__MAINTAINER = 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK__CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK__UPDATED_AT = 5;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK__CREATED_AT = 6;

	/**
	 * The feature id for the '<em><b>Latest Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK__LATEST_VERSION = 7;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK__VERSIONS = 8;

	/**
	 * The feature id for the '<em><b>External Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK__EXTERNAL_URL = 9;

	/**
	 * The feature id for the '<em><b>Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK__RATING = 10;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK__DEPRECATED = 11;

	/**
	 * The feature id for the '<em><b>Replacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK__REPLACEMENT = 12;

	/**
	 * The number of structural features of the '<em>Remote Cookbook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_COOKBOOK_FEATURE_COUNT = 13;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteCookbookEClass = null;

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
	 * @see org.limepepper.chefclipse.common.cookbookrepository.CookbookrepositoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CookbookrepositoryPackage() {
		super(eNS_URI, CookbookrepositoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CookbookrepositoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CookbookrepositoryPackage init() {
		if (isInited) return (CookbookrepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(CookbookrepositoryPackage.eNS_URI);

		// Obtain or create and register package
		CookbookrepositoryPackage theCookbookrepositoryPackage = (CookbookrepositoryPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CookbookrepositoryPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CookbookrepositoryPackage());

		isInited = true;

		// Obtain or create and register interdependencies
		ChefclientPackage theChefclientPackage = (ChefclientPackage)(EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) instanceof ChefclientPackage ? EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) : ChefclientPackage.eINSTANCE);
		ChefserverPackage theChefserverPackage = (ChefserverPackage)(EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) instanceof ChefserverPackage ? EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) : ChefserverPackage.eINSTANCE);
		CookbookPackage theCookbookPackage = (CookbookPackage)(EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) instanceof CookbookPackage ? EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI) : CookbookPackage.eINSTANCE);
		KnifePackage theKnifePackage = (KnifePackage)(EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackage ? EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);
		WorkstationPackage theWorkstationPackage = (WorkstationPackage)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackage ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);

		// Create package meta-data objects
		theCookbookrepositoryPackage.createPackageContents();
		theChefclientPackage.createPackageContents();
		theChefserverPackage.createPackageContents();
		theCookbookPackage.createPackageContents();
		theKnifePackage.createPackageContents();
		theWorkstationPackage.createPackageContents();

		// Initialize created meta-data
		theCookbookrepositoryPackage.initializePackageContents();
		theChefclientPackage.initializePackageContents();
		theChefserverPackage.initializePackageContents();
		theCookbookPackage.initializePackageContents();
		theKnifePackage.initializePackageContents();
		theWorkstationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCookbookrepositoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CookbookrepositoryPackage.eNS_URI, theCookbookrepositoryPackage);
		return theCookbookrepositoryPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository <em>Remote Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Repository</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository
	 * @generated
	 */
	public EClass getRemoteRepository() {
		return remoteRepositoryEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getCookbooks <em>Cookbooks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cookbooks</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getCookbooks()
	 * @see #getRemoteRepository()
	 * @generated
	 */
	public EReference getRemoteRepository_Cookbooks() {
		return (EReference)remoteRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getId()
	 * @see #getRemoteRepository()
	 * @generated
	 */
	public EAttribute getRemoteRepository_Id() {
		return (EAttribute)remoteRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getName()
	 * @see #getRemoteRepository()
	 * @generated
	 */
	public EAttribute getRemoteRepository_Name() {
		return (EAttribute)remoteRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getDescription()
	 * @see #getRemoteRepository()
	 * @generated
	 */
	public EAttribute getRemoteRepository_Description() {
		return (EAttribute)remoteRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getIcon()
	 * @see #getRemoteRepository()
	 * @generated
	 */
	public EAttribute getRemoteRepository_Icon() {
		return (EAttribute)remoteRepositoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getRetriever <em>Retriever</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retriever</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getRetriever()
	 * @see #getRemoteRepository()
	 * @generated
	 */
	public EAttribute getRemoteRepository_Retriever() {
		return (EAttribute)remoteRepositoryEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository#getUri()
	 * @see #getRemoteRepository()
	 * @generated
	 */
	public EAttribute getRemoteRepository_Uri() {
		return (EAttribute)remoteRepositoryEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook <em>Remote Cookbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Cookbook</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook
	 * @generated
	 */
	public EClass getRemoteCookbook() {
		return remoteCookbookEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getName()
	 * @see #getRemoteCookbook()
	 * @generated
	 */
	public EAttribute getRemoteCookbook_Name() {
		return (EAttribute)remoteCookbookEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getDescription()
	 * @see #getRemoteCookbook()
	 * @generated
	 */
	public EAttribute getRemoteCookbook_Description() {
		return (EAttribute)remoteCookbookEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getUrl()
	 * @see #getRemoteCookbook()
	 * @generated
	 */
	public EAttribute getRemoteCookbook_Url() {
		return (EAttribute)remoteCookbookEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getMaintainer <em>Maintainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintainer</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getMaintainer()
	 * @see #getRemoteCookbook()
	 * @generated
	 */
	public EAttribute getRemoteCookbook_Maintainer() {
		return (EAttribute)remoteCookbookEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getCategory()
	 * @see #getRemoteCookbook()
	 * @generated
	 */
	public EAttribute getRemoteCookbook_Category() {
		return (EAttribute)remoteCookbookEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getUpdatedAt()
	 * @see #getRemoteCookbook()
	 * @generated
	 */
	public EAttribute getRemoteCookbook_UpdatedAt() {
		return (EAttribute)remoteCookbookEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getCreatedAt()
	 * @see #getRemoteCookbook()
	 * @generated
	 */
	public EAttribute getRemoteCookbook_CreatedAt() {
		return (EAttribute)remoteCookbookEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getLatestVersion <em>Latest Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Version</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getLatestVersion()
	 * @see #getRemoteCookbook()
	 * @generated
	 */
	public EAttribute getRemoteCookbook_LatestVersion() {
		return (EAttribute)remoteCookbookEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Versions</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getVersions()
	 * @see #getRemoteCookbook()
	 * @generated
	 */
	public EAttribute getRemoteCookbook_Versions() {
		return (EAttribute)remoteCookbookEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getExternalUrl <em>External Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Url</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getExternalUrl()
	 * @see #getRemoteCookbook()
	 * @generated
	 */
	public EAttribute getRemoteCookbook_ExternalUrl() {
		return (EAttribute)remoteCookbookEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getRating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rating</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getRating()
	 * @see #getRemoteCookbook()
	 * @generated
	 */
	public EAttribute getRemoteCookbook_Rating() {
		return (EAttribute)remoteCookbookEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#isDeprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deprecated</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#isDeprecated()
	 * @see #getRemoteCookbook()
	 * @generated
	 */
	public EAttribute getRemoteCookbook_Deprecated() {
		return (EAttribute)remoteCookbookEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getReplacement <em>Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacement</em>'.
	 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook#getReplacement()
	 * @see #getRemoteCookbook()
	 * @generated
	 */
	public EAttribute getRemoteCookbook_Replacement() {
		return (EAttribute)remoteCookbookEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public CookbookrepositoryFactory getCookbookrepositoryFactory() {
		return (CookbookrepositoryFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		remoteRepositoryEClass = createEClass(REMOTE_REPOSITORY);
		createEReference(remoteRepositoryEClass, REMOTE_REPOSITORY__COOKBOOKS);
		createEAttribute(remoteRepositoryEClass, REMOTE_REPOSITORY__ID);
		createEAttribute(remoteRepositoryEClass, REMOTE_REPOSITORY__NAME);
		createEAttribute(remoteRepositoryEClass, REMOTE_REPOSITORY__DESCRIPTION);
		createEAttribute(remoteRepositoryEClass, REMOTE_REPOSITORY__ICON);
		createEAttribute(remoteRepositoryEClass, REMOTE_REPOSITORY__RETRIEVER);
		createEAttribute(remoteRepositoryEClass, REMOTE_REPOSITORY__URI);

		remoteCookbookEClass = createEClass(REMOTE_COOKBOOK);
		createEAttribute(remoteCookbookEClass, REMOTE_COOKBOOK__NAME);
		createEAttribute(remoteCookbookEClass, REMOTE_COOKBOOK__DESCRIPTION);
		createEAttribute(remoteCookbookEClass, REMOTE_COOKBOOK__URL);
		createEAttribute(remoteCookbookEClass, REMOTE_COOKBOOK__MAINTAINER);
		createEAttribute(remoteCookbookEClass, REMOTE_COOKBOOK__CATEGORY);
		createEAttribute(remoteCookbookEClass, REMOTE_COOKBOOK__UPDATED_AT);
		createEAttribute(remoteCookbookEClass, REMOTE_COOKBOOK__CREATED_AT);
		createEAttribute(remoteCookbookEClass, REMOTE_COOKBOOK__LATEST_VERSION);
		createEAttribute(remoteCookbookEClass, REMOTE_COOKBOOK__VERSIONS);
		createEAttribute(remoteCookbookEClass, REMOTE_COOKBOOK__EXTERNAL_URL);
		createEAttribute(remoteCookbookEClass, REMOTE_COOKBOOK__RATING);
		createEAttribute(remoteCookbookEClass, REMOTE_COOKBOOK__DEPRECATED);
		createEAttribute(remoteCookbookEClass, REMOTE_COOKBOOK__REPLACEMENT);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(remoteRepositoryEClass, RemoteRepository.class, "RemoteRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoteRepository_Cookbooks(), this.getRemoteCookbook(), null, "cookbooks", null, 0, -1, RemoteRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRemoteRepository_Id(), ecorePackage.getEString(), "id", null, 0, 1, RemoteRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteRepository_Name(), ecorePackage.getEString(), "name", null, 0, 1, RemoteRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteRepository_Description(), ecorePackage.getEString(), "description", null, 0, 1, RemoteRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteRepository_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, RemoteRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteRepository_Retriever(), ecorePackage.getEJavaObject(), "retriever", null, 0, 1, RemoteRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteRepository_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, RemoteRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteCookbookEClass, RemoteCookbook.class, "RemoteCookbook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteCookbook_Name(), ecorePackage.getEString(), "name", null, 0, 1, RemoteCookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteCookbook_Description(), ecorePackage.getEString(), "description", null, 0, 1, RemoteCookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteCookbook_Url(), ecorePackage.getEString(), "url", null, 0, 1, RemoteCookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteCookbook_Maintainer(), ecorePackage.getEString(), "maintainer", null, 0, 1, RemoteCookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteCookbook_Category(), ecorePackage.getEString(), "category", null, 0, 1, RemoteCookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteCookbook_UpdatedAt(), ecorePackage.getEDate(), "updatedAt", null, 0, 1, RemoteCookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteCookbook_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, RemoteCookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteCookbook_LatestVersion(), ecorePackage.getEString(), "latestVersion", null, 0, 1, RemoteCookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteCookbook_Versions(), ecorePackage.getEString(), "versions", null, 0, -1, RemoteCookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteCookbook_ExternalUrl(), ecorePackage.getEString(), "externalUrl", null, 0, 1, RemoteCookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteCookbook_Rating(), ecorePackage.getEDouble(), "rating", null, 0, 1, RemoteCookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteCookbook_Deprecated(), ecorePackage.getEBoolean(), "deprecated", null, 0, 1, RemoteCookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoteCookbook_Replacement(), ecorePackage.getEString(), "replacement", null, 0, 1, RemoteCookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

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
	public interface Literals {
		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository <em>Remote Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteRepository
		 * @see org.limepepper.chefclipse.common.cookbookrepository.CookbookrepositoryPackage#getRemoteRepository()
		 * @generated
		 */
		public static final EClass REMOTE_REPOSITORY = eINSTANCE.getRemoteRepository();

		/**
		 * The meta object literal for the '<em><b>Cookbooks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference REMOTE_REPOSITORY__COOKBOOKS = eINSTANCE.getRemoteRepository_Cookbooks();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_REPOSITORY__ID = eINSTANCE.getRemoteRepository_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_REPOSITORY__NAME = eINSTANCE.getRemoteRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_REPOSITORY__DESCRIPTION = eINSTANCE.getRemoteRepository_Description();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_REPOSITORY__ICON = eINSTANCE.getRemoteRepository_Icon();

		/**
		 * The meta object literal for the '<em><b>Retriever</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_REPOSITORY__RETRIEVER = eINSTANCE.getRemoteRepository_Retriever();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_REPOSITORY__URI = eINSTANCE.getRemoteRepository_Uri();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook <em>Remote Cookbook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.common.cookbookrepository.RemoteCookbook
		 * @see org.limepepper.chefclipse.common.cookbookrepository.CookbookrepositoryPackage#getRemoteCookbook()
		 * @generated
		 */
		public static final EClass REMOTE_COOKBOOK = eINSTANCE.getRemoteCookbook();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_COOKBOOK__NAME = eINSTANCE.getRemoteCookbook_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_COOKBOOK__DESCRIPTION = eINSTANCE.getRemoteCookbook_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_COOKBOOK__URL = eINSTANCE.getRemoteCookbook_Url();

		/**
		 * The meta object literal for the '<em><b>Maintainer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_COOKBOOK__MAINTAINER = eINSTANCE.getRemoteCookbook_Maintainer();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_COOKBOOK__CATEGORY = eINSTANCE.getRemoteCookbook_Category();

		/**
		 * The meta object literal for the '<em><b>Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_COOKBOOK__UPDATED_AT = eINSTANCE.getRemoteCookbook_UpdatedAt();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_COOKBOOK__CREATED_AT = eINSTANCE.getRemoteCookbook_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Latest Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_COOKBOOK__LATEST_VERSION = eINSTANCE.getRemoteCookbook_LatestVersion();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_COOKBOOK__VERSIONS = eINSTANCE.getRemoteCookbook_Versions();

		/**
		 * The meta object literal for the '<em><b>External Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_COOKBOOK__EXTERNAL_URL = eINSTANCE.getRemoteCookbook_ExternalUrl();

		/**
		 * The meta object literal for the '<em><b>Rating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_COOKBOOK__RATING = eINSTANCE.getRemoteCookbook_Rating();

		/**
		 * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_COOKBOOK__DEPRECATED = eINSTANCE.getRemoteCookbook_Deprecated();

		/**
		 * The meta object literal for the '<em><b>Replacement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute REMOTE_COOKBOOK__REPLACEMENT = eINSTANCE.getRemoteCookbook_Replacement();

	}

} //CookbookrepositoryPackage
