package Array;

public class MaxSumWithoutAdjacent {

	public static void main(String[] args) {
		int arr[] = { 5, 5, 10, 100, 10, 5 };
		find(arr);
	}

	private static void find(int[] arr) {
		int incl = arr[0];
		int excl = 0;
		int temp = 0;
		for (int i = 1; i < arr.length; i++) {
			temp = Math.max(incl, excl);
			incl = excl + arr[i];
			excl=temp;
		}
		System.out.println(Math.max(incl, excl));
	}
}
