import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] input = scanner.nextLine().split(", ");
		int size = Integer.parseInt(input[0]);
		String pattern = input[1];

		int[][] matrix = new int[size][size];

		int startNumber = 1;
		if (pattern.equals("A")) {
			for (int col = 0; col < size; col++) {
				for (int row = 0; row < size; row++) {
					matrix[row][col] = startNumber++;
				}
			}
		} else if (pattern.equals("B")) {
			for (int col = 0; col < size; col++) {
				if (col % 2 == 0) {
					for (int row = 0; row < size; row++) {
						matrix[row][col] = startNumber++;
					}
				} else {
					for (int row = size - 1; row >= 0; row--) {
						matrix[row][col] = startNumber++;
					}
				}

			}
		}
		printMatrix(matrix);

	}

	private static int[][] readMatrix(Scanner scanner) {
		String[] tokens = scanner.nextLine().split("\\s+");
		int rows = Integer.parseInt(tokens[0]);

		int cols = Integer.parseInt(tokens[1]);

		int[][] matrix = new int[rows][cols];

		for (int row = 0; row < rows; row++) {

			String[] inputTokens = scanner.nextLine().split(" ");

			for (int column = 0; column < cols; column++) {

				matrix[row][column] = Integer.parseInt(inputTokens[column]);
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {

			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}
}
