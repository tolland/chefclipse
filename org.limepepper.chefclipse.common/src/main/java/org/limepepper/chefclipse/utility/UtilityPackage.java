/**
 */
package org.limepepper.chefclipse.utility;

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
 * @see org.limepepper.chefclipse.utility.UtilityFactory
 * @model kind="package"
 * @generated
 */
public interface UtilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "utility";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://limepepper.org/v1/chefclipse/internal";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.limepepper.chefclipse";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilityPackage eINSTANCE = org.limepepper.chefclipse.utility.impl.UtilityPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.DescribedObjectImpl <em>Described Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.DescribedObjectImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getDescribedObject()
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
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.NamedDescribedObject <em>Named Described Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.NamedDescribedObject
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getNamedDescribedObject()
	 * @generated
	 */
	int NAMED_DESCRIBED_OBJECT = 0;

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
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.VersionedObjectImpl <em>Versioned Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.VersionedObjectImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getVersionedObject()
	 * @generated
	 */
	int VERSIONED_OBJECT = 1;

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
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.SandboxedObjectImpl <em>Sandboxed Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.SandboxedObjectImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getSandboxedObject()
	 * @generated
	 */
	int SANDBOXED_OBJECT = 2;

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
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.RubyFileImpl <em>Ruby File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.RubyFileImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getRubyFile()
	 * @generated
	 */
	int RUBY_FILE = 3;

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
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.NamedObjectImpl <em>Named Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.NamedObjectImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getNamedObject()
	 * @generated
	 */
	int NAMED_OBJECT = 4;

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
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.ChecksumFileImpl <em>Checksum File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.ChecksumFileImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getChecksumFile()
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
	 * The number of structural features of the '<em>Checksum File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSUM_FILE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.MaintainedObjectImpl <em>Maintained Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.MaintainedObjectImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getMaintainedObject()
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
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.ConfigImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getConfig()
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
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.NameUrlMapImpl <em>Name Url Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.NameUrlMapImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getNameUrlMap()
	 * @generated
	 */
	int NAME_URL_MAP = 9;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_URL_MAP__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Name Url Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_URL_MAP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.MapTestContainerImpl <em>Map Test Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.MapTestContainerImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getMapTestContainer()
	 * @generated
	 */
	int MAP_TEST_CONTAINER = 10;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TEST_CONTAINER__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Map Test Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_TEST_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.EStringToVersionUrlMapImpl <em>EString To Version Url Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.EStringToVersionUrlMapImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getEStringToVersionUrlMap()
	 * @generated
	 */
	int ESTRING_TO_VERSION_URL_MAP = 11;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_VERSION_URL_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_VERSION_URL_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To Version Url Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_VERSION_URL_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.VersionUrlImpl <em>Version Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.VersionUrlImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getVersionUrl()
	 * @generated
	 */
	int VERSION_URL = 12;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_URL__URL = 0;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_URL__VERSIONS = 1;

	/**
	 * The number of structural features of the '<em>Version Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_URL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.URLEntryTestImpl <em>URL Entry Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.URLEntryTestImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getURLEntryTest()
	 * @generated
	 */
	int URL_ENTRY_TEST = 13;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ENTRY_TEST__URL = 0;

	/**
	 * The number of structural features of the '<em>URL Entry Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_ENTRY_TEST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.NameVersionMapImpl <em>Name Version Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.NameVersionMapImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getNameVersionMap()
	 * @generated
	 */
	int NAME_VERSION_MAP = 14;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VERSION_MAP__ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Name Version Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_VERSION_MAP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.IdentObjectImpl <em>Ident Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.IdentObjectImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getIdentObject()
	 * @generated
	 */
	int IDENT_OBJECT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENT_OBJECT__ID = 0;

	/**
	 * The number of structural features of the '<em>Ident Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENT_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.limepepper.chefclipse.utility.impl.JsonObjectImpl <em>Json Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.limepepper.chefclipse.utility.impl.JsonObjectImpl
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getJsonObject()
	 * @generated
	 */
	int JSON_OBJECT = 16;

	/**
	 * The number of structural features of the '<em>Json Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getURL()
	 * @generated
	 */
	int URL = 17;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 18;

	/**
	 * The meta object id for the '<em>Chef type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getChef_type()
	 * @generated
	 */
	int CHEF_TYPE = 19;

	/**
	 * The meta object id for the '<em>Email</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getEmail()
	 * @generated
	 */
	int EMAIL = 20;

	/**
	 * The meta object id for the '<em>Text</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 21;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 22;

	/**
	 * The meta object id for the '<em>Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getName_()
	 * @generated
	 */
	int NAME = 23;

	/**
	 * The meta object id for the '<em>Description</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 24;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 25;

	/**
	 * The meta object id for the '<em>Name Url Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getNameUrlDataType()
	 * @generated
	 */
	int NAME_URL_DATA_TYPE = 26;

	/**
	 * The meta object id for the '<em>Map Test</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashMap
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getMapTest()
	 * @generated
	 */
	int MAP_TEST = 27;

	/**
	 * The meta object id for the '<em>IResource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IResource
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getIResource()
	 * @generated
	 */
	int IRESOURCE = 28;

	/**
	 * The meta object id for the '<em>EInput Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getEInputStream()
	 * @generated
	 */
	int EINPUT_STREAM = 29;

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.NamedDescribedObject <em>Named Described Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Described Object</em>'.
	 * @see org.limepepper.chefclipse.utility.NamedDescribedObject
	 * @generated
	 */
	EClass getNamedDescribedObject();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.VersionedObject <em>Versioned Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Object</em>'.
	 * @see org.limepepper.chefclipse.utility.VersionedObject
	 * @generated
	 */
	EClass getVersionedObject();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.VersionedObject#getNUM_VERSIONS <em>NUM VERSIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NUM VERSIONS</em>'.
	 * @see org.limepepper.chefclipse.utility.VersionedObject#getNUM_VERSIONS()
	 * @see #getVersionedObject()
	 * @generated
	 */
	EAttribute getVersionedObject_NUM_VERSIONS();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.VersionedObject#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.limepepper.chefclipse.utility.VersionedObject#getVersion()
	 * @see #getVersionedObject()
	 * @generated
	 */
	EAttribute getVersionedObject_Version();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.SandboxedObject <em>Sandboxed Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sandboxed Object</em>'.
	 * @see org.limepepper.chefclipse.utility.SandboxedObject
	 * @generated
	 */
	EClass getSandboxedObject();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.SandboxedObject#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.limepepper.chefclipse.utility.SandboxedObject#getUrl()
	 * @see #getSandboxedObject()
	 * @generated
	 */
	EAttribute getSandboxedObject_Url();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.RubyFile <em>Ruby File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruby File</em>'.
	 * @see org.limepepper.chefclipse.utility.RubyFile
	 * @generated
	 */
	EClass getRubyFile();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.RubyFile#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.limepepper.chefclipse.utility.RubyFile#getExtension()
	 * @see #getRubyFile()
	 * @generated
	 */
	EAttribute getRubyFile_Extension();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.NamedObject <em>Named Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Object</em>'.
	 * @see org.limepepper.chefclipse.utility.NamedObject
	 * @generated
	 */
	EClass getNamedObject();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.NamedObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.limepepper.chefclipse.utility.NamedObject#getName()
	 * @see #getNamedObject()
	 * @generated
	 */
	EAttribute getNamedObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.NamedObject#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.limepepper.chefclipse.utility.NamedObject#getID()
	 * @see #getNamedObject()
	 * @generated
	 */
	EAttribute getNamedObject_ID();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.DescribedObject <em>Described Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described Object</em>'.
	 * @see org.limepepper.chefclipse.utility.DescribedObject
	 * @generated
	 */
	EClass getDescribedObject();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.DescribedObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.limepepper.chefclipse.utility.DescribedObject#getDescription()
	 * @see #getDescribedObject()
	 * @generated
	 */
	EAttribute getDescribedObject_Description();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.ChecksumFile <em>Checksum File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checksum File</em>'.
	 * @see org.limepepper.chefclipse.utility.ChecksumFile
	 * @generated
	 */
	EClass getChecksumFile();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.ChecksumFile#getChecksum <em>Checksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checksum</em>'.
	 * @see org.limepepper.chefclipse.utility.ChecksumFile#getChecksum()
	 * @see #getChecksumFile()
	 * @generated
	 */
	EAttribute getChecksumFile_Checksum();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.MaintainedObject <em>Maintained Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintained Object</em>'.
	 * @see org.limepepper.chefclipse.utility.MaintainedObject
	 * @generated
	 */
	EClass getMaintainedObject();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.MaintainedObject#getMaintainer <em>Maintainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintainer</em>'.
	 * @see org.limepepper.chefclipse.utility.MaintainedObject#getMaintainer()
	 * @see #getMaintainedObject()
	 * @generated
	 */
	EAttribute getMaintainedObject_Maintainer();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.MaintainedObject#getMaintainer_email <em>Maintainer email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maintainer email</em>'.
	 * @see org.limepepper.chefclipse.utility.MaintainedObject#getMaintainer_email()
	 * @see #getMaintainedObject()
	 * @generated
	 */
	EAttribute getMaintainedObject_Maintainer_email();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.MaintainedObject#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see org.limepepper.chefclipse.utility.MaintainedObject#getLicense()
	 * @see #getMaintainedObject()
	 * @generated
	 */
	EAttribute getMaintainedObject_License();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.limepepper.chefclipse.utility.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.Config#getChef_server_url <em>Chef server url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chef server url</em>'.
	 * @see org.limepepper.chefclipse.utility.Config#getChef_server_url()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Chef_server_url();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.Config#getClient_key <em>Client key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client key</em>'.
	 * @see org.limepepper.chefclipse.utility.Config#getClient_key()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Client_key();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.Config#getNode_name <em>Node name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node name</em>'.
	 * @see org.limepepper.chefclipse.utility.Config#getNode_name()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Node_name();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.Config#getLog_level <em>Log level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log level</em>'.
	 * @see org.limepepper.chefclipse.utility.Config#getLog_level()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Log_level();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.Config#getValidation_key <em>Validation key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation key</em>'.
	 * @see org.limepepper.chefclipse.utility.Config#getValidation_key()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Validation_key();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.Config#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.limepepper.chefclipse.utility.Config#getVersion()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.Config#getValidation_client_name <em>Validation client name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation client name</em>'.
	 * @see org.limepepper.chefclipse.utility.Config#getValidation_client_name()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Validation_client_name();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.NameUrlMap <em>Name Url Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Url Map</em>'.
	 * @see org.limepepper.chefclipse.utility.NameUrlMap
	 * @generated
	 */
	EClass getNameUrlMap();

	/**
	 * Returns the meta object for the map '{@link org.limepepper.chefclipse.utility.NameUrlMap#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Entries</em>'.
	 * @see org.limepepper.chefclipse.utility.NameUrlMap#getEntries()
	 * @see #getNameUrlMap()
	 * @generated
	 */
	EReference getNameUrlMap_Entries();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.MapTestContainer <em>Map Test Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Test Container</em>'.
	 * @see org.limepepper.chefclipse.utility.MapTestContainer
	 * @generated
	 */
	EClass getMapTestContainer();

	/**
	 * Returns the meta object for the attribute list '{@link org.limepepper.chefclipse.utility.MapTestContainer#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entries</em>'.
	 * @see org.limepepper.chefclipse.utility.MapTestContainer#getEntries()
	 * @see #getMapTestContainer()
	 * @generated
	 */
	EAttribute getMapTestContainer_Entries();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To Version Url Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To Version Url Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueType="org.limepepper.chefclipse.utility.VersionUrl" valueRequired="true"
	 * @generated
	 */
	EClass getEStringToVersionUrlMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToVersionUrlMap()
	 * @generated
	 */
	EAttribute getEStringToVersionUrlMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToVersionUrlMap()
	 * @generated
	 */
	EReference getEStringToVersionUrlMap_Value();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.VersionUrl <em>Version Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Url</em>'.
	 * @see org.limepepper.chefclipse.utility.VersionUrl
	 * @generated
	 */
	EClass getVersionUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.VersionUrl#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.limepepper.chefclipse.utility.VersionUrl#getUrl()
	 * @see #getVersionUrl()
	 * @generated
	 */
	EAttribute getVersionUrl_Url();

	/**
	 * Returns the meta object for the reference list '{@link org.limepepper.chefclipse.utility.VersionUrl#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Versions</em>'.
	 * @see org.limepepper.chefclipse.utility.VersionUrl#getVersions()
	 * @see #getVersionUrl()
	 * @generated
	 */
	EReference getVersionUrl_Versions();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.URLEntryTest <em>URL Entry Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Entry Test</em>'.
	 * @see org.limepepper.chefclipse.utility.URLEntryTest
	 * @generated
	 */
	EClass getURLEntryTest();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.URLEntryTest#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.limepepper.chefclipse.utility.URLEntryTest#getUrl()
	 * @see #getURLEntryTest()
	 * @generated
	 */
	EAttribute getURLEntryTest_Url();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.NameVersionMap <em>Name Version Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Version Map</em>'.
	 * @see org.limepepper.chefclipse.utility.NameVersionMap
	 * @generated
	 */
	EClass getNameVersionMap();

	/**
	 * Returns the meta object for the map '{@link org.limepepper.chefclipse.utility.NameVersionMap#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Entries</em>'.
	 * @see org.limepepper.chefclipse.utility.NameVersionMap#getEntries()
	 * @see #getNameVersionMap()
	 * @generated
	 */
	EReference getNameVersionMap_Entries();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.IdentObject <em>Ident Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ident Object</em>'.
	 * @see org.limepepper.chefclipse.utility.IdentObject
	 * @generated
	 */
	EClass getIdentObject();

	/**
	 * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.utility.IdentObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.limepepper.chefclipse.utility.IdentObject#getId()
	 * @see #getIdentObject()
	 * @generated
	 */
	EAttribute getIdentObject_Id();

	/**
	 * Returns the meta object for class '{@link org.limepepper.chefclipse.utility.JsonObject <em>Json Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Object</em>'.
	 * @see org.limepepper.chefclipse.utility.JsonObject
	 * @generated
	 */
	EClass getJsonObject();

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
	 * Returns the meta object for data type '{@link java.util.HashMap <em>Map Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map Test</em>'.
	 * @see java.util.HashMap
	 * @model instanceClass="java.util.HashMap"
	 * @generated
	 */
	EDataType getMapTest();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IResource <em>IResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IResource</em>'.
	 * @see org.eclipse.core.resources.IResource
	 * @model instanceClass="org.eclipse.core.resources.IResource"
	 * @generated
	 */
	EDataType getIResource();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>EInput Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInput Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream" serializeable="false"
	 * @generated
	 */
	EDataType getEInputStream();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilityFactory getUtilityFactory();

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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.NamedDescribedObject <em>Named Described Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.NamedDescribedObject
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getNamedDescribedObject()
		 * @generated
		 */
		EClass NAMED_DESCRIBED_OBJECT = eINSTANCE.getNamedDescribedObject();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.VersionedObjectImpl <em>Versioned Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.VersionedObjectImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getVersionedObject()
		 * @generated
		 */
		EClass VERSIONED_OBJECT = eINSTANCE.getVersionedObject();

		/**
		 * The meta object literal for the '<em><b>NUM VERSIONS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_OBJECT__NUM_VERSIONS = eINSTANCE
				.getVersionedObject_NUM_VERSIONS();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_OBJECT__VERSION = eINSTANCE
				.getVersionedObject_Version();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.SandboxedObjectImpl <em>Sandboxed Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.SandboxedObjectImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getSandboxedObject()
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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.RubyFileImpl <em>Ruby File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.RubyFileImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getRubyFile()
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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.NamedObjectImpl <em>Named Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.NamedObjectImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getNamedObject()
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
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.DescribedObjectImpl <em>Described Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.DescribedObjectImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getDescribedObject()
		 * @generated
		 */
		EClass DESCRIBED_OBJECT = eINSTANCE.getDescribedObject();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED_OBJECT__DESCRIPTION = eINSTANCE
				.getDescribedObject_Description();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.ChecksumFileImpl <em>Checksum File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.ChecksumFileImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getChecksumFile()
		 * @generated
		 */
		EClass CHECKSUM_FILE = eINSTANCE.getChecksumFile();

		/**
		 * The meta object literal for the '<em><b>Checksum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKSUM_FILE__CHECKSUM = eINSTANCE
				.getChecksumFile_Checksum();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.MaintainedObjectImpl <em>Maintained Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.MaintainedObjectImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getMaintainedObject()
		 * @generated
		 */
		EClass MAINTAINED_OBJECT = eINSTANCE.getMaintainedObject();

		/**
		 * The meta object literal for the '<em><b>Maintainer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTAINED_OBJECT__MAINTAINER = eINSTANCE
				.getMaintainedObject_Maintainer();

		/**
		 * The meta object literal for the '<em><b>Maintainer email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTAINED_OBJECT__MAINTAINER_EMAIL = eINSTANCE
				.getMaintainedObject_Maintainer_email();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAINTAINED_OBJECT__LICENSE = eINSTANCE
				.getMaintainedObject_License();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.ConfigImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Chef server url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__CHEF_SERVER_URL = eINSTANCE
				.getConfig_Chef_server_url();

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
		EAttribute CONFIG__VALIDATION_KEY = eINSTANCE
				.getConfig_Validation_key();

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
		EAttribute CONFIG__VALIDATION_CLIENT_NAME = eINSTANCE
				.getConfig_Validation_client_name();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.NameUrlMapImpl <em>Name Url Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.NameUrlMapImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getNameUrlMap()
		 * @generated
		 */
		EClass NAME_URL_MAP = eINSTANCE.getNameUrlMap();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_URL_MAP__ENTRIES = eINSTANCE.getNameUrlMap_Entries();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.MapTestContainerImpl <em>Map Test Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.MapTestContainerImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getMapTestContainer()
		 * @generated
		 */
		EClass MAP_TEST_CONTAINER = eINSTANCE.getMapTestContainer();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_TEST_CONTAINER__ENTRIES = eINSTANCE
				.getMapTestContainer_Entries();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.EStringToVersionUrlMapImpl <em>EString To Version Url Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.EStringToVersionUrlMapImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getEStringToVersionUrlMap()
		 * @generated
		 */
		EClass ESTRING_TO_VERSION_URL_MAP = eINSTANCE
				.getEStringToVersionUrlMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_VERSION_URL_MAP__KEY = eINSTANCE
				.getEStringToVersionUrlMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRING_TO_VERSION_URL_MAP__VALUE = eINSTANCE
				.getEStringToVersionUrlMap_Value();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.VersionUrlImpl <em>Version Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.VersionUrlImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getVersionUrl()
		 * @generated
		 */
		EClass VERSION_URL = eINSTANCE.getVersionUrl();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_URL__URL = eINSTANCE.getVersionUrl_Url();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_URL__VERSIONS = eINSTANCE.getVersionUrl_Versions();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.URLEntryTestImpl <em>URL Entry Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.URLEntryTestImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getURLEntryTest()
		 * @generated
		 */
		EClass URL_ENTRY_TEST = eINSTANCE.getURLEntryTest();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_ENTRY_TEST__URL = eINSTANCE.getURLEntryTest_Url();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.NameVersionMapImpl <em>Name Version Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.NameVersionMapImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getNameVersionMap()
		 * @generated
		 */
		EClass NAME_VERSION_MAP = eINSTANCE.getNameVersionMap();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_VERSION_MAP__ENTRIES = eINSTANCE
				.getNameVersionMap_Entries();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.IdentObjectImpl <em>Ident Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.IdentObjectImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getIdentObject()
		 * @generated
		 */
		EClass IDENT_OBJECT = eINSTANCE.getIdentObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENT_OBJECT__ID = eINSTANCE.getIdentObject_Id();

		/**
		 * The meta object literal for the '{@link org.limepepper.chefclipse.utility.impl.JsonObjectImpl <em>Json Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.limepepper.chefclipse.utility.impl.JsonObjectImpl
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getJsonObject()
		 * @generated
		 */
		EClass JSON_OBJECT = eINSTANCE.getJsonObject();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em>Chef type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getChef_type()
		 * @generated
		 */
		EDataType CHEF_TYPE = eINSTANCE.getChef_type();

		/**
		 * The meta object literal for the '<em>Email</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getEmail()
		 * @generated
		 */
		EDataType EMAIL = eINSTANCE.getEmail();

		/**
		 * The meta object literal for the '<em>Text</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getText()
		 * @generated
		 */
		EDataType TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em>Name</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getName_()
		 * @generated
		 */
		EDataType NAME = eINSTANCE.getName_();

		/**
		 * The meta object literal for the '<em>Description</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getDescription()
		 * @generated
		 */
		EDataType DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em>Name Url Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getNameUrlDataType()
		 * @generated
		 */
		EDataType NAME_URL_DATA_TYPE = eINSTANCE.getNameUrlDataType();

		/**
		 * The meta object literal for the '<em>Map Test</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashMap
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getMapTest()
		 * @generated
		 */
		EDataType MAP_TEST = eINSTANCE.getMapTest();

		/**
		 * The meta object literal for the '<em>IResource</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IResource
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getIResource()
		 * @generated
		 */
		EDataType IRESOURCE = eINSTANCE.getIResource();

		/**
		 * The meta object literal for the '<em>EInput Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see org.limepepper.chefclipse.utility.impl.UtilityPackageImpl#getEInputStream()
		 * @generated
		 */
		EDataType EINPUT_STREAM = eINSTANCE.getEInputStream();

	}

} //UtilityPackage
