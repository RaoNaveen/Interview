package Array;

public class SumIsClosetInTwoSortedArray {

	public static void main(String[] args) {
		int ar[] = { 1, 4, 5, 7 };
		int arr[] = { 10, 20, 30, 40 };
		int m = 17;
		find(ar, arr, m);
	}

	private static void find(int[] ar, int[] arr, int m) {
		int start = 0;
		int end = arr.length - 1;
		int first = 0,last = 0;
		int min=Integer.MAX_VALUE;
		while (start < ar.length && end >= 0) {
			if(Math.abs(ar[start]+arr[end]-m)<min) {
				first=ar[start];
				last=arr[end];
				min=Math.abs(ar[start]+arr[end]-m);
			}
			if(Math.abs(ar[start]+arr[end])>m) {
				end--;
			}
			else 
				start++;
		}
		System.out.println(first+" "+last);
	}
}
