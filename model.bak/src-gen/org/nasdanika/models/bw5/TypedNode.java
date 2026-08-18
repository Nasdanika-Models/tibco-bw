/**
 */
package org.nasdanika.models.bw5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.TypedNode#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getTypedNode()
 * @model
 * @generated
 */
public interface TypedNode extends TypedElement, Node {
	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Palette / resource-type identifier used by the BW Designer,
	 * e.g. "ae.activities.log".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see #setResourceType(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getTypedNode_ResourceType()
	 * @model unique="false"
	 * @generated
	 */
	String getResourceType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.TypedNode#getResourceType <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' attribute.
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(String value);

} // TypedNode
