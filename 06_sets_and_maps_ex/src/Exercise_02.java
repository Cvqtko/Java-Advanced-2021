import java.util.LinkedHashSet;
import java.util.Scanner;

public class Exercise_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int firstSetSize = scanner.nextInt();

		int secondSetSize = scanner.nextInt();
		// second way of reading input
		// String input = scanner.nextLine();
		// int firstSetSize = Integer.parseInt(input.split(" ")[0]]);
		// int secondSetSize = Integer.parseInt(input.split(" ")[1]]);
		scanner.nextLine();

		LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
		LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

		for (int i = 0; i < firstSetSize; i++) {
			int number = Integer.parseInt(scanner.nextLine());
			firstSet.add(number);
		}
		for (int i = 0; i < secondSetSize; i++) {
			int number = Integer.parseInt(scanner.nextLine());
			secondSet.add(number);
		}

		firstSet.retainAll(secondSet);
		firstSet.forEach(e -> System.out.print(e + " "));
	}
}
