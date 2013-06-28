/**
 */
package org.limepepper.chefclipse.common.chefserver.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.chefclient.ChefClient;
=======
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.NamedObject;
import org.limepepper.chefclipse.common.chefclient.Client;
>>>>>>> origin/tomhodder
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.Environment;
import org.limepepper.chefclipse.common.chefserver.Node;
import org.limepepper.chefclipse.common.chefserver.RunList;
import org.limepepper.chefclipse.common.chefserver.Server;
import org.limepepper.chefclipse.common.cookbook.Attribute;
<<<<<<< HEAD
import org.limepepper.chefclipse.common.cookbook.Recipe;
import org.limepepper.chefclipse.utility.NamedObject;
import org.limepepper.chefclipse.utility.UtilityPackage;
import org.limepepper.chefclipse.utility.impl.DescribedObjectImpl;
=======
import org.limepepper.chefclipse.impl.DescribedObjectImpl;
>>>>>>> origin/tomhodder

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.NodeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.NodeImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.NodeImpl#getRecipes <em>Recipes</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.NodeImpl#getRun_list_items <em>Run list items</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.NodeImpl#getRun_list <em>Run list</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.NodeImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.NodeImpl#getClient <em>Client</em>}</li>
 *   <li>{@link org.limepepper.chefclipse.common.chefserver.impl.NodeImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends DescribedObjectImpl implements Node {
<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChefserverPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eGet(UtilityPackage.Literals.NAMED_OBJECT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(UtilityPackage.Literals.NAMED_OBJECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String) eGet(UtilityPackage.Literals.NAMED_OBJECT__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(UtilityPackage.Literals.NAMED_OBJECT__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<RunList> getRun_list() {
		return (EList<RunList>) eGet(
				ChefserverPackage.Literals.RUN_LIST__RUN_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		return (Environment) eGet(
				ChefserverPackage.Literals.RUN_LIST__ENVIRONMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		eSet(ChefserverPackage.Literals.RUN_LIST__ENVIRONMENT, newEnvironment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Recipe> getRecipes() {
		return (EList<Recipe>) eGet(
				ChefserverPackage.Literals.RUN_LIST__RECIPES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server getServer() {
		return (Server) eGet(ChefserverPackage.Literals.RUN_LIST__SERVER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(Server newServer) {
		eSet(ChefserverPackage.Literals.RUN_LIST__SERVER, newServer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChefClient getClient() {
		return (ChefClient) eGet(ChefserverPackage.Literals.NODE__CLIENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(ChefClient newClient) {
		eSet(ChefserverPackage.Literals.NODE__CLIENT, newClient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributes() {
		return (Attribute) eGet(ChefserverPackage.Literals.NODE__ATTRIBUTES,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(Attribute newAttributes) {
		eSet(ChefserverPackage.Literals.NODE__ATTRIBUTES, newAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getRun_list_items() {
		return (EList<String>) eGet(
				ChefserverPackage.Literals.RUN_LIST__RUN_LIST_ITEMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedObject.class) {
			switch (derivedFeatureID) {
			case ChefserverPackage.NODE__NAME:
				return UtilityPackage.NAMED_OBJECT__NAME;
			case ChefserverPackage.NODE__ID:
				return UtilityPackage.NAMED_OBJECT__ID;
			default:
				return -1;
			}
		}
		if (baseClass == RunList.class) {
			switch (derivedFeatureID) {
			case ChefserverPackage.NODE__ENVIRONMENT:
				return ChefserverPackage.RUN_LIST__ENVIRONMENT;
			case ChefserverPackage.NODE__RECIPES:
				return ChefserverPackage.RUN_LIST__RECIPES;
			case ChefserverPackage.NODE__RUN_LIST_ITEMS:
				return ChefserverPackage.RUN_LIST__RUN_LIST_ITEMS;
			case ChefserverPackage.NODE__RUN_LIST:
				return ChefserverPackage.RUN_LIST__RUN_LIST;
			case ChefserverPackage.NODE__SERVER:
				return ChefserverPackage.RUN_LIST__SERVER;
			default:
				return -1;
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NodeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ChefserverPackage.Literals.NODE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return (String)eGet(ChefclipsePackage.Literals.NAMED_OBJECT__NAME, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		eSet(ChefclipsePackage.Literals.NAMED_OBJECT__NAME, newName);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getID() {
		return (String)eGet(ChefclipsePackage.Literals.NAMED_OBJECT__ID, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setID(String newID) {
		eSet(ChefclipsePackage.Literals.NAMED_OBJECT__ID, newID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public RunList getRun_list() {
		return (RunList)eGet(ChefserverPackage.Literals.NODE__RUN_LIST, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setRun_list(RunList newRun_list) {
		eSet(ChefserverPackage.Literals.NODE__RUN_LIST, newRun_list);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Environment getEnvironment() {
		return (Environment)eGet(ChefserverPackage.Literals.NODE__ENVIRONMENT, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setEnvironment(Environment newEnvironment) {
		eSet(ChefserverPackage.Literals.NODE__ENVIRONMENT, newEnvironment);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Server getServer() {
		return (Server)eGet(ChefserverPackage.Literals.NODE__SERVER, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setServer(Server newServer) {
		eSet(ChefserverPackage.Literals.NODE__SERVER, newServer);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Client getClient() {
		return (Client)eGet(ChefserverPackage.Literals.NODE__CLIENT, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setClient(Client newClient) {
		eSet(ChefserverPackage.Literals.NODE__CLIENT, newClient);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Attribute getAttributes() {
		return (Attribute)eGet(ChefserverPackage.Literals.NODE__ATTRIBUTES, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setAttributes(Attribute newAttributes) {
		eSet(ChefserverPackage.Literals.NODE__ATTRIBUTES, newAttributes);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    public EList<String> getRun_list_items() {
		return (EList<String>)eGet(ChefserverPackage.Literals.NODE__RUN_LIST_ITEMS, true);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedObject.class) {
			switch (derivedFeatureID) {
				case ChefserverPackage.NODE__NAME: return ChefclipsePackage.NAMED_OBJECT__NAME;
				case ChefserverPackage.NODE__ID: return ChefclipsePackage.NAMED_OBJECT__ID;
				default: return -1;
>>>>>>> origin/tomhodder
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

<<<<<<< HEAD
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedObject.class) {
			switch (baseFeatureID) {
			case UtilityPackage.NAMED_OBJECT__NAME:
				return ChefserverPackage.NODE__NAME;
			case UtilityPackage.NAMED_OBJECT__ID:
				return ChefserverPackage.NODE__ID;
			default:
				return -1;
			}
		}
		if (baseClass == RunList.class) {
			switch (baseFeatureID) {
			case ChefserverPackage.RUN_LIST__ENVIRONMENT:
				return ChefserverPackage.NODE__ENVIRONMENT;
			case ChefserverPackage.RUN_LIST__RECIPES:
				return ChefserverPackage.NODE__RECIPES;
			case ChefserverPackage.RUN_LIST__RUN_LIST_ITEMS:
				return ChefserverPackage.NODE__RUN_LIST_ITEMS;
			case ChefserverPackage.RUN_LIST__RUN_LIST:
				return ChefserverPackage.NODE__RUN_LIST;
			case ChefserverPackage.RUN_LIST__SERVER:
				return ChefserverPackage.NODE__SERVER;
			default:
				return -1;
=======
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedObject.class) {
			switch (baseFeatureID) {
				case ChefclipsePackage.NAMED_OBJECT__NAME: return ChefserverPackage.NODE__NAME;
				case ChefclipsePackage.NAMED_OBJECT__ID: return ChefserverPackage.NODE__ID;
				default: return -1;
>>>>>>> origin/tomhodder
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //NodeImpl
