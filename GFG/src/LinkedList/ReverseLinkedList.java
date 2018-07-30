package LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node = reverse(node);
		System.out.println(node);
	}

	private static Node reverse(Node node) {
		if (node == null || node.next == null)
			return node;
		Node current = node;
		Node prev = null;
		Node next = null;
		while (current != null) {
			next=current.next;
			current.next=prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}
