import java.util.Scanner;
import java.util.function.Consumer;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		String[] names = input.split("\\s+");

		Consumer<String[]> pringString = array -> {
			for (int index = 0; index < array.length; index++) {
				System.out.println(array[index]);
			}
			//for(String name: names){
				//System.out.println(name);
			//}
		};
		pringString.accept(names);
	}
}
