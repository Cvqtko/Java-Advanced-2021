import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercise_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		List<Integer> numbers = Arrays.stream(input.split("\\s+")).mapToInt(e -> Integer.parseInt(e)).boxed()
				.collect(Collectors.toList());

		int n = Integer.parseInt(scanner.nextLine());

		Collections.reverse(numbers);

		Predicate<Integer> checkDivision = number -> number % n == 0;
		numbers.removeIf(checkDivision);
		// numbers.removeIf(number -> number % n == 0);
		
		Consumer<List<Integer>> print = array -> array.forEach(e -> System.out.print(e + " "));
		print.accept(numbers);
	}
}
