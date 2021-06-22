import java.util.Scanner;
import java.util.function.Predicate;

public class Exercise_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] tokens = scanner.nextLine().split("\\s+");

		int lower = Integer.parseInt(tokens[0]);
		int upper = Integer.parseInt(tokens[1]);
		String oddOrEven = scanner.nextLine();

		Predicate<Integer> filter = x -> {
			if (oddOrEven.equals("odd")) {
				return x % 2 != 0;
			}
			return x % 2 == 0;
		};
		for (int i = lower; i <= upper; i++) {
			if (filter.test(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
