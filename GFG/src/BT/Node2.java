package BT;

public class Node2 {
	public int value;
	public Node2 left;
	public Node2 right;
	public int height;

	public Node2(int value) {
		super();
		this.value = value;
		this.height = 1;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", left=" + left + ", right=" + right
				+ ", height=" + height + "]";
	}

}
