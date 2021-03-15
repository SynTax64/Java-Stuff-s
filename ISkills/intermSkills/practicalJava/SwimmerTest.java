package intermSkills.practicalJava;

import static org.junit.Assert.*;
import org.junit.*;

public class SwimmerTest {

	private Swimmer s;
	private int racerId = 123456;
	private String name = "Unknown";
	private int age = 25;
	private String raceActivity = "Swimming";

	@Before
	public void setUp() throws Exception {
		s = new Swimmer();
	}

	@After
	public void tearDown() throws Exception {
		s = null;
	}

	@Test
	public void testConstructors() {
		assertNotNull("Default Swimmer could not be created", s);
		Swimmer s2 = new Swimmer(name, age, racerId);
		assertNotNull("Default Swimmer could not be created", s2);
		assertEquals("RacerId not set correctly on r2", racerId, s2.getRacerId());
	}

	@Test
	public void testGetSetRacerID() {
		s.setRacerId(racerId);
		assertEquals("The racerId is not set as expected", racerId, s.getRacerId());
	}

	@Test
	public void performRaceActivity() {
		String pra = s.performRaceActivity();
		assertTrue("Perform race activity did not contain activity", pra.contains(raceActivity));
	}

	@Test
	public void testToString() {
		s.setRacerId(racerId);
		String rts = s.toString();
		assertTrue("To String does not contain racer id", rts.contains(String.format("%d", racerId)));
		String rc = s.getClass().toString();
		assertTrue("To String does not contain class", rts.contains(rc));
		assertTrue("To String does not contain performActivity", rts.contains(raceActivity));
	}
}
