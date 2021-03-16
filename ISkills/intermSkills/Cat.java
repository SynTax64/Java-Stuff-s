package intermSkills;

public class Cat extends Animal {

	public String name = "2";

	public Cat() {
	}

	public Cat(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Cat [toString()=" + name + "]";
	}

	public String mjau() {
		return "mjau";

	}
}
