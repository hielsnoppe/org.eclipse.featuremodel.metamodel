/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.resultmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.featuremodel.FeatureModel;

import org.eclipse.resultmodel.ResultModel;
import org.eclipse.resultmodel.ResultSelection;
import org.eclipse.resultmodel.ResultmodelPackage;

import org.eclipse.variantmodel.VariantModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.resultmodel.impl.ResultModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.resultmodel.impl.ResultModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.resultmodel.impl.ResultModelImpl#getVariantModel <em>Variant Model</em>}</li>
 *   <li>{@link org.eclipse.resultmodel.impl.ResultModelImpl#getSelections <em>Selections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultModelImpl extends EObjectImpl implements ResultModel {
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
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariantModel() <em>Variant Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariantModel()
   * @generated
   * @ordered
   */
  protected VariantModel variantModel;

  /**
   * The cached value of the '{@link #getSelections() <em>Selections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelections()
   * @generated
   * @ordered
   */
  protected EList<ResultSelection> selections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResultModelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ResultmodelPackage.Literals.RESULT_MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ResultmodelPackage.RESULT_MODEL__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion() {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion) {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultmodelPackage.RESULT_MODEL__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantModel getVariantModel() {
    if (variantModel != null && variantModel.eIsProxy()) {
      InternalEObject oldVariantModel = (InternalEObject)variantModel;
      variantModel = (VariantModel)eResolveProxy(oldVariantModel);
      if (variantModel != oldVariantModel) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ResultmodelPackage.RESULT_MODEL__VARIANT_MODEL, oldVariantModel, variantModel));
      }
    }
    return variantModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariantModel basicGetVariantModel() {
    return variantModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariantModel(VariantModel newVariantModel) {
    VariantModel oldVariantModel = variantModel;
    variantModel = newVariantModel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ResultmodelPackage.RESULT_MODEL__VARIANT_MODEL, oldVariantModel, variantModel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ResultSelection> getSelections() {
    if (selections == null) {
      selections = new EObjectContainmentEList<ResultSelection>(ResultSelection.class, this, ResultmodelPackage.RESULT_MODEL__SELECTIONS);
    }
    return selections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FeatureModel> getConcreteModels() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case ResultmodelPackage.RESULT_MODEL__SELECTIONS:
        return ((InternalEList<?>)getSelections()).basicRemove(otherEnd, msgs);
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
      case ResultmodelPackage.RESULT_MODEL__ID:
        return getId();
      case ResultmodelPackage.RESULT_MODEL__VERSION:
        return getVersion();
      case ResultmodelPackage.RESULT_MODEL__VARIANT_MODEL:
        if (resolve) return getVariantModel();
        return basicGetVariantModel();
      case ResultmodelPackage.RESULT_MODEL__SELECTIONS:
        return getSelections();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case ResultmodelPackage.RESULT_MODEL__ID:
        setId((String)newValue);
        return;
      case ResultmodelPackage.RESULT_MODEL__VERSION:
        setVersion((String)newValue);
        return;
      case ResultmodelPackage.RESULT_MODEL__VARIANT_MODEL:
        setVariantModel((VariantModel)newValue);
        return;
      case ResultmodelPackage.RESULT_MODEL__SELECTIONS:
        getSelections().clear();
        getSelections().addAll((Collection<? extends ResultSelection>)newValue);
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
      case ResultmodelPackage.RESULT_MODEL__ID:
        setId(ID_EDEFAULT);
        return;
      case ResultmodelPackage.RESULT_MODEL__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case ResultmodelPackage.RESULT_MODEL__VARIANT_MODEL:
        setVariantModel((VariantModel)null);
        return;
      case ResultmodelPackage.RESULT_MODEL__SELECTIONS:
        getSelections().clear();
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
      case ResultmodelPackage.RESULT_MODEL__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ResultmodelPackage.RESULT_MODEL__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case ResultmodelPackage.RESULT_MODEL__VARIANT_MODEL:
        return variantModel != null;
      case ResultmodelPackage.RESULT_MODEL__SELECTIONS:
        return selections != null && !selections.isEmpty();
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
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //ResultModelImpl
