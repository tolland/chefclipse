/**
 */
package org.limepepper.chefclipse.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.*;
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.Config;
import org.limepepper.chefclipse.DescribedObject;
import org.limepepper.chefclipse.MaintainedObject;
import org.limepepper.chefclipse.NamedDescribedObject;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.RubyFile;
import org.limepepper.chefclipse.SandboxedObject;
import org.limepepper.chefclipse.VersionedObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.ChefclipsePackage
 * @generated
 */
public class ChefclipseAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ChefclipsePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefclipseAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ChefclipsePackage.eINSTANCE;
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
    protected ChefclipseSwitch<Adapter> modelSwitch =
        new ChefclipseSwitch<Adapter>() {
            @Override
            public Adapter caseNamedDescribedObject(NamedDescribedObject object) {
                return createNamedDescribedObjectAdapter();
            }
            @Override
            public Adapter caseVersionedObject(VersionedObject object) {
                return createVersionedObjectAdapter();
            }
            @Override
            public Adapter caseSandboxedObject(SandboxedObject object) {
                return createSandboxedObjectAdapter();
            }
            @Override
            public Adapter caseRubyFile(RubyFile object) {
                return createRubyFileAdapter();
            }
            @Override
            public Adapter caseNamedObject(NamedObject object) {
                return createNamedObjectAdapter();
            }
            @Override
            public Adapter caseDescribedObject(DescribedObject object) {
                return createDescribedObjectAdapter();
            }
            @Override
            public Adapter caseChecksumFile(ChecksumFile object) {
                return createChecksumFileAdapter();
            }
            @Override
            public Adapter caseMaintainedObject(MaintainedObject object) {
                return createMaintainedObjectAdapter();
            }
            @Override
            public Adapter caseConfig(Config object) {
                return createConfigAdapter();
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
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.VersionedObject <em>Versioned Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.VersionedObject
     * @generated
     */
    public Adapter createVersionedObjectAdapter() {
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
     * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.Config <em>Config</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.limepepper.chefclipse.Config
     * @generated
     */
    public Adapter createConfigAdapter() {
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

} //ChefclipseAdapterFactory
