package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

final class Im{
	private final int id;
	private final List<Date> dateList;
	
	public Im(int id,List<Date> dateList) {
		this.id=id;
		List<Date> list=new ArrayList<>(dateList);
		this.dateList=list;
	}

	public int getId() {
		return id;
	}

	public List<Date> getDateList() {
		List<Date> list=new ArrayList<>();
		for (Iterator<Date> iterator = dateList.iterator(); iterator.hasNext();) {
			Date date=(Date) iterator.next().clone();
			list.add(date);
		}
		return list;
	}
}

public class DateTest {

	public static void main(String[] args) {
		Date date=new Date();
		Date date2=new Date();
		date2.setDate(21);
		List dateList=new ArrayList<>();
		dateList.add(date);
		dateList.add(date2);
		Im im=new Im(1, dateList);
		dateList.add(new Date());
		System.out.println(im.getDateList());
		im.getDateList().get(0).setDate(30);
		System.out.println(im.getDateList());
		
		
	}
}
