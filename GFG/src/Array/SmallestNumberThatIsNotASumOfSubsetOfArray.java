package Array;

public class SmallestNumberThatIsNotASumOfSubsetOfArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5 };
		System.out.println(find(arr));
	}

	private static int find(int[] arr) {
		int number = 1;
		for (int i = 0; i < arr.length; i++) {
			if (number >= arr[i])
				number += arr[i];
		}
		return number;
	}
}
