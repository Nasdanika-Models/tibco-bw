/**
 */
package org.nasdanika.models.bw5;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Root element of a BW 5.x process file (.process).
 * Corresponds to pd:ProcessDefinition in the XML namespace
 * http://xmlns.tibco.com/bw/process/2003.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.ProcessDefinition#getStartType <em>Start Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.ProcessDefinition#getEndType <em>End Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.ProcessDefinition#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.ProcessDefinition#getStarter <em>Starter</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.ProcessDefinition#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.ProcessDefinition#getProcessVariables <em>Process Variables</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.ProcessDefinition#getErrorSchemas <em>Error Schemas</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getProcessDefinition()
 * @model
 * @generated
 */
public interface ProcessDefinition extends Container, CallTarget, Resource {
	/**
	 * Returns the value of the '<em><b>Start Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Canonical type of the start element (optional).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Type</em>' attribute.
	 * @see #setStartType(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getProcessDefinition_StartType()
	 * @model unique="false"
	 * @generated
	 */
	String getStartType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.ProcessDefinition#getStartType <em>Start Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Type</em>' attribute.
	 * @see #getStartType()
	 * @generated
	 */
	void setStartType(String value);

	/**
	 * Returns the value of the '<em><b>End Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Canonical type of the end element (optional).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Type</em>' attribute.
	 * @see #setEndType(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getProcessDefinition_EndType()
	 * @model unique="false"
	 * @generated
	 */
	String getEndType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.ProcessDefinition#getEndType <em>End Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Type</em>' attribute.
	 * @see #getEndType()
	 * @generated
	 */
	void setEndType(String value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The XML target namespace declared in the process file.
	 * Used to qualify XPath expressions within the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getProcessDefinition_TargetNamespace()
	 * @model unique="false"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.ProcessDefinition#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Starter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The optional event-source activity that starts this process
	 * (e.g. an HTTP receiver, JMS queue listener, Timer, ...).
	 * When present, startName refers to this starter's name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starter</em>' containment reference.
	 * @see #setStarter(Starter)
	 * @see org.nasdanika.models.bw5.Bw5Package#getProcessDefinition_Starter()
	 * @model containment="true"
	 * @generated
	 */
	Starter getStarter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.ProcessDefinition#getStarter <em>Starter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starter</em>' containment reference.
	 * @see #getStarter()
	 * @generated
	 */
	void setStarter(Starter value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw5.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Visual annotation labels on the diagram.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see org.nasdanika.models.bw5.Bw5Package#getProcessDefinition_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Process Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.bw5.ProcessVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Process-scoped variables declared in the process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Variables</em>' containment reference list.
	 * @see org.nasdanika.models.bw5.Bw5Package#getProcessDefinition_ProcessVariables()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<ProcessVariable> getProcessVariables();

	/**
	 * Returns the value of the '<em><b>Error Schemas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Error schemas that this process can throw.
	 * Stored as raw XML text because they are arbitrary XSD fragments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Schemas</em>' attribute.
	 * @see #setErrorSchemas(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getProcessDefinition_ErrorSchemas()
	 * @model unique="false"
	 * @generated
	 */
	String getErrorSchemas();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.ProcessDefinition#getErrorSchemas <em>Error Schemas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Schemas</em>' attribute.
	 * @see #getErrorSchemas()
	 * @generated
	 */
	void setErrorSchemas(String value);

} // ProcessDefinition
