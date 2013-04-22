/**
 */
package org.limepepper.chefclipse.model;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.model.ModelPackage
 * @generated
 */
public class ModelFactory extends EFactoryImpl {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final ModelFactory eINSTANCE = init();

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ModelFactory init() {
        try {
            ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://limepepper.org/v1/chefclipse/model"); 
            if (theModelFactory != null) {
                return theModelFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ModelFactory();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelFactory() {
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
            case ModelPackage.CHEF_CONTAINER: return createChefContainer();
            case ModelPackage.CHEF_FILE: return createChefFile();
            case ModelPackage.CHEF_FOLDER: return createChefFolder();
            case ModelPackage.CHEF_OBJECT: return createChefObject();
            case ModelPackage.CHEF_OBJECT_DEFINITION_FILE: return createChefObjectDefinitionFile();
            case ModelPackage.CHEF_OBJECT_ELEMENT_FILE: return createChefObjectElementFile();
            case ModelPackage.CHEF_PROJECT: return createChefProject();
            case ModelPackage.CHEF_RESOURCE: return createChefResource();
            case ModelPackage.CHEF_WORKSPACE: return createChefWorkspace();
            case ModelPackage.CHANGE_TRACKER: return createChangeTracker();
            case ModelPackage.CHEF_SERVER: return createChefServer();
            case ModelPackage.COOKBOOK_FOLDER: return createCookbookFolder();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ModelPackage.IRESOURCE:
                return createIResourceFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ModelPackage.IRESOURCE:
                return convertIResourceToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefContainer createChefContainer() {
        ChefContainer chefContainer = new ChefContainer();
        return chefContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefFile createChefFile() {
        ChefFile chefFile = new ChefFile();
        return chefFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefFolder createChefFolder() {
        ChefFolder chefFolder = new ChefFolder();
        return chefFolder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefObject createChefObject() {
        ChefObject chefObject = new ChefObject();
        return chefObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefObjectDefinitionFile createChefObjectDefinitionFile() {
        ChefObjectDefinitionFile chefObjectDefinitionFile = new ChefObjectDefinitionFile();
        return chefObjectDefinitionFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefObjectElementFile createChefObjectElementFile() {
        ChefObjectElementFile chefObjectElementFile = new ChefObjectElementFile();
        return chefObjectElementFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefProject createChefProject() {
        ChefProject chefProject = new ChefProject();
        return chefProject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefResource createChefResource() {
        ChefResource chefResource = new ChefResource();
        return chefResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefWorkspace createChefWorkspace() {
        ChefWorkspace chefWorkspace = new ChefWorkspace();
        return chefWorkspace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChangeTracker createChangeTracker() {
        ChangeTracker changeTracker = new ChangeTracker();
        return changeTracker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefServer createChefServer() {
        ChefServer chefServer = new ChefServer();
        return chefServer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookFolder createCookbookFolder() {
        CookbookFolder cookbookFolder = new CookbookFolder();
        return cookbookFolder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IResource createIResourceFromString(EDataType eDataType, String initialValue) {
        return (IResource)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIResourceToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelPackage getModelPackage() {
        return (ModelPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ModelPackage getPackage() {
        return ModelPackage.eINSTANCE;
    }

} //ModelFactory
