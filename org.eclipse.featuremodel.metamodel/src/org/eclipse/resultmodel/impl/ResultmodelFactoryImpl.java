/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.resultmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.resultmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultmodelFactoryImpl extends EFactoryImpl implements ResultmodelFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ResultmodelFactory init() {
    try {
      ResultmodelFactory theResultmodelFactory = (ResultmodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/resultmodel"); 
      if (theResultmodelFactory != null) {
        return theResultmodelFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ResultmodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultmodelFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case ResultmodelPackage.RESULT_MODEL: return createResultModel();
      case ResultmodelPackage.RESULT_SELECTION: return createResultSelection();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultModel createResultModel() {
    ResultModelImpl resultModel = new ResultModelImpl();
    return resultModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultSelection createResultSelection() {
    ResultSelectionImpl resultSelection = new ResultSelectionImpl();
    return resultSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultmodelPackage getResultmodelPackage() {
    return (ResultmodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ResultmodelPackage getPackage() {
    return ResultmodelPackage.eINSTANCE;
  }

} //ResultmodelFactoryImpl
