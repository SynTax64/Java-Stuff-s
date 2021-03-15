package intermSkills.practicalJava;

import static org.junit.Assert.*;
import org.junit.*;

public class BikerTest {

	private Biker b;
	private int racerId = 123456;
	private String raceActivity = "Biking";

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
		Biker s2 = new Biker(racerId);
		assertNotNull("Default Biker could not be created", s2);
		assertEquals("RacerId not set correctly on r2", racerId, s2.getRacerId());
	}

	@Test
	public void testGetSetRacerID() {
		b.setRacerId(racerId);
		assertEquals("The racerId is not set as expected", racerId, b.getRacerId());
	}

	@Test
	public void performRaceActivity() {
		String pra = b.performRaceActivity();
		assertTrue("Perform race activity did not contain activity", pra.contains(raceActivity));
	}

	@Test
	public void testToString() {
		b.setRacerId(racerId);
		String rts = b.toString();
		assertTrue("To String does not contain racer id", rts.contains(String.format("%d", racerId)));
		String rc = b.getClass().toString();
		assertTrue("To String does not contain class", rts.contains(rc));
		assertTrue("To String does not contain performActivity", rts.contains(raceActivity));
	}
}
