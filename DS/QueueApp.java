package term3_19;
import java.lang.reflect.Array;
import java.util.Scanner;



class Queue {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;

	// --------------------------------------------------------------
	public Queue(int s) {
		maxSize = s;
		queArray = new long[maxSize];
		front = 0;
		rear = front;

	}

	// --------------------------------------------------------------
	public void insert(long j) throws Exception {
		if (!isFull()) {
			queArray[front] = j;
			front++;

		} else
			throw new Exception("Queue is full");
	}

	// --------------------------------------------------------------
	public long remove() throws Exception {
		long temp=0;
		if (!isEmpty()) {
			 temp= queArray[rear ];
			queArray[rear] = 0;
			rear++;
		}
		return temp;	
	}
	// --------------------------------------------------------------
	public long peek() throws Exception {
		long temp=0;
		if (!isEmpty()) {
			 temp = queArray[rear];
			
		} 
		return temp;
	}

	// --------------------------------------------------------------
	public boolean isEmpty() {
		return (front == rear);
	}

	// --------------------------------------------------------------
	public boolean isFull() {
		return (front == maxSize && rear == 0);
	}

	// --------------------------------------------------------------
	public int size() {
		return (front - rear) - 1;
	}

	// --------------------------------------------------------------
	public void printall() {

		for (int i = rear; i < front; i++)
			System.out.println(queArray[i]);

	}

}



public class QueueApp {
	
	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);

		System.out.printf("please enter length of first queue : ");
		int n = input.nextInt();
		Queue q1 = new Queue(n);

		System.out.printf("please enter length of second queue : ");
		int m = input.nextInt();
		Queue q2 = new Queue(m);

		int[] arr1 = new int[n];
		int[] arr2 = new int[m];

		// -------------------------------------------------------------------

		System.out.println("please enter elements of first queue :");
		for (int i = 0; i < n; i++) {
			arr1[i] = input.nextInt();
			q1.insert(arr1[i]);
		}

		System.out.println("please enter elements of second queue :");

		for (int j = 0; j < m; j++) {
			arr2[j] = input.nextInt();
			q2.insert(arr2[j]);
		}

		// -------------------------------------------------------------------

		System.out.println("first queue :");

		q1.printall();
		System.out.println("second queue :");
		q2.printall();

		Queue q3 = new Queue(m + n);

		while (!q1.isEmpty()||!q2.isEmpty()) {

			if (q1.peek() >= q2.peek()) {

				q3.insert(q1.remove());

			} else if (q1.peek() < q2.peek()) {

				q3.insert(q2.remove());

			} 
		}

		if (!q1.isEmpty()) {
			while (!q1.isEmpty()) {
				q3.insert(q1.remove());
			}

		}

		else if (!q2.isEmpty()) {
			while (!q2.isEmpty()) {
				q3.insert(q2.remove());
			}

		}
		System.out.println("\n");
		q3.printall();
		// ------------------------------------------------------------------------

	}

}
