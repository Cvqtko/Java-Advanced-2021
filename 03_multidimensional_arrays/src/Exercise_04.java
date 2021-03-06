import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = readMatrix(scanner);

		int sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				sum += matrix[row][col];
			}
		}
		System.out.printf("%d\n%d\n%d", matrix.length, matrix[0].length,sum);
	}

	private static int[][] readMatrix(Scanner scanner) {
		String[] tokens = scanner.nextLine().split(", ");
		int rows = Integer.parseInt(tokens[0]);

		int cols = Integer.parseInt(tokens[1]);

		int[][] matrix = new int[rows][cols];

		for (int row = 0; row < rows; row++) {

			String[] inputTokens = scanner.nextLine().split(", ");

			for (int column = 0; column < cols; column++) {

				matrix[row][column] = Integer.parseInt(inputTokens[column]);
			}
		}
		return matrix;
	}

}
