/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.variantmodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

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

import org.eclipse.featuremodel.FeatureModelFactory;

import org.eclipse.featuremodel.provider.FeatureModelEditPlugin;

import org.eclipse.variantmodel.AttributeValue;
import org.eclipse.variantmodel.VariantModelFactory;
import org.eclipse.variantmodel.VariantModelPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.variantmodel.AttributeValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeValueItemProvider
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
  public AttributeValueItemProvider(AdapterFactory adapterFactory) {
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

      addIdPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Id feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIdPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_AttributeValue_id_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_AttributeValue_id_feature", "_UI_AttributeValue_type"),
         VariantModelPackage.Literals.ATTRIBUTE_VALUE__ID,
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
      childrenFeatures.add(VariantModelPackage.Literals.ATTRIBUTE_VALUE__ATTRIBUTE);
      childrenFeatures.add(VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT);
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
   * This returns AttributeValue.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/AttributeValue"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    String label = ((AttributeValue)object).getId();
    return label == null || label.length() == 0 ?
      getString("_UI_AttributeValue_type") :
      getString("_UI_AttributeValue_type") + " " + label;
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

    switch (notification.getFeatureID(AttributeValue.class)) {
      case VariantModelPackage.ATTRIBUTE_VALUE__ID:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case VariantModelPackage.ATTRIBUTE_VALUE__ATTRIBUTE:
      case VariantModelPackage.ATTRIBUTE_VALUE__CONTENT:
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
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__ATTRIBUTE,
         FeatureModelFactory.eINSTANCE.createAttribute()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         VariantModelFactory.eINSTANCE.createVariantSelection()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         VariantModelFactory.eINSTANCE.createVariantModel()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         VariantModelFactory.eINSTANCE.createFeatureSelection()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         VariantModelFactory.eINSTANCE.createAttributeValue()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createRule()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createFeatureModel()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createConstraint()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createGroup()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createFeature()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createAttribute()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createDescription()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createAttributeTypeInt()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createAttributeTypeString()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createAttributeTypeBoolean()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createAttributeTypeEObject()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createAttributeValueInt()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createAttributeValueString()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createAttributeValueBoolean()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         FeatureModelFactory.eINSTANCE.createAttributeValueEObject()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createEObject()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createEAttribute()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createEAnnotation()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createEClass()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createEDataType()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createEEnum()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createEEnumLiteral()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createEFactory()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createEOperation()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createEPackage()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createEParameter()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createEReference()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.create(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY)));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createEGenericType()));

    newChildDescriptors.add
      (createChildParameter
        (VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT,
         EcoreFactory.eINSTANCE.createETypeParameter()));
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
      childFeature == VariantModelPackage.Literals.ATTRIBUTE_VALUE__ATTRIBUTE ||
      childFeature == VariantModelPackage.Literals.ATTRIBUTE_VALUE__CONTENT;

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
    return FeatureModelEditPlugin.INSTANCE;
  }

}
