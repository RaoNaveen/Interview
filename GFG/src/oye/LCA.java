package oye;

import BT.Node2;

public class LCA {
	int arr[] = new int[100];
	int n = 0;
	public static void main(String[] args) {
		Node2 node = new Node2(1);
		node.left = new Node2(2);
		node.right = new Node2(3);
		node.left.left = new Node2(4);
		node.left.right = new Node2(5);
		node.right.left = new Node2(6);
		node.right.left = new Node2(7);
		LCA lca = new LCA();
		lca.findLCA(node, 4, 7, lca);
	}

	private void findLCA(Node2 node, int i, int j, LCA lca) {
		boolean first=hasPath(node, i);
		int m = n;
		int y = 0;
		int z = m;
		if (first && hasPath(node, j)) {
			while (y++ < m && z++ < n) {
				if(arr[y]!=arr[z])
					break;
			}
			System.out.println(arr[y-1]+" "+arr[z-1]);
		}
	}

	private boolean hasPath(Node2 node, int i) {
		if (node == null)
			return false;
		arr[n++] = node.value;
		if (node.value == i)
			return true;
		if (hasPath(node.left, i) || hasPath(node.right, i))
			return true;
		n--;
		return false;
	}
}
