/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import static org.limepepper.chefclipse.common.cookbook.CookbookPackage.RESOURCE;

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
import org.limepepper.chefclipse.common.cookbook.Attribute;
import org.limepepper.chefclipse.common.cookbook.Attributes;
import org.limepepper.chefclipse.common.cookbook.Cookbook;
import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Definition;
import org.limepepper.chefclipse.common.cookbook.DependencyRelation;
import org.limepepper.chefclipse.common.cookbook.File;
import org.limepepper.chefclipse.common.cookbook.Library;
import org.limepepper.chefclipse.common.cookbook.Metadata;
import org.limepepper.chefclipse.common.cookbook.MinimalMetadata;
import org.limepepper.chefclipse.common.cookbook.Provider;
import org.limepepper.chefclipse.common.cookbook.Recipe;
import org.limepepper.chefclipse.common.cookbook.RecipeDescription;
import org.limepepper.chefclipse.common.cookbook.Resource;
import org.limepepper.chefclipse.common.cookbook.Root_file;
import org.limepepper.chefclipse.common.cookbook.Template;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl;
import org.limepepper.chefclipse.common.workstation.WorkstationPackage;
import org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl;
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
public class CookbookPackageImpl extends EPackageImpl implements
		CookbookPackage {
=======
public class CookbookPackageImpl extends EPackageImpl implements CookbookPackage {
>>>>>>> origin/tomhodder
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cookbookVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recipeDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass root_fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minimalMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
=======
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
>>>>>>> origin/tomhodder
	private EClass cookbookFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cookbookEClass = null;

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
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CookbookPackageImpl() {
		super(eNS_URI, CookbookFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CookbookPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CookbookPackage init() {
<<<<<<< HEAD
		if (isInited)
			return (CookbookPackage) EPackage.Registry.INSTANCE
					.getEPackage(CookbookPackage.eNS_URI);

		// Obtain or create and register package
		CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new CookbookPackageImpl());
=======
		if (isInited) return (CookbookPackage)EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI);

		// Obtain or create and register package
		CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CookbookPackageImpl());
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
		WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(WorkstationPackage.eNS_URI)
				: WorkstationPackage.eINSTANCE);
		KnifePackageImpl theKnifePackage = (KnifePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);
		UtilityPackageImpl theUtilityPackage = (UtilityPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilityPackage.eNS_URI) instanceof UtilityPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilityPackage.eNS_URI) : UtilityPackage.eINSTANCE);

		// Create package meta-data objects
		theCookbookPackage.createPackageContents();
=======
		ChefclipsePackageImpl theChefclipsePackage = (ChefclipsePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) instanceof ChefclipsePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) : ChefclipsePackage.eINSTANCE);
		ChefserverPackageImpl theChefserverPackage = (ChefserverPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) instanceof ChefserverPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) : ChefserverPackage.eINSTANCE);
		ChefclientPackageImpl theChefclientPackage = (ChefclientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) instanceof ChefclientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) : ChefclientPackage.eINSTANCE);
		WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);
		KnifePackageImpl theKnifePackage = (KnifePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);

		// Create package meta-data objects
		theCookbookPackage.createPackageContents();
		theChefclipsePackage.createPackageContents();
>>>>>>> origin/tomhodder
		theChefserverPackage.createPackageContents();
		theChefclientPackage.createPackageContents();
		theWorkstationPackage.createPackageContents();
		theKnifePackage.createPackageContents();
<<<<<<< HEAD
		theUtilityPackage.createPackageContents();

		// Initialize created meta-data
		theCookbookPackage.initializePackageContents();
=======

		// Initialize created meta-data
		theCookbookPackage.initializePackageContents();
		theChefclipsePackage.initializePackageContents();
>>>>>>> origin/tomhodder
		theChefserverPackage.initializePackageContents();
		theChefclientPackage.initializePackageContents();
		theWorkstationPackage.initializePackageContents();
		theKnifePackage.initializePackageContents();
<<<<<<< HEAD
		theUtilityPackage.initializePackageContents();
=======
>>>>>>> origin/tomhodder

		// Mark meta-data to indicate it can't be changed
		theCookbookPackage.freeze();

