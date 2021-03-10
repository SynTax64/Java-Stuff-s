package intermSkills.practicalJava;

import java.util.Scanner;

import Utilities.Utilities;

public class PackagesAndJars {

	public static void main(String[] args) {
		Runner r = new Runner();
		Swimmer s = new Swimmer();

		r.setName("David");
		r.setRaceID(157965);

		s.setName("Nika");
		s.setRaceID(945863);

		System.out.println(Utilities.nullSafeEquals(r.getName(), s.getName()));
	}

	private static Swimmer getNewSwimmer() {
		Scanner input = new Scanner(System.in);
		Swimmer s = new Swimmer();
		System.out.print("Please enter the name of the swimmer: ");
		s.setName(input.nextLine());
		System.out.print("Please enter the raceID of the swimmer: ");
		s.setRaceID(Integer.parseInt(input.nextLine()));
		return s;
	}

	private static Runner getNewRunner() {
		Scanner input = new Scanner(System.in);
		Runner r = new Runner();
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
		System.out.println("Enter '1' to add a new Runner");
		System.out.println("Enter '2' to add a new Swimmer");
		System.out.println("Enter '3' to quit");
		System.out.println("-------------------------------------------");
		System.out.println("*******************************************");
		int result = Integer.parseInt(input.nextLine());
		return result;
	}

}
