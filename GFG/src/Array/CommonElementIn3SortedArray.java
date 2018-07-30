package Array;

public class CommonElementIn3SortedArray {

	public static void main(String[] args) {
		int ar1[] = { 1, 5, 5 };
		int ar2[] = { 3, 4, 5, 5, 10 };
		int ar3[] = { 5, 5, 10, 20 };
		find(ar1, ar2, ar3);
	}

	private static void find(int[] ar1, int[] ar2, int[] ar3) {
		int x = 0, y = 0, z = 0;
		while (x < ar1.length && y < ar2.length && z < ar3.length) {
			if (ar1[x] == ar2[y] && ar2[y] == ar3[z]) {
				System.out.println(ar1[x]);
				x++;
				y++;
				z++;
			} else if (ar1[x] < ar2[y])
				x++;
			else if (ar2[y] < ar3[z])
				y++;
			else
				z++;
		}
	}
}
