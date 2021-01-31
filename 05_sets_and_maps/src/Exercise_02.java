import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercise_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		Set<String> vips = new TreeSet<>();
		Set<String> regulars = new TreeSet<>();
		while (!input.equals("PARTY")) {
			if (Character.isDigit(input.charAt(0))) {
				vips.add(input);
			} else {
				regulars.add(input);
			}
			;
			input = scanner.nextLine();
		}
		input = scanner.nextLine();
		while (!input.equals("END")) {
			if (Character.isDigit(input.charAt(0))) {
				vips.remove(input);
			} else {
				regulars.remove(input);
			}
			;
			input = scanner.nextLine();
		}

		String output = (String.join(System.lineSeparator(), vips) + System.lineSeparator()
				+ String.join(System.lineSeparator(), regulars)).trim();

		System.out.println(vips.size() + regulars.size());
		System.out.println(output);
	}
}
