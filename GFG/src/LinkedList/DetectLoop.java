package LinkedList;

public class DetectLoop {

	public static void main(String[] args) {
		DetectLoop detectLoop = new DetectLoop();
		Node root = new Node();
		root = root.add(1, root);
		root = root.add(2, root);
		root = root.add(3, root);
		root = root.add(4, root);
		root = root.add(5, root);
		root = root.add(6, root);
		root = root.add(7, root);
		root = root.add(8, root);
		root.next.next.next.next.next.next = root;
		System.out.println(detectLoop.detectLoop(root));
	}

	private boolean detectLoop(Node root) {
		Node ptr = root;
		Node ptr2 = root;
		while (root != null) {
			ptr = ptr.next;
			ptr2 = ptr2.next.next;
			if (ptr == ptr2)
				return true;
		}
		return false;
	}
}
