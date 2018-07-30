package BT;

import java.util.Stack;

class Node {
	public int value;
	public Node left;
	public Node right;
	@Override
	public String toString() {
		return "Node [value=" + value + ", left=" + left + ", right=" + right
				+ "]";
	}
	public Node(int value) {
		super();
		this.value = value;
	}

}
public class PreOrderWithoutRecursion {

	public static void main(String[] args) {
		PreOrderWithoutRecursion tree = new PreOrderWithoutRecursion();
		Node a = new Node(1);
		a.left = new Node(2);
		a.right = new Node(3);
		a.left.left = new Node(4);
		a.left.right = new Node(5);
		a.right.left = new Node(6);
		a.right.right = new Node(7);
		a.left.right.left = new Node(8);
		a.left.right.right = new Node(9);
		a.left.right.right.left = new Node(10);
		tree.inOrder(a);
		System.out.println();
		tree.inOrderWithRecursion(a);
	}

	private void inOrderWithRecursion(Node a) {
		if (a != null) {
			System.out.println(a.value);
			inOrderWithRecursion(a.left);
			inOrderWithRecursion(a.right);
		}
	}

	private void inOrder(Node a) {
		Stack<Node> stack = new Stack<>();
		stack.push(a);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			System.out.println(node.value);
			if (node.right != null)
				stack.push(node.right);
			if (node.left != null)
				stack.push(node.left);
		}
	}
}
