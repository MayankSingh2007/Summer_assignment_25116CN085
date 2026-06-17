import java.util.Scanner;

// This program multiplies two matrices.
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows for first matrix: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input: please enter a valid integer.");
            scanner.close();
            return;
        }
        int rowsFirst = scanner.nextInt();

        System.out.print("Enter number of columns for first matrix: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input: please enter a valid integer.");
            scanner.close();
            return;
        }
        int columnsFirst = scanner.nextInt();

        System.out.print("Enter number of columns for second matrix: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input: please enter a valid integer.");
            scanner.close();
            return;
        }
        int columnsSecond = scanner.nextInt();

        if (rowsFirst <= 0 || columnsFirst <= 0 || columnsSecond <= 0) {
            System.out.println("Please enter positive matrix dimensions.");
            scanner.close();
            return;
        }

        int rowsSecond = columnsFirst;

        int[][] firstMatrix = new int[rowsFirst][columnsFirst];
        int[][] secondMatrix = new int[rowsSecond][columnsSecond];
        int[][] productMatrix = new int[rowsFirst][columnsSecond];

        System.out.println("Enter elements of first matrix:");
        readMatrix(scanner, firstMatrix);

        System.out.println("Enter elements of second matrix:");
        readMatrix(scanner, secondMatrix);

        multiplyMatrices(firstMatrix, secondMatrix, productMatrix);

        System.out.println("Product matrix:");
        printMatrix(productMatrix);

        scanner.close();
    }

    private static void readMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid input. Enter element [" + (i + 1) + "][" + (j + 1) + "] again: ");
                    scanner.next();
                }
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static void multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int[][] productMatrix) {
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < firstMatrix[0].length; k++) {
                    sum += firstMatrix[i][k] * secondMatrix[k][j];
                }
                productMatrix[i][j] = sum;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}