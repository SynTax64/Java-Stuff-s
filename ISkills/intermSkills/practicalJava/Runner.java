package intermSkills.practicalJava;

public class Runner implements RaceParticipant, Person {

	private int racerId;
	private String name;
	private int age;

	public Runner() {

	}

	public Runner(int racerId) {
		this.racerId = racerId;
	}

	/**
	 * Set the racer ID
	 * 
	 * @param int raceId is the ID for the racer
	 */

	public void setRacerId(String name, int age, int racerId) {
		this.racerId = racerId;
	}

	public Runner(String name, int age, int racerId) {
		this.name = name;
		this.age = age;
		this.racerId = racerId;
	}

	/**
	 * Get the racer ID
	 * 
	 * @return int the ID of the racer
	 */
	public int getRacerId() {
		return this.racerId;
	}

	/**
	 * Perform the racing activity
	 * 
	 * @return String the race activity being performed
	 */
	public String performRaceActivity() {
		return "Running...";
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void setRacerId(int racerId) {
		this.racerId = racerId;
	}

	@Override
	public String toString() {
		return String.format("%s]\tName: %s\tAge: %d\tRacerID: %d\tActivity: %s\n", getClass(), getName(), getAge(),
				getRacerId(), performRaceActivity());
	}
}
