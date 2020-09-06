package solution1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        AI ai = new EasyAI();

        while (field.continues()) {
            if (field.nextSymbol() == Symbol.X) {
                userMove(field);
            } else {
                System.out.println(field);
                ai.move(field);
            }
        }
        System.out.println(field);
        Symbol winner = field.getWinner();

        switch (winner) {
            case X:
            case O:
                System.out.println(winner.getSymbol() + " wins");
                break;
            case EMPTY:
                System.out.println("Draw");
                break;
            default:
                throw new IllegalStateException();
        }
    }

    private static void userMove(Field field) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(field);

            System.out.print("Enter coordinates: ");
            try {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                if (x < 1 || x > 3 || y < 1 || y > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                } else if (field.isFree(x, y)) {
                    field.set(x, y);
                    break;
                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
            }
        }
    }
}
