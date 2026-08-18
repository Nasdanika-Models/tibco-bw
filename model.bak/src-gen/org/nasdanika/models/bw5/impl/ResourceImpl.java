/**
 */
package org.nasdanika.models.bw5.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.bw5.Bw5Package;
import org.nasdanika.models.bw5.Folder;
import org.nasdanika.models.bw5.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.impl.ResourceImpl#getProjectPath <em>Project Path</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ResourceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.impl.ResourceImpl#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends NamedElementImpl implements Resource {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bw5Package.Literals.RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProjectPath() {
		return (String)eDynamicGet(Bw5Package.RESOURCE__PROJECT_PATH, Bw5Package.Literals.RESOURCE__PROJECT_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectPath(String newProjectPath) {
		eDynamicSet(Bw5Package.RESOURCE__PROJECT_PATH, Bw5Package.Literals.RESOURCE__PROJECT_PATH, newProjectPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Folder getParent() {
		return (Folder)eDynamicGet(Bw5Package.RESOURCE__PARENT, Bw5Package.Literals.RESOURCE__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder basicGetParent() {
		return (Folder)eDynamicGet(Bw5Package.RESOURCE__PARENT, Bw5Package.Literals.RESOURCE__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Folder newParent, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newParent, Bw5Package.RESOURCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(Folder newParent) {
		eDynamicSet(Bw5Package.RESOURCE__PARENT, Bw5Package.Literals.RESOURCE__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileName() {
		return (String)eDynamicGet(Bw5Package.RESOURCE__FILE_NAME, Bw5Package.Literals.RESOURCE__FILE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		eDynamicSet(Bw5Package.RESOURCE__FILE_NAME, Bw5Package.Literals.RESOURCE__FILE_NAME, newFileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bw5Package.RESOURCE__PARENT:
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
			case Bw5Package.RESOURCE__PARENT:
				return basicSetParent(null, msgs);
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
			case Bw5Package.RESOURCE__PROJECT_PATH:
				return getProjectPath();
			case Bw5Package.RESOURCE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case Bw5Package.RESOURCE__FILE_NAME:
				return getFileName();
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
			case Bw5Package.RESOURCE__PROJECT_PATH:
				setProjectPath((String)newValue);
				return;
			case Bw5Package.RESOURCE__PARENT:
				setParent((Folder)newValue);
				return;
			case Bw5Package.RESOURCE__FILE_NAME:
				setFileName((String)newValue);
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
			case Bw5Package.RESOURCE__PROJECT_PATH:
				setProjectPath(PROJECT_PATH_EDEFAULT);
				return;
			case Bw5Package.RESOURCE__PARENT:
				setParent((Folder)null);
				return;
			case Bw5Package.RESOURCE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
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
			case Bw5Package.RESOURCE__PROJECT_PATH:
				return PROJECT_PATH_EDEFAULT == null ? getProjectPath() != null : !PROJECT_PATH_EDEFAULT.equals(getProjectPath());
			case Bw5Package.RESOURCE__PARENT:
				return basicGetParent() != null;
			case Bw5Package.RESOURCE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? getFileName() != null : !FILE_NAME_EDEFAULT.equals(getFileName());
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
