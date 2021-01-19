import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Exercise_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] firstLine = scanner.nextLine().split("\\s+");
		int n = Integer.parseInt(firstLine[0]);
		int s = Integer.parseInt(firstLine[1]);
		int x = Integer.parseInt(firstLine[2]);

		ArrayDeque<Integer> numbers = new ArrayDeque<>();
		Arrays.stream(scanner.nextLine().split("\\s+")).forEach(e -> numbers.push(Integer.parseInt(e)));

		for (int i = 0; i < s; i++) {
			numbers.pop();
		}
		if (numbers.isEmpty()) {
			System.out.println("0");
		} else {
			if (numbers.contains(x)) {
				System.out.println("true");
			} else {
//				System.out.println(numbers.stream().mapToInt(e->e).min().getAsInt());
				System.out.println(Collections.min(numbers));
			}
		}
	}
}
