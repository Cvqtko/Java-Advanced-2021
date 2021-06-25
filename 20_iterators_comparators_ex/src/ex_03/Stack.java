package ex_03;

import java.util.Iterator;

public class Stack<Integer> implements Iterable<Integer> {

	private Node<Integer> top;

	public Stack() {
		this.top = null;
	}

	public void push(int newElement) {
		Node<Integer> newNode = new Node<Integer>(newElement);
		newNode.prev = this.top;
		this.top = newNode;
	}

	public int pop() throws Exception {
		if (this.top == null) {
			throw new Exception("No elements");

		} else {
			Node<Integer> currentTop = this.top;
			this.top = this.top.prev;
			return currentTop.element;
		}

	}

	private class Node<Integer> {
		public int element;
		public Node<Integer> prev;

		public Node(int element) {
			this.element = element;
			this.prev = null;
		}
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {
			private Node<Integer> current = top;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public Integer next() {
				int currentValue = current.element;
				this.current = this.current.prev;
				return (Integer) java.lang.Integer.valueOf(currentValue);
			}

		};
	}

}
