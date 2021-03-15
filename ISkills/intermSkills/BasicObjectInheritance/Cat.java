package intermSkills.BasicObjectInheritance;

public class Cat extends Animal {
	private boolean isDeclawed;

	public Cat() {
		super();
	}

	public Cat(String name, String breed, boolean isDeclawed) {
		super(name, breed);
		this.isDeclawed = isDeclawed;
	}

	public boolean isDeclawed() {
		return isDeclawed;
	}

	public void setDeclawed(boolean isDeclawed) {
		this.isDeclawed = isDeclawed;
	}

	@Override
	public String toString() {
		return String.format("%s\tIs declawed: %b\n", super.toString(), isDeclawed());
	}
}
