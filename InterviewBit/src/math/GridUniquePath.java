package math;

public class GridUniquePath {

	public static void main(String[] args) {
		int arr[][] = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
		System.out.println(countUniquePath(15,9));
	}

	private static int countUniquePath(int A,int B) {
		int sol[][] = new int[A][B];
		for (int i = 0; i < A; i++) {
			sol[i][0] = 1;
		}
		for (int i = 0; i < B; i++) {
			sol[0][i] = 1;
		}
		for (int i = 1; i < A; i++) {
			for (int j = 1; j < B; j++) {
				sol[i][j] = sol[i - 1][j]+ sol[i][j - 1];
			}
		}
		return sol[A-1][B-1];
	}
}
