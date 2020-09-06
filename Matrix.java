import java.util.Scanner;

class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cells = scanner.nextInt();
        if (rows > 100 || cells > 100) {
            return;
        }
        int[][] matrix = new int[rows][cells];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        for (int row = 0; row < matrix.length; row++) {
            for (int cell = 0; cell < matrix[row].length; cell++) {
                if (cell == i) {
                    int tmp = matrix[row][cell];
                    matrix[row][cell] = matrix[row][j];
                    matrix[row][j] = tmp;
                }
            }
        }

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.println(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}