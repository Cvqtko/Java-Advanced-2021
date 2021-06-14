import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
				.collect(Collectors.toList());

		Comparator<Integer> comparator = ((a, b) -> {
			if (a % 2 == 0 && b % 2 != 0) {
				return -1;
			} else if (a % 2 != 0 && b % 2 == 0) {
				return 1;
			} else if ((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0)) {
				if (a <= b) {
					return -1;
				} else {
					return 1;
				}
			} else {
				return 1;
			}

		});
		numbers.sort(comparator);
		numbers.stream().forEach(e -> System.out.print(e + " "));
	}
}
