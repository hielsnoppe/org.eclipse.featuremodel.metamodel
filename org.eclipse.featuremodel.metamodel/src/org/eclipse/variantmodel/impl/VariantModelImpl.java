/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.variantmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.featuremodel.Attribute;
import org.eclipse.featuremodel.FeatureModel;

import org.eclipse.variantmodel.Selection;
import org.eclipse.variantmodel.VariantModel;
import org.eclipse.variantmodel.VariantmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.variantmodel.impl.VariantModelImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.impl.VariantModelImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.impl.VariantModelImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.impl.VariantModelImpl#getFeaturemodels <em>Featuremodels</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.impl.VariantModelImpl#getSelections <em>Selections</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.impl.VariantModelImpl#getConcretemodels <em>Concretemodels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariantModelImpl extends EObjectImpl implements VariantModel {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getFeaturemodels() <em>Featuremodels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturemodels()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureModel> featuremodels;

	/**
	 * The cached value of the '{@link #getSelections() <em>Selections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelections()
	 * @generated
	 * @ordered
	 */
	protected EList<Selection> selections;

	/**
	 * The cached value of the '{@link #getConcretemodels() <em>Concretemodels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcretemodels()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureModel> concretemodels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariantModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariantmodelPackage.Literals.VARIANT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariantmodelPackage.VARIANT_MODEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariantmodelPackage.VARIANT_MODEL__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, VariantmodelPackage.VARIANT_MODEL__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureModel> getFeaturemodels() {
		if (featuremodels == null) {
			featuremodels = new EObjectResolvingEList<FeatureModel>(FeatureModel.class, this, VariantmodelPackage.VARIANT_MODEL__FEATUREMODELS);
		}
		return featuremodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Selection> getSelections() {
		if (selections == null) {
			selections = new EObjectContainmentEList<Selection>(Selection.class, this, VariantmodelPackage.VARIANT_MODEL__SELECTIONS);
		}
		return selections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureModel> getConcretemodels() {
		if (concretemodels == null) {
			concretemodels = new EObjectResolvingEList<FeatureModel>(FeatureModel.class, this, VariantmodelPackage.VARIANT_MODEL__CONCRETEMODELS);
		}
		return concretemodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariantmodelPackage.VARIANT_MODEL__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case VariantmodelPackage.VARIANT_MODEL__SELECTIONS:
				return ((InternalEList<?>)getSelections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariantmodelPackage.VARIANT_MODEL__ID:
				return getId();
			case VariantmodelPackage.VARIANT_MODEL__VERSION:
				return getVersion();
			case VariantmodelPackage.VARIANT_MODEL__ATTRIBUTES:
				return getAttributes();
			case VariantmodelPackage.VARIANT_MODEL__FEATUREMODELS:
				return getFeaturemodels();
			case VariantmodelPackage.VARIANT_MODEL__SELECTIONS:
				return getSelections();
			case VariantmodelPackage.VARIANT_MODEL__CONCRETEMODELS:
				return getConcretemodels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VariantmodelPackage.VARIANT_MODEL__ID:
				setId((String)newValue);
				return;
			case VariantmodelPackage.VARIANT_MODEL__VERSION:
				setVersion((String)newValue);
				return;
			case VariantmodelPackage.VARIANT_MODEL__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case VariantmodelPackage.VARIANT_MODEL__FEATUREMODELS:
				getFeaturemodels().clear();
				getFeaturemodels().addAll((Collection<? extends FeatureModel>)newValue);
				return;
			case VariantmodelPackage.VARIANT_MODEL__SELECTIONS:
				getSelections().clear();
				getSelections().addAll((Collection<? extends Selection>)newValue);
				return;
			case VariantmodelPackage.VARIANT_MODEL__CONCRETEMODELS:
				getConcretemodels().clear();
				getConcretemodels().addAll((Collection<? extends FeatureModel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VariantmodelPackage.VARIANT_MODEL__ID:
				setId(ID_EDEFAULT);
				return;
			case VariantmodelPackage.VARIANT_MODEL__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case VariantmodelPackage.VARIANT_MODEL__ATTRIBUTES:
				getAttributes().clear();
				return;
			case VariantmodelPackage.VARIANT_MODEL__FEATUREMODELS:
				getFeaturemodels().clear();
				return;
			case VariantmodelPackage.VARIANT_MODEL__SELECTIONS:
				getSelections().clear();
				return;
			case VariantmodelPackage.VARIANT_MODEL__CONCRETEMODELS:
				getConcretemodels().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VariantmodelPackage.VARIANT_MODEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VariantmodelPackage.VARIANT_MODEL__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case VariantmodelPackage.VARIANT_MODEL__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case VariantmodelPackage.VARIANT_MODEL__FEATUREMODELS:
				return featuremodels != null && !featuremodels.isEmpty();
			case VariantmodelPackage.VARIANT_MODEL__SELECTIONS:
				return selections != null && !selections.isEmpty();
			case VariantmodelPackage.VARIANT_MODEL__CONCRETEMODELS:
				return concretemodels != null && !concretemodels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //VariantModelImpl
