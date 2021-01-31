import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercise_020 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		Set<String> allGuests = new TreeSet<>();

		while (!input.equals("PARTY")) {

			allGuests.add(input);

			input = scanner.nextLine();
		}
		input = scanner.nextLine();
		while (!input.equals("END")) {

			allGuests.remove(input);

			input = scanner.nextLine();
		}

		String output = (String.join(System.lineSeparator(), allGuests)).trim();

		System.out.println(allGuests.size());
		System.out.println(output);
	}
}
