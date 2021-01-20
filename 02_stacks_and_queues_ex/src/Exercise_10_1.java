import java.util.Scanner;
import java.util.stream.Stream;

public class Exercise_10_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfPlants = Integer.parseInt(input.nextLine());
		int[] plantsArr = Stream.of(input.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		input.close();

		System.out.println(simulateDays(plantsArr));
	}

	static int simulateDays(int[] plants) {
		if (plants.length <= 1)
			return 0;
		int plantSize = plants.length, days = 0, i, lastDying = 1;
		while (true) { // simulate as many days as needed
			// Search for first plant to die today
			for (i = lastDying; i < plantSize; ++i) {
				if (plants[i - 1] < plants[i])
					break;
			}
			if (i == plantSize)
				return days; // no plant found to be dying
			lastDying = i; // optimize the initial search next day
			int removed = 1; // the one found (plants[i]) will die
			// Now search remaining plants for any other dying today and also remove all of
			// them
			for (++i; i < plantSize; ++i) {
				if (plants[i - 1] < plants[i]) { // plant[i] dies, count+skip it.
					++removed;
				} else { // plant[i] survives, move it to last living one
					plants[i - removed] = plants[i];
				}
			}
			plantSize -= removed; // adjust total number of remaining plants
			++days; // let's see another day
		}
	}
}
