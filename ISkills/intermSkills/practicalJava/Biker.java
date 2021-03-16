package intermSkills.practicalJava;

public class Biker extends Athlete {
	private boolean usesClips;

	public Biker() {
	}

	public Biker(boolean usesClips) {
		super();
		this.usesClips = usesClips;
	}

	public Biker(String name, int age, int racerId, boolean usesClips) {
		super(name, age, racerId);
		this.usesClips = usesClips;
	}

	@Override
	public String performRaceActivity() {
		return "Biking...";
	}

	public boolean isUsesClips() {
		return usesClips;
	}

	public void setUsesClips(boolean usesClips) {
		this.usesClips = usesClips;
	}

	@Override
	public String toString() {
		return String.format("%s %s]\tActivity: %s\tIs biking with clips: %b\n", super.toString(), getClass(),
				performRaceActivity(), isUsesClips());
	}
}
