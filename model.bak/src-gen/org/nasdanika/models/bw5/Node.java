/**
 */
package org.nasdanika.models.bw5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.Node#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Node#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Node#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Node#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getNode()
 * @model
 * @generated
 */
public interface Node extends NamedElement {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * X coordinate on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see org.nasdanika.models.bw5.Bw5Package#getNode_X()
	 * @model unique="false"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Node#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Y coordinate on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see org.nasdanika.models.bw5.Bw5Package#getNode_Y()
	 * @model unique="false"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Node#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw5.Transition}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.bw5.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see org.nasdanika.models.bw5.Bw5Package#getNode_OutgoingTransitions()
	 * @see org.nasdanika.models.bw5.Transition#getSource
	 * @model opposite="source"
	 *        annotation="urn:org.nasdanika logicalContainment='true'"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw5.Transition}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.bw5.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see org.nasdanika.models.bw5.Bw5Package#getNode_IncomingTransitions()
	 * @see org.nasdanika.models.bw5.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

} // Node
