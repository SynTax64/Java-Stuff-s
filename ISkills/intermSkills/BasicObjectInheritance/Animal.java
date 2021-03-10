package intermSkills.BasicObjectInheritance;

public class Animal {

	private String name;
	private String breed;

	public Animal() {

	}

	public Animal(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {

		return String.format("%s] Breed: %s\tName: %s\n", getClass().getName(), getBreed(), getName());
	}
}
