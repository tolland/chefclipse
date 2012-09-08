/**
 */
package org.limepepper.chefclipse.chefserver.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.limepepper.chefclipse.chefserver.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChefFactoryImpl extends EFactoryImpl implements ChefFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChefFactory init() {
		try {
			ChefFactory theChefFactory = (ChefFactory)EPackage.Registry.INSTANCE.getEFactory("http://limepepper.org/chefclipse/0.0.1/chefserver"); 
			if (theChefFactory != null) {
				return theChefFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChefFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefFactoryImpl() {
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
			case ChefPackage.ENVIRONMENT: return createEnvironment();
			case ChefPackage.DATA_BAG: return createDataBag();
			case ChefPackage.ROLE: return createRole();
			case ChefPackage.NODE: return createNode();
			case ChefPackage.SERVER: return createServer();
			case ChefPackage.OHAI: return createOhai();
			case ChefPackage.PLATFORM: return createPlatform();
			case ChefPackage.RUN_LIST: return createRunList();
			case ChefPackage.CHEF_CONFIG: return createChefConfig();
			case ChefPackage.SEARCH: return createSearch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBag createDataBag() {
		DataBagImpl dataBag = new DataBagImpl();
		return dataBag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
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
	public Platform createPlatform() {
		PlatformImpl platform = new PlatformImpl();
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunList createRunList() {
		RunListImpl runList = new RunListImpl();
		return runList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefConfig createChefConfig() {
		ChefConfigImpl chefConfig = new ChefConfigImpl();
		return chefConfig;
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
	public ChefPackage getChefPackage() {
		return (ChefPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChefPackage getPackage() {
		return ChefPackage.eINSTANCE;
	}

} //ChefFactoryImpl
