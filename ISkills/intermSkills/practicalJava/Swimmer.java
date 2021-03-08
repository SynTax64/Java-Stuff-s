package intermSkills.practicalJava;

public class Swimmer {

	private int raceID;
	private String name;

	public Swimmer() {
	}

	public Swimmer(int raceID, String name) {
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
		return "Swimming";
	}

	@Override
	public String toString() {
		return String.format("%s: %d is %s", getName(), getRaceID(), performSport());
	}

}
