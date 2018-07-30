package Array;

public class ReArrangePositiveAndNegativeWithoutChangingOrder {

	public static void main(String[] args) {
		int arr[] = {12, 11, -13, -5, 6, -7, 5, -3, -6};
		arrange(arr);
		for (int i : arr)
			System.out.println(i);
	}

	private static void arrange(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int key=arr[i];
			if(key>0)
				continue;
			int j=i;
			while(j>0 && arr[j-1]>0) {
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
			}
		}
	}
}
