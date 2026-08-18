/**
 */
package org.nasdanika.models.bw5.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.bw5.Bw5Package;
import org.nasdanika.models.bw5.Node;
import org.nasdanika.models.bw5.Transition;
import org.nasdanika.models.bw5.TypedNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.impl.TypedNodeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.TypedNodeImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.TypedNodeImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.TypedNodeImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.TypedNodeImpl#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypedNodeImpl extends TypedElementImpl implements TypedNode {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_TYPE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw5Package.Literals.TYPED_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return (Integer)eDynamicGet(Bw5Package.TYPED_NODE__X, Bw5Package.Literals.NODE__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(int newX) {
		eDynamicSet(Bw5Package.TYPED_NODE__X, Bw5Package.Literals.NODE__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return (Integer)eDynamicGet(Bw5Package.TYPED_NODE__Y, Bw5Package.Literals.NODE__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(int newY) {
		eDynamicSet(Bw5Package.TYPED_NODE__Y, Bw5Package.Literals.NODE__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getOutgoingTransitions() {
		return (EList<Transition>)eDynamicGet(Bw5Package.TYPED_NODE__OUTGOING_TRANSITIONS, Bw5Package.Literals.NODE__OUTGOING_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getIncomingTransitions() {
		return (EList<Transition>)eDynamicGet(Bw5Package.TYPED_NODE__INCOMING_TRANSITIONS, Bw5Package.Literals.NODE__INCOMING_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceType() {
		return (String)eDynamicGet(Bw5Package.TYPED_NODE__RESOURCE_TYPE, Bw5Package.Literals.TYPED_NODE__RESOURCE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceType(String newResourceType) {
		eDynamicSet(Bw5Package.TYPED_NODE__RESOURCE_TYPE, Bw5Package.Literals.TYPED_NODE__RESOURCE_TYPE, newResourceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bw5Package.TYPED_NODE__OUTGOING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
			case Bw5Package.TYPED_NODE__INCOMING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransitions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bw5Package.TYPED_NODE__OUTGOING_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
			case Bw5Package.TYPED_NODE__INCOMING_TRANSITIONS:
				return ((InternalEList<?>)getIncomingTransitions()).basicRemove(otherEnd, msgs);
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
			case Bw5Package.TYPED_NODE__X:
				return getX();
			case Bw5Package.TYPED_NODE__Y:
				return getY();
			case Bw5Package.TYPED_NODE__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case Bw5Package.TYPED_NODE__INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case Bw5Package.TYPED_NODE__RESOURCE_TYPE:
				return getResourceType();
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
			case Bw5Package.TYPED_NODE__X:
				setX((Integer)newValue);
				return;
			case Bw5Package.TYPED_NODE__Y:
				setY((Integer)newValue);
				return;
			case Bw5Package.TYPED_NODE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case Bw5Package.TYPED_NODE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				getIncomingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case Bw5Package.TYPED_NODE__RESOURCE_TYPE:
				setResourceType((String)newValue);
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
			case Bw5Package.TYPED_NODE__X:
				setX(X_EDEFAULT);
				return;
			case Bw5Package.TYPED_NODE__Y:
				setY(Y_EDEFAULT);
				return;
			case Bw5Package.TYPED_NODE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				return;
			case Bw5Package.TYPED_NODE__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				return;
			case Bw5Package.TYPED_NODE__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
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
			case Bw5Package.TYPED_NODE__X:
				return getX() != X_EDEFAULT;
			case Bw5Package.TYPED_NODE__Y:
				return getY() != Y_EDEFAULT;
			case Bw5Package.TYPED_NODE__OUTGOING_TRANSITIONS:
				return !getOutgoingTransitions().isEmpty();
			case Bw5Package.TYPED_NODE__INCOMING_TRANSITIONS:
				return !getIncomingTransitions().isEmpty();
			case Bw5Package.TYPED_NODE__RESOURCE_TYPE:
				return RESOURCE_TYPE_EDEFAULT == null ? getResourceType() != null : !RESOURCE_TYPE_EDEFAULT.equals(getResourceType());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case Bw5Package.TYPED_NODE__X: return Bw5Package.NODE__X;
				case Bw5Package.TYPED_NODE__Y: return Bw5Package.NODE__Y;
				case Bw5Package.TYPED_NODE__OUTGOING_TRANSITIONS: return Bw5Package.NODE__OUTGOING_TRANSITIONS;
				case Bw5Package.TYPED_NODE__INCOMING_TRANSITIONS: return Bw5Package.NODE__INCOMING_TRANSITIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case Bw5Package.NODE__X: return Bw5Package.TYPED_NODE__X;
				case Bw5Package.NODE__Y: return Bw5Package.TYPED_NODE__Y;
				case Bw5Package.NODE__OUTGOING_TRANSITIONS: return Bw5Package.TYPED_NODE__OUTGOING_TRANSITIONS;
				case Bw5Package.NODE__INCOMING_TRANSITIONS: return Bw5Package.TYPED_NODE__INCOMING_TRANSITIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TypedNodeImpl
