/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.featuremodel.provider;

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

import org.eclipse.featuremodel.util.FeatureModelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureModelItemProviderAdapterFactory extends FeatureModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
  public FeatureModelItemProviderAdapterFactory() {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.Rule} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleItemProvider ruleItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.Rule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createRuleAdapter() {
    if (ruleItemProvider == null) {
      ruleItemProvider = new RuleItemProvider(this);
    }

    return ruleItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.FeatureModel} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureModelItemProvider featureModelItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.FeatureModel}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createFeatureModelAdapter() {
    if (featureModelItemProvider == null) {
      featureModelItemProvider = new FeatureModelItemProvider(this);
    }

    return featureModelItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.Constraint} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintItemProvider constraintItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.Constraint}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createConstraintAdapter() {
    if (constraintItemProvider == null) {
      constraintItemProvider = new ConstraintItemProvider(this);
    }

    return constraintItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.Group} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupItemProvider groupItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.Group}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createGroupAdapter() {
    if (groupItemProvider == null) {
      groupItemProvider = new GroupItemProvider(this);
    }

    return groupItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.Feature} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureItemProvider featureItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createFeatureAdapter() {
    if (featureItemProvider == null) {
      featureItemProvider = new FeatureItemProvider(this);
    }

    return featureItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.Attribute} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeItemProvider attributeItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAttributeAdapter() {
    if (attributeItemProvider == null) {
      attributeItemProvider = new AttributeItemProvider(this);
    }

    return attributeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.Description} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DescriptionItemProvider descriptionItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.Description}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createDescriptionAdapter() {
    if (descriptionItemProvider == null) {
      descriptionItemProvider = new DescriptionItemProvider(this);
    }

    return descriptionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.AttributeTypeInt} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeTypeIntItemProvider attributeTypeIntItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.AttributeTypeInt}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAttributeTypeIntAdapter() {
    if (attributeTypeIntItemProvider == null) {
      attributeTypeIntItemProvider = new AttributeTypeIntItemProvider(this);
    }

    return attributeTypeIntItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.AttributeTypeString} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeTypeStringItemProvider attributeTypeStringItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.AttributeTypeString}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAttributeTypeStringAdapter() {
    if (attributeTypeStringItemProvider == null) {
      attributeTypeStringItemProvider = new AttributeTypeStringItemProvider(this);
    }

    return attributeTypeStringItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.AttributeTypeBoolean} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeTypeBooleanItemProvider attributeTypeBooleanItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.AttributeTypeBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAttributeTypeBooleanAdapter() {
    if (attributeTypeBooleanItemProvider == null) {
      attributeTypeBooleanItemProvider = new AttributeTypeBooleanItemProvider(this);
    }

    return attributeTypeBooleanItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.AttributeTypeEObject} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeTypeEObjectItemProvider attributeTypeEObjectItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.AttributeTypeEObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAttributeTypeEObjectAdapter() {
    if (attributeTypeEObjectItemProvider == null) {
      attributeTypeEObjectItemProvider = new AttributeTypeEObjectItemProvider(this);
    }

    return attributeTypeEObjectItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.AttributeValueInt} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeValueIntItemProvider attributeValueIntItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.AttributeValueInt}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAttributeValueIntAdapter() {
    if (attributeValueIntItemProvider == null) {
      attributeValueIntItemProvider = new AttributeValueIntItemProvider(this);
    }

    return attributeValueIntItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.AttributeValueString} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeValueStringItemProvider attributeValueStringItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.AttributeValueString}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAttributeValueStringAdapter() {
    if (attributeValueStringItemProvider == null) {
      attributeValueStringItemProvider = new AttributeValueStringItemProvider(this);
    }

    return attributeValueStringItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.AttributeValueBoolean} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeValueBooleanItemProvider attributeValueBooleanItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.AttributeValueBoolean}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAttributeValueBooleanAdapter() {
    if (attributeValueBooleanItemProvider == null) {
      attributeValueBooleanItemProvider = new AttributeValueBooleanItemProvider(this);
    }

    return attributeValueBooleanItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.featuremodel.AttributeValueEObject} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeValueEObjectItemProvider attributeValueEObjectItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.featuremodel.AttributeValueEObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAttributeValueEObjectAdapter() {
    if (attributeValueEObjectItemProvider == null) {
      attributeValueEObjectItemProvider = new AttributeValueEObjectItemProvider(this);
    }

    return attributeValueEObjectItemProvider;
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
      if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
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
    if (ruleItemProvider != null) ruleItemProvider.dispose();
    if (featureModelItemProvider != null) featureModelItemProvider.dispose();
    if (constraintItemProvider != null) constraintItemProvider.dispose();
    if (groupItemProvider != null) groupItemProvider.dispose();
    if (featureItemProvider != null) featureItemProvider.dispose();
    if (attributeItemProvider != null) attributeItemProvider.dispose();
    if (descriptionItemProvider != null) descriptionItemProvider.dispose();
    if (attributeTypeIntItemProvider != null) attributeTypeIntItemProvider.dispose();
    if (attributeTypeStringItemProvider != null) attributeTypeStringItemProvider.dispose();
    if (attributeTypeBooleanItemProvider != null) attributeTypeBooleanItemProvider.dispose();
    if (attributeTypeEObjectItemProvider != null) attributeTypeEObjectItemProvider.dispose();
    if (attributeValueIntItemProvider != null) attributeValueIntItemProvider.dispose();
    if (attributeValueStringItemProvider != null) attributeValueStringItemProvider.dispose();
    if (attributeValueBooleanItemProvider != null) attributeValueBooleanItemProvider.dispose();
    if (attributeValueEObjectItemProvider != null) attributeValueEObjectItemProvider.dispose();
  }

}