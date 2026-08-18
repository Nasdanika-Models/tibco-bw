/**
 */
package org.nasdanika.models.bw5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Starter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * An event-source (starter) activity that triggers the process.
 * Corresponds to pd:starter in the process XML.
 * Examples: HTTP Event Source, JMS Queue Receiver, Timer, File Poller.
 * 
 * Structurally identical to a regular Activity; modelled as a distinct
 * class so that tooling can easily distinguish starters from regular steps.
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.models.bw5.Bw5Package#getStarter()
 * @model
 * @generated
 */
public interface Starter extends Activity {
} // Starter
