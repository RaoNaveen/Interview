package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateInArray {
	public static void main(String[] args) {
		List<Integer> lit = new ArrayList<>(Arrays.asList(3, 2, 1, 4, 1));
		System.out.println(repeatedNumber(lit));
	}
	public static int repeatedNumber(final List<Integer> a) {
		for(int i=0;i<a.size();i++) {
			if(a.get(i)<0)
				return a.get(i);
			else {
				a.set(a.get(i), -a.get(a.get(i)));
			}
		}
		return 0;

	}
}
