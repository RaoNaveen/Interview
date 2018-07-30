package Array;

public class MaxDiffLargeOnRight {

	public static void main(String[] args) {
	//	int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
		int arr[]= {10,9,8,7,6};
		find(arr);
	}

	private static void find(int[] arr) {
		int localMax = arr.length - 1;
		int maxDiff=Integer.MIN_VALUE;
		for (int i = arr.length - 2; i >= 0; i--) {
			if(arr[i]>localMax)
				localMax=arr[i];
			else {
				int diff=localMax-arr[i];
				maxDiff=Math.max(maxDiff, diff);
			}
		}
		System.out.println(maxDiff);
	}
}
