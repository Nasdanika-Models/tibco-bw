/**
 */
package org.nasdanika.models.bw5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Calls are used for resolving inter-process communications.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.Call#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Call#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Call#getCaller <em>Caller</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getCall()
 * @model
 * @generated
 */
public interface Call extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getCall_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Call#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.bw5.CallTarget#getIncomingCalls <em>Incoming Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(CallTarget)
	 * @see org.nasdanika.models.bw5.Bw5Package#getCall_Target()
	 * @see org.nasdanika.models.bw5.CallTarget#getIncomingCalls
	 * @model opposite="incomingCalls"
	 * @generated
	 */
	CallTarget getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Call#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CallTarget value);

	/**
	 * Returns the value of the '<em><b>Caller</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.bw5.Caller#getOutgoingCalls <em>Outgoing Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caller</em>' container reference.
	 * @see #setCaller(Caller)
	 * @see org.nasdanika.models.bw5.Bw5Package#getCall_Caller()
	 * @see org.nasdanika.models.bw5.Caller#getOutgoingCalls
	 * @model opposite="outgoingCalls" transient="false"
	 * @generated
	 */
	Caller getCaller();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Call#getCaller <em>Caller</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caller</em>' container reference.
	 * @see #getCaller()
	 * @generated
	 */
	void setCaller(Caller value);

} // Call
