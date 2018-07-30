package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrangingLargestNumber {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>(Arrays.asList("1","7","5","3"));
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				String ab=a+b;
				String ba=b+a;
				return ab.compareTo(ba)>0?-1:1;
			}
		});
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
