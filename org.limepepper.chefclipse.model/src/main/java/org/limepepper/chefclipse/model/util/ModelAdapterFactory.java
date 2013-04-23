/**
 */
package org.limepepper.chefclipse.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.limepepper.chefclipse.model.*;
import org.limepepper.chefclipse.model.ChangeTracker;
import org.limepepper.chefclipse.model.ChefContainer;
import org.limepepper.chefclipse.model.ChefFile;
import org.limepepper.chefclipse.model.ChefFolder;
import org.limepepper.chefclipse.model.ChefObject;
import org.limepepper.chefclipse.model.ChefObjectDefinitionFile;
import org.limepepper.chefclipse.model.ChefObjectElementFile;
import org.limepepper.chefclipse.model.ChefProject;
import org.limepepper.chefclipse.model.ChefResource;
import org.limepepper.chefclipse.model.ChefServer;
import org.limepepper.chefclipse.model.ChefWorkspace;
import org.limepepper.chefclipse.model.CookbookFolder;
import org.limepepper.chefclipse.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.limepepper.chefclipse.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
    /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static ModelPackage modelPackage;

    /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
    protected ModelSwitch<Adapter> modelSwitch =
        new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseChefContainer(ChefContainer object) {
				return createChefContainerAdapter();
			}
			@Override
			public Adapter caseChefFile(ChefFile object) {
				return createChefFileAdapter();
			}
			@Override
			public Adapter caseChefFolder(ChefFolder object) {
				return createChefFolderAdapter();
			}
			@Override
			public Adapter caseChefObject(ChefObject object) {
				return createChefObjectAdapter();
			}
			@Override
			public Adapter caseChefObjectDefinitionFile(ChefObjectDefinitionFile object) {
				return createChefObjectDefinitionFileAdapter();
			}
			@Override
			public Adapter caseChefObjectElementFile(ChefObjectElementFile object) {
				return createChefObjectElementFileAdapter();
			}
			@Override
			public Adapter caseChefProject(ChefProject object) {
				return createChefProjectAdapter();
			}
			@Override
			public Adapter caseChefResource(ChefResource object) {
				return createChefResourceAdapter();
			}
			@Override
			public Adapter caseChefWorkspace(ChefWorkspace object) {
				return createChefWorkspaceAdapter();
			}
			@Override
			public Adapter caseChangeTracker(ChangeTracker object) {
				return createChangeTrackerAdapter();
			}
			@Override
			public Adapter caseChefServer(ChefServer object) {
				return createChefServerAdapter();
			}
			@Override
			public Adapter caseCookbookFolder(CookbookFolder object) {
				return createCookbookFolderAdapter();
			}
			@Override
			public Adapter caseDataBagsFolder(DataBagsFolder object) {
				return createDataBagsFolderAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.model.ChefContainer <em>Chef Container</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.model.ChefContainer
	 * @generated
	 */
    public Adapter createChefContainerAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.model.ChefFile <em>Chef File</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.model.ChefFile
	 * @generated
	 */
    public Adapter createChefFileAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.model.ChefFolder <em>Chef Folder</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.model.ChefFolder
	 * @generated
	 */
    public Adapter createChefFolderAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.model.ChefObject <em>Chef Object</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.model.ChefObject
	 * @generated
	 */
    public Adapter createChefObjectAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.model.ChefObjectDefinitionFile <em>Chef Object Definition File</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.model.ChefObjectDefinitionFile
	 * @generated
	 */
    public Adapter createChefObjectDefinitionFileAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.model.ChefObjectElementFile <em>Chef Object Element File</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.model.ChefObjectElementFile
	 * @generated
	 */
    public Adapter createChefObjectElementFileAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.model.ChefProject <em>Chef Project</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.model.ChefProject
	 * @generated
	 */
    public Adapter createChefProjectAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.model.ChefResource <em>Chef Resource</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.model.ChefResource
	 * @generated
	 */
    public Adapter createChefResourceAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.model.ChefWorkspace <em>Chef Workspace</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.model.ChefWorkspace
	 * @generated
	 */
    public Adapter createChefWorkspaceAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.model.ChangeTracker <em>Change Tracker</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.model.ChangeTracker
	 * @generated
	 */
    public Adapter createChangeTrackerAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.model.ChefServer <em>Chef Server</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.model.ChefServer
	 * @generated
	 */
    public Adapter createChefServerAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.model.CookbookFolder <em>Cookbook Folder</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.model.CookbookFolder
	 * @generated
	 */
    public Adapter createCookbookFolderAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link org.limepepper.chefclipse.model.DataBagsFolder <em>Data Bags Folder</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.limepepper.chefclipse.model.DataBagsFolder
	 * @generated
	 */
    public Adapter createDataBagsFolderAdapter() {
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

} //ModelAdapterFactory
