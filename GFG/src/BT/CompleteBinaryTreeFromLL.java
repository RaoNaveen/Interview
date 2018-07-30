package BT;

import java.util.LinkedList;
import java.util.Queue;

import LinkedList.Node;

public class CompleteBinaryTreeFromLL {

	public static void main(String[] args) {
		CompleteBinaryTreeFromLL treeFromLL = new CompleteBinaryTreeFromLL();
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(6);
		treeFromLL.convert(node);
	}

	private BT.Node convert(Node root) {
		if (root == null)
			return null;
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(root);
		root = root.next;
		while (root != null) {
			Node node = queue.poll();
			BT.Node parent = new BT.Node(node.value);
			
		}
		return null;
	}
}
