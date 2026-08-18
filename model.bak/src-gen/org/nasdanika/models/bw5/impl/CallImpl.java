/**
 */
package org.nasdanika.models.bw5.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.bw5.Bw5Package;
import org.nasdanika.models.bw5.Call;
import org.nasdanika.models.bw5.CallTarget;
import org.nasdanika.models.bw5.Caller;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.impl.CallImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.CallImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.CallImpl#getCaller <em>Caller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallImpl extends MinimalEObjectImpl.Container implements Call {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw5Package.Literals.CALL;
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
	public String getDescription() {
		return (String)eDynamicGet(Bw5Package.CALL__DESCRIPTION, Bw5Package.Literals.CALL__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(Bw5Package.CALL__DESCRIPTION, Bw5Package.Literals.CALL__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallTarget getTarget() {
		return (CallTarget)eDynamicGet(Bw5Package.CALL__TARGET, Bw5Package.Literals.CALL__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallTarget basicGetTarget() {
		return (CallTarget)eDynamicGet(Bw5Package.CALL__TARGET, Bw5Package.Literals.CALL__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(CallTarget newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, Bw5Package.CALL__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(CallTarget newTarget) {
		eDynamicSet(Bw5Package.CALL__TARGET, Bw5Package.Literals.CALL__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Caller getCaller() {
		return (Caller)eDynamicGet(Bw5Package.CALL__CALLER, Bw5Package.Literals.CALL__CALLER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caller basicGetCaller() {
		return (Caller)eDynamicGet(Bw5Package.CALL__CALLER, Bw5Package.Literals.CALL__CALLER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaller(Caller newCaller, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCaller, Bw5Package.CALL__CALLER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaller(Caller newCaller) {
		eDynamicSet(Bw5Package.CALL__CALLER, Bw5Package.Literals.CALL__CALLER, newCaller);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bw5Package.CALL__TARGET:
				CallTarget target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, Bw5Package.CALL_TARGET__INCOMING_CALLS, CallTarget.class, msgs);
				return basicSetTarget((CallTarget)otherEnd, msgs);
			case Bw5Package.CALL__CALLER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCaller((Caller)otherEnd, msgs);
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
			case Bw5Package.CALL__TARGET:
				return basicSetTarget(null, msgs);
			case Bw5Package.CALL__CALLER:
				return basicSetCaller(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Bw5Package.CALL__CALLER:
				return eInternalContainer().eInverseRemove(this, Bw5Package.CALLER__OUTGOING_CALLS, Caller.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bw5Package.CALL__DESCRIPTION:
				return getDescription();
			case Bw5Package.CALL__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case Bw5Package.CALL__CALLER:
				if (resolve) return getCaller();
				return basicGetCaller();
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
			case Bw5Package.CALL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Bw5Package.CALL__TARGET:
				setTarget((CallTarget)newValue);
				return;
			case Bw5Package.CALL__CALLER:
				setCaller((Caller)newValue);
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
			case Bw5Package.CALL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Bw5Package.CALL__TARGET:
				setTarget((CallTarget)null);
				return;
			case Bw5Package.CALL__CALLER:
				setCaller((Caller)null);
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
			case Bw5Package.CALL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case Bw5Package.CALL__TARGET:
				return basicGetTarget() != null;
			case Bw5Package.CALL__CALLER:
				return basicGetCaller() != null;
		}
		return super.eIsSet(featureID);
	}

} //CallImpl
