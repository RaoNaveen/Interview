package LinkedList;

public class SwapNodes {

	public Node swap(Node root, int i, int j) {
		Node prePtr = null;
		Node temp = null;
		Node firstPtr = null;
		Node ptr = root;
		Node secondPtr;
		if (ptr == null)
			return ptr;
		while (ptr != null) {
			if (ptr.value == i) {
				firstPtr = ptr;
				prePtr = ptr;
			}
			if (ptr.value == j) {
				secondPtr = ptr;
				temp = firstPtr.next;
				firstPtr.next = secondPtr.next;

			}
			prePtr = null;
			ptr = ptr.next;
		}
		return root;
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root = root.add(20, root);
		root = root.add(30, root);
		root = root.add(40, root);
		root = root.add(50, root);
		//deleteAlt(root);
		//System.out.println(root);
		// root.next.next.next = root;
		// System.out.println(printMiddle(root));
		// System.out.println(reverse(root));
		// System.out.println(detectLoop(root));
		// System.out.println(removeDuplicatefromSorted(root));
		// System.out.println(removeDuplicatefromUnSorted(root));
		// Node root1 = new Node(10);
		// root1 = root1.add(15, root1);
		// root1 = root1.add(30, root1);
		// root1 = root1.add(35, root1);
		// root1 = root1.add(50, root1);
		// System.out.println(insersect(root,root1));
		 System.out.println(reArrangeEvenOddTogether(root));

	}

	private static void deleteAlt(Node root) {
		if (root == null)
			return;
		Node temp = root.next;
		if (temp == null)
			return;
		root.next=temp.next;
		deleteAlt(temp.next);
	}

	private static Node insersect(Node root, Node root1) {
		Node temp = null;
		if (root == null || root1 == null)
			return null;
		if (root.value < root1.value) {
			return insersect(root.next, root1);
		} else if (root.value > root1.value) {
			return insersect(root, root1.next);
		} else {
			temp = new Node(root.value);
			temp.next = insersect(root.next, root1.next);
		}
		return temp;
	}

	private static Node reArrangeEvenOddTogether(Node root) {
		Node odd = root;
		Node even = root.next;
		Node hold=root.next;
		
		while (odd != null && even != null && even.next!=null) {
			odd.next = even.next;
			odd=odd.next;
			
			even.next=odd.next;
			even = even.next;
		}
		odd.next=hold;
		return root;
	}

	private static Node removeDuplicatefromUnSorted(Node root) {
		Node ptr = root;
		Node ptr2 = root;
		Node temp;
		Node prePtr = null;
		while (ptr != null) {
			prePtr = ptr;
			ptr2 = ptr.next;
			while (ptr2 != null) {
				if (ptr.value == ptr2.value) {
					temp = ptr2.next;
					prePtr.next = null;
					prePtr.next = temp;
					ptr2 = ptr2.next;
				} else {
					prePtr = ptr2;
					ptr2 = ptr2.next;
				}
			}
			ptr = ptr.next;
		}
		return root;
	}

	private static Node removeDuplicatefromSorted(Node root) {
		Node ptr = root;
		Node temp;
		while (ptr != null) {
			if (ptr.next != null && ptr.value == ptr.next.value) {
				temp = ptr.next.next;
				ptr.next = null;
				ptr.next = temp;
			} else
				ptr = ptr.next;
		}
		return root;
	}

	private static boolean detectLoop(Node root) {
		Node slow = root;
		Node fast = root;
		while (slow != null && fast != null) {
			fast = fast.next;
			if (fast != null) {
				fast = fast.next;
				if (slow == fast)
					return true;
			}
			slow = slow.next;
		}
		return false;
	}

	private static Node reverse(Node root) {
		Node prev = null;
		Node current = root;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	private static int printMiddle(Node root) {
		Node first = root;
		Node second = root;
		while (first != null) {
			first = first.next;
			if (first != null) {
				first = first.next;
				second = second.next;
			}
		}
		return second.value;
	}
}
