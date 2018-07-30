package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		RemoveDuplicateFromArray array = new RemoveDuplicateFromArray();
		int arr[] = {5000, 5000, 5000};
		//array.remove(arr);
		List<Integer> list = new ArrayList<>(Arrays.asList(1000, 1000, 1000, 1000, 1001, 1002, 1003, 1003, 1004, 1010));
		array.removeDuplicates(list);
	}

	public int removeDuplicates(List<Integer> a) 
	{
	    if(a==null)
	      return 0;

	    if(a.size() <=2)
	      return a.size();
	      
	    int i=0; int j=1;
	    int count = 0;
	    while (j<a.size())
	    {
	      if( a.get(i).equals(a.get(j)) && count == 0)
	      {
	        count = 2;
	        j++;
	      }
	      else
	      {
	        if(String.valueOf(a.get(i)).equals(String.valueOf(a.get(j))) && count == 2)
	          a.remove(j);

	        else
	        {
	          i=j;
	          j++;
	          count = 0;
	        }
	      }
	    }
	    System.out.println(a);
	    return i;
	}

	private void remove(int[] arr) {
		int j = -1;
		int i = 0;
		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				j++;
				arr[j] = arr[i];
			}
		}
		arr[++j] = arr[i];
		System.out.println(j + 1);
		for (int k = 0; k <= j; k++) {
			System.out.println(arr[k]);
		}
	}
}
