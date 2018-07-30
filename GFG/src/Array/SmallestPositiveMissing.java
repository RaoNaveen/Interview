package Array;

public class SmallestPositiveMissing {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 7, 6, 8 };
		// int arr[] = { 1, 2, 3, 4 };
		System.out.println(findMissing(arr));
	}

	private static int findMissing(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i]) - 1 < arr.length && Math.abs(arr[i]) - 1 >= 0) {
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				return i + 1;
			}
		}
		return arr.length + 1;
	}
}
