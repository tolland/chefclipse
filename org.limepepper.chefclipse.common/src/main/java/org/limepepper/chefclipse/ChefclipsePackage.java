/**
 */
package org.limepepper.chefclipse;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_DESCRIBED_OBJECT__NAME = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_DESCRIBED_OBJECT__DESCRIPTION = 1;

    /**
     * The number of structural features of the '<em>Named Described Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_DESCRIBED_OBJECT_FEATURE_COUNT = 2;

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
     * The feature id for the '<em><b>NUM VERSIONS</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_OBJECT__NUM_VERSIONS = 0;

    /**
     * The number of structural features of the '<em>Versioned Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VERSIONED_OBJECT_FEATURE_COUNT = 1;

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
     * The number of structural features of the '<em>Sandboxed Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SANDBOXED_OBJECT_FEATURE_COUNT = 0;

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
     * The meta object id for the '{@link org.limepepper.chefclipse.impl.NamedObjectImpl <em>Named Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.impl.NamedObjectImpl
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getNamedObject()
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
     * The number of structural features of the '<em>Named Object</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_OBJECT_FEATURE_COUNT = 1;

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
     * The meta object id for the '{@link org.limepepper.chefclipse.impl.ChecksumFileImpl <em>Checksum File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.limepepper.chefclipse.impl.ChecksumFileImpl
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getChecksumFile()
     * @generated
     */
    int CHECKSUM_FILE = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKSUM_FILE__NAME = NAMED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Checksum</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKSUM_FILE__CHECKSUM = NAMED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKSUM_FILE__PATH = NAMED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Specificity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKSUM_FILE__SPECIFICITY = NAMED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Url</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKSUM_FILE__URL = NAMED_OBJECT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Checksum File</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CHECKSUM_FILE_FEATURE_COUNT = NAMED_OBJECT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '<em>URL</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.net.URL
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getURL()
     * @generated
     */
    int URL = 7;

    /**
     * The meta object id for the '<em>File</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.io.File
     * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getFile()
     * @generated
     */
    int FILE = 8;


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
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.NamedDescribedObject#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.limepepper.chefclipse.NamedDescribedObject#getName()
     * @see #getNamedDescribedObject()
     * @generated
     */
    EAttribute getNamedDescribedObject_Name();

    /**
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.NamedDescribedObject#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.limepepper.chefclipse.NamedDescribedObject#getDescription()
     * @see #getNamedDescribedObject()
     * @generated
     */
    EAttribute getNamedDescribedObject_Description();

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
     * Returns the meta object for class '{@link org.limepepper.chefclipse.SandboxedObject <em>Sandboxed Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sandboxed Object</em>'.
     * @see org.limepepper.chefclipse.SandboxedObject
     * @generated
     */
    EClass getSandboxedObject();

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
     * Returns the meta object for the attribute '{@link org.limepepper.chefclipse.ChecksumFile#getUrl <em>Url</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Url</em>'.
     * @see org.limepepper.chefclipse.ChecksumFile#getUrl()
     * @see #getChecksumFile()
     * @generated
     */
    EAttribute getChecksumFile_Url();

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
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_DESCRIBED_OBJECT__NAME = eINSTANCE.getNamedDescribedObject_Name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_DESCRIBED_OBJECT__DESCRIPTION = eINSTANCE.getNamedDescribedObject_Description();

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
         * The meta object literal for the '{@link org.limepepper.chefclipse.impl.SandboxedObjectImpl <em>Sandboxed Object</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.limepepper.chefclipse.impl.SandboxedObjectImpl
         * @see org.limepepper.chefclipse.impl.ChefclipsePackageImpl#getSandboxedObject()
         * @generated
         */
        EClass SANDBOXED_OBJECT = eINSTANCE.getSandboxedObject();

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
         * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CHECKSUM_FILE__URL = eINSTANCE.getChecksumFile_Url();

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

    }

} //ChefclipsePackage
