import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int countCommands = Integer.parseInt(scanner.nextLine());
		ArrayDeque<Integer> stack = new ArrayDeque<>();

		for (int i = 0; i < countCommands; i++) {
			String[] commands = scanner.nextLine().split("\\s+");

			String command = commands[0];

			switch (command) {
			case "1":
				int number = Integer.parseInt(commands[1]);
				stack.push(number);
				break;
			case "2":
				stack.pop();
				break;
			case "3":
				System.out.println(Collections.max(stack));
				break;
			}
		}
	}
}
