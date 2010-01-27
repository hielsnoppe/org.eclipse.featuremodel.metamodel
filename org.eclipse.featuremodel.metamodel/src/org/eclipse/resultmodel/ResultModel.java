/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.resultmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.featuremodel.FeatureModel;

import org.eclipse.variantmodel.VariantModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.resultmodel.ResultModel#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.resultmodel.ResultModel#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.resultmodel.ResultModel#getVariantModel <em>Variant Model</em>}</li>
 *   <li>{@link org.eclipse.resultmodel.ResultModel#getSelections <em>Selections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.resultmodel.ResultmodelPackage#getResultModel()
 * @model
 * @generated
 */
public interface ResultModel extends EObject {
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.eclipse.resultmodel.ResultmodelPackage#getResultModel_Id()
   * @model id="true" dataType="org.eclipse.variantmodel.ID" required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.eclipse.resultmodel.ResultModel#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.eclipse.resultmodel.ResultmodelPackage#getResultModel_Version()
   * @model required="true"
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.eclipse.resultmodel.ResultModel#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Variant Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant Model</em>' reference.
   * @see #setVariantModel(VariantModel)
   * @see org.eclipse.resultmodel.ResultmodelPackage#getResultModel_VariantModel()
   * @model required="true"
   * @generated
   */
  VariantModel getVariantModel();

  /**
   * Sets the value of the '{@link org.eclipse.resultmodel.ResultModel#getVariantModel <em>Variant Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant Model</em>' reference.
   * @see #getVariantModel()
   * @generated
   */
  void setVariantModel(VariantModel value);

  /**
   * Returns the value of the '<em><b>Selections</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.resultmodel.ResultSelection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selections</em>' containment reference list.
   * @see org.eclipse.resultmodel.ResultmodelPackage#getResultModel_Selections()
   * @model containment="true"
   * @generated
   */
  EList<ResultSelection> getSelections();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  EList<FeatureModel> getConcreteModels();

} // ResultModel
