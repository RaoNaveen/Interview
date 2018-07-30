package Array;

public class MaxDiffBetweenTwoElement {

	public static void main(String[] args) {
		int arr[]= {1, 2, 90, 10, 110};
		int diff=findMaxDiff(arr);
		System.out.println(diff);
	}

	private static int findMaxDiff(int[] arr) {
		int max=arr[arr.length-1];
		int diff=0;
		for(int i=arr.length-2;i>=0;i--) {
			if(diff<max-arr[i]) {
				diff=max-arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return diff;
	}
}
