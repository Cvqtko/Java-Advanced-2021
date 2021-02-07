import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		TreeSet<String> chemicalElements = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			String[] elements = scanner.nextLine().split("\\s+");
			chemicalElements.addAll(Arrays.asList(elements));

		}
		System.out.println(String.join(" ", chemicalElements));
	}
}
