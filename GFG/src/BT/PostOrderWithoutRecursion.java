package BT;

import java.util.Stack;

public class PostOrderWithoutRecursion {

	public static void main(String[] args) {
		PostOrderWithoutRecursion postOrderWithoutRecursion = new PostOrderWithoutRecursion();
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
		postOrderWithoutRecursion.print(node);
	}

	private void print(Node node) {
		Stack<Node> stack = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		stack.push(node);
		Node nod;
		while (!stack.isEmpty()) {
			 nod=stack.pop();
			if(nod.left!=null)
				stack.push(nod.left);
			if(nod.right!=null)
				stack.push(nod.right);
			stack2.push(nod);
		}
		while(!stack2.isEmpty()) {
			System.out.println(stack2.pop().value);
		}
	}
}
