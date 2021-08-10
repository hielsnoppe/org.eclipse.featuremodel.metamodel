/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.featuremodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.featuremodel.Constraint#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.featuremodel.Constraint#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.featuremodel.Constraint#getLeftSideFeature <em>Left Side Feature</em>}</li>
 *   <li>{@link org.eclipse.featuremodel.Constraint#getRightSideFeature <em>Right Side Feature</em>}</li>
 *   <li>{@link org.eclipse.featuremodel.Constraint#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @see org.eclipse.featuremodel.FeatureModelPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends Rule {
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
	 * @see org.eclipse.featuremodel.FeatureModelPackage#getConstraint_Id()
	 * @model id="true" dataType="org.eclipse.featuremodel.ID" required="true"
	 * @generated
	 */
  String getId();

  /**
	 * Sets the value of the '{@link org.eclipse.featuremodel.Constraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
  void setId(String value);

  /**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see org.eclipse.featuremodel.FeatureModelPackage#getConstraint_Description()
	 * @model containment="true"
	 * @generated
	 */
  Description getDescription();

  /**
	 * Sets the value of the '{@link org.eclipse.featuremodel.Constraint#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(Description value);

  /**
	 * Returns the value of the '<em><b>Left Side Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Side Feature</em>' reference.
	 * @see #setLeftSideFeature(Feature)
	 * @see org.eclipse.featuremodel.FeatureModelPackage#getConstraint_LeftSideFeature()
	 * @model
	 * @generated
	 */
	Feature getLeftSideFeature();

		/**
	 * Sets the value of the '{@link org.eclipse.featuremodel.Constraint#getLeftSideFeature <em>Left Side Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Side Feature</em>' reference.
	 * @see #getLeftSideFeature()
	 * @generated
	 */
	void setLeftSideFeature(Feature value);

		/**
	 * Returns the value of the '<em><b>Right Side Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Side Feature</em>' reference.
	 * @see #setRightSideFeature(Feature)
	 * @see org.eclipse.featuremodel.FeatureModelPackage#getConstraint_RightSideFeature()
	 * @model
	 * @generated
	 */
	Feature getRightSideFeature();

		/**
	 * Sets the value of the '{@link org.eclipse.featuremodel.Constraint#getRightSideFeature <em>Right Side Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Side Feature</em>' reference.
	 * @see #getRightSideFeature()
	 * @generated
	 */
	void setRightSideFeature(Feature value);

		/**
	 * Returns the value of the '<em><b>Relationship</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.featuremodel.ConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' attribute.
	 * @see org.eclipse.featuremodel.ConstraintType
	 * @see #setRelationship(ConstraintType)
	 * @see org.eclipse.featuremodel.FeatureModelPackage#getConstraint_Relationship()
	 * @model
	 * @generated
	 */
	ConstraintType getRelationship();

		/**
	 * Sets the value of the '{@link org.eclipse.featuremodel.Constraint#getRelationship <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' attribute.
	 * @see org.eclipse.featuremodel.ConstraintType
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(ConstraintType value);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
  FeatureModel getModel();

} // Constraint
