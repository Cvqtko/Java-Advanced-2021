package ex_06;

import java.util.Comparator;

public class SortByName implements Comparator<Person> {
	// Used for sorting in ascending order of
	// roll number
	public int compare(Person p1, Person p2) {

		int result = p1.getName().toLowerCase().charAt(0) - p2.getName().toLowerCase().charAt(0);

		if (result == 0) {
			// result = p2.getName().toLowerCase().charAt(0) -
			// p1.getName().toLowerCase().charAt(0);
			result = p1.getName().length() - p2.getName().length();
		}
		return result;
	}
}