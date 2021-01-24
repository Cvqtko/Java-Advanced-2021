import java.util.Scanner;

public class SumOfSubmatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = readMatrix(scanner);
		int bestSum = Integer.MIN_VALUE;
		int resultRow = 0;
		int resultCol = 0;
		for (int row = 0; row < matrix.length - 1; row++) {
			for (int col = 0; col < matrix[row].length - 1; col++) {
				int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
				if (sum > bestSum) {
					bestSum = sum;
					resultRow = row;
					resultCol = col;
				}
			}

		}
		System.out.printf("%d %d\n%d %d\n%d", matrix[resultRow][resultCol], matrix[resultRow][resultCol + 1],
				matrix[resultRow + 1][resultCol], matrix[resultRow + 1][resultCol + 1], bestSum);
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
