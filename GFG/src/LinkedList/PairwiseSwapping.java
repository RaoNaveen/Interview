package LinkedList;

public class PairwiseSwapping {

	public static void main(String[] args) {
		Node root = new Node();
		root = root.add(1, root);
		root = root.add(2, root);
		root = root.add(3, root);
		root = root.add(4, root);
		root = root.add(5, root);
		root = swap(root);
		System.out.println(root);
	}

	private static Node swap(Node ptr) {
		Node root = ptr;
		while (root != null && root.next != null) {
			int first = root.value;
			root.value = root.next.value;
			root.next.value = first;
			root = root.next.next;
		}
		return ptr;
	}
}
