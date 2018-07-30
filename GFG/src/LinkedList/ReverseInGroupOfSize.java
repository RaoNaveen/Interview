package LinkedList;

public class ReverseInGroupOfSize {

	public static void main(String[] args) {
		Node root = new Node();
		root = root.add(1, root);
		root = root.add(2, root);
		root = root.add(3, root);
		root = root.add(4, root);
		root = root.add(5, root);
		root = root.add(6, root);
		root = root.add(7, root);
		root = root.add(8, root);
		root = reverseInSize(root, 5);
		System.out.println(root);
	}

	private static Node reverseInSize(Node root, int i) {
		Node curr = root;
		Node prev = null;
		Node next = null;
		while (curr != null && i-- > 0) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		if (next != null)
			root.next = reverseInSize(next, i);
		return prev;
	}
}
