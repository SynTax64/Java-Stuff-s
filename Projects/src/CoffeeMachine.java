import java.util.Scanner;


public class CoffeeMachine {
    public static int water = 400;
    public static int milk = 540;
    public static int gramsOfBeans = 120;
    public static int disposableCups = 9;
    public static int availableMoney = 550;


    public static void printStatus() {

        System.out.println("\nThe coffee machine has:");
        System.out.println(CoffeeMachine.water + " of water");
        System.out.println(CoffeeMachine.milk + " of milk");
        System.out.println(CoffeeMachine.gramsOfBeans + " of coffee beans");
        System.out.println(CoffeeMachine.disposableCups + " of disposable cups");
        System.out.println(CoffeeMachine.availableMoney + " of money\n");
    }

    public static int calculateAvailableCups() {

        int availableCups = 0;

        int waterPerCoffee = 200;
        int milkPerCoffee = 50;
        int coffeeBeansPerCoffee = 15;


        while (water >= waterPerCoffee) {
            if ((milk < milkPerCoffee) || (gramsOfBeans < coffeeBeansPerCoffee)) {
                break;
            }
            water -= waterPerCoffee;
            milk -= milkPerCoffee;
            gramsOfBeans -= coffeeBeansPerCoffee;
            availableCups++;
        }
        return availableCups;
    }

    public static boolean subtractIngredient(int sWater, int sMilk, int sGramsOfBeans, int sCost) {
        if ((CoffeeMachine.water - sWater) < 0) {
            System.out.println("Sorry, not enough water!");
            return false;
        } else if ((CoffeeMachine.milk - sMilk) < 0) {
            System.out.println("Sorry, not enough milk!");
            return false;
        } else if ((CoffeeMachine.gramsOfBeans - sGramsOfBeans) < 0) {
            System.out.println("Sorry, not enough beans!");
            return false;
        } else if ((CoffeeMachine.disposableCups - 1) < 0) {
            System.out.println("Sorry, not enough cups!");
            return false;
        } else {
            CoffeeMachine.water -= sWater;
            CoffeeMachine.milk -= sMilk;
            CoffeeMachine.gramsOfBeans -= sGramsOfBeans;
            CoffeeMachine.disposableCups--;
            CoffeeMachine.availableMoney += sCost;
            return true;
        }

    }

    public static void buyCoffee() {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String whichCoffee = input.nextLine();

        switch (whichCoffee) {
            case "1":
                subtractIngredient(250, 0, 16, 4);
                break;
            case "2":
                subtractIngredient(350, 75, 20, 7);
                break;
            case "3":
                subtractIngredient(200, 100, 12, 6);
                break;
            case "back":
                break;
        }

    }


    public static void takeMoney() {
        System.out.println("I gave you $" + CoffeeMachine.availableMoney);
        CoffeeMachine.availableMoney = 0;
    }

    public static void fillCoffee() {

        Scanner input = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add:");
        CoffeeMachine.water += input.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        CoffeeMachine.milk += input.nextInt();

        System.out.println("Write how many grams of coffee beans do you want to add:");
        CoffeeMachine.gramsOfBeans += input.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        CoffeeMachine.disposableCups += input.nextInt();
    }

    public static void chooseAction(String action) {

        switch (action) {
            case "buy":
                buyCoffee();
                break;
            case "fill":
                fillCoffee();
                break;
            case "take":
                takeMoney();
                break;
            case "remaining":
                printStatus();
                break;
            default:
                System.out.println("");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit)):");
            String selectedAction = input.nextLine();
            if (selectedAction.equals("exit")) {
                break;
            } else
                chooseAction(selectedAction);
        }
    }
}

