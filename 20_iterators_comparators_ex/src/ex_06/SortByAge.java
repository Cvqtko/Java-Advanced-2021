package ex_06;

import java.util.Comparator;

public class SortByAge implements Comparator<Person> {
	// Used for sorting in ascending order of
	// roll number
	public int compare(Person p1, Person p2) {
		return p1.getAge() - p2.getAge();
		
	}
}