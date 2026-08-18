/**
 */
package org.nasdanika.models.bw5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A group of activities, used to model structured constructs such as:
 *   - Loops (Repeat-Until, For-Each, While)
 *   - Error handlers / Fault handlers
 *   - Critical sections
 *   - Scope groups
 * 
 * Corresponds to pd:group in the process XML.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.Group#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Group#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Group#getCollapsedWidth <em>Collapsed Width</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Group#getCollapsedHeight <em>Collapsed Height</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Group#isExpanded <em>Expanded</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getGroup()
 * @model
 * @generated
 */
public interface Group extends Activity, Container {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Width of the expanded group frame on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.nasdanika.models.bw5.Bw5Package#getGroup_Width()
	 * @model unique="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Group#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Height of the expanded group frame on the design canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.nasdanika.models.bw5.Bw5Package#getGroup_Height()
	 * @model unique="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Group#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Collapsed Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Width of the group icon when collapsed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsed Width</em>' attribute.
	 * @see #setCollapsedWidth(int)
	 * @see org.nasdanika.models.bw5.Bw5Package#getGroup_CollapsedWidth()
	 * @model unique="false"
	 * @generated
	 */
	int getCollapsedWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Group#getCollapsedWidth <em>Collapsed Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsed Width</em>' attribute.
	 * @see #getCollapsedWidth()
	 * @generated
	 */
	void setCollapsedWidth(int value);

	/**
	 * Returns the value of the '<em><b>Collapsed Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Height of the group icon when collapsed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collapsed Height</em>' attribute.
	 * @see #setCollapsedHeight(int)
	 * @see org.nasdanika.models.bw5.Bw5Package#getGroup_CollapsedHeight()
	 * @model unique="false"
	 * @generated
	 */
	int getCollapsedHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Group#getCollapsedHeight <em>Collapsed Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collapsed Height</em>' attribute.
	 * @see #getCollapsedHeight()
	 * @generated
	 */
	void setCollapsedHeight(int value);

	/**
	 * Returns the value of the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Whether the group is shown in expanded form on the canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expanded</em>' attribute.
	 * @see #setExpanded(boolean)
	 * @see org.nasdanika.models.bw5.Bw5Package#getGroup_Expanded()
	 * @model unique="false"
	 * @generated
	 */
	boolean isExpanded();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Group#isExpanded <em>Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expanded</em>' attribute.
	 * @see #isExpanded()
	 * @generated
	 */
	void setExpanded(boolean value);

} // Group
