/**
 */
package org.limepepper.chefclipse.impl;

import java.io.File;
import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.limepepper.chefclipse.*;
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.ChefclipseFactory;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.DescribedObject;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.RubyFile;
import org.limepepper.chefclipse.SandboxedObject;
import org.limepepper.chefclipse.VersionedObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChefclipseFactoryImpl extends EFactoryImpl implements ChefclipseFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ChefclipseFactory init() {
        try {
            ChefclipseFactory theChefclipseFactory = (ChefclipseFactory)EPackage.Registry.INSTANCE.getEFactory("http://limepepper.org/v1/chefclipse/"); 
            if (theChefclipseFactory != null) {
                return theChefclipseFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ChefclipseFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefclipseFactoryImpl() {
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
            case ChefclipsePackage.VERSIONED_OBJECT: return createVersionedObject();
            case ChefclipsePackage.SANDBOXED_OBJECT: return createSandboxedObject();
            case ChefclipsePackage.RUBY_FILE: return createRubyFile();
            case ChefclipsePackage.NAMED_OBJECT: return createNamedObject();
            case ChefclipsePackage.DESCRIBED_OBJECT: return createDescribedObject();
            case ChefclipsePackage.CHECKSUM_FILE: return createChecksumFile();
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
            case ChefclipsePackage.URL:
                return createURLFromString(eDataType, initialValue);
            case ChefclipsePackage.FILE:
                return createFileFromString(eDataType, initialValue);
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
            case ChefclipsePackage.URL:
                return convertURLToString(eDataType, instanceValue);
            case ChefclipsePackage.FILE:
                return convertFileToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VersionedObject createVersionedObject() {
        VersionedObjectImpl versionedObject = new VersionedObjectImpl();
        return versionedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SandboxedObject createSandboxedObject() {
        SandboxedObjectImpl sandboxedObject = new SandboxedObjectImpl();
        return sandboxedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RubyFile createRubyFile() {
        RubyFileImpl rubyFile = new RubyFileImpl();
        return rubyFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedObject createNamedObject() {
        NamedObjectImpl namedObject = new NamedObjectImpl();
        return namedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DescribedObject createDescribedObject() {
        DescribedObjectImpl describedObject = new DescribedObjectImpl();
        return describedObject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChecksumFile createChecksumFile() {
        ChecksumFileImpl checksumFile = new ChecksumFileImpl();
        return checksumFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public URL createURLFromString(EDataType eDataType, String initialValue) {
        return (URL)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertURLToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public File createFileFromString(EDataType eDataType, String initialValue) {
        return (File)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFileToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefclipsePackage getChefclipsePackage() {
        return (ChefclipsePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ChefclipsePackage getPackage() {
        return ChefclipsePackage.eINSTANCE;
    }

} //ChefclipseFactoryImpl
