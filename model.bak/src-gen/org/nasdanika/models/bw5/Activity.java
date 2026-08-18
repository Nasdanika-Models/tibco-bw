/**
 */
package org.nasdanika.models.bw5;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An activity (task or step) within a BW process or group.
 * Corresponds to pd:activity in the process XML.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.Activity#getConfig <em>Config</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Activity#getInputBindings <em>Input Bindings</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Activity#getInputBindingsNamespaces <em>Input Bindings Namespaces</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getActivity()
 * @model
 * @generated
 */
public interface Activity extends TypedNode, Caller, NamespaceAware {
	/**
	 * Returns the value of the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Activity-specific configuration, stored as raw XML text.
	 * The structure varies per activity type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config</em>' attribute.
	 * @see #setConfig(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getActivity_Config()
	 * @model unique="false"
	 * @generated
	 */
	String getConfig();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Activity#getConfig <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' attribute.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(String value);

	/**
	 * Returns the value of the '<em><b>Input Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * XSL input bindings for this activity, stored as raw XML text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Bindings</em>' attribute.
	 * @see #setInputBindings(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getActivity_InputBindings()
	 * @model unique="false"
	 * @generated
	 */
	String getInputBindings();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Activity#getInputBindings <em>Input Bindings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Bindings</em>' attribute.
	 * @see #getInputBindings()
	 * @generated
	 */
	void setInputBindings(String value);

	/**
	 * Returns the value of the '<em><b>Input Bindings Namespaces</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Bindings Namespaces</em>' map.
	 * @see org.nasdanika.models.bw5.Bw5Package#getActivity_InputBindingsNamespaces()
	 * @model mapType="org.nasdanika.models.bw5.StringToStringEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getInputBindingsNamespaces();

} // Activity
