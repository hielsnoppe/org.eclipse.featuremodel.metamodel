/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.variantmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.variantmodel.FeatureSelection#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.FeatureSelection#isBound <em>Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.variantmodel.VariantmodelPackage#getFeatureSelection()
 * @model
 * @generated
 */
public interface FeatureSelection extends VariantSelection {
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
   * @see org.eclipse.variantmodel.VariantmodelPackage#getFeatureSelection_Id()
   * @model id="true" dataType="org.eclipse.variantmodel.ID" required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.eclipse.variantmodel.FeatureSelection#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Bound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound</em>' attribute.
   * @see #setBound(boolean)
   * @see org.eclipse.variantmodel.VariantmodelPackage#getFeatureSelection_Bound()
   * @model
   * @generated
   */
  boolean isBound();

  /**
   * Sets the value of the '{@link org.eclipse.variantmodel.FeatureSelection#isBound <em>Bound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound</em>' attribute.
   * @see #isBound()
   * @generated
   */
  void setBound(boolean value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  VariantModel getModel();

} // FeatureSelection
