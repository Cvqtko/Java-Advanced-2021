import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Exercise_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		LinkedHashMap<String, Integer> people = new LinkedHashMap<>();

		while (n-- > 0) {
			String[] tokens = scanner.nextLine().split(", ");
			String name = tokens[0];
			int age = Integer.parseInt(tokens[1]);
			people.put(name, age);
		}

		String ageCondition = scanner.nextLine();
		int age = Integer.parseInt(scanner.nextLine());
		String format = scanner.nextLine();
		
		Predicate<Map.Entry<String,Integer>> ageFilter = e -> {
			if (ageCondition.equals("older")) {
				return e.getValue() >= age;
			} else {
				return e.getValue() <= age;
			}
		};
		
		Consumer<Map.Entry<String,Integer>> formatter = e -> {
			if (format.equals("name")) {
				System.out.println(e.getKey());
			} else if (format.equals("age")) {
				System.out.println(e.getValue());
			} else {
				System.out.println(e.getKey() + " - " + e.getValue());

			}
		};

		people.entrySet().stream().filter(ageFilter).forEach(formatter);

}

}
