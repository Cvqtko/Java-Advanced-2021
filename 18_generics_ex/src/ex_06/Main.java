package ex_06;
import java.util.Scanner;


public class Main {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int n = Integer.parseInt(scanner.nextLine());
			Box<Double> box = new Box<Double>();

			while (n-- > 0) {
				double number = Double.parseDouble(scanner.nextLine());
				box.add(number);

			}
			double condition = Double.parseDouble(scanner.nextLine());
			
			System.out.println(box.countGreaterThan(condition));
		}

	}
