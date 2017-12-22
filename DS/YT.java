package kkkkkkk;

class Node {
	
	public int item;
	public Node left;
	public Node right;

	public void display() {
		System.out.printf("[" + item + "]");

	}
}

class tree {
	Node root;

	public tree() {
		root = null;
	}

	public Node ReturnRoot() {
		return root;
	}

	public void Insert(int id) {
		Node newNode = new Node();
		newNode.item = id;
		if (root == null)
			root = newNode;
		else {
			Node current = root;
			Node parent = null;
			while (true) {
				parent = current;
				if (id < current.item) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public void Preorder(Node Root) {
		if (Root != null) {
			if (Root.left == null && Root.right == null)
				System.out.printf(Root.item + " ");
			Preorder(Root.left);
			Preorder(Root.right);
		}
	}

	public void Inorder(Node Root) {
		if (Root != null) {
			Inorder(Root.left);
			if (Root.left == null && Root.right != null)
				System.out.printf(Root.item + " ");
			Inorder(Root.right);
		}
	}

	public void Postorder(Node Root) {
		if (Root != null) {
			Postorder(Root.left);
			Postorder(Root.right);
			if ((Root.item % 2) == 0)
				System.out.printf(Root.item + " ");
		}
	}
}

public class YT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tree BST = new tree();
		BST.Insert(30);
		BST.Insert(35);
		BST.Insert(57);
		BST.Insert(15);
		BST.Insert(63);
		BST.Insert(49);
		BST.Insert(89);
		BST.Insert(77);
		BST.Insert(67);
		BST.Insert(98);
		BST.Insert(91);

		System.out.println("Ex 1: ");
		BST.Preorder(BST.ReturnRoot());
		System.out.println("\n");
		System.out.println("Ex 2: ");
		BST.Postorder(BST.ReturnRoot());
		System.out.println("\n");
		System.out.println("Ex 3: ");
		BST.Inorder(BST.ReturnRoot());
	

	}

}
