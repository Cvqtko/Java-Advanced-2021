package task_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		boolean gameEnd = false;
		char[][] matrix = new char[n][];

		String[] directions = scanner.nextLine().split(", ");
		fillMatrix(scanner, n, matrix);
		int[] start = getStart(matrix);
		int startX = start[1];
		int startY = start[0];
		int foods = start[2];
		int pythonLenght = 1;

		for (String direction : directions) {
			if (gameEnd) {
				break;
			}
			switch (direction) {
			case "left":
				startX--;
				if (startX < 0) {
					startX = n - 1;
				}
				if (gameEnd = checkForEnd(matrix, startX, startY, pythonLenght, foods)) {
					continue;
				}
				pythonLenght = feedPython(matrix, startX, startY, pythonLenght);

				break;
			case "down":
				startY++;
				if (startY > n - 1) {
					startY = 0;
				}
				if (gameEnd = checkForEnd(matrix, startX, startY, pythonLenght, foods)) {
					continue;
				}
				pythonLenght = feedPython(matrix, startX, startY, pythonLenght);

				break;
			case "right":
				startX++;
				if (startX > n - 1) {
					startX = 0;
				}
				if (gameEnd = checkForEnd(matrix, startX, startY, pythonLenght, foods)) {
					continue;
				}
				pythonLenght = feedPython(matrix, startX, startY, pythonLenght);

				break;
			case "up":
				startY--;
				if (startY < 0) {
					startY = n - 1;
				}
				if (gameEnd = checkForEnd(matrix, startX, startY, pythonLenght, foods)) {
					continue;

				}
				pythonLenght = feedPython(matrix, startX, startY, pythonLenght);

				break;
			}

		}

		if (!gameEnd) {
			if (pythonLenght == foods + 1) {
				System.out.printf("You win! Final python length is %d", pythonLenght);
			} else {
				System.out.printf("You lose! There is still %s food to be eaten.", (foods + 1 - pythonLenght));
			}
		}

	}

	private static boolean checkForEnd(char[][] matrix, int startX, int startY, int pythonLenght, int foods) {
		if (matrix[startY][startX] == 'e') {
			if (pythonLenght == foods + 1) {
				System.out.printf("You win! Final python length is %d", pythonLenght);
			} else {
				System.out.print("You lose! Killed by an enemy!");
			}
			return true;
		}
		return false;
	}

	private static int feedPython(char[][] matrix, int startX, int startY, int pythonLenght) {
		if (matrix[startY][startX] == 'f') {
			pythonLenght++;
			matrix[startY][startX] = '*';
		}
		return pythonLenght;
	}

	private static int[] getStart(char[][] matrix) {
		int[] start = new int[3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 's') {
					start[0] = i;
					start[1] = j;
				}
				if (matrix[i][j] == 'f') {
					start[2]++;
				}
			}
		}
		return start;
	}

	private static void fillMatrix(Scanner scanner, int n, char[][] matrix) {
		for (int i = 0; i < n; i++) {
			String[] line = scanner.nextLine().split("\\s+");
			char[] row = new char[line.length];
			for (int j = 0; j < line.length; j++) {
				row[j] = line[j].charAt(0);
			}
			matrix[i] = row;
		}
	}
}
