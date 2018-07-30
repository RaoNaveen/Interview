package BST;

public class Node {

	int value;
	int height;
	int size;
	Node left;
	Node right;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Node(int value) {
		super();
		this.value = value;
		this.height = 1;
		this.size = 0;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", height=" + height + ", size=" + size + ", left=" + left + ", right=" + right
				+ "]";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}
