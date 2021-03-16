package intermSkills.BasicObjectInheritance;

public class Dog extends Animal {

	private boolean isServiceAnimal;

	public Dog() {
	}

	public Dog(String name, String breed, boolean isServiceAnimal) {
		super(name, breed);
		this.isServiceAnimal = isServiceAnimal;
	}

	public boolean isServiceAnimal() {
		return isServiceAnimal;
	}

	public void setServiceAnimal(boolean isServiceAnimal) {
		this.isServiceAnimal = isServiceAnimal;
	}

	@Override
	public String toString() {
		return String.format("%s\tIs a service animal: %b\n", super.toString(), isServiceAnimal);
	}
}