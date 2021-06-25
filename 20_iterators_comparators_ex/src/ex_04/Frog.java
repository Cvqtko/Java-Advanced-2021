package ex_04;

import java.util.Iterator;
import java.util.List;

public class Frog implements Iterator<Integer> {
	private List<Integer> elements;
	private int cursor;

	public Frog(List<Integer> elements) {
		this.elements = elements;
		cursor = elements.size() == 0 ? 0 : -2;
	}

	private boolean isEvenCursor() {
		return cursor % 2 == 0;
	}

	@Override
	public boolean hasNext() {
		if (isEvenCursor() && elements.size() > 2) {
			return true;
		} else if (!isEvenCursor() && elements.size() > 2) {
			return cursor < elements.size() - 2;
		} else {
			return cursor < elements.size() - 1;
		}
	}

	@Override
	public Integer next() {
		cursor += 2;

		if (cursor > elements.size() - 1) {
			cursor = 1;
		}

		return elements.get(cursor);
	}
}