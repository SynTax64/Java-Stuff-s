package intermSkills.practicalJava;

public class Biker implements RaceParticipant {
	private int racerId;

	public Biker() {
	}

	public Biker(int racerId) {
		this.racerId = racerId;
	}

	@Override
	public void setRacerId(int racerId) {
		this.racerId = racerId;
	}

	@Override
	public int getRacerId() {
		return this.racerId;
	}

	@Override
	public String performRaceActivity() {
		return "Biking...";
	}

	@Override
	public String toString() {
		return String.format("%s]\tRacerID: %d\tActivity: %s\n", getClass(), getRacerId(), performRaceActivity());
	}
}
