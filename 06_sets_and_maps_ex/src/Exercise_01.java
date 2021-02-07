import java.util.LinkedHashSet;
import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		LinkedHashSet<String> names = new LinkedHashSet<>();

		for (int i = 0; i < n; i++) {
			String name = scanner.nextLine();
			names.add(name);
		}

		names.forEach(e -> System.out.println(e));

		// another print solution
		//for (String name : names) {
		//	System.out.println(name);
		//}
	}
}
