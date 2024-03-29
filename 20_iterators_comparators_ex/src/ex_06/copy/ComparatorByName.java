package ex_06.copy;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {
	@Override
	public int compare(Person first, Person second) {
		int result = Integer.compare(first.getName().length(), second.getName().length());
		return result != 0 ? result
				: Integer.compare(first.getName().toLowerCase().charAt(0), second.getName().toLowerCase().charAt(0));
	}
}