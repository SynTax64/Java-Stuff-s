package intermSkills.BasicObjectInheritance;

public class Animal {

	private String name;

	public Animal() {

	}

	public Animal(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		return String.format("%s] Name: %s\n", getClass().getName(), this.name);
	}
}
