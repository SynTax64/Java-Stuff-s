package intermSkills.practicalJava.temporary;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicDataStructures {

	public static void main(String[] args) {
		final int MAX_RACE_RUNNERS = 5;
		TMPRunner[] raceRunners = new TMPRunner[MAX_RACE_RUNNERS];
		int raceRunnersCount = 0;
		ArrayList<TMPSwimmer> raceSwimmers = new ArrayList<>();

		boolean runRaceMenu = true;
		while (runRaceMenu) {

			int menuChoice = printMenu();
			switch (menuChoice) {
			case 1:
				System.out.println("You chose to create a new runner.");
				if (raceRunnersCount < MAX_RACE_RUNNERS) {
					raceRunners[raceRunnersCount] = getNewRunner();
					raceRunnersCount++;
				} else {
					System.out.println("The Race is full: No more runners can be added");
				}
				break;
			case 2:
				System.out.println("You chose to create a new swimmer.");
				raceSwimmers.add(getNewSwimmer());
				break;
			case 3:
				System.out.println("Thank you for using Infinite Skills Race Manager");
				runRaceMenu = false;
				break;
			default:
				break;
			}
		}
		System.out.println("******************** RUNNERS ********************");
		for (int r = 0; r < raceRunners.length; r++) {
			System.out.println(raceRunners[r]);
		}

		System.out.println("******************** SWIMMERS ********************");
		for (int s = 0; s < raceSwimmers.size(); s++) {
			System.out.println(raceSwimmers.get(s));
		}
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

}
