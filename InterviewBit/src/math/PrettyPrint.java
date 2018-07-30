package math;

public class PrettyPrint {

	public static void main(String[] args) {
		prettyPrint(4);
	}

	private static void prettyPrint(int k) {
		int y=k+k-1;
		int n = k + k - 1;
		int level = 0;
		int arr[][] = new int[n][n];
		int i = 0;
		while (k > 0) {
			for (i = level; i < n; i++) {
				arr[level][i] = k;
			}
			if(k==1)
				break;
			for (i = level; i < n; i++) {
				arr[i][n  - 1] = k;
			}
			for (i = level; i < n; i++) {
				arr[n - 1][i] = k;
			}
			for (i = level; i < n; i++) {
				arr[i][level] = k;
			}
			k--;
			n--;
			level++;
		}
		for (int j = 0; j < y; j++) {
			for (int z = 0; z < y; z++) {
				System.out.print(arr[j][z] + " ");
			}
			System.out.println();
		}
	}
}