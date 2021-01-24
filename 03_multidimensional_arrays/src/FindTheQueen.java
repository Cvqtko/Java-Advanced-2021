import java.util.Iterator;
import java.util.Scanner;

public class FindTheQueen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[][] matrix = readMatrix(scanner, 8, 8);

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 'q' && isSafe(matrix, row, col)) {
					System.out.println(row + " " + col);
				}
			}
		}
	}

	private static boolean isSafe(char[][] matrix, int row, int col) {
		// Check row
		for (int i = 0; i < matrix[row].length; i++) {
			if (matrix[row][i] == 'q' && i != col) {
				return false;
			}
		}

		// Check col
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][col] == 'q' && i != row) {
				return false;
			}
		}

		// Check upper diagonal on left side
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (matrix[i][j] == 'q' && i != row) {
				return false;
			}
		}

		// Check lower diagonal on right side
		for (int i = row, j = col; i < matrix.length && j < matrix[row].length; i++, j++) {
			if (matrix[i][j] == 'q' && i != row) {
				return false;
			}
		}
		// Check upper diagonal on right side
		for (int i = row, j = col; i >= 0 && j < matrix[row].length; i--, j++) {
			if (matrix[i][j] == 'q' && i != row) {
				return false;
			}
		}
		// Check lower diagonal on left side
		for (int i = row, j = col; i < matrix.length && j >= 0; i++, j--) {
			if (matrix[i][j] == 'q' && i != row) {
				return false;
			}
		}
		return true;
	}

	private static char[][] readMatrix(Scanner scanner, int rows, int cols) {

		char[][] matrix = new char[rows][cols];

		for (int row = 0; row < rows; row++) {

			String[] symbols = scanner.nextLine().split("\\s+");

			for (int column = 0; column < cols; column++) {

				matrix[row][column] = symbols[column].charAt(0);
			}
		}
		return matrix;
	}
}
