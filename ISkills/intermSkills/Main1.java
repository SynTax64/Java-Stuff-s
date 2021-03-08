package intermSkills;

public class Main1 {

	public static void main(String[] args) {
		Person o = new Student("David", "Ast", 34);
		System.out.println(o.getFirstName());
		System.out.println(o.getLastName());
		o.birthday();
		o.birthday1();

		System.out.println(((Person) o).getFirstName());
		System.out.println(((Person) o).getLastName());
		((Person) o).birthday();
		((Student) o).birthday1();
	}
}
