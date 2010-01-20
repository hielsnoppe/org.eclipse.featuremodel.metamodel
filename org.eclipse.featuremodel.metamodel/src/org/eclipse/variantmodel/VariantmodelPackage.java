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
	 * The feature id for the '<em><b>Featuremodels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_MODEL__FEATUREMODELS = 3;

	/**
	 * The feature id for the '<em><b>Selections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_MODEL__SELECTIONS = 4;

	/**
	 * The feature id for the '<em><b>Concretemodels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_MODEL__CONCRETEMODELS = 5;

	/**
	 * The number of structural features of the '<em>Variant Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_MODEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.variantmodel.impl.SelectionImpl <em>Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.variantmodel.impl.SelectionImpl
	 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getSelection()
	 * @generated
	 */
	int SELECTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Bounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__BOUNDED = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__STATE = 2;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__SELECTOR = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION__VALUES = 6;

	/**
	 * The number of structural features of the '<em>Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.variantmodel.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.variantmodel.impl.ValueImpl
	 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ID = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 3;

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
	 * Returns the meta object for the reference list '{@link org.eclipse.variantmodel.VariantModel#getFeaturemodels <em>Featuremodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Featuremodels</em>'.
	 * @see org.eclipse.variantmodel.VariantModel#getFeaturemodels()
	 * @see #getVariantModel()
	 * @generated
	 */
	EReference getVariantModel_Featuremodels();

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
	 * Returns the meta object for the reference list '{@link org.eclipse.variantmodel.VariantModel#getConcretemodels <em>Concretemodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Concretemodels</em>'.
	 * @see org.eclipse.variantmodel.VariantModel#getConcretemodels()
	 * @see #getVariantModel()
	 * @generated
	 */
	EReference getVariantModel_Concretemodels();

	/**
	 * Returns the meta object for class '{@link org.eclipse.variantmodel.Selection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection</em>'.
	 * @see org.eclipse.variantmodel.Selection
	 * @generated
	 */
	EClass getSelection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.variantmodel.Selection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.variantmodel.Selection#getId()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.variantmodel.Selection#isBounded <em>Bounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounded</em>'.
	 * @see org.eclipse.variantmodel.Selection#isBounded()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_Bounded();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.variantmodel.Selection#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.eclipse.variantmodel.Selection#getState()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_State();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.variantmodel.Selection#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see org.eclipse.variantmodel.Selection#getSelector()
	 * @see #getSelection()
	 * @generated
	 */
	EAttribute getSelection_Selector();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.variantmodel.Selection#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.eclipse.variantmodel.Selection#getAttributes()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Attributes();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.variantmodel.Selection#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.variantmodel.Selection#getFeature()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Feature();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.variantmodel.Selection#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.eclipse.variantmodel.Selection#getValues()
	 * @see #getSelection()
	 * @generated
	 */
	EReference getSelection_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.variantmodel.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.eclipse.variantmodel.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.variantmodel.Value#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.variantmodel.Value#getId()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.variantmodel.Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.variantmodel.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.variantmodel.Value#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see org.eclipse.variantmodel.Value#getAttribute()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Attribute();

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
		 * The meta object literal for the '<em><b>Featuremodels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_MODEL__FEATUREMODELS = eINSTANCE.getVariantModel_Featuremodels();

		/**
		 * The meta object literal for the '<em><b>Selections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_MODEL__SELECTIONS = eINSTANCE.getVariantModel_Selections();

		/**
		 * The meta object literal for the '<em><b>Concretemodels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANT_MODEL__CONCRETEMODELS = eINSTANCE.getVariantModel_Concretemodels();

		/**
		 * The meta object literal for the '{@link org.eclipse.variantmodel.impl.SelectionImpl <em>Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.variantmodel.impl.SelectionImpl
		 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getSelection()
		 * @generated
		 */
		EClass SELECTION = eINSTANCE.getSelection();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__ID = eINSTANCE.getSelection_Id();

		/**
		 * The meta object literal for the '<em><b>Bounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__BOUNDED = eINSTANCE.getSelection_Bounded();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__STATE = eINSTANCE.getSelection_State();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTION__SELECTOR = eINSTANCE.getSelection_Selector();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__ATTRIBUTES = eINSTANCE.getSelection_Attributes();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__FEATURE = eINSTANCE.getSelection_Feature();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTION__VALUES = eINSTANCE.getSelection_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.variantmodel.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.variantmodel.impl.ValueImpl
		 * @see org.eclipse.variantmodel.impl.VariantmodelPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__ID = eINSTANCE.getValue_Id();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__ATTRIBUTE = eINSTANCE.getValue_Attribute();

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
