/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.resultmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.variantmodel.VariantmodelPackage;

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
 * @see org.eclipse.resultmodel.ResultmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ResultmodelPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "resultmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/resultmodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "resultmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ResultmodelPackage eINSTANCE = org.eclipse.resultmodel.impl.ResultmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.resultmodel.impl.ResultModelImpl <em>Result Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.resultmodel.impl.ResultModelImpl
   * @see org.eclipse.resultmodel.impl.ResultmodelPackageImpl#getResultModel()
   * @generated
   */
  int RESULT_MODEL = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_MODEL__ID = 0;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_MODEL__VERSION = 1;

  /**
   * The feature id for the '<em><b>Variant Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_MODEL__VARIANT_MODEL = 2;

  /**
   * The feature id for the '<em><b>Selections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_MODEL__SELECTIONS = 3;

  /**
   * The number of structural features of the '<em>Result Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.resultmodel.impl.ResultSelectionImpl <em>Result Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.resultmodel.impl.ResultSelectionImpl
   * @see org.eclipse.resultmodel.impl.ResultmodelPackageImpl#getResultSelection()
   * @generated
   */
  int RESULT_SELECTION = 1;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_SELECTION__STATE = VariantmodelPackage.VARIANT_SELECTION__STATE;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_SELECTION__FEATURE = VariantmodelPackage.VARIANT_SELECTION__FEATURE;

  /**
   * The number of structural features of the '<em>Result Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESULT_SELECTION_FEATURE_COUNT = VariantmodelPackage.VARIANT_SELECTION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.eclipse.resultmodel.ResultModel <em>Result Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Model</em>'.
   * @see org.eclipse.resultmodel.ResultModel
   * @generated
   */
  EClass getResultModel();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.resultmodel.ResultModel#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.eclipse.resultmodel.ResultModel#getId()
   * @see #getResultModel()
   * @generated
   */
  EAttribute getResultModel_Id();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.resultmodel.ResultModel#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.eclipse.resultmodel.ResultModel#getVersion()
   * @see #getResultModel()
   * @generated
   */
  EAttribute getResultModel_Version();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.resultmodel.ResultModel#getVariantModel <em>Variant Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variant Model</em>'.
   * @see org.eclipse.resultmodel.ResultModel#getVariantModel()
   * @see #getResultModel()
   * @generated
   */
  EReference getResultModel_VariantModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.resultmodel.ResultModel#getSelections <em>Selections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selections</em>'.
   * @see org.eclipse.resultmodel.ResultModel#getSelections()
   * @see #getResultModel()
   * @generated
   */
  EReference getResultModel_Selections();

  /**
   * Returns the meta object for class '{@link org.eclipse.resultmodel.ResultSelection <em>Result Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Result Selection</em>'.
   * @see org.eclipse.resultmodel.ResultSelection
   * @generated
   */
  EClass getResultSelection();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ResultmodelFactory getResultmodelFactory();

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
     * The meta object literal for the '{@link org.eclipse.resultmodel.impl.ResultModelImpl <em>Result Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.resultmodel.impl.ResultModelImpl
     * @see org.eclipse.resultmodel.impl.ResultmodelPackageImpl#getResultModel()
     * @generated
     */
    EClass RESULT_MODEL = eINSTANCE.getResultModel();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESULT_MODEL__ID = eINSTANCE.getResultModel_Id();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESULT_MODEL__VERSION = eINSTANCE.getResultModel_Version();

    /**
     * The meta object literal for the '<em><b>Variant Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESULT_MODEL__VARIANT_MODEL = eINSTANCE.getResultModel_VariantModel();

    /**
     * The meta object literal for the '<em><b>Selections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESULT_MODEL__SELECTIONS = eINSTANCE.getResultModel_Selections();

    /**
     * The meta object literal for the '{@link org.eclipse.resultmodel.impl.ResultSelectionImpl <em>Result Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.resultmodel.impl.ResultSelectionImpl
     * @see org.eclipse.resultmodel.impl.ResultmodelPackageImpl#getResultSelection()
     * @generated
     */
    EClass RESULT_SELECTION = eINSTANCE.getResultSelection();

  }

} //ResultmodelPackage
