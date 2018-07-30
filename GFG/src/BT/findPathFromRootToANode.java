package BT;

import java.util.LinkedList;
import java.util.Queue;

public class findPathFromRootToANode {
	Node2 root;
	static int maxLevel = 0;
	static int count = 0;

	public static void main(String[] args) {
		RootToLeafWithASum tree = new RootToLeafWithASum();
		tree.root = new Node2(10);
		tree.root.left = new Node2(8);
		tree.root.right = new Node2(12);
		tree.root.left.left = new Node2(3);
		tree.root.left.right = new Node2(9);
		// tree.root.left.right.left = new Node2(1);
		int height = getHeight(tree.root);
		int arr[] = new int[height];
		// int[] ar=findPath(tree.root, 2, arr, 0);
		// for(int i:arr) {
		// System.out.println(i);
		// }
		// allRootToLeafPath(tree.root,arr,0);
		// System.out.println(getLevelOfANode(tree.root, 8, 1));
		// printAncestors(tree.root,1);
		// levelOrderTraversal(tree.root);
		// connectNodeAtSameLevel(tree.root);
		// printleftView(tree.root,1);
		// System.out.println(binaryTreeBSTOrNot(tree.root));
		// secondLargestInBST(tree.root);
		// System.out.println(inorderSuccessor(tree.root, 2,null));
		fixTwoSwappedNodeOfBST(tree.root);
		// largestInBSTWhichIslessThanOrEqualToN(tree.root,4,0);
	}

	private static void fixTwoSwappedNodeOfBST(Node2 root) {
		if (root == null)
			return;
		Node2 temp = null;
		Node2 temp2 = null;
		if (root.left != null) {
			if (root.value > root.left.value)
				fixTwoSwappedNodeOfBST(root.left);
			else
				temp = root.left;
		}
		if (root.right != null) {
			if (root.value < root.right.value)
				fixTwoSwappedNodeOfBST(root.right);
			else
				temp2=root.right;
		}
		if(temp!=null && temp2!=null) {
			
		}
	}

	private static void largestInBSTWhichIslessThanOrEqualToN(Node2 root,
			int value, int prev) {
		if (root == null)
			return;
		if (root.value == value) {
			System.out.println(value);
		}
		if (root.value < value)
			largestInBSTWhichIslessThanOrEqualToN(root.right, value,
					root.value);
		if (root.value > value)
			largestInBSTWhichIslessThanOrEqualToN(root.left, value, root.value);
	}
	private static Node2 minValue(Node2 node) {
		while (node.left != null)
			node = node.left;
		return node;
	}
	private static Node2 inorderSuccessor(Node2 root, int i, Node2 temp) {
		if (root == null)
			return null;
		if (root.value == i) {
			if (root.right != null)
				return minValue(root.right);
			else
				return temp;
		}
		if (root.value < i)
			temp = inorderSuccessor(root.right, i, temp);
		if (root.value > i) {
			temp = root;
			temp = inorderSuccessor(root.left, i, temp);
		}
		return temp;
	}

	private static void secondLargestInBST(Node2 root) {
		if (root != null) {
			secondLargestInBST(root.right);
			if (++count == 2)
				System.out.println(root.value);
			secondLargestInBST(root.left);
		}
	}
	private static boolean binaryTreeBSTOrNot(Node2 root) {
		return binaryTreeBSTOrNotUtil(root, Integer.MIN_VALUE,
				Integer.MAX_VALUE);
	}
	private static boolean binaryTreeBSTOrNotUtil(Node2 root, int minValue,
			int maxValue) {
		if (root == null)
			return true;
		if (root.value > minValue && root.value < maxValue) {
			return binaryTreeBSTOrNotUtil(root.left, minValue, root.value)
					&& binaryTreeBSTOrNotUtil(root.right, root.value, maxValue);
		}
		return false;
	}
	private static void printleftView(Node2 root, int i) {
		if (root == null)
			return;
		if (i > maxLevel) {
			System.out.println(root.value);
			maxLevel = i;
		}
		printleftView(root.right, i + 1);
		printleftView(root.left, i + 1);
	}

	private static void levelOrderTraversal(Node2 root) {
		Queue<Node2> queue = new LinkedList<>();
		queue.add(root);
		while (true) {
			int size = queue.size();
			if (size == 0)
				break;
			while (size > 0) {
				Node2 node = queue.poll();
				System.out.print(node.value + " ");
				size--;
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			System.out.println();
		}
	}
	private static void connectNodeAtSameLevel(Node2 root) {

	}
	private static boolean printAncestors(Node2 root, int i) {
		if (root == null)
			return false;
		if (root.value == i)
			return true;
		if (printAncestors(root.left, i)) {
			System.out.println(root.value);
			return true;
		}
		if (printAncestors(root.right, i)) {
			System.out.println(root.value);
			return true;
		}
		return false;
	}
	private static int getLevelOfANode(Node2 root, int i, int level) {
		if (root == null)
			return 0;
		if (root.value == i)
			return level;
		if (root.left != null)
			return getLevelOfANode(root.left, i, level + 1);
		return getLevelOfANode(root.right, i, level + 1);

	}
	private static void allRootToLeafPath(Node2 root, int[] arr, int i) {
		if (root == null)
			return;
		arr[i++] = root.value;
		if (root.left == null && root.right == null) {
			printArray(arr, i);
		}
		if (root.left != null)
			allRootToLeafPath(root.left, arr, i);
		if (root.right != null)
			allRootToLeafPath(root.right, arr, i);
	}
	private static void printArray(int[] arr, int i) {
		for (int j = 0; j < i; j++)
			System.out.print(arr[j] + " ");
		System.out.println();
	}
	private static int getHeight(Node2 root) {
		if (root == null)
			return 0;
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}
	private static int[] findPath(Node2 root, int value, int[] arr, int len) {
		if (root == null)
			return arr;
		arr[len++] = root.value;
		if (root.value == value) {
			return arr;
		}
		if (root.left != null) {
			findPath(root.left, value, arr, len);
		}
		if (root.right != null) {
			findPath(root.right, value, arr, len);
		}
		return arr;
	}
}
