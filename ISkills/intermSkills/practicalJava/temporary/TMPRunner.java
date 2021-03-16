package intermSkills.practicalJava.temporary;

public class TMPRunner {

	private int raceID;
	private String name;

	public TMPRunner() {
	}

	public TMPRunner(int raceID, String name) {
		this.raceID = raceID;
		this.name = name;
	}

	public int getRaceID() {
		return raceID;
	}

	public void setRaceID(int raceID) {
		this.raceID = raceID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String performSport() {
		return "Running";
	}

	@Override
	public String toString() {
		return String.format("%s: %d is %s", getName(), getRaceID(), performSport());
	}

}
