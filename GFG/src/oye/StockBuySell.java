package oye;

import java.util.ArrayList;
import java.util.List;

class Interval{
	int buy,sell;
}

public class StockBuySell {

//	public static void main(String[] args) {
//		//int arr[] = {100, 180, 260, 310, 40, 535, 695};
//		int arr[]= {8,6,4,3,2,1};
//		System.out.println(maximiseProfit(arr));
//	}
//
//	private static int maximiseProfit(int[] arr) {
//		int profit = 0;
//		int start = 0;
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] < arr[i - 1]) {
//				System.out.println("buy at "+start+" sell at "+(i-1));
//				profit += arr[i - 1] - arr[start];
//				start = i;
//			}
//			else if(i==arr.length-1) {
//				System.out.println("buy at "+start+" sell at "+(i));
//				profit += arr[i] - arr[start];
//			}
//		}
//		return profit;
//	}
	
	public static void main(String[] args) {
		int arr[] = {100, 180, 260, 310, 40, 535, 695};
		//int arr[]= {5,4,3,2,1};
		maximiseProfit(arr);
	}

	private static void maximiseProfit(int[] arr) {
		int n=arr.length;
		int i=0;
		List<Interval> list=new ArrayList<>();
		while(i<n-1) {
			
			while(i<n-1 && arr[i]>=arr[i+1]) 
				i++;
			
			if(i==n-1)
				break;
			
			Interval interval=new Interval();
			interval.buy=i++;
			
			while(i<n-1 && arr[i]<=arr[i+1]) 
				i++;
			
			interval.sell=i++;
			list.add(interval);
		}
		if(list.isEmpty()) {
			System.out.println("Nothing to Buy");
		}
		for(Interval in:list) {
			System.out.println(in.buy+" "+in.sell);
		}
	}
}
