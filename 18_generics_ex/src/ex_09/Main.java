package ex_09;

import java.util.Scanner;

public class Main {


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			CustomList<String> list = new CustomList<String>();

			while (!line.equals("END")) {


				String[] tokens = line.split("\\s+");
				String command = tokens[0];
				
				switch (command) {
				case "Add":
					list.add(tokens[1]);
					break;
				case "Remove":
					int removedIndex = Integer.parseInt(tokens[1]);
					list.remove(removedIndex);
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
				case "Sort":
					Sorter.sort(list);
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
