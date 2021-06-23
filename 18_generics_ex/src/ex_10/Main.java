package ex_10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 3;
		StringBuilder sb = new StringBuilder();
		while (n-- > 0) {
			String line = scanner.nextLine();
			String[] tokens = line.split("\\s+");
			Tuple tuple = null;
			if (tokens.length > 2) {
				String name = tokens[0] + " " + tokens[1];
				String address = tokens[2];
				tuple = new Tuple(name, address);
			}else {
				String name = tokens[0];
				String number = tokens[1];
				tuple = new Tuple(name, number);
			}
			sb.append(tuple.toString()).append(System.lineSeparator());
		}
		System.out.println(sb.toString());
	}

}
