package ex_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = 3;
		StringBuilder sb = new StringBuilder();
		Tuple tuple = null;
		while (n-- > 0) {
			String line = reader.readLine();
			String[] tokens = line.split("\\s+");
			String name;
			if (n == 2) {
				name = tokens[0] + " " + tokens[1];
				String address = tokens[2];
				tuple = new Tuple(name, address);
			} else if (n == 1) {
				name = tokens[0];
				int liters = Integer.parseInt(tokens[1]);
				tuple = new Tuple(name, liters);
			} else {
				int intParam = Integer.parseInt(tokens[0]);
				double doubleParam = Double.parseDouble(tokens[1]);
				tuple = new Tuple(intParam, doubleParam);
			}
			sb.append(tuple.toString());
			sb.append(System.lineSeparator());
		}
		System.out.println(sb.toString());

	}

}
