import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

public class Exercise_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Function<String[], Stream<Integer>> map = arr -> Arrays.stream(arr).map(Integer::parseInt);
		String[] tokens = scanner.nextLine().split(", ");

		Function<Stream<Integer>, Integer> sum = stream -> stream.mapToInt(e -> e).sum();
		Function<Stream<Integer>, Long> count = str -> str.mapToInt(e -> e).count();

		System.out.println("Count = "+count.apply(map.apply(tokens)));
		System.out.println("Sum = "+sum.apply(map.apply(tokens)));
	}

}
