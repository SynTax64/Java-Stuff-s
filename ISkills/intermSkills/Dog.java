package intermSkills;

public class Dog extends Animal {

	@Override
	public String toString() {
		return "Dog [toString()=" + name + "]";
	}

	public Dog() {
		super();
	}

	public Dog(String name) {
		super(name);
	}

}
