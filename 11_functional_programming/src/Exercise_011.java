import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_011 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(e -> Integer.parseInt(e))
				.filter(e -> e % 2 == 0).toArray();

		List<Integer> nums = Arrays.stream(numbers).boxed().collect(Collectors.toList());

		nums.removeIf(e -> e % 2 != 0);
	}

}
