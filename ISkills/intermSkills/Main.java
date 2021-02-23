package intermSkills;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
		Map<String, Person> myFamily = new HashMap<>();
		myFamily.put(me.getFirstName(), me);
		myFamily.put(brother.getFirstName(), brother);
		myFamily.put(sister.getFirstName(), sister);
		myFamily.put(mother.getFirstName(), mother);
		myFamily.put(vater.getFirstName(), vater);
		myFamily.put(firstChild.getFirstName(), firstChild);
		myFamily.put(secondChild.getFirstName(), secondChild);

		familyPersons.add(me);
		familyPersons.add(brother);
		familyPersons.add(sister);
		familyPersons.add(mother);
		familyPersons.add(vater);
		familyPersons.add(firstChild);
		familyPersons.add(secondChild);

		// trough the LinkedList with the Iterator
		for (Iterator<Person> it = familyPersons.iterator(); it.hasNext();) {
			Person el = it.next();
			System.out.println(el);
		}

		// trough the LinkedList with the generic for loop
		for (int i = 0; i < familyPersons.size(); i++) {
			System.out.println(familyPersons.get(i));
		}

		float avgAge = 0;
		int sumAge = 0;

		// trough the HashMap with the keySet() method and foreach loop
		for (String s : myFamily.keySet()) {
			Person el = myFamily.get(s);
			sumAge += el.getAge();
			System.out.println(s.toString());
		}
		avgAge = sumAge / myFamily.size();
		System.out.println("Average age in family is: " + avgAge);
		System.out.println(myFamily.get(me));

		sumAge = 0;

		avgAge = sumAge / familyPersons.size();

		// trough the LinkedList with the foreach loop
		for (Person el : familyPersons) {
			System.out.println(el.toString());
			sumAge += el.getAge();
		}

		avgAge = sumAge / familyPersons.size();
		avgAge = sumAge / myFamily.size();
		System.out.println("Average age in family is: " + avgAge);
	}
}
