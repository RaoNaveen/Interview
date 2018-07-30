package BT;

public class printPostFromPreAndIn {

	public static void main(String[] args) {
		int in[] = {4, 2, 5, 1, 3, 6};
		int pre[] = {1, 2, 4, 5, 3, 6};

		printPost(in, pre, 0, 0, in.length - 1);
	}

	private static void printPost(int[] in, int[] pre, int index, int start,
			int end) {
			int find = pre[index++];
			int mid = find(in, find);
			printPost(in, pre, index, start, mid - 1);
			printPost(in, pre, index, mid + 1, end);
			System.out.println(in[mid]);
	}

	private static int find(int[] in, int find) {
		for (int i = 0; i < in.length; i++) {
			if (in[i] == find)
				return i;
		}
		return -1;
	}
}
