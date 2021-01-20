import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		ArrayDeque<String> previousCommands = new ArrayDeque<>();

		String text = "";

		for (int i = 0; i < n; i++) {
			String[] commands = scanner.nextLine().split("\\s+");

			switch (commands[0]) {
			case "1":
				previousCommands.push(text);
				text += commands[1];
				break;
			case "2":
				previousCommands.push(text);
				text = text.substring(0, text.length() - Integer.parseInt(commands[1]));
				break;
			case "3":
				System.out.println(text.charAt(Integer.parseInt(commands[1]) - 1));
				break;
			case "4":
				text = previousCommands.pop();
				break;
			}
		}
	}
}
