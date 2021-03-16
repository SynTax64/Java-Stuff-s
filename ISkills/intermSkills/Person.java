package intermSkills;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Person() {
		this.firstName = "unknown";
		this.lastName = "unknown";
		this.age = 0;
	}

	public String getFirstName() {
		return "executed getFirstName() method from Person class";
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return "executed getLastName() method from Person class";
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age++;
	}

	public void birthday() {
		System.out.println("executed birthday() method from Person class");
	}

	public void birthday1() {
		System.out.println("executed birthday1() method from Person class");
	}

	@Override
	public String toString() {
		return "Person [First Name= " + firstName + ", Last Name= " + lastName + ", Age= " + age + "]";
	}
}
