/**
 */
package org.limepepper.chefclipse.common.chefserver.provider;


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

import org.limepepper.chefclipse.REST.RESTFactory;
import org.limepepper.chefclipse.common.chefserver.ChefserverFactory;
import org.limepepper.chefclipse.common.chefserver.ChefserverPackage;
import org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion;

import org.limepepper.chefclipse.common.edit.provider.ChefclipseEditPlugin;
import org.limepepper.chefclipse.provider.CookbookItemProvider;

/**
 * This is the item provider adapter for a {@link org.limepepper.chefclipse.common.chefserver.ServerCookbookVersion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerCookbookVersionItemProvider
    extends CookbookItemProvider
    implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider {
    /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ServerCookbookVersionItemProvider(AdapterFactory adapterFactory) {
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

			addVersionPropertyDescriptor(object);
			addCookbook_namePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

    /**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerCookbookVersion_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerCookbookVersion_version_feature", "_UI_ServerCookbookVersion_type"),
				 ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Cookbook name feature.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void addCookbook_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServerCookbookVersion_cookbook_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServerCookbookVersion_cookbook_name_feature", "_UI_ServerCookbookVersion_type"),
				 ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__COOKBOOK_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__ROOT_FILES);
			childrenFeatures.add(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__RECIPES);
			childrenFeatures.add(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__TEMPLATES);
			childrenFeatures.add(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__LIBRARIES);
			childrenFeatures.add(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__PROVIDERS);
			childrenFeatures.add(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__RESOURCES);
			childrenFeatures.add(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__FILES);
			childrenFeatures.add(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__DEFINITIONS);
			childrenFeatures.add(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__ATTRIBUTES);
			childrenFeatures.add(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__METADATA);
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
	 * This returns ServerCookbookVersion.gif.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServerCookbookVersion"));
	}

    /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getText(Object object) {
		String label = ((ServerCookbookVersion)object).getCookbook_name();
		return label == null || label.length() == 0 ?
			getString("_UI_ServerCookbookVersion_type") :
			getString("_UI_ServerCookbookVersion_type") + " " + label;
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

		switch (notification.getFeatureID(ServerCookbookVersion.class)) {
			case ChefserverPackage.SERVER_COOKBOOK_VERSION__VERSION:
			case ChefserverPackage.SERVER_COOKBOOK_VERSION__COOKBOOK_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ChefserverPackage.SERVER_COOKBOOK_VERSION__ROOT_FILES:
			case ChefserverPackage.SERVER_COOKBOOK_VERSION__RECIPES:
			case ChefserverPackage.SERVER_COOKBOOK_VERSION__TEMPLATES:
			case ChefserverPackage.SERVER_COOKBOOK_VERSION__LIBRARIES:
			case ChefserverPackage.SERVER_COOKBOOK_VERSION__PROVIDERS:
			case ChefserverPackage.SERVER_COOKBOOK_VERSION__RESOURCES:
			case ChefserverPackage.SERVER_COOKBOOK_VERSION__FILES:
			case ChefserverPackage.SERVER_COOKBOOK_VERSION__DEFINITIONS:
			case ChefserverPackage.SERVER_COOKBOOK_VERSION__ATTRIBUTES:
			case ChefserverPackage.SERVER_COOKBOOK_VERSION__METADATA:
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
				(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__ROOT_FILES,
				 ChefserverFactory.eINSTANCE.createServerCookbookFile()));

		newChildDescriptors.add
			(createChildParameter
				(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__RECIPES,
				 ChefserverFactory.eINSTANCE.createServerCookbookFile()));

		newChildDescriptors.add
			(createChildParameter
				(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__TEMPLATES,
				 ChefserverFactory.eINSTANCE.createServerCookbookFile()));

		newChildDescriptors.add
			(createChildParameter
				(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__LIBRARIES,
				 ChefserverFactory.eINSTANCE.createServerCookbookFile()));

		newChildDescriptors.add
			(createChildParameter
				(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__PROVIDERS,
				 ChefserverFactory.eINSTANCE.createServerCookbookFile()));

		newChildDescriptors.add
			(createChildParameter
				(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__RESOURCES,
				 ChefserverFactory.eINSTANCE.createServerCookbookFile()));

		newChildDescriptors.add
			(createChildParameter
				(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__FILES,
				 ChefserverFactory.eINSTANCE.createServerCookbookFile()));

		newChildDescriptors.add
			(createChildParameter
				(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__DEFINITIONS,
				 ChefserverFactory.eINSTANCE.createServerCookbookFile()));

		newChildDescriptors.add
			(createChildParameter
				(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__ATTRIBUTES,
				 ChefserverFactory.eINSTANCE.createServerCookbookFile()));

		newChildDescriptors.add
			(createChildParameter
				(ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__METADATA,
				 RESTFactory.eINSTANCE.createCookbookMetadata()));
	}

    /**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__ROOT_FILES ||
			childFeature == ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__RECIPES ||
			childFeature == ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__TEMPLATES ||
			childFeature == ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__LIBRARIES ||
			childFeature == ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__PROVIDERS ||
			childFeature == ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__RESOURCES ||
			childFeature == ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__FILES ||
			childFeature == ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__DEFINITIONS ||
			childFeature == ChefserverPackage.Literals.SERVER_COOKBOOK_VERSION__ATTRIBUTES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
