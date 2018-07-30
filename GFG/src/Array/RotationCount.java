package Array;

public class RotationCount {

	public static void main(String[] args) {
		int arr[] = { 12, 15, 18, 2, 3, 6 };
		System.out.println(rotationCount(arr, 0, arr.length - 1));
	}

	private static int rotationCount(int[] arr, int i, int j) {
		int mid = (i + j) / 2;
		if (i > j)
			return -1;
		if (i == j)
			return j;
		if (mid > i && arr[mid + 1] < arr[mid])
			return mid + 1;
		if (mid < j && arr[mid] < arr[mid - 1])
			return mid;
		if (arr[i] > arr[mid]) {
			return rotationCount(arr, i, mid - 1);
		} else if (arr[mid] > arr[j]) {
			return rotationCount(arr, mid + 1, j);
		}
		return -1;
	}
}
