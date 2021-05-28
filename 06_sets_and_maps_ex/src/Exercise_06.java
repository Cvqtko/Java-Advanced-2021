import java.util.LinkedHashMap;
import java.util.Scanner;

public class Exercise_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		LinkedHashMap<String, Integer> resourceAndQuantity = new LinkedHashMap<>();

		while (!line.equals("stop")) {
			int quantity = Integer.parseInt(scanner.nextLine());
			if (resourceAndQuantity.containsKey(line)) {
				int currentQuantity = resourceAndQuantity.get(line);
				resourceAndQuantity.put(line, currentQuantity + quantity);
			} else {
				resourceAndQuantity.put(line, quantity);
			}
			line = scanner.nextLine();
		}
		for (String resource : resourceAndQuantity.keySet()) {
			System.out.printf("%s -> %s\n", resource, resourceAndQuantity.get(resource));
		}
	}
}