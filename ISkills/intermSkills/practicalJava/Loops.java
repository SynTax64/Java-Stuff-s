package intermSkills.practicalJava;

import java.util.Iterator;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		Runner raceRunner;
		Swimmer raceSwimmer;
		boolean runRaceMenu = true;
		while (runRaceMenu) {

			int menuChoice = printMenu();
			switch (menuChoice) {
			case 1:
				System.out.println("You chose to create a new runner.");
				raceRunner = getNewRunner();
				System.out.println("You created a new runner: " + raceRunner.toString());
				break;
			case 2:
				System.out.println("You chose to create a new swimmer.");
				raceSwimmer = getNewSwimmer();
				System.out.println("You created a new swimmer: " + raceSwimmer.toString());
				break;
			case 3:
				System.out.println("Thank you for using Infinite Skills Race Manager");
				runRaceMenu = false;
				break;
			default:
				break;
			}

		}
		System.out.println("*************** LOOP 1 COMPLETE ***********************");

		do {
			int menuChoice = printMenu();
			switch (menuChoice) {
			case 1:
				System.out.println("You chose to create a new runner.");
				raceRunner = getNewRunner();
				System.out.println("You created a new runner: " + raceRunner.toString());
				runRaceMenu = true;
				break;
			case 2:
				System.out.println("You chose to create a new swimmer.");
				raceSwimmer = getNewSwimmer();
				System.out.println("You created a new swimmer: " + raceSwimmer.toString());
				runRaceMenu = true;
				break;
			case 3:
				System.out.println("Thank you for using Infinite Skills Race Manager");
				runRaceMenu = false;
				break;
			default:
				break;
			}
		} while (runRaceMenu);
		System.out.println("*************** LOOP 2 COMPLETE ***********************");

		loop: for (int i = 0; i < 4; i++) {

			int menuChoice = printMenu();
			switch (menuChoice) {
			case 1:
				System.out.println("You chose to create a new runner.");
				raceRunner = getNewRunner();
				System.out.println("You created a new runner: " + raceRunner.toString());
				break;
			case 2:
				System.out.println("You chose to create a new swimmer.");
				raceSwimmer = getNewSwimmer();
				System.out.println("You created a new swimmer: " + raceSwimmer.toString());
				break;
			case 3:
				System.out.println("Thank you for using Infinite Skills Race Manager");
				break loop;
			default:
				break;
			}
		}
		System.out.println("*************** LOOP 3 COMPLETE ***********************");
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
