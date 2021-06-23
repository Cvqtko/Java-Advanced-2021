package ex_07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		CustomList<String> list = new CustomList<String>();

		while (!line.equals("END")) {

//			•	Add <element> - Adds the given element to the end of the list
//			•	Remove <index> - Removes the element at the given index
//			•	Contains <element> - Prints if the list contains the given element (true or false)
//			•	Swap <index> <index> - Swaps the elements at the given indexes
//			•	Greater <element> - Counts the elements that are greater than the given element and prints their count
//			•	Max - Prints the maximum element in the list
//			•	Min - Prints the minimum element in the list
//			•	Print - Prints all elements in the list, each on a separate line
//			•	END - stops the reading of commands
			String[] tokens = line.split("\\s+");
			String command = tokens[0];
			
			switch (command) {
			case "Add":
				list.add(tokens[1]);
				break;
			case "Remove":
				int removedIndex = Integer.parseInt(tokens[1]);
				System.out.println(list.remove(removedIndex));
				break;
			case "Contains":
				String element = tokens[1];
				System.out.println(list.contains(element));
				break;
			case "Swap":
				int firstIndex = Integer.parseInt(tokens[1]);
				int secondIndex = Integer.parseInt(tokens[2]);	
				list.swap(firstIndex, secondIndex);
				break;
			case "Greater":
				String elementGreater = tokens[1];
				System.out.println(list.countGreaterThan(elementGreater));
				break;
			case "Max":
				System.out.println(list.getMax());
				break;
			case "Min":
				System.out.println(list.getMin());
				break;
			case "Print":
				for (String el : list) {
					System.out.println(el);
				}
				break;
			}

			line = scanner.nextLine();
		}
	}

}
