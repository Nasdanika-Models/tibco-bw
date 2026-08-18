/**
 */
package org.nasdanika.models.bw5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Project resource - process definition, XSD, ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.bw5.Resource#getProjectPath <em>Project Path</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Resource#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.models.bw5.Resource#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getResource()
 * @model
 * @generated
 */
public interface Resource extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Project Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Relative path in the project
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Project Path</em>' attribute.
	 * @see #setProjectPath(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getResource_ProjectPath()
	 * @model unique="false"
	 * @generated
	 */
	String getProjectPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Resource#getProjectPath <em>Project Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Path</em>' attribute.
	 * @see #getProjectPath()
	 * @generated
	 */
	void setProjectPath(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.bw5.Folder#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Folder)
	 * @see org.nasdanika.models.bw5.Bw5Package#getResource_Parent()
	 * @see org.nasdanika.models.bw5.Folder#getResources
	 * @model opposite="resources"
	 * @generated
	 */
	Folder getParent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Resource#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Folder value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.nasdanika.models.bw5.Bw5Package#getResource_FileName()
	 * @model unique="false"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.bw5.Resource#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // Resource
