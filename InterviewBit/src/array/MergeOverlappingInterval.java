package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeOverlappingInterval {

	public static void main(String[] args) {
		List<Interval> list = new ArrayList<>();
		list.add(new Interval(1, 3));
		list.add(new Interval(2, 6));
		list.add(new Interval(8, 10));
		list.add(new Interval(15, 18));
		for(Interval in:Merge(list))
			System.out.println(in);
	}

	private static List<Interval> Merge(List<Interval> list) {
		List<Interval> result = new ArrayList<>();
		List<Integer> start = new ArrayList<>();
		List<Integer> end = new ArrayList<>();
		for (Interval i : list) {
			start.add(i.getStart());
			end.add(i.getEnd());
		}
		Collections.sort(start);
		Collections.sort(end);
		for (int i = 0; i < start.size(); i++) {
			Interval interval = new Interval();
			interval.setStart(start.get(i-1));
			while (i<start.size() && start.get(i) < end.get(i - 1)) {
				i++;
			}
			interval.setEnd(end.get(i-1));
			result.add(interval);
		}
		return result;
	}
}

class Interval {
	private int start;
	private int end;
	public Interval() {
		// TODO Auto-generated constructor stub
	}
	public Interval(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
}
