package ex_05;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		Box<String> box = new Box<String>();

		while (n-- > 0) {
			String line = scanner.nextLine();
			box.add(line);

		}
		String condition = scanner.nextLine();
		
		System.out.println(box.countGreaterThan(condition));
	}

}
