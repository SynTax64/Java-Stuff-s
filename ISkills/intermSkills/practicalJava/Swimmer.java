package intermSkills.practicalJava;

public class Swimmer implements RaceParticipant {
	private int racerId;

	public Swimmer() {
	}

	public Swimmer(int racerId) {
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
		return "Swimming...";
	}

	@Override
	public String toString() {
		return String.format("%s]\tRacerID: %d\tActivity: %s\n", getClass(), getRacerId(), performRaceActivity());
	}

}
