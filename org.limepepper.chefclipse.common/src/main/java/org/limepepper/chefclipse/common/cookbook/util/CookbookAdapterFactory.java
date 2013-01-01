/**
 */
package org.limepepper.chefclipse.common.cookbook.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.Cookbook;
import org.limepepper.chefclipse.DescribedObject;
import org.limepepper.chefclipse.MaintainedObject;
import org.limepepper.chefclipse.NamedDescribedObject;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.RubyFile;
import org.limepepper.chefclipse.SandboxedObject;

import org.limepepper.chefclipse.common.chefserver.RunListItem;
import org.limepepper.chefclipse.common.cookbook.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.common.cookbook.CookbookPackage
 * @generated
 */
public class CookbookAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CookbookPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = CookbookPackage.eINSTANCE;
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
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CookbookSwitch<Adapter> modelSwitch =
        new CookbookSwitch<Adapter>() {
            @Override
            public Adapter caseCookbookVersion(CookbookVersion object) {
                return createCookbookVersionAdapter();
            }
            @Override
            public Adapter caseDefinition(Definition object) {
                return createDefinitionAdapter();
            }
            @Override
            public Adapter caseLibrary(Library object) {
                return createLibraryAdapter();
            }
            @Override
            public Adapter caseAttribute(Attribute object) {
                return createAttributeAdapter();
            }
            @Override
            public Adapter caseRecipe(Recipe object) {
                return createRecipeAdapter();
            }
            @Override
            public Adapter caseRecipeDescription(RecipeDescription object) {
                return createRecipeDescriptionAdapter();
            }
            @Override
            public Adapter caseResource(Resource object) {
                return createResourceAdapter();
            }
            @Override
            public Adapter caseTemplate(Template object) {
                return createTemplateAdapter();
            }
            @Override
            public Adapter caseAttributes(Attributes object) {
                return createAttributesAdapter();
            }
            @Override
            public Adapter caseFile(File object) {
                return createFileAdapter();
            }
            @Override
            public Adapter caseDependencyRelation(DependencyRelation object) {
                return createDependencyRelationAdapter();
            }
            @Override
            public Adapter caseMetadata(Metadata object) {
                return createMetadataAdapter();
            }
            @Override
            public Adapter caseProvider(Provider object) {
                return createProviderAdapter();
            }
            @Override
            public Adapter caseRoot_file(Root_file object) {
                return createRoot_fileAdapter();
            }
            @Override
            public Adapter caseMinimalMetadata(MinimalMetadata object) {
                return createMinimalMetadataAdapter();
            }
            @Override
            public Adapter caseName(Name object) {
                return createNameAdapter();
            }
            @Override
            public Adapter caseCookbookFile(CookbookFile object) {
                return createCookbookFileAdapter();
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
            public Adapter caseCookbook(Cookbook object) {
                return createCookbookAdapter();
            }
            @Override
            public Adapter caseSandboxedObject(SandboxedObject object) {
                return createSandboxedObjectAdapter();
            }
            @Override
            public Adapter caseChecksumFile(ChecksumFile object) {
                return createChecksumFileAdapter();
            }
            @Override
            public Adapter caseRubyFile(RubyFile object) {
                return createRubyFileAdapter();
            }
            @Override
            public Adapter caseRunListItem(RunListItem object) {
                return createRunListItemAdapter();
            }
            @Override
            public Adapter caseMaintainedObject(MaintainedObject object) {
                return createMaintainedObjectAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

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
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion
     * @generated
     */
    public Adapter createCookbookVersionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.Definition <em>Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.Definition
     * @generated
     */
    public Adapter createDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.Library <em>Library</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.Library
     * @generated
     */
    public Adapter createLibraryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.Attribute
     * @generated
     */
    public Adapter createAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.Recipe <em>Recipe</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.Recipe
     * @generated
     */
    public Adapter createRecipeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.RecipeDescription <em>Recipe Description</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.RecipeDescription
     * @generated
     */
    public Adapter createRecipeDescriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.Resource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.Resource
     * @generated
     */
    public Adapter createResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.Template <em>Template</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.Template
     * @generated
     */
    public Adapter createTemplateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.Attributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.Attributes
     * @generated
     */
    public Adapter createAttributesAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.File <em>File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.File
     * @generated
     */
    public Adapter createFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.DependencyRelation <em>Dependency Relation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.DependencyRelation
     * @generated
     */
    public Adapter createDependencyRelationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.Metadata <em>Metadata</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.Metadata
     * @generated
     */
    public Adapter createMetadataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.Provider <em>Provider</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.Provider
     * @generated
     */
    public Adapter createProviderAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.Root_file <em>Root file</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.Root_file
     * @generated
     */
    public Adapter createRoot_fileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.MinimalMetadata <em>Minimal Metadata</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.MinimalMetadata
     * @generated
     */
    public Adapter createMinimalMetadataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.Name <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.Name
     * @generated
     */
    public Adapter createNameAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.CookbookFile <em>File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.cookbook.CookbookFile
     * @generated
     */
    public Adapter createCookbookFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.DescribedObject <em>Described Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.DescribedObject
     * @generated
     */
    public Adapter createDescribedObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.NamedObject <em>Named Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.NamedObject
     * @generated
     */
    public Adapter createNamedObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.NamedDescribedObject <em>Named Described Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.NamedDescribedObject
     * @generated
     */
    public Adapter createNamedDescribedObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.Cookbook <em>Cookbook</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.Cookbook
     * @generated
     */
    public Adapter createCookbookAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.SandboxedObject <em>Sandboxed Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.SandboxedObject
     * @generated
     */
    public Adapter createSandboxedObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.ChecksumFile <em>Checksum File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.ChecksumFile
     * @generated
     */
    public Adapter createChecksumFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.RubyFile <em>Ruby File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.RubyFile
     * @generated
     */
    public Adapter createRubyFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.RunListItem <em>Run List Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.common.chefserver.RunListItem
     * @generated
     */
    public Adapter createRunListItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.MaintainedObject <em>Maintained Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.MaintainedObject
     * @generated
     */
    public Adapter createMaintainedObjectAdapter() {
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

} //CookbookAdapterFactory
