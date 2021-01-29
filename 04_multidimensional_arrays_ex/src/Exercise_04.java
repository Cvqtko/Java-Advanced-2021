import java.util.Arrays;
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
	
	}
}
