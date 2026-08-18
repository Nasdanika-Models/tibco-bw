/**
 */
package org.nasdanika.models.bw5.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.bw5.Bw5Package;
import org.nasdanika.models.bw5.Node;
import org.nasdanika.models.bw5.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.impl.TransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.TransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.TransitionImpl#getLineType <em>Line Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.TransitionImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.TransitionImpl#getConditionType <em>Condition Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.TransitionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLineType() <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineType()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConditionType() <em>Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw5Package.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrom() {
		return (String)eDynamicGet(Bw5Package.TRANSITION__FROM, Bw5Package.Literals.TRANSITION__FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(String newFrom) {
		eDynamicSet(Bw5Package.TRANSITION__FROM, Bw5Package.Literals.TRANSITION__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getSource() {
		return (Node)eDynamicGet(Bw5Package.TRANSITION__SOURCE, Bw5Package.Literals.TRANSITION__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSource() {
		return (Node)eDynamicGet(Bw5Package.TRANSITION__SOURCE, Bw5Package.Literals.TRANSITION__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Node newSource, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSource, Bw5Package.TRANSITION__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Node newSource) {
		eDynamicSet(Bw5Package.TRANSITION__SOURCE, Bw5Package.Literals.TRANSITION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTo() {
		return (String)eDynamicGet(Bw5Package.TRANSITION__TO, Bw5Package.Literals.TRANSITION__TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(String newTo) {
		eDynamicSet(Bw5Package.TRANSITION__TO, Bw5Package.Literals.TRANSITION__TO, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getTarget() {
		return (Node)eDynamicGet(Bw5Package.TRANSITION__TARGET, Bw5Package.Literals.TRANSITION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTarget() {
		return (Node)eDynamicGet(Bw5Package.TRANSITION__TARGET, Bw5Package.Literals.TRANSITION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, Bw5Package.TRANSITION__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Node newTarget) {
		eDynamicSet(Bw5Package.TRANSITION__TARGET, Bw5Package.Literals.TRANSITION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineType() {
		return (String)eDynamicGet(Bw5Package.TRANSITION__LINE_TYPE, Bw5Package.Literals.TRANSITION__LINE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineType(String newLineType) {
		eDynamicSet(Bw5Package.TRANSITION__LINE_TYPE, Bw5Package.Literals.TRANSITION__LINE_TYPE, newLineType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLineColor() {
		return (String)eDynamicGet(Bw5Package.TRANSITION__LINE_COLOR, Bw5Package.Literals.TRANSITION__LINE_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineColor(String newLineColor) {
		eDynamicSet(Bw5Package.TRANSITION__LINE_COLOR, Bw5Package.Literals.TRANSITION__LINE_COLOR, newLineColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConditionType() {
		return (String)eDynamicGet(Bw5Package.TRANSITION__CONDITION_TYPE, Bw5Package.Literals.TRANSITION__CONDITION_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditionType(String newConditionType) {
		eDynamicSet(Bw5Package.TRANSITION__CONDITION_TYPE, Bw5Package.Literals.TRANSITION__CONDITION_TYPE, newConditionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return (String)eDynamicGet(Bw5Package.TRANSITION__CONDITION, Bw5Package.Literals.TRANSITION__CONDITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		eDynamicSet(Bw5Package.TRANSITION__CONDITION, Bw5Package.Literals.TRANSITION__CONDITION, newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bw5Package.TRANSITION__SOURCE:
				Node source = basicGetSource();
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, Bw5Package.NODE__OUTGOING_TRANSITIONS, Node.class, msgs);
				return basicSetSource((Node)otherEnd, msgs);
			case Bw5Package.TRANSITION__TARGET:
				Node target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, Bw5Package.NODE__INCOMING_TRANSITIONS, Node.class, msgs);
				return basicSetTarget((Node)otherEnd, msgs);
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
			case Bw5Package.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case Bw5Package.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
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
			case Bw5Package.TRANSITION__FROM:
				return getFrom();
			case Bw5Package.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Bw5Package.TRANSITION__TO:
				return getTo();
			case Bw5Package.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case Bw5Package.TRANSITION__LINE_TYPE:
				return getLineType();
			case Bw5Package.TRANSITION__LINE_COLOR:
				return getLineColor();
			case Bw5Package.TRANSITION__CONDITION_TYPE:
				return getConditionType();
			case Bw5Package.TRANSITION__CONDITION:
				return getCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bw5Package.TRANSITION__FROM:
				setFrom((String)newValue);
				return;
			case Bw5Package.TRANSITION__SOURCE:
				setSource((Node)newValue);
				return;
			case Bw5Package.TRANSITION__TO:
				setTo((String)newValue);
				return;
			case Bw5Package.TRANSITION__TARGET:
				setTarget((Node)newValue);
				return;
			case Bw5Package.TRANSITION__LINE_TYPE:
				setLineType((String)newValue);
				return;
			case Bw5Package.TRANSITION__LINE_COLOR:
				setLineColor((String)newValue);
				return;
			case Bw5Package.TRANSITION__CONDITION_TYPE:
				setConditionType((String)newValue);
				return;
			case Bw5Package.TRANSITION__CONDITION:
				setCondition((String)newValue);
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
			case Bw5Package.TRANSITION__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case Bw5Package.TRANSITION__SOURCE:
				setSource((Node)null);
				return;
			case Bw5Package.TRANSITION__TO:
				setTo(TO_EDEFAULT);
				return;
			case Bw5Package.TRANSITION__TARGET:
				setTarget((Node)null);
				return;
			case Bw5Package.TRANSITION__LINE_TYPE:
				setLineType(LINE_TYPE_EDEFAULT);
				return;
			case Bw5Package.TRANSITION__LINE_COLOR:
				setLineColor(LINE_COLOR_EDEFAULT);
				return;
			case Bw5Package.TRANSITION__CONDITION_TYPE:
				setConditionType(CONDITION_TYPE_EDEFAULT);
				return;
			case Bw5Package.TRANSITION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
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
			case Bw5Package.TRANSITION__FROM:
				return FROM_EDEFAULT == null ? getFrom() != null : !FROM_EDEFAULT.equals(getFrom());
			case Bw5Package.TRANSITION__SOURCE:
				return basicGetSource() != null;
			case Bw5Package.TRANSITION__TO:
				return TO_EDEFAULT == null ? getTo() != null : !TO_EDEFAULT.equals(getTo());
			case Bw5Package.TRANSITION__TARGET:
				return basicGetTarget() != null;
			case Bw5Package.TRANSITION__LINE_TYPE:
				return LINE_TYPE_EDEFAULT == null ? getLineType() != null : !LINE_TYPE_EDEFAULT.equals(getLineType());
			case Bw5Package.TRANSITION__LINE_COLOR:
				return LINE_COLOR_EDEFAULT == null ? getLineColor() != null : !LINE_COLOR_EDEFAULT.equals(getLineColor());
			case Bw5Package.TRANSITION__CONDITION_TYPE:
				return CONDITION_TYPE_EDEFAULT == null ? getConditionType() != null : !CONDITION_TYPE_EDEFAULT.equals(getConditionType());
			case Bw5Package.TRANSITION__CONDITION:
				return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
