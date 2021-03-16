package intermSkills.practicalJava.temporary;

import java.util.Scanner;

import Utilities.Utilities;

public class PackagesAndJars {

	public static void main(String[] args) {
		TMPRunner r = new TMPRunner();
		TMPSwimmer s = new TMPSwimmer();

		r.setName("David");
		r.setRaceID(157965);

		s.setName("Nika");
		s.setRaceID(945863);

		System.out.println(Utilities.nullSafeEquals(r.getName(), s.getName()));
	}

	private static TMPSwimmer getNewSwimmer() {
		Scanner input = new Scanner(System.in);
		TMPSwimmer s = new TMPSwimmer();
		System.out.print("Please enter the name of the swimmer: ");
		s.setName(input.nextLine());
		System.out.print("Please enter the raceID of the swimmer: ");
		s.setRaceID(Integer.parseInt(input.nextLine()));
		return s;
	}

	private static TMPRunner getNewRunner() {
		Scanner input = new Scanner(System.in);
		TMPRunner r = new TMPRunner();
		System.out.print("Please enter the name of the runner: ");
		r.setName(input.nextLine());
		System.out.print("Please enter the raceID of the runner: ");
		r.setRaceID(Integer.parseInt(input.nextLine()));
		return r;
	}

	private static int printMenu() {

		Scanner input = new Scanner(System.in);
		System.out.println("*******************************************");
		System.out.println("* Welcome to Infinite Skills Race Manager *");
		System.out.println("*******************************************");
		System.out.println("What would you like to do today?");
		System.out.println("-------------------------------------------");
		System.out.println("Enter '1' to add a new TMPRunner");
		System.out.println("Enter '2' to add a new TMPSwimmer");
		System.out.println("Enter '3' to quit");
		System.out.println("-------------------------------------------");
		System.out.println("*******************************************");
		int result = Integer.parseInt(input.nextLine());
		return result;
	}

}
