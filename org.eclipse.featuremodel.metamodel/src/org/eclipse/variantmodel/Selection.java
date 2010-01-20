/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.variantmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.featuremodel.Attribute;
import org.eclipse.featuremodel.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.variantmodel.Selection#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.Selection#isBounded <em>Bounded</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.Selection#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.Selection#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.Selection#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.Selection#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.Selection#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.variantmodel.VariantmodelPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends EObject {
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
	 * @see org.eclipse.variantmodel.VariantmodelPackage#getSelection_Id()
	 * @model id="true" dataType="org.eclipse.variantmodel.ID" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.variantmodel.Selection#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Bounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounded</em>' attribute.
	 * @see #setBounded(boolean)
	 * @see org.eclipse.variantmodel.VariantmodelPackage#getSelection_Bounded()
	 * @model
	 * @generated
	 */
	boolean isBounded();

	/**
	 * Sets the value of the '{@link org.eclipse.variantmodel.Selection#isBounded <em>Bounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounded</em>' attribute.
	 * @see #isBounded()
	 * @generated
	 */
	void setBounded(boolean value);

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
	 * @see org.eclipse.variantmodel.VariantmodelPackage#getSelection_State()
	 * @model required="true"
	 * @generated
	 */
	SelectionState getState();

	/**
	 * Sets the value of the '{@link org.eclipse.variantmodel.Selection#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.eclipse.variantmodel.SelectionState
	 * @see #getState()
	 * @generated
	 */
	void setState(SelectionState value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see org.eclipse.variantmodel.VariantmodelPackage#getSelection_Selector()
	 * @model required="true"
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link org.eclipse.variantmodel.Selection#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.featuremodel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.eclipse.variantmodel.VariantmodelPackage#getSelection_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

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
	 * @see org.eclipse.variantmodel.VariantmodelPackage#getSelection_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.variantmodel.Selection#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.variantmodel.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.eclipse.variantmodel.VariantmodelPackage#getSelection_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	VariantModel getModel();

} // Selection
