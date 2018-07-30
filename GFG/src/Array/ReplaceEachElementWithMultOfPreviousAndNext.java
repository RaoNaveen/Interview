package Array;
//https://www.geeksforgeeks.org/replace-every-array-element-by-multiplication-of-previous-and-next/
public class ReplaceEachElementWithMultOfPreviousAndNext {

	public static void main(String[] args) {
		int arr[] = {2, 3, 4, 5, 6}; // 6, 8, 15, 24, 30
		arrange(arr);
		for (int i : arr)
			System.out.println(i);
	}

	private static void arrange(int[] arr) {
		int prev=arr[0];
		arr[0]=arr[0]*arr[1];
		for(int i=1;i<arr.length-1;i++) {
			int current=arr[i];
			arr[i]=prev*arr[i+1];
			prev=current;
		}
		arr[arr.length-1]=prev*arr[arr.length-1];
	}
}
