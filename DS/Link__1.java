package term3_23_2;

import java.util.Scanner;

class LinkedList {

	public class Node {

		Node next;
		Node n;
		Node before ;
		Node after ;
		int number;

		public Node(int num) {

			this.number = num;
			this.next = null;
		}

		public Node(int num, Node n) {

			this.n = n;
			this.number = num;
			this.next = null;
			this.before=null;
			this.after=first;
		}

		void print() {
			System.out.println(this.number);
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node num) {
			next = num;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}
		

	}

	public Node first;
	private Node current;

	public LinkedList() {
		this.first = null;
		this.current = null;

	}

	public boolean hasNext() {
		return (current != null && current.next != null);
	}

	public void add(int num) {
		Node p = new Node(num);
		if (first == null) {
			first = p;

		} else {
			Node current = first;
			while (current.next != null) {
				current = current.next;
			}

			current.next = p;
		}
	}

	public void remove(int n) {
		Node current = first;
		while ((current.next.number) != n) {
			current = current.next;
		}
		current.next = current.next.next;
	}

	public void printListFromEnd() {
		Node last = null;
		Node current = null;
		while (last != first) {
			current = first;
			while (current.next != null && current.next != last) {
				current = current.next;
			}
			last = current;
			last.print();
		}
	}

public void insertItems(int num) throws Exception {
		
		Node before = null;
		Node after = first;

		Node p = new Node(num);

		if (first == null)
			{
				first = p;
				p.next = first;
			}

		else if (first.number > p.number){
			
			while(before.next !=null)
			{
				before = before.next;
			}
			
			
			before.next=p;
			while(first !=p)
			{
				first = first.next;
			}
			
		}
		else {

			while (after.number < p.number ) {

				before = after;
				after = after.next;

			}
			
			p.next = after;
			before.next = p;
			 
			if (after == first) {

				
				after = null;
			}
				
		}

		
		
	}
	
	public void ReversePrint(Node p) { 
		if (p.next == null)
			System.out.print(p.number + "\t");
		else {
			ReversePrint(p.next);
			System.out.printf(p.number + "\t");
		}
	}

	public void printTwobyTwo() {

		Node current = first;
		while (current != null) {
			current.print();
			current = current.next;
			if (current != null)
				current = current.next;
		}

	}

}

public class Link__1 {

	public static void main(String[] args) throws Exception {
		char ch;
		Scanner input = new Scanner(System.in);
		LinkedList link = new LinkedList();

		do {

			System.out.println("\nOperations ---> ");
			System.out.println("1. add");
			System.out.println("2. printListFromEnd");
			System.out.println("3. add item");
			System.out.println("4. remove");
			System.out.println("5. printTwobyTwo");

			int choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.printf("enter number for add : ");
				int a1 = input.nextInt();
				link.add(a1);
				break;

			case 2:
				System.out.println("printing list from end : ");
				link.printListFromEnd();
				break;

			case 3:
				System.out.printf("enter item for add : ");
				int a2 = input.nextInt();
				link.insertItems(a2);
				link.ReversePrint(link.first);
				System.out.println();
				break;

			case 4:
				System.out.printf("enter number for remove : ");
				int a3 = input.nextInt();
				link.remove(a3);
				link.printListFromEnd();
				break;

			case 5:
				System.out.println("printing Two by Two : ");
				link.printTwobyTwo();
				break;

			}

			System.out.printf("if you continue enter 'y' else 'n' :");
			ch = input.next().charAt(0);
			if(ch == 'n')
				System.err.println("end");

		} while (ch == 'y');

		

	}

}
