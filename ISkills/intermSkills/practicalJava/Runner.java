package intermSkills.practicalJava;

public class Runner extends Athlete {
	private String shoeBrand;

	public Runner() {

	}

	/**
	 * Set the racer ID
	 * 
	 * @param int raceId is the ID for the racer
	 */

	public Runner(String name, int age, int racerId, String brand) {
		super(name, age, racerId);
		this.shoeBrand = brand;
	}

	public String getShoeBrand() {
		return shoeBrand;
	}

	public void setShoeBrand(String shoeBrand) {
		this.shoeBrand = shoeBrand;
	}

	public String performRaceActivity() {
		return "Running...";
	}

	@Override
	public String toString() {
		return String.format("%s %s]\tActivity: %s\tRunning with shoes: %s\n", super.toString(), getClass(),
				performRaceActivity(), getShoeBrand());
	}
}
