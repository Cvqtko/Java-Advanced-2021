package ex_09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		LinkedList<Integer> list = new LinkedList<Integer>();
		while (n-- > 0) {
			String[] tokens = scanner.nextLine().split("\\s+");

			switch (tokens[0]) {
			case "Add":
				list.add(Integer.parseInt(tokens[1]));
				break;
			case "Remove":
				list.remove(Integer.parseInt(tokens[1]));
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(list.getSize()).append(System.lineSeparator());

		for (int i = 0; i < list.getSize(); i++) {
			sb.append(list.elementAt(i)).append(" ");
		}
		System.out.println(sb.toString());
	}

}
