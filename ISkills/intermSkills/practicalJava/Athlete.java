package intermSkills.practicalJava;

public abstract class Athlete implements RaceParticipant, Person {
	private String name;
	private int age;
	private int racerId;

	public Athlete() {
	}

	public Athlete(String name, int age, int racerId) {
		this.racerId = racerId;
		this.name = name;
		this.age = age;
	}

	public void setRacerId(String name, int age, int racerId) {
		this.racerId = racerId;
	}

	public int getRacerId() {
		return this.racerId;
	}

	@Override
	public void setRacerId(int racerId) {
		this.racerId = racerId;
	}

	public abstract String performRaceActivity();

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
	public String toString() {
		return String.format("%s]\tName: %s\tAge: %d\tRacerID: %d\n", getClass(), getName(), getAge(), getRacerId());
	}
}
