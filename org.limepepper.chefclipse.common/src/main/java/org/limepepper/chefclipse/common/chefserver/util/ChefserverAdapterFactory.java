/**
 */
package org.limepepper.chefclipse.common.chefserver.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.chefserver.*;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.Client;
import org.limepepper.chefclipse.common.chefserver.CookbookListResp;
import org.limepepper.chefclipse.common.chefserver.CookbookListVersionResp;
=======
import org.limepepper.chefclipse.ChecksumFile;
import org.limepepper.chefclipse.DescribedObject;
import org.limepepper.chefclipse.NamedDescribedObject;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.SandboxedObject;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.CookbookListResp;
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.chefserver.DataBag;
import org.limepepper.chefclipse.common.chefserver.DataBagItem;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Node;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.chefserver.Organization;
=======
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.chefserver.Platform;
import org.limepepper.chefclipse.common.chefserver.Role;
import org.limepepper.chefclipse.common.chefserver.RunList;
import org.limepepper.chefclipse.common.chefserver.RunListItem;
import org.limepepper.chefclipse.common.chefserver.Sandbox;
import org.limepepper.chefclipse.common.chefserver.Server;
import org.limepepper.chefclipse.common.chefserver.ServerConfig;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;
import org.limepepper.chefclipse.common.cookbook.Cookbook;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.cookbook.CookbookFile;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
import org.limepepper.chefclipse.utility.ChecksumFile;
import org.limepepper.chefclipse.utility.DescribedObject;
import org.limepepper.chefclipse.utility.IdentObject;
import org.limepepper.chefclipse.utility.JsonObject;
import org.limepepper.chefclipse.utility.NamedDescribedObject;
import org.limepepper.chefclipse.utility.NamedObject;
import org.limepepper.chefclipse.utility.SandboxedObject;
=======
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.common.chefserver.ChefserverPackage
 * @generated
 */
public class ChefserverAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChefserverPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefserverAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ChefserverPackage.eINSTANCE;
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
<<<<<<< HEAD
			return ((EObject) object).eClass().getEPackage() == modelPackage;
=======
			return ((EObject)object).eClass().getEPackage() == modelPackage;
