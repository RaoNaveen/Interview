package BT;
//Java program to construct binary tree from

//given array in level order fashion

public class CBTFromArray {
	Node root;

	// Tree Node
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
		}
		
	}

	// Function to insert nodes in level order
	public Node insertLevelOrder(int[] arr, Node root, int i) {
		// Base case for recursion
		if (i < arr.length) {
			Node temp = new Node(arr[i]);
			root = temp;

			// insert left child
			root.left = insertLevelOrder(arr, root.left, 2 * i + 1);

			// insert right child
			root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
		}
		System.out.println(root);
		return root;
	}


	// Function to print tree nodes in InOrder fashion
	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	

	@Override
	public String toString() {
		return "CBTFromArray [root=" + root + "]";
	}


	// Driver program to test above function
	public static void main(String args[]) {
		CBTFromArray t2 = new CBTFromArray();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		t2.root = t2.insertLevelOrder(arr, t2.root, 0);
		t2.inOrder(t2.root);
	}
}