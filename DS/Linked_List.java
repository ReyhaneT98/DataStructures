package term3_25_2;



class LinkedList {
	// ************************************************************************
	public class Node {
		Node next;

		int data;

		public Node(int _data) {
			this.next = null;
			this.data = _data;
		}

		public Node(int _data, Node _next) {
			this.next = _next;
			this.data = _data;
		}

		public int getData() {
			return data;
		}

		public void setData(int _data) {
			data = _data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node _next) {
			next = _next;
		}
	}

	// ---------------------------------------------------------------------
	Node head;
	Node end;

	public LinkedList() {
		this.head = null;
	}

	public LinkedList(Node head) {
		this.head = head;
	}

	// **********************************************************************
	public boolean isEmpty() {
		return head == null;
	}

	// **********************************************************************
	public void add(int data) {
		Node temp = new Node(data);

		if (head == null) {
			head = temp;
		} else {
			Node current = head;

			while (current.getNext() != null) {
				current = current.getNext();
			}

			current.setNext(temp);
		}
	}
	// **********************************************************************

	public void insertFirst(int a) // insert at front of

	{

		System.out.println();
		
		Node newLink = new Node(a); // make new link

		if (isEmpty()) // if empty list,

			end = newLink; // newLink <-- last

		newLink.next = head; // newLink --> old first

		head = newLink; // first --> newLink

	}

	// **********************************************************************
	public void rotateLeft() {
		System.out.println();
		System.out.println("<--");
		if (head != null) { // otherwise it is empty list
			Node temp = head;
			if (head.getNext() != null) { // otherwise it is single item list
				head = head.getNext();
			}

			Node tail;
			if (head.getNext() != null) {
				// more than 2 items in the list
				tail = head.getNext();
			} else {
				// only 2 items in the list
				tail = head;
			}
			while (tail.getNext() != null) {
				if (tail.getNext() != null) {
					tail = tail.getNext();
				}
			}
			tail.setNext(temp);
			temp.setNext(null);
		}

	}

	// -----------------------------------------------------------------------
	public void rotateRight() {
		System.out.println("-->");
		if (head != null) { // otherwise it is empty list
			Node tail = null;
			Node current = head;

			while (current.getNext() != null) {
				tail = current;
				current = current.getNext();
			}
			if (tail != null) { // otherwise it is single item list
				tail.setNext(null);
				current.setNext(head);
				head = current;
			}
		}
	}

	// *************************************************************************
	public void swapNodes(int x, int y) {
		// Nothing to do if x and y are same
		
		System.out.println();
		
		if (x == y)
			return;

		// Search for x (keep track of prevX and CurrX)
		Node prevX = null, currX = head;
		while (currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}

		// Search for y (keep track of prevY and currY)
		Node prevY = null, currY = head;
		while (currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}

		// If either x or y is not present, nothing to do
		if (currX == null || currY == null)
			return;

		// If x is not head of linked list
		if (prevX != null)
			prevX.next = currY;
		else // make y the new head
			head = currY;

		// If y is not head of linked list
		if (prevY != null)
			prevY.next = currX;
		else // make x the new head
			head = currX;

		// Swap next pointers
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}
	// *************************************************************************

	public void remove(int n) {
		
		System.out.println();
		
		Node current = head;
		while ((current.next.data) != n) {
			current = current.next;
		}
		current.next = current.next.next;
	}

	// *************************************************************************
	public void printList() {
		Node cursor = head;
		while (cursor != null) {
			System.out.printf(cursor.data + ", ");
			cursor = cursor.getNext();
		}
		System.out.println();
	}
	// **************************************************************************

}

public class Linked_List {

	public static void main(String[] args) {

		LinkedList r = new LinkedList();

		r.add(1);
		r.add(2);
		r.add(3);
		r.add(4);
		r.add(5);
		r.printList();
		r.swapNodes(2,5);
		r.printList();
		r.insertFirst(63);
		r.printList();
		r.rotateLeft();
		r.printList();
		r.remove(3);
		r.rotateRight();
		r.printList();

	}
}
