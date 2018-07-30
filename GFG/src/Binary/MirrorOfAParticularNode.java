package Binary;

public class MirrorOfAParticularNode {

	public static void main(String[] args) {
		MirrorOfAParticularNode mirror = new MirrorOfAParticularNode();
		Node a = new Node(1);
		a.left = new Node(2);
		a.right = new Node(3);
		a.left.left = new Node(4);
		a.left.right = new Node(5);
		System.out.println(mirror.findMirror(a, a, 1));
	}

	private int findMirror(Node a, Node b, int k) {
		if (a == null && b == null)
			return -1;
		if (a == null || b == null)
			return -1;
		if (a.data == k)
			return b.data;
		if (b.data == k)
			return a.data;
		int miror = findMirror(a.left, b.right, k);
		if (miror > 0)
			return miror;
		return findMirror(a.right, b.left, k);
	}
}
