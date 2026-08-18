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
import org.nasdanika.models.bw5.Group;
import org.nasdanika.models.bw5.NamespaceAware;
import org.nasdanika.models.bw5.Node;
import org.nasdanika.models.bw5.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.impl.ContainerImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ContainerImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ContainerImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ContainerImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ContainerImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ContainerImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ContainerImpl#getReturnBindings <em>Return Bindings</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ContainerImpl#getReturnBindingsNamespaces <em>Return Bindings Namespaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainerImpl extends NamedElementImpl implements org.nasdanika.models.bw5.Container {
	/**
	 * The default value of the '{@link #getReturnBindings() <em>Return Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnBindings()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_BINDINGS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw5Package.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getNamespaces() {
		return (EMap<String, String>)eDynamicGet(Bw5Package.CONTAINER__NAMESPACES, Bw5Package.Literals.NAMESPACE_AWARE__NAMESPACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getActivities() {
		return (EList<Activity>)eDynamicGet(Bw5Package.CONTAINER__ACTIVITIES, Bw5Package.Literals.CONTAINER__ACTIVITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Group> getGroups() {
		return (EList<Group>)eDynamicGet(Bw5Package.CONTAINER__GROUPS, Bw5Package.Literals.CONTAINER__GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getTransitions() {
		return (EList<Transition>)eDynamicGet(Bw5Package.CONTAINER__TRANSITIONS, Bw5Package.Literals.CONTAINER__TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getStart() {
		return (Node)eDynamicGet(Bw5Package.CONTAINER__START, Bw5Package.Literals.CONTAINER__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetStart() {
		return (Node)eDynamicGet(Bw5Package.CONTAINER__START, Bw5Package.Literals.CONTAINER__START, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Node newStart) {
		eDynamicSet(Bw5Package.CONTAINER__START, Bw5Package.Literals.CONTAINER__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getEnd() {
		return (Node)eDynamicGet(Bw5Package.CONTAINER__END, Bw5Package.Literals.CONTAINER__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEnd() {
		return (Node)eDynamicGet(Bw5Package.CONTAINER__END, Bw5Package.Literals.CONTAINER__END, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Node newEnd) {
		eDynamicSet(Bw5Package.CONTAINER__END, Bw5Package.Literals.CONTAINER__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnBindings() {
		return (String)eDynamicGet(Bw5Package.CONTAINER__RETURN_BINDINGS, Bw5Package.Literals.CONTAINER__RETURN_BINDINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnBindings(String newReturnBindings) {
		eDynamicSet(Bw5Package.CONTAINER__RETURN_BINDINGS, Bw5Package.Literals.CONTAINER__RETURN_BINDINGS, newReturnBindings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getReturnBindingsNamespaces() {
		return (EMap<String, String>)eDynamicGet(Bw5Package.CONTAINER__RETURN_BINDINGS_NAMESPACES, Bw5Package.Literals.CONTAINER__RETURN_BINDINGS_NAMESPACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bw5Package.CONTAINER__NAMESPACES:
				return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
			case Bw5Package.CONTAINER__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case Bw5Package.CONTAINER__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case Bw5Package.CONTAINER__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case Bw5Package.CONTAINER__RETURN_BINDINGS_NAMESPACES:
				return ((InternalEList<?>)getReturnBindingsNamespaces()).basicRemove(otherEnd, msgs);
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
			case Bw5Package.CONTAINER__NAMESPACES:
				if (coreType) return getNamespaces();
				else return getNamespaces().map();
			case Bw5Package.CONTAINER__ACTIVITIES:
				return getActivities();
			case Bw5Package.CONTAINER__GROUPS:
				return getGroups();
			case Bw5Package.CONTAINER__TRANSITIONS:
				return getTransitions();
			case Bw5Package.CONTAINER__START:
				if (resolve) return getStart();
				return basicGetStart();
			case Bw5Package.CONTAINER__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case Bw5Package.CONTAINER__RETURN_BINDINGS:
				return getReturnBindings();
			case Bw5Package.CONTAINER__RETURN_BINDINGS_NAMESPACES:
				if (coreType) return getReturnBindingsNamespaces();
				else return getReturnBindingsNamespaces().map();
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
			case Bw5Package.CONTAINER__NAMESPACES:
				((EStructuralFeature.Setting)getNamespaces()).set(newValue);
				return;
			case Bw5Package.CONTAINER__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case Bw5Package.CONTAINER__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case Bw5Package.CONTAINER__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case Bw5Package.CONTAINER__START:
				setStart((Node)newValue);
				return;
			case Bw5Package.CONTAINER__END:
				setEnd((Node)newValue);
				return;
			case Bw5Package.CONTAINER__RETURN_BINDINGS:
				setReturnBindings((String)newValue);
				return;
			case Bw5Package.CONTAINER__RETURN_BINDINGS_NAMESPACES:
				((EStructuralFeature.Setting)getReturnBindingsNamespaces()).set(newValue);
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
			case Bw5Package.CONTAINER__NAMESPACES:
				getNamespaces().clear();
				return;
			case Bw5Package.CONTAINER__ACTIVITIES:
				getActivities().clear();
				return;
			case Bw5Package.CONTAINER__GROUPS:
				getGroups().clear();
				return;
			case Bw5Package.CONTAINER__TRANSITIONS:
				getTransitions().clear();
				return;
			case Bw5Package.CONTAINER__START:
				setStart((Node)null);
				return;
			case Bw5Package.CONTAINER__END:
				setEnd((Node)null);
				return;
			case Bw5Package.CONTAINER__RETURN_BINDINGS:
				setReturnBindings(RETURN_BINDINGS_EDEFAULT);
				return;
			case Bw5Package.CONTAINER__RETURN_BINDINGS_NAMESPACES:
				getReturnBindingsNamespaces().clear();
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
			case Bw5Package.CONTAINER__NAMESPACES:
				return !getNamespaces().isEmpty();
			case Bw5Package.CONTAINER__ACTIVITIES:
				return !getActivities().isEmpty();
			case Bw5Package.CONTAINER__GROUPS:
				return !getGroups().isEmpty();
			case Bw5Package.CONTAINER__TRANSITIONS:
				return !getTransitions().isEmpty();
			case Bw5Package.CONTAINER__START:
				return basicGetStart() != null;
			case Bw5Package.CONTAINER__END:
				return basicGetEnd() != null;
			case Bw5Package.CONTAINER__RETURN_BINDINGS:
				return RETURN_BINDINGS_EDEFAULT == null ? getReturnBindings() != null : !RETURN_BINDINGS_EDEFAULT.equals(getReturnBindings());
			case Bw5Package.CONTAINER__RETURN_BINDINGS_NAMESPACES:
				return !getReturnBindingsNamespaces().isEmpty();
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
		if (baseClass == NamespaceAware.class) {
			switch (derivedFeatureID) {
				case Bw5Package.CONTAINER__NAMESPACES: return Bw5Package.NAMESPACE_AWARE__NAMESPACES;
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
		if (baseClass == NamespaceAware.class) {
			switch (baseFeatureID) {
				case Bw5Package.NAMESPACE_AWARE__NAMESPACES: return Bw5Package.CONTAINER__NAMESPACES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ContainerImpl
