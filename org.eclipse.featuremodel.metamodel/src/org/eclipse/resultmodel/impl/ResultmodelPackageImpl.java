/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.resultmodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.featuremodel.FeaturemodelPackage;

import org.eclipse.featuremodel.impl.FeaturemodelPackageImpl;

import org.eclipse.resultmodel.ResultModel;
import org.eclipse.resultmodel.ResultSelection;
import org.eclipse.resultmodel.ResultmodelFactory;
import org.eclipse.resultmodel.ResultmodelPackage;

import org.eclipse.variantmodel.VariantmodelPackage;

import org.eclipse.variantmodel.impl.VariantmodelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResultmodelPackageImpl extends EPackageImpl implements ResultmodelPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resultSelectionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.resultmodel.ResultmodelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ResultmodelPackageImpl() {
    super(eNS_URI, ResultmodelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ResultmodelPackage init() {
    if (isInited) return (ResultmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ResultmodelPackage.eNS_URI);

    // Obtain or create and register package
    ResultmodelPackageImpl theResultmodelPackage = (ResultmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ResultmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ResultmodelPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    FeaturemodelPackageImpl theFeaturemodelPackage = (FeaturemodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeaturemodelPackage.eNS_URI) instanceof FeaturemodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeaturemodelPackage.eNS_URI) : FeaturemodelPackage.eINSTANCE);
    VariantmodelPackageImpl theVariantmodelPackage = (VariantmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariantmodelPackage.eNS_URI) instanceof VariantmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariantmodelPackage.eNS_URI) : VariantmodelPackage.eINSTANCE);

    // Create package meta-data objects
    theResultmodelPackage.createPackageContents();
    theFeaturemodelPackage.createPackageContents();
    theVariantmodelPackage.createPackageContents();

    // Initialize created meta-data
    theResultmodelPackage.initializePackageContents();
    theFeaturemodelPackage.initializePackageContents();
    theVariantmodelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theResultmodelPackage.freeze();

    return theResultmodelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResultModel() {
    return resultModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResultModel_Id() {
    return (EAttribute)resultModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResultModel_Version() {
    return (EAttribute)resultModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResultModel_VariantModel() {
    return (EReference)resultModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResultModel_Selections() {
    return (EReference)resultModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResultSelection() {
    return resultSelectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResultmodelFactory getResultmodelFactory() {
    return (ResultmodelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    resultModelEClass = createEClass(RESULT_MODEL);
    createEAttribute(resultModelEClass, RESULT_MODEL__ID);
    createEAttribute(resultModelEClass, RESULT_MODEL__VERSION);
    createEReference(resultModelEClass, RESULT_MODEL__VARIANT_MODEL);
    createEReference(resultModelEClass, RESULT_MODEL__SELECTIONS);

    resultSelectionEClass = createEClass(RESULT_SELECTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    VariantmodelPackage theVariantmodelPackage = (VariantmodelPackage)EPackage.Registry.INSTANCE.getEPackage(VariantmodelPackage.eNS_URI);
    FeaturemodelPackage theFeaturemodelPackage = (FeaturemodelPackage)EPackage.Registry.INSTANCE.getEPackage(FeaturemodelPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    resultSelectionEClass.getESuperTypes().add(theVariantmodelPackage.getVariantSelection());

    // Initialize classes and features; add operations and parameters
    initEClass(resultModelEClass, ResultModel.class, "ResultModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResultModel_Id(), theVariantmodelPackage.getID(), "id", null, 1, 1, ResultModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResultModel_Version(), ecorePackage.getEString(), "version", null, 1, 1, ResultModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResultModel_VariantModel(), theVariantmodelPackage.getVariantModel(), null, "variantModel", null, 1, 1, ResultModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResultModel_Selections(), this.getResultSelection(), null, "selections", null, 0, -1, ResultModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    addEOperation(resultModelEClass, theFeaturemodelPackage.getFeatureModel(), "getConcreteModels", 1, -1, IS_UNIQUE, IS_ORDERED);

    initEClass(resultSelectionEClass, ResultSelection.class, "ResultSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    addEOperation(resultSelectionEClass, this.getResultModel(), "getModel", 1, 1, IS_UNIQUE, IS_ORDERED);
  }

} //ResultmodelPackageImpl
