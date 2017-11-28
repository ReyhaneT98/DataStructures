package term3_29;

class Node {
	protected int data;
	protected Node next, prev;

	public Node() {
		next = null;
		prev = null;
		data = 0;
	}

	public Node(int d, Node n, Node p) {
		data = d;
		next = n;
		prev = p;
	}

	public void setLinkNext(Node n) {
		next = n;
	}

	public void setLinkPrev(Node p) {
		prev = p;
	}

	public Node getLinkNext() {
		return next;
	}

	public Node getLinkPrev() {
		return prev;
	}

	public void setData(int d) {
		data = d;
	}

	public int getData() {
		return data;
	}
}
// **************************************************************************

class linkedList {

	Node start;
	Node end;
	int size;

	public linkedList() {
		start = null;
		end = null;
		size = 0;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public int getSize() {
		return size;
	}

	// ******************************************************************************
	public void insert(int val) {
		Node nptr = new Node(val, null, null);
		if (start == null) {
			nptr.setLinkNext(nptr);
			nptr.setLinkPrev(nptr);
			start = nptr;
			end = start;
		} else {
			nptr.setLinkPrev(end);
			end.setLinkNext(nptr);
			start.setLinkPrev(nptr);
			nptr.setLinkNext(start);
			end = nptr;
		}
		size++;
	}
	// *****************************************************************************

	public void deleteAtPos(int pos) {
		if (pos == 1) {
			if (size == 1) {
				start = null;
				end = null;
				size = 0;
				return;
			}
			start = start.getLinkNext();
			start.setLinkPrev(end);
			end.setLinkNext(start);
			size--;
			return;
		}
		if (pos == size) {
			end = end.getLinkPrev();
			end.setLinkNext(start);
			start.setLinkPrev(end);
			size--;
		}
		Node ptr = start.getLinkNext();
		for (int i = 2; i <= size; i++) {
			if (i == pos) {
				Node p = ptr.getLinkPrev();
				Node n = ptr.getLinkNext();

				p.setLinkNext(n);
				n.setLinkPrev(p);
				size--;
				return;
			}
			ptr = ptr.getLinkNext();
		}
	}

	// **********************************************************************

	public void swapNodes() {

		Node a = start;
		Node p = end.getLinkPrev();
		start = end;
		end.setLinkPrev(a);
		end.setLinkNext(a.getLinkNext());
		a.setLinkPrev(p);
		a.setLinkNext(end);
		end.next.setLinkPrev(end);
		a.prev.setLinkNext(a);
		end = a;

	}

	// *****************************************************************************
	public void reverse() {
		Node ptr = end;
		System.out.print(end.next.getData() + " <-> ");
		System.out.print(ptr.getData() + " <-> ");
		while (ptr.getLinkPrev() != start) {
			ptr = ptr.getLinkPrev();
			System.out.print(ptr.getData() + " <-> ");

		}
		System.out.print(ptr.prev.getData() + "\n");

	}
	// *****************************************************************************

	public void display() {

		Node ptr = start;
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.getLinkNext() == start) {
			System.out.print(start.getData() + " <-> " + ptr.getData() + "\n");
			return;
		}
		System.out.print(start.getData() + " <-> ");
		ptr = start.getLinkNext();
		while (ptr.getLinkNext() != start) {
			System.out.print(ptr.getData() + " <-> ");
			ptr = ptr.getLinkNext();
		}
		System.out.print(ptr.getData() + " <-> ");
		ptr = ptr.getLinkNext();
		System.out.print(ptr.getData() + "\n");
	}

}

public class Rotary_2side_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		linkedList l = new linkedList();

		l.insert(100);
		l.insert(200);
		l.insert(300);
		l.insert(400);
		l.insert(500);
		l.display();
		l.deleteAtPos(2);
		l.display();
		l.swapNodes();
		l.display();
		l.reverse();

	}

}
