/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.variantmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.variantmodel.VariantmodelFactory
 * @model kind="package"
 * @generated
 */
public interface VariantmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "variantmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/variantmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "variantmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariantmodelPackage eINSTANCE = org.eclipse.variantmodel.impl.VariantmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.variantmodel.impl.VariantModelImpl <em>Variant Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.variantmodel.impl.VariantModelImpl
	 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getVariantModel()
	 * @generated
	 */
	int VARIANT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_MODEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_MODEL__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_MODEL__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Featuremodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_MODEL__FEATUREMODEL = 3;

	/**
	 * The feature id for the '<em><b>Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_MODEL__SELECTIONS = 4;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_MODEL__VALUES = 5;

	/**
	 * The number of structural features of the '<em>Variant Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_MODEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.variantmodel.impl.FeatureSelectionImpl <em>Feature Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.variantmodel.impl.FeatureSelectionImpl
	 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getFeatureSelection()
	 * @generated
	 */
	int FEATURE_SELECTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION__BOUND = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION__STATE = 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION__FEATURE = 3;

	/**
	 * The number of structural features of the '<em>Feature Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.variantmodel.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.variantmodel.impl.AttributeValueImpl
	 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getAttributeValue()
	 * @generated
	 */
	int ATTRIBUTE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__ID = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.variantmodel.SelectionState <em>Selection State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.variantmodel.SelectionState
	 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getSelectionState()
	 * @generated
	 */
	int SELECTION_STATE = 3;

	/**
	 * The meta object id for the '<em>ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getID()
	 * @generated
	 */
	int ID = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.variantmodel.VariantModel <em>Variant Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant Model</em>'.
	 * @see org.eclipse.variantmodel.VariantModel
	 * @generated
	 */
	EClass getVariantModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.variantmodel.VariantModel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.variantmodel.VariantModel#getId()
	 * @see #getVariantModel()
	 * @generated
	 */
	EAttribute getVariantModel_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.variantmodel.VariantModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.variantmodel.VariantModel#getVersion()
	 * @see #getVariantModel()
	 * @generated
	 */
	EAttribute getVariantModel_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.variantmodel.VariantModel#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.variantmodel.VariantModel#getAttributes()
	 * @see #getVariantModel()
	 * @generated
	 */
	EReference getVariantModel_Attributes();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.variantmodel.VariantModel#getFeaturemodel <em>Featuremodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Featuremodel</em>'.
	 * @see org.eclipse.variantmodel.VariantModel#getFeaturemodel()
	 * @see #getVariantModel()
	 * @generated
	 */
	EReference getVariantModel_Featuremodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.variantmodel.VariantModel#getSelections <em>Selections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selections</em>'.
	 * @see org.eclipse.variantmodel.VariantModel#getSelections()
	 * @see #getVariantModel()
	 * @generated
	 */
	EReference getVariantModel_Selections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.variantmodel.VariantModel#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.eclipse.variantmodel.VariantModel#getValues()
	 * @see #getVariantModel()
	 * @generated
	 */
	EReference getVariantModel_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.variantmodel.FeatureSelection <em>Feature Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Selection</em>'.
	 * @see org.eclipse.variantmodel.FeatureSelection
	 * @generated
	 */
	EClass getFeatureSelection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.variantmodel.FeatureSelection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.variantmodel.FeatureSelection#getId()
	 * @see #getFeatureSelection()
	 * @generated
	 */
	EAttribute getFeatureSelection_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.variantmodel.FeatureSelection#isBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see org.eclipse.variantmodel.FeatureSelection#isBound()
	 * @see #getFeatureSelection()
	 * @generated
	 */
	EAttribute getFeatureSelection_Bound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.variantmodel.FeatureSelection#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.variantmodel.FeatureSelection#getState()
	 * @see #getFeatureSelection()
	 * @generated
	 */
	EAttribute getFeatureSelection_State();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.variantmodel.FeatureSelection#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.variantmodel.FeatureSelection#getFeature()
	 * @see #getFeatureSelection()
	 * @generated
	 */
	EReference getFeatureSelection_Feature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.variantmodel.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value</em>'.
	 * @see org.eclipse.variantmodel.AttributeValue
	 * @generated
	 */
	EClass getAttributeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.variantmodel.AttributeValue#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.variantmodel.AttributeValue#getId()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EAttribute getAttributeValue_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.variantmodel.AttributeValue#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see org.eclipse.variantmodel.AttributeValue#getAttribute()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EReference getAttributeValue_Attribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.variantmodel.AttributeValue#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.eclipse.variantmodel.AttributeValue#getContent()
	 * @see #getAttributeValue()
	 * @generated
	 */
	EReference getAttributeValue_Content();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.variantmodel.SelectionState <em>Selection State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Selection State</em>'.
	 * @see org.eclipse.variantmodel.SelectionState
	 * @generated
	 */
	EEnum getSelectionState();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VariantmodelFactory getVariantmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.variantmodel.impl.VariantModelImpl <em>Variant Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.variantmodel.impl.VariantModelImpl
		 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getVariantModel()
		 * @generated
		 */
		EClass VARIANT_MODEL = eINSTANCE.getVariantModel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT_MODEL__ID = eINSTANCE.getVariantModel_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT_MODEL__VERSION = eINSTANCE.getVariantModel_Version();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_MODEL__ATTRIBUTES = eINSTANCE.getVariantModel_Attributes();

		/**
		 * The meta object literal for the '<em><b>Featuremodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_MODEL__FEATUREMODEL = eINSTANCE.getVariantModel_Featuremodel();

		/**
		 * The meta object literal for the '<em><b>Selections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_MODEL__SELECTIONS = eINSTANCE.getVariantModel_Selections();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_MODEL__VALUES = eINSTANCE.getVariantModel_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.variantmodel.impl.FeatureSelectionImpl <em>Feature Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.variantmodel.impl.FeatureSelectionImpl
		 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getFeatureSelection()
		 * @generated
		 */
		EClass FEATURE_SELECTION = eINSTANCE.getFeatureSelection();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SELECTION__ID = eINSTANCE.getFeatureSelection_Id();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SELECTION__BOUND = eINSTANCE.getFeatureSelection_Bound();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SELECTION__STATE = eINSTANCE.getFeatureSelection_State();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_SELECTION__FEATURE = eINSTANCE.getFeatureSelection_Feature();

		/**
		 * The meta object literal for the '{@link org.eclipse.variantmodel.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.variantmodel.impl.AttributeValueImpl
		 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getAttributeValue()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE__ID = eINSTANCE.getAttributeValue_Id();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE__ATTRIBUTE = eINSTANCE.getAttributeValue_Attribute();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE__CONTENT = eINSTANCE.getAttributeValue_Content();

		/**
		 * The meta object literal for the '{@link org.eclipse.variantmodel.SelectionState <em>Selection State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.variantmodel.SelectionState
		 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getSelectionState()
		 * @generated
		 */
		EEnum SELECTION_STATE = eINSTANCE.getSelectionState();

		/**
		 * The meta object literal for the '<em>ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getID()
		 * @generated
		 */
		EDataType ID = eINSTANCE.getID();

	}

} //VariantmodelPackage
