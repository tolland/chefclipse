/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import static org.limepepper.chefclipse.common.cookbook.CookbookPackage.RESOURCE;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.REST.RESTPackage;
import org.limepepper.chefclipse.REST.impl.RESTPackageImpl;
import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;
import org.limepepper.chefclipse.common.chefclient.impl.ChefclientPackageImpl;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.impl.ChefserverPackageImpl;
import org.limepepper.chefclipse.common.cookbook.Attribute;
import org.limepepper.chefclipse.common.cookbook.Attributes;
import org.limepepper.chefclipse.common.cookbook.Cookbook;
import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Definition;
import org.limepepper.chefclipse.common.cookbook.DependencyRelation;
import org.limepepper.chefclipse.common.cookbook.File;
import org.limepepper.chefclipse.common.cookbook.Library;
import org.limepepper.chefclipse.common.cookbook.Recipe;
import org.limepepper.chefclipse.common.cookbook.Resource;
import org.limepepper.chefclipse.common.cookbook.Template;
import org.limepepper.chefclipse.common.cookbook.Version;
import org.limepepper.chefclipse.common.cookbook.supports;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.limepepper.chefclipse.common.knife.impl.KnifePackageImpl;
import org.limepepper.chefclipse.common.workstation.WorkstationPackage;
import org.limepepper.chefclipse.common.workstation.impl.WorkstationPackageImpl;
import org.limepepper.chefclipse.impl.ChefclipsePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CookbookPackageImpl extends EPackageImpl implements CookbookPackage {
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
    private EClass cookbookEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass versionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum supportsEEnum = null;

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
        if (isInited) return (CookbookPackage)EPackage.Registry.INSTANCE.getEPackage(CookbookPackage.eNS_URI);

        // Obtain or create and register package
        CookbookPackageImpl theCookbookPackage = (CookbookPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CookbookPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CookbookPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        ChefclipsePackageImpl theChefclipsePackage = (ChefclipsePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) instanceof ChefclipsePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI) : ChefclipsePackage.eINSTANCE);
        ChefserverPackageImpl theChefserverPackage = (ChefserverPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) instanceof ChefserverPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI) : ChefserverPackage.eINSTANCE);
        ChefclientPackageImpl theChefclientPackage = (ChefclientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) instanceof ChefclientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ChefclientPackage.eNS_URI) : ChefclientPackage.eINSTANCE);
        WorkstationPackageImpl theWorkstationPackage = (WorkstationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) instanceof WorkstationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI) : WorkstationPackage.eINSTANCE);
        KnifePackageImpl theKnifePackage = (KnifePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) instanceof KnifePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KnifePackage.eNS_URI) : KnifePackage.eINSTANCE);
        RESTPackageImpl theRESTPackage = (RESTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RESTPackage.eNS_URI) instanceof RESTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RESTPackage.eNS_URI) : RESTPackage.eINSTANCE);

        // Create package meta-data objects
        theCookbookPackage.createPackageContents();
        theChefclipsePackage.createPackageContents();
        theChefserverPackage.createPackageContents();
        theChefclientPackage.createPackageContents();
        theWorkstationPackage.createPackageContents();
        theKnifePackage.createPackageContents();
        theRESTPackage.createPackageContents();

        // Initialize created meta-data
        theCookbookPackage.initializePackageContents();
        theChefclipsePackage.initializePackageContents();
        theChefserverPackage.initializePackageContents();
        theChefclientPackage.initializePackageContents();
        theWorkstationPackage.initializePackageContents();
        theKnifePackage.initializePackageContents();
        theRESTPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theCookbookPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(CookbookPackage.eNS_URI, theCookbookPackage);
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
    public EReference getCookbookVersion_Depends() {
        return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbookVersion_Environment() {
        return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbookVersion_Templates() {
        return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbookVersion_Recipes() {
        return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbookVersion_Definitions() {
        return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbookVersion_Files() {
        return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbookVersion_Resources() {
        return (EReference)cookbookVersionEClass.getEStructuralFeatures().get(6);
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
    public EClass getRecipe() {
        return recipeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecipe_CookbookVersion() {
        return (EReference)recipeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecipe_Resources() {
        return (EReference)recipeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecipe_Role() {
        return (EReference)recipeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecipe_Runlist() {
        return (EReference)recipeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRecipe_Cookbook() {
        return (EReference)recipeEClass.getEStructuralFeatures().get(4);
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
    public EReference getResource_Recipe() {
        return (EReference)resourceEClass.getEStructuralFeatures().get(0);
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
    public EReference getTemplate_Cookbook() {
        return (EReference)templateEClass.getEStructuralFeatures().get(0);
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
    public EClass getCookbook() {
        return cookbookEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbook_Depends() {
        return (EReference)cookbookEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbook_Environment() {
        return (EReference)cookbookEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbook_Recipes() {
        return (EReference)cookbookEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCookbook_Name() {
        return (EAttribute)cookbookEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCookbook_Repository() {
        return (EReference)cookbookEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVersion() {
        return versionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getsupports() {
        return supportsEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookFactory getCookbookFactory() {
        return (CookbookFactory)getEFactoryInstance();
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
        cookbookVersionEClass = createEClass(COOKBOOK_VERSION);
        createEReference(cookbookVersionEClass, COOKBOOK_VERSION__DEPENDS);
        createEReference(cookbookVersionEClass, COOKBOOK_VERSION__ENVIRONMENT);
        createEReference(cookbookVersionEClass, COOKBOOK_VERSION__TEMPLATES);
        createEReference(cookbookVersionEClass, COOKBOOK_VERSION__RECIPES);
        createEReference(cookbookVersionEClass, COOKBOOK_VERSION__DEFINITIONS);
        createEReference(cookbookVersionEClass, COOKBOOK_VERSION__FILES);
        createEReference(cookbookVersionEClass, COOKBOOK_VERSION__RESOURCES);

        definitionEClass = createEClass(DEFINITION);

        libraryEClass = createEClass(LIBRARY);

        attributeEClass = createEClass(ATTRIBUTE);

        recipeEClass = createEClass(RECIPE);
        createEReference(recipeEClass, RECIPE__COOKBOOK_VERSION);
        createEReference(recipeEClass, RECIPE__RESOURCES);
        createEReference(recipeEClass, RECIPE__ROLE);
        createEReference(recipeEClass, RECIPE__RUNLIST);
        createEReference(recipeEClass, RECIPE__COOKBOOK);

        resourceEClass = createEClass(RESOURCE);
        createEReference(resourceEClass, RESOURCE__RECIPE);

        templateEClass = createEClass(TEMPLATE);
        createEReference(templateEClass, TEMPLATE__COOKBOOK);

        attributesEClass = createEClass(ATTRIBUTES);

        fileEClass = createEClass(FILE);

        dependencyRelationEClass = createEClass(DEPENDENCY_RELATION);

        cookbookEClass = createEClass(COOKBOOK);
        createEReference(cookbookEClass, COOKBOOK__DEPENDS);
        createEReference(cookbookEClass, COOKBOOK__ENVIRONMENT);
        createEReference(cookbookEClass, COOKBOOK__RECIPES);
        createEAttribute(cookbookEClass, COOKBOOK__NAME);
        createEReference(cookbookEClass, COOKBOOK__REPOSITORY);

        versionEClass = createEClass(VERSION);

        // Create enums
        supportsEEnum = createEEnum(SUPPORTS);
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

        // Obtain other dependent packages
        ChefclipsePackage theChefclipsePackage = (ChefclipsePackage)EPackage.Registry.INSTANCE.getEPackage(ChefclipsePackage.eNS_URI);
        ChefserverPackage theChefserverPackage = (ChefserverPackage)EPackage.Registry.INSTANCE.getEPackage(ChefserverPackage.eNS_URI);
        WorkstationPackage theWorkstationPackage = (WorkstationPackage)EPackage.Registry.INSTANCE.getEPackage(WorkstationPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        cookbookVersionEClass.getESuperTypes().add(theChefclipsePackage.getNamedDescribedObject());
        definitionEClass.getESuperTypes().add(theChefclipsePackage.getNamedDescribedObject());
        definitionEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
        libraryEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
        libraryEClass.getESuperTypes().add(theChefclipsePackage.getNamedDescribedObject());
        attributeEClass.getESuperTypes().add(theChefclipsePackage.getNamedObject());
        recipeEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
        recipeEClass.getESuperTypes().add(theChefclipsePackage.getRubyFile());
        recipeEClass.getESuperTypes().add(theChefclipsePackage.getChecksumFile());
        resourceEClass.getESuperTypes().add(theChefclipsePackage.getRubyFile());
        resourceEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
        resourceEClass.getESuperTypes().add(theChefclipsePackage.getChecksumFile());
        templateEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
        templateEClass.getESuperTypes().add(theChefclipsePackage.getChecksumFile());
        attributesEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());
        attributesEClass.getESuperTypes().add(theChefclipsePackage.getChecksumFile());
        fileEClass.getESuperTypes().add(this.getResource());
        fileEClass.getESuperTypes().add(theChefclipsePackage.getSandboxedObject());

        // Initialize classes and features; add operations and parameters
        initEClass(cookbookVersionEClass, CookbookVersion.class, "CookbookVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCookbookVersion_Depends(), this.getCookbookVersion(), null, "depends", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbookVersion_Environment(), theChefserverPackage.getEnvironment(), null, "environment", null, 0, 1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbookVersion_Templates(), this.getTemplate(), this.getTemplate_Cookbook(), "templates", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbookVersion_Recipes(), this.getRecipe(), this.getRecipe_CookbookVersion(), "recipes", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbookVersion_Definitions(), this.getDefinition(), null, "definitions", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbookVersion_Files(), this.getFile(), null, "files", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbookVersion_Resources(), this.getResource(), null, "resources", null, 0, -1, CookbookVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(recipeEClass, Recipe.class, "Recipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRecipe_CookbookVersion(), this.getCookbookVersion(), this.getCookbookVersion_Recipes(), "cookbookVersion", null, 1, 1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRecipe_Resources(), this.getResource(), null, "resources", null, 1, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRecipe_Role(), theChefserverPackage.getRole(), null, "role", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRecipe_Runlist(), theChefserverPackage.getRunList(), null, "runlist", null, 0, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRecipe_Cookbook(), this.getCookbook(), null, "cookbook", null, 1, -1, Recipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getResource_Recipe(), this.getRecipe(), null, "recipe", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTemplate_Cookbook(), this.getCookbookVersion(), this.getCookbookVersion_Templates(), "cookbook", null, 1, 1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributesEClass, Attributes.class, "Attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dependencyRelationEClass, DependencyRelation.class, "DependencyRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(cookbookEClass, Cookbook.class, "Cookbook", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCookbook_Depends(), this.getDependencyRelation(), null, "depends", null, 0, 1, Cookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbook_Environment(), theChefserverPackage.getEnvironment(), null, "environment", null, 1, 1, Cookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbook_Recipes(), this.getRecipe(), null, "recipes", null, 0, -1, Cookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCookbook_Name(), ecorePackage.getEString(), "name", null, 0, 1, Cookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCookbook_Repository(), theWorkstationPackage.getRepository(), null, "repository", null, 0, 1, Cookbook.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(supportsEEnum, supports.class, "supports");
        addEEnumLiteral(supportsEEnum, supports.CENTOS);
        addEEnumLiteral(supportsEEnum, supports.WINDOWS);
        addEEnumLiteral(supportsEEnum, supports.DEBIAN);
    }

} //CookbookPackageImpl
