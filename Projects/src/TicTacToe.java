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
	}

	public static boolean enterCoordinates(int cell, int row, char field, char[][] grid) {

		if ((row > 3 || row < 0) || (cell > 3 || cell < 0)) {
			System.out.println("Coordinates should be from 1 to 3!");
			return false;
		} else {
			switch (row) {
			case 1:
				if (cell == 1) {
					if (grid[2][0] == ' ') {
						grid[2][0] = field;
						return true;
					} else {
						System.out.println("This cell is occupied! Choose another one!");
						return false;
					}
				} else if (cell == 2) {
					if (grid[2][1] == ' ') {
						grid[2][1] = field;
						return true;
					} else {
						System.out.println("This cell is occupied! Choose another one!");
						return false;
					}
				} else if (cell == 3) {
					if (grid[2][2] == ' ') {
						grid[2][2] = field;
						return true;
					} else {
						System.out.println("This cell is occupied! Choose another one!");
						return false;
					}
				}
				break;
			case 2:
				if (cell == 1) {
					if (grid[1][0] == ' ') {
						grid[1][0] = field;
						return true;
					} else {
						System.out.println("This cell is occupied! Choose another one!");
						return false;
					}
				} else if (cell == 2) {
					if (grid[1][1] == ' ') {
						grid[1][1] = field;
						return true;
					} else {
						System.out.println("This cell is occupied! Choose another one!");
						return false;
					}
				} else if (cell == 3) {
					if (grid[1][2] == ' ') {
						grid[1][2] = field;
						return true;
					} else {
						System.out.println("This cell is occupied! Choose another one!");
						return false;
					}
				}
				break;
			case 3:
				if (cell == 1) {
					if (grid[0][0] == ' ') {
						grid[0][0] = field;
						return true;
					} else {
						System.out.println("This cell is occupied! Choose another one!");
						return false;
					}
				} else if (cell == 2) {
					if (grid[0][1] == ' ') {
						grid[0][1] = field;
						return true;
					} else {
						System.out.println("This cell is occupied! Choose another one!");
						return false;
					}
				} else if (cell == 3) {
					if (grid[0][2] == ' ') {
						grid[0][2] = field;
						return true;
					} else {
						System.out.println("This cell is occupied! Choose another one!");
						return false;
					}
				}
				break;
			}
		}
		return false;
	}

	public static char[][] fillGrid() {
		char[][] chars = new char[3][3];

		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars[i].length; j++) {
				chars[i][j] = ' ';
			}
		}
		return chars;
	}

	public static boolean checkPlayers(int playerO, int playerX) {
		return ((playerO + playerX) == 9);
	}

	public static boolean checkWinner(char[][] chars) {
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

		if ((chars[0][0] == playerO && chars[1][1] == playerO && chars[2][2] == playerO)
				|| (chars[0][2] == playerO && chars[1][1] == playerO && chars[2][0] == playerO)) {
			winnerO = true;
		} else if ((chars[0][0] == playerX && chars[1][1] == playerX && chars[2][2] == playerX)
				|| (chars[0][2] == playerX && chars[1][1] == playerX && chars[2][0] == playerX)) {
			winnerX = true;
		}

		if (!winnerO && !winnerX && full) {
			output = "Draw";
			return true;
		} else if (winnerO) {
			output = "O wins";
			return true;
		} else if (winnerX) {
			output = "X wins";
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		char[][] chars;
		chars = fillGrid();
		output(chars);
		int x = 0;
		while (true) {
			try (Scanner scanner = new Scanner(System.in)) {
				int cell = scanner.nextInt();
				int row = scanner.nextInt();
				System.out.print("Enter the coordinates: ");
				char pXO = x % 2 == 0 ? 'X' : 'O';
				if (enterCoordinates(cell, row, pXO, chars)) {
					output(chars);
					if (checkWinner(chars)) {
						break;
					}
				}
				x++;
			} catch (RuntimeException e) {
				System.out.println("You should enter numbers!");
			}
		}

	}
}
