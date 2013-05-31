/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import org.limepepper.chefclipse.common.cookbook.Metadata;
import org.limepepper.chefclipse.common.cookbook.MinimalMetadata;
import org.limepepper.chefclipse.common.cookbook.Provider;
import org.limepepper.chefclipse.common.cookbook.Recipe;
import org.limepepper.chefclipse.common.cookbook.RecipeDescription;
import org.limepepper.chefclipse.common.cookbook.Resource;
import org.limepepper.chefclipse.common.cookbook.Root_file;
import org.limepepper.chefclipse.common.cookbook.Template;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CookbookFactoryImpl extends EFactoryImpl implements CookbookFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static CookbookFactory init() {
		try {
			CookbookFactory theCookbookFactory = (CookbookFactory)EPackage.Registry.INSTANCE.getEFactory("http://limepepper.org/v1/chefclipse/cookbook"); 
			if (theCookbookFactory != null) {
				return theCookbookFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CookbookFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CookbookFactoryImpl() {
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
			case CookbookPackage.COOKBOOK_VERSION: return createCookbookVersion();
			case CookbookPackage.DEFINITION: return createDefinition();
			case CookbookPackage.LIBRARY: return createLibrary();
			case CookbookPackage.ATTRIBUTE: return createAttribute();
			case CookbookPackage.RECIPE: return createRecipe();
			case CookbookPackage.RECIPE_DESCRIPTION: return createRecipeDescription();
			case CookbookPackage.RESOURCE: return createResource();
			case CookbookPackage.TEMPLATE: return createTemplate();
			case CookbookPackage.ATTRIBUTES: return createAttributes();
			case CookbookPackage.FILE: return createFile();
			case CookbookPackage.DEPENDENCY_RELATION: return createDependencyRelation();
			case CookbookPackage.METADATA: return createMetadata();
			case CookbookPackage.PROVIDER: return createProvider();
			case CookbookPackage.ROOT_FILE: return createRoot_file();
			case CookbookPackage.MINIMAL_METADATA: return createMinimalMetadata();
			case CookbookPackage.COOKBOOK: return createCookbook();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CookbookVersion createCookbookVersion() {
		CookbookVersionImpl cookbookVersion = new CookbookVersionImpl();
		return cookbookVersion;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Recipe createRecipe() {
		RecipeImpl recipe = new RecipeImpl();
		return recipe;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RecipeDescription createRecipeDescription() {
		RecipeDescriptionImpl recipeDescription = new RecipeDescriptionImpl();
		return recipeDescription;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Attributes createAttributes() {
		AttributesImpl attributes = new AttributesImpl();
		return attributes;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DependencyRelation createDependencyRelation() {
		DependencyRelationImpl dependencyRelation = new DependencyRelationImpl();
		return dependencyRelation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Root_file createRoot_file() {
		Root_fileImpl root_file = new Root_fileImpl();
		return root_file;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MinimalMetadata createMinimalMetadata() {
		MinimalMetadataImpl minimalMetadata = new MinimalMetadataImpl();
		return minimalMetadata;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cookbook createCookbook() {
		CookbookImpl cookbook = new CookbookImpl();
		return cookbook;
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public CookbookPackage getCookbookPackage() {
		return (CookbookPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static CookbookPackage getPackage() {
		return CookbookPackage.eINSTANCE;
	}

} //CookbookFactoryImpl
