import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayDeque<String> numbers = new ArrayDeque<>();
		Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e -> numbers.push(e));

		numbers.forEach(num -> System.out.print(numbers.pop()+" "));
	}
}
