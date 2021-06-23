package ex_10;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = 3;
		StringBuilder sb = new StringBuilder();
		Tuple tuple;
		while (n-- > 0) {
			String line = scanner.nextLine();
			String[] tokens = line.split("\\s+");
			tuple = null;
			String name;
			if (n == 2) {
				name = tokens[0] + " " + tokens[1];
				String address = tokens[2];
				tuple = new Tuple(name,address);
			} else if (n == 1) {
				name = tokens[0];
				int liters = Integer.parseInt(tokens[1]);
				tuple = new Tuple(name,liters);
			}else {
				int intParam = Integer.parseInt(tokens[0]);
				double doubleParam=  Double.parseDouble(tokens[1]);
				tuple = new Tuple(intParam,doubleParam);
			}
			sb.append(tuple.toString()).append(System.lineSeparator());
		}
		System.out.println(sb.toString());

	}

}
