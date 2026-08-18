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
import org.nasdanika.models.bw5.Node;
import org.nasdanika.models.bw5.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.impl.GroupImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.GroupImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.GroupImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.GroupImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.GroupImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.GroupImpl#getReturnBindings <em>Return Bindings</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.GroupImpl#getReturnBindingsNamespaces <em>Return Bindings Namespaces</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.GroupImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.GroupImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.GroupImpl#getCollapsedWidth <em>Collapsed Width</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.GroupImpl#getCollapsedHeight <em>Collapsed Height</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.GroupImpl#isExpanded <em>Expanded</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends ActivityImpl implements Group {
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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getCollapsedWidth() <em>Collapsed Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsedWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int COLLAPSED_WIDTH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getCollapsedHeight() <em>Collapsed Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollapsedHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int COLLAPSED_HEIGHT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #isExpanded() <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpanded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPANDED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw5Package.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getActivities() {
		return (EList<Activity>)eDynamicGet(Bw5Package.GROUP__ACTIVITIES, Bw5Package.Literals.CONTAINER__ACTIVITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Group> getGroups() {
		return (EList<Group>)eDynamicGet(Bw5Package.GROUP__GROUPS, Bw5Package.Literals.CONTAINER__GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getTransitions() {
		return (EList<Transition>)eDynamicGet(Bw5Package.GROUP__TRANSITIONS, Bw5Package.Literals.CONTAINER__TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getStart() {
		return (Node)eDynamicGet(Bw5Package.GROUP__START, Bw5Package.Literals.CONTAINER__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetStart() {
		return (Node)eDynamicGet(Bw5Package.GROUP__START, Bw5Package.Literals.CONTAINER__START, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Node newStart) {
		eDynamicSet(Bw5Package.GROUP__START, Bw5Package.Literals.CONTAINER__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getEnd() {
		return (Node)eDynamicGet(Bw5Package.GROUP__END, Bw5Package.Literals.CONTAINER__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEnd() {
		return (Node)eDynamicGet(Bw5Package.GROUP__END, Bw5Package.Literals.CONTAINER__END, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Node newEnd) {
		eDynamicSet(Bw5Package.GROUP__END, Bw5Package.Literals.CONTAINER__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnBindings() {
		return (String)eDynamicGet(Bw5Package.GROUP__RETURN_BINDINGS, Bw5Package.Literals.CONTAINER__RETURN_BINDINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnBindings(String newReturnBindings) {
		eDynamicSet(Bw5Package.GROUP__RETURN_BINDINGS, Bw5Package.Literals.CONTAINER__RETURN_BINDINGS, newReturnBindings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getReturnBindingsNamespaces() {
		return (EMap<String, String>)eDynamicGet(Bw5Package.GROUP__RETURN_BINDINGS_NAMESPACES, Bw5Package.Literals.CONTAINER__RETURN_BINDINGS_NAMESPACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return (Integer)eDynamicGet(Bw5Package.GROUP__WIDTH, Bw5Package.Literals.GROUP__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		eDynamicSet(Bw5Package.GROUP__WIDTH, Bw5Package.Literals.GROUP__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return (Integer)eDynamicGet(Bw5Package.GROUP__HEIGHT, Bw5Package.Literals.GROUP__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(int newHeight) {
		eDynamicSet(Bw5Package.GROUP__HEIGHT, Bw5Package.Literals.GROUP__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCollapsedWidth() {
		return (Integer)eDynamicGet(Bw5Package.GROUP__COLLAPSED_WIDTH, Bw5Package.Literals.GROUP__COLLAPSED_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollapsedWidth(int newCollapsedWidth) {
		eDynamicSet(Bw5Package.GROUP__COLLAPSED_WIDTH, Bw5Package.Literals.GROUP__COLLAPSED_WIDTH, newCollapsedWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCollapsedHeight() {
		return (Integer)eDynamicGet(Bw5Package.GROUP__COLLAPSED_HEIGHT, Bw5Package.Literals.GROUP__COLLAPSED_HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollapsedHeight(int newCollapsedHeight) {
		eDynamicSet(Bw5Package.GROUP__COLLAPSED_HEIGHT, Bw5Package.Literals.GROUP__COLLAPSED_HEIGHT, newCollapsedHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExpanded() {
		return (Boolean)eDynamicGet(Bw5Package.GROUP__EXPANDED, Bw5Package.Literals.GROUP__EXPANDED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpanded(boolean newExpanded) {
		eDynamicSet(Bw5Package.GROUP__EXPANDED, Bw5Package.Literals.GROUP__EXPANDED, newExpanded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bw5Package.GROUP__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case Bw5Package.GROUP__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case Bw5Package.GROUP__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case Bw5Package.GROUP__RETURN_BINDINGS_NAMESPACES:
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
			case Bw5Package.GROUP__ACTIVITIES:
				return getActivities();
			case Bw5Package.GROUP__GROUPS:
				return getGroups();
			case Bw5Package.GROUP__TRANSITIONS:
				return getTransitions();
			case Bw5Package.GROUP__START:
				if (resolve) return getStart();
				return basicGetStart();
			case Bw5Package.GROUP__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case Bw5Package.GROUP__RETURN_BINDINGS:
				return getReturnBindings();
			case Bw5Package.GROUP__RETURN_BINDINGS_NAMESPACES:
				if (coreType) return getReturnBindingsNamespaces();
				else return getReturnBindingsNamespaces().map();
			case Bw5Package.GROUP__WIDTH:
				return getWidth();
			case Bw5Package.GROUP__HEIGHT:
				return getHeight();
			case Bw5Package.GROUP__COLLAPSED_WIDTH:
				return getCollapsedWidth();
			case Bw5Package.GROUP__COLLAPSED_HEIGHT:
				return getCollapsedHeight();
			case Bw5Package.GROUP__EXPANDED:
				return isExpanded();
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
			case Bw5Package.GROUP__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case Bw5Package.GROUP__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case Bw5Package.GROUP__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case Bw5Package.GROUP__START:
				setStart((Node)newValue);
				return;
			case Bw5Package.GROUP__END:
				setEnd((Node)newValue);
				return;
			case Bw5Package.GROUP__RETURN_BINDINGS:
				setReturnBindings((String)newValue);
				return;
			case Bw5Package.GROUP__RETURN_BINDINGS_NAMESPACES:
				((EStructuralFeature.Setting)getReturnBindingsNamespaces()).set(newValue);
				return;
			case Bw5Package.GROUP__WIDTH:
				setWidth((Integer)newValue);
				return;
			case Bw5Package.GROUP__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case Bw5Package.GROUP__COLLAPSED_WIDTH:
				setCollapsedWidth((Integer)newValue);
				return;
			case Bw5Package.GROUP__COLLAPSED_HEIGHT:
				setCollapsedHeight((Integer)newValue);
				return;
			case Bw5Package.GROUP__EXPANDED:
				setExpanded((Boolean)newValue);
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
			case Bw5Package.GROUP__ACTIVITIES:
				getActivities().clear();
				return;
			case Bw5Package.GROUP__GROUPS:
				getGroups().clear();
				return;
			case Bw5Package.GROUP__TRANSITIONS:
				getTransitions().clear();
				return;
			case Bw5Package.GROUP__START:
				setStart((Node)null);
				return;
			case Bw5Package.GROUP__END:
				setEnd((Node)null);
				return;
			case Bw5Package.GROUP__RETURN_BINDINGS:
				setReturnBindings(RETURN_BINDINGS_EDEFAULT);
				return;
			case Bw5Package.GROUP__RETURN_BINDINGS_NAMESPACES:
				getReturnBindingsNamespaces().clear();
				return;
			case Bw5Package.GROUP__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case Bw5Package.GROUP__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case Bw5Package.GROUP__COLLAPSED_WIDTH:
				setCollapsedWidth(COLLAPSED_WIDTH_EDEFAULT);
				return;
			case Bw5Package.GROUP__COLLAPSED_HEIGHT:
				setCollapsedHeight(COLLAPSED_HEIGHT_EDEFAULT);
				return;
			case Bw5Package.GROUP__EXPANDED:
				setExpanded(EXPANDED_EDEFAULT);
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
			case Bw5Package.GROUP__ACTIVITIES:
				return !getActivities().isEmpty();
			case Bw5Package.GROUP__GROUPS:
				return !getGroups().isEmpty();
			case Bw5Package.GROUP__TRANSITIONS:
				return !getTransitions().isEmpty();
			case Bw5Package.GROUP__START:
				return basicGetStart() != null;
			case Bw5Package.GROUP__END:
				return basicGetEnd() != null;
			case Bw5Package.GROUP__RETURN_BINDINGS:
				return RETURN_BINDINGS_EDEFAULT == null ? getReturnBindings() != null : !RETURN_BINDINGS_EDEFAULT.equals(getReturnBindings());
			case Bw5Package.GROUP__RETURN_BINDINGS_NAMESPACES:
				return !getReturnBindingsNamespaces().isEmpty();
			case Bw5Package.GROUP__WIDTH:
				return getWidth() != WIDTH_EDEFAULT;
			case Bw5Package.GROUP__HEIGHT:
				return getHeight() != HEIGHT_EDEFAULT;
			case Bw5Package.GROUP__COLLAPSED_WIDTH:
				return getCollapsedWidth() != COLLAPSED_WIDTH_EDEFAULT;
			case Bw5Package.GROUP__COLLAPSED_HEIGHT:
				return getCollapsedHeight() != COLLAPSED_HEIGHT_EDEFAULT;
			case Bw5Package.GROUP__EXPANDED:
				return isExpanded() != EXPANDED_EDEFAULT;
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
		if (baseClass == org.nasdanika.models.bw5.Container.class) {
			switch (derivedFeatureID) {
				case Bw5Package.GROUP__ACTIVITIES: return Bw5Package.CONTAINER__ACTIVITIES;
				case Bw5Package.GROUP__GROUPS: return Bw5Package.CONTAINER__GROUPS;
				case Bw5Package.GROUP__TRANSITIONS: return Bw5Package.CONTAINER__TRANSITIONS;
				case Bw5Package.GROUP__START: return Bw5Package.CONTAINER__START;
				case Bw5Package.GROUP__END: return Bw5Package.CONTAINER__END;
				case Bw5Package.GROUP__RETURN_BINDINGS: return Bw5Package.CONTAINER__RETURN_BINDINGS;
				case Bw5Package.GROUP__RETURN_BINDINGS_NAMESPACES: return Bw5Package.CONTAINER__RETURN_BINDINGS_NAMESPACES;
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
		if (baseClass == org.nasdanika.models.bw5.Container.class) {
			switch (baseFeatureID) {
				case Bw5Package.CONTAINER__ACTIVITIES: return Bw5Package.GROUP__ACTIVITIES;
				case Bw5Package.CONTAINER__GROUPS: return Bw5Package.GROUP__GROUPS;
				case Bw5Package.CONTAINER__TRANSITIONS: return Bw5Package.GROUP__TRANSITIONS;
				case Bw5Package.CONTAINER__START: return Bw5Package.GROUP__START;
				case Bw5Package.CONTAINER__END: return Bw5Package.GROUP__END;
				case Bw5Package.CONTAINER__RETURN_BINDINGS: return Bw5Package.GROUP__RETURN_BINDINGS;
				case Bw5Package.CONTAINER__RETURN_BINDINGS_NAMESPACES: return Bw5Package.GROUP__RETURN_BINDINGS_NAMESPACES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //GroupImpl
