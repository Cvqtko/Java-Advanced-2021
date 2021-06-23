package ex_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = 3;
		StringBuilder sb = new StringBuilder();
		Threeuple tuple = null;
		while (n-- > 0) {
			String line = reader.readLine();
			String[] tokens = line.split("\\s+");
			String name;
			if (n == 2) {
				name = tokens[0] + " " + tokens[1];
				String address = tokens[2];
				String town = tokens[3];
				tuple = new Threeuple(name, address, town);
			} else if (n == 1) {
				name = tokens[0];
				int liters = Integer.parseInt(tokens[1]);
				boolean drunkOrNot = "drunk".equals(tokens[2]) ? true : false;
				tuple = new Threeuple(name, liters, drunkOrNot);
			} else {
				name = tokens[0];
				double balance = Double.parseDouble(tokens[1]);
				String bankName = tokens[2];
				tuple = new Threeuple(name, balance, bankName);
			}
			sb.append(tuple.toString());
			sb.append(System.lineSeparator());
		}
		System.out.println(sb.toString());

	}

}
