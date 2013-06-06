/**
 */
package org.limepepper.chefclipse.json.json.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.limepepper.chefclipse.json.json.JsonFactory;
import org.limepepper.chefclipse.json.json.JsonObject;
import org.limepepper.chefclipse.json.json.JsonObjectValue;
import org.limepepper.chefclipse.json.json.JsonPackage;
import org.limepepper.chefclipse.json.json.Pair;
import org.limepepper.chefclipse.json.provider.JsonEditPlugin;

/**
 * This is the item provider adapter for a {@link org.limepepper.chefclipse.json.json.Pair} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PairItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		IItemColorProvider, IItemFontProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PairItemProvider(AdapterFactory adapterFactory) {
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

			addStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Pair_string_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Pair_string_feature", "_UI_Pair_type"),
				JsonPackage.Literals.PAIR__STRING, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(JsonPackage.Literals.PAIR__VALUE);
		}
		return childrenFeatures;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public Collection<?> getChildren(Object object) {
		Pair pair = (Pair) object;
		if (pair.getValue() != null
				&& pair.getValue() instanceof JsonObjectValue) {
			JsonObject objectValue = ((JsonObjectValue) pair.getValue()).getValue();
			if (objectValue == null) {
			    return Collections.EMPTY_LIST;
			}
			ItemProviderAdapter provider = (ItemProviderAdapter) adapterFactory.adapt(objectValue, JsonObjectItemProvider.class);
			return provider.getChildren(objectValue);
		}
		return super.getChildren(object);
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
	 * This returns Pair.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImageGen(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Pair"));
	}

	/**
	 * This returns Pair.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		Pair pair = (Pair) object;
		if (pair.getValue() != null
				&& pair.getValue() instanceof JsonObjectValue) {
			return overlayImage(object,
					getResourceLocator().getImage("full/obj16/JsonObject"));
		}
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Pair"));
	}
	
	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextGen(Object object) {
		String label = ((Pair) object).getString();
		return label == null || label.length() == 0 ? getString("_UI_Pair_type")
				: getString("_UI_Pair_type") + " " + label;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((Pair) object).getString();
		return label == null || label.length() == 0 ? getString("_UI_Pair_type")
				: label;
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

		switch (notification.getFeatureID(Pair.class)) {
		case JsonPackage.PAIR__STRING:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case JsonPackage.PAIR__VALUE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				JsonPackage.Literals.PAIR__VALUE,
				JsonFactory.eINSTANCE.createValue()));

		newChildDescriptors.add(createChildParameter(
				JsonPackage.Literals.PAIR__VALUE,
				JsonFactory.eINSTANCE.createStringValue()));

		newChildDescriptors.add(createChildParameter(
				JsonPackage.Literals.PAIR__VALUE,
				JsonFactory.eINSTANCE.createNumberValue()));

		newChildDescriptors.add(createChildParameter(
				JsonPackage.Literals.PAIR__VALUE,
				JsonFactory.eINSTANCE.createJsonObjectValue()));

		newChildDescriptors.add(createChildParameter(
				JsonPackage.Literals.PAIR__VALUE,
				JsonFactory.eINSTANCE.createArrayValue()));

		newChildDescriptors.add(createChildParameter(
				JsonPackage.Literals.PAIR__VALUE,
				JsonFactory.eINSTANCE.createBooleanValue()));

		newChildDescriptors.add(createChildParameter(
				JsonPackage.Literals.PAIR__VALUE,
				JsonFactory.eINSTANCE.createNullValue()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return JsonEditPlugin.INSTANCE;
	}

}
