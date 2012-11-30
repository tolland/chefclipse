/**
 */
package org.limepepper.chefclipse.common.cookbook.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.limepepper.chefclipse.ChefclipsePackage;

import org.limepepper.chefclipse.common.cookbook.CookbookFactory;
import org.limepepper.chefclipse.common.cookbook.CookbookPackage;
import org.limepepper.chefclipse.common.cookbook.CookbookVersion;

/**
 * This is the item provider adapter for a {@link org.limepepper.chefclipse.common.cookbook.CookbookVersion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CookbookVersionItemProvider
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
    public CookbookVersionItemProvider(AdapterFactory adapterFactory) {
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

            addNamePropertyDescriptor(object);
            addDescriptionPropertyDescriptor(object);
            addDependsPropertyDescriptor(object);
            addEnvironmentPropertyDescriptor(object);
            addTemplatesPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
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
                 getString("_UI_NamedDescribedObject_name_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_NamedDescribedObject_name_feature", "_UI_NamedDescribedObject_type"),
                 ChefclipsePackage.Literals.NAMED_DESCRIBED_OBJECT__NAME,
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
                 getString("_UI_NamedDescribedObject_description_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_NamedDescribedObject_description_feature", "_UI_NamedDescribedObject_type"),
                 ChefclipsePackage.Literals.NAMED_DESCRIBED_OBJECT__DESCRIPTION,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Depends feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDependsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersion_depends_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersion_depends_feature", "_UI_CookbookVersion_type"),
                 CookbookPackage.Literals.COOKBOOK_VERSION__DEPENDS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Environment feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnvironmentPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersion_environment_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersion_environment_feature", "_UI_CookbookVersion_type"),
                 CookbookPackage.Literals.COOKBOOK_VERSION__ENVIRONMENT,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Templates feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTemplatesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CookbookVersion_templates_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CookbookVersion_templates_feature", "_UI_CookbookVersion_type"),
                 CookbookPackage.Literals.COOKBOOK_VERSION__TEMPLATES,
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
            childrenFeatures.add(CookbookPackage.Literals.COOKBOOK_VERSION__DEPENDS);
            childrenFeatures.add(CookbookPackage.Literals.COOKBOOK_VERSION__RECIPES);
            childrenFeatures.add(CookbookPackage.Literals.COOKBOOK_VERSION__DEFINITIONS);
            childrenFeatures.add(CookbookPackage.Literals.COOKBOOK_VERSION__FILES);
            childrenFeatures.add(CookbookPackage.Literals.COOKBOOK_VERSION__RESOURCES);
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
     * This returns CookbookVersion.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CookbookVersion"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((CookbookVersion)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_CookbookVersion_type") :
            getString("_UI_CookbookVersion_type") + " " + label;
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

        switch (notification.getFeatureID(CookbookVersion.class)) {
            case CookbookPackage.COOKBOOK_VERSION__NAME:
            case CookbookPackage.COOKBOOK_VERSION__DESCRIPTION:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case CookbookPackage.COOKBOOK_VERSION__RECIPES:
            case CookbookPackage.COOKBOOK_VERSION__DEFINITIONS:
            case CookbookPackage.COOKBOOK_VERSION__FILES:
            case CookbookPackage.COOKBOOK_VERSION__RESOURCES:
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
                (CookbookPackage.Literals.COOKBOOK_VERSION__DEPENDS,
                 CookbookFactory.eINSTANCE.createCookbookVersion()));

        newChildDescriptors.add
            (createChildParameter
                (CookbookPackage.Literals.COOKBOOK_VERSION__RECIPES,
                 CookbookFactory.eINSTANCE.createRecipe()));

        newChildDescriptors.add
            (createChildParameter
                (CookbookPackage.Literals.COOKBOOK_VERSION__DEFINITIONS,
                 CookbookFactory.eINSTANCE.createDefinition()));

        newChildDescriptors.add
            (createChildParameter
                (CookbookPackage.Literals.COOKBOOK_VERSION__FILES,
                 CookbookFactory.eINSTANCE.createFile()));

        newChildDescriptors.add
            (createChildParameter
                (CookbookPackage.Literals.COOKBOOK_VERSION__RESOURCES,
                 CookbookFactory.eINSTANCE.createResource()));

        newChildDescriptors.add
            (createChildParameter
                (CookbookPackage.Literals.COOKBOOK_VERSION__RESOURCES,
                 CookbookFactory.eINSTANCE.createFile()));
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
            childFeature == CookbookPackage.Literals.COOKBOOK_VERSION__FILES ||
            childFeature == CookbookPackage.Literals.COOKBOOK_VERSION__RESOURCES;

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
        return ((IChildCreationExtender)adapterFactory).getResourceLocator();
    }

}
