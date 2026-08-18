/**
 */
package org.nasdanika.models.bw5;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Xcore model for BW 5.x concepts.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.bw5.Bw5Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel bundleManifest='false' featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface Bw5Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bw5";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://bw5.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.bw5";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bw5Package eINSTANCE = org.nasdanika.models.bw5.impl.Bw5PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.NamedElementImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.ContainerImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAMESPACES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ACTIVITIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__START = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__END = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Return Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RETURN_BINDINGS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Return Bindings Namespaces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RETURN_BINDINGS_NAMESPACES = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.StringToStringEntryImpl <em>String To String Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.StringToStringEntryImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getStringToStringEntry()
	 * @generated
	 */
	int STRING_TO_STRING_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.NamespaceAware <em>Namespace Aware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.NamespaceAware
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getNamespaceAware()
	 * @generated
	 */
	int NAMESPACE_AWARE = 3;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_AWARE__NAMESPACES = 0;

	/**
	 * The number of structural features of the '<em>Namespace Aware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_AWARE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Namespace Aware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_AWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.ProcessDefinitionImpl <em>Process Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.ProcessDefinitionImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getProcessDefinition()
	 * @generated
	 */
	int PROCESS_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__DESCRIPTION = CONTAINER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__NAMESPACES = CONTAINER__NAMESPACES;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__ACTIVITIES = CONTAINER__ACTIVITIES;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__GROUPS = CONTAINER__GROUPS;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__TRANSITIONS = CONTAINER__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__START = CONTAINER__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__END = CONTAINER__END;

	/**
	 * The feature id for the '<em><b>Return Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__RETURN_BINDINGS = CONTAINER__RETURN_BINDINGS;

	/**
	 * The feature id for the '<em><b>Return Bindings Namespaces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__RETURN_BINDINGS_NAMESPACES = CONTAINER__RETURN_BINDINGS_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Incoming Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__INCOMING_CALLS = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Project Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__PROJECT_PATH = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__PARENT = CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__FILE_NAME = CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__START_TYPE = CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>End Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__END_TYPE = CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__TARGET_NAMESPACE = CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Starter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__STARTER = CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__LABELS = CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Process Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__PROCESS_VARIABLES = CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Error Schemas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION__ERROR_SCHEMAS = CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Process Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DEFINITION_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.NodeImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getNode()
	 * @generated
	 */
	int NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__X = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__Y = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING_TRANSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.TypedElementImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.TypedNodeImpl <em>Typed Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.TypedNodeImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getTypedNode()
	 * @generated
	 */
	int TYPED_NODE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__DESCRIPTION = TYPED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__X = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__Y = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__OUTGOING_TRANSITIONS = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__INCOMING_TRANSITIONS = TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE__RESOURCE_TYPE = TYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Typed Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Typed Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_NODE_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.ActivityImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = TYPED_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = TYPED_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TYPE = TYPED_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__X = TYPED_NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__Y = TYPED_NODE__Y;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTGOING_TRANSITIONS = TYPED_NODE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INCOMING_TRANSITIONS = TYPED_NODE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__RESOURCE_TYPE = TYPED_NODE__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Outgoing Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTGOING_CALLS = TYPED_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAMESPACES = TYPED_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONFIG = TYPED_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUT_BINDINGS = TYPED_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Bindings Namespaces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUT_BINDINGS_NAMESPACES = TYPED_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = TYPED_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = TYPED_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.StarterImpl <em>Starter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.StarterImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getStarter()
	 * @generated
	 */
	int STARTER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__TYPE = ACTIVITY__TYPE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__X = ACTIVITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__Y = ACTIVITY__Y;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__OUTGOING_TRANSITIONS = ACTIVITY__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__INCOMING_TRANSITIONS = ACTIVITY__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__RESOURCE_TYPE = ACTIVITY__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Outgoing Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__OUTGOING_CALLS = ACTIVITY__OUTGOING_CALLS;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__NAMESPACES = ACTIVITY__NAMESPACES;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__CONFIG = ACTIVITY__CONFIG;

	/**
	 * The feature id for the '<em><b>Input Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__INPUT_BINDINGS = ACTIVITY__INPUT_BINDINGS;

	/**
	 * The feature id for the '<em><b>Input Bindings Namespaces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER__INPUT_BINDINGS_NAMESPACES = ACTIVITY__INPUT_BINDINGS_NAMESPACES;

	/**
	 * The number of structural features of the '<em>Starter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Starter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTER_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.GroupImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TYPE = ACTIVITY__TYPE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__X = ACTIVITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__Y = ACTIVITY__Y;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__OUTGOING_TRANSITIONS = ACTIVITY__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__INCOMING_TRANSITIONS = ACTIVITY__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__RESOURCE_TYPE = ACTIVITY__RESOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Outgoing Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__OUTGOING_CALLS = ACTIVITY__OUTGOING_CALLS;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAMESPACES = ACTIVITY__NAMESPACES;

	/**
	 * The feature id for the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CONFIG = ACTIVITY__CONFIG;

	/**
	 * The feature id for the '<em><b>Input Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__INPUT_BINDINGS = ACTIVITY__INPUT_BINDINGS;

	/**
	 * The feature id for the '<em><b>Input Bindings Namespaces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__INPUT_BINDINGS_NAMESPACES = ACTIVITY__INPUT_BINDINGS_NAMESPACES;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ACTIVITIES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUPS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TRANSITIONS = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__START = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__END = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Return Bindings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__RETURN_BINDINGS = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Return Bindings Namespaces</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__RETURN_BINDINGS_NAMESPACES = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__WIDTH = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__HEIGHT = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Collapsed Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__COLLAPSED_WIDTH = ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Collapsed Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__COLLAPSED_HEIGHT = ACTIVITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__EXPANDED = ACTIVITY_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.TransitionImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 11;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Line Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LINE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LINE_COLOR = 5;

	/**
	 * The feature id for the '<em><b>Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = 7;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.LabelImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__X = NODE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__Y = NODE__Y;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OUTGOING_TRANSITIONS = NODE__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__INCOMING_TRANSITIONS = NODE__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGHT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT_COLOR = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLOR = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TYPE = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__THICKNESS = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FADE = NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = NODE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.ProcessVariableImpl <em>Process Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.ProcessVariableImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getProcessVariable()
	 * @generated
	 */
	int PROCESS_VARIABLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__NAME = TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__DESCRIPTION = TYPED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Process Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_VARIABLE_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.CallImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getCall()
	 * @generated
	 */
	int CALL = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Caller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__CALLER = 2;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.CallTarget <em>Call Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.CallTarget
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getCallTarget()
	 * @generated
	 */
	int CALL_TARGET = 15;

	/**
	 * The feature id for the '<em><b>Incoming Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TARGET__INCOMING_CALLS = 0;

	/**
	 * The number of structural features of the '<em>Call Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TARGET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Call Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.Caller <em>Caller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.Caller
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getCaller()
	 * @generated
	 */
	int CALLER = 16;

	/**
	 * The feature id for the '<em><b>Outgoing Calls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER__OUTGOING_CALLS = 0;

	/**
	 * The number of structural features of the '<em>Caller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Caller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.ResourceImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Project Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PROJECT_PATH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__PARENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__FILE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.FolderImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DESCRIPTION = RESOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Project Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PROJECT_PATH = RESOURCE__PROJECT_PATH;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PARENT = RESOURCE__PARENT;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__FILE_NAME = RESOURCE__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__RESOURCES = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__RESOURCE_TYPE = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.bw5.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.bw5.impl.ProjectImpl
	 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = FOLDER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = FOLDER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Project Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_PATH = FOLDER__PROJECT_PATH;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PARENT = FOLDER__PARENT;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FILE_NAME = FOLDER__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESOURCES = FOLDER__RESOURCES;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESOURCE_TYPE = FOLDER__RESOURCE_TYPE;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = FOLDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = FOLDER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.nasdanika.models.bw5.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.bw5.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.bw5.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.nasdanika.models.bw5.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bw5.Container#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.nasdanika.models.bw5.Container#getActivities()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Activities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bw5.Container#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.nasdanika.models.bw5.Container#getGroups()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bw5.Container#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.nasdanika.models.bw5.Container#getTransitions()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Transitions();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.bw5.Container#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.nasdanika.models.bw5.Container#getStart()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Start();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.bw5.Container#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.nasdanika.models.bw5.Container#getEnd()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_End();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Container#getReturnBindings <em>Return Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Bindings</em>'.
	 * @see org.nasdanika.models.bw5.Container#getReturnBindings()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_ReturnBindings();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.bw5.Container#getReturnBindingsNamespaces <em>Return Bindings Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Return Bindings Namespaces</em>'.
	 * @see org.nasdanika.models.bw5.Container#getReturnBindingsNamespaces()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_ReturnBindingsNamespaces();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyUnique="false" keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueUnique="false" valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToStringEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringEntry()
	 * @generated
	 */
	EAttribute getStringToStringEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringEntry()
	 * @generated
	 */
	EAttribute getStringToStringEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.NamespaceAware <em>Namespace Aware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Aware</em>'.
	 * @see org.nasdanika.models.bw5.NamespaceAware
	 * @generated
	 */
	EClass getNamespaceAware();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.bw5.NamespaceAware#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Namespaces</em>'.
	 * @see org.nasdanika.models.bw5.NamespaceAware#getNamespaces()
	 * @see #getNamespaceAware()
	 * @generated
	 */
	EReference getNamespaceAware_Namespaces();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.ProcessDefinition <em>Process Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Definition</em>'.
	 * @see org.nasdanika.models.bw5.ProcessDefinition
	 * @generated
	 */
	EClass getProcessDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.ProcessDefinition#getStartType <em>Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Type</em>'.
	 * @see org.nasdanika.models.bw5.ProcessDefinition#getStartType()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_StartType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.ProcessDefinition#getEndType <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Type</em>'.
	 * @see org.nasdanika.models.bw5.ProcessDefinition#getEndType()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_EndType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.ProcessDefinition#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.nasdanika.models.bw5.ProcessDefinition#getTargetNamespace()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_TargetNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.bw5.ProcessDefinition#getStarter <em>Starter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Starter</em>'.
	 * @see org.nasdanika.models.bw5.ProcessDefinition#getStarter()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Starter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bw5.ProcessDefinition#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see org.nasdanika.models.bw5.ProcessDefinition#getLabels()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_Labels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bw5.ProcessDefinition#getProcessVariables <em>Process Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process Variables</em>'.
	 * @see org.nasdanika.models.bw5.ProcessDefinition#getProcessVariables()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EReference getProcessDefinition_ProcessVariables();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.ProcessDefinition#getErrorSchemas <em>Error Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Schemas</em>'.
	 * @see org.nasdanika.models.bw5.ProcessDefinition#getErrorSchemas()
	 * @see #getProcessDefinition()
	 * @generated
	 */
	EAttribute getProcessDefinition_ErrorSchemas();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.nasdanika.models.bw5.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Node#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.models.bw5.Node#getX()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Node#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.models.bw5.Node#getY()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Y();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.bw5.Node#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see org.nasdanika.models.bw5.Node#getOutgoingTransitions()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.bw5.Node#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see org.nasdanika.models.bw5.Node#getIncomingTransitions()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_IncomingTransitions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see org.nasdanika.models.bw5.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.bw5.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.TypedNode <em>Typed Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Node</em>'.
	 * @see org.nasdanika.models.bw5.TypedNode
	 * @generated
	 */
	EClass getTypedNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.TypedNode#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see org.nasdanika.models.bw5.TypedNode#getResourceType()
	 * @see #getTypedNode()
	 * @generated
	 */
	EAttribute getTypedNode_ResourceType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.nasdanika.models.bw5.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Activity#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config</em>'.
	 * @see org.nasdanika.models.bw5.Activity#getConfig()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Config();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Activity#getInputBindings <em>Input Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Bindings</em>'.
	 * @see org.nasdanika.models.bw5.Activity#getInputBindings()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_InputBindings();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.bw5.Activity#getInputBindingsNamespaces <em>Input Bindings Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Input Bindings Namespaces</em>'.
	 * @see org.nasdanika.models.bw5.Activity#getInputBindingsNamespaces()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_InputBindingsNamespaces();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.Starter <em>Starter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Starter</em>'.
	 * @see org.nasdanika.models.bw5.Starter
	 * @generated
	 */
	EClass getStarter();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.nasdanika.models.bw5.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Group#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.models.bw5.Group#getWidth()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Group#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.models.bw5.Group#getHeight()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Group#getCollapsedWidth <em>Collapsed Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsed Width</em>'.
	 * @see org.nasdanika.models.bw5.Group#getCollapsedWidth()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_CollapsedWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Group#getCollapsedHeight <em>Collapsed Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collapsed Height</em>'.
	 * @see org.nasdanika.models.bw5.Group#getCollapsedHeight()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_CollapsedHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Group#isExpanded <em>Expanded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expanded</em>'.
	 * @see org.nasdanika.models.bw5.Group#isExpanded()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Expanded();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see org.nasdanika.models.bw5.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see org.nasdanika.models.bw5.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_From();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.bw5.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.nasdanika.models.bw5.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.nasdanika.models.bw5.Transition#getTo()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_To();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.bw5.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.bw5.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Transition#getLineType <em>Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Type</em>'.
	 * @see org.nasdanika.models.bw5.Transition#getLineType()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_LineType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Transition#getLineColor <em>Line Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Color</em>'.
	 * @see org.nasdanika.models.bw5.Transition#getLineColor()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_LineColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Transition#getConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Type</em>'.
	 * @see org.nasdanika.models.bw5.Transition#getConditionType()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_ConditionType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.nasdanika.models.bw5.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Condition();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.nasdanika.models.bw5.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Label#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.models.bw5.Label#getWidth()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Label#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.models.bw5.Label#getHeight()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Label#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Color</em>'.
	 * @see org.nasdanika.models.bw5.Label#getFontColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_FontColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Label#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.bw5.Label#getColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Label#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.bw5.Label#getType()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Label#getThickness <em>Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thickness</em>'.
	 * @see org.nasdanika.models.bw5.Label#getThickness()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Thickness();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Label#getFade <em>Fade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fade</em>'.
	 * @see org.nasdanika.models.bw5.Label#getFade()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Fade();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.ProcessVariable <em>Process Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Variable</em>'.
	 * @see org.nasdanika.models.bw5.ProcessVariable
	 * @generated
	 */
	EClass getProcessVariable();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see org.nasdanika.models.bw5.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Call#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.bw5.Call#getDescription()
	 * @see #getCall()
	 * @generated
	 */
	EAttribute getCall_Description();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.bw5.Call#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.bw5.Call#getTarget()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Target();

	/**
	 * Returns the meta object for the container reference '{@link org.nasdanika.models.bw5.Call#getCaller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Caller</em>'.
	 * @see org.nasdanika.models.bw5.Call#getCaller()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Caller();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.CallTarget <em>Call Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Target</em>'.
	 * @see org.nasdanika.models.bw5.CallTarget
	 * @generated
	 */
	EClass getCallTarget();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.bw5.CallTarget#getIncomingCalls <em>Incoming Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Calls</em>'.
	 * @see org.nasdanika.models.bw5.CallTarget#getIncomingCalls()
	 * @see #getCallTarget()
	 * @generated
	 */
	EReference getCallTarget_IncomingCalls();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.Caller <em>Caller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caller</em>'.
	 * @see org.nasdanika.models.bw5.Caller
	 * @generated
	 */
	EClass getCaller();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.bw5.Caller#getOutgoingCalls <em>Outgoing Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Calls</em>'.
	 * @see org.nasdanika.models.bw5.Caller#getOutgoingCalls()
	 * @see #getCaller()
	 * @generated
	 */
	EReference getCaller_OutgoingCalls();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.nasdanika.models.bw5.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Resource#getProjectPath <em>Project Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Path</em>'.
	 * @see org.nasdanika.models.bw5.Resource#getProjectPath()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ProjectPath();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.bw5.Resource#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.nasdanika.models.bw5.Resource#getParent()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Resource#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.nasdanika.models.bw5.Resource#getFileName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_FileName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.nasdanika.models.bw5.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.bw5.Folder#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see org.nasdanika.models.bw5.Folder#getResources()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Resources();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.bw5.Folder#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see org.nasdanika.models.bw5.Folder#getResourceType()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_ResourceType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.bw5.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.nasdanika.models.bw5.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bw5Factory getBw5Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.NamedElementImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.ContainerImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ACTIVITIES = eINSTANCE.getContainer_Activities();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__GROUPS = eINSTANCE.getContainer_Groups();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__TRANSITIONS = eINSTANCE.getContainer_Transitions();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__START = eINSTANCE.getContainer_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__END = eINSTANCE.getContainer_End();

		/**
		 * The meta object literal for the '<em><b>Return Bindings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__RETURN_BINDINGS = eINSTANCE.getContainer_ReturnBindings();

		/**
		 * The meta object literal for the '<em><b>Return Bindings Namespaces</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__RETURN_BINDINGS_NAMESPACES = eINSTANCE.getContainer_ReturnBindingsNamespaces();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.StringToStringEntryImpl <em>String To String Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.StringToStringEntryImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getStringToStringEntry()
		 * @generated
		 */
		EClass STRING_TO_STRING_ENTRY = eINSTANCE.getStringToStringEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_ENTRY__KEY = eINSTANCE.getStringToStringEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_ENTRY__VALUE = eINSTANCE.getStringToStringEntry_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.NamespaceAware <em>Namespace Aware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.NamespaceAware
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getNamespaceAware()
		 * @generated
		 */
		EClass NAMESPACE_AWARE = eINSTANCE.getNamespaceAware();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE_AWARE__NAMESPACES = eINSTANCE.getNamespaceAware_Namespaces();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.ProcessDefinitionImpl <em>Process Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.ProcessDefinitionImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getProcessDefinition()
		 * @generated
		 */
		EClass PROCESS_DEFINITION = eINSTANCE.getProcessDefinition();

		/**
		 * The meta object literal for the '<em><b>Start Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__START_TYPE = eINSTANCE.getProcessDefinition_StartType();

		/**
		 * The meta object literal for the '<em><b>End Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__END_TYPE = eINSTANCE.getProcessDefinition_EndType();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__TARGET_NAMESPACE = eINSTANCE.getProcessDefinition_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Starter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__STARTER = eINSTANCE.getProcessDefinition_Starter();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__LABELS = eINSTANCE.getProcessDefinition_Labels();

		/**
		 * The meta object literal for the '<em><b>Process Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DEFINITION__PROCESS_VARIABLES = eINSTANCE.getProcessDefinition_ProcessVariables();

		/**
		 * The meta object literal for the '<em><b>Error Schemas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_DEFINITION__ERROR_SCHEMAS = eINSTANCE.getProcessDefinition_ErrorSchemas();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.NodeImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__X = eINSTANCE.getNode_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__Y = eINSTANCE.getNode_Y();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING_TRANSITIONS = eINSTANCE.getNode_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING_TRANSITIONS = eINSTANCE.getNode_IncomingTransitions();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.TypedElementImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.TypedNodeImpl <em>Typed Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.TypedNodeImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getTypedNode()
		 * @generated
		 */
		EClass TYPED_NODE = eINSTANCE.getTypedNode();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_NODE__RESOURCE_TYPE = eINSTANCE.getTypedNode_ResourceType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.ActivityImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__CONFIG = eINSTANCE.getActivity_Config();

		/**
		 * The meta object literal for the '<em><b>Input Bindings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__INPUT_BINDINGS = eINSTANCE.getActivity_InputBindings();

		/**
		 * The meta object literal for the '<em><b>Input Bindings Namespaces</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INPUT_BINDINGS_NAMESPACES = eINSTANCE.getActivity_InputBindingsNamespaces();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.StarterImpl <em>Starter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.StarterImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getStarter()
		 * @generated
		 */
		EClass STARTER = eINSTANCE.getStarter();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.GroupImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__WIDTH = eINSTANCE.getGroup_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__HEIGHT = eINSTANCE.getGroup_Height();

		/**
		 * The meta object literal for the '<em><b>Collapsed Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__COLLAPSED_WIDTH = eINSTANCE.getGroup_CollapsedWidth();

		/**
		 * The meta object literal for the '<em><b>Collapsed Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__COLLAPSED_HEIGHT = eINSTANCE.getGroup_CollapsedHeight();

		/**
		 * The meta object literal for the '<em><b>Expanded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__EXPANDED = eINSTANCE.getGroup_Expanded();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.TransitionImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__FROM = eINSTANCE.getTransition_From();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Line Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__LINE_TYPE = eINSTANCE.getTransition_LineType();

		/**
		 * The meta object literal for the '<em><b>Line Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__LINE_COLOR = eINSTANCE.getTransition_LineColor();

		/**
		 * The meta object literal for the '<em><b>Condition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CONDITION_TYPE = eINSTANCE.getTransition_ConditionType();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.LabelImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__WIDTH = eINSTANCE.getLabel_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__HEIGHT = eINSTANCE.getLabel_Height();

		/**
		 * The meta object literal for the '<em><b>Font Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__FONT_COLOR = eINSTANCE.getLabel_FontColor();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__COLOR = eINSTANCE.getLabel_Color();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TYPE = eINSTANCE.getLabel_Type();

		/**
		 * The meta object literal for the '<em><b>Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__THICKNESS = eINSTANCE.getLabel_Thickness();

		/**
		 * The meta object literal for the '<em><b>Fade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__FADE = eINSTANCE.getLabel_Fade();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.ProcessVariableImpl <em>Process Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.ProcessVariableImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getProcessVariable()
		 * @generated
		 */
		EClass PROCESS_VARIABLE = eINSTANCE.getProcessVariable();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.CallImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL__DESCRIPTION = eINSTANCE.getCall_Description();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__TARGET = eINSTANCE.getCall_Target();

		/**
		 * The meta object literal for the '<em><b>Caller</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__CALLER = eINSTANCE.getCall_Caller();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.CallTarget <em>Call Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.CallTarget
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getCallTarget()
		 * @generated
		 */
		EClass CALL_TARGET = eINSTANCE.getCallTarget();

		/**
		 * The meta object literal for the '<em><b>Incoming Calls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_TARGET__INCOMING_CALLS = eINSTANCE.getCallTarget_IncomingCalls();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.Caller <em>Caller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.Caller
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getCaller()
		 * @generated
		 */
		EClass CALLER = eINSTANCE.getCaller();

		/**
		 * The meta object literal for the '<em><b>Outgoing Calls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLER__OUTGOING_CALLS = eINSTANCE.getCaller_OutgoingCalls();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.ResourceImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Project Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__PROJECT_PATH = eINSTANCE.getResource_ProjectPath();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__PARENT = eINSTANCE.getResource_Parent();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__FILE_NAME = eINSTANCE.getResource_FileName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.FolderImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__RESOURCES = eINSTANCE.getFolder_Resources();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__RESOURCE_TYPE = eINSTANCE.getFolder_ResourceType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.bw5.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.bw5.impl.ProjectImpl
		 * @see org.nasdanika.models.bw5.impl.Bw5PackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

	}

} //Bw5Package
