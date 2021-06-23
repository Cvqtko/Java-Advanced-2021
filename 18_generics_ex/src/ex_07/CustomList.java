package ex_07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {
//	•	void add(T element)
//	•	T remove(int index)
//	•	boolean contains(T element)
//	•	void swap(int index, int index)
//	•	int countGreaterThan(T element)
//	•	T getMax()
//	•	T getMin()

	private List<T> elements;

	public CustomList() {
		this.elements = new ArrayList<>();
	}

	public void add(T element) {
		this.elements.add(element);
	}

	public T remove(int index) {
		return this.elements.remove(index);
	}

	public boolean contains(T element) {
		return this.elements.contains(element);
	}

	public void swap(int index1, int index2) {
		T element1 = this.elements.get(index1);
		T element2 = this.elements.get(index2);
		this.elements.set(index1, element2);
		this.elements.set(index2, element1);
	}

	public int countGreaterThan(T element) {
		return (int) elements.stream().filter(e -> e.compareTo(element) > 0).count();
	}

	public T getMax() {
		return this.elements.stream().max((a, b) -> a.compareTo(b)).get();
	}

	public T getMin() {
		return this.elements.stream().min((a, b) -> a.compareTo(b)).get();
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private int index = 0;
			
			@Override
			public boolean hasNext() {
				return index< elements.size();
			}
			@Override
			public T next() {
				return elements.get(index++);
			}
		};
	}
}
