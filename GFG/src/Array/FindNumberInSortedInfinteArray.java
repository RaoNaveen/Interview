package Array;

public class FindNumberInSortedInfinteArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(find(arr, 0, 1, 10));
	}

	private static int find(int[] arr, int start, int end, int x) {
		int mid = (start + end) / 2;
		if (start <= end) {
			if (arr[end] < x) {
				start = end;
				end =Math.min(end*2, arr.length-1);
				return find(arr, start, end, x);
			}
			if (arr[mid] == x)
				return mid;
			else if (arr[mid] > x) {
				return find(arr, start, mid - 1, x);
			} else
				return find(arr, mid + 1, end, x);
		} else
			return -1;
	}
}
