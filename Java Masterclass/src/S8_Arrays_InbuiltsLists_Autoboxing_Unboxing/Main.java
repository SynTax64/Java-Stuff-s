package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    private static void printInstructions() {
        System.out.println("0: Print instructions");
        System.out.println("1: Print Grocery list");
        System.out.println("2: Add item to the List");
        System.out.println("3. Replace item from the list");
        System.out.println("4. Remove item from the list");
        System.out.println("5. Search item on the List");
        System.out.println("6. To quit the application");
    }

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryItems();
                    break;
                case 2:
                    System.out.println("Enter an item: ");
                    String item = scanner.nextLine();
                    groceryList.addGroceryItem(item);
                    break;
                case 3:
                    System.out.print("Replace item on place (int) ");
                    int place = scanner.nextInt() - 1;
                    System.out.println("Enter an item: (String)");
                    String cItem = scanner.nextLine();
                    groceryList.modifyGroceryItem(place, cItem);
                    break;
                case 4:
                    System.out.print("Enter place of item to be removed: ");
                    groceryList.removeGroceryItem(scanner.nextInt());
                    break;
                case 5:
                    System.out.print("Enter name of the item: ");
                    String sItem = groceryList.getItem(scanner.nextLine());
                    if (sItem != null) {
                        System.out.println("Item " + sItem + " found");
                    } else {
                        System.out.println("Item " + sItem + " not found");
                    }
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
}
