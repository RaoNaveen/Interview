package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
	private int value;
	public Node left;
	public Node right;

	public Node(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", left=" + left + ", right=" + right
				+ "]";
	}
}

public class CompleteBinaryTreeFromLinkedList {

	public static void main(String[] args) {
		CompleteBinaryTreeFromLinkedList object = new CompleteBinaryTreeFromLinkedList();
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		Node root = object.create(list);
		System.out.println(root);
	}

	private Node create(List<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		Queue<Node> queue = new LinkedList<>();
		Integer head = itr.next();
		if (head == null) {
			return null;
		}
		Node node = new Node(head);
		queue.add(node);
		head = itr.next();
		while (head != null) {
			Node rightNode = null;
			Node leftNode = new Node(head);
			if(itr.hasNext())
			head = itr.next();
			else
				head=null;
			queue.add(leftNode);
			if (head != null) {
				rightNode = new Node(head);
				head = itr.next();
				queue.add(rightNode);
			}
			Node parent = queue.poll();
			parent.left = leftNode;
			parent.right = rightNode;
		}
		return node;
	}
}