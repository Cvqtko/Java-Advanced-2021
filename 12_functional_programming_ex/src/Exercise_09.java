import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

public class Exercise_09 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());
		if (n < 0) {
			return;
		}
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		Integer[] divisors = Arrays.stream(reader.readLine().split("\\s+")).map(Integer::parseInt)
				.toArray(Integer[]::new);

		Predicate<Integer> check = (i) -> {
			for (Integer a : divisors) {
				if (a == 0)
					continue;
				if (i % a != 0)
					return false;
			}
			return true;
		};

		StringBuilder builder = new StringBuilder();

		for (Integer i : arr)
			if (check.test(i))
				builder.append(i + " ");
		System.out.println(builder.toString());
	}
}