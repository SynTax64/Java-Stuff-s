package intermSkills;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Person me = new Person("David", "Ast", 34);
		Person brother = new Person("Domen", "Ast", 17);
		Person sister = new Person("Andrea", "Tern", 38);
		Person mother = new Person("Dusica", "Ast", 60);
		Person vater = new Person("Franc", "Ast", 61);
		Person firstChild = new Person("Eva", "Ast", 13);
		Person secondChild = new Person("Nika", "Ast", 3);

//		Person[] familyPersons = { me, brother, sister, mother, vater, firstChild, secondChild };
		List<Person> familyPersons = new LinkedList<>();
		familyPersons.add(me);
		familyPersons.add(brother);
		familyPersons.add(sister);
		familyPersons.add(mother);
		familyPersons.add(vater);
		familyPersons.add(firstChild);
		familyPersons.add(secondChild);

		float avgAge = 0;
		int sumAge = 0;
//		for (int i = 0; i < familyPersons.length; i++) {
//			System.out.println(familyPersons[i].toString());
//			sumAge += familyPersons[i].getAge();
//		}
//		avgAge = sumAge / familyPersons.length;
		for (Person el : familyPersons) {
			System.out.println(el.toString());
			sumAge += el.getAge();
		}
		avgAge = sumAge / familyPersons.size();
		System.out.println("Average age in family is: " + avgAge);
	}
}
