package backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubSetOfArray {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		List<List<Integer>> res=new ArrayList<>();
		List<Integer> midList=new ArrayList<>();
		
		getAllSubset(res,midList,list,0,list.size());
	}

	private static void getAllSubset(List<List<Integer>> res, List<Integer> midList, List<Integer> list,int index,int size) {
		if(size==0)
			return;
		System.out.println(midList);
		while(index<size) {
			midList.add(list.get(index));
			getAllSubset(res, midList, list, index+1, size);
			midList.remove(list.get(index));
			index++;
		}
	}
}
