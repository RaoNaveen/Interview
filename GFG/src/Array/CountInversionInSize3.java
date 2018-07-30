package Array;

public class CountInversionInSize3 {

	public static void main(String[] args) {
		int arr[] = { 8, 4, 2, 1 };
		System.out.println(find(arr));
	}

	private static int find(int[] arr) {
		int inverCount = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int min = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j])
					min++;
			}
			int max = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] < arr[j])
					max++;
			}
			inverCount += min * max;
		}
		return inverCount;
	}
}
