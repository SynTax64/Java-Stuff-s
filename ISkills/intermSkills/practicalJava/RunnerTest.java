package intermSkills.practicalJava;

import static org.junit.Assert.*;
import org.junit.*;

public class RunnerTest {
	private Runner r;
	private int racerId = 123456;
	private String name = "David";
	private int age = 34;
	private String raceActivity = "Running";
	private String shoeBrand = "Any Shoe Brand";

	@Before
	public void setUp() throws Exception {
		r = new Runner();
	}

	@After
	public void tearDown() throws Exception {
		r = null;
	}

	@Test
	public void testConstructors() {
		assertNotNull("Default Runner could not be created", r);
		Runner r2 = new Runner(name, age, racerId, shoeBrand);
		assertNotNull("Default Runner could not be created", r2);
		assertEquals("Name not set correctly on r2", name, r2.getName());
		assertEquals("Age not set correctly on r2", age, r2.getAge());
		assertEquals("RacerId not set correctly on r2", racerId, r2.getRacerId());
		assertEquals("Shoes brand not set correctly on r2", shoeBrand, r2.getShoeBrand());
	}

	@Test
	public void testGetSetName() {
		r.setName(name);
		assertEquals("The name is not set as expected", name, r.getName());
	}

	@Test
	public void testGetSetAge() {
		r.setAge(age);
		assertEquals("The age is not set as expected", age, r.getAge());
	}

	@Test
	public void testGetSetRacerID() {
		r.setRacerId(racerId);
		assertEquals("The racerId is not set as expected", racerId, r.getRacerId());
	}

	@Test
	public void performRaceActivity() {
		String pra = r.performRaceActivity();
		assertTrue("Perform race activity did not contain activity", pra.contains(raceActivity));
	}

	@Test
	public void testGetshoeBrand() {
		r.setShoeBrand(shoeBrand);
		assertEquals("The shoes brand is not set as expected", shoeBrand, r.getShoeBrand());
	}

	@Test
	public void testToString() {
		r.setRacerId(racerId);
		r.setName(name);
		r.setAge(age);
		r.setShoeBrand(shoeBrand);
		String rts = r.toString();
		assertTrue("To String does not contain name", rts.contains(name));
		assertTrue("To String does not contain age", rts.contains(String.format("%d", age)));
		assertTrue("To String does not contain racer id", rts.contains(String.format("%d", racerId)));
		String rc = r.getClass().toString();
		assertTrue("To String does not contain class", rts.contains(rc));
		assertTrue("To String does not contain performActivity", rts.contains(raceActivity));
		assertTrue("To String does not contain shoes brand", rts.contains(shoeBrand));
	}
}
