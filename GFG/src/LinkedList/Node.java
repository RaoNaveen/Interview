package LinkedList;

public class Node {

	public int value;
	public Node next;

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}
	
	public Node add(int value, Node root) {
		Node ptr = null;
		if (root == null) {
			root = new Node(value);
		} else {
			ptr = root;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = new Node(value);
		}
		return root;
	}

	public Node(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
