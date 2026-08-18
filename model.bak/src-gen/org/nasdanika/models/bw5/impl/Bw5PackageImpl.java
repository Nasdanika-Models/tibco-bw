/**
 */
package org.nasdanika.models.bw5.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.bw5.Activity;
import org.nasdanika.models.bw5.Bw5Factory;
import org.nasdanika.models.bw5.Bw5Package;
import org.nasdanika.models.bw5.Call;
import org.nasdanika.models.bw5.CallTarget;
import org.nasdanika.models.bw5.Caller;
import org.nasdanika.models.bw5.Folder;
import org.nasdanika.models.bw5.Group;
import org.nasdanika.models.bw5.Label;
import org.nasdanika.models.bw5.NamedElement;
import org.nasdanika.models.bw5.NamespaceAware;
import org.nasdanika.models.bw5.Node;
import org.nasdanika.models.bw5.ProcessDefinition;
import org.nasdanika.models.bw5.ProcessVariable;
import org.nasdanika.models.bw5.Project;
import org.nasdanika.models.bw5.Resource;
import org.nasdanika.models.bw5.Starter;
import org.nasdanika.models.bw5.Transition;
import org.nasdanika.models.bw5.TypedElement;
import org.nasdanika.models.bw5.TypedNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bw5PackageImpl extends EPackageImpl implements Bw5Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToStringEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceAwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass starterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.bw5.Bw5Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Bw5PackageImpl() {
		super(eNS_URI, Bw5Factory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Bw5Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Bw5Package init() {
		if (isInited) return (Bw5Package)EPackage.Registry.INSTANCE.getEPackage(Bw5Package.eNS_URI);

		// Obtain or create and register package
		Object registeredBw5Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Bw5PackageImpl theBw5Package = registeredBw5Package instanceof Bw5PackageImpl ? (Bw5PackageImpl)registeredBw5Package : new Bw5PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBw5Package.createPackageContents();

		// Initialize created meta-data
		theBw5Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBw5Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Bw5Package.eNS_URI, theBw5Package);
		return theBw5Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Description() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Activities() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Groups() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Transitions() {
		return (EReference)containerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Start() {
		return (EReference)containerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_End() {
		return (EReference)containerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_ReturnBindings() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_ReturnBindingsNamespaces() {
		return (EReference)containerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringToStringEntry() {
		return stringToStringEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToStringEntry_Key() {
		return (EAttribute)stringToStringEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToStringEntry_Value() {
		return (EAttribute)stringToStringEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamespaceAware() {
		return namespaceAwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespaceAware_Namespaces() {
		return (EReference)namespaceAwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessDefinition() {
		return processDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_StartType() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_EndType() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_TargetNamespace() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessDefinition_Starter() {
		return (EReference)processDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessDefinition_Labels() {
		return (EReference)processDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessDefinition_ProcessVariables() {
		return (EReference)processDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessDefinition_ErrorSchemas() {
		return (EAttribute)processDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_X() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Y() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_OutgoingTransitions() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_IncomingTransitions() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedElement_Type() {
		return (EAttribute)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypedNode() {
		return typedNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypedNode_ResourceType() {
		return (EAttribute)typedNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Config() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_InputBindings() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_InputBindingsNamespaces() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStarter() {
		return starterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Width() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Height() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_CollapsedWidth() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_CollapsedHeight() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Expanded() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_From() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_To() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_LineType() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_LineColor() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_ConditionType() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransition_Condition() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Width() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Height() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_FontColor() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Color() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Type() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Thickness() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Fade() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessVariable() {
		return processVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCall_Description() {
		return (EAttribute)callEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCall_Target() {
		return (EReference)callEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCall_Caller() {
		return (EReference)callEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallTarget() {
		return callTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallTarget_IncomingCalls() {
		return (EReference)callTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCaller() {
		return callerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaller_OutgoingCalls() {
		return (EReference)callerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_ProjectPath() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Parent() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_FileName() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFolder() {
		return folderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFolder_Resources() {
		return (EReference)folderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFolder_ResourceType() {
		return (EAttribute)folderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bw5Factory getBw5Factory() {
		return (Bw5Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__DESCRIPTION);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__ACTIVITIES);
		createEReference(containerEClass, CONTAINER__GROUPS);
		createEReference(containerEClass, CONTAINER__TRANSITIONS);
		createEReference(containerEClass, CONTAINER__START);
		createEReference(containerEClass, CONTAINER__END);
		createEAttribute(containerEClass, CONTAINER__RETURN_BINDINGS);
		createEReference(containerEClass, CONTAINER__RETURN_BINDINGS_NAMESPACES);

		stringToStringEntryEClass = createEClass(STRING_TO_STRING_ENTRY);
		createEAttribute(stringToStringEntryEClass, STRING_TO_STRING_ENTRY__KEY);
		createEAttribute(stringToStringEntryEClass, STRING_TO_STRING_ENTRY__VALUE);

		namespaceAwareEClass = createEClass(NAMESPACE_AWARE);
		createEReference(namespaceAwareEClass, NAMESPACE_AWARE__NAMESPACES);

		processDefinitionEClass = createEClass(PROCESS_DEFINITION);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__START_TYPE);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__END_TYPE);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__TARGET_NAMESPACE);
		createEReference(processDefinitionEClass, PROCESS_DEFINITION__STARTER);
		createEReference(processDefinitionEClass, PROCESS_DEFINITION__LABELS);
		createEReference(processDefinitionEClass, PROCESS_DEFINITION__PROCESS_VARIABLES);
		createEAttribute(processDefinitionEClass, PROCESS_DEFINITION__ERROR_SCHEMAS);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__X);
		createEAttribute(nodeEClass, NODE__Y);
		createEReference(nodeEClass, NODE__OUTGOING_TRANSITIONS);
		createEReference(nodeEClass, NODE__INCOMING_TRANSITIONS);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEAttribute(typedElementEClass, TYPED_ELEMENT__TYPE);

		typedNodeEClass = createEClass(TYPED_NODE);
		createEAttribute(typedNodeEClass, TYPED_NODE__RESOURCE_TYPE);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__CONFIG);
		createEAttribute(activityEClass, ACTIVITY__INPUT_BINDINGS);
		createEReference(activityEClass, ACTIVITY__INPUT_BINDINGS_NAMESPACES);

		starterEClass = createEClass(STARTER);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__WIDTH);
		createEAttribute(groupEClass, GROUP__HEIGHT);
		createEAttribute(groupEClass, GROUP__COLLAPSED_WIDTH);
		createEAttribute(groupEClass, GROUP__COLLAPSED_HEIGHT);
		createEAttribute(groupEClass, GROUP__EXPANDED);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__FROM);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEAttribute(transitionEClass, TRANSITION__TO);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEAttribute(transitionEClass, TRANSITION__LINE_TYPE);
		createEAttribute(transitionEClass, TRANSITION__LINE_COLOR);
		createEAttribute(transitionEClass, TRANSITION__CONDITION_TYPE);
		createEAttribute(transitionEClass, TRANSITION__CONDITION);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__WIDTH);
		createEAttribute(labelEClass, LABEL__HEIGHT);
		createEAttribute(labelEClass, LABEL__FONT_COLOR);
		createEAttribute(labelEClass, LABEL__COLOR);
		createEAttribute(labelEClass, LABEL__TYPE);
		createEAttribute(labelEClass, LABEL__THICKNESS);
		createEAttribute(labelEClass, LABEL__FADE);

		processVariableEClass = createEClass(PROCESS_VARIABLE);

		callEClass = createEClass(CALL);
		createEAttribute(callEClass, CALL__DESCRIPTION);
		createEReference(callEClass, CALL__TARGET);
		createEReference(callEClass, CALL__CALLER);

		callTargetEClass = createEClass(CALL_TARGET);
		createEReference(callTargetEClass, CALL_TARGET__INCOMING_CALLS);

		callerEClass = createEClass(CALLER);
		createEReference(callerEClass, CALLER__OUTGOING_CALLS);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__PROJECT_PATH);
		createEReference(resourceEClass, RESOURCE__PARENT);
		createEAttribute(resourceEClass, RESOURCE__FILE_NAME);

		folderEClass = createEClass(FOLDER);
		createEReference(folderEClass, FOLDER__RESOURCES);
		createEAttribute(folderEClass, FOLDER__RESOURCE_TYPE);

		projectEClass = createEClass(PROJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerEClass.getESuperTypes().add(this.getNamedElement());
		containerEClass.getESuperTypes().add(this.getNamespaceAware());
		processDefinitionEClass.getESuperTypes().add(this.getContainer());
		processDefinitionEClass.getESuperTypes().add(this.getCallTarget());
		processDefinitionEClass.getESuperTypes().add(this.getResource());
		nodeEClass.getESuperTypes().add(this.getNamedElement());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		typedNodeEClass.getESuperTypes().add(this.getTypedElement());
		typedNodeEClass.getESuperTypes().add(this.getNode());
		activityEClass.getESuperTypes().add(this.getTypedNode());
		activityEClass.getESuperTypes().add(this.getCaller());
		activityEClass.getESuperTypes().add(this.getNamespaceAware());
		starterEClass.getESuperTypes().add(this.getActivity());
		groupEClass.getESuperTypes().add(this.getActivity());
		groupEClass.getESuperTypes().add(this.getContainer());
		labelEClass.getESuperTypes().add(this.getNode());
		processVariableEClass.getESuperTypes().add(this.getTypedElement());
		resourceEClass.getESuperTypes().add(this.getNamedElement());
		folderEClass.getESuperTypes().add(this.getResource());
		projectEClass.getESuperTypes().add(this.getFolder());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Description(), theEcorePackage.getEString(), "description", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, org.nasdanika.models.bw5.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Activities(), this.getActivity(), null, "activities", null, 0, -1, org.nasdanika.models.bw5.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContainer_Activities().getEKeys().add(this.getNamedElement_Name());
		initEReference(getContainer_Groups(), this.getGroup(), null, "groups", null, 0, -1, org.nasdanika.models.bw5.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getContainer_Groups().getEKeys().add(this.getNamedElement_Name());
		initEReference(getContainer_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, org.nasdanika.models.bw5.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Start(), this.getNode(), null, "start", null, 0, 1, org.nasdanika.models.bw5.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_End(), this.getNode(), null, "end", null, 0, 1, org.nasdanika.models.bw5.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainer_ReturnBindings(), theEcorePackage.getEString(), "returnBindings", null, 0, 1, org.nasdanika.models.bw5.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_ReturnBindingsNamespaces(), this.getStringToStringEntry(), null, "returnBindingsNamespaces", null, 0, -1, org.nasdanika.models.bw5.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToStringEntryEClass, Map.Entry.class, "StringToStringEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToStringEntry_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToStringEntry_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namespaceAwareEClass, NamespaceAware.class, "NamespaceAware", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespaceAware_Namespaces(), this.getStringToStringEntry(), null, "namespaces", null, 0, -1, NamespaceAware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processDefinitionEClass, ProcessDefinition.class, "ProcessDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessDefinition_StartType(), theEcorePackage.getEString(), "startType", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessDefinition_EndType(), theEcorePackage.getEString(), "endType", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessDefinition_TargetNamespace(), theEcorePackage.getEString(), "targetNamespace", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessDefinition_Starter(), this.getStarter(), null, "starter", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessDefinition_Labels(), this.getLabel(), null, "labels", null, 0, -1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessDefinition_ProcessVariables(), this.getProcessVariable(), null, "processVariables", null, 0, -1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProcessDefinition_ProcessVariables().getEKeys().add(this.getNamedElement_Name());
		initEAttribute(getProcessDefinition_ErrorSchemas(), theEcorePackage.getEString(), "errorSchemas", null, 0, 1, ProcessDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_X(), theEcorePackage.getEInt(), "x", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Y(), theEcorePackage.getEInt(), "y", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_OutgoingTransitions(), this.getTransition(), this.getTransition_Source(), "outgoingTransitions", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_IncomingTransitions(), this.getTransition(), this.getTransition_Target(), "incomingTransitions", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedElement_Type(), theEcorePackage.getEString(), "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedNodeEClass, TypedNode.class, "TypedNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedNode_ResourceType(), theEcorePackage.getEString(), "resourceType", null, 0, 1, TypedNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Config(), theEcorePackage.getEString(), "config", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_InputBindings(), theEcorePackage.getEString(), "inputBindings", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_InputBindingsNamespaces(), this.getStringToStringEntry(), null, "inputBindingsNamespaces", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(starterEClass, Starter.class, "Starter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Width(), theEcorePackage.getEInt(), "width", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Height(), theEcorePackage.getEInt(), "height", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_CollapsedWidth(), theEcorePackage.getEInt(), "collapsedWidth", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_CollapsedHeight(), theEcorePackage.getEInt(), "collapsedHeight", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Expanded(), theEcorePackage.getEBoolean(), "expanded", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_From(), theEcorePackage.getEString(), "from", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Source(), this.getNode(), this.getNode_OutgoingTransitions(), "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_To(), theEcorePackage.getEString(), "to", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getNode(), this.getNode_IncomingTransitions(), "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_LineType(), theEcorePackage.getEString(), "lineType", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_LineColor(), theEcorePackage.getEString(), "lineColor", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_ConditionType(), theEcorePackage.getEString(), "conditionType", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Condition(), theEcorePackage.getEString(), "condition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Width(), theEcorePackage.getEInt(), "width", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Height(), theEcorePackage.getEInt(), "height", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_FontColor(), theEcorePackage.getEString(), "fontColor", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Color(), theEcorePackage.getEString(), "color", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Type(), theEcorePackage.getEString(), "type", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Thickness(), theEcorePackage.getEString(), "thickness", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Fade(), theEcorePackage.getEString(), "fade", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processVariableEClass, ProcessVariable.class, "ProcessVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCall_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCall_Target(), this.getCallTarget(), this.getCallTarget_IncomingCalls(), "target", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCall_Caller(), this.getCaller(), this.getCaller_OutgoingCalls(), "caller", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callTargetEClass, CallTarget.class, "CallTarget", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallTarget_IncomingCalls(), this.getCall(), this.getCall_Target(), "incomingCalls", null, 0, -1, CallTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callerEClass, Caller.class, "Caller", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaller_OutgoingCalls(), this.getCall(), this.getCall_Caller(), "outgoingCalls", null, 0, -1, Caller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_ProjectPath(), theEcorePackage.getEString(), "projectPath", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Parent(), this.getFolder(), this.getFolder_Resources(), "parent", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_FileName(), theEcorePackage.getEString(), "fileName", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(folderEClass, Folder.class, "Folder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFolder_Resources(), this.getResource(), this.getResource_Parent(), "resources", null, 0, -1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFolder_Resources().getEKeys().add(this.getResource_FileName());
		initEAttribute(getFolder_ResourceType(), theEcorePackage.getEString(), "resourceType", null, 0, 1, Folder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// urn:org.nasdanika
		createUrnorgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Xcore model for BW 5.x concepts.",
			   "bundleManifest", "false",
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (namedElementEClass,
		   source,
		   new String[] {
			   "documentation", "*\nAbstract base for process elements that are identified by name within a process.\nCorresponds to the NamedType complex type in the BW process schema."
		   });
		addAnnotation
		  (getNamedElement_Name(),
		   source,
		   new String[] {
			   "documentation", "*\nThe element\'s unique name within its containing scope (process or group).\nUsed as the reference target in Transition.from and Transition.to."
		   });
		addAnnotation
		  (getNamedElement_Description(),
		   source,
		   new String[] {
			   "documentation", "*\nOptional human-readable description of this element."
		   });
		addAnnotation
		  (getContainer_Activities(),
		   source,
		   new String[] {
			   "documentation", "*\nActivities (tasks/steps) at the top level of this process."
		   });
		addAnnotation
		  (getContainer_Groups(),
		   source,
		   new String[] {
			   "documentation", "*\nGroups of activities at the top level of this process (loops, scope, etc.)."
		   });
		addAnnotation
		  (getContainer_Transitions(),
		   source,
		   new String[] {
			   "documentation", "*\nTransitions at the top level of this process."
		   });
		addAnnotation
		  (getContainer_Start(),
		   source,
		   new String[] {
			   "documentation", "*\nA synthetic node populated from startName, startType, startX, startY"
		   });
		addAnnotation
		  (getContainer_End(),
		   source,
		   new String[] {
			   "documentation", "*\nA synthetic node populated from endName, endType, endX, endY"
		   });
		addAnnotation
		  (getContainer_ReturnBindings(),
		   source,
		   new String[] {
			   "documentation", "*\nXSL bindings that produce the process return value (output schema).\nStored as raw XML text because the bindings reference arbitrary namespaces."
		   });
		addAnnotation
		  (processDefinitionEClass,
		   source,
		   new String[] {
			   "documentation", "*\nRoot element of a BW 5.x process file (.process).\nCorresponds to pd:ProcessDefinition in the XML namespace\nhttp://xmlns.tibco.com/bw/process/2003."
		   });
		addAnnotation
		  (getProcessDefinition_StartType(),
		   source,
		   new String[] {
			   "documentation", "*\nCanonical type of the start element (optional)."
		   });
		addAnnotation
		  (getProcessDefinition_EndType(),
		   source,
		   new String[] {
			   "documentation", "*\nCanonical type of the end element (optional)."
		   });
		addAnnotation
		  (getProcessDefinition_TargetNamespace(),
		   source,
		   new String[] {
			   "documentation", "*\nThe XML target namespace declared in the process file.\nUsed to qualify XPath expressions within the process."
		   });
		addAnnotation
		  (getProcessDefinition_Starter(),
		   source,
		   new String[] {
			   "documentation", "*\nThe optional event-source activity that starts this process\n(e.g. an HTTP receiver, JMS queue listener, Timer, ...).\nWhen present, startName refers to this starter\'s name."
		   });
		addAnnotation
		  (getProcessDefinition_Labels(),
		   source,
		   new String[] {
			   "documentation", "*\nVisual annotation labels on the diagram."
		   });
		addAnnotation
		  (getProcessDefinition_ProcessVariables(),
		   source,
		   new String[] {
			   "documentation", "*\nProcess-scoped variables declared in the process."
		   });
		addAnnotation
		  (getProcessDefinition_ErrorSchemas(),
		   source,
		   new String[] {
			   "documentation", "*\nError schemas that this process can throw.\nStored as raw XML text because they are arbitrary XSD fragments."
		   });
		addAnnotation
		  (getNode_X(),
		   source,
		   new String[] {
			   "documentation", "*\nX coordinate on the design canvas."
		   });
		addAnnotation
		  (getNode_Y(),
		   source,
		   new String[] {
			   "documentation", "*\nY coordinate on the design canvas."
		   });
		addAnnotation
		  (getTypedElement_Type(),
		   source,
		   new String[] {
			   "documentation", "*\nFully-qualified Java class name of the activity implementation,\ne.g. \"com.tibco.pe.core.WriteToLogActivity\"."
		   });
		addAnnotation
		  (getTypedNode_ResourceType(),
		   source,
		   new String[] {
			   "documentation", "*\nPalette / resource-type identifier used by the BW Designer,\ne.g. \"ae.activities.log\"."
		   });
		addAnnotation
		  (activityEClass,
		   source,
		   new String[] {
			   "documentation", "*\nAn activity (task or step) within a BW process or group.\nCorresponds to pd:activity in the process XML."
		   });
		addAnnotation
		  (getActivity_Config(),
		   source,
		   new String[] {
			   "documentation", "*\nActivity-specific configuration, stored as raw XML text.\nThe structure varies per activity type."
		   });
		addAnnotation
		  (getActivity_InputBindings(),
		   source,
		   new String[] {
			   "documentation", "*\nXSL input bindings for this activity, stored as raw XML text."
		   });
		addAnnotation
		  (starterEClass,
		   source,
		   new String[] {
			   "documentation", "*\nAn event-source (starter) activity that triggers the process.\nCorresponds to pd:starter in the process XML.\nExamples: HTTP Event Source, JMS Queue Receiver, Timer, File Poller.\n\nStructurally identical to a regular Activity; modelled as a distinct\nclass so that tooling can easily distinguish starters from regular steps."
		   });
		addAnnotation
		  (groupEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA group of activities, used to model structured constructs such as:\n  - Loops (Repeat-Until, For-Each, While)\n  - Error handlers / Fault handlers\n  - Critical sections\n  - Scope groups\n\nCorresponds to pd:group in the process XML."
		   });
		addAnnotation
		  (getGroup_Width(),
		   source,
		   new String[] {
			   "documentation", "*\nWidth of the expanded group frame on the design canvas."
		   });
		addAnnotation
		  (getGroup_Height(),
		   source,
		   new String[] {
			   "documentation", "*\nHeight of the expanded group frame on the design canvas."
		   });
		addAnnotation
		  (getGroup_CollapsedWidth(),
		   source,
		   new String[] {
			   "documentation", "*\nWidth of the group icon when collapsed."
		   });
		addAnnotation
		  (getGroup_CollapsedHeight(),
		   source,
		   new String[] {
			   "documentation", "*\nHeight of the group icon when collapsed."
		   });
		addAnnotation
		  (getGroup_Expanded(),
		   source,
		   new String[] {
			   "documentation", "*\nWhether the group is shown in expanded form on the canvas."
		   });
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA directed connection from one activity (or pseudo-state) to another.\nCorresponds to pd:transition in the process XML.\n\nThe source and target are identified by the name of the containing\nNamedElement (Activity, Starter, Group, or the special names \"Start\"\nand \"End\" / \"start\" and \"end\" inside a group)."
		   });
		addAnnotation
		  (getTransition_From(),
		   source,
		   new String[] {
			   "documentation", "*\nName of the source activity, group, or pseudo-state\n(e.g. \"Log\", \"Start\", \"IterateAndFindMatch\")."
		   });
		addAnnotation
		  (getTransition_To(),
		   source,
		   new String[] {
			   "documentation", "*\nName of the target activity, group, or pseudo-state\n(e.g. \"End\", \"MapResultToResponse\")."
		   });
		addAnnotation
		  (getTransition_LineType(),
		   source,
		   new String[] {
			   "documentation", "*\nVisual style of the transition line.\nCommon values: \"Default\", \"Straight\", \"Curved\"."
		   });
		addAnnotation
		  (getTransition_LineColor(),
		   source,
		   new String[] {
			   "documentation", "*\nRGB color of the transition line encoded as a signed integer\n(Java AWT convention), e.g. \"-16777216\" for black."
		   });
		addAnnotation
		  (getTransition_ConditionType(),
		   source,
		   new String[] {
			   "documentation", "*\nHow the transition is enabled.\nCommon values: \"always\", \"expression\", \"error\", \"timeout\"."
		   });
		addAnnotation
		  (getTransition_Condition(),
		   source,
		   new String[] {
			   "documentation", "*\nXPath/XSL condition expression evaluated at runtime to decide\nwhether this transition fires.  Only used when conditionType\nis \"expression\"."
		   });
		addAnnotation
		  (labelEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA visual annotation (sticky-note style label) placed on the design canvas.\nCorresponds to pd:label in the process XML."
		   });
		addAnnotation
		  (getLabel_Width(),
		   source,
		   new String[] {
			   "documentation", "*\nWidth of the label box on the canvas."
		   });
		addAnnotation
		  (getLabel_Height(),
		   source,
		   new String[] {
			   "documentation", "*\nHeight of the label box on the canvas."
		   });
		addAnnotation
		  (getLabel_FontColor(),
		   source,
		   new String[] {
			   "documentation", "*\nFont color encoded as an RGB integer string."
		   });
		addAnnotation
		  (getLabel_Color(),
		   source,
		   new String[] {
			   "documentation", "*\nBackground color encoded as an RGB integer string."
		   });
		addAnnotation
		  (getLabel_Type(),
		   source,
		   new String[] {
			   "documentation", "*\nLabel shape type."
		   });
		addAnnotation
		  (getLabel_Thickness(),
		   source,
		   new String[] {
			   "documentation", "*\nBorder line thickness."
		   });
		addAnnotation
		  (getLabel_Fade(),
		   source,
		   new String[] {
			   "documentation", "*\nOpacity / fade value."
		   });
		addAnnotation
		  (processVariableEClass,
		   source,
		   new String[] {
			   "documentation", "*\nA process-level variable declared in the processVariables section.\nProcess variables hold state that is visible to all activities within\nthe same process instance."
		   });
		addAnnotation
		  (callEClass,
		   source,
		   new String[] {
			   "documentation", "*\nCalls are used for resolving inter-process communications."
		   });
		addAnnotation
		  (callTargetEClass,
		   source,
		   new String[] {
			   "documentation", "*\nSomething that can receive calls"
		   });
		addAnnotation
		  (callerEClass,
		   source,
		   new String[] {
			   "documentation", "*\nSomething making calls"
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "documentation", "*\nProject resource - process definition, XSD, ..."
		   });
		addAnnotation
		  (getResource_ProjectPath(),
		   source,
		   new String[] {
			   "documentation", "*\nRelative path in the project"
		   });
		addAnnotation
		  (getFolder_ResourceType(),
		   source,
		   new String[] {
			   "documentation", "*\nLoaded from .folder file repository/folder resourceType attribute"
		   });
		addAnnotation
		  (projectEClass,
		   source,
		   new String[] {
			   "documentation", "*\nProject is folder with vcrepo.dat file and with resourceType=\"ae.rootfolder\" in the .folder file"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdanika</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdanika";
		addAnnotation
		  (getContainer_Transitions(),
		   source,
		   new String[] {
			   "logicalContainment", "false"
		   });
		addAnnotation
		  (getNode_OutgoingTransitions(),
		   source,
		   new String[] {
			   "logicalContainment", "true"
		   });
		addAnnotation
		  (getFolder_Resources(),
		   source,
		   new String[] {
			   "logicalContainment", "true"
		   });
	}

} //Bw5PackageImpl
