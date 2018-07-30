package Array;

public class NoOfOperationToMakeAnArrayPalindrome {

	public static void main(String[] args) {
		int arr[]= {11, 14, 15, 99};
		System.out.println(find(arr));
	}

	private static int find(int[] arr) {
		int count=0;
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			if(arr[start]==arr[end]) {
				start++;
				end--;
			}
			else if(arr[start]<arr[end]) {
				start++;
				arr[start]+=arr[start-1];
				count++;
			}
			else {
				end--;
				arr[end]+=arr[end+1];
				count++;
			}
		}
		return count;
	}
}
