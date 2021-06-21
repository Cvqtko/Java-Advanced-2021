import java.util.ArrayList;
import java.util.function.Predicate;

public class FilterNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);

		Predicate<Integer> isEven = x -> x % 2 == 0;
		
		numbers.stream().filter(isEven).forEach(e->System.out.println(e));;
	}
}
