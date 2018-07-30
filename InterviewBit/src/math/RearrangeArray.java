package math;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {
	public static void main(String[] args) {
		int arr[] = {3,2,0,1};
		//rearrange(arr, arr.length);
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(3,2,0,1));
		arrange(list);
		System.out.println(list);
	}
	
	  public static void arrange(ArrayList<Integer> a) {
	        int n=a.size();
	         for (int i = 0; i < n; i++)
	            a.set(i,a.get(i)+(a.get(a.get(i))%n)*n);
	        for (int i = 0; i < n; i++)
	            a.set(i,a.get(i)/n);
	    }

	static void rearrange(int arr[], int n) {
		for (int i = 0; i < n; i++)
			
			arr[i] += (arr[arr[i]] % n) * n;

		for (int i = 0; i < n; i++)
			arr[i] /= n;
		
		for (int i : arr)
			System.out.println(i);
	}
}
