package LinkedList;

public class DeleteANode {

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		System.out.println(node);
		deleteNode(node.next.next);
		System.out.println(node);
	}

	private static void deleteNode(Node node) {
		if (node == null)
			return;
		 
	}
}
