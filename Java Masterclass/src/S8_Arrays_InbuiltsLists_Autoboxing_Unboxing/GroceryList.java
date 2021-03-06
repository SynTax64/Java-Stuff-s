package S8_Arrays_InbuiltsLists_Autoboxing_Unboxing;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void printGroceryItems() {
        System.out.println("Your grocery list has: " + groceryList.size() + " items.");
        /*int el = 1;
        for (String item : groceryList) { // printed with foreach loop
            System.out.println("Item #" + el++ + ": " + item);
        }*/

        for (int i = 0; i < groceryList.size(); i++) { // or with normal for loop
            System.out.println("Item #" + (i + 1) + ": " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String newItem) {
        int position = searchItem(newItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    public void modifyGroceryItem(int position, String item) {
        groceryList.set(position, item); // how to replace item in ArrayList
        System.out.println("It was replaced item \"" + groceryList.get(position) + "\" on  the list");
    }

    public void addGroceryItem(String item) {
        groceryList.add(item); // how to add item in ArrayList
        System.out.println("It was added item: " + item);
    }

    public void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position - 1);
    }

    public int searchItem(String searchItem) {
        return groceryList.indexOf(searchItem); // if item exists return 0 or greater value
    }

    public String getItem(String item) {
        int position = searchItem(item);
        return (position < 0) ? null : groceryList.get(searchItem(item));
    }
}
