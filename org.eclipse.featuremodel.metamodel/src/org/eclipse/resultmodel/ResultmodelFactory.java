/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.resultmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.resultmodel.ResultmodelPackage
 * @generated
 */
public interface ResultmodelFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ResultmodelFactory eINSTANCE = org.eclipse.resultmodel.impl.ResultmodelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Result Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Model</em>'.
   * @generated
   */
  ResultModel createResultModel();

  /**
   * Returns a new object of class '<em>Result Selection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result Selection</em>'.
   * @generated
   */
  ResultSelection createResultSelection();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ResultmodelPackage getResultmodelPackage();

} //ResultmodelFactory
