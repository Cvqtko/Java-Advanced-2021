import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		scanner.nextLine();

		String[][] matrix = new String[rows][cols];

		for (int row = 0; row < rows; row++) {
			String[] rowValues = scanner.nextLine().split("\\s+");

			for (int col = 0; col < cols; col++) {
				matrix[row][col] = rowValues[col];
			}
		}

		String input = "";
		while (!"END".equals(input = scanner.nextLine())) {

			String[] commandArgs = input.split("\\s+");

			if (!"swap".equals(commandArgs[0]) || commandArgs.length != 5) {
				System.out.println("Invalid input!");
				continue;
			}

			int row1;
			int col1;
			int row2;
			int col2;

			try {
				row1 = Integer.parseInt(commandArgs[1]);
				col1 = Integer.parseInt(commandArgs[2]);
				row2 = Integer.parseInt(commandArgs[3]);
				col2 = Integer.parseInt(commandArgs[4]);
			} catch (Exception e) {
				System.out.println("Invalid input!");
				continue;
			}

			if (row1 >= rows || col1 >= cols || row2 >= rows || col2 >= cols) {
				System.out.println("Invalid input!");
				continue;
			}

			String temp = matrix[row1][col1];
			matrix[row1][col1] = matrix[row2][col2];
			matrix[row2][col2] = temp;

			printMatrix(matrix);
		}
	}

	private static void printMatrix(String[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			StringBuilder row = new StringBuilder();

			for (int j = 0; j < matrix[i].length; j++) {
				row.append(matrix[i][j]).append(" ");
			}

			System.out.println(row.toString().trim());
		}
	}
}