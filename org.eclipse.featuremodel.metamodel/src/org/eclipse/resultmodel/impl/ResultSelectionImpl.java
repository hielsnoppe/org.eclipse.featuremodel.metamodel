/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.resultmodel.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.resultmodel.ResultModel;
import org.eclipse.resultmodel.ResultSelection;
import org.eclipse.resultmodel.ResultmodelPackage;

import org.eclipse.variantmodel.impl.VariantSelectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResultSelectionImpl extends VariantSelectionImpl implements ResultSelection {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResultSelectionImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ResultmodelPackage.Literals.RESULT_SELECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultModel getModel() {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

} //ResultSelectionImpl
