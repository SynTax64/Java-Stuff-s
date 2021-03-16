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
	public void testGetSetName() {
		s.setName(name);
		assertEquals("The name is not set as expected", name, s.getName());
	}

	@Test
	public void testGetSetAge() {
		s.setAge(age);
		assertEquals("The age is not set as expected", age, s.getAge());
	}

	@Test
	public void performRaceActivity() {
		String pra = s.performRaceActivity();
		assertTrue("Perform race activity did not contain activity", pra.contains(raceActivity));
	}

	@Test
	public void testToString() {
		s.setRacerId(racerId);
		s.setName(name);
		s.setAge(age);
		String rts = s.toString();
		assertTrue("To String does not contain racer id", rts.contains(String.format("%d", racerId)));
		assertTrue("To String does not contain name", rts.contains(name));
		assertTrue("To String does not contain age", rts.contains(String.format("%d", age)));
		String rc = s.getClass().toString();
		assertTrue("To String does not contain class", rts.contains(rc));
		assertTrue("To String does not contain performActivity", rts.contains(raceActivity));
	}
}
