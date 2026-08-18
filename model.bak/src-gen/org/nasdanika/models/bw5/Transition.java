/**
 */
package org.nasdanika.models.bw5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A directed connection from one activity (or pseudo-state) to another.
 * Corresponds to pd:transition in the process XML.
 * 
 * The source and target are identified by the name of the containing
 * NamedElement (Activity, Starter, Group, or the special names "Start"
 * and "End" / "start" and "end" inside a group).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Transition#getTo <em>To</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Transition#getLineType <em>Line Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Transition#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Transition#getConditionType <em>Condition Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Transition#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Name of the source activity, group, or pseudo-state
	 * (e.g. "Log", "Start", "IterateAndFindMatch").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getTransition_From()
	 * @model unique="false"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Transition#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.bw5.Node#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see org.nasdanika.models.bw5.Bw5Package#getTransition_Source()
	 * @see org.nasdanika.models.bw5.Node#getOutgoingTransitions
	 * @model opposite="outgoingTransitions"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Name of the target activity, group, or pseudo-state
	 * (e.g. "End", "MapResultToResponse").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getTransition_To()
	 * @model unique="false"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Transition#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.bw5.Node#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see org.nasdanika.models.bw5.Bw5Package#getTransition_Target()
	 * @see org.nasdanika.models.bw5.Node#getIncomingTransitions
	 * @model opposite="incomingTransitions"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Visual style of the transition line.
	 * Common values: "Default", "Straight", "Curved".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Type</em>' attribute.
	 * @see #setLineType(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getTransition_LineType()
	 * @model unique="false"
	 * @generated
	 */
	String getLineType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Transition#getLineType <em>Line Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Type</em>' attribute.
	 * @see #getLineType()
	 * @generated
	 */
	void setLineType(String value);

	/**
	 * Returns the value of the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * RGB color of the transition line encoded as a signed integer
	 * (Java AWT convention), e.g. "-16777216" for black.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Color</em>' attribute.
	 * @see #setLineColor(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getTransition_LineColor()
	 * @model unique="false"
	 * @generated
	 */
	String getLineColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Transition#getLineColor <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Color</em>' attribute.
	 * @see #getLineColor()
	 * @generated
	 */
	void setLineColor(String value);

	/**
	 * Returns the value of the '<em><b>Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * How the transition is enabled.
	 * Common values: "always", "expression", "error", "timeout".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Type</em>' attribute.
	 * @see #setConditionType(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getTransition_ConditionType()
	 * @model unique="false"
	 * @generated
	 */
	String getConditionType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Transition#getConditionType <em>Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Type</em>' attribute.
	 * @see #getConditionType()
	 * @generated
	 */
	void setConditionType(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * XPath/XSL condition expression evaluated at runtime to decide
	 * whether this transition fires.  Only used when conditionType
	 * is "expression".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getTransition_Condition()
	 * @model unique="false"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Transition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // Transition
