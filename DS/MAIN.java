package term3_36;

import java.util.ArrayList;
import java.util.List;

class NodeList {
	int id;
	NodeList nextnode;
	Node node;
	NodeList First;

	// --------------------------------------------------------------------------

	public void counter(int i) {
		NodeList first= new  NodeList();
		first.id=i;

		NodeList c = first;
		while (c != null) {
			
				Node d = c.node;
				int cun = 0;
				while (d != null) {
					cun++;
					d = d.next;
				}
			

			System.out.println("number of mane " + (c.id) + " is : " + cun);

			c = c.nextnode;
		}

	}

	// ----------------------------------------------------------------------------

	public void Sink() {

		List<NodeList> sinks = new ArrayList<>();

		NodeList c = First;
		while (c != null) {
			if (c.node != null) {
				Node d = c.node;
				while (d != null) {
					sinks.Add(d.item);
					d = d.next;
				}
			} else {
				sinks.Remove(c.id);
			}
			c = c.nextnode;
		}

		System.out.println("Source nodes are :");
		for (NodeList item : sinks) {
			System.out.println(item.toString() + "\t");
		}

	}

	// ----------------------------------------------------------------------------

	public void Source() {
		int[] sources = new int[10];
		int i = 0;
		NodeList c = First;
		while (c != null) {
			if (c.node == null) {
				sources[i] = c.id;
				i++;
			}
			c = c.nextnode;
		}
		System.out.println("Source nodes are :");
		for (int item : sources) {
			System.out.println(item + "\t");
		}
	}

	// -----------------------------------------------------------------------------

	public void Add(int i, int j) {

		NodeList c = First;

		while (c != null) {
			if (c.id == i) {
				c.node = new Node();
				c.node.item = j;
			}
			c = c.nextnode;}

	}
	// -------------------------------------------------------------------------------

	public int Remove(int i, int j) {

		NodeList c = First;
		while (c != null) {
			if (c.id == i) {
				Node d = c.node;
				Node d2 = d;
				while (d != null) {
					if (d.item == j) {
						d2.next = d.next;
					}
					d2 = d;
					d = d.next;}
			}
			c = c.nextnode;
		}
		return i;}
	}

// ****************************************************************************

class Node {
	int item;
	Node next;
}

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
	
	
	}

}
