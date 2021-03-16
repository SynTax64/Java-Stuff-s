package intermSkills.practicalJava;

import static org.junit.Assert.*;
import org.junit.*;

public class BikerTest {

	private Biker b;
	private String name = "TestName";
	private int age = 33;
	private int racerId = 123456;
	private String raceActivity = "Biking";
	private boolean usesClips = false;

	@Before
	public void setUp() throws Exception {
		b = new Biker();
	}

	@After
	public void tearDown() throws Exception {
		b = null;
	}

	@Test
	public void testConstructors() {
		assertNotNull("Default Biker could not be created", b);
		Biker s2 = new Biker(name, age, racerId, usesClips);
		assertNotNull("Default Biker could not be created", s2);
		assertEquals("Name not set correctly on r2", name, s2.getName());
		assertEquals("Age not set correctly on r2", age, s2.getAge());
		assertEquals("RacerId not set correctly on r2", racerId, s2.getRacerId());
		assertEquals("UsesClips not set correctly on r2", usesClips, s2.isUsesClips());
	}

	@Test
	public void testGetSetRacerID() {
		b.setRacerId(racerId);
		assertEquals("The racerId is not set as expected", racerId, b.getRacerId());
	}

	@Test
	public void testGetSetName() {
		b.setName(name);
		assertEquals("The name is not set as expected", name, b.getName());
	}

	@Test
	public void testGetSetAge() {
		b.setAge(age);
		assertEquals("The age is not set as expected", age, b.getAge());
	}

	@Test
	public void testGetSetIsUsesClips() {
		b.setUsesClips(usesClips);
		assertEquals("The usesClips is not set as expected", usesClips, b.isUsesClips());
	}

	@Test
	public void performRaceActivity() {
		String pra = b.performRaceActivity();
		assertTrue("Perform race activity did not contain activity", pra.contains(raceActivity));
	}

	@Test
	public void testToString() {
		b.setRacerId(racerId);
		b.setName(name);
		b.setAge(age);
		b.setUsesClips(usesClips);
		String rts = b.toString();
		assertTrue("To String does not contain racer id", rts.contains(String.format("%d", racerId)));
		assertTrue("To String does not contain name", rts.contains(name));
		assertTrue("To String does not contain age", rts.contains(String.format("%d", age)));
		assertTrue("To String does not contain using clips", rts.contains(String.format("%b", usesClips)));
		String rc = b.getClass().toString();
		assertTrue("To String does not contain class", rts.contains(rc));
		assertTrue("To String does not contain performActivity", rts.contains(raceActivity));
	}
}
