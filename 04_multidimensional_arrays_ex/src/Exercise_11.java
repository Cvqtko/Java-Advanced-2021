import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Exercise_11 {
	public static int matrixRows, matrixColumns;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		scanner.nextLine();

		int[][] matrix = new int[rows][cols];

		for (int row = 0; row < rows; row++) {
			matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		}
		matrixRows = matrix.length;
		matrixColumns = matrix[0].length;

		// Function call
		diagonalOrder(matrix);
	}

	private static void diagonalOrder(int[][] matrix) {

		/*
		 * through this for loop we choose each element of first column as starting
		 * point and print diagonal starting at it. arr[0][0], arr[1][0]....arr[R-1][0]
		 * are all starting points
		 */
		for (int k = 0; k < matrixRows; k++) {
			System.out.print(matrix[k][0] + " ");

			// set row index for next
			// point in diagonal
			int i = k - 1;

			// set column index for
			// next point in diagonal
			int j = 1;

			/* Print Diagonally upward */
			while (isValid(i, j)) {
				System.out.print(matrix[i][j] + " ");

				i--;

				// move in upright direction
				j++;
			}

			System.out.println("");
		}

		/*
		 * through this for loop we choose each element of last row as starting point
		 * (except the [0][c-1] it has already been processed in previous for loop) and
		 * print diagonal starting at it. arr[R-1][0], arr[R-1][1].... arr[R-1][c-1] are
		 * all starting points
		 */

		// Note : we start from k = 1 to C-1;
		for (int k = 1; k < matrixColumns; k++) {
			System.out.print(matrix[matrixRows - 1][k] + " ");

			// set row index for next
			// point in diagonal
			int i = matrixRows - 2;

			// set column index for
			// next point in diagonal
			int j = k + 1;

			/* Print Diagonally upward */
			while (isValid(i, j)) {
				System.out.print(matrix[i][j] + " ");

				// move in upright direction
				i--;
				j++;
			}

			System.out.println("");
		}
	}

	public static boolean isValid(int i, int j) {
		if (i < 0 || i >= matrixRows || j >= matrixColumns || j < 0)
			return false;
		return true;
	}
}
