import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfStudents = Integer.parseInt(scanner.nextLine());
		TreeMap<String, Double[]> graduationList = new TreeMap<>();

		for (int i = 0; i < numberOfStudents; i++) {

			String name = scanner.nextLine();

			String[] scoresStrings = scanner.nextLine().split(" ");

			Double[] scores = new Double[scoresStrings.length];

			for (int j = 0; j < scoresStrings.length; j++) {

				scores[j] = Double.parseDouble(scoresStrings[j]);

			}

			graduationList.put(name, scores);

		}
		graduationList.forEach((key, value) -> {
			Double sum = 0.0;
			for (Double e : value) {
				sum += e;
			}
			Double average = sum / value.length;
			BigDecimal b1 = new BigDecimal(average);
			System.out.println(key + " is graduated with " + b1.stripTrailingZeros());
		});
	}
}
