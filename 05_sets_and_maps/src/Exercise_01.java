import java.util.LinkedHashSet;
import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

		while (!input.equals("END")) {

			String[] tokens = input.split(", ");

			String command = tokens[0];
			String regNumber = tokens[1];
			if (command.equals("IN")) {
				parkingLot.add(regNumber);
			} else {
				parkingLot.remove(regNumber);
			}
			input = scanner.nextLine();
		}

		String output = String.join(System.lineSeparator(), parkingLot);
		if (output.isEmpty()) {
			output = "Parking Lot is Empty";
		}
		System.out.println(output);

	}
}
