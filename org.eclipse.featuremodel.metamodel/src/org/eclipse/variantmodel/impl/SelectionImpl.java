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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.featuremodel.Attribute;
import org.eclipse.featuremodel.Feature;

import org.eclipse.variantmodel.Selection;
import org.eclipse.variantmodel.SelectionState;
import org.eclipse.variantmodel.Value;
import org.eclipse.variantmodel.VariantModel;
import org.eclipse.variantmodel.VariantmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.variantmodel.impl.SelectionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.impl.SelectionImpl#isBounded <em>Bounded</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.impl.SelectionImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.impl.SelectionImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.impl.SelectionImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.impl.SelectionImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.eclipse.variantmodel.impl.SelectionImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectionImpl extends EObjectImpl implements Selection {
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
	 * The default value of the '{@link #isBounded() <em>Bounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBounded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOUNDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBounded() <em>Bounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBounded()
	 * @generated
	 * @ordered
	 */
	protected boolean bounded = BOUNDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final SelectionState STATE_EDEFAULT = SelectionState.UNSELECTED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected SelectionState state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected String selector = SELECTOR_EDEFAULT;

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
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature feature;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VariantmodelPackage.Literals.SELECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VariantmodelPackage.SELECTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBounded() {
		return bounded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounded(boolean newBounded) {
		boolean oldBounded = bounded;
		bounded = newBounded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariantmodelPackage.SELECTION__BOUNDED, oldBounded, bounded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(SelectionState newState) {
		SelectionState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariantmodelPackage.SELECTION__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(String newSelector) {
		String oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariantmodelPackage.SELECTION__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, VariantmodelPackage.SELECTION__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (Feature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VariantmodelPackage.SELECTION__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VariantmodelPackage.SELECTION__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<Value>(Value.class, this, VariantmodelPackage.SELECTION__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantModel getModel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariantmodelPackage.SELECTION__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case VariantmodelPackage.SELECTION__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case VariantmodelPackage.SELECTION__ID:
				return getId();
			case VariantmodelPackage.SELECTION__BOUNDED:
				return isBounded() ? Boolean.TRUE : Boolean.FALSE;
			case VariantmodelPackage.SELECTION__STATE:
				return getState();
			case VariantmodelPackage.SELECTION__SELECTOR:
				return getSelector();
			case VariantmodelPackage.SELECTION__ATTRIBUTES:
				return getAttributes();
			case VariantmodelPackage.SELECTION__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case VariantmodelPackage.SELECTION__VALUES:
				return getValues();
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
			case VariantmodelPackage.SELECTION__ID:
				setId((String)newValue);
				return;
			case VariantmodelPackage.SELECTION__BOUNDED:
				setBounded(((Boolean)newValue).booleanValue());
				return;
			case VariantmodelPackage.SELECTION__STATE:
				setState((SelectionState)newValue);
				return;
			case VariantmodelPackage.SELECTION__SELECTOR:
				setSelector((String)newValue);
				return;
			case VariantmodelPackage.SELECTION__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case VariantmodelPackage.SELECTION__FEATURE:
				setFeature((Feature)newValue);
				return;
			case VariantmodelPackage.SELECTION__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Value>)newValue);
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
			case VariantmodelPackage.SELECTION__ID:
				setId(ID_EDEFAULT);
				return;
			case VariantmodelPackage.SELECTION__BOUNDED:
				setBounded(BOUNDED_EDEFAULT);
				return;
			case VariantmodelPackage.SELECTION__STATE:
				setState(STATE_EDEFAULT);
				return;
			case VariantmodelPackage.SELECTION__SELECTOR:
				setSelector(SELECTOR_EDEFAULT);
				return;
			case VariantmodelPackage.SELECTION__ATTRIBUTES:
				getAttributes().clear();
				return;
			case VariantmodelPackage.SELECTION__FEATURE:
				setFeature((Feature)null);
				return;
			case VariantmodelPackage.SELECTION__VALUES:
				getValues().clear();
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
			case VariantmodelPackage.SELECTION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case VariantmodelPackage.SELECTION__BOUNDED:
				return bounded != BOUNDED_EDEFAULT;
			case VariantmodelPackage.SELECTION__STATE:
				return state != STATE_EDEFAULT;
			case VariantmodelPackage.SELECTION__SELECTOR:
				return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals(selector);
			case VariantmodelPackage.SELECTION__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case VariantmodelPackage.SELECTION__FEATURE:
				return feature != null;
			case VariantmodelPackage.SELECTION__VALUES:
				return values != null && !values.isEmpty();
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
		result.append(", bounded: ");
		result.append(bounded);
		result.append(", state: ");
		result.append(state);
		result.append(", selector: ");
		result.append(selector);
		result.append(')');
		return result.toString();
	}

} //SelectionImpl
