package org.nasdanika.models.bw5.loader.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.InputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.nasdanika.models.bw5.Activity;
import org.nasdanika.models.bw5.Group;
import org.nasdanika.models.bw5.Label;
import org.nasdanika.models.bw5.ProcessDefinition;
import org.nasdanika.models.bw5.ProcessVariable;
import org.nasdanika.models.bw5.Starter;
import org.nasdanika.models.bw5.Transition;
import org.nasdanika.models.bw5.loader.Bw5ProcessLoader;

/**
 * Tests for {@link BwProcessLoader}.
 */
class BwProcessLoaderTest {

	private ProcessDefinition pd;

	@BeforeEach
	void setUp() throws Exception {
		Bw5ProcessLoader loader = new Bw5ProcessLoader();
		try (InputStream in = getClass().getResourceAsStream("/sample-process.process")) {
			assertNotNull(in, "Test resource sample-process.process not found");
			pd = loader.load(in, "sample-process.process");
		}
		assertNotNull(pd, "ProcessDefinition must not be null");
	}

	// -- ProcessDefinition attributes -----------------------------------------

	@Test
	void testProcessName() {
		assertEquals("Processes/SampleProcess.process", pd.getName());
	}

	@Test
	void testProcessDescription() {
		assertEquals("A sample process for testing the StAX loader.", pd.getDescription());
	}

	@Test
	void testStartProperties() {
		assertEquals("Start", pd.getStart().getName());
		assertEquals("com.tibco.pe.core.None", pd.getStartType());
		assertEquals(60, pd.getStart().getX());
		assertEquals(64, pd.getStart().getY());
	}

	@Test
	void testEndProperties() {
		assertEquals("End", pd.getEnd().getName());
		assertEquals("com.tibco.pe.core.None", pd.getEndType());
		assertEquals(800, pd.getEnd().getX());
		assertEquals(64, pd.getEnd().getY());
	}

	@Test
	void testTargetNamespace() {
		assertEquals("http://xmlns.example.com/1234567890", pd.getTargetNamespace());
	}

	@Test
	void testReturnBindings() {
		assertNotNull(pd.getReturnBindings());
		assertTrue(pd.getReturnBindings().contains("xsl:template"));
	}

	@Test
	void testErrorSchemas() {
		assertNotNull(pd.getErrorSchemas());
		assertTrue(pd.getErrorSchemas().contains("ErrorReport"));
	}

	// -- Starter --------------------------------------------------------------

	@Test
	void testStarter() {
		Starter starter = pd.getStarter();
		assertNotNull(starter, "Starter must be present");
		assertEquals("HTTP Receiver", starter.getName());
		assertEquals("com.tibco.plugin.http.HTTPEventSource", starter.getType());
		assertEquals("httppalette.httpEventSource", starter.getResourceType());
		assertEquals(60, starter.getX());
		assertEquals(64, starter.getY());
		assertNotNull(starter.getConfig());
		assertTrue(starter.getConfig().contains("sharedChannel"));
	}

	// -- Activities -----------------------------------------------------------

	@Test
	void testActivities() {
		assertEquals(2, pd.getActivities().size());
		pd.getActivities().forEach(activity -> {
			System.out.println("Activity: " + activity.getName() + ", type: " + activity.getType() + "  " + activity.getOutgoingTransitions().size() + " " + activity.getIncomingTransitions().size());
		});
	}

	@Test
	void testWriteToLogActivity() {
		Activity writeToLog = pd.getActivities().stream()
				.filter(a -> "WriteToLog".equals(a.getName()))
				.findFirst()
				.orElseThrow();

		assertEquals("com.tibco.pe.core.WriteToLogActivity", writeToLog.getType());
		assertEquals("ae.activities.log", writeToLog.getResourceType());
		assertEquals(250, writeToLog.getX());
		assertEquals(64, writeToLog.getY());
		assertNotNull(writeToLog.getConfig());
		assertTrue(writeToLog.getConfig().contains("User"));
		assertNotNull(writeToLog.getInputBindings());
		assertTrue(writeToLog.getInputBindings().contains("Hello World"));
	}

