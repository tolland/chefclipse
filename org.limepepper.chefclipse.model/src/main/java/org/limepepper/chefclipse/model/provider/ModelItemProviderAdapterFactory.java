/**
 */
package org.limepepper.chefclipse.model.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.limepepper.chefclipse.model.util.ModelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProviderAdapterFactory extends ModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.model.ChefContainer} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChefContainerItemProvider chefContainerItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.model.ChefContainer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createChefContainerAdapter() {
        if (chefContainerItemProvider == null) {
            chefContainerItemProvider = new ChefContainerItemProvider(this);
        }

        return chefContainerItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.model.ChefFile} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChefFileItemProvider chefFileItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.model.ChefFile}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createChefFileAdapter() {
        if (chefFileItemProvider == null) {
            chefFileItemProvider = new ChefFileItemProvider(this);
        }

        return chefFileItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.model.ChefFolder} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChefFolderItemProvider chefFolderItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.model.ChefFolder}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createChefFolderAdapter() {
        if (chefFolderItemProvider == null) {
            chefFolderItemProvider = new ChefFolderItemProvider(this);
        }

        return chefFolderItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.model.ChefObject} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChefObjectItemProvider chefObjectItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.model.ChefObject}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createChefObjectAdapter() {
        if (chefObjectItemProvider == null) {
            chefObjectItemProvider = new ChefObjectItemProvider(this);
        }

        return chefObjectItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.model.ChefObjectDefinitionFile} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChefObjectDefinitionFileItemProvider chefObjectDefinitionFileItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.model.ChefObjectDefinitionFile}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createChefObjectDefinitionFileAdapter() {
        if (chefObjectDefinitionFileItemProvider == null) {
            chefObjectDefinitionFileItemProvider = new ChefObjectDefinitionFileItemProvider(this);
        }

        return chefObjectDefinitionFileItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.model.ChefObjectElementFile} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChefObjectElementFileItemProvider chefObjectElementFileItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.model.ChefObjectElementFile}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createChefObjectElementFileAdapter() {
        if (chefObjectElementFileItemProvider == null) {
            chefObjectElementFileItemProvider = new ChefObjectElementFileItemProvider(this);
        }

        return chefObjectElementFileItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.model.ChefProject} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChefProjectItemProvider chefProjectItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.model.ChefProject}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createChefProjectAdapter() {
        if (chefProjectItemProvider == null) {
            chefProjectItemProvider = new ChefProjectItemProvider(this);
        }

        return chefProjectItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.model.ChefResource} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChefResourceItemProvider chefResourceItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.model.ChefResource}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createChefResourceAdapter() {
        if (chefResourceItemProvider == null) {
            chefResourceItemProvider = new ChefResourceItemProvider(this);
        }

        return chefResourceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.model.ChefWorkspace} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChefWorkspaceItemProvider chefWorkspaceItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.model.ChefWorkspace}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createChefWorkspaceAdapter() {
        if (chefWorkspaceItemProvider == null) {
            chefWorkspaceItemProvider = new ChefWorkspaceItemProvider(this);
        }

        return chefWorkspaceItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.model.ChangeTracker} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChangeTrackerItemProvider changeTrackerItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.model.ChangeTracker}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createChangeTrackerAdapter() {
        if (changeTrackerItemProvider == null) {
            changeTrackerItemProvider = new ChangeTrackerItemProvider(this);
        }

        return changeTrackerItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.model.ChefServer} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ChefServerItemProvider chefServerItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.model.ChefServer}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createChefServerAdapter() {
        if (chefServerItemProvider == null) {
            chefServerItemProvider = new ChefServerItemProvider(this);
        }

        return chefServerItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if (chefContainerItemProvider != null) chefContainerItemProvider.dispose();
        if (chefFileItemProvider != null) chefFileItemProvider.dispose();
        if (chefFolderItemProvider != null) chefFolderItemProvider.dispose();
        if (chefObjectItemProvider != null) chefObjectItemProvider.dispose();
        if (chefObjectDefinitionFileItemProvider != null) chefObjectDefinitionFileItemProvider.dispose();
        if (chefObjectElementFileItemProvider != null) chefObjectElementFileItemProvider.dispose();
        if (chefProjectItemProvider != null) chefProjectItemProvider.dispose();
        if (chefResourceItemProvider != null) chefResourceItemProvider.dispose();
        if (chefWorkspaceItemProvider != null) chefWorkspaceItemProvider.dispose();
        if (changeTrackerItemProvider != null) changeTrackerItemProvider.dispose();
        if (chefServerItemProvider != null) chefServerItemProvider.dispose();
    }

}