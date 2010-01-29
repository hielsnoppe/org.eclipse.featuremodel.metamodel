/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.featuremodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.featuremodel.Attribute;
import org.eclipse.featuremodel.AttributeType;
import org.eclipse.featuremodel.AttributeValue;
import org.eclipse.featuremodel.Description;
import org.eclipse.featuremodel.FeatureModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.featuremodel.impl.AttributeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.featuremodel.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.featuremodel.impl.AttributeImpl#isSetable <em>Setable</em>}</li>
 *   <li>{@link org.eclipse.featuremodel.impl.AttributeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.featuremodel.impl.AttributeImpl#getDefaultvalue <em>Defaultvalue</em>}</li>
 *   <li>{@link org.eclipse.featuremodel.impl.AttributeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends EObjectImpl implements Attribute {
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isSetable() <em>Setable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetable()
   * @generated
   * @ordered
   */
  protected static final boolean SETABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSetable() <em>Setable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetable()
   * @generated
   * @ordered
   */
  protected boolean setable = SETABLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected Description description;

  /**
   * The cached value of the '{@link #getDefaultvalue() <em>Defaultvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultvalue()
   * @generated
   * @ordered
   */
  protected AttributeValue defaultvalue;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AttributeType type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return FeatureModelPackage.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId() {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId) {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.ATTRIBUTE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetable() {
    return setable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSetable(boolean newSetable) {
    boolean oldSetable = setable;
    setable = newSetable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.ATTRIBUTE__SETABLE, oldSetable, setable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description getDescription() {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs) {
    Description oldDescription = description;
    description = newDescription;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureModelPackage.ATTRIBUTE__DESCRIPTION, oldDescription, newDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(Description newDescription) {
    if (newDescription != description) {
      NotificationChain msgs = null;
      if (description != null)
        msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.ATTRIBUTE__DESCRIPTION, null, msgs);
      if (newDescription != null)
        msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.ATTRIBUTE__DESCRIPTION, null, msgs);
      msgs = basicSetDescription(newDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.ATTRIBUTE__DESCRIPTION, newDescription, newDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeValue getDefaultvalue() {
    return defaultvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultvalue(AttributeValue newDefaultvalue, NotificationChain msgs) {
    AttributeValue oldDefaultvalue = defaultvalue;
    defaultvalue = newDefaultvalue;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureModelPackage.ATTRIBUTE__DEFAULTVALUE, oldDefaultvalue, newDefaultvalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultvalue(AttributeValue newDefaultvalue) {
    if (newDefaultvalue != defaultvalue) {
      NotificationChain msgs = null;
      if (defaultvalue != null)
        msgs = ((InternalEObject)defaultvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.ATTRIBUTE__DEFAULTVALUE, null, msgs);
      if (newDefaultvalue != null)
        msgs = ((InternalEObject)newDefaultvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.ATTRIBUTE__DEFAULTVALUE, null, msgs);
      msgs = basicSetDefaultvalue(newDefaultvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.ATTRIBUTE__DEFAULTVALUE, newDefaultvalue, newDefaultvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeType getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(AttributeType newType, NotificationChain msgs) {
    AttributeType oldType = type;
    type = newType;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureModelPackage.ATTRIBUTE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(AttributeType newType) {
    if (newType != type) {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.ATTRIBUTE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.ATTRIBUTE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.ATTRIBUTE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case FeatureModelPackage.ATTRIBUTE__DESCRIPTION:
        return basicSetDescription(null, msgs);
      case FeatureModelPackage.ATTRIBUTE__DEFAULTVALUE:
        return basicSetDefaultvalue(null, msgs);
      case FeatureModelPackage.ATTRIBUTE__TYPE:
        return basicSetType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case FeatureModelPackage.ATTRIBUTE__ID:
        return getId();
      case FeatureModelPackage.ATTRIBUTE__NAME:
        return getName();
      case FeatureModelPackage.ATTRIBUTE__SETABLE:
        return isSetable() ? Boolean.TRUE : Boolean.FALSE;
      case FeatureModelPackage.ATTRIBUTE__DESCRIPTION:
        return getDescription();
      case FeatureModelPackage.ATTRIBUTE__DEFAULTVALUE:
        return getDefaultvalue();
      case FeatureModelPackage.ATTRIBUTE__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case FeatureModelPackage.ATTRIBUTE__ID:
        setId((String)newValue);
        return;
      case FeatureModelPackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case FeatureModelPackage.ATTRIBUTE__SETABLE:
        setSetable(((Boolean)newValue).booleanValue());
        return;
      case FeatureModelPackage.ATTRIBUTE__DESCRIPTION:
        setDescription((Description)newValue);
        return;
      case FeatureModelPackage.ATTRIBUTE__DEFAULTVALUE:
        setDefaultvalue((AttributeValue)newValue);
        return;
      case FeatureModelPackage.ATTRIBUTE__TYPE:
        setType((AttributeType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case FeatureModelPackage.ATTRIBUTE__ID:
        setId(ID_EDEFAULT);
        return;
      case FeatureModelPackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FeatureModelPackage.ATTRIBUTE__SETABLE:
        setSetable(SETABLE_EDEFAULT);
        return;
      case FeatureModelPackage.ATTRIBUTE__DESCRIPTION:
        setDescription((Description)null);
        return;
      case FeatureModelPackage.ATTRIBUTE__DEFAULTVALUE:
        setDefaultvalue((AttributeValue)null);
        return;
      case FeatureModelPackage.ATTRIBUTE__TYPE:
        setType((AttributeType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case FeatureModelPackage.ATTRIBUTE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case FeatureModelPackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FeatureModelPackage.ATTRIBUTE__SETABLE:
        return setable != SETABLE_EDEFAULT;
      case FeatureModelPackage.ATTRIBUTE__DESCRIPTION:
        return description != null;
      case FeatureModelPackage.ATTRIBUTE__DEFAULTVALUE:
        return defaultvalue != null;
      case FeatureModelPackage.ATTRIBUTE__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(", setable: ");
    result.append(setable);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
