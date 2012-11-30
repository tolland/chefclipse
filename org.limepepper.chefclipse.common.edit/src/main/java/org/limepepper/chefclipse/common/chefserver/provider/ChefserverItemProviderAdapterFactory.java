/**
 */
package org.limepepper.chefclipse.common.chefserver.provider;

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

import org.limepepper.chefclipse.common.chefserver.util.ChefserverAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChefserverItemProviderAdapterFactory extends ChefserverAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
    public ChefserverItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.common.chefserver.Environment} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnvironmentItemProvider environmentItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.common.chefserver.Environment}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createEnvironmentAdapter() {
        if (environmentItemProvider == null) {
            environmentItemProvider = new EnvironmentItemProvider(this);
        }

        return environmentItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.common.chefserver.DataBag} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataBagItemProvider dataBagItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.common.chefserver.DataBag}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDataBagAdapter() {
        if (dataBagItemProvider == null) {
            dataBagItemProvider = new DataBagItemProvider(this);
        }

        return dataBagItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.common.chefserver.Role} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RoleItemProvider roleItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.common.chefserver.Role}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRoleAdapter() {
        if (roleItemProvider == null) {
            roleItemProvider = new RoleItemProvider(this);
        }

        return roleItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.common.chefserver.Node} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NodeItemProvider nodeItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.common.chefserver.Node}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createNodeAdapter() {
        if (nodeItemProvider == null) {
            nodeItemProvider = new NodeItemProvider(this);
        }

        return nodeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.common.chefserver.Server} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServerItemProvider serverItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.common.chefserver.Server}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createServerAdapter() {
        if (serverItemProvider == null) {
            serverItemProvider = new ServerItemProvider(this);
        }

        return serverItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.common.chefserver.Platform} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PlatformItemProvider platformItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.common.chefserver.Platform}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPlatformAdapter() {
        if (platformItemProvider == null) {
            platformItemProvider = new PlatformItemProvider(this);
        }

        return platformItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.common.chefserver.RunList} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RunListItemProvider runListItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.common.chefserver.RunList}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createRunListAdapter() {
        if (runListItemProvider == null) {
            runListItemProvider = new RunListItemProvider(this);
        }

        return runListItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.common.chefserver.Config} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfigItemProvider configItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.common.chefserver.Config}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createConfigAdapter() {
        if (configItemProvider == null) {
            configItemProvider = new ConfigItemProvider(this);
        }

        return configItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.common.chefserver.DataBagItem} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataBagItemItemProvider dataBagItemItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.common.chefserver.DataBagItem}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createDataBagItemAdapter() {
        if (dataBagItemItemProvider == null) {
            dataBagItemItemProvider = new DataBagItemItemProvider(this);
        }

        return dataBagItemItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.common.chefserver.Sandbox} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SandboxItemProvider sandboxItemProvider;

    /**
     * This creates an adapter for a {@link org.limepepper.chefclipse.common.chefserver.Sandbox}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createSandboxAdapter() {
        if (sandboxItemProvider == null) {
            sandboxItemProvider = new SandboxItemProvider(this);
        }

        return sandboxItemProvider;
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
        if (environmentItemProvider != null) environmentItemProvider.dispose();
        if (dataBagItemProvider != null) dataBagItemProvider.dispose();
        if (roleItemProvider != null) roleItemProvider.dispose();
        if (nodeItemProvider != null) nodeItemProvider.dispose();
        if (serverItemProvider != null) serverItemProvider.dispose();
        if (platformItemProvider != null) platformItemProvider.dispose();
        if (runListItemProvider != null) runListItemProvider.dispose();
        if (configItemProvider != null) configItemProvider.dispose();
        if (dataBagItemItemProvider != null) dataBagItemItemProvider.dispose();
        if (sandboxItemProvider != null) sandboxItemProvider.dispose();
    }

}
