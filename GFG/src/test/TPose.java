package test;

public class TPose {

	public static void main(String[] args) {
		int arr[][] = {{1, 2, 3, 10}, {4, 5, 6, 11}, {7, 8, 9, 12},
				{13, 14, 15, 16}};

		printTpose(arr);
	}

	private static void printTpose(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (i != j) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
