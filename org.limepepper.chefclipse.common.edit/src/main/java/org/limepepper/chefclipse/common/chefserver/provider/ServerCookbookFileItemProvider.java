/**
 */
package org.limepepper.chefclipse.common.chefserver.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.limepepper.chefclipse.ChefclipsePackage;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookFile;
import org.limepepper.chefclipse.common.edit.provider.ChefclipseEditPlugin;
import org.limepepper.chefclipse.provider.NamedObjectItemProvider;

/**
 * This is the item provider adapter for a {@link org.limepepper.chefclipse.common.chefserver.ServerCookbookFile} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerCookbookFileItemProvider
	extends NamedObjectItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		ITableItemLabelProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerCookbookFileItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addChecksumPropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addSpecificityPropertyDescriptor(object);
			addUrlPropertyDescriptor(object);
			addCookbookPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Checksum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChecksumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChecksumFile_checksum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChecksumFile_checksum_feature", "_UI_ChecksumFile_type"),
				 ChefclipsePackage.Literals.CHECKSUM_FILE__CHECKSUM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChecksumFile_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChecksumFile_path_feature", "_UI_ChecksumFile_type"),
				 ChefclipsePackage.Literals.CHECKSUM_FILE__PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Specificity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ChecksumFile_specificity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ChecksumFile_specificity_feature", "_UI_ChecksumFile_type"),
				 ChefclipsePackage.Literals.CHECKSUM_FILE__SPECIFICITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SandboxedObject_url_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SandboxedObject_url_feature", "_UI_SandboxedObject_type"),
				 ChefclipsePackage.Literals.SANDBOXED_OBJECT__URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cookbook feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCookbookPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerCookbookFile_cookbook_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerCookbookFile_cookbook_feature", "_UI_ServerCookbookFile_type"),
				 ChefserverPackage.Literals.SERVER_COOKBOOK_FILE__COOKBOOK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns ServerCookbookFile.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServerCookbookFile"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServerCookbookFile)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ServerCookbookFile_type") :
			getString("_UI_ServerCookbookFile_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ServerCookbookFile.class)) {
			case ChefserverPackage.SERVER_COOKBOOK_FILE__CHECKSUM:
			case ChefserverPackage.SERVER_COOKBOOK_FILE__PATH:
			case ChefserverPackage.SERVER_COOKBOOK_FILE__SPECIFICITY:
			case ChefserverPackage.SERVER_COOKBOOK_FILE__URL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ChefclipseEditPlugin.INSTANCE;
	}

}
