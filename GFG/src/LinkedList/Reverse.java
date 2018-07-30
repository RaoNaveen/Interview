package LinkedList;

public class Reverse {

	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		Node root = new Node();
		root = root.add(1, root);
		root = root.add(2, root);
		// root = root.add(3, root);
		// root = root.add(4, root);
		// root = root.add(5, root);
		// root = reverse.reverse(root);
		root = recursive(root, root.next);
		while (root != null) {
			System.out.println(root.value);
			root = root.next;
		}
	}

	private static Node recursive(Node root, Node next) {
		if (next != null) {
			recursive(next, next.next);
		}
		return root;
	}

	private Node reverse(Node root) {
		Node prev = null;
		Node current = root;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		root = prev;
		return root;
	}
}