<<<<<<< HEAD
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CookbookPackage.eNS_URI,
				theCookbookPackage);
=======
  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CookbookPackage.eNS_URI, theCookbookPackage);
>>>>>>> origin/tomhodder
		return theCookbookPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCookbookVersion() {
		return cookbookVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbookVersion_Environment() {
<<<<<<< HEAD
		return (EReference) cookbookVersionEClass.getEStructuralFeatures().get(
				0);
=======
		return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(0);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbookVersion_Templates() {
<<<<<<< HEAD
		return (EReference) cookbookVersionEClass.getEStructuralFeatures().get(
				1);
=======
		return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(1);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbookVersion_Recipes() {
<<<<<<< HEAD
		return (EReference) cookbookVersionEClass.getEStructuralFeatures().get(
				2);
=======
		return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(2);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbookVersion_Definitions() {
<<<<<<< HEAD
		return (EReference) cookbookVersionEClass.getEStructuralFeatures().get(
				3);
=======
		return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(3);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbookVersion_Files() {
<<<<<<< HEAD
		return (EReference) cookbookVersionEClass.getEStructuralFeatures().get(
				4);
=======
		return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(4);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbookVersion_Resources() {
<<<<<<< HEAD
		return (EReference) cookbookVersionEClass.getEStructuralFeatures().get(
				5);
=======
		return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(5);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbookVersion_Libraries() {
<<<<<<< HEAD
		return (EReference) cookbookVersionEClass.getEStructuralFeatures().get(
				6);
=======
		return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(6);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbookVersion_Metadata() {
<<<<<<< HEAD
		return (EReference) cookbookVersionEClass.getEStructuralFeatures().get(
				7);
=======
		return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(7);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbookVersion_Providers() {
<<<<<<< HEAD
		return (EReference) cookbookVersionEClass.getEStructuralFeatures().get(
				8);
=======
		return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(8);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbookVersion_Root_files() {
<<<<<<< HEAD
		return (EReference) cookbookVersionEClass.getEStructuralFeatures().get(
				9);
=======
		return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(9);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbookVersion_Attributes() {
<<<<<<< HEAD
		return (EReference) cookbookVersionEClass.getEStructuralFeatures().get(
				10);
=======
		return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(10);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCookbookVersion_Catalog() {
<<<<<<< HEAD
		return (EAttribute) cookbookVersionEClass.getEStructuralFeatures().get(
				11);
=======
		return (EAttribute)cookbookVersionEClass.getEStructuralFeatures().get(11);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbookVersion_Depends() {
<<<<<<< HEAD
		return (EReference) cookbookVersionEClass.getEStructuralFeatures().get(
				12);
=======
		return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(12);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCookbookVersion_Missing() {
<<<<<<< HEAD
		return (EReference) cookbookVersionEClass.getEStructuralFeatures().get(
				13);
=======
		return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(13);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public EAttribute getAttribute_Name() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute) attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
=======
>>>>>>> origin/tomhodder
	public EClass getRecipe() {
		return recipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipe_Role() {
<<<<<<< HEAD
		return (EReference) recipeEClass.getEStructuralFeatures().get(0);
=======
		return (EReference)recipeEClass.getEStructuralFeatures().get(0);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecipe_Runlist() {
<<<<<<< HEAD
		return (EReference) recipeEClass.getEStructuralFeatures().get(1);
=======
		return (EReference)recipeEClass.getEStructuralFeatures().get(1);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecipeDescription() {
		return recipeDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplate() {
		return templateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributes() {
		return attributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencyRelation() {
		return dependencyRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public EAttribute getMetadata_Long_description() {
		return (EAttribute) metadataEClass.getEStructuralFeatures().get(0);
=======
	public EReference getMetadata_CookbookVersion() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadata_Long_description() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(1);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadata_Version() {
<<<<<<< HEAD
		return (EAttribute) metadataEClass.getEStructuralFeatures().get(1);
=======
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(2);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Replaces() {
<<<<<<< HEAD
		return (EReference) metadataEClass.getEStructuralFeatures().get(2);
=======
		return (EReference)metadataEClass.getEStructuralFeatures().get(3);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Provides() {
<<<<<<< HEAD
		return (EReference) metadataEClass.getEStructuralFeatures().get(3);
=======
		return (EReference)metadataEClass.getEStructuralFeatures().get(4);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Conflicts() {
<<<<<<< HEAD
		return (EReference) metadataEClass.getEStructuralFeatures().get(4);
=======
		return (EReference)metadataEClass.getEStructuralFeatures().get(5);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Suggests() {
<<<<<<< HEAD
		return (EReference) metadataEClass.getEStructuralFeatures().get(5);
=======
		return (EReference)metadataEClass.getEStructuralFeatures().get(6);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Dependencies() {
<<<<<<< HEAD
		return (EReference) metadataEClass.getEStructuralFeatures().get(6);
=======
		return (EReference)metadataEClass.getEStructuralFeatures().get(7);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Platforms() {
<<<<<<< HEAD
		return (EReference) metadataEClass.getEStructuralFeatures().get(7);
=======
		return (EReference)metadataEClass.getEStructuralFeatures().get(8);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Recipes() {
<<<<<<< HEAD
		return (EReference) metadataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadata_Replacing() {
		return (EAttribute) metadataEClass.getEStructuralFeatures().get(9);
=======
		return (EReference)metadataEClass.getEStructuralFeatures().get(9);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvider() {
		return providerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot_file() {
		return root_fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinimalMetadata() {
		return minimalMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public EClass getCookbookFile() {
		return cookbookFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCookbookFile_Bytes() {
		return (EAttribute) cookbookFileEClass.getEStructuralFeatures().get(0);
=======
	public EClass getName_() {
		return nameEClass;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public EAttribute getCookbookFile_Path() {
		return (EAttribute) cookbookFileEClass.getEStructuralFeatures().get(1);
=======
	public EClass getCookbookFile() {
		return cookbookFileEClass;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public EAttribute getCookbookFile_Specificity() {
		return (EAttribute) cookbookFileEClass.getEStructuralFeatures().get(2);
=======
	public EReference getCookbookFile_Cookbook() {
		return (EReference)cookbookFileEClass.getEStructuralFeatures().get(0);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public EReference getCookbookFile_Cookbook() {
		return (EReference) cookbookFileEClass.getEStructuralFeatures().get(3);
=======
	public EAttribute getCookbookFile_Bytes() {
		return (EAttribute)cookbookFileEClass.getEStructuralFeatures().get(1);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCookbook() {
		return cookbookEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCookbook_Json_class() {
<<<<<<< HEAD
		return (EAttribute) cookbookEClass.getEStructuralFeatures().get(0);
=======
		return (EAttribute)cookbookEClass.getEStructuralFeatures().get(0);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCookbook_Chef_type() {
<<<<<<< HEAD
		return (EAttribute) cookbookEClass.getEStructuralFeatures().get(1);
=======
		return (EAttribute)cookbookEClass.getEStructuralFeatures().get(1);
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbookFactory getCookbookFactory() {
<<<<<<< HEAD
		return (CookbookFactory) getEFactoryInstance();
=======
		return (CookbookFactory)getEFactoryInstance();
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
		cookbookVersionEClass = createEClass(COOKBOOK_VERSION);
		createEReference(cookbookVersionEClass, COOKBOOK_VERSION__ENVIRONMENT);
		createEReference(cookbookVersionEClass, COOKBOOK_VERSION__TEMPLATES);
		createEReference(cookbookVersionEClass, COOKBOOK_VERSION__RECIPES);
		createEReference(cookbookVersionEClass, COOKBOOK_VERSION__DEFINITIONS);
		createEReference(cookbookVersionEClass, COOKBOOK_VERSION__FILES);
		createEReference(cookbookVersionEClass, COOKBOOK_VERSION__RESOURCES);
		createEReference(cookbookVersionEClass, COOKBOOK_VERSION__LIBRARIES);
		createEReference(cookbookVersionEClass, COOKBOOK_VERSION__METADATA);
		createEReference(cookbookVersionEClass, COOKBOOK_VERSION__PROVIDERS);
		createEReference(cookbookVersionEClass, COOKBOOK_VERSION__ROOT_FILES);
		createEReference(cookbookVersionEClass, COOKBOOK_VERSION__ATTRIBUTES);
		createEAttribute(cookbookVersionEClass, COOKBOOK_VERSION__CATALOG);
		createEReference(cookbookVersionEClass, COOKBOOK_VERSION__DEPENDS);
		createEReference(cookbookVersionEClass, COOKBOOK_VERSION__MISSING);

		definitionEClass = createEClass(DEFINITION);

		libraryEClass = createEClass(LIBRARY);

		attributeEClass = createEClass(ATTRIBUTE);
<<<<<<< HEAD
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);
=======
>>>>>>> origin/tomhodder

		recipeEClass = createEClass(RECIPE);
		createEReference(recipeEClass, RECIPE__ROLE);
		createEReference(recipeEClass, RECIPE__RUNLIST);

		recipeDescriptionEClass = createEClass(RECIPE_DESCRIPTION);

		resourceEClass = createEClass(RESOURCE);

		templateEClass = createEClass(TEMPLATE);

		attributesEClass = createEClass(ATTRIBUTES);

		fileEClass = createEClass(FILE);

		dependencyRelationEClass = createEClass(DEPENDENCY_RELATION);

		metadataEClass = createEClass(METADATA);
<<<<<<< HEAD
=======
		createEReference(metadataEClass, METADATA__COOKBOOK_VERSION);
>>>>>>> origin/tomhodder
		createEAttribute(metadataEClass, METADATA__LONG_DESCRIPTION);
		createEAttribute(metadataEClass, METADATA__VERSION);
		createEReference(metadataEClass, METADATA__REPLACES);
		createEReference(metadataEClass, METADATA__PROVIDES);
		createEReference(metadataEClass, METADATA__CONFLICTS);
		createEReference(metadataEClass, METADATA__SUGGESTS);
		createEReference(metadataEClass, METADATA__DEPENDENCIES);
		createEReference(metadataEClass, METADATA__PLATFORMS);
		createEReference(metadataEClass, METADATA__RECIPES);
<<<<<<< HEAD
		createEAttribute(metadataEClass, METADATA__REPLACING);
=======
>>>>>>> origin/tomhodder

		providerEClass = createEClass(PROVIDER);

		root_fileEClass = createEClass(ROOT_FILE);

		minimalMetadataEClass = createEClass(MINIMAL_METADATA);

<<<<<<< HEAD
		cookbookFileEClass = createEClass(COOKBOOK_FILE);
		createEAttribute(cookbookFileEClass, COOKBOOK_FILE__BYTES);
		createEAttribute(cookbookFileEClass, COOKBOOK_FILE__PATH);
		createEAttribute(cookbookFileEClass, COOKBOOK_FILE__SPECIFICITY);
		createEReference(cookbookFileEClass, COOKBOOK_FILE__COOKBOOK);
=======
		nameEClass = createEClass(NAME);

		cookbookFileEClass = createEClass(COOKBOOK_FILE);
		createEReference(cookbookFileEClass, COOKBOOK_FILE__COOKBOOK);
		createEAttribute(cookbookFileEClass, COOKBOOK_FILE__BYTES);
>>>>>>> origin/tomhodder

		cookbookEClass = createEClass(COOKBOOK);
		createEAttribute(cookbookEClass, COOKBOOK__JSON_CLASS);
		createEAttribute(cookbookEClass, COOKBOOK__CHEF_TYPE);
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
		ChefserverPackage theChefserverPackage = (ChefserverPackage) EPackage.Registry.INSTANCE
				.getEPackage(ChefserverPackage.eNS_URI);
=======
		ChefclipsePackage theChefclipsePackage = (ChefclipsePackage)EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI);
		ChefserverPackage theChefserverPackage = (ChefserverPackage)EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI);
>>>>>>> origin/tomhodder

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
<<<<<<< HEAD
		cookbookVersionEClass.getESuperTypes().add(
				theUtilityPackage.getNamedDescribedObject());
		cookbookVersionEClass.getESuperTypes().add(this.getCookbook());
		definitionEClass.getESuperTypes().add(this.getCookbookFile());
		libraryEClass.getESuperTypes().add(this.getCookbookFile());
		recipeEClass.getESuperTypes().add(this.getCookbookFile());
		recipeEClass.getESuperTypes().add(theUtilityPackage.getRubyFile());
		recipeEClass.getESuperTypes()
				.add(theChefserverPackage.getRunListItem());
		recipeDescriptionEClass.getESuperTypes().add(
				theUtilityPackage.getNamedDescribedObject());
		resourceEClass.getESuperTypes().add(this.getCookbookFile());
		resourceEClass.getESuperTypes().add(theUtilityPackage.getRubyFile());
		templateEClass.getESuperTypes().add(this.getCookbookFile());
		attributesEClass.getESuperTypes().add(this.getCookbookFile());
		attributesEClass.getESuperTypes().add(theUtilityPackage.getRubyFile());
		fileEClass.getESuperTypes().add(this.getCookbookFile());
		metadataEClass.getESuperTypes().add(this.getCookbookFile());
		metadataEClass.getESuperTypes().add(theUtilityPackage.getRubyFile());
		metadataEClass.getESuperTypes().add(
				theUtilityPackage.getMaintainedObject());
		metadataEClass.getESuperTypes().add(
				theUtilityPackage.getNamedDescribedObject());
		providerEClass.getESuperTypes().add(this.getCookbookFile());
		root_fileEClass.getESuperTypes().add(this.getCookbookFile());
		minimalMetadataEClass.getESuperTypes().add(this.getMetadata());
		cookbookFileEClass.getESuperTypes().add(
				theUtilityPackage.getNamedObject());
		cookbookFileEClass.getESuperTypes().add(
				theUtilityPackage.getChecksumFile());
		cookbookFileEClass.getESuperTypes().add(
				theUtilityPackage.getSandboxedObject());

		// Initialize classes and features; add operations and parameters
		initEClass(cookbookVersionEClass, CookbookVersion.class,
				"CookbookVersion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCookbookVersion_Environment(),
				theChefserverPackage.getEnvironment(), null, "environment",
				null, 0, 1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Templates(), this.getTemplate(),
				null, "templates", null, 0, -1, CookbookVersion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCookbookVersion_Recipes(), this.getRecipe(), null,
				"recipes", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Definitions(), this.getDefinition(),
				null, "definitions", null, 0, -1, CookbookVersion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCookbookVersion_Files(), this.getFile(), null,
				"files", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Resources(), this.getResource(),
				null, "resources", null, 0, -1, CookbookVersion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCookbookVersion_Libraries(), this.getLibrary(), null,
				"libraries", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Metadata(), this.getMetadata(), null,
				"metadata", null, 1, 1, CookbookVersion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Providers(), this.getProvider(),
				null, "providers", null, 0, -1, CookbookVersion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCookbookVersion_Root_files(), this.getRoot_file(),
				null, "root_files", null, 0, -1, CookbookVersion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCookbookVersion_Attributes(), this.getAttributes(),
				null, "attributes", null, 0, -1, CookbookVersion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getCookbookVersion_Catalog(), ecorePackage.getEString(),
				"catalog", null, 0, 1, CookbookVersion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Depends(), this.getCookbookVersion(),
				null, "depends", null, 0, -1, CookbookVersion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCookbookVersion_Missing(),
				ecorePackage.getEStringToStringMapEntry(), null, "missing",
				null, 0, -1, CookbookVersion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name",
				null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(),
				"value", null, 1, 1, Attribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(recipeEClass, Recipe.class, "Recipe", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecipe_Role(), theChefserverPackage.getRole(), null,
				"role", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipe_Runlist(), theChefserverPackage.getRunList(),
				null, "runlist", null, 0, -1, Recipe.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recipeDescriptionEClass, RecipeDescription.class,
				"RecipeDescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributesEClass, Attributes.class, "Attributes",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyRelationEClass, DependencyRelation.class,
				"DependencyRelation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadata_Long_description(),
				theUtilityPackage.getText(), "long_description", null, 0, 1,
				Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_Version(), theUtilityPackage.getVersion(),
				"version", "0.0.0", 1, 1, Metadata.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Replaces(),
				ecorePackage.getEStringToStringMapEntry(), null, "replaces",
				null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Provides(),
				ecorePackage.getEStringToStringMapEntry(), null, "provides",
				null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Conflicts(),
				ecorePackage.getEStringToStringMapEntry(), null, "conflicts",
				null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Suggests(),
				ecorePackage.getEStringToStringMapEntry(), null, "suggests",
				null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Dependencies(),
				ecorePackage.getEStringToStringMapEntry(), null,
				"dependencies", null, 0, -1, Metadata.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Platforms(),
				ecorePackage.getEStringToStringMapEntry(), null, "platforms",
				null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Recipes(),
				ecorePackage.getEStringToStringMapEntry(), null, "recipes",
				null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_Replacing(), ecorePackage.getEString(),
				"replacing", null, 1, 1, Metadata.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(root_fileEClass, Root_file.class, "Root_file", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minimalMetadataEClass, MinimalMetadata.class,
				"MinimalMetadata", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(cookbookFileEClass, CookbookFile.class, "CookbookFile",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCookbookFile_Bytes(), ecorePackage.getEByteArray(),
				"bytes", null, 0, 1, CookbookFile.class, IS_TRANSIENT,
				IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCookbookFile_Path(), ecorePackage.getEString(),
				"path", null, 1, 1, CookbookFile.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCookbookFile_Specificity(),
				ecorePackage.getEString(), "specificity", "default", 1, 1,
				CookbookFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookFile_Cookbook(), this.getCookbookVersion(),
				null, "cookbook", null, 1, 1, CookbookFile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(cookbookFileEClass, theUtilityPackage.getEInputStream(),
				"getContentStream", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cookbookEClass, Cookbook.class, "Cookbook", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCookbook_Json_class(), ecorePackage.getEString(),
				"json_class", null, 0, 1, Cookbook.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCookbook_Chef_type(), ecorePackage.getEString(),
				"chef_type", null, 0, 1, Cookbook.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
=======
		cookbookVersionEClass.getESuperTypes().add(theChefclipsePackage.getNamedDescribedObject());
		cookbookVersionEClass.getESuperTypes().add(this.getCookbook());
		definitionEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
		definitionEClass.getESuperTypes().add(theChefclipsePackage.getChecksumFile());
		definitionEClass.getESuperTypes().add(theChefclipsePackage.getNamedObject());
		definitionEClass.getESuperTypes().add(this.getCookbookFile());
		libraryEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
		libraryEClass.getESuperTypes().add(theChefclipsePackage.getChecksumFile());
		libraryEClass.getESuperTypes().add(theChefclipsePackage.getNamedObject());
		libraryEClass.getESuperTypes().add(this.getCookbookFile());
		attributeEClass.getESuperTypes().add(theChefclipsePackage.getNamedObject());
		recipeEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
		recipeEClass.getESuperTypes().add(theChefclipsePackage.getRubyFile());
		recipeEClass.getESuperTypes().add(theChefclipsePackage.getChecksumFile());
		recipeEClass.getESuperTypes().add(theChefclipsePackage.getNamedObject());
		recipeEClass.getESuperTypes().add(this.getCookbookFile());
		recipeEClass.getESuperTypes().add(theChefserverPackage.getRunListItem());
		recipeDescriptionEClass.getESuperTypes().add(theChefclipsePackage.getNamedDescribedObject());
		resourceEClass.getESuperTypes().add(theChefclipsePackage.getRubyFile());
		resourceEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
		resourceEClass.getESuperTypes().add(theChefclipsePackage.getChecksumFile());
		resourceEClass.getESuperTypes().add(theChefclipsePackage.getNamedObject());
		resourceEClass.getESuperTypes().add(this.getCookbookFile());
		templateEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
		templateEClass.getESuperTypes().add(this.getCookbookFile());
		attributesEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
		attributesEClass.getESuperTypes().add(this.getCookbookFile());
		fileEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
		fileEClass.getESuperTypes().add(theChefclipsePackage.getChecksumFile());
		fileEClass.getESuperTypes().add(theChefclipsePackage.getNamedObject());
		fileEClass.getESuperTypes().add(this.getCookbookFile());
		metadataEClass.getESuperTypes().add(theChefclipsePackage.getRubyFile());
		metadataEClass.getESuperTypes().add(theChefclipsePackage.getMaintainedObject());
		metadataEClass.getESuperTypes().add(theChefclipsePackage.getNamedDescribedObject());
		providerEClass.getESuperTypes().add(theChefclipsePackage.getChecksumFile());
		providerEClass.getESuperTypes().add(theChefclipsePackage.getNamedObject());
		providerEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
		providerEClass.getESuperTypes().add(this.getCookbookFile());
		root_fileEClass.getESuperTypes().add(theChefclipsePackage.getChecksumFile());
		root_fileEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
		root_fileEClass.getESuperTypes().add(this.getCookbookFile());
		minimalMetadataEClass.getESuperTypes().add(this.getMetadata());
		cookbookFileEClass.getESuperTypes().add(theChefclipsePackage.getNamedObject());
		cookbookFileEClass.getESuperTypes().add(theChefclipsePackage.getChecksumFile());

		// Initialize classes and features; add operations and parameters
		initEClass(cookbookVersionEClass, CookbookVersion.class, "CookbookVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCookbookVersion_Environment(), theChefserverPackage.getEnvironment(), null, "environment", null, 0, 1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Templates(), this.getTemplate(), null, "templates", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Recipes(), this.getRecipe(), null, "recipes", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Definitions(), this.getDefinition(), null, "definitions", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Files(), this.getFile(), null, "files", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Resources(), this.getResource(), null, "resources", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Libraries(), this.getLibrary(), null, "libraries", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Metadata(), this.getMetadata(), this.getMetadata_CookbookVersion(), "metadata", null, 1, 1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Providers(), this.getProvider(), null, "providers", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Root_files(), this.getRoot_file(), null, "root_files", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Attributes(), this.getAttributes(), null, "attributes", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCookbookVersion_Catalog(), ecorePackage.getEString(), "catalog", null, 0, 1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Depends(), this.getCookbookVersion(), null, "depends", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCookbookVersion_Missing(), ecorePackage.getEStringToStringMapEntry(), null, "missing", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recipeEClass, Recipe.class, "Recipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecipe_Role(), theChefserverPackage.getRole(), null, "role", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecipe_Runlist(), theChefserverPackage.getRunList(), null, "runlist", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recipeDescriptionEClass, RecipeDescription.class, "RecipeDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributesEClass, Attributes.class, "Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyRelationEClass, DependencyRelation.class, "DependencyRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetadata_CookbookVersion(), this.getCookbookVersion(), this.getCookbookVersion_Metadata(), "cookbookVersion", null, 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_Long_description(), theChefclipsePackage.getText(), "long_description", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetadata_Version(), theChefclipsePackage.getVersion(), "version", "0.0.0", 1, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Replaces(), ecorePackage.getEStringToStringMapEntry(), null, "replaces", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Provides(), ecorePackage.getEStringToStringMapEntry(), null, "provides", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Conflicts(), ecorePackage.getEStringToStringMapEntry(), null, "conflicts", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Suggests(), ecorePackage.getEStringToStringMapEntry(), null, "suggests", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Dependencies(), ecorePackage.getEStringToStringMapEntry(), null, "dependencies", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Platforms(), ecorePackage.getEStringToStringMapEntry(), null, "platforms", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Recipes(), ecorePackage.getEStringToStringMapEntry(), null, "recipes", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providerEClass, Provider.class, "Provider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(root_fileEClass, Root_file.class, "Root_file", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minimalMetadataEClass, MinimalMetadata.class, "MinimalMetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cookbookFileEClass, CookbookFile.class, "CookbookFile", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCookbookFile_Cookbook(), this.getCookbookVersion(), null, "cookbook", null, 1, 1, CookbookFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCookbookFile_Bytes(), ecorePackage.getEByteArray(), "bytes", null, 0, 1, CookbookFile.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(cookbookFileEClass, theChefclipsePackage.getEInputStream(), "getContentStream", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cookbookEClass, Cookbook.class, "Cookbook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCookbook_Json_class(), ecorePackage.getEString(), "json_class", null, 0, 1, Cookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCookbook_Chef_type(), ecorePackage.getEString(), "chef_type", null, 0, 1, Cookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
>>>>>>> origin/tomhodder
	}

} //CookbookPackageImpl
