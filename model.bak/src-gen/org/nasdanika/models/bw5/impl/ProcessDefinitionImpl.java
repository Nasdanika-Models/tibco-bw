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
import org.nasdanika.models.bw5.Call;
import org.nasdanika.models.bw5.CallTarget;
import org.nasdanika.models.bw5.Folder;
import org.nasdanika.models.bw5.Label;
import org.nasdanika.models.bw5.ProcessDefinition;
import org.nasdanika.models.bw5.ProcessVariable;
import org.nasdanika.models.bw5.Resource;
import org.nasdanika.models.bw5.Starter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.impl.ProcessDefinitionImpl#getIncomingCalls <em>Incoming Calls</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ProcessDefinitionImpl#getProjectPath <em>Project Path</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ProcessDefinitionImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ProcessDefinitionImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ProcessDefinitionImpl#getStartType <em>Start Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ProcessDefinitionImpl#getEndType <em>End Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ProcessDefinitionImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ProcessDefinitionImpl#getStarter <em>Starter</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ProcessDefinitionImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ProcessDefinitionImpl#getProcessVariables <em>Process Variables</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ProcessDefinitionImpl#getErrorSchemas <em>Error Schemas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessDefinitionImpl extends ContainerImpl implements ProcessDefinition {
	/**
	 * The default value of the '{@link #getProjectPath() <em>Project Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStartType() <em>Start Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartType()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEndType() <em>End Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndType()
	 * @generated
	 * @ordered
	 */
	protected static final String END_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getErrorSchemas() <em>Error Schemas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorSchemas()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_SCHEMAS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw5Package.Literals.PROCESS_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getIncomingCalls() {
		return (EList<Call>)eDynamicGet(Bw5Package.PROCESS_DEFINITION__INCOMING_CALLS, Bw5Package.Literals.CALL_TARGET__INCOMING_CALLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectPath() {
		return (String)eDynamicGet(Bw5Package.PROCESS_DEFINITION__PROJECT_PATH, Bw5Package.Literals.RESOURCE__PROJECT_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectPath(String newProjectPath) {
		eDynamicSet(Bw5Package.PROCESS_DEFINITION__PROJECT_PATH, Bw5Package.Literals.RESOURCE__PROJECT_PATH, newProjectPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Folder getParent() {
		return (Folder)eDynamicGet(Bw5Package.PROCESS_DEFINITION__PARENT, Bw5Package.Literals.RESOURCE__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder basicGetParent() {
		return (Folder)eDynamicGet(Bw5Package.PROCESS_DEFINITION__PARENT, Bw5Package.Literals.RESOURCE__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Folder newParent, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newParent, Bw5Package.PROCESS_DEFINITION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(Folder newParent) {
		eDynamicSet(Bw5Package.PROCESS_DEFINITION__PARENT, Bw5Package.Literals.RESOURCE__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileName() {
		return (String)eDynamicGet(Bw5Package.PROCESS_DEFINITION__FILE_NAME, Bw5Package.Literals.RESOURCE__FILE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		eDynamicSet(Bw5Package.PROCESS_DEFINITION__FILE_NAME, Bw5Package.Literals.RESOURCE__FILE_NAME, newFileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartType() {
		return (String)eDynamicGet(Bw5Package.PROCESS_DEFINITION__START_TYPE, Bw5Package.Literals.PROCESS_DEFINITION__START_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartType(String newStartType) {
		eDynamicSet(Bw5Package.PROCESS_DEFINITION__START_TYPE, Bw5Package.Literals.PROCESS_DEFINITION__START_TYPE, newStartType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndType() {
		return (String)eDynamicGet(Bw5Package.PROCESS_DEFINITION__END_TYPE, Bw5Package.Literals.PROCESS_DEFINITION__END_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndType(String newEndType) {
		eDynamicSet(Bw5Package.PROCESS_DEFINITION__END_TYPE, Bw5Package.Literals.PROCESS_DEFINITION__END_TYPE, newEndType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetNamespace() {
		return (String)eDynamicGet(Bw5Package.PROCESS_DEFINITION__TARGET_NAMESPACE, Bw5Package.Literals.PROCESS_DEFINITION__TARGET_NAMESPACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetNamespace(String newTargetNamespace) {
		eDynamicSet(Bw5Package.PROCESS_DEFINITION__TARGET_NAMESPACE, Bw5Package.Literals.PROCESS_DEFINITION__TARGET_NAMESPACE, newTargetNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Starter getStarter() {
		return (Starter)eDynamicGet(Bw5Package.PROCESS_DEFINITION__STARTER, Bw5Package.Literals.PROCESS_DEFINITION__STARTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarter(Starter newStarter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStarter, Bw5Package.PROCESS_DEFINITION__STARTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStarter(Starter newStarter) {
		eDynamicSet(Bw5Package.PROCESS_DEFINITION__STARTER, Bw5Package.Literals.PROCESS_DEFINITION__STARTER, newStarter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Label> getLabels() {
		return (EList<Label>)eDynamicGet(Bw5Package.PROCESS_DEFINITION__LABELS, Bw5Package.Literals.PROCESS_DEFINITION__LABELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ProcessVariable> getProcessVariables() {
		return (EList<ProcessVariable>)eDynamicGet(Bw5Package.PROCESS_DEFINITION__PROCESS_VARIABLES, Bw5Package.Literals.PROCESS_DEFINITION__PROCESS_VARIABLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorSchemas() {
		return (String)eDynamicGet(Bw5Package.PROCESS_DEFINITION__ERROR_SCHEMAS, Bw5Package.Literals.PROCESS_DEFINITION__ERROR_SCHEMAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorSchemas(String newErrorSchemas) {
		eDynamicSet(Bw5Package.PROCESS_DEFINITION__ERROR_SCHEMAS, Bw5Package.Literals.PROCESS_DEFINITION__ERROR_SCHEMAS, newErrorSchemas);
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
			case Bw5Package.PROCESS_DEFINITION__INCOMING_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingCalls()).basicAdd(otherEnd, msgs);
			case Bw5Package.PROCESS_DEFINITION__PARENT:
				Folder parent = basicGetParent();
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, Bw5Package.FOLDER__RESOURCES, Folder.class, msgs);
				return basicSetParent((Folder)otherEnd, msgs);
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
			case Bw5Package.PROCESS_DEFINITION__INCOMING_CALLS:
				return ((InternalEList<?>)getIncomingCalls()).basicRemove(otherEnd, msgs);
			case Bw5Package.PROCESS_DEFINITION__PARENT:
				return basicSetParent(null, msgs);
			case Bw5Package.PROCESS_DEFINITION__STARTER:
				return basicSetStarter(null, msgs);
			case Bw5Package.PROCESS_DEFINITION__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
			case Bw5Package.PROCESS_DEFINITION__PROCESS_VARIABLES:
				return ((InternalEList<?>)getProcessVariables()).basicRemove(otherEnd, msgs);
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
			case Bw5Package.PROCESS_DEFINITION__INCOMING_CALLS:
				return getIncomingCalls();
			case Bw5Package.PROCESS_DEFINITION__PROJECT_PATH:
				return getProjectPath();
			case Bw5Package.PROCESS_DEFINITION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case Bw5Package.PROCESS_DEFINITION__FILE_NAME:
				return getFileName();
			case Bw5Package.PROCESS_DEFINITION__START_TYPE:
				return getStartType();
			case Bw5Package.PROCESS_DEFINITION__END_TYPE:
				return getEndType();
			case Bw5Package.PROCESS_DEFINITION__TARGET_NAMESPACE:
				return getTargetNamespace();
			case Bw5Package.PROCESS_DEFINITION__STARTER:
				return getStarter();
			case Bw5Package.PROCESS_DEFINITION__LABELS:
				return getLabels();
			case Bw5Package.PROCESS_DEFINITION__PROCESS_VARIABLES:
				return getProcessVariables();
			case Bw5Package.PROCESS_DEFINITION__ERROR_SCHEMAS:
				return getErrorSchemas();
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
			case Bw5Package.PROCESS_DEFINITION__INCOMING_CALLS:
				getIncomingCalls().clear();
				getIncomingCalls().addAll((Collection<? extends Call>)newValue);
				return;
			case Bw5Package.PROCESS_DEFINITION__PROJECT_PATH:
				setProjectPath((String)newValue);
				return;
			case Bw5Package.PROCESS_DEFINITION__PARENT:
				setParent((Folder)newValue);
				return;
			case Bw5Package.PROCESS_DEFINITION__FILE_NAME:
				setFileName((String)newValue);
				return;
			case Bw5Package.PROCESS_DEFINITION__START_TYPE:
				setStartType((String)newValue);
				return;
			case Bw5Package.PROCESS_DEFINITION__END_TYPE:
				setEndType((String)newValue);
				return;
			case Bw5Package.PROCESS_DEFINITION__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case Bw5Package.PROCESS_DEFINITION__STARTER:
				setStarter((Starter)newValue);
				return;
			case Bw5Package.PROCESS_DEFINITION__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
				return;
			case Bw5Package.PROCESS_DEFINITION__PROCESS_VARIABLES:
				getProcessVariables().clear();
				getProcessVariables().addAll((Collection<? extends ProcessVariable>)newValue);
				return;
			case Bw5Package.PROCESS_DEFINITION__ERROR_SCHEMAS:
				setErrorSchemas((String)newValue);
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
			case Bw5Package.PROCESS_DEFINITION__INCOMING_CALLS:
				getIncomingCalls().clear();
				return;
			case Bw5Package.PROCESS_DEFINITION__PROJECT_PATH:
				setProjectPath(PROJECT_PATH_EDEFAULT);
				return;
			case Bw5Package.PROCESS_DEFINITION__PARENT:
				setParent((Folder)null);
				return;
			case Bw5Package.PROCESS_DEFINITION__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case Bw5Package.PROCESS_DEFINITION__START_TYPE:
				setStartType(START_TYPE_EDEFAULT);
				return;
			case Bw5Package.PROCESS_DEFINITION__END_TYPE:
				setEndType(END_TYPE_EDEFAULT);
				return;
			case Bw5Package.PROCESS_DEFINITION__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case Bw5Package.PROCESS_DEFINITION__STARTER:
				setStarter((Starter)null);
				return;
			case Bw5Package.PROCESS_DEFINITION__LABELS:
				getLabels().clear();
				return;
			case Bw5Package.PROCESS_DEFINITION__PROCESS_VARIABLES:
				getProcessVariables().clear();
				return;
			case Bw5Package.PROCESS_DEFINITION__ERROR_SCHEMAS:
				setErrorSchemas(ERROR_SCHEMAS_EDEFAULT);
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
			case Bw5Package.PROCESS_DEFINITION__INCOMING_CALLS:
				return !getIncomingCalls().isEmpty();
			case Bw5Package.PROCESS_DEFINITION__PROJECT_PATH:
				return PROJECT_PATH_EDEFAULT == null ? getProjectPath() != null : !PROJECT_PATH_EDEFAULT.equals(getProjectPath());
			case Bw5Package.PROCESS_DEFINITION__PARENT:
				return basicGetParent() != null;
			case Bw5Package.PROCESS_DEFINITION__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? getFileName() != null : !FILE_NAME_EDEFAULT.equals(getFileName());
			case Bw5Package.PROCESS_DEFINITION__START_TYPE:
				return START_TYPE_EDEFAULT == null ? getStartType() != null : !START_TYPE_EDEFAULT.equals(getStartType());
			case Bw5Package.PROCESS_DEFINITION__END_TYPE:
				return END_TYPE_EDEFAULT == null ? getEndType() != null : !END_TYPE_EDEFAULT.equals(getEndType());
			case Bw5Package.PROCESS_DEFINITION__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? getTargetNamespace() != null : !TARGET_NAMESPACE_EDEFAULT.equals(getTargetNamespace());
			case Bw5Package.PROCESS_DEFINITION__STARTER:
				return getStarter() != null;
			case Bw5Package.PROCESS_DEFINITION__LABELS:
				return !getLabels().isEmpty();
			case Bw5Package.PROCESS_DEFINITION__PROCESS_VARIABLES:
				return !getProcessVariables().isEmpty();
			case Bw5Package.PROCESS_DEFINITION__ERROR_SCHEMAS:
				return ERROR_SCHEMAS_EDEFAULT == null ? getErrorSchemas() != null : !ERROR_SCHEMAS_EDEFAULT.equals(getErrorSchemas());
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
		if (baseClass == CallTarget.class) {
			switch (derivedFeatureID) {
				case Bw5Package.PROCESS_DEFINITION__INCOMING_CALLS: return Bw5Package.CALL_TARGET__INCOMING_CALLS;
				default: return -1;
			}
		}
		if (baseClass == Resource.class) {
			switch (derivedFeatureID) {
				case Bw5Package.PROCESS_DEFINITION__PROJECT_PATH: return Bw5Package.RESOURCE__PROJECT_PATH;
				case Bw5Package.PROCESS_DEFINITION__PARENT: return Bw5Package.RESOURCE__PARENT;
				case Bw5Package.PROCESS_DEFINITION__FILE_NAME: return Bw5Package.RESOURCE__FILE_NAME;
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
		if (baseClass == CallTarget.class) {
			switch (baseFeatureID) {
				case Bw5Package.CALL_TARGET__INCOMING_CALLS: return Bw5Package.PROCESS_DEFINITION__INCOMING_CALLS;
				default: return -1;
			}
		}
		if (baseClass == Resource.class) {
			switch (baseFeatureID) {
				case Bw5Package.RESOURCE__PROJECT_PATH: return Bw5Package.PROCESS_DEFINITION__PROJECT_PATH;
				case Bw5Package.RESOURCE__PARENT: return Bw5Package.PROCESS_DEFINITION__PARENT;
				case Bw5Package.RESOURCE__FILE_NAME: return Bw5Package.PROCESS_DEFINITION__FILE_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProcessDefinitionImpl
