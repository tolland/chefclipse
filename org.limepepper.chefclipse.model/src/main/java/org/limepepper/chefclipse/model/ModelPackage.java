/**
 */
package org.limepepper.chefclipse.model;

import org.eclipse.core.resources.IResource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see org.limepepper.chefclipse.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public class ModelPackage extends EPackageImpl {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String eNAME = "model";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String eNS_URI = "http://limepepper.org/v1/chefclipse/model";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String eNS_PREFIX = "org.limepepper.chefclipse";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final ModelPackage eINSTANCE = org.limepepper.chefclipse.model.ModelPackage.init();

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.model.ChefObject <em>Chef Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.model.ChefObject
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefObject()
     * @generated
     */
    public static final int CHEF_OBJECT = 3;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT__CHILDREN = 0;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT__PARENT = 1;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT__PATH = 2;

    /**
     * The feature id for the '<em><b>Project</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT__PROJECT = 3;

    /**
     * The number of structural features of the '<em>Chef Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.model.ChefResource <em>Chef Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.model.ChefResource
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefResource()
     * @generated
     */
    public static final int CHEF_RESOURCE = 7;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_RESOURCE__CHILDREN = CHEF_OBJECT__CHILDREN;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_RESOURCE__PARENT = CHEF_OBJECT__PARENT;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_RESOURCE__PATH = CHEF_OBJECT__PATH;

    /**
     * The feature id for the '<em><b>Project</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_RESOURCE__PROJECT = CHEF_OBJECT__PROJECT;

    /**
     * The feature id for the '<em><b>Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_RESOURCE__RESOURCE = CHEF_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_RESOURCE__TYPE = CHEF_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Chef Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_RESOURCE_FEATURE_COUNT = CHEF_OBJECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.model.ChefContainer <em>Chef Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.model.ChefContainer
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefContainer()
     * @generated
     */
    public static final int CHEF_CONTAINER = 0;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_CONTAINER__CHILDREN = CHEF_RESOURCE__CHILDREN;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_CONTAINER__PARENT = CHEF_RESOURCE__PARENT;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_CONTAINER__PATH = CHEF_RESOURCE__PATH;

    /**
     * The feature id for the '<em><b>Project</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_CONTAINER__PROJECT = CHEF_RESOURCE__PROJECT;

    /**
     * The feature id for the '<em><b>Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_CONTAINER__RESOURCE = CHEF_RESOURCE__RESOURCE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_CONTAINER__TYPE = CHEF_RESOURCE__TYPE;

    /**
     * The number of structural features of the '<em>Chef Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_CONTAINER_FEATURE_COUNT = CHEF_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.model.ChefFile <em>Chef File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.model.ChefFile
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefFile()
     * @generated
     */
    public static final int CHEF_FILE = 1;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FILE__CHILDREN = CHEF_RESOURCE__CHILDREN;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FILE__PARENT = CHEF_RESOURCE__PARENT;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FILE__PATH = CHEF_RESOURCE__PATH;

    /**
     * The feature id for the '<em><b>Project</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FILE__PROJECT = CHEF_RESOURCE__PROJECT;

    /**
     * The feature id for the '<em><b>Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FILE__RESOURCE = CHEF_RESOURCE__RESOURCE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FILE__TYPE = CHEF_RESOURCE__TYPE;

    /**
     * The number of structural features of the '<em>Chef File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FILE_FEATURE_COUNT = CHEF_RESOURCE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.model.ChefFolder <em>Chef Folder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.model.ChefFolder
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefFolder()
     * @generated
     */
    public static final int CHEF_FOLDER = 2;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FOLDER__CHILDREN = CHEF_CONTAINER__CHILDREN;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FOLDER__PARENT = CHEF_CONTAINER__PARENT;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FOLDER__PATH = CHEF_CONTAINER__PATH;

    /**
     * The feature id for the '<em><b>Project</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FOLDER__PROJECT = CHEF_CONTAINER__PROJECT;

    /**
     * The feature id for the '<em><b>Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FOLDER__RESOURCE = CHEF_CONTAINER__RESOURCE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FOLDER__TYPE = CHEF_CONTAINER__TYPE;

    /**
     * The number of structural features of the '<em>Chef Folder</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_FOLDER_FEATURE_COUNT = CHEF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.model.ChefObjectDefinitionFile <em>Chef Object Definition File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.model.ChefObjectDefinitionFile
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefObjectDefinitionFile()
     * @generated
     */
    public static final int CHEF_OBJECT_DEFINITION_FILE = 4;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_DEFINITION_FILE__CHILDREN = CHEF_FILE__CHILDREN;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_DEFINITION_FILE__PARENT = CHEF_FILE__PARENT;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_DEFINITION_FILE__PATH = CHEF_FILE__PATH;

    /**
     * The feature id for the '<em><b>Project</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_DEFINITION_FILE__PROJECT = CHEF_FILE__PROJECT;

    /**
     * The feature id for the '<em><b>Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_DEFINITION_FILE__RESOURCE = CHEF_FILE__RESOURCE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_DEFINITION_FILE__TYPE = CHEF_FILE__TYPE;

    /**
     * The number of structural features of the '<em>Chef Object Definition File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_DEFINITION_FILE_FEATURE_COUNT = CHEF_FILE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.model.ChefObjectElementFile <em>Chef Object Element File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.model.ChefObjectElementFile
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefObjectElementFile()
     * @generated
     */
    public static final int CHEF_OBJECT_ELEMENT_FILE = 5;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_ELEMENT_FILE__CHILDREN = CHEF_FILE__CHILDREN;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_ELEMENT_FILE__PARENT = CHEF_FILE__PARENT;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_ELEMENT_FILE__PATH = CHEF_FILE__PATH;

    /**
     * The feature id for the '<em><b>Project</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_ELEMENT_FILE__PROJECT = CHEF_FILE__PROJECT;

    /**
     * The feature id for the '<em><b>Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_ELEMENT_FILE__RESOURCE = CHEF_FILE__RESOURCE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_ELEMENT_FILE__TYPE = CHEF_FILE__TYPE;

    /**
     * The number of structural features of the '<em>Chef Object Element File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_OBJECT_ELEMENT_FILE_FEATURE_COUNT = CHEF_FILE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.model.ChefProject <em>Chef Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.model.ChefProject
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefProject()
     * @generated
     */
    public static final int CHEF_PROJECT = 6;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_PROJECT__CHILDREN = CHEF_CONTAINER__CHILDREN;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_PROJECT__PARENT = CHEF_CONTAINER__PARENT;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_PROJECT__PATH = CHEF_CONTAINER__PATH;

    /**
     * The feature id for the '<em><b>Project</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_PROJECT__PROJECT = CHEF_CONTAINER__PROJECT;

    /**
     * The feature id for the '<em><b>Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_PROJECT__RESOURCE = CHEF_CONTAINER__RESOURCE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_PROJECT__TYPE = CHEF_CONTAINER__TYPE;

    /**
     * The number of structural features of the '<em>Chef Project</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_PROJECT_FEATURE_COUNT = CHEF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.model.ChefWorkspace <em>Chef Workspace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.model.ChefWorkspace
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefWorkspace()
     * @generated
     */
    public static final int CHEF_WORKSPACE = 8;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_WORKSPACE__CHILDREN = CHEF_CONTAINER__CHILDREN;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_WORKSPACE__PARENT = CHEF_CONTAINER__PARENT;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_WORKSPACE__PATH = CHEF_CONTAINER__PATH;

    /**
     * The feature id for the '<em><b>Project</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_WORKSPACE__PROJECT = CHEF_CONTAINER__PROJECT;

    /**
     * The feature id for the '<em><b>Resource</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_WORKSPACE__RESOURCE = CHEF_CONTAINER__RESOURCE;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_WORKSPACE__TYPE = CHEF_CONTAINER__TYPE;

    /**
     * The number of structural features of the '<em>Chef Workspace</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_WORKSPACE_FEATURE_COUNT = CHEF_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.model.ChangeTracker <em>Change Tracker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.model.ChangeTracker
     * @see org.limepepper.chefclipse.model.ModelPackage#getChangeTracker()
     * @generated
     */
    public static final int CHANGE_TRACKER = 9;

    /**
     * The number of structural features of the '<em>Change Tracker</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHANGE_TRACKER_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.model.ChefServer <em>Chef Server</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.model.ChefServer
     * @see org.limepepper.chefclipse.model.ModelPackage#getChefServer()
     * @generated
     */
    public static final int CHEF_SERVER = 10;

    /**
     * The feature id for the '<em><b>Children</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_SERVER__CHILDREN = CHEF_OBJECT__CHILDREN;

    /**
     * The feature id for the '<em><b>Parent</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_SERVER__PARENT = CHEF_OBJECT__PARENT;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_SERVER__PATH = CHEF_OBJECT__PATH;

    /**
     * The feature id for the '<em><b>Project</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_SERVER__PROJECT = CHEF_OBJECT__PROJECT;

    /**
     * The number of structural features of the '<em>Chef Server</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    public static final int CHEF_SERVER_FEATURE_COUNT = CHEF_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '<em>IResource</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.core.resources.IResource
     * @see org.limepepper.chefclipse.model.ModelPackage#getIResource()
     * @generated
     */
    public static final int IRESOURCE = 11;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass chefContainerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass chefFileEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass chefFolderEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass chefObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass chefObjectDefinitionFileEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass chefObjectElementFileEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass chefProjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass chefResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass chefWorkspaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass changeTrackerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass chefServerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType iResourceEDataType = null;

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
     * @see org.limepepper.chefclipse.model.ModelPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ModelPackage() {
        super(eNS_URI, ModelFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ModelPackage init() {
        if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

        // Obtain or create and register package
        ModelPackage theModelPackage = (ModelPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackage());

        isInited = true;

        // Create package meta-data objects
        theModelPackage.createPackageContents();

        // Initialize created meta-data
        theModelPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theModelPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
        return theModelPackage;
    }


    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.model.ChefContainer <em>Chef Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Chef Container</em>'.
     * @see org.limepepper.chefclipse.model.ChefContainer
     * @generated
     */
    public EClass getChefContainer() {
        return chefContainerEClass;
    }

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.model.ChefFile <em>Chef File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Chef File</em>'.
     * @see org.limepepper.chefclipse.model.ChefFile
     * @generated
     */
    public EClass getChefFile() {
        return chefFileEClass;
    }

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.model.ChefFolder <em>Chef Folder</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Chef Folder</em>'.
     * @see org.limepepper.chefclipse.model.ChefFolder
     * @generated
     */
    public EClass getChefFolder() {
        return chefFolderEClass;
    }

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.model.ChefObject <em>Chef Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Chef Object</em>'.
     * @see org.limepepper.chefclipse.model.ChefObject
     * @generated
     */
    public EClass getChefObject() {
        return chefObjectEClass;
    }

    /**
     * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.model.ChefObject#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Children</em>'.
     * @see org.limepepper.chefclipse.model.ChefObject#getChildren()
     * @see #getChefObject()
     * @generated
     */
    public EReference getChefObject_Children() {
        return (EReference)chefObjectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * Returns the meta object for the reference '{@link org.limepepper.chefclipse.model.ChefObject#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Parent</em>'.
     * @see org.limepepper.chefclipse.model.ChefObject#getParent()
     * @see #getChefObject()
     * @generated
     */
    public EReference getChefObject_Parent() {
        return (EReference)chefObjectEClass.getEStructuralFeatures().get(1);
    }

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.model.ChefObject#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.limepepper.chefclipse.model.ChefObject#getPath()
     * @see #getChefObject()
     * @generated
     */
    public EAttribute getChefObject_Path() {
        return (EAttribute)chefObjectEClass.getEStructuralFeatures().get(2);
    }

    /**
     * Returns the meta object for the reference '{@link org.limepepper.chefclipse.model.ChefObject#getProject <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Project</em>'.
     * @see org.limepepper.chefclipse.model.ChefObject#getProject()
     * @see #getChefObject()
     * @generated
     */
    public EReference getChefObject_Project() {
        return (EReference)chefObjectEClass.getEStructuralFeatures().get(3);
    }

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.model.ChefObjectDefinitionFile <em>Chef Object Definition File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Chef Object Definition File</em>'.
     * @see org.limepepper.chefclipse.model.ChefObjectDefinitionFile
     * @generated
     */
    public EClass getChefObjectDefinitionFile() {
        return chefObjectDefinitionFileEClass;
    }

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.model.ChefObjectElementFile <em>Chef Object Element File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Chef Object Element File</em>'.
     * @see org.limepepper.chefclipse.model.ChefObjectElementFile
     * @generated
     */
    public EClass getChefObjectElementFile() {
        return chefObjectElementFileEClass;
    }

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.model.ChefProject <em>Chef Project</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Chef Project</em>'.
     * @see org.limepepper.chefclipse.model.ChefProject
     * @generated
     */
    public EClass getChefProject() {
        return chefProjectEClass;
    }

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.model.ChefResource <em>Chef Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Chef Resource</em>'.
     * @see org.limepepper.chefclipse.model.ChefResource
     * @generated
     */
    public EClass getChefResource() {
        return chefResourceEClass;
    }

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.model.ChefResource#getResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Resource</em>'.
     * @see org.limepepper.chefclipse.model.ChefResource#getResource()
     * @see #getChefResource()
     * @generated
     */
    public EAttribute getChefResource_Resource() {
        return (EAttribute)chefResourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.model.ChefResource#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.limepepper.chefclipse.model.ChefResource#getType()
     * @see #getChefResource()
     * @generated
     */
    public EAttribute getChefResource_Type() {
        return (EAttribute)chefResourceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.model.ChefWorkspace <em>Chef Workspace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Chef Workspace</em>'.
     * @see org.limepepper.chefclipse.model.ChefWorkspace
     * @generated
     */
    public EClass getChefWorkspace() {
        return chefWorkspaceEClass;
    }

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.model.ChangeTracker <em>Change Tracker</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Change Tracker</em>'.
     * @see org.limepepper.chefclipse.model.ChangeTracker
     * @generated
     */
    public EClass getChangeTracker() {
        return changeTrackerEClass;
    }

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.model.ChefServer <em>Chef Server</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Chef Server</em>'.
     * @see org.limepepper.chefclipse.model.ChefServer
     * @generated
     */
    public EClass getChefServer() {
        return chefServerEClass;
    }

    /**
     * Returns the meta object for data type '{@link org.eclipse.core.resources.IResource <em>IResource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>IResource</em>'.
     * @see org.eclipse.core.resources.IResource
     * @model instanceClass="org.eclipse.core.resources.IResource"
     * @generated
     */
    public EDataType getIResource() {
        return iResourceEDataType;
    }

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    public ModelFactory getModelFactory() {
        return (ModelFactory)getEFactoryInstance();
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
        chefContainerEClass = createEClass(CHEF_CONTAINER);

        chefFileEClass = createEClass(CHEF_FILE);

        chefFolderEClass = createEClass(CHEF_FOLDER);

        chefObjectEClass = createEClass(CHEF_OBJECT);
        createEReference(chefObjectEClass, CHEF_OBJECT__CHILDREN);
        createEReference(chefObjectEClass, CHEF_OBJECT__PARENT);
        createEAttribute(chefObjectEClass, CHEF_OBJECT__PATH);
        createEReference(chefObjectEClass, CHEF_OBJECT__PROJECT);

        chefObjectDefinitionFileEClass = createEClass(CHEF_OBJECT_DEFINITION_FILE);

        chefObjectElementFileEClass = createEClass(CHEF_OBJECT_ELEMENT_FILE);

        chefProjectEClass = createEClass(CHEF_PROJECT);

        chefResourceEClass = createEClass(CHEF_RESOURCE);
        createEAttribute(chefResourceEClass, CHEF_RESOURCE__RESOURCE);
        createEAttribute(chefResourceEClass, CHEF_RESOURCE__TYPE);

        chefWorkspaceEClass = createEClass(CHEF_WORKSPACE);

        changeTrackerEClass = createEClass(CHANGE_TRACKER);

        chefServerEClass = createEClass(CHEF_SERVER);

        // Create data types
        iResourceEDataType = createEDataType(IRESOURCE);
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
        chefContainerEClass.getESuperTypes().add(this.getChefResource());
        chefFileEClass.getESuperTypes().add(this.getChefResource());
        chefFolderEClass.getESuperTypes().add(this.getChefContainer());
        chefObjectDefinitionFileEClass.getESuperTypes().add(this.getChefFile());
        chefObjectElementFileEClass.getESuperTypes().add(this.getChefFile());
        chefProjectEClass.getESuperTypes().add(this.getChefContainer());
        chefResourceEClass.getESuperTypes().add(this.getChefObject());
        chefWorkspaceEClass.getESuperTypes().add(this.getChefContainer());
        chefServerEClass.getESuperTypes().add(this.getChefObject());

        // Initialize classes and features; add operations and parameters
        initEClass(chefContainerEClass, ChefContainer.class, "ChefContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(chefFileEClass, ChefFile.class, "ChefFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(chefFolderEClass, ChefFolder.class, "ChefFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(chefObjectEClass, ChefObject.class, "ChefObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getChefObject_Children(), this.getChefObject(), null, "children", null, 0, -1, ChefObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getChefObject_Parent(), this.getChefObject(), null, "parent", null, 0, 1, ChefObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChefObject_Path(), ecorePackage.getEString(), "path", null, 1, 1, ChefObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getChefObject_Project(), this.getChefProject(), null, "project", null, 1, 1, ChefObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = addEOperation(chefObjectEClass, null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getChefResource(), "resource", 1, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(chefObjectDefinitionFileEClass, ChefObjectDefinitionFile.class, "ChefObjectDefinitionFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(chefObjectElementFileEClass, ChefObjectElementFile.class, "ChefObjectElementFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(chefProjectEClass, ChefProject.class, "ChefProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(chefResourceEClass, ChefResource.class, "ChefResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getChefResource_Resource(), this.getIResource(), "resource", null, 1, 1, ChefResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChefResource_Type(), ecorePackage.getEInt(), "type", "0", 1, 1, ChefResource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(chefWorkspaceEClass, ChefWorkspace.class, "ChefWorkspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(changeTrackerEClass, ChangeTracker.class, "ChangeTracker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(chefServerEClass, ChefServer.class, "ChefServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize data types
        initEDataType(iResourceEDataType, IResource.class, "IResource", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
         * The meta object literal for the '{@link org.limepepper.chefclipse.model.ChefContainer <em>Chef Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.model.ChefContainer
         * @see org.limepepper.chefclipse.model.ModelPackage#getChefContainer()
         * @generated
         */
        public static final EClass CHEF_CONTAINER = eINSTANCE.getChefContainer();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.model.ChefFile <em>Chef File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.model.ChefFile
         * @see org.limepepper.chefclipse.model.ModelPackage#getChefFile()
         * @generated
         */
        public static final EClass CHEF_FILE = eINSTANCE.getChefFile();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.model.ChefFolder <em>Chef Folder</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.model.ChefFolder
         * @see org.limepepper.chefclipse.model.ModelPackage#getChefFolder()
         * @generated
         */
        public static final EClass CHEF_FOLDER = eINSTANCE.getChefFolder();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.model.ChefObject <em>Chef Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.model.ChefObject
         * @see org.limepepper.chefclipse.model.ModelPackage#getChefObject()
         * @generated
         */
        public static final EClass CHEF_OBJECT = eINSTANCE.getChefObject();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EReference CHEF_OBJECT__CHILDREN = eINSTANCE.getChefObject_Children();

        /**
         * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EReference CHEF_OBJECT__PARENT = eINSTANCE.getChefObject_Parent();

        /**
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EAttribute CHEF_OBJECT__PATH = eINSTANCE.getChefObject_Path();

        /**
         * The meta object literal for the '<em><b>Project</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EReference CHEF_OBJECT__PROJECT = eINSTANCE.getChefObject_Project();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.model.ChefObjectDefinitionFile <em>Chef Object Definition File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.model.ChefObjectDefinitionFile
         * @see org.limepepper.chefclipse.model.ModelPackage#getChefObjectDefinitionFile()
         * @generated
         */
        public static final EClass CHEF_OBJECT_DEFINITION_FILE = eINSTANCE.getChefObjectDefinitionFile();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.model.ChefObjectElementFile <em>Chef Object Element File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.model.ChefObjectElementFile
         * @see org.limepepper.chefclipse.model.ModelPackage#getChefObjectElementFile()
         * @generated
         */
        public static final EClass CHEF_OBJECT_ELEMENT_FILE = eINSTANCE.getChefObjectElementFile();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.model.ChefProject <em>Chef Project</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.model.ChefProject
         * @see org.limepepper.chefclipse.model.ModelPackage#getChefProject()
         * @generated
         */
        public static final EClass CHEF_PROJECT = eINSTANCE.getChefProject();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.model.ChefResource <em>Chef Resource</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.model.ChefResource
         * @see org.limepepper.chefclipse.model.ModelPackage#getChefResource()
         * @generated
         */
        public static final EClass CHEF_RESOURCE = eINSTANCE.getChefResource();

        /**
         * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EAttribute CHEF_RESOURCE__RESOURCE = eINSTANCE.getChefResource_Resource();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final EAttribute CHEF_RESOURCE__TYPE = eINSTANCE.getChefResource_Type();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.model.ChefWorkspace <em>Chef Workspace</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.model.ChefWorkspace
         * @see org.limepepper.chefclipse.model.ModelPackage#getChefWorkspace()
         * @generated
         */
        public static final EClass CHEF_WORKSPACE = eINSTANCE.getChefWorkspace();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.model.ChangeTracker <em>Change Tracker</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.model.ChangeTracker
         * @see org.limepepper.chefclipse.model.ModelPackage#getChangeTracker()
         * @generated
         */
        public static final EClass CHANGE_TRACKER = eINSTANCE.getChangeTracker();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.model.ChefServer <em>Chef Server</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.model.ChefServer
         * @see org.limepepper.chefclipse.model.ModelPackage#getChefServer()
         * @generated
         */
        public static final EClass CHEF_SERVER = eINSTANCE.getChefServer();

        /**
         * The meta object literal for the '<em>IResource</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.core.resources.IResource
         * @see org.limepepper.chefclipse.model.ModelPackage#getIResource()
         * @generated
         */
        public static final EDataType IRESOURCE = eINSTANCE.getIResource();

    }

} //ModelPackage
