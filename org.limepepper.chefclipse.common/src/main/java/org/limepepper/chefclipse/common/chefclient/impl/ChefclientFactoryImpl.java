/**
 */
package org.limepepper.chefclipse.common.chefclient.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.limepepper.chefclipse.common.chefclient.*;
import org.limepepper.chefclipse.common.chefclient.ChefclientFactory;
import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;
import org.limepepper.chefclipse.common.chefclient.Client;
import org.limepepper.chefclipse.common.chefclient.ClientConfig;
import org.limepepper.chefclipse.common.chefclient.Ohai;
import org.limepepper.chefclipse.common.chefclient.Search;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChefclientFactoryImpl extends EFactoryImpl implements ChefclientFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ChefclientFactory init() {
        try {
            ChefclientFactory theChefclientFactory = (ChefclientFactory)EPackage.Registry.INSTANCE.getEFactory("http://limepepper.org/v1/chefclipse/chefclient"); 
            if (theChefclientFactory != null) {
                return theChefclientFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ChefclientFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefclientFactoryImpl() {
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
            case ChefclientPackage.CLIENT: return createClient();
            case ChefclientPackage.OHAI: return createOhai();
            case ChefclientPackage.SEARCH: return createSearch();
            case ChefclientPackage.CLIENT_CONFIG: return createClientConfig();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Client createClient() {
        ClientImpl client = new ClientImpl();
        return client;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Ohai createOhai() {
        OhaiImpl ohai = new OhaiImpl();
        return ohai;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Search createSearch() {
        SearchImpl search = new SearchImpl();
        return search;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClientConfig createClientConfig() {
        ClientConfigImpl clientConfig = new ClientConfigImpl();
        return clientConfig;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChefclientPackage getChefclientPackage() {
        return (ChefclientPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ChefclientPackage getPackage() {
        return ChefclientPackage.eINSTANCE;
    }

} //ChefclientFactoryImpl
