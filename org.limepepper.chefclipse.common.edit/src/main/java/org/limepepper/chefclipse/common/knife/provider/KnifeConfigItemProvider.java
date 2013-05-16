/**
 */
package org.limepepper.chefclipse.common.knife.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.limepepper.chefclipse.common.edit.provider.ChefclipseEditPlugin;
import org.limepepper.chefclipse.common.knife.KnifeConfig;
import org.limepepper.chefclipse.common.knife.KnifeFactory;
import org.limepepper.chefclipse.common.knife.KnifePackage;
import org.limepepper.chefclipse.utility.provider.ConfigItemProvider;

/**
 * This is the item provider adapter for a {@link org.limepepper.chefclipse.common.knife.KnifeConfig} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KnifeConfigItemProvider
    extends ConfigItemProvider
    implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {
    /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KnifeConfigItemProvider(AdapterFactory adapterFactory) {
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

			addCache_typePropertyDescriptor(object);
			addCache_optionPropertyDescriptor(object);
			addCookbook_pathPropertyDescriptor(object);
			addCookbook_copyrightPropertyDescriptor(object);
			addCookbook_emailPropertyDescriptor(object);
			addCookbook_licensePropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addServerPropertyDescriptor(object);
			addServerCookbookVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

    /**
	 * This adds a property descriptor for the Cache type feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addCache_typePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KnifeConfig_cache_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KnifeConfig_cache_type_feature", "_UI_KnifeConfig_type"),
				 KnifePackage.Literals.KNIFE_CONFIG__CACHE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Cache option feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addCache_optionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KnifeConfig_cache_option_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KnifeConfig_cache_option_feature", "_UI_KnifeConfig_type"),
				 KnifePackage.Literals.KNIFE_CONFIG__CACHE_OPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Cookbook path feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addCookbook_pathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KnifeConfig_cookbook_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KnifeConfig_cookbook_path_feature", "_UI_KnifeConfig_type"),
				 KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Cookbook copyright feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addCookbook_copyrightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KnifeConfig_cookbook_copyright_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KnifeConfig_cookbook_copyright_feature", "_UI_KnifeConfig_type"),
				 KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_COPYRIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Cookbook email feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addCookbook_emailPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KnifeConfig_cookbook_email_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KnifeConfig_cookbook_email_feature", "_UI_KnifeConfig_type"),
				 KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_EMAIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Cookbook license feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addCookbook_licensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KnifeConfig_cookbook_license_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KnifeConfig_cookbook_license_feature", "_UI_KnifeConfig_type"),
				 KnifePackage.Literals.KNIFE_CONFIG__COOKBOOK_LICENSE,
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
				 getString("_UI_KnifeConfig_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KnifeConfig_path_feature", "_UI_KnifeConfig_type"),
				 KnifePackage.Literals.KNIFE_CONFIG__PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Server feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addServerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KnifeConfig_server_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KnifeConfig_server_feature", "_UI_KnifeConfig_type"),
				 KnifePackage.Literals.KNIFE_CONFIG__SERVER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Server Cookbook Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerCookbookVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KnifeConfig_serverCookbookVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KnifeConfig_serverCookbookVersion_feature", "_UI_KnifeConfig_type"),
				 KnifePackage.Literals.KNIFE_CONFIG__SERVER_COOKBOOK_VERSION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

				/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(KnifePackage.Literals.KNIFE_CONFIG__PLUGINS);
		}
		return childrenFeatures;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

    /**
	 * This returns KnifeConfig.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KnifeConfig"));
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getText(Object object) {
		String label = ((KnifeConfig)object).getNode_name();
		return label == null || label.length() == 0 ?
			getString("_UI_KnifeConfig_type") :
			getString("_UI_KnifeConfig_type") + " " + label;
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

		switch (notification.getFeatureID(KnifeConfig.class)) {
			case KnifePackage.KNIFE_CONFIG__CACHE_TYPE:
			case KnifePackage.KNIFE_CONFIG__CACHE_OPTION:
			case KnifePackage.KNIFE_CONFIG__COOKBOOK_PATH:
			case KnifePackage.KNIFE_CONFIG__COOKBOOK_COPYRIGHT:
			case KnifePackage.KNIFE_CONFIG__COOKBOOK_EMAIL:
			case KnifePackage.KNIFE_CONFIG__COOKBOOK_LICENSE:
			case KnifePackage.KNIFE_CONFIG__PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case KnifePackage.KNIFE_CONFIG__PLUGINS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(KnifePackage.Literals.KNIFE_CONFIG__PLUGINS,
				 KnifeFactory.eINSTANCE.createPlugin()));
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
