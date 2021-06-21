import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(e -> Integer.parseInt(e))
				.filter(e -> e % 2 == 0).toArray();

		String evenNumbers = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining(", "));
		System.out.println(evenNumbers);
		
		String sortedNumbers = Arrays.stream(numbers).sorted().mapToObj(String::valueOf).collect(Collectors.joining(", "));
		System.out.println(sortedNumbers);
	}

}
