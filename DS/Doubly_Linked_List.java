package term3_27;

class Linked_List {

	private class Node {

		Node next;
		Node previous;
		int data;

	}

	// ---------------------------------------------------------------------------
	private Node first;
	private Node current;
	private Node last;

	public Linked_List() {
		this.first = null;
		this.last = null;
		this.current = null;
	}

	// *****************************************************************************

	public void add(int o) {

		Node newNode = new Node();
		newNode.data = o;
		if (first == null) {
			first = newNode;
			last = newNode;
			newNode.next = null;

		} else if (first != null) {
			if (current == null) {
				newNode.previous = null;
				newNode.next = first;
				first.previous = newNode;
				first = newNode;
			} else if (current == last) {
				newNode.previous = current;
				newNode.next = null;
				current.next = newNode;
				last = newNode;
			} else {
				newNode.previous = current;
				newNode.next = current.next;
				current.next.previous = newNode;
				current.next = newNode;
			}
		}
		current = newNode;

	}
	// **********************************************************************

	public void delete(final int index) {
		Node tmpNode = first;
		Node prevNode = null;

		while (tmpNode != null) {

			if (tmpNode.data == index) {
				if (tmpNode == first) {
					first = first.next;
				} else {
					prevNode.next = tmpNode.next;
				}

			} else {
				prevNode = tmpNode;
			}
			tmpNode = tmpNode.next;
		}

	}
	// **************************************************************************

	public void printList() {
		Node cursor = first;
		while (cursor != null) {
			System.out.printf(cursor.data + "\t");
			cursor = cursor.next;
		}
		System.out.println("\n");
	}

}

// ************************************************************************************
public class Doubly_Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Linked_List a = new Linked_List();

		a.add(30);
		a.add(70);
		a.add(40);
		a.add(50);
		a.printList();
		a.delete(30);
		a.printList();

	}

}
