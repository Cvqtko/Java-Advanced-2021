import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		LinkedHashMap<String, String> nameEmails = new LinkedHashMap<>();

		while (!"stop".equals(line)) {
			String email = scanner.nextLine();
			if (email.toLowerCase().endsWith(".us") || email.toLowerCase().endsWith(".uk") || email.toLowerCase().endsWith(".com")) {
				line = scanner.nextLine();
				continue;
			}
			nameEmails.put(line, email);
			line = scanner.nextLine();
		}

		for (Entry<String, String> entry : nameEmails.entrySet()) {

			System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
		}
	}

}
