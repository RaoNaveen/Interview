package Array;

public class SmallestMissingPositiveNumber {

	public static void main(String[] args) {
		//int arr[] = { 1, 2, 3, -1, -10, 4 };
		int[] arr= {1,2};
		find(arr);
	}

	private static void find(int[] arr) {
		int j = seperate(arr);
		int arr2[] = new int[arr.length - j];
		int k = 0;
		for (int i = j; i < arr.length; i++) {
			arr2[k++] = arr[i];
		}
		System.out.println(findMissing(arr2));

	}

	private static int findMissing(int[] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			if (Math.abs(arr2[i]) - 1 >= 0 && Math.abs(arr2[i]) - 1 < arr2.length) {
				arr2[Math.abs(arr2[i]) - 1] = -arr2[Math.abs(arr2[i]) - 1];
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] > 0) {
				return i + 1;
			}
		}
		return arr2.length+1;
	}

	private static int seperate(int[] arr) {
		int start = 0, end = arr.length - 1;
		while (start < end) {
			if (arr[start] > 0) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				end--;
			} else {
				start++;
			}
		}
		return start;
	}
}
