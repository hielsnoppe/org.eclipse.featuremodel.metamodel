/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.variantmodel;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.featuremodel.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.variantmodel.AttributeValue#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.AttributeValue#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.AttributeValue#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.variantmodel.VariantModelPackage#getAttributeValue()
 * @model
 * @generated
 */
public interface AttributeValue extends EObject {
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
   * @see org.eclipse.variantmodel.VariantModelPackage#getAttributeValue_Id()
   * @model id="true" dataType="org.eclipse.variantmodel.ID" required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.eclipse.variantmodel.AttributeValue#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(Attribute)
   * @see org.eclipse.variantmodel.VariantModelPackage#getAttributeValue_Attribute()
   * @model containment="true" required="true"
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link org.eclipse.variantmodel.AttributeValue#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(EObject)
   * @see org.eclipse.variantmodel.VariantModelPackage#getAttributeValue_Content()
   * @model containment="true" required="true"
   * @generated
   */
  EObject getContent();

  /**
   * Sets the value of the '{@link org.eclipse.variantmodel.AttributeValue#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(EObject value);

} // AttributeValue
