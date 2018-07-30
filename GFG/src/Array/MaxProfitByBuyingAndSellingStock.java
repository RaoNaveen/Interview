package Array;

import java.util.ArrayList;
import java.util.List;

class Sol{
	public int buy;
	public int sell;
}

public class MaxProfitByBuyingAndSellingStock {

	public static void main(String[] args) {
		int arr[] = {310, 40};
		int profit = findMaxProfit(arr);
		//System.out.println(profit);
	}

	private static int findMaxProfit(int[] arr) {
		List<Sol> list=new ArrayList<Sol>();
		int profit=0;
		int start=0;int end=0;
		int i;
		for(i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				continue;
			}else {
				end=i;
				if(start!=end)
				System.out.println(start+" "+end);
				start=i+1;
			}
		}
		if(start!=i)
		System.out.println(start+" "+i);
		return profit;
	}
}
