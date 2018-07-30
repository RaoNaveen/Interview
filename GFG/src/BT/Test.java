package BT;

import java.util.LinkedList;
import java.util.Queue;

import BST.Node;

class Index {
	static int index = 0;
}

class Count {
	int c;
}
class A{
	Node2 temp;
}
public class Test {
	int preIndex = 0;
	public static void main(String[] args) {
		Test tree = new Test();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		root.right.right = new Node(7);
		int pre[] = {1, 2, 4, 5, 3, 6};
		int in[] = {4, 2, 5, 1, 3, 6};
		// System.out.println(checkPath(root, 8));
		// tree.printpostOrder(in, pre, 0, pre.length - 1);
		// System.out.println(getLevel(root, 7));
		// int arr[] = {10, 5, 1, 7, 40, 50};
		// System.out.println(buildTree(arr, arr.length));
		Node2 node = new Node2(10);
		node.left = new Node2(5);
		node.right = new Node2(20);
		node.left.left = new Node2(2);
		node.left.right = new Node2(7);
		node.right.left = new Node2(15);
		node.right.right = new Node2(30);
		// Count c=new Count();
		// tree.secondLargestInBST(node, c);
		//System.out.println(largestInBSTLessThanN(node, 20,new A()).value);
		connect(root);
	}
	
	  static class Node {
	        int data;
	        Node left, right, nextRight;
	        Node(int data){
	            this.data = data;
	            left = null;
	            right = null;
	            nextRight = null;
	        }
	    };
	
	 static void connect(Node root)
	    {
	        Queue<Node> q = new LinkedList<Node>(); 
	        q.add(root);
	      
	        // null marker to represent end of current level
	        q.add(null); 
	      
	        // Do Level order of tree using NULL markers
	        while (!q.isEmpty()) {
	            Node p = q.peek();
	            q.remove();
	            if (p != null) {
	      
	                // next element in queue represents next 
	                // node at current Level 
	                p.nextRight = q.peek();
	      
	                // push left and right children of current
	                // node
	                if (p.left != null)
	                    q.add(p.left); 
	                if (p.right != null)
	                    q.add(p.right);
	            } 
	             
	            // if queue is not empty, push NULL to mark 
	            // nodes at this level are visited
	            else if (!q.isEmpty()) 
	                q.add(null); 
	        }
	    }
	      
	

	private static Node2 largestInBSTLessThanN(Node2 node, int i,A a ) {
		if (node == null)
			return null;
		if (node.value >= i) {
			return a.temp;
			//temp = node;
			//largestInBSTLessThanN(node.left, i);
		}
		if (node.value < i) {
			a.temp = node;
			largestInBSTLessThanN(node.right, i, a);
		}
		return a.temp;
	}

	private void secondLargestInBST(Node2 node, Count C) {
		// Base cases, the second condition is important to
		// avoid unnecessary recursive calls
		if (node == null || C.c >= 4)
			return;

		// Follow reverse inorder traversal so that the
		// largest element is visited first
		this.secondLargestInBST(node.left, C);

		// Increment count of visited nodes
		C.c++;

		// If c becomes k now, then this is the 2nd largest
		if (C.c == 4) {
			System.out.print("2nd largest element is " + node.value);
			return;
		}

		// Recur for left subtree
		this.secondLargestInBST(node.right, C);
	}

	private static Node2 buildTree(int[] pre, int length) {
		return buildTreeUtil(pre, Index.index, pre[Index.index],
				Integer.MIN_VALUE, Integer.MAX_VALUE, length);
	}

	private static Node2 buildTreeUtil(int[] pre, int index, int key,
			int minValue, int maxValue, int length) {
		if (Index.index >= length)
			return null;
		Node2 node = null;
		if (key > minValue && key < maxValue) {
			node = new Node2(key);
			Index.index++;
			if (Index.index < length) {
				node.left = buildTreeUtil(pre, Index.index, pre[Index.index],
						minValue, key, length);
				node.right = buildTreeUtil(pre, Index.index, pre[Index.index],
						key, maxValue, length);
			}
		}
		return node;
	}

	static int getLevelUtil(Node2 node, int data, int level) {
		if (node == null)
			return 0;

		if (node.value == data)
			return level;

		int downlevel = getLevelUtil(node.left, data, level + 1);
		if (downlevel != 0)
			return downlevel;

		downlevel = getLevelUtil(node.right, data, level + 1);
		return downlevel;
	}

	/* Returns level of given data value */
	static int getLevel(Node2 node, int data) {
		return getLevelUtil(node, data, 1);
	}

	private static boolean checkPath(Node2 root, int sum) {
		if (root == null)
			return false;
		if (root.value == sum && root.left == null && root.left == null)
			return true;
		return checkPath(root.left, sum - root.value)
				|| checkPath(root.right, sum - root.value);
	}

	private void printpostOrder(int[] in, int[] pre, int start, int end) {
		if (start > end)
			return;
		int val = pre[preIndex++];
		if (start == end) {
			System.out.println(val);
			return;
		}
		int index = search(in, val);
		printpostOrder(in, pre, start, index - 1);
		printpostOrder(in, pre, index + 1, end);
		System.out.println(val);
	}

	private int search(int[] in, int j) {
		for (int i = 0; i < in.length; i++) {
			if (in[i] == j)
				return i;
		}
		return -1;
	}
}
