package LinkedList;

public class NthLast {

	public int findnth(int x, Node root) {
		int count = 0;
		Node ptr = root;
		Node ptr2=root;
		while (count++ < x) {
			ptr=ptr.next;
		}
		while(ptr!=null) {
			ptr=ptr.next;
			ptr2=ptr2.next;		
		}
		return ptr2.value;
	}

	public static void main(String[] args) {
		NthLast list = new NthLast();
		Node root = new Node();
		root = root.add(1, root);
		root = root.add(2, root);
		root = root.add(3, root);
		root = root.add(4, root);
		root = root.add(5, root);
		// while (root != null) {
		// System.out.println(root.value);
		// root = root.next;
		// }
		System.out.println(list.findnth(2, root));
	}
}
