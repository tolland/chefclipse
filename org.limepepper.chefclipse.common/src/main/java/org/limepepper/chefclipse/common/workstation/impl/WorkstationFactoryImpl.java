/**
 */
package org.limepepper.chefclipse.common.workstation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.limepepper.chefclipse.common.workstation.*;
import org.limepepper.chefclipse.common.workstation.CertificatesFolder;
import org.limepepper.chefclipse.common.workstation.ConfigFolder;
import org.limepepper.chefclipse.common.workstation.DataBagsFolder;
import org.limepepper.chefclipse.common.workstation.EnvironmentsFolder;
import org.limepepper.chefclipse.common.workstation.Rakefile;
import org.limepepper.chefclipse.common.workstation.Repository;
import org.limepepper.chefclipse.common.workstation.RolesFolder;
import org.limepepper.chefclipse.common.workstation.WorkstationFactory;
import org.limepepper.chefclipse.common.workstation.WorkstationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkstationFactoryImpl extends EFactoryImpl implements WorkstationFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static WorkstationFactory init() {
        try {
            WorkstationFactory theWorkstationFactory = (WorkstationFactory)EPackage.Registry.INSTANCE.getEFactory("http://limepepper.org/chefclipse/1.0.0/workstation"); 
            if (theWorkstationFactory != null) {
                return theWorkstationFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new WorkstationFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkstationFactoryImpl() {
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
            case WorkstationPackage.REPOSITORY: return createRepository();
            case WorkstationPackage.CONFIG_FOLDER: return createConfigFolder();
            case WorkstationPackage.CERTIFICATES_FOLDER: return createCertificatesFolder();
            case WorkstationPackage.DATA_BAGS_FOLDER: return createDataBagsFolder();
            case WorkstationPackage.ENVIRONMENTS_FOLDER: return createEnvironmentsFolder();
            case WorkstationPackage.ROLES_FOLDER: return createRolesFolder();
            case WorkstationPackage.RAKEFILE: return createRakefile();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Repository createRepository() {
        RepositoryImpl repository = new RepositoryImpl();
        return repository;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigFolder createConfigFolder() {
        ConfigFolderImpl configFolder = new ConfigFolderImpl();
        return configFolder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CertificatesFolder createCertificatesFolder() {
        CertificatesFolderImpl certificatesFolder = new CertificatesFolderImpl();
        return certificatesFolder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataBagsFolder createDataBagsFolder() {
        DataBagsFolderImpl dataBagsFolder = new DataBagsFolderImpl();
        return dataBagsFolder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnvironmentsFolder createEnvironmentsFolder() {
        EnvironmentsFolderImpl environmentsFolder = new EnvironmentsFolderImpl();
        return environmentsFolder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RolesFolder createRolesFolder() {
        RolesFolderImpl rolesFolder = new RolesFolderImpl();
        return rolesFolder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Rakefile createRakefile() {
        RakefileImpl rakefile = new RakefileImpl();
        return rakefile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkstationPackage getWorkstationPackage() {
        return (WorkstationPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static WorkstationPackage getPackage() {
        return WorkstationPackage.eINSTANCE;
    }

} //WorkstationFactoryImpl
