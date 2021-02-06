import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedHashMap<Double, Integer> result = new LinkedHashMap<>();
		Double[] input = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).toArray(Double[]::new);
		for (Double number : input) {

			if (!result.containsKey(number)) {

				result.put(number, 1);

			} else {

				result.put(number, result.get(number) + 1);

			}

		}

		for (Double key : result.keySet()) {

			System.out.println(key + " -> " + result.get(key));

		}
	}
}
