package BST;

public class SecondLargest {
	public static void main(String[] args) {
		SecondLargest secondLargest = new SecondLargest();
		Node node = new Node(10);
		node.left = new Node(5);
		node.right = new Node(15);
		node.right.left = new Node(13);
		Count C = new Count();
		System.out.println(secondLargest.find(node, C));
	}

	private int find(Node node, Count C) {
		if (node == null || C.c >= 2)
			return -1;
		find(node.right, C);
		C.c++;
		if (C.c == 2) {
			System.out.println(node.value);
			return node.value;
		}
		return find(node.left, C);
	}
}

class Count {
	public int c;

	@Override
	public String toString() {
		return "Count [c=" + c + "]";
	}
}
