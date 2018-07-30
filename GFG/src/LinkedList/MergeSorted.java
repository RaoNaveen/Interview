package LinkedList;

public class MergeSorted {

	public static void main(String[] args) {
		Node root = new Node(1);
		root = root.add(3, root);
		root = root.add(5, root);
		System.out.println(root);

		Node root2 = new Node(2);
		root2 = root2.add(4, root2);
		root2 = root2.add(6, root2);
		System.out.println(root2);

		merge(root, root2);
	}

	private static void merge(Node root, Node root2) {
		while (root != null && root2 != null) {
			if (root.value < root2.value) {
				root = root.next;
			} else {
				Node ptr = root.next;  //ptr=5
				Node ptr2 = root2.next;//ptr2=4,6
				root2.next = ptr;//5
				root.next = root2;//
				root2 = ptr2;
			}
		}
	}
}
