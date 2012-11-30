/**
 */
package org.limepepper.chefclipse.REST.provider;


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
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.limepepper.chefclipse.REST.CookbookVersionResp;
import org.limepepper.chefclipse.REST.RESTFactory;
import org.limepepper.chefclipse.REST.RESTPackage;

import org.limepepper.chefclipse.common.edit.provider.ChefclipseEditPlugin;

/**
 * This is the item provider adapter for a {@link org.limepepper.chefclipse.REST.CookbookVersionResp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CookbookVersionRespItemProvider
    extends ItemProviderAdapter
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CookbookVersionRespItemProvider(AdapterFactory adapterFactory) {
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

            addMaintainerPropertyDescriptor(object);
            addCategoryPropertyDescriptor(object);
            addUpdatedAtPropertyDescriptor(object);
            addCreatedAtPropertyDescriptor(object);
            addLatestVersionPropertyDescriptor(object);
            addExternalUrlPropertyDescriptor(object);
            addDeprecatedPropertyDescriptor(object);
            addReplacementPropertyDescriptor(object);
            addDefinitionsPropertyDescriptor(object);
            addFilesPropertyDescriptor(object);
            addAttributesPropertyDescriptor(object);
            addCookbookNamePropertyDescriptor(object);
            addVersionPropertyDescriptor(object);
            addJsonClassPropertyDescriptor(object);
            addChefTypePropertyDescriptor(object);
            addNamePropertyDescriptor(object);
            addDescriptionPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Maintainer feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaintainerPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_maintainer_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_maintainer_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__MAINTAINER,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Category feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCategoryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_category_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_category_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__CATEGORY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Updated At feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUpdatedAtPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_updatedAt_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_updatedAt_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__UPDATED_AT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Created At feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCreatedAtPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_createdAt_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_createdAt_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__CREATED_AT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Latest Version feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLatestVersionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_latestVersion_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_latestVersion_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__LATEST_VERSION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the External Url feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addExternalUrlPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_externalUrl_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_externalUrl_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__EXTERNAL_URL,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Deprecated feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDeprecatedPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_deprecated_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_deprecated_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__DEPRECATED,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Replacement feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReplacementPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_replacement_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_replacement_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__REPLACEMENT,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Definitions feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefinitionsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_definitions_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_definitions_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__DEFINITIONS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Files feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFilesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_files_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_files_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__FILES,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Attributes feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAttributesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_attributes_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_attributes_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__ATTRIBUTES,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Cookbook Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCookbookNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_cookbookName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_cookbookName_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__COOKBOOK_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
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
                 getString("_UI_CookbookVersionResp_version_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_version_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__VERSION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Json Class feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addJsonClassPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_JsonClass_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_JsonClass_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__JSON_CLASS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Chef Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChefTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_ChefType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_ChefType_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__CHEF_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_name_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Description feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDescriptionPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersionResp_description_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersionResp_description_feature", "_UI_CookbookVersionResp_type"),
                 RESTPackage.Literals.COOKBOOK_VERSION_RESP__DESCRIPTION,
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
            childrenFeatures.add(RESTPackage.Literals.COOKBOOK_VERSION_RESP__METADATA);
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
     * This returns CookbookVersionResp.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CookbookVersionResp"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CookbookVersionResp)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CookbookVersionResp_type") :
            getString("_UI_CookbookVersionResp_type") + " " + label;
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

        switch (notification.getFeatureID(CookbookVersionResp.class)) {
            case RESTPackage.COOKBOOK_VERSION_RESP__MAINTAINER:
            case RESTPackage.COOKBOOK_VERSION_RESP__CATEGORY:
            case RESTPackage.COOKBOOK_VERSION_RESP__UPDATED_AT:
            case RESTPackage.COOKBOOK_VERSION_RESP__CREATED_AT:
            case RESTPackage.COOKBOOK_VERSION_RESP__LATEST_VERSION:
            case RESTPackage.COOKBOOK_VERSION_RESP__EXTERNAL_URL:
            case RESTPackage.COOKBOOK_VERSION_RESP__DEPRECATED:
            case RESTPackage.COOKBOOK_VERSION_RESP__REPLACEMENT:
            case RESTPackage.COOKBOOK_VERSION_RESP__COOKBOOK_NAME:
            case RESTPackage.COOKBOOK_VERSION_RESP__VERSION:
            case RESTPackage.COOKBOOK_VERSION_RESP__JSON_CLASS:
            case RESTPackage.COOKBOOK_VERSION_RESP__CHEF_TYPE:
            case RESTPackage.COOKBOOK_VERSION_RESP__NAME:
            case RESTPackage.COOKBOOK_VERSION_RESP__DESCRIPTION:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case RESTPackage.COOKBOOK_VERSION_RESP__METADATA:
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
                (RESTPackage.Literals.COOKBOOK_VERSION_RESP__METADATA,
                 RESTFactory.eINSTANCE.createCookbookMetadata()));
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
