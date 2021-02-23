package intermSkills;

public class Person {
	public String firstName;
	public String lastName;
	public int age;

	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
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
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [First Name= " + firstName + ", Last Name= " + lastName + ", Age= " + age + "]";
	}
}
