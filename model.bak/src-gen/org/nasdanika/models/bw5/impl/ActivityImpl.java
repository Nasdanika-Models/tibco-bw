/**
 */
package org.nasdanika.models.bw5.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.bw5.Activity;
import org.nasdanika.models.bw5.Bw5Package;
import org.nasdanika.models.bw5.Call;
import org.nasdanika.models.bw5.Caller;
import org.nasdanika.models.bw5.NamespaceAware;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.impl.ActivityImpl#getOutgoingCalls <em>Outgoing Calls</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ActivityImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ActivityImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ActivityImpl#getInputBindings <em>Input Bindings</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ActivityImpl#getInputBindingsNamespaces <em>Input Bindings Namespaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends TypedNodeImpl implements Activity {
	/**
	 * The default value of the '{@link #getConfig() <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInputBindings() <em>Input Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputBindings()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_BINDINGS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw5Package.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getOutgoingCalls() {
		return (EList<Call>)eDynamicGet(Bw5Package.ACTIVITY__OUTGOING_CALLS, Bw5Package.Literals.CALLER__OUTGOING_CALLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getNamespaces() {
		return (EMap<String, String>)eDynamicGet(Bw5Package.ACTIVITY__NAMESPACES, Bw5Package.Literals.NAMESPACE_AWARE__NAMESPACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfig() {
		return (String)eDynamicGet(Bw5Package.ACTIVITY__CONFIG, Bw5Package.Literals.ACTIVITY__CONFIG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfig(String newConfig) {
		eDynamicSet(Bw5Package.ACTIVITY__CONFIG, Bw5Package.Literals.ACTIVITY__CONFIG, newConfig);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputBindings() {
		return (String)eDynamicGet(Bw5Package.ACTIVITY__INPUT_BINDINGS, Bw5Package.Literals.ACTIVITY__INPUT_BINDINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputBindings(String newInputBindings) {
		eDynamicSet(Bw5Package.ACTIVITY__INPUT_BINDINGS, Bw5Package.Literals.ACTIVITY__INPUT_BINDINGS, newInputBindings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getInputBindingsNamespaces() {
		return (EMap<String, String>)eDynamicGet(Bw5Package.ACTIVITY__INPUT_BINDINGS_NAMESPACES, Bw5Package.Literals.ACTIVITY__INPUT_BINDINGS_NAMESPACES, true, true);
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
			case Bw5Package.ACTIVITY__OUTGOING_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingCalls()).basicAdd(otherEnd, msgs);
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
			case Bw5Package.ACTIVITY__OUTGOING_CALLS:
				return ((InternalEList<?>)getOutgoingCalls()).basicRemove(otherEnd, msgs);
			case Bw5Package.ACTIVITY__NAMESPACES:
				return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
			case Bw5Package.ACTIVITY__INPUT_BINDINGS_NAMESPACES:
				return ((InternalEList<?>)getInputBindingsNamespaces()).basicRemove(otherEnd, msgs);
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
			case Bw5Package.ACTIVITY__OUTGOING_CALLS:
				return getOutgoingCalls();
			case Bw5Package.ACTIVITY__NAMESPACES:
				if (coreType) return getNamespaces();
				else return getNamespaces().map();
			case Bw5Package.ACTIVITY__CONFIG:
				return getConfig();
			case Bw5Package.ACTIVITY__INPUT_BINDINGS:
				return getInputBindings();
			case Bw5Package.ACTIVITY__INPUT_BINDINGS_NAMESPACES:
				if (coreType) return getInputBindingsNamespaces();
				else return getInputBindingsNamespaces().map();
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
			case Bw5Package.ACTIVITY__OUTGOING_CALLS:
				getOutgoingCalls().clear();
				getOutgoingCalls().addAll((Collection<? extends Call>)newValue);
				return;
			case Bw5Package.ACTIVITY__NAMESPACES:
				((EStructuralFeature.Setting)getNamespaces()).set(newValue);
				return;
			case Bw5Package.ACTIVITY__CONFIG:
				setConfig((String)newValue);
				return;
			case Bw5Package.ACTIVITY__INPUT_BINDINGS:
				setInputBindings((String)newValue);
				return;
			case Bw5Package.ACTIVITY__INPUT_BINDINGS_NAMESPACES:
				((EStructuralFeature.Setting)getInputBindingsNamespaces()).set(newValue);
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
			case Bw5Package.ACTIVITY__OUTGOING_CALLS:
				getOutgoingCalls().clear();
				return;
			case Bw5Package.ACTIVITY__NAMESPACES:
				getNamespaces().clear();
				return;
			case Bw5Package.ACTIVITY__CONFIG:
				setConfig(CONFIG_EDEFAULT);
				return;
			case Bw5Package.ACTIVITY__INPUT_BINDINGS:
				setInputBindings(INPUT_BINDINGS_EDEFAULT);
				return;
			case Bw5Package.ACTIVITY__INPUT_BINDINGS_NAMESPACES:
				getInputBindingsNamespaces().clear();
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
			case Bw5Package.ACTIVITY__OUTGOING_CALLS:
				return !getOutgoingCalls().isEmpty();
			case Bw5Package.ACTIVITY__NAMESPACES:
				return !getNamespaces().isEmpty();
			case Bw5Package.ACTIVITY__CONFIG:
				return CONFIG_EDEFAULT == null ? getConfig() != null : !CONFIG_EDEFAULT.equals(getConfig());
			case Bw5Package.ACTIVITY__INPUT_BINDINGS:
				return INPUT_BINDINGS_EDEFAULT == null ? getInputBindings() != null : !INPUT_BINDINGS_EDEFAULT.equals(getInputBindings());
			case Bw5Package.ACTIVITY__INPUT_BINDINGS_NAMESPACES:
				return !getInputBindingsNamespaces().isEmpty();
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
		if (baseClass == Caller.class) {
			switch (derivedFeatureID) {
				case Bw5Package.ACTIVITY__OUTGOING_CALLS: return Bw5Package.CALLER__OUTGOING_CALLS;
				default: return -1;
			}
		}
		if (baseClass == NamespaceAware.class) {
			switch (derivedFeatureID) {
				case Bw5Package.ACTIVITY__NAMESPACES: return Bw5Package.NAMESPACE_AWARE__NAMESPACES;
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
		if (baseClass == Caller.class) {
			switch (baseFeatureID) {
				case Bw5Package.CALLER__OUTGOING_CALLS: return Bw5Package.ACTIVITY__OUTGOING_CALLS;
				default: return -1;
			}
		}
		if (baseClass == NamespaceAware.class) {
			switch (baseFeatureID) {
				case Bw5Package.NAMESPACE_AWARE__NAMESPACES: return Bw5Package.ACTIVITY__NAMESPACES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActivityImpl
