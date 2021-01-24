import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows = Integer.parseInt(scanner.nextLine());

		int cols = Integer.parseInt(scanner.nextLine());
		char[][] firstMatrix = readMatrix(scanner, rows, cols);
		char[][] secondMatrix = readMatrix(scanner, rows, cols);

		char[][] outputMatrix = new char[rows][cols];

		for (int row = 0; row < outputMatrix.length; row++) {
			for (int col = 0; col < outputMatrix[row].length; col++) {
				outputMatrix[row][col] = firstMatrix[row][col] == secondMatrix[row][col] ? firstMatrix[row][col] : '*';
			}
		}

		for (int row = 0; row < outputMatrix.length; row++) {
			for (int col = 0; col < outputMatrix[row].length; col++) {
				System.out.print(outputMatrix[row][col] + " ");
			}
			System.out.println();
		}
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
