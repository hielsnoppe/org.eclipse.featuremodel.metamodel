/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.variantmodel;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.featuremodel.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.variantmodel.VariantSelection#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.VariantSelection#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.variantmodel.VariantmodelPackage#getVariantSelection()
 * @model
 * @generated
 */
public interface VariantSelection extends EObject {
  /**
   * Returns the value of the '<em><b>State</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.variantmodel.SelectionState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' attribute.
   * @see org.eclipse.variantmodel.SelectionState
   * @see #setState(SelectionState)
   * @see org.eclipse.variantmodel.VariantmodelPackage#getVariantSelection_State()
   * @model required="true"
   * @generated
   */
  SelectionState getState();

  /**
   * Sets the value of the '{@link org.eclipse.variantmodel.VariantSelection#getState <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' attribute.
   * @see org.eclipse.variantmodel.SelectionState
   * @see #getState()
   * @generated
   */
  void setState(SelectionState value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(Feature)
   * @see org.eclipse.variantmodel.VariantmodelPackage#getVariantSelection_Feature()
   * @model required="true"
   * @generated
   */
  Feature getFeature();

  /**
   * Sets the value of the '{@link org.eclipse.variantmodel.VariantSelection#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Feature value);

} // VariantSelection
