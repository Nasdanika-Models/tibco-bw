/**
 */
package org.nasdanika.models.bw5;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace Aware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.NamespaceAware#getNamespaces <em>Namespaces</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getNamespaceAware()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NamespaceAware extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespaces</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespaces</em>' map.
	 * @see org.nasdanika.models.bw5.Bw5Package#getNamespaceAware_Namespaces()
	 * @model mapType="org.nasdanika.models.bw5.StringToStringEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getNamespaces();

} // NamespaceAware
