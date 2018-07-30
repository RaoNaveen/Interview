package LinkedList;

public class EvenAndOddpositionTogether {

	public static void main(String[] args) {
		Node root = new Node(1);
		root = root.add(2, root);
		root = root.add(3, root);
		root = root.add(4, root);
		root = root.add(5, root);
		root = root.add(6, root);
		 root = root.add(7, root);
		root = segregate(root);
		// root=deleteLastOccurence(root,5);
		// root = removeAllDuplicates(root);
		System.out.println(root);
	}

	private static Node deleteLastOccurence(Node root, int value) {
		Node ptr = root;
		Node find = null;
		while (ptr != null) {
			if (ptr.value == value)
				find = ptr;
			ptr = ptr.next;
		}
		if (find != null && find.next == null) {
			ptr = root;
			while (ptr.next != find)
				ptr = ptr.next;
			ptr.next = null;
		}
		if (find != null && find.next != null) {
			find.value = find.next.value;
			find.next = find.next.next;
		}
		return root;
	}

	public static Node removeAllDuplicates(Node head) {
		/*
		 * create a dummy node that acts like a fake head of list pointing to
		 * the original head
		 */
		Node dummy = new Node(0);

		/* dummy node points to the original head */
		dummy.next = head;
		Node prev = dummy;
		Node current = head;

		while (current != null) {
			/*
			 * Until the current and previous values are same, keep updating
			 * current
			 */
			while (current.next != null
					&& prev.next.value == current.next.value)
				current = current.next;

			/*
			 * if current has unique value i.e current is not updated, Move the
			 * prev pointer to next node
			 */
			if (prev.next == current)
				prev = prev.next;

			/*
			 * when current is updated to the last duplicate value of that
			 * segment, make prev the next of current
			 */
			else
				prev.next = current.next;

			current = current.next;
		}

		/*
		 * update original head to the next of dummy node
		 */
		head = dummy.next;
		return head;
	}

	private static Node segregate(Node root) {
		if (root == null)
			return null;
		Node odd = root;
		Node even = root.next;
		Node hold = root.next;
		while (true) {
			if (even == null) {
				odd.next = hold;
				break;
			}
			odd.next = even.next;
			if (even.next != null)
				odd = even.next;
			else {
				odd.next = hold;
				break;
			}
			even.next = odd.next;
			even = odd.next;
		}
		return root;
	}
}