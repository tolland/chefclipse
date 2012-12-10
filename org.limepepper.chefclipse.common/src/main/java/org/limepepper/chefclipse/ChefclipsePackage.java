/**
 */
package org.limepepper.chefclipse;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.limepepper.chefclipse.ChefclipseFactory
 * @model kind="package"
 * @generated
 */
public interface ChefclipsePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "chefclipse";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://limepepper.org/v1/chefclipse/";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "org.limepepper";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ChefclipsePackage eINSTANCE = org.limepepper.chefclipse.impl.ChefclipsePackageImpl.init();

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.NamedDescribedObject <em>Named Described Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.NamedDescribedObject
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getNamedDescribedObject()
     * @generated
     */
    int NAMED_DESCRIBED_OBJECT = 0;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.impl.VersionedObjectImpl <em>Versioned Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.impl.VersionedObjectImpl
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getVersionedObject()
     * @generated
     */
    int VERSIONED_OBJECT = 1;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.impl.SandboxedObjectImpl <em>Sandboxed Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.impl.SandboxedObjectImpl
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getSandboxedObject()
     * @generated
     */
    int SANDBOXED_OBJECT = 2;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.impl.RubyFileImpl <em>Ruby File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.impl.RubyFileImpl
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getRubyFile()
     * @generated
     */
    int RUBY_FILE = 3;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.impl.NamedObjectImpl <em>Named Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.impl.NamedObjectImpl
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getNamedObject()
     * @generated
     */
    int NAMED_OBJECT = 4;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.impl.DescribedObjectImpl <em>Described Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.impl.DescribedObjectImpl
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getDescribedObject()
     * @generated
     */
    int DESCRIBED_OBJECT = 5;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIBED_OBJECT__DESCRIPTION = 0;

    /**
     * The number of structural features of the '<em>Described Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DESCRIBED_OBJECT_FEATURE_COUNT = 1;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_DESCRIBED_OBJECT__DESCRIPTION = DESCRIBED_OBJECT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_DESCRIBED_OBJECT__NAME = DESCRIBED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_DESCRIBED_OBJECT__ID = DESCRIBED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Named Described Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_DESCRIBED_OBJECT_FEATURE_COUNT = DESCRIBED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>NUM VERSIONS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_OBJECT__NUM_VERSIONS = 0;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_OBJECT__VERSION = 1;

    /**
     * The number of structural features of the '<em>Versioned Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_OBJECT_FEATURE_COUNT = 2;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SANDBOXED_OBJECT__URL = 0;

    /**
     * The number of structural features of the '<em>Sandboxed Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SANDBOXED_OBJECT_FEATURE_COUNT = 1;

    /**
     * The feature id for the '<em><b>Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUBY_FILE__EXTENSION = 0;

    /**
     * The number of structural features of the '<em>Ruby File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUBY_FILE_FEATURE_COUNT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_OBJECT__NAME = 0;

    /**
     * The feature id for the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_OBJECT__ID = 1;

    /**
     * The number of structural features of the '<em>Named Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_OBJECT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.impl.ChecksumFileImpl <em>Checksum File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.impl.ChecksumFileImpl
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getChecksumFile()
     * @generated
     */
    int CHECKSUM_FILE = 6;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKSUM_FILE__CHECKSUM = 0;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKSUM_FILE__PATH = 1;

    /**
     * The feature id for the '<em><b>Specificity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKSUM_FILE__SPECIFICITY = 2;

    /**
     * The number of structural features of the '<em>Checksum File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKSUM_FILE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.impl.MaintainedObjectImpl <em>Maintained Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.impl.MaintainedObjectImpl
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getMaintainedObject()
     * @generated
     */
    int MAINTAINED_OBJECT = 7;

    /**
     * The feature id for the '<em><b>Maintainer</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAINTAINED_OBJECT__MAINTAINER = 0;

    /**
     * The feature id for the '<em><b>Maintainer email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAINTAINED_OBJECT__MAINTAINER_EMAIL = 1;

    /**
     * The feature id for the '<em><b>License</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAINTAINED_OBJECT__LICENSE = 2;

    /**
     * The number of structural features of the '<em>Maintained Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAINTAINED_OBJECT_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.impl.ConfigImpl <em>Config</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.impl.ConfigImpl
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getConfig()
     * @generated
     */
    int CONFIG = 8;

    /**
     * The feature id for the '<em><b>Chef server url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__CHEF_SERVER_URL = 0;

    /**
     * The feature id for the '<em><b>Client key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__CLIENT_KEY = 1;

    /**
     * The feature id for the '<em><b>Node name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__NODE_NAME = 2;

    /**
     * The feature id for the '<em><b>Log level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__LOG_LEVEL = 3;

    /**
     * The feature id for the '<em><b>Validation key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__VALIDATION_KEY = 4;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__VERSION = 5;

    /**
     * The feature id for the '<em><b>Validation client name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG__VALIDATION_CLIENT_NAME = 6;

    /**
     * The number of structural features of the '<em>Config</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONFIG_FEATURE_COUNT = 7;

    /**
     * The meta object id for the '{@link org.limepepper.chefclipse.impl.NameUrlMapImpl <em>Name Url Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.impl.NameUrlMapImpl
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getNameUrlMap()
     * @generated
     */
    int NAME_URL_MAP = 9;

    /**
     * The feature id for the '<em><b>Entry</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_URL_MAP__ENTRY = 0;

    /**
     * The number of structural features of the '<em>Name Url Map</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAME_URL_MAP_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '<em>URL</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.net.URL
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getURL()
     * @generated
     */
    int URL = 10;

    /**
     * The meta object id for the '<em>File</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.io.File
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getFile()
     * @generated
     */
    int FILE = 11;


    /**
     * The meta object id for the '<em>Chef type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getChef_type()
     * @generated
     */
    int CHEF_TYPE = 12;

    /**
     * The meta object id for the '<em>Email</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getEmail()
     * @generated
     */
    int EMAIL = 13;

    /**
     * The meta object id for the '<em>Text</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getText()
     * @generated
     */
    int TEXT = 14;

    /**
     * The meta object id for the '<em>Version</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getVersion()
     * @generated
     */
    int VERSION = 15;

    /**
     * The meta object id for the '<em>Name</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getName_()
     * @generated
     */
    int NAME = 16;

    /**
     * The meta object id for the '<em>Description</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getDescription()
     * @generated
     */
    int DESCRIPTION = 17;

    /**
     * The meta object id for the '<em>Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getObject()
     * @generated
     */
    int OBJECT = 18;


    /**
     * The meta object id for the '<em>Name Url Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Object
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getNameUrlDataType()
     * @generated
     */
    int NAME_URL_DATA_TYPE = 19;


    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.NamedDescribedObject <em>Named Described Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Described Object</em>'.
     * @see org.limepepper.chefclipse.NamedDescribedObject
     * @generated
     */
    EClass getNamedDescribedObject();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.VersionedObject <em>Versioned Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Versioned Object</em>'.
     * @see org.limepepper.chefclipse.VersionedObject
     * @generated
     */
    EClass getVersionedObject();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.VersionedObject#getNUM_VERSIONS <em>NUM VERSIONS</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>NUM VERSIONS</em>'.
     * @see org.limepepper.chefclipse.VersionedObject#getNUM_VERSIONS()
     * @see #getVersionedObject()
     * @generated
     */
    EAttribute getVersionedObject_NUM_VERSIONS();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.VersionedObject#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.limepepper.chefclipse.VersionedObject#getVersion()
     * @see #getVersionedObject()
     * @generated
     */
    EAttribute getVersionedObject_Version();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.SandboxedObject <em>Sandboxed Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sandboxed Object</em>'.
     * @see org.limepepper.chefclipse.SandboxedObject
     * @generated
     */
    EClass getSandboxedObject();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.SandboxedObject#getUrl <em>Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Url</em>'.
     * @see org.limepepper.chefclipse.SandboxedObject#getUrl()
     * @see #getSandboxedObject()
     * @generated
     */
    EAttribute getSandboxedObject_Url();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.RubyFile <em>Ruby File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ruby File</em>'.
     * @see org.limepepper.chefclipse.RubyFile
     * @generated
     */
    EClass getRubyFile();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.RubyFile#getExtension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Extension</em>'.
     * @see org.limepepper.chefclipse.RubyFile#getExtension()
     * @see #getRubyFile()
     * @generated
     */
    EAttribute getRubyFile_Extension();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.NamedObject <em>Named Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Object</em>'.
     * @see org.limepepper.chefclipse.NamedObject
     * @generated
     */
    EClass getNamedObject();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.NamedObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.limepepper.chefclipse.NamedObject#getName()
     * @see #getNamedObject()
     * @generated
     */
    EAttribute getNamedObject_Name();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.NamedObject#getID <em>ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>ID</em>'.
     * @see org.limepepper.chefclipse.NamedObject#getID()
     * @see #getNamedObject()
     * @generated
     */
    EAttribute getNamedObject_ID();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.DescribedObject <em>Described Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Described Object</em>'.
     * @see org.limepepper.chefclipse.DescribedObject
     * @generated
     */
    EClass getDescribedObject();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.DescribedObject#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.limepepper.chefclipse.DescribedObject#getDescription()
     * @see #getDescribedObject()
     * @generated
     */
    EAttribute getDescribedObject_Description();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.ChecksumFile <em>Checksum File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Checksum File</em>'.
     * @see org.limepepper.chefclipse.ChecksumFile
     * @generated
     */
    EClass getChecksumFile();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.ChecksumFile#getChecksum <em>Checksum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Checksum</em>'.
     * @see org.limepepper.chefclipse.ChecksumFile#getChecksum()
     * @see #getChecksumFile()
     * @generated
     */
    EAttribute getChecksumFile_Checksum();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.ChecksumFile#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see org.limepepper.chefclipse.ChecksumFile#getPath()
     * @see #getChecksumFile()
     * @generated
     */
    EAttribute getChecksumFile_Path();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.ChecksumFile#getSpecificity <em>Specificity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Specificity</em>'.
     * @see org.limepepper.chefclipse.ChecksumFile#getSpecificity()
     * @see #getChecksumFile()
     * @generated
     */
    EAttribute getChecksumFile_Specificity();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.MaintainedObject <em>Maintained Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Maintained Object</em>'.
     * @see org.limepepper.chefclipse.MaintainedObject
     * @generated
     */
    EClass getMaintainedObject();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.MaintainedObject#getMaintainer <em>Maintainer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maintainer</em>'.
     * @see org.limepepper.chefclipse.MaintainedObject#getMaintainer()
     * @see #getMaintainedObject()
     * @generated
     */
    EAttribute getMaintainedObject_Maintainer();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.MaintainedObject#getMaintainer_email <em>Maintainer email</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Maintainer email</em>'.
     * @see org.limepepper.chefclipse.MaintainedObject#getMaintainer_email()
     * @see #getMaintainedObject()
     * @generated
     */
    EAttribute getMaintainedObject_Maintainer_email();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.MaintainedObject#getLicense <em>License</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>License</em>'.
     * @see org.limepepper.chefclipse.MaintainedObject#getLicense()
     * @see #getMaintainedObject()
     * @generated
     */
    EAttribute getMaintainedObject_License();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.Config <em>Config</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Config</em>'.
     * @see org.limepepper.chefclipse.Config
     * @generated
     */
    EClass getConfig();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.Config#getChef_server_url <em>Chef server url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Chef server url</em>'.
     * @see org.limepepper.chefclipse.Config#getChef_server_url()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Chef_server_url();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.Config#getClient_key <em>Client key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Client key</em>'.
     * @see org.limepepper.chefclipse.Config#getClient_key()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Client_key();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.Config#getNode_name <em>Node name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Node name</em>'.
     * @see org.limepepper.chefclipse.Config#getNode_name()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Node_name();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.Config#getLog_level <em>Log level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Log level</em>'.
     * @see org.limepepper.chefclipse.Config#getLog_level()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Log_level();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.Config#getValidation_key <em>Validation key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Validation key</em>'.
     * @see org.limepepper.chefclipse.Config#getValidation_key()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Validation_key();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.Config#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see org.limepepper.chefclipse.Config#getVersion()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Version();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.Config#getValidation_client_name <em>Validation client name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Validation client name</em>'.
     * @see org.limepepper.chefclipse.Config#getValidation_client_name()
     * @see #getConfig()
     * @generated
     */
    EAttribute getConfig_Validation_client_name();

    /**
     * Returns the meta object for class '{@link org.limepepper.chefclipse.NameUrlMap <em>Name Url Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Name Url Map</em>'.
     * @see org.limepepper.chefclipse.NameUrlMap
     * @generated
     */
    EClass getNameUrlMap();

    /**
     * Returns the meta object for the map '{@link org.limepepper.chefclipse.NameUrlMap#getEntry <em>Entry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>Entry</em>'.
     * @see org.limepepper.chefclipse.NameUrlMap#getEntry()
     * @see #getNameUrlMap()
     * @generated
     */
    EReference getNameUrlMap_Entry();

    /**
     * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>URL</em>'.
     * @see java.net.URL
     * @model instanceClass="java.net.URL"
     * @generated
     */
    EDataType getURL();

    /**
     * Returns the meta object for data type '{@link java.io.File <em>File</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>File</em>'.
     * @see java.io.File
     * @model instanceClass="java.io.File"
     * @generated
     */
    EDataType getFile();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Chef type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Chef type</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getChef_type();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Email</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Email</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getEmail();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Text</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getText();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Version</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getVersion();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Name</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     * @generated
     */
    EDataType getName_();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Description</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     * @generated
     */
    EDataType getDescription();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Object</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     * @generated
     */
    EDataType getObject();

    /**
     * Returns the meta object for data type '{@link java.lang.Object <em>Name Url Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Name Url Data Type</em>'.
     * @see java.lang.Object
     * @model instanceClass="java.lang.Object"
     * @generated
     */
    EDataType getNameUrlDataType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ChefclipseFactory getChefclipseFactory();

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
    interface Literals {
        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.NamedDescribedObject <em>Named Described Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.NamedDescribedObject
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getNamedDescribedObject()
         * @generated
         */
        EClass NAMED_DESCRIBED_OBJECT = eINSTANCE.getNamedDescribedObject();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.impl.VersionedObjectImpl <em>Versioned Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.impl.VersionedObjectImpl
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getVersionedObject()
         * @generated
         */
        EClass VERSIONED_OBJECT = eINSTANCE.getVersionedObject();

        /**
         * The meta object literal for the '<em><b>NUM VERSIONS</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VERSIONED_OBJECT__NUM_VERSIONS = eINSTANCE.getVersionedObject_NUM_VERSIONS();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute VERSIONED_OBJECT__VERSION = eINSTANCE.getVersionedObject_Version();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.impl.SandboxedObjectImpl <em>Sandboxed Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.impl.SandboxedObjectImpl
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getSandboxedObject()
         * @generated
         */
        EClass SANDBOXED_OBJECT = eINSTANCE.getSandboxedObject();

        /**
         * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SANDBOXED_OBJECT__URL = eINSTANCE.getSandboxedObject_Url();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.impl.RubyFileImpl <em>Ruby File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.impl.RubyFileImpl
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getRubyFile()
         * @generated
         */
        EClass RUBY_FILE = eINSTANCE.getRubyFile();

        /**
         * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RUBY_FILE__EXTENSION = eINSTANCE.getRubyFile_Extension();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.impl.NamedObjectImpl <em>Named Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.impl.NamedObjectImpl
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getNamedObject()
         * @generated
         */
        EClass NAMED_OBJECT = eINSTANCE.getNamedObject();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_OBJECT__NAME = eINSTANCE.getNamedObject_Name();

        /**
         * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_OBJECT__ID = eINSTANCE.getNamedObject_ID();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.impl.DescribedObjectImpl <em>Described Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.impl.DescribedObjectImpl
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getDescribedObject()
         * @generated
         */
        EClass DESCRIBED_OBJECT = eINSTANCE.getDescribedObject();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DESCRIBED_OBJECT__DESCRIPTION = eINSTANCE.getDescribedObject_Description();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.impl.ChecksumFileImpl <em>Checksum File</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.impl.ChecksumFileImpl
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getChecksumFile()
         * @generated
         */
        EClass CHECKSUM_FILE = eINSTANCE.getChecksumFile();

        /**
         * The meta object literal for the '<em><b>Checksum</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHECKSUM_FILE__CHECKSUM = eINSTANCE.getChecksumFile_Checksum();

        /**
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHECKSUM_FILE__PATH = eINSTANCE.getChecksumFile_Path();

        /**
         * The meta object literal for the '<em><b>Specificity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHECKSUM_FILE__SPECIFICITY = eINSTANCE.getChecksumFile_Specificity();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.impl.MaintainedObjectImpl <em>Maintained Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.impl.MaintainedObjectImpl
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getMaintainedObject()
         * @generated
         */
        EClass MAINTAINED_OBJECT = eINSTANCE.getMaintainedObject();

        /**
         * The meta object literal for the '<em><b>Maintainer</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAINTAINED_OBJECT__MAINTAINER = eINSTANCE.getMaintainedObject_Maintainer();

        /**
         * The meta object literal for the '<em><b>Maintainer email</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAINTAINED_OBJECT__MAINTAINER_EMAIL = eINSTANCE.getMaintainedObject_Maintainer_email();

        /**
         * The meta object literal for the '<em><b>License</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MAINTAINED_OBJECT__LICENSE = eINSTANCE.getMaintainedObject_License();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.impl.ConfigImpl <em>Config</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.impl.ConfigImpl
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getConfig()
         * @generated
         */
        EClass CONFIG = eINSTANCE.getConfig();

        /**
         * The meta object literal for the '<em><b>Chef server url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__CHEF_SERVER_URL = eINSTANCE.getConfig_Chef_server_url();

        /**
         * The meta object literal for the '<em><b>Client key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__CLIENT_KEY = eINSTANCE.getConfig_Client_key();

        /**
         * The meta object literal for the '<em><b>Node name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__NODE_NAME = eINSTANCE.getConfig_Node_name();

        /**
         * The meta object literal for the '<em><b>Log level</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__LOG_LEVEL = eINSTANCE.getConfig_Log_level();

        /**
         * The meta object literal for the '<em><b>Validation key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__VALIDATION_KEY = eINSTANCE.getConfig_Validation_key();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__VERSION = eINSTANCE.getConfig_Version();

        /**
         * The meta object literal for the '<em><b>Validation client name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONFIG__VALIDATION_CLIENT_NAME = eINSTANCE.getConfig_Validation_client_name();

        /**
         * The meta object literal for the '{@link org.limepepper.chefclipse.impl.NameUrlMapImpl <em>Name Url Map</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.impl.NameUrlMapImpl
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getNameUrlMap()
         * @generated
         */
        EClass NAME_URL_MAP = eINSTANCE.getNameUrlMap();

        /**
         * The meta object literal for the '<em><b>Entry</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NAME_URL_MAP__ENTRY = eINSTANCE.getNameUrlMap_Entry();

        /**
         * The meta object literal for the '<em>URL</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.net.URL
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getURL()
         * @generated
         */
        EDataType URL = eINSTANCE.getURL();

        /**
         * The meta object literal for the '<em>File</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.io.File
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getFile()
         * @generated
         */
        EDataType FILE = eINSTANCE.getFile();

        /**
         * The meta object literal for the '<em>Chef type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getChef_type()
         * @generated
         */
        EDataType CHEF_TYPE = eINSTANCE.getChef_type();

        /**
         * The meta object literal for the '<em>Email</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getEmail()
         * @generated
         */
        EDataType EMAIL = eINSTANCE.getEmail();

        /**
         * The meta object literal for the '<em>Text</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getText()
         * @generated
         */
        EDataType TEXT = eINSTANCE.getText();

        /**
         * The meta object literal for the '<em>Version</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getVersion()
         * @generated
         */
        EDataType VERSION = eINSTANCE.getVersion();

        /**
         * The meta object literal for the '<em>Name</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getName_()
         * @generated
         */
        EDataType NAME = eINSTANCE.getName_();

        /**
         * The meta object literal for the '<em>Description</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getDescription()
         * @generated
         */
        EDataType DESCRIPTION = eINSTANCE.getDescription();

        /**
         * The meta object literal for the '<em>Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getObject()
         * @generated
         */
        EDataType OBJECT = eINSTANCE.getObject();

        /**
         * The meta object literal for the '<em>Name Url Data Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.Object
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getNameUrlDataType()
         * @generated
         */
        EDataType NAME_URL_DATA_TYPE = eINSTANCE.getNameUrlDataType();

    }

} //ChefclipsePackage
