package intermSkills;

public class Student extends Person {
	public int grade;

	public Student(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
	}

	public String getFirstName() {
		return "executed getFirstName() method from Student class";
	}

	public String getLastName() {
		return "executed getLastName() method from Student class";
	}

	public void birthday() {
		System.out.println("executed birthday() method from Student class");
	}

}