	@Test
	void testMapDataActivity() {
		Activity mapData = pd.getActivities().stream()
				.filter(a -> "MapData".equals(a.getName()))
				.findFirst()
				.orElseThrow();

		assertEquals("com.tibco.plugin.mapper.MapperActivity", mapData.getType());
		assertEquals("ae.activities.MapperActivity", mapData.getResourceType());
		assertEquals(450, mapData.getX());
		assertEquals(64, mapData.getY());
	}

	// -- Groups ---------------------------------------------------------------

	@Test
	void testGroups() {
		assertEquals(1, pd.getGroups().size());
	}

	@Test
	void testIterationLoopGroup() {
		Group group = pd.getGroups().get(0);
		assertEquals("IterationLoop", group.getName());
		assertEquals("com.tibco.pe.core.LoopGroup", group.getType());
		assertEquals("ae.process.group", group.getResourceType());
		assertEquals(150, group.getX());
		assertEquals(200, group.getY());
		assertEquals(400, group.getWidth());
		assertEquals(250, group.getHeight());
		assertEquals(57, group.getCollapsedWidth());
		assertEquals(70, group.getCollapsedHeight());
		assertTrue(group.isExpanded());

		assertNotNull(group.getConfig());
		assertTrue(group.getConfig().contains("indexSlot"));

		assertNotNull(group.getInputBindings());
	}

	@Test
	void testNestedGroupActivities() {
		Group group = pd.getGroups().get(0);
		assertEquals(1, group.getActivities().size());

		Activity inner = group.getActivities().get(0);
		assertEquals("InnerTask", inner.getName());
		assertEquals("com.tibco.pe.core.CallProcessActivity", inner.getType());
		assertEquals(300, inner.getX());
		assertEquals(310, inner.getY());
	}

	@Test
	void testNestedGroupTransitions() {
		Group group = pd.getGroups().get(0);
		assertEquals(2, group.getTransitions().size());

		Transition first = group.getTransitions().get(0);
		assertEquals("start", first.getFrom());
		assertEquals("InnerTask", first.getTo());

		Transition second = group.getTransitions().get(1);
		assertEquals("InnerTask", second.getFrom());
		assertEquals("end", second.getTo());
	}

	// -- Transitions ----------------------------------------------------------

	@Test
	void testTransitions() {
		assertEquals(3, pd.getTransitions().size());
	}

	@Test
	void testFirstTransition() {
		Transition t = pd.getTransitions().get(0);
		assertEquals("Start", t.getFrom());
		assertEquals("WriteToLog", t.getTo());
		assertEquals("Default", t.getLineType());
		assertEquals("-16777216", t.getLineColor());
		assertEquals("always", t.getConditionType());
		assertNull(t.getCondition());
	}

	@Test
	void testConditionalTransition() {
		Transition t = pd.getTransitions().get(1);
		assertEquals("WriteToLog", t.getFrom());
		assertEquals("MapData", t.getTo());
		assertEquals("expression", t.getConditionType());
		assertNotNull(t.getCondition());
		assertEquals("$WriteToLog/status = 'OK'", t.getCondition());
	}

	// -- Labels ---------------------------------------------------------------

	@Test
	void testLabels() {
		assertEquals(1, pd.getLabels().size());
	}

	@Test
	void testLabel() {
		Label label = pd.getLabels().get(0);
		assertEquals("Process Notes", label.getName());
		assertEquals("This process logs a message and maps the result.", label.getDescription());
		assertEquals(400, label.getX());
		assertEquals(250, label.getY());
		assertEquals(200, label.getWidth());
		assertEquals(60, label.getHeight());
		assertEquals("-16777216", label.getFontColor());
		assertEquals("-1", label.getColor());
		assertEquals("rectangle", label.getType());
		assertEquals("1", label.getThickness());
		assertEquals("true", label.getFade());
	}

	// -- Process Variables ----------------------------------------------------

	@Test
	void testProcessVariables() {
		assertEquals(2, pd.getProcessVariables().size());
	}

	@Test
	void testCounterVariable() {
		ProcessVariable counter = pd.getProcessVariables().stream()
				.filter(pv -> "counter".equals(pv.getName()))
				.findFirst()
				.orElseThrow();
		assertEquals("xsd:integer", counter.getType());
	}

	@Test
	void testMessageVariable() {
		ProcessVariable message = pd.getProcessVariables().stream()
				.filter(pv -> "message".equals(pv.getName()))
				.findFirst()
				.orElseThrow();
		assertEquals("xsd:string", message.getType());
	}
}
