import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {

    public static void output(char[][] chars) {
        int rows = chars.length;
        int cells = chars[0].length;
        System.out.println("---------");
        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < cells; j++) {
                System.out.print(" " + chars[i][j]);
            }
            System.out.print(" |\n");
        }
        System.out.println("---------");
        System.out.println(checkWinner(chars));
    }

    public static char[][] fillGrid(String string) {
        char[][] chars = new char[3][3];
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                chars[i][j] = string.charAt(count);
                count++;
            }
        }
        return chars;
    }

    public static boolean checkPlayers(int playerO, int playerX) {
        return ((playerO + playerX) == 9);
    }

    public static String checkWinner(char[][] chars) {
        String output = "";
        char playerO = 'O';
        char playerX = 'X';
        int pO = 0;
        int pX = 0;
        int allOf = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                allOf++;
                if (chars[i][j] == 'O') {
                    pO++;
                } else if (chars[i][j] == 'X') {
                    pX++;
                }
            }
        }

        boolean full = checkPlayers(pO, pX);
        boolean winnerO = false;
        boolean winnerX = false;


        for (int i = 0; i < chars.length; i++) {
            if (chars[i][0] == playerO && chars[i][1] == playerO && chars[i][2] == playerO) {
                winnerO = true;
            } else if (chars[i][0] == playerX && chars[i][1] == playerX && chars[i][2] == playerX) {
                winnerX = true;
            }
        }

        for (int j = 0; j < chars.length; j++) {
            if (chars[0][j] == playerO && chars[1][j] == playerO && chars[2][j] == playerO) {
                winnerO = true;
            } else if (chars[0][j] == playerX && chars[1][j] == playerX && chars[2][j] == playerX) {
                winnerX = true;
            }
        }

        if ((chars[0][0] == playerO && chars[1][1] == playerO && chars[2][2] == playerO) || (chars[0][2] == playerO && chars[1][1] == playerO && chars[2][0] == playerO)) {
            winnerO = true;
        } else if ((chars[0][0] == playerX && chars[1][1] == playerX && chars[2][2] == playerX) || (chars[0][2] == playerX && chars[1][1] == playerX && chars[2][0] == playerX)) {
            winnerX = true;
        }

        int divPlayer = Math.abs(pO - pX);
        if (divPlayer > 1) {
            output = "Impossible";
        } else if (winnerO && winnerX) {
            output = "Impossible";
        } else if (!winnerO && !winnerX && !full) {
            output = "Game not finished";
        } else if (!winnerO && !winnerX && full) {
            output = "Draw";
        } else if (winnerO) {
            output = "O wins";
        } else if (winnerX) {
            output = "X wins";
        }

        return output;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[][] chars = fillGrid(string);
        output(chars);
    }

}
