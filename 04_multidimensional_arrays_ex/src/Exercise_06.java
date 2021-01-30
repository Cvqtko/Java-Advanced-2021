import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Exercise_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String rotation = scanner.nextLine();
		int angleRotation = Integer.parseInt(rotation.split("[()]")[1]) % 360;

		String input = scanner.nextLine();
		ArrayList<String> linesForMatrix = new ArrayList<String>();
		int maxLenght = input.length();
		while (!input.equals("END")) {
			linesForMatrix.add(input);
			input = scanner.nextLine();
			if (input.length() > maxLenght) {
				maxLenght = input.length();
			}
		}

		int rows = linesForMatrix.size();
		int cols = maxLenght;

		char[][] matrix = new char[rows][cols];

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (col < linesForMatrix.get(row).length()) {
					matrix[row][col] = linesForMatrix.get(row).charAt(col);
				} else {
					matrix[row][col] = ' ';

				}
			}
		}
		if (angleRotation == 90) {
			for (int col = 0; col < cols; col++) {
				for (int row = rows - 1; row >= 0; row--) {
					System.out.print(matrix[row][col]);
				}
				System.out.println();
			}
		} else if (angleRotation == 180) {
			for (int row = rows - 1; row >= 0; row--) {
				for (int col = cols - 1; col >= 0; col--) {
					System.out.print(matrix[row][col]);
				}
				System.out.println();
			}
		} else if (angleRotation == 270) {
			for (int col = cols - 1; col >= 0; col--) {
				for (int row = 0; row < rows; row++) {
					System.out.print(matrix[row][col]);
				}
				System.out.println();
			}

		} else {
			for (int row = 0; row < matrix.length; row++) {

				for (int col = 0; col < matrix[row].length; col++) {
					System.out.print(matrix[row][col]);
				}
				System.out.println();
			}
		}
	}
}
