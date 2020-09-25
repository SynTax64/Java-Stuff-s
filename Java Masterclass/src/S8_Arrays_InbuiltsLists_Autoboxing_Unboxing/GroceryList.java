package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing;

import java.util.ArrayList;

public class GroceryList {

    ArrayList<String> groceryList = new ArrayList<String>();

    public void printGroceryItems() {
        System.out.println("Your grocery list has: " + groceryList.size() + " items.");
        /*int el = 1;
        for (String item : groceryList) { // printed with foreach loop
            System.out.println("Item #" + el++ + ": " + item);
        }*/

        for (int i = 0; i < groceryList.size(); i++) { // or with normal for loop
            System.out.println("Item #" + i + ": " + groceryList.get(i));
        }
    }

    public void addGroceryItem(String item) {
        groceryList.add(item); // how to add item in ArrayList
        System.out.println("It was added item: " + item);
    }

    public void replaceGroceryItem(int position, String item) {
        groceryList.set(position, item); // how to replace item in ArrayList
        System.out.println("It was replaced item \"" + groceryList.get(position) + "\" on  the list");
    }

    public void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
    }

    public String searchItem(String searchItem) {
        boolean isExists = groceryList.contains(searchItem); // how to check if item exists in this list
        int position = groceryList.indexOf(searchItem); // how to ge index of item, which we searching for, if not in list return -1
        if (position >= 0) {
            return groceryList.get(position); // if item exists return value of item
        }
        return null; // if not exists return empty object(null)
    }
}
