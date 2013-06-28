/**
 */
package org.limepepper.chefclipse.common.cookbook.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.cookbook.*;
=======
>>>>>>> origin/tomhodder
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
<<<<<<< HEAD
=======
import org.limepepper.chefclipse.common.cookbook.Name;
>>>>>>> origin/tomhodder
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
<<<<<<< HEAD
public class CookbookFactoryImpl extends EFactoryImpl implements
		CookbookFactory {
=======
public class CookbookFactoryImpl extends EFactoryImpl implements CookbookFactory {
>>>>>>> origin/tomhodder
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CookbookFactory init() {
		try {
<<<<<<< HEAD
			CookbookFactory theCookbookFactory = (CookbookFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://limepepper.org/v1/chefclipse/cookbook");
			if (theCookbookFactory != null) {
				return theCookbookFactory;
			}
		} catch (Exception exception) {
=======
			CookbookFactory theCookbookFactory = (CookbookFactory)EPackage.Registry.INSTANCE.getEFactory("http://limepepper.org/v1/chefclipse/cookbook"); 
			if (theCookbookFactory != null) {
				return theCookbookFactory;
			}
		}
		catch (Exception exception) {
>>>>>>> origin/tomhodder
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CookbookFactoryImpl();
	}
<<<<<<< HEAD

	/**
	 * Creates an instance of the factory.
=======

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
>>>>>>> origin/tomhodder
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public CookbookFactoryImpl() {
		super();
=======
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
			case CookbookPackage.NAME: return createName();
			case CookbookPackage.COOKBOOK: return createCookbook();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CookbookPackage.COOKBOOK_VERSION:
			return createCookbookVersion();
		case CookbookPackage.DEFINITION:
			return createDefinition();
		case CookbookPackage.LIBRARY:
			return createLibrary();
		case CookbookPackage.ATTRIBUTE:
			return createAttribute();
		case CookbookPackage.RECIPE:
			return createRecipe();
		case CookbookPackage.RECIPE_DESCRIPTION:
			return createRecipeDescription();
		case CookbookPackage.RESOURCE:
			return createResource();
		case CookbookPackage.TEMPLATE:
			return createTemplate();
		case CookbookPackage.ATTRIBUTES:
			return createAttributes();
		case CookbookPackage.FILE:
			return createFile();
		case CookbookPackage.DEPENDENCY_RELATION:
			return createDependencyRelation();
		case CookbookPackage.METADATA:
			return createMetadata();
		case CookbookPackage.PROVIDER:
			return createProvider();
		case CookbookPackage.ROOT_FILE:
			return createRoot_file();
		case CookbookPackage.MINIMAL_METADATA:
			return createMinimalMetadata();
		case CookbookPackage.COOKBOOK:
			return createCookbook();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
=======
	public CookbookVersion createCookbookVersion() {
		CookbookVersionImpl cookbookVersion = new CookbookVersionImpl();
		return cookbookVersion;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public CookbookVersion createCookbookVersion() {
		CookbookVersionImpl cookbookVersion = new CookbookVersionImpl();
		return cookbookVersion;
=======
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
=======
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
=======
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
=======
	public Recipe createRecipe() {
		RecipeImpl recipe = new RecipeImpl();
		return recipe;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public Recipe createRecipe() {
		RecipeImpl recipe = new RecipeImpl();
		return recipe;
=======
	public RecipeDescription createRecipeDescription() {
		RecipeDescriptionImpl recipeDescription = new RecipeDescriptionImpl();
		return recipeDescription;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public RecipeDescription createRecipeDescription() {
		RecipeDescriptionImpl recipeDescription = new RecipeDescriptionImpl();
		return recipeDescription;
=======
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
=======
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
=======
	public Attributes createAttributes() {
		AttributesImpl attributes = new AttributesImpl();
		return attributes;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public Attributes createAttributes() {
		AttributesImpl attributes = new AttributesImpl();
		return attributes;
=======
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
=======
	public DependencyRelation createDependencyRelation() {
		DependencyRelationImpl dependencyRelation = new DependencyRelationImpl();
		return dependencyRelation;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public DependencyRelation createDependencyRelation() {
		DependencyRelationImpl dependencyRelation = new DependencyRelationImpl();
		return dependencyRelation;
=======
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
=======
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public Provider createProvider() {
		ProviderImpl provider = new ProviderImpl();
		return provider;
=======
	public Root_file createRoot_file() {
		Root_fileImpl root_file = new Root_fileImpl();
		return root_file;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public Root_file createRoot_file() {
		Root_fileImpl root_file = new Root_fileImpl();
		return root_file;
=======
	public MinimalMetadata createMinimalMetadata() {
		MinimalMetadataImpl minimalMetadata = new MinimalMetadataImpl();
		return minimalMetadata;
>>>>>>> origin/tomhodder
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	public MinimalMetadata createMinimalMetadata() {
		MinimalMetadataImpl minimalMetadata = new MinimalMetadataImpl();
		return minimalMetadata;
=======
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
>>>>>>> origin/tomhodder
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
<<<<<<< HEAD
		return (CookbookPackage) getEPackage();
=======
		return (CookbookPackage)getEPackage();
>>>>>>> origin/tomhodder
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
