/**
 */
package org.limepepper.chefclipse.utility.provider;

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
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.limepepper.chefclipse.utility.util.UtilityAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilityItemProviderAdapterFactory extends UtilityAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public UtilityItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(ITableItemLabelProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.VersionedObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionedObjectItemProvider versionedObjectItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.VersionedObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVersionedObjectAdapter() {
		if (versionedObjectItemProvider == null) {
			versionedObjectItemProvider = new VersionedObjectItemProvider(this);
		}

		return versionedObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.SandboxedObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SandboxedObjectItemProvider sandboxedObjectItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.SandboxedObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSandboxedObjectAdapter() {
		if (sandboxedObjectItemProvider == null) {
			sandboxedObjectItemProvider = new SandboxedObjectItemProvider(this);
		}

		return sandboxedObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.RubyFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RubyFileItemProvider rubyFileItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.RubyFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRubyFileAdapter() {
		if (rubyFileItemProvider == null) {
			rubyFileItemProvider = new RubyFileItemProvider(this);
		}

		return rubyFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.NamedObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedObjectItemProvider namedObjectItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.NamedObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamedObjectAdapter() {
		if (namedObjectItemProvider == null) {
			namedObjectItemProvider = new NamedObjectItemProvider(this);
		}

		return namedObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.DescribedObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescribedObjectItemProvider describedObjectItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.DescribedObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescribedObjectAdapter() {
		if (describedObjectItemProvider == null) {
			describedObjectItemProvider = new DescribedObjectItemProvider(this);
		}

		return describedObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.ChecksumFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChecksumFileItemProvider checksumFileItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.ChecksumFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChecksumFileAdapter() {
		if (checksumFileItemProvider == null) {
			checksumFileItemProvider = new ChecksumFileItemProvider(this);
		}

		return checksumFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.MaintainedObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaintainedObjectItemProvider maintainedObjectItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.MaintainedObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMaintainedObjectAdapter() {
		if (maintainedObjectItemProvider == null) {
			maintainedObjectItemProvider = new MaintainedObjectItemProvider(
					this);
		}

		return maintainedObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.Config} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigItemProvider configItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.Config}.
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
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.NameUrlMap} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameUrlMapItemProvider nameUrlMapItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.NameUrlMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNameUrlMapAdapter() {
		if (nameUrlMapItemProvider == null) {
			nameUrlMapItemProvider = new NameUrlMapItemProvider(this);
		}

		return nameUrlMapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.MapTestContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapTestContainerItemProvider mapTestContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.MapTestContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMapTestContainerAdapter() {
		if (mapTestContainerItemProvider == null) {
			mapTestContainerItemProvider = new MapTestContainerItemProvider(
					this);
		}

		return mapTestContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStringToVersionUrlMapItemProvider eStringToVersionUrlMapItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEStringToVersionUrlMapAdapter() {
		if (eStringToVersionUrlMapItemProvider == null) {
			eStringToVersionUrlMapItemProvider = new EStringToVersionUrlMapItemProvider(
					this);
		}

		return eStringToVersionUrlMapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.VersionUrl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionUrlItemProvider versionUrlItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.VersionUrl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVersionUrlAdapter() {
		if (versionUrlItemProvider == null) {
			versionUrlItemProvider = new VersionUrlItemProvider(this);
		}

		return versionUrlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.URLEntryTest} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLEntryTestItemProvider urlEntryTestItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.URLEntryTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createURLEntryTestAdapter() {
		if (urlEntryTestItemProvider == null) {
			urlEntryTestItemProvider = new URLEntryTestItemProvider(this);
		}

		return urlEntryTestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.NameVersionMap} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameVersionMapItemProvider nameVersionMapItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.NameVersionMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNameVersionMapAdapter() {
		if (nameVersionMapItemProvider == null) {
			nameVersionMapItemProvider = new NameVersionMapItemProvider(this);
		}

		return nameVersionMapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.IdentObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentObjectItemProvider identObjectItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.IdentObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIdentObjectAdapter() {
		if (identObjectItemProvider == null) {
			identObjectItemProvider = new IdentObjectItemProvider(this);
		}

		return identObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.limepepper.chefclipse.utility.JsonObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonObjectItemProvider jsonObjectItemProvider;

	/**
	 * This creates an adapter for a {@link org.limepepper.chefclipse.utility.JsonObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJsonObjectAdapter() {
		if (jsonObjectItemProvider == null) {
			jsonObjectItemProvider = new JsonObjectItemProvider(this);
		}

		return jsonObjectItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
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
			if (!(type instanceof Class<?>)
					|| (((Class<?>) type).isInstance(adapter))) {
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
		if (versionedObjectItemProvider != null)
			versionedObjectItemProvider.dispose();
		if (sandboxedObjectItemProvider != null)
			sandboxedObjectItemProvider.dispose();
		if (rubyFileItemProvider != null)
			rubyFileItemProvider.dispose();
		if (namedObjectItemProvider != null)
			namedObjectItemProvider.dispose();
		if (describedObjectItemProvider != null)
			describedObjectItemProvider.dispose();
		if (checksumFileItemProvider != null)
			checksumFileItemProvider.dispose();
		if (maintainedObjectItemProvider != null)
			maintainedObjectItemProvider.dispose();
		if (configItemProvider != null)
			configItemProvider.dispose();
		if (nameUrlMapItemProvider != null)
			nameUrlMapItemProvider.dispose();
		if (mapTestContainerItemProvider != null)
			mapTestContainerItemProvider.dispose();
		if (eStringToVersionUrlMapItemProvider != null)
			eStringToVersionUrlMapItemProvider.dispose();
		if (versionUrlItemProvider != null)
			versionUrlItemProvider.dispose();
		if (urlEntryTestItemProvider != null)
			urlEntryTestItemProvider.dispose();
		if (nameVersionMapItemProvider != null)
			nameVersionMapItemProvider.dispose();
		if (identObjectItemProvider != null)
			identObjectItemProvider.dispose();
		if (jsonObjectItemProvider != null)
			jsonObjectItemProvider.dispose();
	}

}
