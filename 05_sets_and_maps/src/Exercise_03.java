import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Set<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed()
				.collect(Collectors.toCollection(LinkedHashSet::new));
		String input = scanner.nextLine();
		
		Set<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toCollection(LinkedHashSet::new));
	}
}
