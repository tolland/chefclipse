/**
 */
package org.limepepper.chefclipse;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.ChefclipsePackage
 * @generated
 */
public interface ChefclipseFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ChefclipseFactory eINSTANCE = org.limepepper.chefclipse.impl.ChefclipseFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Versioned Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Versioned Object</em>'.
     * @generated
     */
    VersionedObject createVersionedObject();

    /**
     * Returns a new object of class '<em>Sandboxed Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sandboxed Object</em>'.
     * @generated
     */
    SandboxedObject createSandboxedObject();

    /**
     * Returns a new object of class '<em>Ruby File</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ruby File</em>'.
     * @generated
     */
    RubyFile createRubyFile();

    /**
     * Returns a new object of class '<em>Named Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Named Object</em>'.
     * @generated
     */
    NamedObject createNamedObject();

    /**
     * Returns a new object of class '<em>Described Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Described Object</em>'.
     * @generated
     */
    DescribedObject createDescribedObject();

    /**
     * Returns a new object of class '<em>Checksum File</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Checksum File</em>'.
     * @generated
     */
    ChecksumFile createChecksumFile();

    /**
     * Returns a new object of class '<em>Maintained Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Maintained Object</em>'.
     * @generated
     */
    MaintainedObject createMaintainedObject();

    /**
     * Returns a new object of class '<em>Config</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Config</em>'.
     * @generated
     */
    Config createConfig();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ChefclipsePackage getChefclipsePackage();

} //ChefclipseFactory