>>>>>>> origin/tomhodder
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
<<<<<<< HEAD
	protected ChefserverSwitch<Adapter> modelSwitch = new ChefserverSwitch<Adapter>() {
		@Override
		public Adapter caseEnvironment(Environment object) {
			return createEnvironmentAdapter();
		}

		@Override
		public Adapter caseDataBag(DataBag object) {
			return createDataBagAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseServer(Server object) {
			return createServerAdapter();
		}

		@Override
		public Adapter casePlatform(Platform object) {
			return createPlatformAdapter();
		}

		@Override
		public Adapter caseRunList(RunList object) {
			return createRunListAdapter();
		}

		@Override
		public Adapter caseServerConfig(ServerConfig object) {
			return createServerConfigAdapter();
		}

		@Override
		public Adapter caseDataBagItem(DataBagItem object) {
			return createDataBagItemAdapter();
		}

		@Override
		public Adapter caseSandbox(Sandbox object) {
			return createSandboxAdapter();
		}

		@Override
		public Adapter caseCookbookListVersionResp(
				CookbookListVersionResp object) {
			return createCookbookListVersionRespAdapter();
		}

		@Override
		public Adapter caseCookbookListResp(CookbookListResp object) {
			return createCookbookListRespAdapter();
		}

		@Override
		public Adapter caseServerCookbookFile(ServerCookbookFile object) {
			return createServerCookbookFileAdapter();
		}

		@Override
		public Adapter caseServerCookbookVersion(ServerCookbookVersion object) {
			return createServerCookbookVersionAdapter();
		}

		@Override
		public Adapter caseRunListItem(RunListItem object) {
			return createRunListItemAdapter();
		}

		@Override
		public Adapter caseClient(Client object) {
			return createClientAdapter();
		}

		@Override
		public Adapter caseOrganization(Organization object) {
			return createOrganizationAdapter();
		}

		@Override
		public Adapter caseDescribedObject(DescribedObject object) {
			return createDescribedObjectAdapter();
		}

		@Override
		public Adapter caseNamedObject(NamedObject object) {
			return createNamedObjectAdapter();
		}

		@Override
		public Adapter caseNamedDescribedObject(NamedDescribedObject object) {
			return createNamedDescribedObjectAdapter();
		}

		@Override
		public Adapter caseIdentObject(IdentObject object) {
			return createIdentObjectAdapter();
		}

		@Override
		public Adapter caseJsonObject(JsonObject object) {
			return createJsonObjectAdapter();
		}

		@Override
		public Adapter caseSandboxedObject(SandboxedObject object) {
			return createSandboxedObjectAdapter();
		}

		@Override
		public Adapter caseChecksumFile(ChecksumFile object) {
			return createChecksumFileAdapter();
		}

		@Override
		public Adapter caseCookbookFile(CookbookFile object) {
			return createCookbookFileAdapter();
		}

		@Override
		public Adapter caseCookbook(Cookbook object) {
			return createCookbookAdapter();
		}

		@Override
		public Adapter caseCookbookVersion(CookbookVersion object) {
			return createCookbookVersionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};
=======
	protected ChefserverSwitch<Adapter> modelSwitch =
		new ChefserverSwitch<Adapter>() {
			@Override
			public Adapter caseEnvironment(Environment object) {
				return createEnvironmentAdapter();
			}
			@Override
			public Adapter caseDataBag(DataBag object) {
				return createDataBagAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter casePlatform(Platform object) {
				return createPlatformAdapter();
			}
			@Override
			public Adapter caseRunList(RunList object) {
				return createRunListAdapter();
			}
			@Override
			public Adapter caseServerConfig(ServerConfig object) {
				return createServerConfigAdapter();
			}
			@Override
			public Adapter caseDataBagItem(DataBagItem object) {
				return createDataBagItemAdapter();
			}
			@Override
			public Adapter caseSandbox(Sandbox object) {
				return createSandboxAdapter();
			}
			@Override
			public Adapter caseCookbookListResp(CookbookListResp object) {
				return createCookbookListRespAdapter();
			}
			@Override
			public Adapter caseServerCookbookFile(ServerCookbookFile object) {
				return createServerCookbookFileAdapter();
			}
			@Override
			public Adapter caseServerCookbookVersion(ServerCookbookVersion object) {
				return createServerCookbookVersionAdapter();
			}
			@Override
			public Adapter caseRunListItem(RunListItem object) {
				return createRunListItemAdapter();
			}
			@Override
			public Adapter caseDescribedObject(DescribedObject object) {
				return createDescribedObjectAdapter();
			}
			@Override
			public Adapter caseNamedObject(NamedObject object) {
				return createNamedObjectAdapter();
			}
			@Override
			public Adapter caseNamedDescribedObject(NamedDescribedObject object) {
				return createNamedDescribedObjectAdapter();
			}
			@Override
			public Adapter caseChecksumFile(ChecksumFile object) {
				return createChecksumFileAdapter();
			}
			@Override
			public Adapter caseSandboxedObject(SandboxedObject object) {
				return createSandboxedObjectAdapter();
			}
			@Override
			public Adapter caseCookbook(Cookbook object) {
				return createCookbookAdapter();
			}
			@Override
			public Adapter caseCookbookVersion(CookbookVersion object) {
				return createCookbookVersionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};
>>>>>>> origin/tomhodder

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
<<<<<<< HEAD
		return modelSwitch.doSwitch((EObject) target);
	}

=======
		return modelSwitch.doSwitch((EObject)target);
	}


>>>>>>> origin/tomhodder
	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.DataBag <em>Data Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.DataBag
	 * @generated
	 */
	public Adapter createDataBagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.Platform
	 * @generated
	 */
	public Adapter createPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.RunList <em>Run List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.RunList
	 * @generated
	 */
	public Adapter createRunListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.ServerConfig <em>Server Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.ServerConfig
	 * @generated
	 */
	public Adapter createServerConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.DataBagItem <em>Data Bag Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.DataBagItem
	 * @generated
	 */
	public Adapter createDataBagItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.Sandbox <em>Sandbox</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.Sandbox
	 * @generated
	 */
	public Adapter createSandboxAdapter() {
		return null;
	}

	/**
<<<<<<< HEAD
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.CookbookListVersionResp <em>Cookbook List Version Resp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.CookbookListVersionResp
	 * @generated
	 */
	public Adapter createCookbookListVersionRespAdapter() {
		return null;
	}

	/**
=======
>>>>>>> origin/tomhodder
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.CookbookListResp <em>Cookbook List Resp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.CookbookListResp
	 * @generated
	 */
	public Adapter createCookbookListRespAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookFile <em>Server Cookbook File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.ServerCookbookFile
	 * @generated
	 */
	public Adapter createServerCookbookFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion <em>Server Cookbook Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion
	 * @generated
	 */
	public Adapter createServerCookbookVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.RunListItem <em>Run List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.RunListItem
	 * @generated
	 */
	public Adapter createRunListItemAdapter() {
		return null;
	}

	/**
<<<<<<< HEAD
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.chefserver.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.chefserver.Organization <em>Organization</em>}'.
=======
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.DescribedObject <em>Described Object</em>}'.
>>>>>>> origin/tomhodder
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
<<<<<<< HEAD
	 * @see org.limepepper.chefclipse.common.chefserver.Organization
	 * @generated
	 */
	public Adapter createOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.utility.DescribedObject <em>Described Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.utility.DescribedObject
=======
	 * @see org.limepepper.chefclipse.DescribedObject
>>>>>>> origin/tomhodder
	 * @generated
	 */
	public Adapter createDescribedObjectAdapter() {
		return null;
	}

	/**
<<<<<<< HEAD
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.utility.NamedObject <em>Named Object</em>}'.
=======
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.NamedObject <em>Named Object</em>}'.
>>>>>>> origin/tomhodder
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
<<<<<<< HEAD
	 * @see org.limepepper.chefclipse.utility.NamedObject
=======
	 * @see org.limepepper.chefclipse.NamedObject
>>>>>>> origin/tomhodder
	 * @generated
	 */
	public Adapter createNamedObjectAdapter() {
		return null;
	}

	/**
<<<<<<< HEAD
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.utility.NamedDescribedObject <em>Named Described Object</em>}'.
=======
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.NamedDescribedObject <em>Named Described Object</em>}'.
>>>>>>> origin/tomhodder
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
<<<<<<< HEAD
	 * @see org.limepepper.chefclipse.utility.NamedDescribedObject
=======
	 * @see org.limepepper.chefclipse.NamedDescribedObject
>>>>>>> origin/tomhodder
	 * @generated
	 */
	public Adapter createNamedDescribedObjectAdapter() {
		return null;
	}

	/**
<<<<<<< HEAD
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.utility.IdentObject <em>Ident Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.utility.IdentObject
	 * @generated
	 */
	public Adapter createIdentObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.utility.JsonObject <em>Json Object</em>}'.
=======
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.ChecksumFile <em>Checksum File</em>}'.
>>>>>>> origin/tomhodder
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
<<<<<<< HEAD
	 * @see org.limepepper.chefclipse.utility.JsonObject
	 * @generated
	 */
	public Adapter createJsonObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.utility.SandboxedObject <em>Sandboxed Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.utility.SandboxedObject
	 * @generated
	 */
	public Adapter createSandboxedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.utility.ChecksumFile <em>Checksum File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.utility.ChecksumFile
=======
	 * @see org.limepepper.chefclipse.ChecksumFile
>>>>>>> origin/tomhodder
	 * @generated
	 */
	public Adapter createChecksumFileAdapter() {
		return null;
	}

	/**
<<<<<<< HEAD
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.CookbookFile <em>File</em>}'.
=======
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.SandboxedObject <em>Sandboxed Object</em>}'.
>>>>>>> origin/tomhodder
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
<<<<<<< HEAD
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookFile
	 * @generated
	 */
	public Adapter createCookbookFileAdapter() {
=======
	 * @see org.limepepper.chefclipse.SandboxedObject
	 * @generated
	 */
	public Adapter createSandboxedObjectAdapter() {
>>>>>>> origin/tomhodder
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.Cookbook <em>Cookbook</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.cookbook.Cookbook
	 * @generated
	 */
	public Adapter createCookbookAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.common.cookbook.CookbookVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.common.cookbook.CookbookVersion
	 * @generated
	 */
	public Adapter createCookbookVersionAdapter() {
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

} //ChefserverAdapterFactory
