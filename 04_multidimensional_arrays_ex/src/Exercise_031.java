import java.util.Arrays;
import java.util.Scanner;

public class Exercise_031 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows = Integer.parseInt(scanner.nextLine());
		int[][] matrix = new int[rows][];

		for (int row = 0; row < rows; row++) {
			matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		}

		int sumDiag1 = 0;
		int sumDiag2 = 0;

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {

				int number = matrix[row][col];
				if (row == col) {
					sumDiag1 += number;
				}
				if (col == matrix[row].length - row - 1) {
					sumDiag2 += number;
				}
			}
		}
		System.out.println(Math.abs(sumDiag1 - sumDiag2));
	}
}
