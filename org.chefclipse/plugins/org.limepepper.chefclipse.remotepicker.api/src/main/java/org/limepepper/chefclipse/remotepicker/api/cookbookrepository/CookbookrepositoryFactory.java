/**
 */
package org.limepepper.chefclipse.remotepicker.api.cookbookrepository;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryPackage
 * @generated
 */
public class CookbookrepositoryFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CookbookrepositoryFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CookbookrepositoryFactory init() {
		try {
			CookbookrepositoryFactory theCookbookrepositoryFactory = (CookbookrepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(CookbookrepositoryPackage.eNS_URI);
			if (theCookbookrepositoryFactory != null) {
				return theCookbookrepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CookbookrepositoryFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbookrepositoryFactory() {
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
			case CookbookrepositoryPackage.REMOTE_REPOSITORY: return createRemoteRepository();
			case CookbookrepositoryPackage.REMOTE_COOKBOOK: return createRemoteCookbook();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteRepository createRemoteRepository() {
		RemoteRepository remoteRepository = new RemoteRepository();
		return remoteRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoteCookbook createRemoteCookbook() {
		RemoteCookbook remoteCookbook = new RemoteCookbook();
		return remoteCookbook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CookbookrepositoryPackage getCookbookrepositoryPackage() {
		return (CookbookrepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CookbookrepositoryPackage getPackage() {
		return CookbookrepositoryPackage.eINSTANCE;
	}

} //CookbookrepositoryFactory
