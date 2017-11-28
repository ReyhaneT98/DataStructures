package term3_26;



class TS_Stack {

	int top;
	int top1;
	int top2;
	int arr[];

	public TS_Stack(int Top) {
		top = Top;
		top1 = -1;
		top2 = Top;
		this.arr = new int[top];
	}

	public int push(int item) {
		if (top1 <= top2) {

			top1++;
			arr[top1] = item;
			return 1;
		}
		return -1;

	}

	public int pop() {
		if (top1 <= top2) {

			top1--;
			return arr[++top1];
		}
		throw new RuntimeException();
	}

	public int pushFromEnd(int item) {
		if (top1 <= top2) {
			if (top1 == top)
				return 0;
			else
				top2--;
			arr[top1] = item;
			return 1;
		}
		return -1;

	}

	public int popFromEnd() {
		if (top1 <= top2) {

			top2++;
			return arr[top2 - 1];
		}
		throw new RuntimeException();

	}

	public void printstack() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

public class TwoSideStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TS_Stack t = new TS_Stack(4);

		t.push(1);
		t.push(2);
		t.push(3);
		t.push(4);
		t.printstack();
		System.out.println("------------------");
		t.pop();
		t.pushFromEnd(5);
		t.printstack();
		System.out.println("------------------");
		t.popFromEnd();
		t.pushFromEnd(6);
		t.printstack();

	}

}
