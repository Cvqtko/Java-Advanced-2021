import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Exercise_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		scanner.nextLine();
		int[][] matrix = new int[rows][cols];

		for (int row = 0; row < rows; row++) {
			matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		}

		int maxSum = Integer.MIN_VALUE;
		int startRow = 0;
		int startCol = 0;
		for (int row = 0; row < matrix.length - 2; row++) {
			for (int col = 0; col < matrix[row].length - 2; col++) {
				int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] + matrix[row + 1][col]
						+ matrix[row + 1][col + 1] + matrix[row + 1][col + 2] + matrix[row + 2][col]
						+ matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
				if (sum > maxSum) {
					maxSum = sum;
					startRow = row;
					startCol = col;
				}
			}
		}
		System.out.println("Sum = " + maxSum);
		printSubMatrix(matrix, startRow, startCol);
	}

	private static void printSubMatrix(int[][] matrix, int startRow, int startCol) {
		for (int row = startRow; row <= startRow + 2; row++) {
			for (int col = startCol; col <= startCol + 2; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}

	}
}
