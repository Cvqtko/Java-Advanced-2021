import java.util.Arrays;
import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows = Integer.parseInt(scanner.nextLine());
		int[][] matrix = new int[rows][];

		for (int row = 0; row < rows; row++) {
			matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		}

		int sumDiag1 = 0;
		int sumDiag2 = 0;

		int row = 0;
		int col = 0;

		for (int i = 0; i < matrix.length; i++) {
			sumDiag1 += matrix[row++][col++];
		}

		row = 0;
		col = matrix[0].length - 1;

		for (int i = 0; i < matrix.length; i++) {
			sumDiag2 += matrix[row++][col--];
		}

		System.out.println(Math.abs(sumDiag1 - sumDiag2));
	}
}
