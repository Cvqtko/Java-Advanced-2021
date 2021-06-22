package ex_05;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
	private List<T> elements;

	public Box() {
		this.elements = new ArrayList<>();
	}

	public void add(T element) {
		this.elements.add(element);
	}

	public void swap(int firstIndex, int secondIndex) {
		T firstElement = elements.get(firstIndex);
		T secondElement = elements.get(secondIndex);

		elements.set(firstIndex, secondElement);
		elements.set(secondIndex, firstElement);

	}
	
	public long countGreaterThan(T element) {
		
		return elements.stream().filter(e-> e.compareTo(element)>0).count();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (T element : elements) {
			sb.append(String.format("%s: %s", element.getClass().getName(), element)).append(System.lineSeparator());
		}
		return sb.toString();
	}

}
