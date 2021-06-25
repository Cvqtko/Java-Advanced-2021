package ex_09;

import java.util.Iterator;

public class LinkedList<T> {
	private class Node<T> {
		T element;
		Node next;

		Node(T element, Node prevNode) {
			this.element = element;
			prevNode.next = this;
		}

		Node(T element) {
			this.element = element;
			next = null;
		}
	}

	private Node head;
	private Node tail;
	private int count;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.count = 0;
	}

	public void add(T item) {
		if (head == null) {
// We have empty list
			head = new Node(item);
			tail = head;
		} else {
// We have non-empty list
			Node newNode = new Node(item, tail);
			tail = newNode;
		}
		count++;
	}

	public int remove(T item) {
		// Find the element containing searched item
		int currentIndex = 0;
		Node currentNode = head;
		Node prevNode = null;
		while (currentNode != null) {
			if ((currentNode.element != null && currentNode.element.equals(item))
					|| (currentNode.element == null) && (item == null)) {
				break;
			}
			prevNode = currentNode;
			currentNode = currentNode.next;
			currentIndex++;
		}
		if (currentNode != null) {
			// Element is found in the list. Remove it
			count--;
			if (count == 0) {
				head = null;
				tail = null;
			} else if (prevNode == null) {
				head = currentNode.next;
			} else {
				prevNode.next = currentNode.next;
			}
			return currentIndex;
		} else {
			// Element is not found in the list
			return -1;
		}
	}

	public Object elementAt(int index) {
		if (index >= count || index < 0) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}
		Node currentNode = this.head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		return currentNode.element;
	}

	/**
	 * @return the actual list length
	 */
	public int getSize() {
		return count;
	}

}