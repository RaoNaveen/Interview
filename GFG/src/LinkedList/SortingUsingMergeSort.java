package LinkedList;

public class SortingUsingMergeSort {

	public static void main(String[] args) {
		Node root = new Node();
		root = root.add(1, root);
		root = root.add(5, root);
		root = root.add(4, root);
		root = root.add(3, root);
		root = root.add(2, root);
		Node ans = mergeSort(root);
		System.out.println(ans);
	}

	private static Node mergeSort(Node root) {
		if (root == null || root.next == null)
			return root;
		Node middle = findMiddle(root);
		Node nextToMiddle = middle.next;
		middle.next = null;

		Node left = mergeSort(root);
		Node right = mergeSort(nextToMiddle);

		Node sortedList = mergerAfterSorting(left, right);
		return sortedList;
	}

	private static Node mergerAfterSorting(Node left, Node right) {
		Node result = null;
		if (left == null)
			return right;
		if (right == null)
			return left;
		if (left.value < right.value) {
			result = left;
			result.next = mergerAfterSorting(left.next, right);
		} else {
			result = right;
			result.next = mergerAfterSorting(left, right.next);
		}
		return result;
	}

	private static Node findMiddle(Node root) {
		Node slowPtr = root;
		Node fastPtr = root.next;
		while (fastPtr != null) {
			fastPtr = fastPtr.next;
			if (fastPtr != null) {
				slowPtr = slowPtr.next;
				fastPtr = fastPtr.next;
			}
		}
		return slowPtr;
	}
}
