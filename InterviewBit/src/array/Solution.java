package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		//System.out.println(coverPoints(new ArrayList<>(Arrays.asList(-7,-13)), new ArrayList<>(Arrays.asList(1,-5))));
		//System.out.println(plusOne(new ArrayList<>(Arrays.asList(0,4,2,6,7,8))));
		System.out.println(maxSubArray(new ArrayList<>(Arrays.asList(-5000))));
	}
	public static  int maxSubArray(final List<Integer> A) {
        int max_till_now=Integer.MIN_VALUE;
        int sum=0;
       for(int i=0;i<A.size();i++){
           sum+=A.get(i);
            if(sum>max_till_now){
           max_till_now=sum;
           }
           if(sum<0){
                sum=0;
           }
          
       }
       return max_till_now;
    }
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        int n = a.size();
     
        a.set(n - 1, a.get(n - 1) + 1);
        int carry = a.get(n - 1) / 10;
        a.set(n - 1, a.get(n - 1) % 10);
     
        for (int i = n - 2; i >= 0; i--)
        {
            if (carry == 1)
            {
            a.set(i, a.get(i) + 1);
            carry = a.get(i) / 10;
            a.set(i, a.get(i) % 10);
            }
        }
        if (carry == 1)
        a.add(0, 1);
        Iterator<Integer> itr=a.iterator();
        while(itr.hasNext()) {
        	if(itr.next()!=0)
        		break;
        	else
        		itr.remove();
        }
        return a;
    }
    public static int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A==null || B==null || A.size()==1 || B.size()==1)
        return 0;
        else{
            int x=Math.abs(A.get(A.size()-1)-A.get(0));
            int y=Math.abs(B.get(B.size()-1)-B.get(0));
             int count=0;
             while(x-->0&& y-->0)
             count++;
             while(x-->0)
             count++;
             while(y-->0)
             count++;
            return count;
        }
    }
}