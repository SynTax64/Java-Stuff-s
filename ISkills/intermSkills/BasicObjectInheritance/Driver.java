package intermSkills.BasicObjectInheritance;

public class Driver {
	public static void main(String[] args) {
		String[] words = new String[4];
		int[] numbers = new int[4];

		// can do this
		words[0] = "The";
		words[1] = "Infinite Skills";
		words[2] = "Animal System Version";
		// can't do this
		// words[3]=2.0;

		// can do this
		numbers[0] = 7;
		numbers[1] = 15;
		numbers[2] = 19;
		numbers[3] = 12;
		// can't do this
		// numbers[3]="21";

//		Animal a = new Animal();
//		System.out.println(a);
//		Animal a2 = new Animal("Fido", "Dog");
//		System.out.println(a2);
//		Animal a3 = new Animal("Fluffy", "Cat");
//		System.out.println(a3);
//
//		Dog d = new Dog("Fido", "Dog", false);
//		System.out.println(d);
//
//		Cat c = new Cat("Fluffy", "Cat", true);
//		System.out.println(c);

		Animal[] myPets = new Animal[5];
		Dog d = new Dog("Fido", "Blac Lab", false);
		Cat c = new Cat("Fluffy", "Persian", true);
		myPets[0] = d;
		myPets[1] = new Dog("Woofy", "German Shepard", true);
		myPets[2] = c;
		myPets[3] = new Cat("Spot", "Siamese", false);
		myPets[4] = new Animal("Tank", "Turtle");

		for (Animal animal : myPets) {
			System.out.println(animal);
		}

		// for reference
		// myPetts[0] = dog
		// myPetts[2] = cat

		myPets[0].setBreed("Vizsla");
//		myPets[0].setServiceAnimal(true);
//		myPets[2].setIsDeclawed(true);

		// we can use a downcast to get the more specific type:
		((Dog) myPets[0]).setServiceAnimal(true);
		((Cat) myPets[2]).setDeclawed(true);

		// ((Cat) myPets[0]).setDeclawed(false); ClassCastException

		for (Animal a : myPets) {
			if (a instanceof Dog) {
				Dog myPetDog = (Dog) a;
//				((Dog) a).setServiceAnimal(false); 
				myPetDog.setServiceAnimal(false);
				System.out.println("Set " + myPetDog.getName() + "'s value for" + " is a service animal to false");

			} else if (a instanceof Cat) {
				Cat myPetCat = (Cat) a;
				myPetCat.setDeclawed(false);
				System.out.println("Set " + myPetCat.getName() + "'s value for" + " is a declawed to false");
			}
			System.out.println(a);
		}
	}
}
