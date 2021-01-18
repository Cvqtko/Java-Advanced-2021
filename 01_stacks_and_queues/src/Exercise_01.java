import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		String current = "";
		ArrayDeque<String> browser = new ArrayDeque<>();

		while (!line.equals("Home")) {
			if (line.equals("back")) {
				if (!browser.isEmpty()) {
					current = browser.pop();
				} else {
					System.out.println("no previous URLs");
					line = scanner.nextLine();
					continue;
				}
			} else {
				if (!current.equals("")) {
					browser.push(current);
				}
				current = line;
			}
			System.out.println(current);
			line = scanner.nextLine();
		}

	}
}
