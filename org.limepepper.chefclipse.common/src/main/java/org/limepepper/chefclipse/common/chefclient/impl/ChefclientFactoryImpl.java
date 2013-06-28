/**
 */
package org.limepepper.chefclipse.common.chefclient.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.chefclient.*;
import org.limepepper.chefclipse.common.chefclient.ChefClient;
import org.limepepper.chefclipse.common.chefclient.ChefclientFactory;
import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;
=======
import org.limepepper.chefclipse.common.chefclient.ChefclientFactory;
import org.limepepper.chefclipse.common.chefclient.ChefclientPackage;
import org.limepepper.chefclipse.common.chefclient.Client;
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.chefclient.ClientConfig;
import org.limepepper.chefclipse.common.chefclient.Ohai;
import org.limepepper.chefclipse.common.chefclient.Search;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
<<<<<<< HEAD
public class ChefclientFactoryImpl extends EFactoryImpl implements
		ChefclientFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChefclientFactory init() {
		try {
			ChefclientFactory theChefclientFactory = (ChefclientFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://limepepper.org/v1/chefclipse/chefclient");
			if (theChefclientFactory != null) {
				return theChefclientFactory;
			}
		} catch (Exception exception) {
=======
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
>>>>>>> origin/tomhodder
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChefclientFactoryImpl();
	}

<<<<<<< HEAD
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
		case ChefclientPackage.CHEF_CLIENT:
			return createChefClient();
		case ChefclientPackage.OHAI:
			return createOhai();
		case ChefclientPackage.SEARCH:
			return createSearch();
		case ChefclientPackage.CLIENT_CONFIG:
			return createClientConfig();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefClient createChefClient() {
		ChefClientImpl chefClient = new ChefClientImpl();
		return chefClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ohai createOhai() {
=======
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
>>>>>>> origin/tomhodder
		OhaiImpl ohai = new OhaiImpl();
		return ohai;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Search createSearch() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Search createSearch() {
>>>>>>> origin/tomhodder
		SearchImpl search = new SearchImpl();
		return search;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientConfig createClientConfig() {
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ClientConfig createClientConfig() {
>>>>>>> origin/tomhodder
		ClientConfigImpl clientConfig = new ClientConfigImpl();
		return clientConfig;
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefclientPackage getChefclientPackage() {
		return (ChefclientPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChefclientPackage getPackage() {
=======
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
>>>>>>> origin/tomhodder
		return ChefclientPackage.eINSTANCE;
	}

} //ChefclientFactoryImpl
