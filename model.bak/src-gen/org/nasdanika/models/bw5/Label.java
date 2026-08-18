/**
 */
package org.nasdanika.models.bw5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A visual annotation (sticky-note style label) placed on the design canvas.
 * Corresponds to pd:label in the process XML.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.Label#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Label#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Label#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Label#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Label#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Label#getThickness <em>Thickness</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Label#getFade <em>Fade</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getLabel()
 * @model
 * @generated
 */
public interface Label extends Node {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Width of the label box on the canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.nasdanika.models.bw5.Bw5Package#getLabel_Width()
	 * @model unique="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Label#getWidth <em>Width</em>}' attribute.
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
	 * Height of the label box on the canvas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.nasdanika.models.bw5.Bw5Package#getLabel_Height()
	 * @model unique="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Label#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Font color encoded as an RGB integer string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Color</em>' attribute.
	 * @see #setFontColor(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getLabel_FontColor()
	 * @model unique="false"
	 * @generated
	 */
	String getFontColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Label#getFontColor <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Color</em>' attribute.
	 * @see #getFontColor()
	 * @generated
	 */
	void setFontColor(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Background color encoded as an RGB integer string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getLabel_Color()
	 * @model unique="false"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Label#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Label shape type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getLabel_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Label#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Border line thickness.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thickness</em>' attribute.
	 * @see #setThickness(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getLabel_Thickness()
	 * @model unique="false"
	 * @generated
	 */
	String getThickness();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Label#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' attribute.
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(String value);

	/**
	 * Returns the value of the '<em><b>Fade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Opacity / fade value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fade</em>' attribute.
	 * @see #setFade(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getLabel_Fade()
	 * @model unique="false"
	 * @generated
	 */
	String getFade();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Label#getFade <em>Fade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fade</em>' attribute.
	 * @see #getFade()
	 * @generated
	 */
	void setFade(String value);

} // Label
