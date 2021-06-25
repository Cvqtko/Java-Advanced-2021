package ex_06;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeSet<Person> sortByName = new TreeSet<>(new SortByName());
		TreeSet<Person> sortByAge = new TreeSet<>(new SortByAge());

		int n = Integer.parseInt(scanner.nextLine());
		while (n-- > 0) {

			String[] data = scanner.nextLine().split("\\s+");
			Person person = new Person(data[0], Integer.parseInt(data[1]));

			sortByName.add(person);
			sortByAge.add(person);
		}


			sortByName.forEach(p -> System.out.println(p));
			sortByAge.forEach(p -> System.out.println(p));
		}
	}


