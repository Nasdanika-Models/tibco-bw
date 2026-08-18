/**
 */
package org.nasdanika.models.bw5;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Something that can receive calls
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.CallTarget#getIncomingCalls <em>Incoming Calls</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getCallTarget()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CallTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Calls</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw5.Call}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.bw5.Call#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Calls</em>' reference list.
	 * @see org.nasdanika.models.bw5.Bw5Package#getCallTarget_IncomingCalls()
	 * @see org.nasdanika.models.bw5.Call#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Call> getIncomingCalls();

} // CallTarget
